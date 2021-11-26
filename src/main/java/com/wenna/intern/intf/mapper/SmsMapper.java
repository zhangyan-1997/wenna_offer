package com.wenna.intern.intf.mapper;

import com.wenna.intern.Entity.Sms;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface SmsMapper {

    @Select("select * from yike_sms")
    List<Sms> loadList();
}
