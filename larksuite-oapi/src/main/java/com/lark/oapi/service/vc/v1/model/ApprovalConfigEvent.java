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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class ApprovalConfigEvent {
    /**
     * 预定审批开关，0关闭，1打开
     * <p> 示例值：0
     */
    @SerializedName("approval_switch")
    private Integer approvalSwitch;
    /**
     * 预定审批条件，0所有预定需要审批，1满足条件需审批
     * <p> 示例值：0
     */
    @SerializedName("approval_condition")
    private Integer approvalCondition;
    /**
     * 超过 meeting_duration小时需要审批
     * <p> 示例值：1
     */
    @SerializedName("meeting_duration")
    private Double meetingDuration;
    /**
     * 审批人列表
     * <p> 示例值：[{user_id:"ou_e8bce6c3935ef1fc1b432992fd9d3db8"}]
     */
    @SerializedName("approvers")
    private SubscribeUserEvent[] approvers;

    // builder 开始
    public ApprovalConfigEvent() {
    }

    public ApprovalConfigEvent(Builder builder) {
        /**
         * 预定审批开关，0关闭，1打开
         * <p> 示例值：0
         */
        this.approvalSwitch = builder.approvalSwitch;
        /**
         * 预定审批条件，0所有预定需要审批，1满足条件需审批
         * <p> 示例值：0
         */
        this.approvalCondition = builder.approvalCondition;
        /**
         * 超过 meeting_duration小时需要审批
         * <p> 示例值：1
         */
        this.meetingDuration = builder.meetingDuration;
        /**
         * 审批人列表
         * <p> 示例值：[{user_id:"ou_e8bce6c3935ef1fc1b432992fd9d3db8"}]
         */
        this.approvers = builder.approvers;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getApprovalSwitch() {
        return this.approvalSwitch;
    }

    public void setApprovalSwitch(Integer approvalSwitch) {
        this.approvalSwitch = approvalSwitch;
    }

    public Integer getApprovalCondition() {
        return this.approvalCondition;
    }

    public void setApprovalCondition(Integer approvalCondition) {
        this.approvalCondition = approvalCondition;
    }

    public Double getMeetingDuration() {
        return this.meetingDuration;
    }

    public void setMeetingDuration(Double meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public SubscribeUserEvent[] getApprovers() {
        return this.approvers;
    }

    public void setApprovers(SubscribeUserEvent[] approvers) {
        this.approvers = approvers;
    }

    public static class Builder {
        /**
         * 预定审批开关，0关闭，1打开
         * <p> 示例值：0
         */
        private Integer approvalSwitch;
        /**
         * 预定审批条件，0所有预定需要审批，1满足条件需审批
         * <p> 示例值：0
         */
        private Integer approvalCondition;
        /**
         * 超过 meeting_duration小时需要审批
         * <p> 示例值：1
         */
        private Double meetingDuration;
        /**
         * 审批人列表
         * <p> 示例值：[{user_id:"ou_e8bce6c3935ef1fc1b432992fd9d3db8"}]
         */
        private SubscribeUserEvent[] approvers;

        /**
         * 预定审批开关，0关闭，1打开
         * <p> 示例值：0
         *
         * @param approvalSwitch
         * @return
         */
        public Builder approvalSwitch(Integer approvalSwitch) {
            this.approvalSwitch = approvalSwitch;
            return this;
        }


        /**
         * 预定审批条件，0所有预定需要审批，1满足条件需审批
         * <p> 示例值：0
         *
         * @param approvalCondition
         * @return
         */
        public Builder approvalCondition(Integer approvalCondition) {
            this.approvalCondition = approvalCondition;
            return this;
        }


        /**
         * 超过 meeting_duration小时需要审批
         * <p> 示例值：1
         *
         * @param meetingDuration
         * @return
         */
        public Builder meetingDuration(Double meetingDuration) {
            this.meetingDuration = meetingDuration;
            return this;
        }


        /**
         * 审批人列表
         * <p> 示例值：[{user_id:"ou_e8bce6c3935ef1fc1b432992fd9d3db8"}]
         *
         * @param approvers
         * @return
         */
        public Builder approvers(SubscribeUserEvent[] approvers) {
            this.approvers = approvers;
            return this;
        }


        public ApprovalConfigEvent build() {
            return new ApprovalConfigEvent(this);
        }
    }
}
