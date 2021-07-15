package com.example.demofilereadwriting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    Button btnWrite, btnRead;
    TextView tv;

    String folderLocation;
//UI handlers to be defined

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI handlers to be defined

        btnWrite = findViewById(R.id.btnWrite);
        btnRead = findViewById(R.id.btnRead);
        tv = findViewById(R.id.tv);

        //Folder creation
        folderLocation = getFilesDir().getAbsolutePath() + "/Download";

        File folder = new File(folderLocation);
        if (folder.exists() == false){
            boolean result = folder.mkdir();
            if (result == true){
                Log.d("File Read/Write", "Folder created");
            }
        }

        btnWrite.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for file writing
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for file reading
            }
        });


    }
}
