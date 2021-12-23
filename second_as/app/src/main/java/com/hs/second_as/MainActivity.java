package com.hs.second_as;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText user,pass;
    String usr,pss;
    TextView note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        note=findViewById(R.id.note);

        button.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view){
                    usr = user.getText().toString();
                    pss = pass.getText().toString();

                    if(!usr.equals("")){
                        note.setText(usr+" "+pss);
                    }
                    else {
                        note.setText("Please fill values");
                    }
                }
            }
        );
    }
}