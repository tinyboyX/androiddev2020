package vn.edu.usthweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
    private Adapter adapter;
    private ViewPager viewPager;
    public static final String EXTRA_MESSAGE = "vn.edu.usthweather.MESSAGE";

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
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayer.start();
//        // Create a new Fragment to be placed in the activity
//        ForecastFragment firstFragment = new ForecastFragment();
//        // Add the fragment to the 'container' FrameLayout
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.weather_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting_action: {
                // do your sign-out stuff
                startActivities(new Intent[]{new Intent(getApplicationContext(), PrefActivity.class)});
                break;
            }
            case R.id.action_refresh: {
                Toast.makeText(getApplicationContext(), R.string.refresh_message, Toast.LENGTH_LONG).show();
                break;
            }
            // case blocks for other MenuItems (if any)
        }
        return true;
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
