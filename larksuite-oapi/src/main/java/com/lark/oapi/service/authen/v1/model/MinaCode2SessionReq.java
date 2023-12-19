package com.lark.oapi.service.authen.v1.model;

import com.lark.oapi.core.annotation.Body;

public class MinaCode2SessionReq {
  @Body
  private MinaCode2SessionReqBody body;

  public MinaCode2SessionReq() {
  }

  public MinaCode2SessionReq(MinaCode2SessionReq.Builder builder) {
    this.body = builder.body;
  }

  public static MinaCode2SessionReq.Builder newBuilder() {
    return new MinaCode2SessionReq.Builder();
  }

  public MinaCode2SessionReqBody getCreateAccessTokenReqBody() {
    return this.body;
  }

  public void setMinaCode2SessionReqBody(MinaCode2SessionReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private MinaCode2SessionReqBody body;

    public MinaCode2SessionReqBody getMinaCode2SessionReqBody() {
      return this.body;
    }

    public MinaCode2SessionReq.Builder minaCode2SessionReqBody(MinaCode2SessionReqBody body) {
      this.body = body;
      return this;
    }

    public MinaCode2SessionReq build() {
      return new MinaCode2SessionReq(this);
    }
  }
}
