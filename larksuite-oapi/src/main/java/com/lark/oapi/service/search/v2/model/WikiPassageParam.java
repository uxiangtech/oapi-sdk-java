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

public class WikiPassageParam {
    /**
     * 是否要搜索wiki
     * <p> 示例值：false
     */
    @SerializedName("searchable")
    private Boolean searchable;
    /**
     * 搜索特定空间的wiki
     * <p> 示例值：
     */
    @SerializedName("space_ids")
    private String[] spaceIds;
    /**
     * 在特定的wiki内搜索（仅限内部使用，有需求请用wiki_tokens）
     * <p> 示例值：
     */
    @SerializedName("obj_ids")
    private String[] objIds;
    /**
     * 在特定的wiki内搜索
     * <p> 示例值：
     */
    @SerializedName("wiki_tokens")
    private String[] wikiTokens;
    /**
     * 在特定的wiki节点范围内搜索
     * <p> 示例值：
     */
    @SerializedName("node_tokens")
    private String[] nodeTokens;

    // builder 开始
    public WikiPassageParam() {
    }

    public WikiPassageParam(Builder builder) {
        /**
         * 是否要搜索wiki
         * <p> 示例值：false
         */
        this.searchable = builder.searchable;
        /**
         * 搜索特定空间的wiki
         * <p> 示例值：
         */
        this.spaceIds = builder.spaceIds;
        /**
         * 在特定的wiki内搜索（仅限内部使用，有需求请用wiki_tokens）
         * <p> 示例值：
         */
        this.objIds = builder.objIds;
        /**
         * 在特定的wiki内搜索
         * <p> 示例值：
         */
        this.wikiTokens = builder.wikiTokens;
        /**
         * 在特定的wiki节点范围内搜索
         * <p> 示例值：
         */
        this.nodeTokens = builder.nodeTokens;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getSearchable() {
        return this.searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public String[] getSpaceIds() {
        return this.spaceIds;
    }

    public void setSpaceIds(String[] spaceIds) {
        this.spaceIds = spaceIds;
    }

    public String[] getObjIds() {
        return this.objIds;
    }

    public void setObjIds(String[] objIds) {
        this.objIds = objIds;
    }

    public String[] getWikiTokens() {
        return this.wikiTokens;
    }

    public void setWikiTokens(String[] wikiTokens) {
        this.wikiTokens = wikiTokens;
    }

    public String[] getNodeTokens() {
        return this.nodeTokens;
    }

    public void setNodeTokens(String[] nodeTokens) {
        this.nodeTokens = nodeTokens;
    }

    public static class Builder {
        /**
         * 是否要搜索wiki
         * <p> 示例值：false
         */
        private Boolean searchable;
        /**
         * 搜索特定空间的wiki
         * <p> 示例值：
         */
        private String[] spaceIds;
        /**
         * 在特定的wiki内搜索（仅限内部使用，有需求请用wiki_tokens）
         * <p> 示例值：
         */
        private String[] objIds;
        /**
         * 在特定的wiki内搜索
         * <p> 示例值：
         */
        private String[] wikiTokens;
        /**
         * 在特定的wiki节点范围内搜索
         * <p> 示例值：
         */
        private String[] nodeTokens;

        /**
         * 是否要搜索wiki
         * <p> 示例值：false
         *
         * @param searchable
         * @return
         */
        public Builder searchable(Boolean searchable) {
            this.searchable = searchable;
            return this;
        }


        /**
         * 搜索特定空间的wiki
         * <p> 示例值：
         *
         * @param spaceIds
         * @return
         */
        public Builder spaceIds(String[] spaceIds) {
            this.spaceIds = spaceIds;
            return this;
        }


        /**
         * 在特定的wiki内搜索（仅限内部使用，有需求请用wiki_tokens）
         * <p> 示例值：
         *
         * @param objIds
         * @return
         */
        public Builder objIds(String[] objIds) {
            this.objIds = objIds;
            return this;
        }


        /**
         * 在特定的wiki内搜索
         * <p> 示例值：
         *
         * @param wikiTokens
         * @return
         */
        public Builder wikiTokens(String[] wikiTokens) {
            this.wikiTokens = wikiTokens;
            return this;
        }


        /**
         * 在特定的wiki节点范围内搜索
         * <p> 示例值：
         *
         * @param nodeTokens
         * @return
         */
        public Builder nodeTokens(String[] nodeTokens) {
            this.nodeTokens = nodeTokens;
            return this;
        }


        public WikiPassageParam build() {
            return new WikiPassageParam(this);
        }
    }
}
