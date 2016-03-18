package com.example.mac.buttontext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private int num = 0;
    private int money = 10;
    private StringBuilder priceMessage=new StringBuilder(money);
    private int total=num*money;
    private String name="馬種桶";
    private StringBuilder orderMessage=new StringBuilder();

    // StringBuilder pricmessage=new StringBuilder(money);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void submitorder(View v) {
        ++num;
        total=num*money;
        nummethod();
        moneymethod();
    }
    public void submitorder2(View v) {
        --num;
        total = num * money;
        nummethod();
        moneymethod();
    }
    public void reset(View v){
num=0;
        total = num * money;
        nummethod();
        moneymethod();


    }

    private void nummethod() {
        TextView number = (TextView) findViewById(R.id.textid);
        number.setText(String.valueOf(num));
    }
    private void moneymethod() {
        TextView number2 = (TextView) findViewById(R.id.moneynumber);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        number2.setText(nf.format(total));
    }

    public void clickTopping(View view){



        concatPriceMessage();
        displayPriceMessage();

    }

    private void concatPriceMessage(){

        CheckBox checkBox=(CheckBox)findViewById(R.id.check_box);
        //priceMessage.append("Name")
                /*
                .append(name)
                .append("\n")
                .append("幾普賽")
                .append("\n")
                .append("加屎？")
                .append("\n")
                .append(total)
                */
                checkBox.isChecked();
    }

    private void displayPriceMessage(){
        orderMessage.append("Name")
                .append(name)
                .append("\n")
                .append("幾普賽")
                .append("\n")
                .append("加屎？")
                .append("\n")
                .append(total);
    }

    public void order(View view){
        TextView message = (TextView) findViewById(R.id.shoppingmessage);
        message.setText(orderMessage);
    }
    }








