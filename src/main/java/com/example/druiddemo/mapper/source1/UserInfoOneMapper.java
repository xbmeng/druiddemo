package com.example.druiddemo.mapper.source1;

import com.example.druiddemo.common.CommonMapper;
import com.example.druiddemo.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserInfoOneMapper extends CommonMapper<UserInfoEntity> {
}
