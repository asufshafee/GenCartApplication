package com.webmarke8.app.gencart.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import com.webmarke8.app.gencart.Adapters.ExpandableHeightGridView;
import com.webmarke8.app.gencart.Adapters.ItemGridviewAdapter;
import com.webmarke8.app.gencart.Adapters.StoreRecyclerViewAdapter;
import com.webmarke8.app.gencart.Objects.Product;
import com.webmarke8.app.gencart.Objects.Store;
import com.webmarke8.app.gencart.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment extends Fragment {



    private ExpandableHeightGridView Gridview;
    private ItemGridviewAdapter GridViewAdapter;
    List<Product> ProductList;

    FrameLayout Detail;
    ScrollView Scroll;


    public ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item, container, false);
        ProductList =new ArrayList<>();

        Scroll = (ScrollView) view.findViewById(R.id.Scroll);

        Detail = (FrameLayout) view.findViewById(R.id.Details);
        Detail.setVisibility(View.GONE);
        Gridview = (ExpandableHeightGridView) view.findViewById(R.id.gridview);

        GridViewAdapter = new ItemGridviewAdapter(getActivity(), ProductList, Detail, Scroll);
        GridViewAdapter.setMyApp(getActivity().getApplication());
        Gridview.setExpanded(true);
        Gridview.setAdapter(GridViewAdapter);
        return view;
    }

}
