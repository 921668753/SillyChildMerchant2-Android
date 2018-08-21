package com.yinglan.scm.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.common.cklibrary.common.BaseFragment;
import com.common.cklibrary.common.BindView;
import com.yinglan.scm.R;
import com.yinglan.scm.main.MainActivity;
import com.yinglan.scm.order.goodorder.AfterSaleGoodFragment;
import com.yinglan.scm.order.goodorder.AllGoodFragment;
import com.yinglan.scm.order.goodorder.CompletedGoodFragment;
import com.yinglan.scm.order.goodorder.ObligationGoodFragment;
import com.yinglan.scm.order.goodorder.SendGoodsGoodFragment;
import com.yinglan.scm.order.goodorder.WaitGoodsGoodFragment;

/**
 * 商品订单
 */
public class GoodOrderFragment extends BaseFragment {

    private MainActivity aty;

    @BindView(id = R.id.ll_obligation, click = true)
    private TextView ll_obligation;
    @BindView(id = R.id.tv_obligation)
    private TextView tv_obligation;
    @BindView(id = R.id.tv_obligation1)
    private TextView tv_obligation1;


    @BindView(id = R.id.ll_sendGoods, click = true)
    private TextView ll_sendGoods;
    @BindView(id = R.id.tv_sendGoods)
    private TextView tv_sendGoods;
    @BindView(id = R.id.tv_sendGoods1)
    private TextView tv_sendGoods1;

    @BindView(id = R.id.ll_waitGoods, click = true)
    private TextView ll_waitGoods;
    @BindView(id = R.id.tv_waitGoods)
    private TextView tv_waitGoods;
    @BindView(id = R.id.tv_waitGoods1)
    private TextView tv_waitGoods1;

    @BindView(id = R.id.ll_completed, click = true)
    private TextView ll_completed;
    @BindView(id = R.id.tv_completed)
    private TextView tv_completed;
    @BindView(id = R.id.tv_completed1)
    private TextView tv_completed1;

    @BindView(id = R.id.ll_afterSale, click = true)
    private TextView ll_afterSale;
    @BindView(id = R.id.tv_afterSale)
    private TextView tv_afterSale;
    @BindView(id = R.id.tv_afterSale1)
    private TextView tv_afterSale1;

    @BindView(id = R.id.ll_all, click = true)
    private TextView ll_all;
    @BindView(id = R.id.tv_all)
    private TextView tv_all;
    @BindView(id = R.id.tv_all1)
    private TextView tv_all1;

    private BaseFragment obligationGoodFragment;
    private BaseFragment sendGoodsGoodFragment;
    private BaseFragment waitGoodsGoodFragment;
    private BaseFragment completedGoodFragment;
    private BaseFragment afterSaleGoodFragment;
    private BaseFragment allGoodFragment;
    private int chageIcon = 0;


    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        aty = (MainActivity) getActivity();
        return View.inflate(aty, R.layout.fragment_goodorder, null);
    }

    @Override
    protected void initData() {
        super.initData();
        obligationGoodFragment = new ObligationGoodFragment();
        sendGoodsGoodFragment = new SendGoodsGoodFragment();
        waitGoodsGoodFragment = new WaitGoodsGoodFragment();
        completedGoodFragment = new CompletedGoodFragment();
        afterSaleGoodFragment = new AfterSaleGoodFragment();
        allGoodFragment = new AllGoodFragment();
        chageIcon = aty.getIntent().getIntExtra("chageGoodIcon", 20);
    }

    @Override
    protected void initWidget(View parentView) {
        super.initWidget(parentView);
        cleanColors(chageIcon);
    }

    public void changeFragment(BaseFragment targetFragment) {
        super.changeFragment(R.id.order_goodcontent, targetFragment);
    }

    @Override
    public void widgetClick(View v) {
        super.widgetClick(v);
        switch (v.getId()) {
            case R.id.ll_obligation:
                chageIcon = 20;
                cleanColors(chageIcon);
                break;
            case R.id.ll_sendGoods:
                chageIcon = 21;
                cleanColors(chageIcon);
                break;
            case R.id.ll_waitGoods:
                chageIcon = 22;
                cleanColors(chageIcon);
                break;
            case R.id.ll_completed:
                chageIcon = 23;
                cleanColors(chageIcon);
                break;
            case R.id.ll_afterSale:
                chageIcon = 24;
                cleanColors(chageIcon);
                break;
            case R.id.ll_all:
                chageIcon = 25;
                cleanColors(chageIcon);
                break;
        }

    }


    /**
     * 清除颜色，并添加颜色
     */
    @SuppressWarnings("deprecation")
    public void cleanColors(int chageIcon) {
        tv_obligation.setTextColor(getResources().getColor(R.color.tabColors));
        tv_obligation1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_sendGoods.setTextColor(getResources().getColor(R.color.tabColors));
        tv_sendGoods1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_waitGoods.setTextColor(getResources().getColor(R.color.tabColors));
        tv_waitGoods1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_completed.setTextColor(getResources().getColor(R.color.tabColors));
        tv_completed1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_afterSale.setTextColor(getResources().getColor(R.color.tabColors));
        tv_afterSale1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_all.setTextColor(getResources().getColor(R.color.tabColors));
        tv_all1.setBackgroundColor(getResources().getColor(R.color.whiteColors));
        if (chageIcon == 20) {
            tv_obligation.setTextColor(getResources().getColor(R.color.greenColors));
            tv_obligation1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(obligationGoodFragment);
        } else if (chageIcon == 21) {
            tv_sendGoods.setTextColor(getResources().getColor(R.color.greenColors));
            tv_sendGoods1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(sendGoodsGoodFragment);
        } else if (chageIcon == 22) {
            tv_waitGoods.setTextColor(getResources().getColor(R.color.greenColors));
            tv_waitGoods1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(waitGoodsGoodFragment);
        } else if (chageIcon == 23) {
            tv_completed.setTextColor(getResources().getColor(R.color.greenColors));
            tv_completed1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(completedGoodFragment);
        } else if (chageIcon == 24) {
            tv_afterSale.setTextColor(getResources().getColor(R.color.greenColors));
            tv_afterSale1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(afterSaleGoodFragment);
        } else if (chageIcon == 25) {
            tv_all.setTextColor(getResources().getColor(R.color.greenColors));
            tv_all1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(allGoodFragment);
        } else {
            tv_obligation.setTextColor(getResources().getColor(R.color.greenColors));
            tv_obligation1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(obligationGoodFragment);
        }
    }

}
