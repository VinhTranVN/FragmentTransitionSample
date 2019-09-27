package com.example.fragmenttransitions;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ViewHolder for kitten cells in our grid
 *
 * @author bherbst
 */
public class KittenViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView text;

    public KittenViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
        text = (TextView) itemView.findViewById(R.id.description);
    }
}
