package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.kshitijcan.travelr.databinding.ActivityMainBinding;
import com.kshitijcan.travelr.databinding.ActivityWeightConvertorBinding;

import java.util.ArrayList;
import java.util.List;

public class WeightConvertor extends AppCompatActivity {

    ActivityWeightConvertorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWeightConvertorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_weight_convertor);
        List<String> weightConvertTypes = new ArrayList<>();
        weightConvertTypes.add("Grams to Carats");
        weightConvertTypes.add("Carats to Grams");
        weightConvertTypes.add("Grams to Kilograms");
        weightConvertTypes.add("Kilograms to Grams");
        weightConvertTypes.add("Grams to Ounces");
        weightConvertTypes.add("Ounces to Grams");
        weightConvertTypes.add("Grams to Pounds");
        weightConvertTypes.add("Pounds to Grams");
        weightConvertTypes.add("Tons to Kilograms");
        weightConvertTypes.add("Kilograms to Tons");
        weightConvertTypes.add("Tons to Pounds");
        weightConvertTypes.add("Pounds to Tons");
        weightConvertTypes.add("Kilograms to Pounds");
        weightConvertTypes.add("Pounds to Kilograms");
        weightConvertTypes.add("Ounces to Pounds");
        weightConvertTypes.add("Pounds to Ounces");
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.list_item,weightConvertTypes);
        binding.weightconverttype.setAdapter(adapter);
    }

    public void weightConvert(View v){
        EditText weight=(EditText) findViewById(R.id.inputweight);
//        EditText convertType=(EditText) findViewById(R.id.inputweight);
        TextView convertedWeight=(TextView) findViewById(R.id.weightoutput);
        AutoCompleteTextView convertType=(AutoCompleteTextView) findViewById(R.id.weightconverttype);
//        convertedWeight.setText(convert(Double.parseDouble(weight.getText().toString()),"Kilograms to Grams"));
        convertedWeight.setText(convert(Double.parseDouble(weight.getText().toString()),convertType.getText().toString()));
    }

    private String convert(double weight, String convertType){
        String convertedWeight="";
        System.out.println(" Inside "+convertType);
        switch(convertType){
            case "Grams to Carats":
                convertedWeight=gramToCarat(weight)+" Ct";
                break;
            case "Carats to Grams":
                convertedWeight=caratToGram(weight)+" gm";
                break;
            case "Grams to Kilograms":
                convertedWeight=gramToKg(weight)+" kg";
                break;
            case "Kilograms to Grams":
                convertedWeight=kgToGram(weight)+" gm";
                break;
            case "Grams to Ounces":
                convertedWeight=gramToOunce(weight)+" oz";
                break;
            case "Ounces to Grams":
                convertedWeight=ounceToGram(weight)+" gm";
                break;
            case "Grams to Pounds":
                convertedWeight=gramToPound(weight)+" lb";
                break;
            case "Pounds to Grams":
                convertedWeight=poundToGram(weight)+" gm";
                break;
            case "Tons to Kilograms":
                convertedWeight=tontoKg(weight)+" kg";
                break;
            case "Kilograms to Tons":
                convertedWeight=kgtoTon(weight)+" t";
                break;
            case "Tons to Pounds":
                convertedWeight=tontoPound(weight)+" lb";
                break;
            case "Pounds to Tons":
                convertedWeight=poundtoTon(weight)+" t";
                break;
            case "Kilograms to Pounds":
                convertedWeight=kgtoPound(weight)+" lb";
                break;
            case "Pounds to Kilograms":
                convertedWeight=poundtoKg(weight)+" kg";
                break;
            case "Ounces to Pounds":
                convertedWeight=ouncetoPound(weight)+" lb";
                break;
            case "Pounds to Ounces":
                convertedWeight=poundtoOunce(weight)+" oz";
                break;
        }
        return convertedWeight;
    }

    private double gramToCarat(double weight){
        return (weight * 5);
    }

    private double caratToGram(double weight){
        return (weight * 0.2);
    }

    private double gramToKg(double weight){
        return (weight * 0.001);
    }

    private double kgToGram(double weight){
        return (weight * 1000);
    }

    private double gramToOunce(double weight){
        return (weight * 0.035274);
    }

    private double ounceToGram(double weight){
        return (weight * 28.349523);
    }

    private double gramToPound(double weight){
        return (weight * 0.002205);
    }

    private double poundToGram(double weight){
        return (weight * 453.59237);
    }

    private double tontoKg(double weight){
        return (weight * 907.18474);
    }

    private double kgtoTon(double weight){
        return (weight * 0.001102);
    }

    private double tontoPound(double weight){
        return (weight * 2000);
    }

    private double poundtoTon(double weight){
        return (weight * 0.0005);
    }

    private double kgtoPound(double weight){
        return (weight * 2.204623);
    }

    private double poundtoKg(double weight){
        return (weight * 0.453592);
    }

    private double ouncetoPound(double weight){
        return (weight * 0.0625);
    }

    private double poundtoOunce(double weight){
        return (weight * 16);
    }

}