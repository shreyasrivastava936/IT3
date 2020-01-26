package com.ggoogle.internshiptest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mimageView=(ImageView) findViewById(R.id.imageView);
        ImageView mimageView2=(ImageView) findViewById(R.id.imageView2);
        ImageView mimageView3=(ImageView) findViewById(R.id.imageView3);
        ImageView mimageView4=(ImageView) findViewById(R.id.imageView4);

        Bitmap mbitmap=((BitmapDrawable) getResources().getDrawable(R.drawable._20200125_170729)).getBitmap();
        Bitmap imageRounded=Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        Canvas canvas=new Canvas(imageRounded);
        Paint mpaint=new Paint();
      //  mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 10, 10, mpaint); // Round Image Corner 100 100 100 100
        mimageView.setImageBitmap(imageRounded);
        mimageView2.setImageBitmap(imageRounded);
        mimageView3.setImageBitmap(imageRounded);
        mimageView4.setImageBitmap(imageRounded);


    }
}
