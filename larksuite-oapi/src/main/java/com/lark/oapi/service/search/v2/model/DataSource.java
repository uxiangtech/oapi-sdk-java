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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class DataSource {
    /**
     * 数据源的唯一标识
     * <p> 示例值：5577006791947779410
     */
    @SerializedName("id")
    private String id;
    /**
     * data_source的展示名称
     * <p> 示例值：客服工单
     */
    @SerializedName("name")
    private String name;
    /**
     * 数据源状态，0-已上线，1-未上线。如果未填，默认是未上线状态。
     * <p> 示例值：0
     */
    @SerializedName("state")
    private Integer state;
    /**
     * 对于数据源的描述
     * <p> 示例值：搜索客服工单数据
     */
    @SerializedName("description")
    private String description;
    /**
     * 创建时间，使用Unix时间戳，单位为“秒”
     * <p> 示例值：1674309260
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间，使用Unix时间戳，单位为“秒”
     * <p> 示例值：1674309260
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 是否超限
     * <p> 示例值：false
     */
    @SerializedName("is_exceed_quota")
    private Boolean isExceedQuota;
    /**
     * 数据源在 search tab 上的展示图标路径
     * <p> 示例值：https://www.xxx.com/open.jpg
     */
    @SerializedName("icon_url")
    private String iconUrl;
    /**
     * 数据源采用的展示模版名称
     * <p> 示例值：search_common_card
     */
    @SerializedName("template")
    private String template;
    /**
     * 【已废弃，如有定制需要请使用“数据范式”接口】描述哪些字段可以被搜索
     * <p> 示例值：【已废弃，如有定制需要请使用“数据范式”接口】["field1", "field2"]
     */
    @SerializedName("searchable_fields")
    private String[] searchableFields;
    /**
     * 数据源的国际化展示名称
     * <p> 示例值：
     */
    @SerializedName("i18n_name")
    private I18nMeta i18nName;
    /**
     * 数据源的国际化描述
     * <p> 示例值：
     */
    @SerializedName("i18n_description")
    private I18nMeta i18nDescription;
    /**
     * 数据源关联的 schema 标识
     * <p> 示例值：custom_schema
     */
    @SerializedName("schema_id")
    private String schemaId;
    /**
     * datasource对应的开放平台应用id
     * <p> 示例值：cli_a1306bed4738d01b
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 搜索请求的接入方式
     * <p> 示例值：1
     */
    @SerializedName("connect_type")
    private Integer connectType;
    /**
     * 根据连接器类型不同所需要提供的相关参数
     * <p> 示例值：
     */
    @SerializedName("connector_param")
    private ConnectorParam connectorParam;

    // builder 开始
    public DataSource() {
    }

    public DataSource(Builder builder) {
        /**
         * 数据源的唯一标识
         * <p> 示例值：5577006791947779410
         */
        this.id = builder.id;
        /**
         * data_source的展示名称
         * <p> 示例值：客服工单
         */
        this.name = builder.name;
        /**
         * 数据源状态，0-已上线，1-未上线。如果未填，默认是未上线状态。
         * <p> 示例值：0
         */
        this.state = builder.state;
        /**
         * 对于数据源的描述
         * <p> 示例值：搜索客服工单数据
         */
        this.description = builder.description;
        /**
         * 创建时间，使用Unix时间戳，单位为“秒”
         * <p> 示例值：1674309260
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间，使用Unix时间戳，单位为“秒”
         * <p> 示例值：1674309260
         */
        this.updateTime = builder.updateTime;
        /**
         * 是否超限
         * <p> 示例值：false
         */
        this.isExceedQuota = builder.isExceedQuota;
        /**
         * 数据源在 search tab 上的展示图标路径
         * <p> 示例值：https://www.xxx.com/open.jpg
         */
        this.iconUrl = builder.iconUrl;
        /**
         * 数据源采用的展示模版名称
         * <p> 示例值：search_common_card
         */
        this.template = builder.template;
        /**
         * 【已废弃，如有定制需要请使用“数据范式”接口】描述哪些字段可以被搜索
         * <p> 示例值：【已废弃，如有定制需要请使用“数据范式”接口】["field1", "field2"]
         */
        this.searchableFields = builder.searchableFields;
        /**
         * 数据源的国际化展示名称
         * <p> 示例值：
         */
        this.i18nName = builder.i18nName;
        /**
         * 数据源的国际化描述
         * <p> 示例值：
         */
        this.i18nDescription = builder.i18nDescription;
        /**
         * 数据源关联的 schema 标识
         * <p> 示例值：custom_schema
         */
        this.schemaId = builder.schemaId;
        /**
         * datasource对应的开放平台应用id
         * <p> 示例值：cli_a1306bed4738d01b
         */
        this.appId = builder.appId;
        /**
         * 搜索请求的接入方式
         * <p> 示例值：1
         */
        this.connectType = builder.connectType;
        /**
         * 根据连接器类型不同所需要提供的相关参数
         * <p> 示例值：
         */
        this.connectorParam = builder.connectorParam;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsExceedQuota() {
        return this.isExceedQuota;
    }

    public void setIsExceedQuota(Boolean isExceedQuota) {
        this.isExceedQuota = isExceedQuota;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String[] getSearchableFields() {
        return this.searchableFields;
    }

    public void setSearchableFields(String[] searchableFields) {
        this.searchableFields = searchableFields;
    }

    public I18nMeta getI18nName() {
        return this.i18nName;
    }

    public void setI18nName(I18nMeta i18nName) {
        this.i18nName = i18nName;
    }

    public I18nMeta getI18nDescription() {
        return this.i18nDescription;
    }

    public void setI18nDescription(I18nMeta i18nDescription) {
        this.i18nDescription = i18nDescription;
    }

    public String getSchemaId() {
        return this.schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getConnectType() {
        return this.connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public ConnectorParam getConnectorParam() {
        return this.connectorParam;
    }

    public void setConnectorParam(ConnectorParam connectorParam) {
        this.connectorParam = connectorParam;
    }

    public static class Builder {
        /**
         * 数据源的唯一标识
         * <p> 示例值：5577006791947779410
         */
        private String id;
        /**
         * data_source的展示名称
         * <p> 示例值：客服工单
         */
        private String name;
        /**
         * 数据源状态，0-已上线，1-未上线。如果未填，默认是未上线状态。
         * <p> 示例值：0
         */
        private Integer state;
        /**
         * 对于数据源的描述
         * <p> 示例值：搜索客服工单数据
         */
        private String description;
        /**
         * 创建时间，使用Unix时间戳，单位为“秒”
         * <p> 示例值：1674309260
         */
        private String createTime;
        /**
         * 更新时间，使用Unix时间戳，单位为“秒”
         * <p> 示例值：1674309260
         */
        private String updateTime;
        /**
         * 是否超限
         * <p> 示例值：false
         */
        private Boolean isExceedQuota;
        /**
         * 数据源在 search tab 上的展示图标路径
         * <p> 示例值：https://www.xxx.com/open.jpg
         */
        private String iconUrl;
        /**
         * 数据源采用的展示模版名称
         * <p> 示例值：search_common_card
         */
        private String template;
        /**
         * 【已废弃，如有定制需要请使用“数据范式”接口】描述哪些字段可以被搜索
         * <p> 示例值：【已废弃，如有定制需要请使用“数据范式”接口】["field1", "field2"]
         */
        private String[] searchableFields;
        /**
         * 数据源的国际化展示名称
         * <p> 示例值：
         */
        private I18nMeta i18nName;
        /**
         * 数据源的国际化描述
         * <p> 示例值：
         */
        private I18nMeta i18nDescription;
        /**
         * 数据源关联的 schema 标识
         * <p> 示例值：custom_schema
         */
        private String schemaId;
        /**
         * datasource对应的开放平台应用id
         * <p> 示例值：cli_a1306bed4738d01b
         */
        private String appId;
        /**
         * 搜索请求的接入方式
         * <p> 示例值：1
         */
        private Integer connectType;
        /**
         * 根据连接器类型不同所需要提供的相关参数
         * <p> 示例值：
         */
        private ConnectorParam connectorParam;

        /**
         * 数据源的唯一标识
         * <p> 示例值：5577006791947779410
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * data_source的展示名称
         * <p> 示例值：客服工单
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 数据源状态，0-已上线，1-未上线。如果未填，默认是未上线状态。
         * <p> 示例值：0
         *
         * @param state
         * @return
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * 数据源状态，0-已上线，1-未上线。如果未填，默认是未上线状态。
         * <p> 示例值：0
         *
         * @param state {@link com.lark.oapi.service.search.v2.enums.DataSourceStateEnum}
         * @return
         */
        public Builder state(com.lark.oapi.service.search.v2.enums.DataSourceStateEnum state) {
            this.state = state.getValue();
            return this;
        }


        /**
         * 对于数据源的描述
         * <p> 示例值：搜索客服工单数据
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 创建时间，使用Unix时间戳，单位为“秒”
         * <p> 示例值：1674309260
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间，使用Unix时间戳，单位为“秒”
         * <p> 示例值：1674309260
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 是否超限
         * <p> 示例值：false
         *
         * @param isExceedQuota
         * @return
         */
        public Builder isExceedQuota(Boolean isExceedQuota) {
            this.isExceedQuota = isExceedQuota;
            return this;
        }


        /**
         * 数据源在 search tab 上的展示图标路径
         * <p> 示例值：https://www.xxx.com/open.jpg
         *
         * @param iconUrl
         * @return
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }


        /**
         * 数据源采用的展示模版名称
         * <p> 示例值：search_common_card
         *
         * @param template
         * @return
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }


        /**
         * 【已废弃，如有定制需要请使用“数据范式”接口】描述哪些字段可以被搜索
         * <p> 示例值：【已废弃，如有定制需要请使用“数据范式”接口】["field1", "field2"]
         *
         * @param searchableFields
         * @return
         */
        public Builder searchableFields(String[] searchableFields) {
            this.searchableFields = searchableFields;
            return this;
        }


        /**
         * 数据源的国际化展示名称
         * <p> 示例值：
         *
         * @param i18nName
         * @return
         */
        public Builder i18nName(I18nMeta i18nName) {
            this.i18nName = i18nName;
            return this;
        }


        /**
         * 数据源的国际化描述
         * <p> 示例值：
         *
         * @param i18nDescription
         * @return
         */
        public Builder i18nDescription(I18nMeta i18nDescription) {
            this.i18nDescription = i18nDescription;
            return this;
        }


        /**
         * 数据源关联的 schema 标识
         * <p> 示例值：custom_schema
         *
         * @param schemaId
         * @return
         */
        public Builder schemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }


        /**
         * datasource对应的开放平台应用id
         * <p> 示例值：cli_a1306bed4738d01b
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 搜索请求的接入方式
         * <p> 示例值：1
         *
         * @param connectType
         * @return
         */
        public Builder connectType(Integer connectType) {
            this.connectType = connectType;
            return this;
        }

        /**
         * 搜索请求的接入方式
         * <p> 示例值：1
         *
         * @param connectType {@link com.lark.oapi.service.search.v2.enums.DataSourceConnectTypeEnum}
         * @return
         */
        public Builder connectType(com.lark.oapi.service.search.v2.enums.DataSourceConnectTypeEnum connectType) {
            this.connectType = connectType.getValue();
            return this;
        }


        /**
         * 根据连接器类型不同所需要提供的相关参数
         * <p> 示例值：
         *
         * @param connectorParam
         * @return
         */
        public Builder connectorParam(ConnectorParam connectorParam) {
            this.connectorParam = connectorParam;
            return this;
        }


        public DataSource build() {
            return new DataSource(this);
        }
    }
}
