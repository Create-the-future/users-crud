package com.stack.api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // get set 方法
@AllArgsConstructor // 有参数构造
@NoArgsConstructor  // 无参数构造
public class ResponseBean {

    // http 状态码
    private int code;

    // 返回信息
    private String msg;

    // 返回的数据
    private Object data;


}
