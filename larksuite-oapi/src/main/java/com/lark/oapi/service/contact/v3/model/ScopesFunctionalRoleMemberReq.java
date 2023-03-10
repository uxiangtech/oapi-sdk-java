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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ScopesFunctionalRoleMemberReq {
    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门ID的类型
     * <p> 示例值：open_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * 角色的唯一标识，单租户下唯一
     * <p> 示例值：7vrj3vk70xk7v5r
     */
    @Path
    @SerializedName("role_id")
    private String roleId;
    @Body
    private ScopesFunctionalRoleMemberReqBody body;

    // builder 开始
    public ScopesFunctionalRoleMemberReq() {
    }

    public ScopesFunctionalRoleMemberReq(Builder builder) {
        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门ID的类型
         * <p> 示例值：open_department_id
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * 角色的唯一标识，单租户下唯一
         * <p> 示例值：7vrj3vk70xk7v5r
         */
        this.roleId = builder.roleId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ScopesFunctionalRoleMemberReqBody getScopesFunctionalRoleMemberReqBody() {
        return this.body;
    }

    public void setScopesFunctionalRoleMemberReqBody(ScopesFunctionalRoleMemberReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 用户 ID 类型
        private String departmentIdType; // 此次调用中使用的部门ID的类型
        private String roleId; // 角色的唯一标识，单租户下唯一
        private ScopesFunctionalRoleMemberReqBody body;

        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.contact.v3.enums.ScopesFunctionalRoleMemberRoleMemberIDTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.contact.v3.enums.ScopesFunctionalRoleMemberRoleMemberIDTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 此次调用中使用的部门ID的类型
         * <p> 示例值：open_department_id
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        /**
         * 此次调用中使用的部门ID的类型
         * <p> 示例值：open_department_id
         *
         * @param departmentIdType {@link com.lark.oapi.service.contact.v3.enums.ScopesFunctionalRoleMemberRoleMemberScopeIDTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.contact.v3.enums.ScopesFunctionalRoleMemberRoleMemberScopeIDTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }

        /**
         * 角色的唯一标识，单租户下唯一
         * <p> 示例值：7vrj3vk70xk7v5r
         *
         * @param roleId
         * @return
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public ScopesFunctionalRoleMemberReqBody getScopesFunctionalRoleMemberReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder scopesFunctionalRoleMemberReqBody(ScopesFunctionalRoleMemberReqBody body) {
            this.body = body;
            return this;
        }

        public ScopesFunctionalRoleMemberReq build() {
            return new ScopesFunctionalRoleMemberReq(this);
        }
    }
}
