package com.wenna.intern.service;

import com.wenna.intern.Entity.Sms;

public interface SmsService {

    public int insert(Sms sms);
    public int update(Sms sms);
    public Sms loadById(int id);

    /**
     * @param userId 当用户不存在时，userId为0
     * @param mobile
     * @return
     */
    public int getDaySendTimesByUserIdAndMobile(int userId, String mobile);

    /**
     * 取出当天最后一条验证码
     * @param userId
     * @return
     */
    public Sms getDayLastSmsByUserId(int userId);
}
