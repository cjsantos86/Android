package com.example.cjsantos86.safe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.TextureView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {

    private Button answerYesButton, AnswerNoButton;
    private EditText usersNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        answerYesButton = (Button) findViewById(R.id.answer_yes_Button);
        answerYesButton = (Button) findViewById(R.id.answer_no_Button);
        usersNameEditText = (EditText) findViewById(R.id.users_name_Edit_text);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onYesButtonClick(View view) {

        String userName= String.valueOf(usersNameEditText.getText());

        String yesResponse = "Its Nice " + userName;

        Toast.makeText(this,yesResponse,Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {

        String userName= String.valueOf(usersNameEditText.getText());

        String noResponse = "Its bad " + userName;

        Toast.makeText(this,noResponse,Toast.LENGTH_SHORT).show();
    }
    }

