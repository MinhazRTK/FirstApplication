package com.batch2.m0nk3y.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText etImgName = findViewById(R.id.et_name);
        Button btnAddNmae = findViewById(R.id.btn_add_name);
        final TextView txtName = findViewById(R.id.txt_img_name);
        btnAddNmae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etImgName.getText().toString();
                txtName.setText(name);
            }
        });
    }
}
