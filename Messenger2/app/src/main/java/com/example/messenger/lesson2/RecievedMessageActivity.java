package com.example.messenger.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.messenger.R;

public class RecievedMessageActivity extends AppCompatActivity {
private TextView textViewReceivedMsg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        textViewReceivedMsg=findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceivedMsg.setText(msg);



        final ImageButton imageButton;
        final boolean a = true;

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a)
                    imageButton.setImageResource(R.drawable.mypic);
                else
                    imageButton.setImageResource(R.drawable.jbareham_180213_2301_0109);
            }
        });




    }

    public void onClickGoBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);



    }


}
