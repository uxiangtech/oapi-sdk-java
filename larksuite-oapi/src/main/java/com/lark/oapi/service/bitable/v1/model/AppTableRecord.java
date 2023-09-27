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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class AppTableRecord {
    /**
     * 数据表的字段，即数据表的列;;当前接口支持的字段类型请参考[接入指南](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#31f78a3c);;不同类型字段的数据结构请参考[数据结构概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/development-guide/bitable-structure)
     * <p> 示例值：
     */
    @SerializedName("fields")
    private Map<String, Object> fields;
    /**
     * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
     * <p> 示例值：recqwIwhc6
     */
    @SerializedName("record_id")
    private String recordId;
    /**
     * 该记录的创建人
     * <p> 示例值：
     */
    @SerializedName("created_by")
    private Person createdBy;
    /**
     * 该记录的创建时间
     * <p> 示例值：1675244156000
     */
    @SerializedName("created_time")
    private Long createdTime;
    /**
     * 该记录最新一次更新的修改人
     * <p> 示例值：
     */
    @SerializedName("last_modified_by")
    private Person lastModifiedBy;
    /**
     * 该记录最近一次的更新时间
     * <p> 示例值：1677556020000
     */
    @SerializedName("last_modified_time")
    private Long lastModifiedTime;

    // builder 开始
    public AppTableRecord() {
    }

    public AppTableRecord(Builder builder) {
        /**
         * 数据表的字段，即数据表的列;;当前接口支持的字段类型请参考[接入指南](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#31f78a3c);;不同类型字段的数据结构请参考[数据结构概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/development-guide/bitable-structure)
         * <p> 示例值：
         */
        this.fields = builder.fields;
        /**
         * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
         * <p> 示例值：recqwIwhc6
         */
        this.recordId = builder.recordId;
        /**
         * 该记录的创建人
         * <p> 示例值：
         */
        this.createdBy = builder.createdBy;
        /**
         * 该记录的创建时间
         * <p> 示例值：1675244156000
         */
        this.createdTime = builder.createdTime;
        /**
         * 该记录最新一次更新的修改人
         * <p> 示例值：
         */
        this.lastModifiedBy = builder.lastModifiedBy;
        /**
         * 该记录最近一次的更新时间
         * <p> 示例值：1677556020000
         */
        this.lastModifiedTime = builder.lastModifiedTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<String, Object> getFields() {
        return this.fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Person getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Person createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Person getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(Person lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public static class Builder {
        /**
         * 数据表的字段，即数据表的列;;当前接口支持的字段类型请参考[接入指南](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#31f78a3c);;不同类型字段的数据结构请参考[数据结构概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/development-guide/bitable-structure)
         * <p> 示例值：
         */
        private Map<String, Object> fields;
        /**
         * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
         * <p> 示例值：recqwIwhc6
         */
        private String recordId;
        /**
         * 该记录的创建人
         * <p> 示例值：
         */
        private Person createdBy;
        /**
         * 该记录的创建时间
         * <p> 示例值：1675244156000
         */
        private Long createdTime;
        /**
         * 该记录最新一次更新的修改人
         * <p> 示例值：
         */
        private Person lastModifiedBy;
        /**
         * 该记录最近一次的更新时间
         * <p> 示例值：1677556020000
         */
        private Long lastModifiedTime;

        /**
         * 数据表的字段，即数据表的列;;当前接口支持的字段类型请参考[接入指南](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#31f78a3c);;不同类型字段的数据结构请参考[数据结构概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/development-guide/bitable-structure)
         * <p> 示例值：
         *
         * @param fields
         * @return
         */
        public Builder fields(Map<String, Object> fields) {
            this.fields = fields;
            return this;
        }


        /**
         * 一条记录的唯一标识 id [record_id 参数说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/bitable/notification#15d8db94)
         * <p> 示例值：recqwIwhc6
         *
         * @param recordId
         * @return
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }


        /**
         * 该记录的创建人
         * <p> 示例值：
         *
         * @param createdBy
         * @return
         */
        public Builder createdBy(Person createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        /**
         * 该记录的创建时间
         * <p> 示例值：1675244156000
         *
         * @param createdTime
         * @return
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }


        /**
         * 该记录最新一次更新的修改人
         * <p> 示例值：
         *
         * @param lastModifiedBy
         * @return
         */
        public Builder lastModifiedBy(Person lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }


        /**
         * 该记录最近一次的更新时间
         * <p> 示例值：1677556020000
         *
         * @param lastModifiedTime
         * @return
         */
        public Builder lastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }


        public AppTableRecord build() {
            return new AppTableRecord(this);
        }
    }
}
