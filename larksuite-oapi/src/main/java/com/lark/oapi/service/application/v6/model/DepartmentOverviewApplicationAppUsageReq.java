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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class DepartmentOverviewApplicationAppUsageReq {
    /**
     * 调用中使用的部门ID的类型
     * <p> 示例值：open_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * 目标应用 ID
     * <p> 示例值：cli_9f115af860f7901b
     */
    @Path
    @SerializedName("app_id")
    private String appId;
    @Body
    private DepartmentOverviewApplicationAppUsageReqBody body;

    // builder 开始
    public DepartmentOverviewApplicationAppUsageReq() {
    }

    public DepartmentOverviewApplicationAppUsageReq(Builder builder) {
        /**
         * 调用中使用的部门ID的类型
         * <p> 示例值：open_department_id
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * 目标应用 ID
         * <p> 示例值：cli_9f115af860f7901b
         */
        this.appId = builder.appId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DepartmentOverviewApplicationAppUsageReqBody getDepartmentOverviewApplicationAppUsageReqBody() {
        return this.body;
    }

    public void setDepartmentOverviewApplicationAppUsageReqBody(DepartmentOverviewApplicationAppUsageReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String departmentIdType; // 调用中使用的部门ID的类型
        private String appId; // 目标应用 ID
        private DepartmentOverviewApplicationAppUsageReqBody body;

        /**
         * 调用中使用的部门ID的类型
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
         * 调用中使用的部门ID的类型
         * <p> 示例值：open_department_id
         *
         * @param departmentIdType {@link com.lark.oapi.service.application.v6.enums.DepartmentOverviewApplicationAppUsageDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.application.v6.enums.DepartmentOverviewApplicationAppUsageDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }

        /**
         * 目标应用 ID
         * <p> 示例值：cli_9f115af860f7901b
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public DepartmentOverviewApplicationAppUsageReqBody getDepartmentOverviewApplicationAppUsageReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder departmentOverviewApplicationAppUsageReqBody(DepartmentOverviewApplicationAppUsageReqBody body) {
            this.body = body;
            return this;
        }

        public DepartmentOverviewApplicationAppUsageReq build() {
            return new DepartmentOverviewApplicationAppUsageReq(this);
        }
    }
}
