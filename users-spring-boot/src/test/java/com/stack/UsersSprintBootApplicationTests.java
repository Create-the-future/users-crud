package com.stack;

import com.stack.api.entity.UserInfo;
import com.stack.api.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

@SpringBootTest
class UsersSprintBootApplicationTests {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    void contextLoads() {
        for (int i = 0; i < 235; i++) {
            LocalDateTime now = LocalDateTime.now();
            UserInfo userInfo = new UserInfo();
            userInfo.setName("test" + i);
            userInfo.setEmail("test" + i + "@test@test.com");
            userInfo.setCreateTime(now);
            userInfo.setUpdateTime(now);
            userInfo.setStatus(1);
            userInfoMapper.insert(userInfo);
        }
    }

    @Test
    void test(){
        Date date = new Date();
        System.out.println(date);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

}
