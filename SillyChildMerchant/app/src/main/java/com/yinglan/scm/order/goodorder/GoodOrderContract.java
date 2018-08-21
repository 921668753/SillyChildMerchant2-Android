package com.yinglan.scm.order.goodorder;

import com.common.cklibrary.common.BasePresenter;
import com.common.cklibrary.common.BaseView;

/**
 * Created by ruitu on 2016/9/24.
 */

public interface GoodOrderContract {
    interface Presenter extends BasePresenter {

        /**
         * 获取订单信息列表
         */
        void getOrderList(String status, int page);

        /**
         * 确认发货
         */
        void postOrderShip(int orderId);

        /**
         * 订单售后
         */
        void postOrderBack(int orderItemId, int status, String sellerRemark);
    }

    interface View extends BaseView<Presenter, String> {
    }

}


