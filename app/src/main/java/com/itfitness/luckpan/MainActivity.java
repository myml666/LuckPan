package com.itfitness.luckpan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.itfitness.luckpan.widget.LuckPan;
import com.itfitness.luckpan.widget.LuckPanAnimEndCallBack;

public class MainActivity extends AppCompatActivity {
    private LuckPan pan;
    private ImageView imgStart;
    private String[] mItemStrs = {"123","撒大声道1","撒大声道2","撒旦说","撒大声道3","哥哥哥","对应效果","对应代码"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pan = (LuckPan) findViewById(R.id.pan);
        imgStart = (ImageView) findViewById(R.id.img_start);
        pan.setItems(mItemStrs);
        pan.setLuckNumber(2);
        pan.setLuckPanAnimEndCallBack(new LuckPanAnimEndCallBack() {
            @Override
            public void onAnimEnd(String str) {
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
        imgStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pan.startAnim();
            }
        });
    }
}
