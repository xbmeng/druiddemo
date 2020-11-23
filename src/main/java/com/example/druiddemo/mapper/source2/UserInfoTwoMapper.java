package com.example.druiddemo.mapper.source2;

import com.example.druiddemo.common.CommonMapper;
import com.example.druiddemo.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserInfoTwoMapper extends CommonMapper<UserInfoEntity> {
}
