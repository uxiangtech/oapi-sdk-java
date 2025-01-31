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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.google.gson.annotations.SerializedName;

public class Email {
    /**
     * email ID
     * <p> 示例值：5e1d0913ea6770d309fd18778fb45a15a1e69857.8fb8a4da.a4fd.4d48.baa0.2396bf70c04d@staging.feishu.cn
     */
    @SerializedName("id")
    private String id;
    /**
     * email 标题
     * <p> 示例值：scs vault test email
     */
    @SerializedName("title")
    private String title;
    /**
     * email owner类型
     * <p> 示例值：1
     */
    @SerializedName("owner_type")
    private Integer ownerType;
    /**
     * email 创建时间, 单位秒
     * <p> 示例值：1645180346
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 企业用户ID
     * <p> 示例值：ou_7636758725e268a4c67dc7457d27719d
     */
    @SerializedName("owner_user_id")
    private String ownerUserId;
    /**
     * 公共邮箱地址
     * <p> 示例值：jiajinqud@zijietiaobudong.top
     */
    @SerializedName("owner_address")
    private String ownerAddress;

    // builder 开始
    public Email() {
    }

    public Email(Builder builder) {
        /**
         * email ID
         * <p> 示例值：5e1d0913ea6770d309fd18778fb45a15a1e69857.8fb8a4da.a4fd.4d48.baa0.2396bf70c04d@staging.feishu.cn
         */
        this.id = builder.id;
        /**
         * email 标题
         * <p> 示例值：scs vault test email
         */
        this.title = builder.title;
        /**
         * email owner类型
         * <p> 示例值：1
         */
        this.ownerType = builder.ownerType;
        /**
         * email 创建时间, 单位秒
         * <p> 示例值：1645180346
         */
        this.createTime = builder.createTime;
        /**
         * 企业用户ID
         * <p> 示例值：ou_7636758725e268a4c67dc7457d27719d
         */
        this.ownerUserId = builder.ownerUserId;
        /**
         * 公共邮箱地址
         * <p> 示例值：jiajinqud@zijietiaobudong.top
         */
        this.ownerAddress = builder.ownerAddress;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOwnerType() {
        return this.ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public static class Builder {
        /**
         * email ID
         * <p> 示例值：5e1d0913ea6770d309fd18778fb45a15a1e69857.8fb8a4da.a4fd.4d48.baa0.2396bf70c04d@staging.feishu.cn
         */
        private String id;
        /**
         * email 标题
         * <p> 示例值：scs vault test email
         */
        private String title;
        /**
         * email owner类型
         * <p> 示例值：1
         */
        private Integer ownerType;
        /**
         * email 创建时间, 单位秒
         * <p> 示例值：1645180346
         */
        private String createTime;
        /**
         * 企业用户ID
         * <p> 示例值：ou_7636758725e268a4c67dc7457d27719d
         */
        private String ownerUserId;
        /**
         * 公共邮箱地址
         * <p> 示例值：jiajinqud@zijietiaobudong.top
         */
        private String ownerAddress;

        /**
         * email ID
         * <p> 示例值：5e1d0913ea6770d309fd18778fb45a15a1e69857.8fb8a4da.a4fd.4d48.baa0.2396bf70c04d@staging.feishu.cn
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * email 标题
         * <p> 示例值：scs vault test email
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * email owner类型
         * <p> 示例值：1
         *
         * @param ownerType
         * @return
         */
        public Builder ownerType(Integer ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * email owner类型
         * <p> 示例值：1
         *
         * @param ownerType {@link com.lark.oapi.service.security_and_compliance.v1.enums.EmailEmailOwnerTypeEnum}
         * @return
         */
        public Builder ownerType(com.lark.oapi.service.security_and_compliance.v1.enums.EmailEmailOwnerTypeEnum ownerType) {
            this.ownerType = ownerType.getValue();
            return this;
        }


        /**
         * email 创建时间, 单位秒
         * <p> 示例值：1645180346
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 企业用户ID
         * <p> 示例值：ou_7636758725e268a4c67dc7457d27719d
         *
         * @param ownerUserId
         * @return
         */
        public Builder ownerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }


        /**
         * 公共邮箱地址
         * <p> 示例值：jiajinqud@zijietiaobudong.top
         *
         * @param ownerAddress
         * @return
         */
        public Builder ownerAddress(String ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }


        public Email build() {
            return new Email(this);
        }
    }
}
