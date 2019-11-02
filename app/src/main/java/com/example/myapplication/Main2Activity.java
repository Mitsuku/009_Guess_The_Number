package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private int guessTime;
    private int random;
    private int input_N;
    private boolean ReturnGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button = (Button) findViewById(R.id.button);

        Intent intent=getIntent();
        random = intent.getIntExtra("random",0);
        input_N = intent.getIntExtra("portal",0);
        guessTime = intent.getIntExtra("guessTime",0);

        TextView text_prompt = (TextView)findViewById(R.id.text_prompt);
        TextView text_result = (TextView)findViewById(R.id.text_result);
         if (random == input_N & guessTime > 8){
             text_result.setText("O");
            guessTime++;
            text_prompt.setText("你來亂的吧!"+"正常人怎麼可能猜到"+guessTime+"次");
            ReturnGame=true;
            guessTime=0;
            button.setText("重新");
        }
         else if (random == input_N & guessTime == 8) {
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("不是你運氣差就是你亂點!"+"一共答了"+guessTime+"次");
             ReturnGame = true;
             guessTime = 0;
             button.setText("再玩一次");
         }
         else if (random == input_N & guessTime == 7) {
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("不是你運氣差就是你亂點!"+"一共答了"+guessTime+"次");
             ReturnGame = true;
             guessTime = 0;
             button.setText("再玩一次");
         }
         else if (random == input_N & guessTime == 6) {
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("不是你運氣差就是你亂點!"+"一共答了"+guessTime+"次");
             ReturnGame = true;
             guessTime = 0;
             button.setText("再玩一次");
         }
         else if(random == input_N & guessTime == 3){
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("加油好嗎,一共答了"+guessTime+"次");
             ReturnGame=true;
             guessTime=0;
             button.setText("再玩一次");
         }
         else if(random == input_N & guessTime == 4){
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("加油好嗎,一共答了"+guessTime+"次");
             ReturnGame=true;
             guessTime=0;
             button.setText("再玩一次");
         }
         else if(random == input_N & guessTime == 5){
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("加油好嗎,一共答了"+guessTime+"次");
             ReturnGame=true;
             guessTime=0;
             button.setText("再玩一次");
         }
         else if(random == input_N & guessTime == 2){
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("不錯呦,一共答了"+guessTime+"次");
             ReturnGame=true;
             guessTime=0;
             button.setText("再玩一次");
         }
         else if(random == input_N & guessTime == 1){
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("不錯呦,一共答了"+guessTime+"次");
             ReturnGame=true;
             guessTime=0;
             button.setText("再玩一次");
         }
         else if(random == input_N & guessTime == 0){
             text_result.setText("O");
             guessTime++;
             text_prompt.setText("真厲害,一次就猜中了!");
             ReturnGame=true;
             guessTime=0;
             button.setText("再玩一次");
         }
        else  if (random < input_N){
            text_result.setText("X");
            text_prompt.setText("猜太大");
            ReturnGame=false;
            guessTime++;
        }
        else if (random > input_N){
            text_result.setText("X");
            text_prompt.setText("猜太小");
            ReturnGame=false;
            guessTime++;
        }


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("guessTime",guessTime );
                intent.putExtra("random", random);
                intent.putExtra("ReturnGame", ReturnGame);
                startActivity(intent);
            }
        });
    }
}