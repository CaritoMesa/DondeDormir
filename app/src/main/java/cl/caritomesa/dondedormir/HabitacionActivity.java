package cl.caritomesa.dondedormir;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class HabitacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.habitacion);

        Intent intent = getIntent();
        String message = intent.getStringExtra(DondeDormirActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.resultado_busqueda);
        layout.addView(textView);
    }

    public void llamar (View view) {
        //constrir intent
        Uri number = Uri.parse("tel:+56966122823");
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

    public void web (View view) {
        //constrir intent
        Uri webpage = Uri.parse("http://www.android.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

        // Verify it resolves
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(webIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;

        // Start an activity if it's safe
        if (isIntentSafe) {
            startActivity(webIntent);
        }

    }

    // Map point based on address
    Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
    // Or map point based on latitude/longitude
    // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_busqueda);

        String[] countries = getResources().getStringArray(R.array.countries_array);

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, R.layout.list_item, countries);

        ListView lv = (ListView) findViewById(R.id.lv);

        lv.setAdapter(adaptador);*/

}
