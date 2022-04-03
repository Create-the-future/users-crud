package com.stack.api.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stack.api.bean.CreateUser;
import com.stack.api.entity.UserInfo;
import com.stack.api.mapper.UserInfoMapper;
import com.stack.api.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiaxing
 * @since 2022-04-03
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {


    @Autowired
    private UserInfoMapper userInfoMapper;




    public Page<UserInfo> selectUser(int webCurrent, int webSize){
        Page<UserInfo> page = new Page<>(webCurrent,webSize);
        Page<UserInfo> userPage = userInfoMapper.selectPage(page, null);
        System.out.println(userPage.getTotal());  // 总条数
        return userPage;
    }

    public Boolean insertUser(CreateUser createUser){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(createUser.getName());
        userInfo.setEmail(createUser.getEmail());
        userInfo.setCreateTime(createUser.getCreate_time());
        userInfo.setUpdateTime(createUser.getCreate_time());
        userInfo.setStatus(createUser.getStatus() ? 1 : 0);
        int insert = userInfoMapper.insert(userInfo);
        return true;
    }

    public Boolean updateUser(CreateUser createUser, int id){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName(createUser.getName());
        userInfo.setEmail(createUser.getEmail());
        userInfo.setCreateTime(createUser.getCreate_time());
        userInfo.setUpdateTime(createUser.getCreate_time());
        userInfo.setStatus(createUser.getStatus() ? 1 : 0);
        int i = userInfoMapper.updateById(userInfo);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }


    public Boolean deleteUser(int id){
        int i = userInfoMapper.deleteById(id);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }


}
