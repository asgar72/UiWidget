package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_toast1, btn_toast2,btn_main3,btn_Form,btn_spinner,btn_toggle,btn_imgBtn, btn_rating,btn_Datepicker,btn_Timepicker,
       custom_alert,btn_alertDialog,seek_bar,btn_progressbar,btn_proDialog,btn_Scroll,btn_Horizontal,btn_Flipper, btn_ImageSwitcher,
        btsearch,btnweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toast1 = findViewById(R.id.btn_toast1);
        btn_toast2 = findViewById(R.id.btn_toast2);
        btn_main3 = findViewById(R.id.btn_Main3);
        btn_Form = findViewById(R.id.btn_Form);
        btn_spinner = findViewById(R.id.btn_spinner);
        btn_toggle = findViewById(R.id.btn_toggle);
        btn_imgBtn=findViewById(R.id.btn_imgBtn);
        btn_rating = findViewById(R.id.btn_rating);
        btn_Datepicker = findViewById(R.id.btn_Datepicker);
        btn_Timepicker =findViewById(R.id.btn_Timepicker);
        btn_alertDialog =findViewById(R.id.btn_alertDialog);
        custom_alert = findViewById(R.id.custom_alert);
        seek_bar = findViewById(R.id.seek_bar);
        btn_progressbar = findViewById(R.id.btn_progressbar);
        btn_proDialog = findViewById(R.id.btn_proDialog);
        btn_Scroll = findViewById(R.id.btn_Scroll);
        btn_Horizontal = findViewById(R.id.btn_Horizontal);
        btn_Flipper = findViewById(R.id.btn_Flipper);
        btn_ImageSwitcher = findViewById(R.id.btn_ImageSwitcher);
        btsearch = findViewById(R.id.btsearch);
        btnweb = findViewById(R.id.btnweb);


        btn_toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ButtonClickEventTwo.class);
                startActivity(intent);
            }
        });
        btn_toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CustomToast.class));
            }
        });
        btn_main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ButtonClickEvent.class));
            }
        });
        btn_Form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MyForm.class));
            }
        });
        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SpinnerDemo.class));
            }
        });
        btn_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ToggleBtnSwitchDemo.class));
            }
        });
        btn_imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ImgButton.class));
            }
        });
        btn_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RatingBarDemo.class));
            }
        });
        btn_Datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DatepickerDemo.class));
            }
        });
        btn_Timepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TimepickerDemo.class));
            }
        });
        btn_alertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Alert_Dialog_Demo.class));
            }
        });
        custom_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),Custom_Aert_Dialog.class));
            }
       });
        seek_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),SeekBarDemo.class));
            }
       });
        btn_progressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),ProgressBarDemo.class));
            }
       });
        btn_proDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),ProgressDialogDemo.class));
            }
       });
        btn_Scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),ScrollViewDemo.class));
            }
       });
        btn_Horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),Horizontal_ScrollView.class));
            }
       });
        btn_Flipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),ViewFlipperDemo.class));
            }
       });
        btn_ImageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),ImageSwitcherDemo.class));
            }
       });

        btsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(getApplicationContext(),SearchView.class);
                startActivity(ob);
            }
        });
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(getApplicationContext(),WebView1.class);
                startActivity(ob);
            }
        });

    }
}