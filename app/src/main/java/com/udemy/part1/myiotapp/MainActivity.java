package com.udemy.part1.myiotapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    ImageButton bulb1,bulb2,bulb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bulb1=(ImageButton)findViewById(R.id.bulb1);
        bulb2=(ImageButton)findViewById(R.id.bulb2);
        bulb3=(ImageButton)findViewById(R.id.bulb3);

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference myRef=database.getReference("bulb1").child("value");

                    bulb1.setImageResource(R.drawable.red);
                    bulb1.setTag("red");
                    bulb2.setImageResource(R.drawable.red);
                    bulb2.setTag("red");
                    bulb3.setImageResource(R.drawable.red);
                    bulb3.setTag("red");

        bulb2.setImageResource(R.drawable.red);
        bulb2.setTag("red");
        bulb3.setImageResource(R.drawable.red);
        bulb3.setTag("red");
        bulb1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Drawable d1=getApplicationContext().getResources().getDrawable(R.drawable.red);
                ImageButton bulb1=(ImageButton)findViewById(R.id.bulb1);

                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("bulb1");

                if(bulb1.getTag().equals("red"))
                {
                    Log.d("1", "onClick: Chk 1");
                    bulb1.setImageResource(R.drawable.green);
                    bulb1.setTag("green");
                    myRef.setValue(1);
                }
                else
                {
                    Log.d("2", "onClick: Chk 2");
                    bulb1.setImageResource(R.drawable.red);
                    bulb1.setTag("red");
                    myRef.setValue(0);

                }
            }
        });

        bulb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Drawable d1=getApplicationContext().getResources().getDrawable(R.drawable.red);
                ImageButton bulb2=(ImageButton)findViewById(R.id.bulb2);

                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("bulb2");

                if(bulb2.getTag().equals("red"))
                {
                    Log.d("1", "onClick: Chk 1");
                    bulb2.setImageResource(R.drawable.green);
                    bulb2.setTag("green");
                    myRef.setValue(1);
                }
                else
                {
                    Log.d("2", "onClick: Chk 2");
                    bulb2.setImageResource(R.drawable.red);
                    bulb2.setTag("red");
                    myRef.setValue(0);
                }
            }
        });

        bulb3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Drawable d1=getApplicationContext().getResources().getDrawable(R.drawable.red);
                ImageButton bulb3=(ImageButton)findViewById(R.id.bulb3);

                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("bulb3");

                if(bulb3.getTag().equals("red"))
                {
                    Log.d("1", "onClick: Chk 1");
                    bulb3.setImageResource(R.drawable.green);
                    bulb3.setTag("green");
                    myRef.setValue(1);
                }
                else
                {
                    Log.d("2", "onClick: Chk 2");
                    bulb3.setImageResource(R.drawable.red);
                    bulb3.setTag("red");
                    myRef.setValue(0);
                }
            }
        });


    }


}
