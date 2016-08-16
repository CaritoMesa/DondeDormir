package cl.caritomesa.dondedormir;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class CuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuenta);

    }

    public void llamar (View view) {
        //constrir intent
        Uri number = Uri.parse("tel:66122823");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

        // Verify it resolves
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(callIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;

        // Start an activity if it's safe
        if (isIntentSafe) {
            startActivity(callIntent);
        }

    }

}
