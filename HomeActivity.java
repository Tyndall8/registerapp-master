package edu.uark.uarkregisterapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Created by Zack Fravel

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        checkManagerType();
        setEmployeeName();
    }

    public void setEmployeeName() {
        // Implement logic to set Employee Name to currently logged in Employee
        TextView t = (TextView) findViewById(R.id.EmployeeIDHome);
        t.setText(getIntent().getStringExtra("Employee"));
    }

    // Checks Manager Permissions
    public void checkManagerType() {
        // Implement logic to check the manager's permissions
        // Here is where the visibilities of the different buttons will be set
    }

    // Start Transaction
    public void startTransactionButton(View view) { errorMessage(view); }

    // Create Employee
    public void createEmployeeButton(View view)
    {
        errorMessage(view);
    }

    // Sales Report: Product
    public void productSalesReportButton(View view)
    {
        errorMessage(view);
    }

    // Sales Report: Cashier
    public void cashierSalesReportButton(View view)
    {
        errorMessage(view);
    }

    // Log Out Button
    public void logOutButton(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        this.startActivity(intent);
    }

    // Error Message
    public void errorMessage(View view)
    {
        // Create error message here
        new AlertDialog.Builder(view.getContext())
                .setTitle(R.string.error_title)
                .setMessage(R.string.error)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }

}
