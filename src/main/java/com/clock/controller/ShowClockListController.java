package com.clock.controller;

import com.clock.entity.Corresponding;
import com.clock.service.ShowClockListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 刘贺
 * @Date: 2020/3/3 14:36
 * @Description: 显示所有的打卡选项
 */
@Controller
@RequestMapping("/showClockList")
@ResponseBody
public class ShowClockListController {

    @Autowired
    private ShowClockListService showClockListService;

    @RequestMapping("/getAll")
    public Map<String, Object> showClockList(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Corresponding> correspondings = showClockListService.showClockList();
        modelMap.put("corresponding", correspondings);
        return modelMap;
    }


}
