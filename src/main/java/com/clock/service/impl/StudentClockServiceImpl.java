package com.clock.service.impl;

import com.clock.service.StudentClockService;
import com.clock.util.NoteUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentClockServiceImpl implements StudentClockService {
    @Override
    public void clock(String studentName, String fileName) {
        NoteUtil noteUtil = new NoteUtil();
        noteUtil.inputNote(studentName, fileName);
    }
}
