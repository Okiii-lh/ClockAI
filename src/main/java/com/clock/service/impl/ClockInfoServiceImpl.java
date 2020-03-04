package com.clock.service.impl;

import com.clock.dao.BasestudentsMapper;
import com.clock.service.ClockInfoService;
import com.clock.util.NoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClockInfoServiceImpl implements ClockInfoService {

    @Autowired
    private BasestudentsMapper basestudentsMapper;


    @Override
    public List<String> getClockInfo(String fileName) {
        NoteUtil noteUtil = new NoteUtil();
        List<String> studentNames = noteUtil.readNote(fileName);
//        List<String> names = basestudentsMapper.getAllStudentName();
        System.out.println("学生姓名");
        System.out.println(studentNames.get(1));
        return null;
    }
}
