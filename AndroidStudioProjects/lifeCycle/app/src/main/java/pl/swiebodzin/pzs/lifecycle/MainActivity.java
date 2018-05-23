package pl.swiebodzin.pzs.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "aplikacja";
    private static final String NUMBER = "liczba";
    Random random;
    TextView textView;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        textView = findViewById(R.id.textView);
        result = random.nextInt(100);
        textView.setText(String.valueOf(result));
    }




    @Override
    protected void onStart() {
        Log.d (TAG, "onCreate");
        Log.d (NUMBER, String.valueOf(result));
        super.onStart();

    }
    @Override
    protected void onPostResume() {
        Log.d(TAG, "onCreate");
        Log.d (NUMBER, String.valueOf(result));
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.d (TAG, "onCreate");
        Log.d (NUMBER, String.valueOf(result));
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d (TAG, "onCreate");
        Log.d (NUMBER, String.valueOf(result));
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d (TAG, "onCreate");
        Log.d (NUMBER, String.valueOf(result));
        super.onDestroy();
    }
}

