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


    /**
     * @return the value of the planet image id
     */
    public int getImageView(){
        return imageViewHashMap.get(indice);
    }


    private void setArrayID(){
        imageViewHashMap.put(0, R.drawable.sun_0);
        imageViewHashMap.put(1, R.drawable.mercury_1);
        imageViewHashMap.put(2, R.drawable.venus_2);
        imageViewHashMap.put(3, R.drawable.earth_3);
        imageViewHashMap.put(4, R.drawable.mars_4);
        imageViewHashMap.put(5, R.drawable.jupiter_5);
        imageViewHashMap.put(6, R.drawable.saturn_6);
        imageViewHashMap.put(7, R.drawable.uranos_7);
        imageViewHashMap.put(8, R.drawable.neptune_8);
    }


    /**
     * @return the value of the string id used for description
     */
    public int getContent(){
        switch (indice){
            case 0: return R.string.Sun;
            case 1: return R.string.Mercury;
            case 2: return R.string.Venus;
            case 3: return R.string.Earth;
            case 4: return R.string.Mars;
            case 5: return R.string.Jupiter;
            case 6: return R.string.Saturn;
            case 7: return R.string.Uranus;
            case 8: return R.string.Neptune;
        }
        return 10;
    }


    /**
     * @return the value of the color id by planet
     * @author Pedro Gómez
     */
    public int getColor(){
        switch (indice){
            case 0: return R.color.Sun;
            case 1: return R.color.Mercury;
            case 2: return R.color.Venus;
            case 3: return R.color.Earth;
            case 4: return R.color.Mars;
            case 5: return R.color.Jupiter;
            case 6: return R.color.Saturn;
            case 7: return R.color.Uranus;
            case 8: return R.color.Neptune;
        }
        return 10;
    }

}
