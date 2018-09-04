package com.example.dipes.scheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * Created by dipes on 8/27/2018.
 */

public class windowpopup extends MainActivity {
    public Button btncl;
    public Button btnsd;
    public void init(){
        btncl=(Button) findViewById(R.id.btn_cl);
        btncl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( windowpopup.this,PopUp.class));
            }
        });

        btnsd=(Button) findViewById(R.id.btn_sd);
        btnsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(windowpopup.this,MainActivity.class));

            }
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_windowpopup);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width= dm.widthPixels;
        int height= dm.heightPixels;

        getWindow().setLayout((int)(width*.90),(int)(height*.6));
        init();
    }

}
