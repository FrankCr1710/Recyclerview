package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity3 extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    EditText etNombres;
    EditText etApellidos;
    EditText etTipos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etNombres = findViewById(R.id.etNombres);
        etApellidos = findViewById(R.id.etApellidos);
        etTipos = findViewById(R.id.etTipo);

    }

    public void guardar (View view){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://appapi2022.000webhostapp.com/api.php";

        try {
            JSONObject jsonBody = new JSONObject();
            jsonObject.put()
        }


        StringRequest request = new StringRequest(
                Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }

        )
    }
}