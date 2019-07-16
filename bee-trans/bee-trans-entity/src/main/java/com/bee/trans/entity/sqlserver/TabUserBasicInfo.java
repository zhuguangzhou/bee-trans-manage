package com.bee.trans.entity.sqlserver;

import java.math.BigDecimal;
import java.util.Date;


public class TabUserBasicInfo {
    private Long userId;

    private String nickName;

    private String password;

    private String wxHeadPictureUrl;

    private String wxOpenId;

    private String wxSmallProgramOpenId;

    private String wxUnionId;

    private String wxCmOpenId;

    private String mobilePhone;

    private BigDecimal balance;

    private Byte sex;

    private Byte state;

    private Byte userType;

    private Boolean isPrestore;

    private String remark;

    private Long createUserId;

    private Date createTime;

    private Date lastTime;

    private String cellId;

    private String salt;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWxHeadPictureUrl() {
        return wxHeadPictureUrl;
    }

    public void setWxHeadPictureUrl(String wxHeadPictureUrl) {
        this.wxHeadPictureUrl = wxHeadPictureUrl;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getWxSmallProgramOpenId() {
        return wxSmallProgramOpenId;
    }

    public void setWxSmallProgramOpenId(String wxSmallProgramOpenId) {
        this.wxSmallProgramOpenId = wxSmallProgramOpenId;
    }

    public String getWxUnionId() {
        return wxUnionId;
    }

    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId;
    }

    public String getWxCmOpenId() {
        return wxCmOpenId;
    }

    public void setWxCmOpenId(String wxCmOpenId) {
        this.wxCmOpenId = wxCmOpenId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Boolean getPrestore() {
        return isPrestore;
    }

    public void setPrestore(Boolean prestore) {
        isPrestore = prestore;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}