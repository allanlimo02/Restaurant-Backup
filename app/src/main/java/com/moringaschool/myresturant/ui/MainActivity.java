package com.moringaschool.myresturant.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.*;
//import android.widget.EditText;

import com.moringaschool.myresturant.Constants;
import com.moringaschool.myresturant.R;
import com.moringaschool.myresturant.RestaurantListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.mLocationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    private static final String TAG = RestaurantListActivity.class.getSimpleName();
//    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v==mFindRestaurantsButton){
                    String location = mLocationEditText.getText().toString();
                    if(!(location).equals("")) {
                        addToSharedPreferences(location);
                    }
                    Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                    startActivity(intent);
                    intent.putExtra("location", location);
                    startActivity(intent);
                }
            }
            private void addToSharedPreferences(String location) {
                mEditor.putString(Constants.PREFERENCES_LOCATION_KEY, location).apply();
            }

            //preparing java code to handle user input from locationInput

    });
    }
}