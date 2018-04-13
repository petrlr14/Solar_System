package com.pdm00057616.solarsystem;

import java.io.Serializable;
import java.util.HashMap;

public class Planet implements Serializable{

    private String name;
    private HashMap<Integer, Integer> imageViewHashMap;
    private int indice, imageResource;


    public Planet(){
        init();
    }

    private void init(){
        imageViewHashMap=new HashMap<>();
        setArrayID();
    }


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setIndice(int indice){
        this.indice=indice;
    }

    public int getImageView(){
        return imageViewHashMap.get(indice);
    }


    private void setArrayID(){
        imageViewHashMap.put(0, R.drawable.mercury_1);
        imageViewHashMap.put(1, R.drawable.venus_2);
        imageViewHashMap.put(2, R.drawable.earth_3);
        imageViewHashMap.put(3, R.drawable.mars_4);
        imageViewHashMap.put(4, R.drawable.jupiter_5);
        imageViewHashMap.put(5, R.drawable.saturn_6);
        imageViewHashMap.put(6, R.drawable.uranos_7);
        imageViewHashMap.put(7, R.drawable.neptune_8);
    }

    public int getContent(){
        switch (indice){
            case 0: return R.string.Mercury;
            case 1: return R.string.Venus;
            case 2: return R.string.Earth;
            case 3: return R.string.Mars;
            case 4: return R.string.Jupiter;
            case 5: return R.string.Saturn;
            case 6: return R.string.Uranus;
            case 7: return R.string.Neptune;
        }
        return 10;
    }

    public int getColor(){
        switch (indice){
            case 0: return R.color.Mercury;
            case 1: return R.color.Venus;
            case 2: return R.color.Earth;
            case 3: return R.color.Mars;
            case 4: return R.color.Jupiter;
            case 5: return R.color.Saturn;
            case 6: return R.color.Uranus;
            case 7: return R.color.Neptune;
        }
        return 10;
    }

}