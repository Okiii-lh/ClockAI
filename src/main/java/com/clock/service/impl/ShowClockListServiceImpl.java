package com.clock.service.impl;

import com.clock.dao.BasestudentsMapper;
import com.clock.dao.CorrespondingMapper;
import com.clock.entity.Corresponding;
import com.clock.service.ShowClockListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShowClockListServiceImpl implements ShowClockListService {

    @Autowired
    private CorrespondingMapper correspondingMapper;

    @Override
    public List<Corresponding> showClockList() {
        List<Corresponding> correspondings = correspondingMapper.getAllCorresponding();
        return correspondings;
    }
}
