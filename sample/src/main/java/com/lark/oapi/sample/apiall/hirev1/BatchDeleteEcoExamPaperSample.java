package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.BatchDeleteEcoExamPaperReq;
import com.lark.oapi.service.hire.v1.model.BatchDeleteEcoExamPaperReqBody;
import com.lark.oapi.service.hire.v1.model.BatchDeleteEcoExamPaperResp;

// POST /open-apis/hire/v1/eco_exam_papers/batch_delete
public class BatchDeleteEcoExamPaperSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        BatchDeleteEcoExamPaperReq req = BatchDeleteEcoExamPaperReq.newBuilder()
                .batchDeleteEcoExamPaperReqBody(BatchDeleteEcoExamPaperReqBody.newBuilder()
                        .accountId("7147998241542539527")
                        .paperIdList(new String[]{})
                        .build())
                .build();

        // 发起请求
        BatchDeleteEcoExamPaperResp resp = client.hire().ecoExamPaper().batchDelete(req);

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
