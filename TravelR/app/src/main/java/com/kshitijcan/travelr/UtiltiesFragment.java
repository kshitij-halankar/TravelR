package com.kshitijcan.travelr;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UtiltiesFragment} factory method to
 * create an instance of this fragment.
 */
public class UtiltiesFragment extends Fragment {

    //    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public UtiltiesFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment UtiltiesFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static UtiltiesFragment newInstance(String param1, String param2) {
//        UtiltiesFragment fragment = new UtiltiesFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
    private ImageButton menu, worldMap, worldClock, travelTips, travelJournal, currencyConvertor, weightConvertor, distanceConvertor, volumeConvertor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_utilties, container, false);

        worldMap=view.findViewById(R.id.worldmapbutton);
        worldMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        worldClock=view.findViewById(R.id.worldclockbutton);
        worldClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),WorldClock.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        travelTips=view.findViewById(R.id.traveltipsbutton);
        travelTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),TravelTips.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        travelJournal=view.findViewById(R.id.journalbutton);
        travelJournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),TravelJournal.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        currencyConvertor=view.findViewById(R.id.currencybutton);
        currencyConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),CurrencyConvertor.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        weightConvertor=view.findViewById(R.id.weightbutton);
        weightConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),WeightConvertor.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        distanceConvertor=view.findViewById(R.id.distancebutton);
        distanceConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DistanceConvertor.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        volumeConvertor=view.findViewById(R.id.volumebutton);
        volumeConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),VolumeConvertor.class);
//                intent.putExtra("somedata","somedata");
                startActivity(intent);
            }
        });

        return view;
    }
}