package com.aleksandrP.mycalk.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bMinus;
    Button bPlus;
    Button bResult;

    EditText display;

    int firstValue = 0;
    String operation = "+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bPlus = (Button) findViewById(R.id.bPluc);
        bMinus = (Button) findViewById(R.id.bMinus);
        bResult = (Button) findViewById(R.id.bResult);

        display = (EditText) findViewById(R.id.editText);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bResult.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b0:
                display.setText(display.getText() + "0");
                break;
            case R.id.b1:
                display.setText(display.getText() + "1");
                break;
            case R.id.b2:
                display.setText(display.getText() + "2");
                break;
            case R.id.b3:
                display.setText(display.getText() + "3");
                break;
            case R.id.b4:
                display.setText(display.getText() + "4");
                break;
            case R.id.b5:
                display.setText(display.getText() + "5");
                break;
            case R.id.b6:
                display.setText(display.getText() + "6");
                break;
            case R.id.b7:
                display.setText(display.getText() + "7");
                break;
            case R.id.b8:
                display.setText(display.getText() + "8");
                break;
            case R.id.b9:
                display.setText(display.getText() + "9");
                break;
            case R.id.bPluc:
                firstValue = Integer.valueOf(String.valueOf(display.getText()));
                display.setText("");
                operation = "+";
            case R.id.bMinus:
                firstValue = Integer.valueOf(String.valueOf(display.getText()));
                display.setText("");
                operation = "-";
            case R.id.bResult:
                int secondValue = Integer.valueOf(String.valueOf(display.getText()));
                if("+".equals(operation)){
                    display.setText((firstValue+secondValue)+"");
                }
                if("-".equals(operation)){
                    display.setText((firstValue-secondValue)+"");
                }
                firstValue = 0;
                operation = "+";

        }
    }
}
