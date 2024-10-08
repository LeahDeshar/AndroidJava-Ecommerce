package com.example.ecomm.Activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.FirebaseDatabase;

public class BaseActivity extends AppCompatActivity {
    
FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        full screen experience settings
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        WindowInsetsController insetsController = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            insetsController = getWindow().getInsetsController();
        }
        if (insetsController != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                insetsController.hide(WindowInsetsCompat.Type.statusBars());
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                insetsController.setSystemBarsBehavior(
                        WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                );
            }
        }

        database = FirebaseDatabase.getInstance();

    }
}