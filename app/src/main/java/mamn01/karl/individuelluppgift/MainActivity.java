package mamn01.karl.individuelluppgift;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Compass button */
    public void displayCompass(View view) {
        Intent intent = new Intent(this, DisplayCompassActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Accelerometer button */
    public void displayAccelerometer(View view) {
        Intent intent = new Intent(this, Accelerometer.class);
        startActivity(intent);
    }
}
