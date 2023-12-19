package com.lark.oapi.service.authen.v1.model;

import com.google.gson.annotations.SerializedName;

public class MinaCode2SessionRespBody {
  @SerializedName("open_id")
  private String openId;
  @SerializedName("employee_id")
  private String employeeId;
  @SerializedName("session_key")
  private String sessionKey;
  @SerializedName("tenant_key")
  private String tenantKey;
  @SerializedName("access_token")
  private String accessToken;
  @SerializedName("expires_in")
  private Long expiresIn;
  @SerializedName("refresh_token")
  private String refreshToken;

  public MinaCode2SessionRespBody() {
  }

  public String getOpenId() {
    return this.openId;
  }

  public void setOpenId(final String openId) {
    this.openId = openId;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(final String employeeId) {
    this.employeeId = employeeId;
  }

  public String getSessionKey() {
    return this.sessionKey;
  }

  public void setSessionKey(final String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public String getTenantKey() {
    return this.tenantKey;
  }

  public void setTenantKey(final String tenantKey) {
    this.tenantKey = tenantKey;
  }

  public String getAccessToken() {
    return this.accessToken;
  }

  public void setAccessToken(final String accessToken) {
    this.accessToken = accessToken;
  }

  public Long getExpiresIn() {
    return this.expiresIn;
  }

  public void setExpiresIn(final Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public String getRefreshToken() {
    return this.refreshToken;
  }

  public void setRefreshToken(final String refreshToken) {
    this.refreshToken = refreshToken;
  }

}
