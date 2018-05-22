package pl.swiebodzin.pzs.androidaplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText lastNumber;
    Button clickButton;
    Button sumButton;
    TextView textSum;


    int a, b, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstNumber = findViewById(R.id.firstNumber);
        lastNumber = findViewById(R.id.lastNumber);
        clickButton = findViewById(R.id.clickButton);
        sumButton = findViewById(R.id.sumButton);
        textSum = findViewById(R.id.wynikText);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               a = Integer.parseInt(firstNumber.getText().toString());
                        b = Integer.parseInt(lastNumber.getText().toString());
               // String firstnumberstring = firstNumber. getText().toString();
                // a = Integer.parseInt(firstnumberstring);
                sum = getsum(a, b);
                textSum.setText(String.valueOf(sum));

            }

        // TODO  - pomaga uzupełnić metodę;



            });






}

    public int getsum(int a, int b){
        return a + b;
    }

}