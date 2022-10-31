package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.kshitijcan.travelr.databinding.ActivityCurrencyConvertorBinding;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConvertor extends AppCompatActivity {

    ActivityCurrencyConvertorBinding binding;
    String convertedAmount="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCurrencyConvertorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        List<String> currencyList = new ArrayList<>();

        currencyList.add("AFN"); currencyList.add("ALL"); currencyList.add("AMD"); currencyList.add("ANG"); currencyList.add("AOA"); currencyList.add("ARS"); currencyList.add("AUD"); currencyList.add("AWG"); currencyList.add("AZN"); currencyList.add("BAM"); currencyList.add("BBD"); currencyList.add("BDT"); currencyList.add("BGN"); currencyList.add("BHD"); currencyList.add("BIF"); currencyList.add("BMD"); currencyList.add("BND"); currencyList.add("BOB"); currencyList.add("BRL"); currencyList.add("BSD"); currencyList.add("BTN"); currencyList.add("BWP"); currencyList.add("BYR"); currencyList.add("BZD"); currencyList.add("CAD"); currencyList.add("CDF"); currencyList.add("CHF"); currencyList.add("CLP"); currencyList.add("CNY"); currencyList.add("COP"); currencyList.add("CRC"); currencyList.add("CUP"); currencyList.add("CVE"); currencyList.add("CZK"); currencyList.add("DJF"); currencyList.add("DKK"); currencyList.add("DOP"); currencyList.add("DZD"); currencyList.add("ECS"); currencyList.add("EGP"); currencyList.add("ERN"); currencyList.add("ETB"); currencyList.add("EUR"); currencyList.add("FJD"); currencyList.add("FKP"); currencyList.add("GBP"); currencyList.add("GEL"); currencyList.add("GGP"); currencyList.add("GHS"); currencyList.add("GIP"); currencyList.add("GMD"); currencyList.add("GNF"); currencyList.add("GWP"); currencyList.add("GYD"); currencyList.add("HKD"); currencyList.add("HNL"); currencyList.add("HRK"); currencyList.add("HTG"); currencyList.add("HUF"); currencyList.add("IDR"); currencyList.add("ILS"); currencyList.add("INR"); currencyList.add("IQD"); currencyList.add("IRR"); currencyList.add("ISK"); currencyList.add("JMD"); currencyList.add("JOD"); currencyList.add("JPY"); currencyList.add("KES"); currencyList.add("KGS"); currencyList.add("KHR"); currencyList.add("KMF"); currencyList.add("KPW"); currencyList.add("KRW"); currencyList.add("KWD"); currencyList.add("KYD"); currencyList.add("KZT"); currencyList.add("LAK"); currencyList.add("LBP"); currencyList.add("LKR"); currencyList.add("LRD"); currencyList.add("LSL"); currencyList.add("LTL"); currencyList.add("LVL"); currencyList.add("LYD"); currencyList.add("MAD"); currencyList.add("MDL"); currencyList.add("MGF"); currencyList.add("MKD"); currencyList.add("MMK"); currencyList.add("MNT"); currencyList.add("MOP"); currencyList.add("MRO"); currencyList.add("MUR"); currencyList.add("MVR"); currencyList.add("MWK"); currencyList.add("MXN"); currencyList.add("MYR"); currencyList.add("MZN"); currencyList.add("NAD"); currencyList.add("NGN"); currencyList.add("NIO"); currencyList.add("NOK"); currencyList.add("NPR"); currencyList.add("NZD"); currencyList.add("OMR"); currencyList.add("PAB"); currencyList.add("PEN"); currencyList.add("PGK"); currencyList.add("PHP"); currencyList.add("PKR"); currencyList.add("PLN"); currencyList.add("PYG"); currencyList.add("QAR"); currencyList.add("QTQ"); currencyList.add("RON"); currencyList.add("RSD"); currencyList.add("RUB"); currencyList.add("RWF"); currencyList.add("SAR"); currencyList.add("SBD"); currencyList.add("SCR"); currencyList.add("SDG"); currencyList.add("SEK"); currencyList.add("SGD"); currencyList.add("SHP"); currencyList.add("SLL"); currencyList.add("SOS"); currencyList.add("SRD"); currencyList.add("SSP"); currencyList.add("STD"); currencyList.add("SVC"); currencyList.add("SYP"); currencyList.add("SZL"); currencyList.add("THB"); currencyList.add("TJS"); currencyList.add("TMT"); currencyList.add("TND"); currencyList.add("TOP"); currencyList.add("TRY"); currencyList.add("TTD"); currencyList.add("TWD"); currencyList.add("TZS"); currencyList.add("UAH"); currencyList.add("UGX"); currencyList.add("USD"); currencyList.add("UYU"); currencyList.add("UZS"); currencyList.add("VEF"); currencyList.add("VND"); currencyList.add("VUV"); currencyList.add("WST"); currencyList.add("XAF"); currencyList.add("XCD"); currencyList.add("XOF"); currencyList.add("XPF"); currencyList.add("YER"); currencyList.add("ZAR"); currencyList.add("ZMW"); currencyList.add("ZWD");

        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.list_item, currencyList);
        binding.firstcurrencytype.setAdapter(adapter);
        binding.secondcurrencytype.setAdapter(adapter);
//        setContentView(R.layout.activity_currency_convertor);
    }

    public void convertCurrency(View v){
        EditText amount=(EditText) findViewById(R.id.currencyinput);
        TextView convertedAmount=(TextView) findViewById(R.id.currencyoutput);
        AutoCompleteTextView convertFrom=(AutoCompleteTextView) findViewById(R.id.firstcurrencytype);
        AutoCompleteTextView convertTo=(AutoCompleteTextView) findViewById(R.id.secondcurrencytype);
        convertedAmount.setText(convert(Double.parseDouble(amount.getText().toString()), convertFrom.getText().toString(), convertTo.getText().toString()));
    }

    public String convert(double amount, String convertFrom, String convertTo){

        String apiKey="51f92fa82e8e39f7cb85";
        String conversion=convertFrom + "_" + convertTo;
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String currencyURL="https://free.currconv.com/api/v7/convert?q=" + conversion + "&compact=ultra&apiKey=" + apiKey;
        StringRequest request=new StringRequest(Request.Method.GET, currencyURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONObject job = null;
                try {
                    job = new JSONObject(response);
                    Double exchangeRate = (Double) job.get(conversion);
                    convertedAmount = "" + (exchangeRate * amount);
                    System.out.println(convertedAmount);
                    Log.d("TravelR : ",convertedAmount);
                } catch (Exception ex) {
                    Log.d("TravelR : ", ex.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);
        return convertedAmount;
    }
}