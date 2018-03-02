package example.com.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import example.com.myapplication.model.DataItem;

/**
 * Created by affan_ui693t9 on 2/27/2018.
 */

public class DataItemAdapterForListView extends ArrayAdapter<DataItem> {

    List<DataItem> mDataItems;
    LayoutInflater  mInflater;

    public DataItemAdapterForListView(@NonNull Context context, @NonNull List<DataItem> objects) {

        super(context, R.layout.list_item, objects);

        mDataItems = objects;
        mInflater = LayoutInflater.from(context);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.list_item ,parent , false);
        }

        TextView tvName = convertView.findViewById(R.id.itemNameText);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        DataItem item = mDataItems.get(position);

        tvName.setText(item.getItemName());
        InputStream inputStream = null;
        try {
            String imageFile = item.getImage();

            inputStream = getContext().getAssets().open(imageFile);
            Drawable d = Drawable.createFromStream(inputStream , null);
            imageView.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {

            try {
                if (inputStream != null) {

                    inputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return convertView;
    }
}
