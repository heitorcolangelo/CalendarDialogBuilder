package com.example.calendarbuilderexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends Activity implements CalendarDialogBuilder.OnDateSetListener {

    private Date initialDate = new Date();
    private Date startDate = new Date();
    private Date endDate = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startDate.setYear(2015);
        startDate.setMonth(10);
        startDate.setDate(1);

        initialDate.setYear(2015);
        initialDate.setMonth(10);
        initialDate.setDate(5);

        endDate.setYear(2015);
        endDate.setMonth(10);
        endDate.setDate(25);
    }

    // That is the method of OnDateSetListener interface of CalendarDialogBuilder class
    @Override
    public void onDateSet(int Year, int Month, int Day) {

        TextView txt = (TextView) findViewById(R.id.text1);

        txt.setText(Month + "/" + Day + "/" + Year);

    }

    // This is the button method, were we call the calendar.
    public void selectDate(View v) {
        CalendarDialogBuilder calendar;

        if(initialDate != null)
        {
            calendar = new CalendarDialogBuilder(this, this, initialDate.getTime());
        } else {
            calendar = new CalendarDialogBuilder(this, this);
        }

        calendar.setStartDate(startDate.getTime());
        calendar.setEndDate(endDate.getTime());
        calendar.showCalendar();
    }

    
}
