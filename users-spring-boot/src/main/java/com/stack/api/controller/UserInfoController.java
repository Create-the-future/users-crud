package com.stack.api.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stack.api.bean.CreateUser;
import com.stack.api.bean.ResponseBean;
import com.stack.api.entity.UserInfo;
import com.stack.api.service.IUserInfoService;
import com.stack.api.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jiaxing
 * @since 2022-04-03
 */
@Controller
@RestController
@RequestMapping("/users")
public class UserInfoController {

    @Autowired
    private UserInfoServiceImpl userInfoService;



    @GetMapping("/article")
    public ResponseBean article() {
        return new ResponseBean(200, "You are guest", null);
    }



    @GetMapping("/r")
    public ResponseBean select(@RequestParam Integer page,  @RequestParam Integer per_page) {
        Page<UserInfo> page1 = userInfoService.selectUser(page,per_page);
        return new ResponseBean(200, "获取列表用户成功", page1);
    }

    @PostMapping("c")
    public ResponseBean create(@RequestBody CreateUser createUser){
        userInfoService.insertUser(createUser);
        return new ResponseBean(200, "添加用户成功", null);
    }

    @PutMapping("/u/{id}")
    public ResponseBean update(@RequestBody CreateUser createUser, @PathVariable("id") int id){
        Boolean aBoolean = userInfoService.updateUser(createUser, id);
        if(aBoolean){
            return new ResponseBean(200, "修改用户成功", null);
        }else {
            return new ResponseBean(503, "没有找到id", null);
        }
    }

    @DeleteMapping("/d/{id}")
    public ResponseBean delete(@PathVariable("id") int id){
        Boolean aBoolean = userInfoService.deleteUser(id);
        if(aBoolean){
            return new ResponseBean(200, "删除用户成功", null);
        }else {
            return new ResponseBean(503, "没有找到id", null);
        }
    }





}
