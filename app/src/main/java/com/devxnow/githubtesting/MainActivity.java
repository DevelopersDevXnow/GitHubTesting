package com.devxnow.githubtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText ( this, "hello i am Royston ", Toast.LENGTH_SHORT ).show ();

        Toast.makeText ( this, "Working with branchbranch01", Toast.LENGTH_SHORT ).show ();

    }
}