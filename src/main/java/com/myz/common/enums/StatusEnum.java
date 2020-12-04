package com.myz.common.enums;

/**
 * @author yzMa
 * @desc
 * @date 2020/12/4 12:28
 * @email 2641007740@qq.com
 */
public enum StatusEnum {
    DELETE((short)-1,"逻辑删除"),
    DEFAULT((short)0,"默认"),
    ;

    private Short status;
    private String desc;

    StatusEnum(Short status,String desc){
        this.status = status;
        this.desc = desc;
    }

    public Short getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
