package com.example.Rabota.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String CarBrand;
    private String carsmodel;
    private String year_release;
    private String color;
    private String VIN;
    private int horsepower;
    private String engine_capacity;

    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;}

    public String getCarBrand() {return CarBrand;}

    public void setCarBrand(String CarBrand) {this.CarBrand = CarBrand;}

    public String getCarsmodel() {return carsmodel;}

    public void setCarsmodel(String carsmodel) {this.carsmodel = carsmodel;}

    public String getYear_release() {return year_release;}

    public void setYear_release(String year_release) {this.year_release = year_release;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getVIN() {return VIN;}

    public void setVIN(String VIN) {this.VIN = VIN;}

    public int getHorsepower() {return horsepower;}

    public void setHorsepower(int horsepower) {this.horsepower = horsepower;}

    public String getEngine_capacity() {return engine_capacity;}

    public void setEngine_capacity(String engine_capacity) {this.engine_capacity = engine_capacity;}

    public Cars() {}

    public Cars(String CarBrand, String carsmodel, String year_release, String color, String VIN, int horsepower, String engine_capacity) {
        this.CarBrand = CarBrand;
        this.carsmodel = carsmodel;
        this.year_release = year_release;
        this.color = color;
        this.VIN = VIN;
        this.horsepower = horsepower;
        this.engine_capacity = engine_capacity;
    }
}
