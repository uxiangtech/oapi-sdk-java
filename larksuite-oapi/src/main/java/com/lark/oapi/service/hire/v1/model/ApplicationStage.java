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

public class ApplicationStage {
    /**
     * ID
     * <p> 示例值：
     */
    @SerializedName("id")
    private String id;
    /**
     * 名字
     * <p> 示例值：
     */
    @SerializedName("name")
    private String name;
    /**
     * 英文名
     * <p> 示例值：
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 类型
     * <p> 示例值：
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 参数
     * <p> 示例值：
     */
    @SerializedName("args")
    private String args;
    /**
     * 创建者ID
     * <p> 示例值：
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 序列
     * <p> 示例值：
     */
    @SerializedName("seq")
    private Integer seq;
    /**
     * 发布名称
     * <p> 示例值：
     */
    @SerializedName("publish_name")
    private String publishName;
    /**
     * 发布英文名
     * <p> 示例值：
     */
    @SerializedName("publish_en_name")
    private String publishEnName;

    // builder 开始
    public ApplicationStage() {
    }

    public ApplicationStage(Builder builder) {
        /**
         * ID
         * <p> 示例值：
         */
        this.id = builder.id;
        /**
         * 名字
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 英文名
         * <p> 示例值：
         */
        this.enName = builder.enName;
        /**
         * 类型
         * <p> 示例值：
         */
        this.type = builder.type;
        /**
         * 参数
         * <p> 示例值：
         */
        this.args = builder.args;
        /**
         * 创建者ID
         * <p> 示例值：
         */
        this.creatorId = builder.creatorId;
        /**
         * 序列
         * <p> 示例值：
         */
        this.seq = builder.seq;
        /**
         * 发布名称
         * <p> 示例值：
         */
        this.publishName = builder.publishName;
        /**
         * 发布英文名
         * <p> 示例值：
         */
        this.publishEnName = builder.publishEnName;
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

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getArgs() {
        return this.args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getPublishName() {
        return this.publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getPublishEnName() {
        return this.publishEnName;
    }

    public void setPublishEnName(String publishEnName) {
        this.publishEnName = publishEnName;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：
         */
        private String id;
        /**
         * 名字
         * <p> 示例值：
         */
        private String name;
        /**
         * 英文名
         * <p> 示例值：
         */
        private String enName;
        /**
         * 类型
         * <p> 示例值：
         */
        private Integer type;
        /**
         * 参数
         * <p> 示例值：
         */
        private String args;
        /**
         * 创建者ID
         * <p> 示例值：
         */
        private String creatorId;
        /**
         * 序列
         * <p> 示例值：
         */
        private Integer seq;
        /**
         * 发布名称
         * <p> 示例值：
         */
        private String publishName;
        /**
         * 发布英文名
         * <p> 示例值：
         */
        private String publishEnName;

        /**
         * ID
         * <p> 示例值：
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 名字
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 英文名
         * <p> 示例值：
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 类型
         * <p> 示例值：
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }


        /**
         * 参数
         * <p> 示例值：
         *
         * @param args
         * @return
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }


        /**
         * 创建者ID
         * <p> 示例值：
         *
         * @param creatorId
         * @return
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }


        /**
         * 序列
         * <p> 示例值：
         *
         * @param seq
         * @return
         */
        public Builder seq(Integer seq) {
            this.seq = seq;
            return this;
        }


        /**
         * 发布名称
         * <p> 示例值：
         *
         * @param publishName
         * @return
         */
        public Builder publishName(String publishName) {
            this.publishName = publishName;
            return this;
        }


        /**
         * 发布英文名
         * <p> 示例值：
         *
         * @param publishEnName
         * @return
         */
        public Builder publishEnName(String publishEnName) {
            this.publishEnName = publishEnName;
            return this;
        }


        public ApplicationStage build() {
            return new ApplicationStage(this);
        }
    }
}
