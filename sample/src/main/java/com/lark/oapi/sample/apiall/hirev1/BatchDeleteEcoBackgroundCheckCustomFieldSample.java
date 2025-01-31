package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.BatchDeleteEcoBackgroundCheckCustomFieldReq;
import com.lark.oapi.service.hire.v1.model.BatchDeleteEcoBackgroundCheckCustomFieldReqBody;
import com.lark.oapi.service.hire.v1.model.BatchDeleteEcoBackgroundCheckCustomFieldResp;

// POST /open-apis/hire/v1/eco_background_check_custom_fields/batch_delete
public class BatchDeleteEcoBackgroundCheckCustomFieldSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        BatchDeleteEcoBackgroundCheckCustomFieldReq req = BatchDeleteEcoBackgroundCheckCustomFieldReq.newBuilder()
                .batchDeleteEcoBackgroundCheckCustomFieldReqBody(BatchDeleteEcoBackgroundCheckCustomFieldReqBody.newBuilder()
                        .accountId("a001")
                        .build())
                .build();

        // 发起请求
        BatchDeleteEcoBackgroundCheckCustomFieldResp resp = client.hire().ecoBackgroundCheckCustomField().batchDelete(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
