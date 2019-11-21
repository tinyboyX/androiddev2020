package vn.edu.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
    private Adapter adapter;
    private ViewPager viewPager;
    private TableLayout tableLayout;
    public WeatherActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "This is onCreate function");
        viewPager = findViewById(R.id.weatherForecastViewPager);
        adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tableLayout.setId(R.id.tabMode);
//        // Create a new Fragment to be placed in the activity
//        ForecastFragment firstFragment = new ForecastFragment();
//        // Add the fragment to the 'container' FrameLayout
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "This is onStart function");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "This is oneResume function");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "This is onPause function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "This is onStop function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "This is onDestroy function");
    }
}
