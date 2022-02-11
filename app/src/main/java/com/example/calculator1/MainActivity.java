package com.example.calculator1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvScet, tvResult;
    Button btnClear, btnRavn, btnDel, btnUmn, btnPl, btnMin, btnZap, btn00, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String scet, res;
    Boolean zap, oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scet = "";
        res = "";
        zap = false;
        oper = false;

        btnClear = findViewById(R.id.btnClear);
        btnRavn = findViewById(R.id.btnRavn);
        btnDel = findViewById(R.id.btnDel);
        btnUmn = findViewById(R.id.btnUmn);
        btnPl = findViewById(R.id.btnPl);
        btnMin = findViewById(R.id.btnMin);
        btnZap = findViewById(R.id.btnZap);

        tvScet = findViewById(R.id.tvScet);
        tvResult = findViewById(R.id.tvResult);

        btn00 = findViewById(R.id.btn00);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn00.setOnClickListener(view -> {
            scet = scet + "00";
            tvScet.setText(scet);
        });

        btn0.setOnClickListener(view -> {
            scet = scet + "0";
            tvScet.setText(scet);
        });

        btn1.setOnClickListener(view -> {
            scet = scet + "1";
            tvScet.setText(scet);
        });

        btn2.setOnClickListener(view -> {
            scet = scet + "2";
            tvScet.setText(scet);
        });

        btn3.setOnClickListener(view -> {
            scet = scet + "3";
            tvScet.setText(scet);
        });

        btn4.setOnClickListener(view -> {
            scet = scet + "4";
            tvScet.setText(scet);
        });

        btn5.setOnClickListener(view -> {
            scet = scet + "5";
            tvScet.setText(scet);
        });

        btn6.setOnClickListener(view -> {
            scet = scet + "6";
            tvScet.setText(scet);
        });

        btn7.setOnClickListener(view -> {
            scet = scet + "7";
            tvScet.setText(scet);
        });

        btn8.setOnClickListener(view -> {
            scet = scet + "8";
            tvScet.setText(scet);
        });

        btn9.setOnClickListener(view -> {
            scet = scet + "9";
            tvScet.setText(scet);
        });

        btnZap.setOnClickListener(view -> {
            //если чисел нет, то перед запятой пишем 0
            if (scet.isEmpty()) {
                scet = "0.";
                zap = true;
            }
            if (!zap) {
                scet = scet + ".";
                zap = true;
            }
            tvScet.setText(scet);
        });

        btnClear.setOnClickListener(view -> {
            scet = "";
            res = "";
            tvResult.setText(res);
            tvScet.setText(scet);
            oper = false;
            zap = false;
        });

        btnDel.setOnClickListener(view -> {
            zap = false;
            if (!scet.isEmpty()) {
                if (!oper) {
                    scet = scet + " / ";
                    oper = true;
                }
            }
            tvScet.setText(scet);
        });

        btnUmn.setOnClickListener(view -> {
            zap = false;
            if (!scet.isEmpty()) {
                if (!oper) {
                    scet = scet + " * ";
                    oper = true;
                }
            }
            tvScet.setText(scet);
        });

        btnPl.setOnClickListener(view -> {
            zap = false;
            if (!scet.isEmpty()) {
                if (!oper) {
                    scet = scet + " + ";
                    oper = true;
                }
            }
            tvScet.setText(scet);
        });

        btnMin.setOnClickListener(view -> {
            zap = false;
            if (!scet.isEmpty()) {
                if (!oper) {
                    scet = scet + " - ";
                    oper = true;
                }
            }
            tvScet.setText(scet);
        });

        btnRavn.setOnClickListener(view -> {

            if (oper) {
                String[] num;
                num = scet.split(" ");

                switch (num[1].charAt(0)) {
                    case '/':
                        res = Double.toString(Double.parseDouble(num[0]) / Double.parseDouble(num[2]));
                        break;
                    case '*':
                        res = Double.toString(Double.parseDouble(num[0]) * Double.parseDouble(num[2]));
                        break;
                    case '+':
                        res = Double.toString(Double.parseDouble(num[0]) + Double.parseDouble(num[2]));
                        break;
                    case '-':
                        res = Double.toString(Double.parseDouble(num[0]) - Double.parseDouble(num[2]));
                        break;
                }
                tvScet.setText("");
                tvResult.setText(res);
            }
        });

    }


}