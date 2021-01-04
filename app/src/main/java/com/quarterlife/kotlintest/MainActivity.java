package com.quarterlife.kotlintest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager banner = findViewById(R.id.banner);

        List<Data> dataList = new ArrayList<>();
        for(int i = 0; i < 22; i++){
            dataList.add(new Data("" + (i + 1), R.mipmap.ic_launcher_round));
        }

        GridPageAdapter adapter = new GridPageAdapter();
        banner.setAdapter(adapter);
        adapter.setMList(dataList);
        adapter.notifyDataSetChanged();
    }
}