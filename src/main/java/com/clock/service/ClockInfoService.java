package com.clock.service;

import java.util.List;

/**
 * 显示打卡详情信息 服务层
 */
public interface ClockInfoService {

    /**
     * 将所有未打卡人员名称返回
     * @return 未打卡人员姓名列表
     */
    public List<String> getClockInfo(String fileName);
}
