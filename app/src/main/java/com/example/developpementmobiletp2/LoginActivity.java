package com.example.developpementmobiletp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static String USERNAME = "username";
    private static String PASSWORD = "password";

    EditText editText_login;
    EditText editText_password;
    Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // attribution des objets
        editText_login = findViewById(R.id.editText_login);
        editText_password = findViewById(R.id.editText_password);
        button_login = findViewById(R.id.button_login);

    }

    /**
     * login process function
     * open HomeActivity if username/passwords match
     * @param view
     */
    public void login(View view) {
        String username = editText_login.getText().toString();
        String password = editText_password.getText().toString();
        // try to login
        if(!checkUserPassword(username, password)) {
            //failed
            toastNotification(view, "Error while Loggin in");
            editText_login.setText("");
            editText_password.setText("");
        } else {
            // success
            // we open Home Activity
            goToHome(view);
        }
    }

    /**
     * Checks if given username and password matches the required ones
     * @param username the username
     * @param password the password
     * @return false|true depending on the check result
     */
    public boolean checkUserPassword(String username, String password) {
        if(USERNAME.equals(username) && PASSWORD.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Open Home Activity
     * @param view
     */
    public void goToHome(View view) {
        Intent intentAfficher = new Intent(this, HomeActivity.class);
        startActivity(intentAfficher);
    }

    /**
     * Display a toast notification on screen
     * @param view the view
     * @param message the message (String)
     */
    public void toastNotification(View view, String message) {
        Log.println(0, "INFO", "displaying toast message : " + message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}