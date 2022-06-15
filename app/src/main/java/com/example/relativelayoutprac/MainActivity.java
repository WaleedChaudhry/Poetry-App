package com.example.relativelayoutprac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView line1, line2;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // getSupportActionBar().hide();
        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        share=findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "wait", Toast.LENGTH_SHORT).show();
                String l1=line1.getText().toString();
                String l2=line2.getText().toString();
                String data=l1+"\n" +l2;
                Intent intent=new Intent();
                intent.setAction(intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,data);
                startActivity(intent);

            }
        });


    }
}