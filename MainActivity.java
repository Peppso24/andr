package com.example.parrucchiere;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Array;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private CalendarView cv;
    private EditText et, et2;
    private Appuntamento ap;
    private Utente ut;
    private TextView tv1;
    private String curDate,Year,Month,date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.badd);
        cv = findViewById(R.id.CalendarView);
        et = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                curDate = String.valueOf(dayOfMonth);
                Year = String.valueOf(year);
                Month = String.valueOf(month+1);
                date=curDate + "/" + Month + "/" + Year;
                tv1.setText(date);
                Log.e("date", Year + "/" + Month + "/" + curDate);
            }
        });

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ap=ap.add(getDate(), getTime(et2.toString()), et.toString(), ut);
                tv1.setText(ap.toString());


            }
        });


    }

    public Time getTime(String string) {
        Time t = null;
        int i;
        i = Integer.parseInt(string);
        t.setTime(i);
        return t;
    }

    private String getDate() {
          /*   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = simpleDateFormat.format(9897546853323L);
        date.setTime(Integer.parseInt(String.format("Date: %s", dateString)));*/

        return date;

    }
}