package com.example.listviewsadapterslab;

import androidx.appcompat.app.AppCompatActivity;

public class Report extends AppCompatActivity {

    //Atributos
    private String name;
    private String description;
    private int imageResourceId;

    // Declarar un arrreglo de los reportes disponibles
    public static final Report[] reportes = {
            new Report("Colisión", "Choque o colisión de cualquier gravedad que obstruya el tráfico",R.drawable.carcrash),
            new Report("Varado", "Vehículo detenido en la vía",R.drawable.varado)
    };

    //Constructor con los atributos
    public Report(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //Metodos get y set

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    @Override
    public String toString() {
        return name;
    }

}
