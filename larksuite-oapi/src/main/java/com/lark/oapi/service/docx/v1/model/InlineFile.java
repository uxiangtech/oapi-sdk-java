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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class InlineFile {
    /**
     * 附件 token
     * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
     */
    @SerializedName("file_token")
    private String fileToken;
    /**
     * 当前文档中该附件所处的 block 的 id
     * <p> 示例值：doxcnM46kSWSkgUMW04ldKsJDsc
     */
    @SerializedName("source_block_id")
    private String sourceBlockId;
    /**
     * 文本局部样式
     * <p> 示例值：
     */
    @SerializedName("text_element_style")
    private TextElementStyle textElementStyle;

    // builder 开始
    public InlineFile() {
    }

    public InlineFile(Builder builder) {
        /**
         * 附件 token
         * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
         */
        this.fileToken = builder.fileToken;
        /**
         * 当前文档中该附件所处的 block 的 id
         * <p> 示例值：doxcnM46kSWSkgUMW04ldKsJDsc
         */
        this.sourceBlockId = builder.sourceBlockId;
        /**
         * 文本局部样式
         * <p> 示例值：
         */
        this.textElementStyle = builder.textElementStyle;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getSourceBlockId() {
        return this.sourceBlockId;
    }

    public void setSourceBlockId(String sourceBlockId) {
        this.sourceBlockId = sourceBlockId;
    }

    public TextElementStyle getTextElementStyle() {
        return this.textElementStyle;
    }

    public void setTextElementStyle(TextElementStyle textElementStyle) {
        this.textElementStyle = textElementStyle;
    }

    public static class Builder {
        /**
         * 附件 token
         * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
         */
        private String fileToken;
        /**
         * 当前文档中该附件所处的 block 的 id
         * <p> 示例值：doxcnM46kSWSkgUMW04ldKsJDsc
         */
        private String sourceBlockId;
        /**
         * 文本局部样式
         * <p> 示例值：
         */
        private TextElementStyle textElementStyle;

        /**
         * 附件 token
         * <p> 示例值：boxcnOj88GDkmWGm2zsTyCBqoLb
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        /**
         * 当前文档中该附件所处的 block 的 id
         * <p> 示例值：doxcnM46kSWSkgUMW04ldKsJDsc
         *
         * @param sourceBlockId
         * @return
         */
        public Builder sourceBlockId(String sourceBlockId) {
            this.sourceBlockId = sourceBlockId;
            return this;
        }


        /**
         * 文本局部样式
         * <p> 示例值：
         *
         * @param textElementStyle
         * @return
         */
        public Builder textElementStyle(TextElementStyle textElementStyle) {
            this.textElementStyle = textElementStyle;
            return this;
        }


        public InlineFile build() {
            return new InlineFile(this);
        }
    }
}
