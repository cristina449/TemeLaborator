package com.exemplu.masini.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("masini")
public class Masina {
    @Id
    private String numarInmatriculare;
    private String marca;
    private int anFabricatie;
    private String culoare;
    private int kilometraj;

    public Masina(String numarInmatriculare, String marca, int anFabricatie, String culoare, int kilometraj) {
        this.numarInmatriculare = numarInmatriculare;
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
        this.kilometraj = kilometraj;
    }
    public Masina() {}
    public String getNumarInmatriculare() { return numarInmatriculare; }
    public void setNumarInmatriculare(String numarInmatriculare) { this.numarInmatriculare = numarInmatriculare; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getAnFabricatie() { return anFabricatie; }
    public void setAnFabricatie(int anFabricatie) { this.anFabricatie = anFabricatie; }
    public String getCuloare() { return culoare; }
    public void setCuloare(String culoare) { this.culoare = culoare; }
    public int getKilometraj() { return kilometraj; }
    public void setKilometraj(int kilometraj) { this.kilometraj = kilometraj; }
}
