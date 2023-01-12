package com.asgar.uiwidgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

public class ProgressDialogDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog_demo);
    }

    //This is ProgressBar Dialog Box
    public void openProgressDialogOne(View view) {
        ProgressDialog progressDialog = new ProgressDialog(ProgressDialogDemo.this);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Progress Dialog Tittle");
        progressDialog.setMessage("This is simple progress dialog");
        progressDialog.setIcon(R.drawable.homework);
        progressDialog.show();

        //for write the thread there are two types ...

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                    progressDialog.dismiss();
//                }
//                catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        thread.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    progressDialog.dismiss();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


    //This is Horizontal ProgressBar Dialog Box

    public void openProgressDialogTwo(View view) {
        ProgressDialog progressDialog = new ProgressDialog(ProgressDialogDemo.this);
        progressDialog.setTitle("Horizontal ProgressBar Dialog");
        progressDialog.setMessage("This is Horizontal ProgressBar Dialog Box");
        progressDialog.setIcon(R.drawable.homework);
        progressDialog.setMax(100);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false);
        progressDialog.show();

        // for running

        Handler handler = new Handler() {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                progressDialog.incrementProgressBy(1);
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (progressDialog.getProgress()<=progressDialog.getMax())
                    {
                        Thread.sleep(100);
                        handler.sendMessage(handler.obtainMessage());
                        if(progressDialog.getProgress()==progressDialog.getMax())
                        {
                            progressDialog.dismiss();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}