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

package com.lark.oapi.service.auth.v3;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.auth.v3.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class AuthService {
    private static final Logger log = LoggerFactory.getLogger(AuthService.class);
    private final AppAccessToken appAccessToken; // app_access_token
    private final AppTicket appTicket; // app_ticket
    private final TenantAccessToken tenantAccessToken; // tenant_access_token

    public AuthService(Config config) {
        this.appAccessToken = new AppAccessToken(config);
        this.appTicket = new AppTicket(config);
        this.tenantAccessToken = new TenantAccessToken(config);
    }

    /**
     * app_access_token
     *
     * @return
     */
    public AppAccessToken appAccessToken() {
        return appAccessToken;
    }

    /**
     * app_ticket
     *
     * @return
     */
    public AppTicket appTicket() {
        return appTicket;
    }

    /**
     * tenant_access_token
     *
     * @return
     */
    public TenantAccessToken tenantAccessToken() {
        return tenantAccessToken;
    }

    public static class AppAccessToken {
        private final Config config;

        public AppAccessToken(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=app_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=app_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateAppAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateAppAccessTokenSample.java</a> ;
         */
        public CreateAppAccessTokenResp create(CreateAppAccessTokenReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/app_access_token"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            CreateAppAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAppAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/app_access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=app_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=app_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateAppAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateAppAccessTokenSample.java</a> ;
         */
        public CreateAppAccessTokenResp create(CreateAppAccessTokenReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/app_access_token"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            CreateAppAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAppAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/app_access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=app_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=app_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalAppAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalAppAccessTokenSample.java</a> ;
         */
        public InternalAppAccessTokenResp internal(InternalAppAccessTokenReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/app_access_token/internal"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            InternalAppAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, InternalAppAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/app_access_token/internal"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=app_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=app_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalAppAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalAppAccessTokenSample.java</a> ;
         */
        public InternalAppAccessTokenResp internal(InternalAppAccessTokenReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/app_access_token/internal"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            InternalAppAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, InternalAppAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/app_access_token/internal"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

    public static class AppTicket {
        private final Config config;

        public AppTicket(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=resend&project=auth&resource=app_ticket&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=resend&project=auth&resource=app_ticket&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/ResendAppTicketSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/ResendAppTicketSample.java</a> ;
         */
        public ResendAppTicketResp resend(ResendAppTicketReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/app_ticket/resend"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            ResendAppTicketResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ResendAppTicketResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/app_ticket/resend"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=resend&project=auth&resource=app_ticket&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=resend&project=auth&resource=app_ticket&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/ResendAppTicketSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/ResendAppTicketSample.java</a> ;
         */
        public ResendAppTicketResp resend(ResendAppTicketReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/app_ticket/resend"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            ResendAppTicketResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ResendAppTicketResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/app_ticket/resend"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

    public static class TenantAccessToken {
        private final Config config;

        public TenantAccessToken(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=tenant_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=tenant_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateTenantAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateTenantAccessTokenSample.java</a> ;
         */
        public CreateTenantAccessTokenResp create(CreateTenantAccessTokenReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/tenant_access_token"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            CreateTenantAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateTenantAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/tenant_access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=tenant_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=auth&resource=tenant_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateTenantAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/CreateTenantAccessTokenSample.java</a> ;
         */
        public CreateTenantAccessTokenResp create(CreateTenantAccessTokenReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/tenant_access_token"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            CreateTenantAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateTenantAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/tenant_access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=tenant_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=tenant_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalTenantAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalTenantAccessTokenSample.java</a> ;
         */
        public InternalTenantAccessTokenResp internal(InternalTenantAccessTokenReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/tenant_access_token/internal"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            InternalTenantAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, InternalTenantAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/tenant_access_token/internal"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=tenant_access_token&version=v3">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=internal&project=auth&resource=tenant_access_token&version=v3</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalTenantAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authv3/InternalTenantAccessTokenSample.java</a> ;
         */
        public InternalTenantAccessTokenResp internal(InternalTenantAccessTokenReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/auth/v3/tenant_access_token/internal"
                    , Sets.newHashSet()
                    , req);

            // 反序列化
            InternalTenantAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, InternalTenantAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/auth/v3/tenant_access_token/internal"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

}