package com.example.evenimente.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Eveniment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denumire;
    private String locatie;
    private LocalDate data;
    private LocalTime timp;
    private double pretBilet;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public String getLocatie() {
        return locatie;
    }
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getTimp() {
        return timp;
    }
    public void setTimp(LocalTime timp) {
        this.timp = timp;
    }
    public double getPretBilet() {
        return pretBilet;
    }
    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }
}
