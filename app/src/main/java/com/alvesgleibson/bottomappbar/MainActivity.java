package com.alvesgleibson.bottomappbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private BottomAppBar bottomAppBar;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottomAppBar);
        floatingActionButton = findViewById(R.id.fabHome);

        floatingActionButton.setOnClickListener( x ->{
            Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
        });
        menuBAB();
    }

    private void menuBAB() {

        bottomAppBar.setOnMenuItemClickListener( x ->{
            switch (x.getItemId()){
                case R.id.camera:{
                    Toast.makeText(MainActivity.this, "Camera", Toast.LENGTH_SHORT).show();
                    break;
                }
                case R.id.setting:{
                    Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
            return false;
        });



    }

}