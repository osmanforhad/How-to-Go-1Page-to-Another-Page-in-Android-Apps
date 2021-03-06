package com.osmanforhad.friendsinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Create object
    EditText friend,contact;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initial XML Layout Using XML id
        friend = (EditText) findViewById(R.id.fname);
        contact = (EditText) findViewById(R.id.cno);
        btn1 = (Button) findViewById(R.id.btnsave);
        btn2 = (Button) findViewById(R.id.btnshow);

        //For Making the Button1 Clickable
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //For Displaying data after Submit input
                String _friendname = friend.getText().toString();
                String _friendno = contact.getText().toString();
                //For Display  Text After Click the Button
                Toast.makeText(getApplicationContext(), "Name: "+_friendname+", Number: "+_friendno, Toast.LENGTH_LONG).show();

            }
        });
        //For Making the Button2 Clickable
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //For going to Next Page After Click on the button
                startActivity(new Intent(getApplicationContext(),DetailsOfFriends.class));

            }
        });
    }
}
