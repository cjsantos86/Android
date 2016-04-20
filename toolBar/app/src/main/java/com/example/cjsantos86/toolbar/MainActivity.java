package com.example.cjsantos86.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetName(View view) {

        Intent getNameScreenIntent = new Intent(this,SecondScreen.class);

        final int result = 1;

        getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getNameScreenIntent,result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView usersNameMessage= (TextView) findViewById(R.id.user_name_message);

        String nameSendBack = data.getStringExtra("UsersName");

        usersNameMessage.append(" " + nameSendBack);
    }
}
