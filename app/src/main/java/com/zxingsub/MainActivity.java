package com.zxingsub;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zxinglib.EncodingUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ivQRcode = (ImageView) findViewById(R.id.ivQRcode);
        ivQRcode.setImageBitmap(EncodingUtils.createQRCode("二维码", 400, 400, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)));
    }
}
