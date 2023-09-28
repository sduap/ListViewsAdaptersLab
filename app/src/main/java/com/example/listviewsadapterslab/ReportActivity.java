package com.example.listviewsadapterslab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {

    public static final String EXTRA_REPORTID="reportId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        int reportId=(Integer) getIntent().getExtras().get(EXTRA_REPORTID);
        Report report=Report.reportes[reportId];

        TextView reporte_name=findViewById(R.id.reporte_name);
        reporte_name.setText(report.getName());

        TextView reporte_description=findViewById(R.id.reporte_description);
        reporte_description.setText(report.getDescription());

        ImageView photo=(ImageView)findViewById(R.id.photo);
        photo.setImageResource(report.getImageResourceId());
        photo.setContentDescription(report.getName());

    }
}