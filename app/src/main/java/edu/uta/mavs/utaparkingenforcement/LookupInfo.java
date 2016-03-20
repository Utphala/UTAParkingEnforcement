package edu.uta.mavs.utaparkingenforcement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

public class LookupInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup_info);

        SearchView searchView = (SearchView) findViewById(R.id.search_bar);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Do you want to search? Go search yourself. I want to sleep!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showPreviousViolations(View view) {
        Intent intent = new Intent(this, PreviousViolations.class);
        startActivity(intent);

    }
}
