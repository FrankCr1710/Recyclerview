package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {
    AppDatabase miDB;
    CorreoDAO correoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://appapi2022.000webhostapp.com/api.php";

            StringRequest request = new StringRequest(
                    Request.Method.POST,
                    url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Toast.makeText(MainActivity3.this, "Datos guardados", Toast.LENGTH_SHORT).show();
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity3.this, "Error al cargar datos", Toast.LENGTH_SHORT).show();
                        }
                    }

            ){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params= new HashMap<String, String>();
                    params.put("username", etUsername.getText().toString());
                    params.put("password", etUsername.getText().toString());
                    params.put("nombres", etUsername.getText().toString());
                    params.put("apellidos", etUsername.getText().toString());
                    params.put("tipo", etUsername.getText().toString());
                }
            }




        /*miDB = AppDatabase.getInstance(this);
        correoDAO = miDB.correoDAO();*/

        // List<Correo> correos = correoDAO.traerTodo();
        /*correos.add(new Correo("Dagmar", "Ut molestias impedi", "Voluptatem similiqu"));
        correos.add(new Correo("Piper", "Necessitatibus veni", "Nihil ut est ipsum"));
        correos.add(new Correo("Khalid", "Sunt voluptatem est", "Consectetur et inci"));
        correos.add(new Correo("Scottie", "Omnis et officiis q", "Ut explicabo possim"));
        correos.add(new Correo("frank", "Doloribus placeat e", "Incidunt delectus r"));
        correos.add(new Correo("yanpohol", "Doloribus placeat e", "Incidunt delectus r"));
        correos.add(new Correo("Yorch", "Doloribus placeat e", "Incidunt delectus r"));
        correos.add(new Correo("Angello", "Doloribus placeat e", "Incidunt delectus r"));
        correos.add(new Correo("Pilar", "Doloribus placeat e", "Incidunt delectus r"));
        correos.add(new Correo("Soleda", "Doloribus placeat e", "Incidunt delectus r"));
        correos.add(new Correo("Pepin", "Doloribus placeat e", "Incidunt delectus r"));*/



    }
}