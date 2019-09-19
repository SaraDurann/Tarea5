package org.sara.tarea5;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String hexColor = "#000000";
    SeekBar rColor, gColor, bColor;
    TextView rColorText, gColorText, bColorText, color;
    View colorSample;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        colorSample = findViewById(R.id.colorSample);

//seekbar
        rColor =findViewById(R.id.rColor);
        gColor =findViewById(R.id.gColor);
        bColor =findViewById(R.id.bColor);

        //texview

        rColorText =findViewById(R.id.rColorText);
        gColorText =findViewById(R.id.gColorText);
        bColorText =findViewById(R.id.bColorText);

        color = findViewById(R.id.Color);

        rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rColorText.setText("R: " + progress);

                String hexValue = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                colorSample.setBackgroundColor(Color.parseColor(hexValue));
                color.setText(hexValue);
                }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                gColorText.setText("G: " + progress);

                String hexValue = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                colorSample.setBackgroundColor(Color.parseColor(hexValue));
                color.setText(hexValue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bColorText.setText("B: " + progress);

                String hexValue = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                colorSample.setBackgroundColor(Color.parseColor(hexValue));
                color.setText(hexValue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        String hexValue = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
        System.out.println(hexValue);
        colorSample.setBackgroundColor(Color.parseColor(hexValue));
        color.setText(hexValue);



    }

}
