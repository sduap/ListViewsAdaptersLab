package com.example.listviewsadapterslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReportCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_category);

        ArrayAdapter<Report> adaptadorLista = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Report.reportes
        );

        ListView listaReportes = (ListView) findViewById(R.id.lista_reportes);
        listaReportes.setAdapter(adaptadorLista);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ReportCategoryActivity.this, ReportActivity.class);
                intent.putExtra(ReportActivity.EXTRA_REPORTID, (int)id);
                startActivity(intent);
            }
        };
        listaReportes.setOnItemClickListener(itemClickListener);

    }

}