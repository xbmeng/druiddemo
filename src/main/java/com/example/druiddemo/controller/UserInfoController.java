package com.example.druiddemo.controller;

import com.example.druiddemo.entity.UserInfoEntity;
import com.example.druiddemo.mapper.source1.UserInfoOneMapper;
import com.example.druiddemo.mapper.source2.UserInfoTwoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoOneMapper userInfoOneMapper;

    @Autowired
    private UserInfoTwoMapper userInfoTwoMapper;

    @ApiOperation("按数据id查询数据")
    @RequestMapping(value = "/getfromone", method = RequestMethod.GET)
    public UserInfoEntity queryByDataIdOne(@RequestParam Integer id) {
        UserInfoEntity entity = new UserInfoEntity();
        entity.setId(id);
        return userInfoOneMapper.selectOne(entity);
    }

    @ApiOperation("按数据id查询数据")
    @RequestMapping(value = "/getfromtwo", method = RequestMethod.GET)
    public UserInfoEntity queryByDataIdTwo(@RequestParam Integer id) {
        UserInfoEntity entity = new UserInfoEntity();
        entity.setId(id);
        return userInfoTwoMapper.selectOne(entity);
    }
}
