package cl.caritomesa.dondedormir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoBusquedaActivity extends AppCompatActivity {

    ListView lista;


    String[] comunas = {
            "Valpo",
            "Viña",
            "Con-Con",
            "Reñaca",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_busqueda);

        lista = (ListView) findViewById(R.id.listView);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, comunas);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent ii = new Intent(getApplicationContext(), HabitacionActivity.class);
                        startActivity(ii);
                        break;
                    case 1 :
                        Toast.makeText(getApplicationContext(), "unoooooo", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "dosssssss", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}
