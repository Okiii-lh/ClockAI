package com.clock.service;

import com.clock.entity.Corresponding;

import java.util.List;

/**
 * 获取所有的打卡列表服务层
 */
public interface ShowClockListService {
    /**
     * 获取所有的打卡列表
     * @return
     */
    public List<Corresponding> showClockList();
}
