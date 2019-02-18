package com.example.apptest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView text;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        text = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                if (flag){
                    // use getApplication not to be out of memory
                    Intent intent = new Intent(getApplication(), SubActivity.class);
                    startActivity(intent);
                    flag = false;

                }
                else{
                    text.setTypeface(Typeface.DEFAULT_BOLD,35);
                    text.setTextColor(Color.DKGRAY);
                    text.setText("hello world is a misical word");
                    flag = true;

                }




            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selectedItem = item.getItemId();
        int[] itemlist = {R.id.item1, R.id.item2, R.id.item3, R.id.item4};

        for (int items : itemlist) {
            if (items == selectedItem) {
                Toast.makeText(MainActivity.this, "menu selected!", Toast.LENGTH_LONG).show();
            }
        }
        if (selectedItem == R.id.item0){
            Toast.makeText(MainActivity.this, "Still empty content", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

