package com.example.apptest;

        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        text = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                if (flag){
                    text.setTextColor(Color.MAGENTA);
                    text.setTypeface(Typeface.DEFAULT_BOLD,35);
                    text.setText("はっぴーday!");

                    flag = false;

                }
                else{
                    text.setTypeface(Typeface.DEFAULT_BOLD,35);
                    text.setTextColor(Color.DKGRAY);
                    text.setText("憂鬱デー");
                    flag = true;

                }
            }


        });

    }
}
