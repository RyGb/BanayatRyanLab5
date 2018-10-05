package ryan.banayat.com.banayatryanlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity 2");
        setContentView(R.layout.activity_screen2);
        Intent i = new Intent(this, Logging.class);
        startService(i);
    }

    public void init(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.Btn2) {
            i = new Intent(this, screen1.class);
            startActivity(i);
        } else {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 14.579156, 120.9703611"));
            chooser = Intent.createChooser(i, "Select Map Application");
            startActivity(chooser);
        }
    }
}
