package com.clock.controller;

import com.clock.service.StudentClockService;
import com.clock.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/studentClock")
public class StudentClockController {
    @Autowired
    private StudentClockService studentClockService;

    @RequestMapping(value = "/clock")
    @ResponseBody
    public Map<String, Object> clock(HttpServletRequest request){
        System.out.println("访问");
        Map<String,Object> modelMap = new HashMap<String, Object>();
        String studentName = HttpServletRequestUtil.getString(request,"studentName");
        String fileName = HttpServletRequestUtil.getString(request,"fileName");
        System.out.println(fileName);
        System.out.println("控制层学生姓名");
        System.out.println(studentName);
        studentClockService.clock(studentName, fileName);
        modelMap.put("result", "success");
        return modelMap;
    }
}
