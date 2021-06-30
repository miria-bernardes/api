package com.mercadolivre.bootcamp.api.services;

import org.springframework.stereotype.Service;

import java.util.TreeMap;

@Service
public class ConversorService {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public String conversor(int numero) {

        int l =  map.floorKey(numero);
        if ( numero == l ) {
            return map.get(numero);
        }
        return map.get(l) + conversor(numero-l);

    }

}
