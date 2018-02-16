package com.webmarke8.app.gencart.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webmarke8.app.gencart.Adapters.StoreRecyclerViewAdapter;
import com.webmarke8.app.gencart.Objects.Store;
import com.webmarke8.app.gencart.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class StoreFragment extends Fragment {


    RecyclerView rvAllCategories;
    private RecyclerView.Adapter mAdapter;
    List<Store> StoreList;

    public StoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_store, container, false);
        rvAllCategories = view.findViewById(R.id.rv);

        RecyclerView.LayoutManager mLayoutManager;
        mLayoutManager = new LinearLayoutManager(getActivity());
        rvAllCategories.setLayoutManager(mLayoutManager);
        LinearLayoutManager linearLayoutManage  = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rvAllCategories.setHasFixedSize(true);
        mAdapter = new StoreRecyclerViewAdapter(getActivity(), StoreList);
        rvAllCategories.setAdapter(mAdapter);
        return view;


    }

}
