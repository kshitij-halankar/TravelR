package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.kshitijcan.travelr.databinding.ActivityVolumeConvertorBinding;

import java.util.ArrayList;
import java.util.List;

public class VolumeConvertor extends AppCompatActivity {

    ActivityVolumeConvertorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityVolumeConvertorBinding.inflate(getLayoutInflater());
//        setContentView(R.layout.activity_volume_convertor);
        setContentView(binding.getRoot());

        List<String> convertTypes=new ArrayList<>();
        convertTypes.add("Liter to Milliliter");
        convertTypes.add("Liter to UK Gallon");
        convertTypes.add("Liter to US Gallon");
        convertTypes.add("Milliliter to US Ounce");
        convertTypes.add("Milliliter to UK Ounce");
        convertTypes.add("UK Gallon to Liter");
        convertTypes.add("US Gallon to Liter");
        convertTypes.add("UK Gallon to UK Ounce");
        convertTypes.add("UK Gallon to US Ounce");
        convertTypes.add("UK Gallon to US Gallon");
        convertTypes.add("US Gallon to UK Gallon");
        convertTypes.add("US Gallon to US Ounce");
        convertTypes.add("US Gallon to UK Ounce");
        convertTypes.add("UK Ounce to Milliliter");
        convertTypes.add("UK Ounce to US Ounce");
        convertTypes.add("US Ounce to Milliliter");
        convertTypes.add("US Ounce to UK Ounce");
        convertTypes.add("Liter to UK Ounce");
        convertTypes.add("Liter to US Ounce");

        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.list_item, convertTypes);
        binding.volumeconverttype.setAdapter(adapter);
    }

    public void convertVolume(View v){
        EditText volume=(EditText) findViewById(R.id.volumeinput);
        TextView convertedVolume=(TextView) findViewById(R.id.volumeoutput);
        AutoCompleteTextView convertType=(AutoCompleteTextView) findViewById(R.id.volumeconverttype);
        convertedVolume.setText(convert(Double.parseDouble(volume.getText().toString()),convertType.getText().toString()));
    }

    private String convert(Double volume, String convertType){
        String convertedVolume="";
        switch(convertType){
            case "Liter to Milliliter": convertedVolume=(volume * 1000) + " ml"; break;
            case "Liter to UK Gallon": convertedVolume=(volume * 0.21996) + " UK gal"; break;
            case "Liter to US Gallon": convertedVolume=(volume * 0.26417) + " US gal"; break;
            case "Milliliter to US Ounce": convertedVolume=(volume * 0.034164) + " US oz"; break;
            case "Milliliter to UK Ounce": convertedVolume=(volume * 0.035198) + " UK oz"; break;
            case "UK Gallon to Liter": convertedVolume=(volume * 4.54609) + " ltr"; break;
            case "US Gallon to Liter": convertedVolume=(volume * 3.78541) + " ltr"; break;
            case "UK Gallon to UK Ounce": convertedVolume=(volume * 160.01731) + " UK oz"; break;
            case "UK Gallon to US Ounce": convertedVolume=(volume * 155.31574) + " US oz"; break;
            case "UK Gallon to US Gallon": convertedVolume=(volume * 1.20095) + " US gal"; break;
            case "US Gallon to UK Gallon": convertedVolume=(volume * 0.83267) + " UK gal"; break;
            case "US Gallon to US Ounce": convertedVolume=(volume * 129.32735) + " US oz"; break;
            case "US Gallon to UK Ounce": convertedVolume=(volume * 133.24224) + " UK oz"; break;
            case "UK Ounce to Milliliter": convertedVolume=(volume * 28.41) + " ml"; break;
            case "UK Ounce to US Ounce": convertedVolume=(volume * 0.97061) + " US oz"; break;
            case "US Ounce to Milliliter": convertedVolume=(volume * 29.27) + " ml"; break;
            case "US Ounce to UK Ounce": convertedVolume=(volume * 1.03027) + " UK oz"; break;
            case "Liter to UK Ounce": convertedVolume=(volume * 35.19887) + " UK oz"; break;
            case "Liter to US Ounce": convertedVolume=(volume * 34.16467) + " US oz"; break;
        }
        return convertedVolume;
    }
}