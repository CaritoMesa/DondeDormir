package cl.caritomesa.dondedormir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DondeDormirActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void buscar (View view) {
        Intent intent = new Intent(this, ResultadoBusquedaActivity.class);
        EditText editText = (EditText) findViewById(R.id.ing_ciudad);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void cuenta (View view) {
        Intent intent = new Intent(this, CuentaActivity.class);
        EditText editText = (EditText) findViewById(R.id.ing_personas);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
