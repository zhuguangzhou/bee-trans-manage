package com.bee.trans.common.consts;

import java.util.HashMap;
import java.util.Map;

public enum SysErrResponseCode {
    DATA_OPERATION_FILE(10014,"数据操作失败"),
    DATA_ERROR_FILE(400,"参数异常"),
    DATE_ERROR_FILE(4408,"日期参数异常"),
    DATE_NOTNULL_FILE(4408,"日期参数不能为空"),
    UPLOAD_ERROR_FILE(4409,"文件上传异常");

    // 成员变量
    private int code; //状态码
    private String msg; //返回消息

    // 构造方法
    private SysErrResponseCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return msg;
    }
    public void setMessage(String message) {
        this.msg = message;
    }


    public static Map<String, Object> buildReturnMap(SysErrResponseCode responseCode, Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mapper/code", responseCode.getCode());
        map.put("message", responseCode.getMessage());
        map.put("data", data);
        return map;
    }
}