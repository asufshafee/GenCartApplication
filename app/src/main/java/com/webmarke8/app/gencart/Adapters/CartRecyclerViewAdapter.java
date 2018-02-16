package com.webmarke8.app.gencart.Adapters;

/**
 * Created by Asus on 2/1/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webmarke8.app.gencart.Objects.Cart;
import com.webmarke8.app.gencart.Objects.Store;
import com.webmarke8.app.gencart.R;

import java.util.List;

public class CartRecyclerViewAdapter extends RecyclerView.Adapter<CartRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<Cart> models;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public ViewHolder(View v) {
            super(v);

        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public CartRecyclerViewAdapter(Context context, List<Cart> models) {
        this.context = context;
        this.models = models;
        ;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}