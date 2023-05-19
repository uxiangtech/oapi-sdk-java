// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class InternOfferStatusOfferRespBody {
    /**
     * Offer ID
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("offer_id")
    private String offerId;
    /**
     * 更新入/离职状态的操作
     * <p> 示例值：confirm_onboarding
     */
    @SerializedName("operation")
    private String operation;
    /**
     * 入职表单信息（当 operation 为 confirm_onboarding 时，该字段必填）
     * <p> 示例值：
     */
    @SerializedName("onboarding_info")
    private InternOfferOnboardingInfo onboardingInfo;
    /**
     * 离职表单信息（当 operation 为 offboard 时，该字段必填）
     * <p> 示例值：
     */
    @SerializedName("offboarding_info")
    private InternOfferOffboardingInfo offboardingInfo;

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public InternOfferOnboardingInfo getOnboardingInfo() {
        return this.onboardingInfo;
    }

    public void setOnboardingInfo(InternOfferOnboardingInfo onboardingInfo) {
        this.onboardingInfo = onboardingInfo;
    }

    public InternOfferOffboardingInfo getOffboardingInfo() {
        return this.offboardingInfo;
    }

    public void setOffboardingInfo(InternOfferOffboardingInfo offboardingInfo) {
        this.offboardingInfo = offboardingInfo;
    }

}
