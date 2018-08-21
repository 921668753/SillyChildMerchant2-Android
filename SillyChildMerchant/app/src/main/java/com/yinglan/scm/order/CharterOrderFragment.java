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
import com.yinglan.scm.order.charterorder.AllCharterFragment;
import com.yinglan.scm.order.charterorder.CompletedCharterFragment;
import com.yinglan.scm.order.charterorder.ObligationCharterFragment;
import com.yinglan.scm.order.charterorder.OngoingCharterFragment;
import com.yinglan.scm.order.charterorder.ToEvaluateCharterFragment;

/**
 * 包车订单
 */
public class CharterOrderFragment extends BaseFragment {

    private MainActivity aty;

    @BindView(id = R.id.ll_ongoing, click = true)
    private TextView ll_ongoing;
    @BindView(id = R.id.tv_ongoing)
    private TextView tv_ongoing;
    @BindView(id = R.id.tv_ongoing1)
    private TextView tv_ongoing1;

    @BindView(id = R.id.ll_obligation, click = true)
    private TextView ll_obligation;
    @BindView(id = R.id.tv_obligation)
    private TextView tv_obligation;
    @BindView(id = R.id.tv_obligation1)
    private TextView tv_obligation1;

    @BindView(id = R.id.ll_toEvaluate, click = true)
    private TextView ll_toEvaluate;
    @BindView(id = R.id.tv_toEvaluate)
    private TextView tv_toEvaluate;
    @BindView(id = R.id.tv_toEvaluate1)
    private TextView tv_toEvaluate1;

    @BindView(id = R.id.ll_completed, click = true)
    private TextView ll_completed;
    @BindView(id = R.id.tv_completed)
    private TextView tv_completed;
    @BindView(id = R.id.tv_completed1)
    private TextView tv_completed1;

    @BindView(id = R.id.ll_all, click = true)
    private TextView ll_all;
    @BindView(id = R.id.tv_all)
    private TextView tv_all;
    @BindView(id = R.id.tv_all1)
    private TextView tv_all1;

    private BaseFragment baseFragment;
    private BaseFragment baseFragment1;
    private BaseFragment baseFragment2;
    private BaseFragment baseFragment3;
    private BaseFragment baseFragment4;
    private int chageIcon = 0;


    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        aty = (MainActivity) getActivity();
        return View.inflate(aty, R.layout.fragment_charterorder, null);
    }

    @Override
    protected void initData() {
        super.initData();
        baseFragment = new OngoingCharterFragment();
        baseFragment1 = new ObligationCharterFragment();
        baseFragment2 = new ToEvaluateCharterFragment();
        baseFragment3 = new CompletedCharterFragment();
        baseFragment4 = new AllCharterFragment();
        chageIcon = aty.getIntent().getIntExtra("chageCharterIcon", 10);
    }

    @Override
    protected void initWidget(View parentView) {
        super.initWidget(parentView);
        cleanColors(chageIcon);
    }

    public void changeFragment(BaseFragment targetFragment) {
        super.changeFragment(R.id.order_chartercontent, targetFragment);
    }

    @Override
    public void widgetClick(View v) {
        super.widgetClick(v);
        switch (v.getId()) {
            case R.id.ll_ongoing:
                chageIcon = 10;
                cleanColors(chageIcon);
                break;
            case R.id.ll_obligation:
                chageIcon = 11;
                cleanColors(chageIcon);
                break;
            case R.id.ll_toEvaluate:
                chageIcon = 12;
                cleanColors(chageIcon);
                break;
            case R.id.ll_completed:
                chageIcon = 13;
                cleanColors(chageIcon);
                break;
            case R.id.ll_all:
                chageIcon = 14;
                cleanColors(chageIcon);
                break;
        }

    }


    /**
     * 清除颜色，并添加颜色
     */
    @SuppressWarnings("deprecation")
    public void cleanColors(int chageIcon) {
        tv_ongoing.setTextColor(getResources().getColor(R.color.tabColors));
        tv_ongoing1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_obligation.setTextColor(getResources().getColor(R.color.tabColors));
        tv_obligation1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_toEvaluate.setTextColor(getResources().getColor(R.color.tabColors));
        tv_toEvaluate1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_completed.setTextColor(getResources().getColor(R.color.tabColors));
        tv_completed1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        tv_all.setTextColor(getResources().getColor(R.color.tabColors));
        tv_all1.setBackgroundColor(getResources().getColor(R.color.whiteColors));

        if (chageIcon == 10) {
            tv_ongoing.setTextColor(getResources().getColor(R.color.greenColors));
            tv_ongoing1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(baseFragment);
        } else if (chageIcon == 11) {
            tv_obligation.setTextColor(getResources().getColor(R.color.greenColors));
            tv_obligation1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(baseFragment1);
        } else if (chageIcon == 12) {
            tv_toEvaluate.setTextColor(getResources().getColor(R.color.greenColors));
            tv_toEvaluate1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(baseFragment2);
        } else if (chageIcon == 13) {
            tv_completed.setTextColor(getResources().getColor(R.color.greenColors));
            tv_completed1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(baseFragment3);
        } else if (chageIcon == 14) {
            tv_all.setTextColor(getResources().getColor(R.color.greenColors));
            tv_all1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(baseFragment4);
        } else {
            tv_ongoing.setTextColor(getResources().getColor(R.color.greenColors));
            tv_ongoing1.setBackgroundColor(getResources().getColor(R.color.greenColors));
            changeFragment(baseFragment);
        }
    }

}
