package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WeightConvertor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_convertor);
    }

    public void weightConvert(View v){
        EditText weight=(EditText) findViewById(R.id.inputweight);
//        EditText convertType=(EditText) findViewById(R.id.inputweight);
        TextView convertedWeight=(TextView) findViewById(R.id.weightoutput);
        convertedWeight.setText(convert(Double.parseDouble(weight.getText().toString()),"Kilograms to Grams"));
    }

    private String convert(double weight, String convertType){
        String convertedWeight="";
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