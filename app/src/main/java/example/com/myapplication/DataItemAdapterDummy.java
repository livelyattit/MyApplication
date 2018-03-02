package example.com.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import example.com.myapplication.model.DataItem;

/**
 * Created by affan_ui693t9 on 3/1/2018.
 */


//Incomplete class , just for watching what was happening in @DataItemAdapter Class ,
public class DataItemAdapterDummy extends RecyclerView.Adapter<DataItemAdapterDummy.ViewHolder> {

    private List<DataItem> mItems;
    private Context mContext;

    public DataItemAdapterDummy( Context mContextList, List<DataItem> mItems) {
        this.mItems = mItems;
        this.mContext = mContext;
    }

    @Override
    public DataItemAdapterDummy.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DataItemAdapterDummy.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder
    {

        public TextView tvName;
        public ImageView imageView;
        public View mView;
        public ViewHolder(View itemView)
        {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.itemNameText);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            mView = itemView;
        }
    }
}
