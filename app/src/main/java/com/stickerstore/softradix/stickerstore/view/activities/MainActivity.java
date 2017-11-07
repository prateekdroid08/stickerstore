package com.stickerstore.softradix.stickerstore.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.stickerstore.softradix.stickerstore.R;
import com.stickerstore.softradix.stickerstore.adapters.AdapterPremiumDeals;
import com.stickerstore.softradix.stickerstore.adapters.AdapterWeeklyProducts;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;
    @Bind(R.id.recycler_view_greed)
    RecyclerView recyclerViewGrid;

    AdapterWeeklyProducts adapterWeeklyProducts;
    AdapterPremiumDeals adapterPremiumDeals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        adapterWeeklyProducts = new AdapterWeeklyProducts(this);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterWeeklyProducts);
        recyclerView.setHasFixedSize(true);
        //Layout manager for Recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        adapterPremiumDeals = new AdapterPremiumDeals(this);
        recyclerViewGrid.setItemAnimator(new DefaultItemAnimator());
        recyclerViewGrid.setAdapter(adapterPremiumDeals);
        recyclerViewGrid.setHasFixedSize(true);
        //Layout manager for Recycler view
        recyclerViewGrid.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
