package com.clock.controller;

import com.clock.service.ClockInfoService;
import com.clock.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/getClockInfo")
public class ClockInfoController {

    @Autowired
    private ClockInfoService clockInfoService;

    @RequestMapping("/info")
    @ResponseBody
    public Map<String, Object> getClockInfo(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        String fileName = HttpServletRequestUtil.getString(request, "fileName");
        List<String> studentNames = clockInfoService.getClockInfo(fileName);
        modelMap.put("studenNames", studentNames);

        return modelMap;
    }

}
