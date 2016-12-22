package com.dream.will.hydrogenballoon.customview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.dream.will.hydrogenballoon.R;
import com.dream.will.hydrogenballoon.bean.Destinations;
import com.dream.will.hydrogenballoon.content.DestinationConstent;
import com.dream.will.hydrogenballoon.inter.OnDestinationClickListener;
import com.dream.will.hydrogenballoon.ui.DestinationActivity;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static android.R.attr.tag;
import static android.R.attr.type;

/**
 * Created by Karlo on 2016/12/20.
 */


public class GoodsView extends ViewPager {
    private Context context;
    private OnDestinationClickListener listener;
    private int goods_type_resId;

    public GoodsView(Context context) {
        super(context);
        this.context = context;
        goods_type_resId = R.string.destination_goods_type;
    }

    public GoodsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        goods_type_resId = R.string.destination_goods_type;
    }

    public void setData(@NonNull List<Destinations.DataBean.GoodsBean> goods) {
        if (goods.size() == 0) {
            return;
        }
        List<View> list = new ArrayList<>();
        GoodView goodView = null;
        for (int i = 0; i <= (goods.size() - 1) / 4; i++) {
            goodView = new GoodView(context);
            int count = goods.size() <= (i + 1) * 4 ? goods.size() : (i + 1) * 4;
            for (int j = i * 4; j < count; j++) {
                goodView.addView(goods.get(j));
            }
            list.add(goodView);
        }

        DestinationGoodsAdapter adapter = new DestinationGoodsAdapter(list);
        setAdapter(adapter);
    }

    public void setListener(OnDestinationClickListener listener) {
        this.listener = listener;
    }

    private class GoodView extends LinearLayout implements OnClickListener {
        private Context context;
        private LayoutParams params;

        public GoodView(Context context) {
            super(context);
            this.context = context;
            init();
        }

        public GoodView(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.context = context;
            init();
        }

        private void init() {
            setBackgroundColor(Color.WHITE);
            params = new LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
            params.weight = 1;
            setOrientation(HORIZONTAL);
            setWeightSum(4f);
        }

        public void addView(Destinations.DataBean.GoodsBean bean) {
            TextView tv = new TextView(context);
            tv.setText(bean.getTitle());
            tv.setGravity(Gravity.CENTER);
            tv.setOnClickListener(this);
            String type = bean.getType();
            tv.setTag(goods_type_resId, type);
            if (DestinationConstent.GOODS_WIKI.equals(type)) {
                int id = bean.getWiki_destination().getId();
                tv.setTag(id);
            }
            addView(tv, params);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(((String) v.getTag(goods_type_resId)), v);
            }
        }

    }

    private class DestinationGoodsAdapter extends PagerAdapter {
        private List<View> list;

        public DestinationGoodsAdapter(List<View> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        public DestinationGoodsAdapter() {
            super();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = list.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
