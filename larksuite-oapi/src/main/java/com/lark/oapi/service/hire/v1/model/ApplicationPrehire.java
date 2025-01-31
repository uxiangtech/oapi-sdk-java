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

public class ApplicationPrehire {
    /**
     * 投递id
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("id")
    private String id;
    /**
     * 投递基础信息
     * <p> 示例值：
     */
    @SerializedName("basic_info")
    private ApplicationBasicInfo basicInfo;
    /**
     * 人才数据
     * <p> 示例值：
     */
    @SerializedName("talent")
    private ApplicationTalent talent;
    /**
     * 职位数据
     * <p> 示例值：
     */
    @SerializedName("job")
    private ApplicationJob job;
    /**
     * Offer数据
     * <p> 示例值：
     */
    @SerializedName("offer")
    private ApplicationPrehireOffer offer;

    // builder 开始
    public ApplicationPrehire() {
    }

    public ApplicationPrehire(Builder builder) {
        /**
         * 投递id
         * <p> 示例值：6949805467799537964
         */
        this.id = builder.id;
        /**
         * 投递基础信息
         * <p> 示例值：
         */
        this.basicInfo = builder.basicInfo;
        /**
         * 人才数据
         * <p> 示例值：
         */
        this.talent = builder.talent;
        /**
         * 职位数据
         * <p> 示例值：
         */
        this.job = builder.job;
        /**
         * Offer数据
         * <p> 示例值：
         */
        this.offer = builder.offer;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public void setBasicInfo(ApplicationBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ApplicationTalent getTalent() {
        return this.talent;
    }

    public void setTalent(ApplicationTalent talent) {
        this.talent = talent;
    }

    public ApplicationJob getJob() {
        return this.job;
    }

    public void setJob(ApplicationJob job) {
        this.job = job;
    }

    public ApplicationPrehireOffer getOffer() {
        return this.offer;
    }

    public void setOffer(ApplicationPrehireOffer offer) {
        this.offer = offer;
    }

    public static class Builder {
        /**
         * 投递id
         * <p> 示例值：6949805467799537964
         */
        private String id;
        /**
         * 投递基础信息
         * <p> 示例值：
         */
        private ApplicationBasicInfo basicInfo;
        /**
         * 人才数据
         * <p> 示例值：
         */
        private ApplicationTalent talent;
        /**
         * 职位数据
         * <p> 示例值：
         */
        private ApplicationJob job;
        /**
         * Offer数据
         * <p> 示例值：
         */
        private ApplicationPrehireOffer offer;

        /**
         * 投递id
         * <p> 示例值：6949805467799537964
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 投递基础信息
         * <p> 示例值：
         *
         * @param basicInfo
         * @return
         */
        public Builder basicInfo(ApplicationBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }


        /**
         * 人才数据
         * <p> 示例值：
         *
         * @param talent
         * @return
         */
        public Builder talent(ApplicationTalent talent) {
            this.talent = talent;
            return this;
        }


        /**
         * 职位数据
         * <p> 示例值：
         *
         * @param job
         * @return
         */
        public Builder job(ApplicationJob job) {
            this.job = job;
            return this;
        }


        /**
         * Offer数据
         * <p> 示例值：
         *
         * @param offer
         * @return
         */
        public Builder offer(ApplicationPrehireOffer offer) {
            this.offer = offer;
            return this;
        }


        public ApplicationPrehire build() {
            return new ApplicationPrehire(this);
        }
    }
}
