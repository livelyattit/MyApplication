package example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import example.com.myapplication.model.DataItem;
import example.com.myapplication.sample.SampleDataProvider;

public class MainActivity extends AppCompatActivity {

    TextView tvout;
    List<DataItem> dataItemList  = SampleDataProvider.dataItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvout = (TextView) findViewById(R.id.out);

        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        for(DataItem item: dataItemList)
        {
             tvout.append(item.getItemName() + "\n");
        }

    }
}
