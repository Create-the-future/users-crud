package com.stack.api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data   // get set 方法
@AllArgsConstructor // 有参数构造
@NoArgsConstructor  // 无参数构造
public class CreateUser {

    private String name;
    private String email;
    private LocalDateTime create_time;
    private Boolean status;
}
