package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.WebService.Asynchtask;
import com.example.myapplication.WebService.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class Validation extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        Bundle bundle = this.getIntent().getExtras();
        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("http://uealecpeterson.net/ws/login.php?usr="
                + bundle.getString("user") + "&pass=" + bundle.getString("pass"),
                datos, Validation.this, Validation.this);
        ws.execute("GET");
    }
    @Override
    public void processFinish(String result) throws JSONException {

        TextView txtMensaje = (TextView)findViewById(R.id.Mensage);
        txtMensaje.setText("Respuesta del WS: " + result);


    }
}