package com.baozi.sun.fragment;

import com.baozi.sun.base.BaseWebFragment;

/**
 * 首页
 * Created by qiong.liao on 2018/4/13.
 */

public class HomeFragment extends BaseWebFragment {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public String getWebUrl() {
        return "http://www.baidu.com";
    }
}
