package example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import example.com.myapplication.model.DataItem;
import example.com.myapplication.sample.SampleDataProvider;

public class MainActivity extends AppCompatActivity {


    List<DataItem> dataItemList  = SampleDataProvider.dataItemList;
    List<String> itemNames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     for(DataItem item: dataItemList)
     {
         itemNames.add(item.getItemName());
     }

     Collections.sort(itemNames);

        ListView listView = (ListView) findViewById(android.R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1 , itemNames);

        listView.setAdapter(adapter);




    }
}
