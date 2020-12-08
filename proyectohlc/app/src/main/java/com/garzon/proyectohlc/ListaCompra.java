package com.garzon.proyectohlc;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ListaCompra extends AppCompatActivity implements View.OnClickListener{
    private EditText etArticulo, ubicacion;
    private Articulos articulos = new Articulos();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_compra);

        Button btnAgregar = findViewById(R.id.btnAgregar);
        Button btnCarrito = findViewById(R.id.btnCarrito);
        etArticulo = findViewById(R.id.etArticulo);
        ubicacion = findViewById(R.id.etUbicacion);
        Button btnUbicacion = findViewById(R.id.btnBuscar);


        btnAgregar.setOnClickListener(this);
        btnCarrito.setOnClickListener(this);
        btnUbicacion.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAgregar:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                if (!etArticulo.getText().toString().equals(" ")) {

                    articulos.articulosList.add(etArticulo.getText().toString());

                    Toast.makeText(ListaCompra.this, "Se ha añadido el articulo en el carrito de compra: " + etArticulo.getText().toString(), Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(ListaCompra.this, "Escribe un articulo para añadir al carrito de compra", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnCarrito:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                if (articulos.articulosList.size() > 0) {
                    Intent intent = new Intent(ListaCompra.this, Lista.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(ListaCompra.this, "El carrito de compra esta vacío", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnBuscar:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                String loc = ubicacion.getText().toString();

                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "Error intent");
                }
                break;
            case View.NO_ID:
            default:
                // TODO Auto-generated method stub
                break;
        }
    }
}