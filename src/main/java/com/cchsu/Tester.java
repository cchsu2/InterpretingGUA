package com.cchsu;

import java.util.List;

import static com.cchsu.Trigram.getAllTrigram;

public class Tester {
    public static void main(String[] args) {
//        Product keyboard = new Product();
//        Product mouse = new Product();

        List<Trigram> tri = getAllTrigram();
        for (Trigram i : tri) {
            System.out.println(i.name);
        }
    }
}
