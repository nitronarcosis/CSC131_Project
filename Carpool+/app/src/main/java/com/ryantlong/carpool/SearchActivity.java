package com.ryantlong.carpool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.NumberPicker;

import static com.ryantlong.carpool.R.*;

public class SearchActivity extends AppCompatActivity {
    NumberPicker np = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layout.activity_search);
        np = (NumberPicker) findViewById(id.numberPicker2);
        np.setMaxValue(50);
        np.setMinValue(0);


    }

    public void Search(View view) {
        setContentView(layout.activity_search);
    }


}
