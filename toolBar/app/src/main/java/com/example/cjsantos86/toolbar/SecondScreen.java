package com.example.cjsantos86.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by cjsantos86 on 19/04/16.
 */
public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMassage = (TextView) findViewById(R.id.calling_activity_info);

        callingActivityMassage.append(" " + previousActivity);
    }

    public void onSendUsersName(View view) {

        EditText userNameET = (EditText) findViewById(R.id.users_name_edit_text);
        String usersName = String.valueOf(userNameET.getText());

        Intent goinBack = new Intent();
        goinBack.putExtra("UsersName", usersName);

        setResult(RESULT_OK,goinBack);
        finish();
    }
}
