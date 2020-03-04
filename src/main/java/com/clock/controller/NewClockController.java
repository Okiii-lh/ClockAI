package com.clock.controller;

import com.clock.service.NewClockService;
import com.clock.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/newClock")
@ResponseBody
public class NewClockController {
    @Autowired
    private NewClockService newClockService;

    @RequestMapping("/new")
    public Map<String, Object> newClock(HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        String clockName = HttpServletRequestUtil.getString(request, "clockName");
        System.out.println(clockName);
        try {
            String path = newClockService.createNewClock(clockName);
            modelMap.put("path", path);
            modelMap.put("result", "success");
        }catch (Exception e){
            e.printStackTrace();
        }

        return modelMap;
    }
}
