package edu.uark.uarkregisterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import edu.uark.uarkregisterapp.models.transition.EmployeeTransition;

// Created by Zack Fravel

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LogInButton(View view)
    {
        // Implement log in button action

        // Checks if employee exists in the database
        if(checkEmployeeExists())
        {
            createNewEmployee();
        }else{
         //   toHomeActivity();
        }

    }

  /*  public void toHomeActivity()
    {
        EditText inputText = (EditText) findViewById(R.id.EmployeeID);
        String Employee = inputText.getText().toString();

        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        intent.putExtra(Employee, new EmployeeTransition());
        this.startActivity(intent);
    }
*/
    public void createNewEmployee()
    {
        Intent intent = new Intent(getApplicationContext(), CreateEmployeeActivity.class);
        this.startActivity(intent);
        // Connections to be implemented
    }

    public boolean checkEmployeeExists()
    {
        // To be implemented

        return true;
    }

    private EditText getLogInEmployeeID() { return (EditText) this.findViewById(R.id.LogInEmployeeID); }

    private EditText getLogInPassword() { return (EditText) this.findViewById(R.id.LogInPassword); }

}
