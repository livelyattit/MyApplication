package example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import example.com.myapplication.model.DataItem;

public class MainActivity extends AppCompatActivity {

    TextView tvout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvout = (TextView) findViewById(R.id.out);

        DataItem item = new DataItem(null,"My menu Item", "a category","a description" , 1 , 9.95, "apple_pie.jpg");

        tvout.setText(item.toString());

    }
}
