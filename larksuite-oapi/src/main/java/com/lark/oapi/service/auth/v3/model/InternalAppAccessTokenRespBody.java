package com.lark.oapi.service.auth.v3.model;

import com.google.gson.annotations.SerializedName;

public class InternalAppAccessTokenRespBody {

  @SerializedName("app_access_token")
  private String appAccessToken;

  @SerializedName("tenant_access_token")
  private String tenantAccessToken;

  @SerializedName("expire")
  private Long expire;

  @SerializedName("code")
  private Long code;

  @SerializedName("msg")
  private String msg;

  public String getAppAccessToken() {
    return appAccessToken;
  }

  public void setAppAccessToken(String appAccessToken) {
    this.appAccessToken = appAccessToken;
  }

  public String getTenantAccessToken() {
    return tenantAccessToken;
  }

  public void setTenantAccessToken(String tenantAccessToken) {
    this.tenantAccessToken = tenantAccessToken;
  }

  public Long getExpire() {
    return expire;
  }

  public void setExpire(Long expire) {
    this.expire = expire;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
