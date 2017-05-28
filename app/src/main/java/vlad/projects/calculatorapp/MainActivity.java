package vlad.projects.calculatorapp;

import android.content.DialogInterface;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private double FirstNum;
    private double SecondNum;
    private double FinalValue;
    private double Symbol;
    private double Percent;
    private int counter;
    private TextView result;
    private String toDo;
    private  boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        result = (TextView) findViewById(R.id.textView);

        Button num0 = (Button) findViewById(R.id.num0);
        num0.setOnClickListener(this);
        Button num1 = (Button) findViewById(R.id.num1);
        num1.setOnClickListener(this);
        Button num2 = (Button) findViewById(R.id.num2);
        num2.setOnClickListener(this);
        Button num3 = (Button) findViewById(R.id.num3);
        num3.setOnClickListener(this);
        Button num4 = (Button) findViewById(R.id.num4);
        num4.setOnClickListener(this);
        Button num5 = (Button) findViewById(R.id.num5);
        num5.setOnClickListener(this);
        Button num6 = (Button) findViewById(R.id.num6);
        num6.setOnClickListener(this);
        Button num7 = (Button) findViewById(R.id.num7);
        num7.setOnClickListener(this);
        Button num8 = (Button) findViewById(R.id.num8);
        num8.setOnClickListener(this);
        Button num9 = (Button) findViewById(R.id.num9);
        num9.setOnClickListener(this);
        Button dot = (Button) findViewById(R.id.dot);
        dot.setOnClickListener(this);
        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(this);
        Button minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(this);
        Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(this);
        Button ac = (Button) findViewById(R.id.ac);
        ac.setOnClickListener(this);
        Button symbol = (Button) findViewById(R.id.symbol);
        symbol.setOnClickListener(this);
        Button mult = (Button) findViewById(R.id.mult);
        mult.setOnClickListener(this);
        Button div = (Button) findViewById(R.id.divided);
        div.setOnClickListener(this);
        Button per = (Button) findViewById(R.id.percent);
        per.setOnClickListener(this);
        Button c = (Button) findViewById(R.id.c);
        c.setOnClickListener(this);

        result.setText("0");
        toDo = "start";
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.num0:
                if(flag == false && counter == 0) {
                    result.append("0");
                    break;
                }else{
                    result.setText("");
                    result.append("0");
                    flag=false;
                    counter = 1;
                    break;
                }
            case R.id.num1:
                if(flag == false) {
                    result.append("1");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("1");
                    flag=false;
                    break;
                }
            case R.id.num2:
                if(flag == false) {
                    result.append("2");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("2");
                    flag=false;
                    break;
                }
            case R.id.num3:
                if(flag == false) {
                    result.append("3");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("3");
                    flag=false;
                    break;
                }
            case R.id.num4:
                if(flag == false) {
                    result.append("4");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("4");
                    flag=false;
                    break;
                }
            case R.id.num5:
                if(flag == false) {
                    result.append("5");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("5");
                    flag=false;
                    break;
                }
            case R.id.num6:
                if(flag == false) {
                    result.append("6");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("6");
                    flag=false;
                    break;
                }
            case R.id.num7:
                if(flag == false) {
                    result.append("7");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("7");
                    flag=false;
                    break;
                }
            case R.id.num8:
                if(flag == false) {
                    result.append("8");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("8");
                    flag=false;
                    break;
                }
            case R.id.num9:
                if(flag == false) {
                    result.append("9");
                    counter = 0;
                    break;
                }else{
                    result.setText("");
                    result.append("9");
                    flag=false;
                    break;
                }
            case R.id.dot:
                if(flag == false && !result.getText().toString().contains(".")) {
                    result.append(".");
                    counter = 0;
                }else if(!result.getText().toString().contains(".")){
                    result.setText("");
                    result.append(".");
                    flag=false;
                }
                break;
            case R.id.symbol:
                if(Double.valueOf(result.getText().toString()) != 0){
                    Symbol  = Double.valueOf(result.getText().toString());
                    Symbol *= (-1);
                    result.setText(""+Symbol);}
                break;
            case R.id.percent:
                Percent  = Double.valueOf(result.getText().toString());
                Percent /= 100;
                result.setText(""+Percent);
                break;
            case R.id.plus:
                switch (toDo){
                    case "start":
                        FirstNum = Double.valueOf(result.getText().toString());
                        result.setText(""+FirstNum);
                        flag = true;
                        toDo = "plus";
                        break;
                    case "plus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum + SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "plus";
                        break;
                    case "minus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum - SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "plus";
                        break;
                    case "mult":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum * SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "plus";
                        break;
                    case "div":
                        SecondNum = Double.valueOf(result.getText().toString());
                        if(SecondNum == 0) {
                            AlertDialog.Builder builder1;
                            builder1 = new AlertDialog.Builder(this);
                            builder1.setMessage("Dividing by ZERO. Start from the beginning.");
                            builder1.setCancelable(true);
                            builder1.setPositiveButton(
                                    "OK",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });

                            FirstNum = 0;
                            SecondNum = 0;
                            FinalValue = 0;
                            result.setText("0");
                            toDo = "start";
                            flag = true;

                            AlertDialog alert11 = builder1.create();
                            alert11.show();
                        }else {
                            FinalValue = FirstNum / SecondNum;
                            result.setText("" + FinalValue);
                            FirstNum = FinalValue;
                            flag = true;
                            toDo = "plus";
                        }
                        break;
                }
                break;
            case R.id.minus:
                switch (toDo){
                    case "start":
                        FirstNum = Double.valueOf(result.getText().toString());
                        result.setText(""+FirstNum);
                        flag = true;
                        toDo = "minus";
                        break;
                    case "plus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum + SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "minus";
                        break;
                    case "minus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum - SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "minus";
                        break;
                    case "mult":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum * SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "minus";
                        break;
                    case "div":
                        SecondNum = Double.valueOf(result.getText().toString());
                        if(SecondNum == 0) {
                            AlertDialog.Builder builder1;
                            builder1 = new AlertDialog.Builder(this);
                            builder1.setMessage("Dividing by ZERO. Start from the beginning.");
                            builder1.setCancelable(true);
                            builder1.setPositiveButton(
                                    "OK",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });

                            FirstNum = 0;
                            SecondNum = 0;
                            FinalValue = 0;
                            result.setText("0");
                            toDo = "start";
                            flag = true;

                            AlertDialog alert11 = builder1.create();
                            alert11.show();
                        }else {
                            FinalValue = FirstNum / SecondNum;
                            result.setText("" + FinalValue);
                            FirstNum = FinalValue;
                            flag = true;
                            toDo = "minus";
                        }
                        break;
                }
                break;
            case R.id.mult:
                switch (toDo){
                    case "start":
                        FirstNum = Double.valueOf(result.getText().toString());
                        result.setText(""+FirstNum);
                        flag = true;
                        toDo = "mult";
                        break;
                    case "plus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum + SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "mult";
                        break;
                    case "minus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum - SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "mult";
                        break;
                    case "mult":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum * SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "mult";
                        break;
                    case "div":
                        SecondNum = Double.valueOf(result.getText().toString());
                        if(SecondNum == 0) {
                            AlertDialog.Builder builder1;
                            builder1 = new AlertDialog.Builder(this);
                            builder1.setMessage("Dividing by ZERO. Start from the beginning.");
                            builder1.setCancelable(true);
                            builder1.setPositiveButton(
                                    "OK",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });

                            FirstNum = 0;
                            SecondNum = 0;
                            FinalValue = 0;
                            result.setText("0");
                            toDo = "start";
                            flag = true;

                            AlertDialog alert11 = builder1.create();
                            alert11.show();
                        }else {
                            FinalValue = FirstNum / SecondNum;
                            result.setText("" + FinalValue);
                            FirstNum = FinalValue;
                            flag = true;
                            toDo = "mult";
                        }
                        break;
                }
                break;
            case R.id.divided:
                switch (toDo){
                    case "start":
                        FirstNum = Double.valueOf(result.getText().toString());
                        result.setText(""+FirstNum);
                        flag = true;
                        toDo = "div";
                        break;
                    case "plus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum + SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "div";
                        break;
                    case "minus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum - SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "div";
                        break;
                    case "mult":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum * SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = FinalValue;
                        flag = true;
                        toDo = "div";
                        break;
                    case "div":
                        SecondNum = Double.valueOf(result.getText().toString());
                        if(SecondNum == 0) {
                            AlertDialog.Builder builder1;
                            builder1 = new AlertDialog.Builder(this);
                            builder1.setMessage("Dividing by ZERO. Start from the beginning.");
                            builder1.setCancelable(true);
                            builder1.setPositiveButton(
                                    "OK",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });

                            FirstNum = 0;
                            SecondNum = 0;
                            FinalValue = 0;
                            result.setText("0");
                            toDo = "start";
                            flag = true;

                            AlertDialog alert11 = builder1.create();
                            alert11.show();
                        }else {
                            FinalValue = FirstNum / SecondNum;
                            result.setText("" + FinalValue);
                            FirstNum = FinalValue;
                            flag = true;
                            toDo = "div";
                        }
                        break;
                }
                break;
            case R.id.ac:
                FirstNum = 0;
                SecondNum = 0;
                FinalValue = 0;
                result.setText("0");
                toDo = "start";
                flag = true;
                break;
            case R.id.c:
                result.setText("0");
                flag = true;
                break;
            case R.id.equal:
                switch (toDo){
                    case "plus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum + SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = SecondNum = 0;
                        toDo = "start";
                        flag = true;
                        break;
                    case "minus":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum - SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = SecondNum = 0;
                        flag = true;
                        toDo = "start";
                        break;
                    case "mult":
                        SecondNum = Double.valueOf(result.getText().toString());
                        FinalValue = FirstNum * SecondNum;
                        result.setText(""+FinalValue);
                        FirstNum = SecondNum = 0;
                        flag = true;
                        toDo = "start";
                        break;
                    case "div":
                        SecondNum = Double.valueOf(result.getText().toString());
                        if(SecondNum == 0){
                            AlertDialog.Builder builder1;
                            builder1 = new AlertDialog.Builder(this);
                            builder1.setMessage("Dividing by ZERO. Start from the beginning.");
                            builder1.setCancelable(true);
                            builder1.setPositiveButton(
                                    "OK",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });

                            FirstNum = 0;
                            SecondNum = 0;
                            FinalValue = 0;
                            result.setText("0");
                            toDo = "start";
                            flag = true;

                            AlertDialog alert11 = builder1.create();
                            alert11.show();
                        }else{
                            FinalValue = FirstNum / SecondNum;
                            result.setText(""+FinalValue);
                            FirstNum = SecondNum = 0;
                            flag = true;
                            toDo = "start";
                        }
                        break;
                }
                break;
        }
    }
}
