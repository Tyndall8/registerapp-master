package edu.uark.uarkregisterapp.models.api;
import org.json.JSONObject;

import edu.uark.uarkregisterapp.models.api.interfaces.ConvertToJsonInterface;
import edu.uark.uarkregisterapp.models.api.interfaces.LoadFromJsonInterface;

// Created by Zack Fravel on 3/4/17 //

public class Employee implements ConvertToJsonInterface, LoadFromJsonInterface<Employee> {

    @Override
    public Employee loadFromJson(JSONObject rawJsonObject) {
        return this;
    }

    @Override
    public JSONObject convertToJson() {
        JSONObject jsonObject = new JSONObject();

        return jsonObject;
    }

    public Employee() {
        // To be implemented
    }
}
