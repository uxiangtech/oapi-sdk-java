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

public class AppVisibleList {
    /**
     * 可见性成员 open_id 列表
     * <p> 示例值：
     */
    @SerializedName("open_ids")
    private String[] openIds;
    /**
     * 可见性部门的 id 列表
     * <p> 示例值：
     */
    @SerializedName("department_ids")
    private String[] departmentIds;
    /**
     * 可见性成员 group_id 列表
     * <p> 示例值：
     */
    @SerializedName("group_ids")
    private String[] groupIds;

    // builder 开始
    public AppVisibleList() {
    }

    public AppVisibleList(Builder builder) {
        /**
         * 可见性成员 open_id 列表
         * <p> 示例值：
         */
        this.openIds = builder.openIds;
        /**
         * 可见性部门的 id 列表
         * <p> 示例值：
         */
        this.departmentIds = builder.departmentIds;
        /**
         * 可见性成员 group_id 列表
         * <p> 示例值：
         */
        this.groupIds = builder.groupIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getOpenIds() {
        return this.openIds;
    }

    public void setOpenIds(String[] openIds) {
        this.openIds = openIds;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String[] getGroupIds() {
        return this.groupIds;
    }

    public void setGroupIds(String[] groupIds) {
        this.groupIds = groupIds;
    }

    public static class Builder {
        /**
         * 可见性成员 open_id 列表
         * <p> 示例值：
         */
        private String[] openIds;
        /**
         * 可见性部门的 id 列表
         * <p> 示例值：
         */
        private String[] departmentIds;
        /**
         * 可见性成员 group_id 列表
         * <p> 示例值：
         */
        private String[] groupIds;

        /**
         * 可见性成员 open_id 列表
         * <p> 示例值：
         *
         * @param openIds
         * @return
         */
        public Builder openIds(String[] openIds) {
            this.openIds = openIds;
            return this;
        }


        /**
         * 可见性部门的 id 列表
         * <p> 示例值：
         *
         * @param departmentIds
         * @return
         */
        public Builder departmentIds(String[] departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * 可见性成员 group_id 列表
         * <p> 示例值：
         *
         * @param groupIds
         * @return
         */
        public Builder groupIds(String[] groupIds) {
            this.groupIds = groupIds;
            return this;
        }


        public AppVisibleList build() {
            return new AppVisibleList(this);
        }
    }
}
