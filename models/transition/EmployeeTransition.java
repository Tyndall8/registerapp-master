package edu.uark.uarkregisterapp.models.transition;

import android.os.Parcel;
import android.os.Parcelable;

// Created by Zack Fravel on 3/4/17/ //

public class EmployeeTransition implements Parcelable {

    @Override
    public void writeToParcel(Parcel destination, int flags) {
        // To be implemented
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<EmployeeTransition> CREATOR = new Parcelable.Creator<EmployeeTransition>() {
        public EmployeeTransition createFromParcel(Parcel employeeTransitionParcel) {
            return new EmployeeTransition(employeeTransitionParcel);
        }

        public EmployeeTransition[] newArray(int size) { return new EmployeeTransition[size]; }
    };

    public EmployeeTransition(){
        // Impliment Constructor
    }

    public EmployeeTransition(Parcel employeeTransitionParcel) {
        // Impliment Constructor
    }
}
