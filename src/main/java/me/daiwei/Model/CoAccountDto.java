package me.daiwei.Model;

import java.util.Date;

public class CoAccountDto {
    private Short coAccountId;

    private Short countryId;

    private Short currencyId;

    private Byte productId;

    private String softDeleteFlag;

    private Date updateTime;

    private Date createTime;

    private String coAccountName;

    public Short getCoAccountId() {
        return coAccountId;
    }

    public void setCoAccountId(Short coAccountId) {
        this.coAccountId = coAccountId;
    }

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public Short getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Short currencyId) {
        this.currencyId = currencyId;
    }

    public Byte getProductId() {
        return productId;
    }

    public void setProductId(Byte productId) {
        this.productId = productId;
    }

    public String getSoftDeleteFlag() {
        return softDeleteFlag;
    }

    public void setSoftDeleteFlag(String softDeleteFlag) {
        this.softDeleteFlag = softDeleteFlag == null ? null : softDeleteFlag.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCoAccountName() {
        return coAccountName;
    }

    public void setCoAccountName(String coAccountName) {
        this.coAccountName = coAccountName;
    }



}