package com.clock.service.impl;

import com.clock.dao.CorrespondingMapper;
import com.clock.entity.Corresponding;
import com.clock.service.NewClockService;
import com.clock.util.NoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NewClockServiceImpl implements NewClockService {
    @Autowired
    private CorrespondingMapper correspondingMapper;

    @Override
    public String createNewClock(String clockName) {
        Corresponding corresponding = new Corresponding();
        corresponding.setClockname(clockName);
        corresponding.setTablename(clockName);
        correspondingMapper.insert(corresponding);

        NoteUtil noteUtil = new NoteUtil();
        noteUtil.createNote(clockName+".txt");

        String  path = "http://hwtang.ticp.net/ClockAI_war_exploded/clock_in.html?clockName="+clockName;

        return path;
    }


}
