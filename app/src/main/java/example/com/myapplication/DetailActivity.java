package example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import example.com.myapplication.model.DataItem;
import example.com.myapplication.sample.SampleDataProvider;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

    DataItem item = getIntent().getExtras().getParcelable(DataItemAdapter.ITEM_KEY);

        if (item != null) {


            Toast.makeText(this,"Recieved Item " + item.getItemName(), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"DIDNT Recieved Item ", Toast.LENGTH_LONG).show();
        }

    }
}
