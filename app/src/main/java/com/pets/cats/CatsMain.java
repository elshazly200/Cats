package com.pets.cats;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CatsMain extends AppCompatActivity {

    private int currentCat = 1;
    ImageView img;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats_main);
        img = (ImageView) findViewById(R.id.imgCats);
        txtName = (TextView) findViewById(R.id.txtName);
    }

    public void btnNext_Click(View view) {
        NextImage();
    }

    public void btnPrevious_Click(View view) {
        PreviousImage();
    }

    public void imgCats_Clicked(View view) {
        NextImage();
    }

    private void NextImage() {
        RotateImage();
        if (currentCat == 10) currentCat = 0;
        String catName = "cat" + String.valueOf(++currentCat);
        img.setImageResource(getResources().getIdentifier(catName, "drawable", getPackageName()));
        txtName.setText("Cat "+currentCat);
    }

    private void PreviousImage() {
        RotateImage();
        if (currentCat == 1) currentCat = 11;
        String catName = "cat" + String.valueOf(--currentCat);
        img.setImageResource(getResources().getIdentifier(catName, "drawable", getPackageName()));
        txtName.setText("Cat "+currentCat);
    }

    private void RotateImage() {
        img.setRotation(0);
        img.animate().rotationBy(1800f).setDuration(300);
        //cc vv
    }


}

