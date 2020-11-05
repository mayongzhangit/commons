package com.myz.common.util;

import java.io.Serializable;

/**
 * @author yzMa
 * @desc
 * @date 2020/8/14 18:04
 * @email 2641007740@qq.com
 */
public class ApiResult<T> implements Serializable {

    private String code;
    private String msg;
    private T data;
    private String userJson;

    public static String SUCCESS_CODE = "000000";
    public static String SUCCESS_MSG = "成功";
    public static String ERROR_CODE = "111111";
    public static String ERROR_MSG = "失败";

    public ApiResult(String code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResult(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess(){
        return SUCCESS_CODE.equals(this.getCode());
    }

    public boolean isSuccessButNull(){
        return SUCCESS_CODE.equals(this.getCode()) && this.getData() == null;
    }

    public boolean isSuccessAndNotNull(){
        return SUCCESS_CODE.equals(this.getCode()) && this.getData() != null;
    }

    public static ApiResult OK(Object object){
        return build(SUCCESS_CODE,SUCCESS_MSG,object);
    }

    public static ApiResult OK(){
        return build(SUCCESS_CODE,SUCCESS_MSG);
    }

    public static ApiResult error(Object object){
        return build(ERROR_CODE,ERROR_MSG,object);
    }

    public static ApiResult error(){
        return build(ERROR_CODE,ERROR_MSG);
    }

    public static ApiResult build(String code,String msg,Object object){
        return new ApiResult(code,msg,object);
    }

    public static ApiResult build(String code,String msg){
        return build(code,msg,null);
    }

    public String getUserJson() {
        return userJson;
    }

    public void setUserJson(String userJson) {
        this.userJson = userJson;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", userJson='" + userJson + '\'' +
                '}';
    }
}
