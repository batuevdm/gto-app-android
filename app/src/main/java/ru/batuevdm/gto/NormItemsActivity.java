package ru.batuevdm.gto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class NormItemsActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norm_items);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        int age = intent.getIntExtra("age", 6);
        int gender = intent.getIntExtra("gender", 0);

        TabHost tabHost = findViewById(android.R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tab_imp");
        tabSpec.setIndicator(getString(R.string.text_isp_important));
        tabSpec.setContent(R.id.listImportantIsp);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tab_not_imp");
        tabSpec.setIndicator(getString(R.string.text_isp_not_important));
        tabSpec.setContent(R.id.listNotImportantIsp);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tab_inf");
        tabSpec.setIndicator(getString(R.string.text_inf));
        tabSpec.setContent(R.id.tabInformationView);
        tabHost.addTab(tabSpec);

        ListView lvImp = findViewById(R.id.listImportantIsp);
        ListView lvNotImp = findViewById(R.id.listNotImportantIsp);

        lvImp.clearChoices();
        lvNotImp.clearChoices();

        ArrayAdapter<CharSequence> iAdapter;
        ArrayAdapter<CharSequence> niAdapter;
        TextView tabInformationView = findViewById(R.id.tabInformationView);
        String[] infoArray;
        int 	resImp = 0,
                resNotImp = 0,
                resInf = 0,
                _resDescImp = 0,
                _resDescNotImp = 0;


        if( age >= 6 && age <= 8 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_6_8;
                resNotImp = R.array.not_imp_isp_0_6_8;
                resInf = R.array.inf_isp_0_6_8;
                _resDescImp = R.array.desc_isp_imp_0_6_8;
                _resDescNotImp = R.array.desc_isp_not_imp_0_6_8;
            }
            else {
                resImp = R.array.imp_isp_1_6_8;
                resNotImp = R.array.not_imp_isp_1_6_8;
                resInf = R.array.inf_isp_1_6_8;
                _resDescImp = R.array.desc_isp_imp_1_6_8;
                _resDescNotImp = R.array.desc_isp_not_imp_1_6_8;
            }
        }

        if( age >= 9 && age <= 10 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_9_10;
                resNotImp = R.array.not_imp_isp_0_9_10;
                resInf = R.array.inf_isp_0_9_10;
                _resDescImp = R.array.desc_isp_imp_0_9_10;
                _resDescNotImp = R.array.desc_isp_not_imp_0_9_10;
            }
            else {
                resImp = R.array.imp_isp_1_9_10;
                resNotImp = R.array.not_imp_isp_1_9_10;
                resInf = R.array.inf_isp_1_9_10;
                _resDescImp = R.array.desc_isp_imp_1_9_10;
                _resDescNotImp = R.array.desc_isp_not_imp_1_9_10;
            }
        }

        if( age >= 11 && age <= 12 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_11_12;
                resNotImp = R.array.not_imp_isp_0_11_12;
                resInf = R.array.inf_isp_0_11_12;
                _resDescImp = R.array.desc_isp_imp_0_11_12;
                _resDescNotImp = R.array.desc_isp_not_imp_0_11_12;
            }
            else {
                resImp = R.array.imp_isp_1_11_12;
                resNotImp = R.array.not_imp_isp_1_11_12;
                resInf = R.array.inf_isp_1_11_12;
                _resDescImp = R.array.desc_isp_imp_1_11_12;
                _resDescNotImp = R.array.desc_isp_not_imp_1_11_12;
            }
        }

        if( age >= 13 && age <= 15 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_13_15;
                resNotImp = R.array.not_imp_isp_0_13_15;
                resInf = R.array.inf_isp_0_13_15;
                _resDescImp = R.array.desc_isp_imp_0_13_15;
                _resDescNotImp = R.array.desc_isp_not_imp_0_13_15;
            }
            else {
                resImp = R.array.imp_isp_1_13_15;
                resNotImp = R.array.not_imp_isp_1_13_15;
                resInf = R.array.inf_isp_1_13_15;
                _resDescImp = R.array.desc_isp_imp_1_13_15;
                _resDescNotImp = R.array.desc_isp_not_imp_1_13_15;
            }
        }

        if( age >= 16 && age <= 17 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_16_17;
                resNotImp = R.array.not_imp_isp_0_16_17;
                resInf = R.array.inf_isp_0_16_17;
                _resDescImp = R.array.desc_isp_imp_0_16_17;
                _resDescNotImp = R.array.desc_isp_not_imp_0_16_17;
            }
            else {
                resImp = R.array.imp_isp_1_16_17;
                resNotImp = R.array.not_imp_isp_1_16_17;
                resInf = R.array.inf_isp_1_16_17;
                _resDescImp = R.array.desc_isp_imp_1_16_17;
                _resDescNotImp = R.array.desc_isp_not_imp_1_16_17;
            }
        }

        if( age >= 18 && age <= 24 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_18_24;
                resNotImp = R.array.not_imp_isp_0_18_24;
                resInf = R.array.inf_isp_0_18_24;
                _resDescImp = R.array.desc_isp_imp_0_18_24;
                _resDescNotImp = R.array.desc_isp_not_imp_0_18_24;
            }
            else {
                resImp = R.array.imp_isp_1_18_24;
                resNotImp = R.array.not_imp_isp_1_18_24;
                resInf = R.array.inf_isp_1_18_24;
                _resDescImp = R.array.desc_isp_imp_1_18_24;
                _resDescNotImp = R.array.desc_isp_not_imp_1_18_24;
            }

        }

        if( age >= 25 && age <= 29 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_25_29;
                resNotImp = R.array.not_imp_isp_0_25_29;
                resInf = R.array.inf_isp_0_25_29;
                _resDescImp = R.array.desc_isp_imp_0_25_29;
                _resDescNotImp = R.array.desc_isp_not_imp_0_25_29;
            }
            else {
                resImp = R.array.imp_isp_1_25_29;
                resNotImp = R.array.not_imp_isp_1_25_29;
                resInf = R.array.inf_isp_1_25_29;
                _resDescImp = R.array.desc_isp_imp_1_25_29;
                _resDescNotImp = R.array.desc_isp_not_imp_1_25_29;
            }
        }

        if( age >= 30 && age <= 34 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_30_34;
                resNotImp = R.array.not_imp_isp_0_30_34;
                resInf = R.array.inf_isp_0_30_34;
                _resDescImp = R.array.desc_isp_imp_0_30_34;
                _resDescNotImp = R.array.desc_isp_not_imp_0_30_34;
            }
            else {
                resImp = R.array.imp_isp_1_30_34;
                resNotImp = R.array.not_imp_isp_1_30_34;
                resInf = R.array.inf_isp_1_30_34;
                _resDescImp = R.array.desc_isp_imp_1_30_34;
                _resDescNotImp = R.array.desc_isp_not_imp_1_30_34;
            }
        }

        if( age >= 35 && age <= 39 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_35_39;
                resNotImp = R.array.not_imp_isp_0_35_39;
                resInf = R.array.inf_isp_0_35_39;
                _resDescImp = R.array.desc_isp_imp_0_35_39;
                _resDescNotImp = R.array.desc_isp_not_imp_0_35_39;
            }
            else {
                resImp = R.array.imp_isp_1_35_39;
                resNotImp = R.array.not_imp_isp_1_35_39;
                resInf = R.array.inf_isp_1_35_39;
                _resDescImp = R.array.desc_isp_imp_1_35_39;
                _resDescNotImp = R.array.desc_isp_not_imp_1_35_39;
            }
        }

        if( age >= 40 && age <= 44 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_40_44;
                resNotImp = R.array.not_imp_isp_0_40_44;
                resInf = R.array.inf_isp_0_40_44;
                _resDescImp = R.array.desc_isp_imp_0_40_44;
                _resDescNotImp = R.array.desc_isp_not_imp_0_40_44;
            }
            else {
                resImp = R.array.imp_isp_1_40_44;
                resNotImp = R.array.not_imp_isp_1_40_44;
                resInf = R.array.inf_isp_1_40_44;
                _resDescImp = R.array.desc_isp_imp_1_40_44;
                _resDescNotImp = R.array.desc_isp_not_imp_1_40_44;

            }
        }

        if( age >= 45 && age <= 49 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_45_49;
                resNotImp = R.array.not_imp_isp_0_45_49;
                resInf = R.array.inf_isp_0_45_49;
                _resDescImp = R.array.desc_isp_imp_0_45_49;
                _resDescNotImp = R.array.desc_isp_not_imp_0_45_49;
            }
            else {
                resImp = R.array.imp_isp_1_45_49;
                resNotImp = R.array.not_imp_isp_1_45_49;
                resInf = R.array.inf_isp_1_45_49;
                _resDescImp = R.array.desc_isp_imp_1_45_49;
                _resDescNotImp = R.array.desc_isp_not_imp_1_45_49;
            }
        }

        if( age >= 50 && age <= 54 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_50_54;
                resNotImp = R.array.not_imp_isp_0_50_54;
                resInf = R.array.inf_isp_0_50_54;
                _resDescImp = R.array.desc_isp_imp_0_50_54;
                _resDescNotImp = R.array.desc_isp_not_imp_0_50_54;
            }
            else {
                resImp = R.array.imp_isp_1_50_54;
                resNotImp = R.array.not_imp_isp_1_50_54;
                resInf = R.array.inf_isp_1_50_54;
                _resDescImp = R.array.desc_isp_imp_1_50_54;
                _resDescNotImp = R.array.desc_isp_not_imp_1_50_54;
            }
        }

        if( age >= 55 && age <= 59 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_55_59;
                resNotImp = R.array.not_imp_isp_0_55_59;
                resInf = R.array.inf_isp_0_55_59;
                _resDescImp = R.array.desc_isp_imp_0_55_59;
                _resDescNotImp = R.array.desc_isp_not_imp_0_55_59;
            }
            else {
                resImp = R.array.imp_isp_1_55_59;
                resNotImp = R.array.not_imp_isp_1_55_59;
                resInf = R.array.inf_isp_1_55_59;
                _resDescImp = R.array.desc_isp_imp_1_55_59;
                _resDescNotImp = R.array.desc_isp_not_imp_1_55_59;
            }
        }

        if( age >= 60 && age <= 64 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_60_64;
                resNotImp = R.array.not_imp_isp_0_60_64;
                resInf = R.array.inf_isp_0_60_64;
                _resDescImp = R.array.desc_isp_imp_0_60_64;
                _resDescNotImp = R.array.desc_isp_not_imp_0_60_64;
            }
            else {
                resImp = R.array.imp_isp_1_60_64;
                resNotImp = R.array.not_imp_isp_1_60_64;
                resInf = R.array.inf_isp_1_60_64;
                _resDescImp = R.array.desc_isp_imp_1_60_64;
                _resDescNotImp = R.array.desc_isp_not_imp_1_60_64;
            }
        }

        if( age >= 65 && age <= 69 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_65_69;
                resNotImp = R.array.not_imp_isp_0_65_69;
                resInf = R.array.inf_isp_0_65_69;
                _resDescImp = R.array.desc_isp_imp_0_65_69;
                _resDescNotImp = R.array.desc_isp_not_imp_0_65_69;
            }
            else {
                resImp = R.array.imp_isp_1_65_69;
                resNotImp = R.array.not_imp_isp_1_65_69;
                resInf = R.array.inf_isp_1_65_69;
                _resDescImp = R.array.desc_isp_imp_1_65_69;
                _resDescNotImp = R.array.desc_isp_not_imp_1_65_69;
            }
        }

        if( age >= 70 ) {
            if( gender == 0 ) {
                resImp = R.array.imp_isp_0_70_0;
                resNotImp = R.array.not_imp_isp_0_70_0;
                resInf = R.array.inf_isp_0_70_0;
                _resDescImp = R.array.desc_isp_imp_0_70_0;
                _resDescNotImp = R.array.desc_isp_not_imp_0_70_0;
            }
            else {
                resImp = R.array.imp_isp_1_70_0;
                resNotImp = R.array.not_imp_isp_1_70_0;
                resInf = R.array.inf_isp_1_70_0;
                _resDescImp = R.array.desc_isp_imp_1_70_0;
                _resDescNotImp = R.array.desc_isp_not_imp_1_70_0;
            }
        }

        if( resImp == 0 ) {
            Toast.makeText(this, "Ошибка", Toast.LENGTH_SHORT).show();
            return;
        }

        final int resDescImp = _resDescImp;
        final int resDescNotImp = _resDescNotImp;

        iAdapter = ArrayAdapter.createFromResource(
                this, resImp, android.R.layout.simple_list_item_1);
        niAdapter = ArrayAdapter.createFromResource(
                this, resNotImp, android.R.layout.simple_list_item_1);
        infoArray = getResources().getStringArray(resInf);

        lvImp.setAdapter(iAdapter);
        lvNotImp.setAdapter(niAdapter);

        lvImp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(NormItemsActivity.this, NormDescActivity.class);

                String[] norm_items_desc;
                norm_items_desc = getResources().getStringArray(resDescImp);

                intent.putExtra("desc", norm_items_desc[position]);

                startActivity(intent);
            }
        });

        lvNotImp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(NormItemsActivity.this, NormDescActivity.class);

                String[] norm_items_desc;
                norm_items_desc = getResources().getStringArray(resDescNotImp);

                intent.putExtra("desc", norm_items_desc[position]);

                startActivity(intent);
            }
        });

        tabInformationView.setText( getString(R.string.info_desc_text) + ":\n\n" + getString(R.string.text_gold) + ": " + infoArray[1] + "\n" + getString(R.string.text_silver) + ": " + infoArray[2] + "\n" + getString(R.string.text_bronze) + ": " + infoArray[3] + "\n\n" + getString(R.string.text_isp_all) + ": " + infoArray[0] );


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
