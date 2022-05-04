package com.example.taserfan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.taserfan.API.API;
import com.example.taserfan.API.Connector;
import com.example.taserfan.API.Result;
import com.example.taserfan.base.BaseActivity;
import com.example.taserfan.base.CallInterface;

public class LoginActivity extends BaseActivity implements CallInterface {
    Result<Empleado> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        executeCall(this);
    }

    @Override
    public void doInBackground() {
        result = Connector.getConector().post(Empleado.class,new AuthenticationData("pepa@mordor.es","1111"), API.Routes.AUTHENTICATE);
    }

    @Override
    public void doInUI() {
        Toast.makeText(this, "d", Toast.LENGTH_SHORT).show();
        if(result instanceof Result.Success){
            LoggedInUserRepository.getInstance().login(((Result.Success<Empleado>) result).getData());
            // TO DO
        } else {
            // TO DO
        }
    }
}