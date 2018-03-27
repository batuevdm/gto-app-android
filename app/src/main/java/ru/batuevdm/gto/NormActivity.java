package ru.batuevdm.gto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class NormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norm);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.gender_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerGender);
        spinner.setAdapter(adapter);
        spinner.setPrompt(getString(R.string.text_gender));
        spinner.setSelection(0);

        Button buttonGoItems = (Button) findViewById(R.id.buttonGoItems);

        View.OnClickListener goToNormItems = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(NormActivity.this, NormItemsActivity.class);

                EditText editAge = (EditText) findViewById(R.id.editAge);
                Spinner spinnerGender = (Spinner) findViewById(R.id.spinnerGender);

                String age = editAge.getText().toString();

                if( !age.trim().equals("") ) {

                    if( Integer.parseInt(age) >= 6 ) {
                        intent.putExtra("age", Integer.parseInt(age));
                        intent.putExtra("gender", spinnerGender.getSelectedItemPosition());

                        startActivity(intent);

                    }
                    else {
                        editAge.setError( getString(R.string.error_age_small) );
                    }

                }
                else {
                    editAge.setError( getString(R.string.error_age_empty) );
                }

            }
        };

        buttonGoItems.setOnClickListener(goToNormItems);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
