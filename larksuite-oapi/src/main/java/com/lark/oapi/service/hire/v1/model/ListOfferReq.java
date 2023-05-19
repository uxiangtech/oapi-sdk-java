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
import com.lark.oapi.core.annotation.Query;

public class ListOfferReq {
    /**
     * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
     * <p> 示例值：1231231987
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 每页获取记录数量，最大100
     * <p> 示例值：100
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 人才 ID
     * <p> 示例值：7096320678581242123
     */
    @Query
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;

    // builder 开始
    public ListOfferReq() {
    }

    public ListOfferReq(Builder builder) {
        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：1231231987
         */
        this.pageToken = builder.pageToken;
        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 人才 ID
         * <p> 示例值：7096320678581242123
         */
        this.talentId = builder.talentId;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public static class Builder {
        private String pageToken; // 页码标识，获取第一页传空，每次查询会返回下一页的page_token
        private Integer pageSize; // 每页获取记录数量，最大100
        private String talentId; // 人才 ID
        private String userIdType; // 此次调用中使用的用户ID的类型


        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：1231231987
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 人才 ID
         * <p> 示例值：7096320678581242123
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public ListOfferReq build() {
            return new ListOfferReq(this);
        }
    }
}
