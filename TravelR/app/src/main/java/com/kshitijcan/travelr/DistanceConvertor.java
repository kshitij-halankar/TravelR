package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.kshitijcan.travelr.databinding.ActivityDistanceConvertorBinding;

import java.util.ArrayList;
import java.util.List;

public class DistanceConvertor extends AppCompatActivity {

    ActivityDistanceConvertorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_distance_convertor);
        binding=ActivityDistanceConvertorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        List<String> convertTypes=new ArrayList<>();
        convertTypes.add("Mile to Kilometer");
        convertTypes.add("Meter to Centimeter");
        convertTypes.add("Meter to Millimeter");
        convertTypes.add("Meter to Kilometer");
        convertTypes.add("Meter to Foot");
        convertTypes.add("Meter to Inch");
        convertTypes.add("Meter to Yard");
        convertTypes.add("Centimeter to Meter");
        convertTypes.add("Centimeter to Millimeter");
        convertTypes.add("Centimeter to Inch");
        convertTypes.add("Millimeter to Centimeter");
        convertTypes.add("Inch to Centimeter");
        convertTypes.add("Kilometer to Meter");
        convertTypes.add("Kilometer to Centimeter");
        convertTypes.add("Kilometer to Millimeter");
        convertTypes.add("Kilometer to Foot");
        convertTypes.add("Kilometer to Inch");
        convertTypes.add("Kilometer to Yard");
        convertTypes.add("Kilometer to Mile");
        convertTypes.add("Foot to Meter");
        convertTypes.add("Foot to Centimeter");
        convertTypes.add("Foot to Inch");
        convertTypes.add("Foot to Yard");
        convertTypes.add("Inch to Centimeter");
        convertTypes.add("Inch to Foot");
        convertTypes.add("Inch to Yard");
        convertTypes.add("Yard to Meter");
        convertTypes.add("Yard to Mile");
        convertTypes.add("Yard to Foot");
        convertTypes.add("Mile to Yard");
        convertTypes.add("Mile to Foot");
        convertTypes.add("Yard to Inch");
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.list_item,convertTypes);
        binding.distanceconverttype.setAdapter(adapter);
    }

    public void distanceConvert(View v){
        EditText distance=(EditText) findViewById(R.id.distanceinput);
        TextView convertedDistance=(TextView) findViewById(R.id.distanceoutput);
        AutoCompleteTextView convertType=(AutoCompleteTextView) findViewById(R.id.distanceconverttype);
        convertedDistance.setText(convert(Double.parseDouble(distance.getText().toString()),convertType.getText().toString()));
    }

    private String convert(double distance, String convertType){
        String convertedDistance="";
        switch(convertType){
            case "Mile to Kilometer" : convertedDistance= (distance * 1.60926939169 )+ " km"; break;
            case "Meter to Centimeter" : convertedDistance= (distance * 100 )+ " cm"; break;
            case "Meter to Millimeter" : convertedDistance= (distance * 1000 )+ " mm"; break;
            case "Meter to Kilometer"        : convertedDistance= (distance * 0.001 )+ " km"; break;
            case "Meter to Foot"             : convertedDistance= (distance * 3.2808399 )+ " ft"; break;
            case "Meter to Inch"             : convertedDistance= (distance * 39.3700787 )+ " in"; break;
            case "Meter to Yard"             : convertedDistance= (distance * 1.0936133 )+ " yd"; break;
            case "Centimeter to Meter"       : convertedDistance= (distance * 0.01 )+ " m"; break;
            case "Centimeter to Millimeter"  : convertedDistance= (distance * 10 )+ " mm"; break;
            case "Centimeter to Inch"        : convertedDistance= (distance * 0.393700787 )+ " in"; break;
            case "Millimeter to Centimeter"  : convertedDistance= (distance * 0.1 )+ " cm"; break;
            case "Inch to Centimeter"        : convertedDistance= (distance * 2.54 )+ " cm"; break;
            case "Kilometer to Meter"        : convertedDistance= (distance * 1000 )+ " m"; break;
            case "Kilometer to Centimeter"   : convertedDistance= (distance * 100000 )+ " cm"; break;
            case "Kilometer to Millimeter"   : convertedDistance= (distance * 1000000 )+ " mm"; break;
            case "Kilometer to Foot"         : convertedDistance= (distance * 3280.8399 )+ " ft"; break;
            case "Kilometer to Inch"         : convertedDistance= (distance * 39370.0787 )+ " in"; break;
            case "Kilometer to Yard"         : convertedDistance= (distance * 1093.6133 )+ " yd"; break;
            case "Kilometer to Mile"         : convertedDistance= (distance * 0.6214 )+ " mi"; break;
            case "Foot to Meter"             : convertedDistance= (distance * 0.3047999 )+ " m"; break;
            case "Foot to Centimeter"        : convertedDistance= (distance * 30.47999 )+ " cm"; break;
            case "Foot to Inch"              : convertedDistance= (distance * 12 )+ " in"; break;
            case "Foot to Yard"              : convertedDistance= (distance * 0.33333 )+ " yd"; break;
            case "Yard to Foot"              : convertedDistance= (distance * 3 )+ " ft"; break;
            case "Inch to Foot"              : convertedDistance= (distance * 0.0833333 )+ " ft"; break;
            case "Yard to Meter"             : convertedDistance= (distance * 0.9143999 )+ " m"; break;
            case "Yard to Mile"              : convertedDistance= (distance * 0.00005682 )+ " mi"; break;
            case "Yard to inch"              : convertedDistance= (distance * 36 )+ " in"; break;
            case "Mile to Yard"              : convertedDistance= (distance * 1759.91841 )+ " yd"; break;
            case "Mile to Foot"               : convertedDistance= (distance * 5279.75523 )+ " ft"; break;
        }
        return convertedDistance;
    }
}