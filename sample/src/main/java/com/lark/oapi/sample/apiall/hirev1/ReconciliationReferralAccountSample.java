package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.ReconciliationReferralAccountReq;
import com.lark.oapi.service.hire.v1.model.ReconciliationReferralAccountReqBody;
import com.lark.oapi.service.hire.v1.model.ReconciliationReferralAccountResp;
import com.lark.oapi.service.hire.v1.model.TradeDetail;

// POST /open-apis/hire/v1/referral_account/reconciliation
public class ReconciliationReferralAccountSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ReconciliationReferralAccountReq req = ReconciliationReferralAccountReq.newBuilder()
                .reconciliationReferralAccountReqBody(ReconciliationReferralAccountReqBody.newBuilder()
                        .startTransTime("1685416831621")
                        .endTransTime("1685416831622")
                        .tradeDetails(new TradeDetail[]{})
                        .build())
                .build();

        // 发起请求
        ReconciliationReferralAccountResp resp = client.hire().referralAccount().reconciliation(req);

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
