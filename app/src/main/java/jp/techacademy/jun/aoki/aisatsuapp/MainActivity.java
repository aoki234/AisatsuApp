package jp.techacademy.jun.aoki.aisatsuapp;


import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view){
        showTimePicker();
    }

    private void showTimePicker(){
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                if(hourOfDay >= 2 && hourOfDay < 10){
                    mTextView.setText("おはよう");
                }else if(hourOfDay >= 10 && hourOfDay < 18){
                    mTextView.setText("こんにちは");
                }else if(hourOfDay >= 18 || hourOfDay <2){
                    mTextView.setText("こんばんは");
                }

            }
        },13,0,true);
        timePickerDialog.show();
    }


}
