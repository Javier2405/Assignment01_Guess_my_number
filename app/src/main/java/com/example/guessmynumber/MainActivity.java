package com.example.guessmynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Random_number randObj;
    Toast notification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.randObj = new Random_number();

        TextView text = findViewById(R.id.editText1);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener((v)->{
            try{
                int aux = Integer.parseInt(text.getText().toString());
                if(aux <= 100 && aux>=0) {
                    this.notification = Toast.makeText(getApplicationContext(),
                            randObj.makeGuess(aux), Toast.LENGTH_LONG);

                    this.notification.show();
                }else{
                    this.notification = Toast.makeText(getApplicationContext(),
                            "That's not a number between 0 and 100", Toast.LENGTH_LONG);

                    this.notification.show();
                }
            }catch(Exception e){
                this.notification = Toast.makeText(getApplicationContext(),
                        "That's not a number between 0 and 100", Toast.LENGTH_LONG);

                this.notification.show();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener((v)->{

            this.notification = Toast.makeText(getApplicationContext(),
                    randObj.setNewRandom(), Toast.LENGTH_LONG);

            this.notification.show();
        });

    }

}
