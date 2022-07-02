package ca.georgian.comp1011m2022assignment2;

import java.util.Arrays;
import java.util.regex.*;

public class worldDB {

    // Private Instance Members
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private int Population;

// Constructors


    public worldDB(String code, String name, String continent, String region, int population) {
        setCode(code);
        setName(name);
        setContinent(continent);
        setRegion(region);
        setPopulation(population);
    }

    // Getters and Setters


    public String getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }

    public String getContinent() {
        return Continent;
    }

    public String getRegion() {
        return Region;
    }

    public int getPopulation() {
        return Population;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setContinent(String continent) {
        this.Continent = continent;
    }

    public void setRegion(String region) {
        this.Region = region;
    }

    public void setPopulation(int population) {
        this.Population = population;
    }

    /*public void setStudentNum(int studentNum) {

        if(studentNum < 200034000){
            throw new IllegalArgumentException("Student Number Invalid");
        }
        else {
            this.studentNum = studentNum;
        }
    }*/



    }
