package com.lark.oapi.service.authen.v1.model;

import com.google.gson.annotations.SerializedName;

public class MinaCode2SessionReqBody {
  @SerializedName("code")
  private String code;

  public MinaCode2SessionReqBody() {
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public MinaCode2SessionReqBody(Builder builder) {
    this.code = builder.code;
  }

  public static MinaCode2SessionReqBody.Builder newBuilder() {
    return new MinaCode2SessionReqBody.Builder();
  }

  public static class Builder {

    private String code;

    public Builder code(String code) {
      this.code = code;
      return this;
    }

    public MinaCode2SessionReqBody build() {
      return new MinaCode2SessionReqBody(this);
    }
  }
}
