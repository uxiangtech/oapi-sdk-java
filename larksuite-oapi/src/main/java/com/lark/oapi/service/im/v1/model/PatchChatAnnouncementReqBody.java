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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class PatchChatAnnouncementReqBody {
    /**
     * 文档当前版本号 int64 类型，[获取群公告信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-announcement/get)接口会返回
     * <p> 示例值：12
     */
    @SerializedName("revision")
    private String revision;
    /**
     * 修改文档请求的序列化字段;;更新公告信息的格式和更新[云文档](https://open.feishu.cn/document/ukTMukTMukTM/uYDM2YjL2AjN24iNwYjN)格式相同
     * <p> 示例值：{\"requestType\":\"InsertBlocksRequestType\",\"insertBlocksRequest\":{\"payload\":\"{\\\"blocks\\\":[{\\\"type\\\":\\\"paragraph\\\",\\\"paragraph\\\":{\\\"elements\\\":[{\\\"type\\\":\\\"textRun\\\",\\\"textRun\\\":{\\\"text\\\":\\\"ylyyyyyDocs API Sample Content\\\",\\\"style\\\":{}}}],\\\"style\\\":{}}}]}\",\"location\":{\"zoneId\":\"0\",\"index\":0, \"endOfZone\": true}}}
     */
    @SerializedName("requests")
    private String[] requests;

    // builder 开始
    public PatchChatAnnouncementReqBody() {
    }

    public PatchChatAnnouncementReqBody(Builder builder) {
        /**
         * 文档当前版本号 int64 类型，[获取群公告信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-announcement/get)接口会返回
         * <p> 示例值：12
         */
        this.revision = builder.revision;
        /**
         * 修改文档请求的序列化字段;;更新公告信息的格式和更新[云文档](https://open.feishu.cn/document/ukTMukTMukTM/uYDM2YjL2AjN24iNwYjN)格式相同
         * <p> 示例值：{\"requestType\":\"InsertBlocksRequestType\",\"insertBlocksRequest\":{\"payload\":\"{\\\"blocks\\\":[{\\\"type\\\":\\\"paragraph\\\",\\\"paragraph\\\":{\\\"elements\\\":[{\\\"type\\\":\\\"textRun\\\",\\\"textRun\\\":{\\\"text\\\":\\\"ylyyyyyDocs API Sample Content\\\",\\\"style\\\":{}}}],\\\"style\\\":{}}}]}\",\"location\":{\"zoneId\":\"0\",\"index\":0, \"endOfZone\": true}}}
         */
        this.requests = builder.requests;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String[] getRequests() {
        return this.requests;
    }

    public void setRequests(String[] requests) {
        this.requests = requests;
    }

    public static class Builder {
        /**
         * 文档当前版本号 int64 类型，[获取群公告信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-announcement/get)接口会返回
         * <p> 示例值：12
         */
        private String revision;
        /**
         * 修改文档请求的序列化字段;;更新公告信息的格式和更新[云文档](https://open.feishu.cn/document/ukTMukTMukTM/uYDM2YjL2AjN24iNwYjN)格式相同
         * <p> 示例值：{\"requestType\":\"InsertBlocksRequestType\",\"insertBlocksRequest\":{\"payload\":\"{\\\"blocks\\\":[{\\\"type\\\":\\\"paragraph\\\",\\\"paragraph\\\":{\\\"elements\\\":[{\\\"type\\\":\\\"textRun\\\",\\\"textRun\\\":{\\\"text\\\":\\\"ylyyyyyDocs API Sample Content\\\",\\\"style\\\":{}}}],\\\"style\\\":{}}}]}\",\"location\":{\"zoneId\":\"0\",\"index\":0, \"endOfZone\": true}}}
         */
        private String[] requests;

        /**
         * 文档当前版本号 int64 类型，[获取群公告信息](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-announcement/get)接口会返回
         * <p> 示例值：12
         *
         * @param revision
         * @return
         */
        public Builder revision(String revision) {
            this.revision = revision;
            return this;
        }


        /**
         * 修改文档请求的序列化字段;;更新公告信息的格式和更新[云文档](https://open.feishu.cn/document/ukTMukTMukTM/uYDM2YjL2AjN24iNwYjN)格式相同
         * <p> 示例值：{\"requestType\":\"InsertBlocksRequestType\",\"insertBlocksRequest\":{\"payload\":\"{\\\"blocks\\\":[{\\\"type\\\":\\\"paragraph\\\",\\\"paragraph\\\":{\\\"elements\\\":[{\\\"type\\\":\\\"textRun\\\",\\\"textRun\\\":{\\\"text\\\":\\\"ylyyyyyDocs API Sample Content\\\",\\\"style\\\":{}}}],\\\"style\\\":{}}}]}\",\"location\":{\"zoneId\":\"0\",\"index\":0, \"endOfZone\": true}}}
         *
         * @param requests
         * @return
         */
        public Builder requests(String[] requests) {
            this.requests = requests;
            return this;
        }


        public PatchChatAnnouncementReqBody build() {
            return new PatchChatAnnouncementReqBody(this);
        }
    }
}
