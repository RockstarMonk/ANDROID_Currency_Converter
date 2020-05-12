package com.myapp.shashwat.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickUSDtoINR(View view){

        EditText dollarText = findViewById(R.id.dollarText);
        Log.i("Info1", "USD to INR !");
        Log.i("USD amount", dollarText.getText().toString());
        String usdamt = dollarText.getText().toString();
        Double usddouble = Double.parseDouble(usdamt);
        usddouble = usddouble * 75.93;
        String usdtors = String.format("%.2f", usddouble);
        Log.i("INR amount", usdtors);
        Toast.makeText(this, "$ " + dollarText.getText().toString() + " = Rs " + usdtors, Toast.LENGTH_LONG).show();

    }

    public void clickINRtoUSD(View view){

        EditText rupeesText = findViewById(R.id.rupeesText);
        Log.i("Info2", "INR to USD !");
        Log.i("INR amount", rupeesText.getText().toString());
        String rpsamt = rupeesText.getText().toString();
        Double rpsdouble = Double.parseDouble(rpsamt);
        rpsdouble = rpsdouble * 0.013;
        String rstousd = String.format("%.2f", rpsdouble);
        Log.i("USD amount", rstousd);
        Toast.makeText(this, "Rs " + rupeesText.getText().toString() + " = $ " + rstousd, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
