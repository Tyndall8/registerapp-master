package edu.uark.uarkregisterapp;

/**
 * Created by matyndal on 3/7/2017.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateEmployeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_create);
    }

    public void buttonOnClick(View view){
        //Send data to server
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        intent.putExtra("employee", true);
        this.startActivity(intent);
    }

    private EditText getFirstName() {
        return (EditText) this.findViewById(R.id.employee_first_name);
    }

    private EditText getLastName() {
        return (EditText) this.findViewById(R.id.employee_last_name);
    }

    private EditText getPassword() {
        return (EditText) this.findViewById(R.id.employee_password);
    }

}