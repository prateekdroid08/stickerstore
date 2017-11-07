package com.stickerstore.softradix.stickerstore.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.stickerstore.softradix.stickerstore.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by softradix on 07/11/17.
 */

public class AdapterPremiumDeals extends RecyclerView.Adapter<AdapterPremiumDeals.RecyclerViewHolder> {

    Context context;
    LayoutInflater inflater;

    int[] myImageList = new int[]{R.drawable.ic_group2, R.drawable.ic_group2, R.drawable.ic_group2,
            R.drawable.ic_group2, R.drawable.ic_group2, R.drawable.ic_group2, R.drawable.ic_group2,
            R.drawable.ic_group2};

    public AdapterPremiumDeals(Context context) {
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public AdapterPremiumDeals.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.adapter_premium_packs, parent, false);
        AdapterPremiumDeals.RecyclerViewHolder viewHolder = new AdapterPremiumDeals.RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final AdapterPremiumDeals.RecyclerViewHolder holder, final int position) {
        Glide.clear(holder.ivDeal);

        Glide.with(context).load("").placeholder(myImageList[position])
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .into(holder.ivDeal);
    }

    @Override
    public int getItemCount() {
        return myImageList.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.iv_premium_deal)
        ImageView ivDeal;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
