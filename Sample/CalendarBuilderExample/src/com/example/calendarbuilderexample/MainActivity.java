package com.example.calendarbuilderexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements CalendarDialogBuilder.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // That is the method of OnDateSetListener interface of CalendarDialogBuilder class
	@Override
	public void onDateSet(int Year, int Month, int Day) {
		
		TextView txt = (TextView) findViewById(R.id.text1);
		
		txt.setText(Month + "/" + Day + "/" + Year);
		
	}
	
	// This is the button method, were we call the calendar.
	public void selectDate(View v)
	{
		CalendarDialogBuilder calendar = new CalendarDialogBuilder(this, this);
		calendar.showCalendar();
	}

    
}
