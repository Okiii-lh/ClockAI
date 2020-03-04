package com.clock.service;

/**
 * 创建新打卡
 */
public interface NewClockService {

    /**
     * 创建新打卡
     * @param clockName 打卡名称
     * @return 返回生成的链接
     */
    public String createNewClock(String clockName);
}
