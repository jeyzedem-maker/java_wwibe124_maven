package edu.merzlab.main;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class D07_Optionals {
    public static void main(String[] args) {
        String text = getText();
        System.out.println(text.toUpperCase());
    }
    private static String getText(){
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Hallo";
        } else {
            return null;
            
        }
    }

    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        return list;
    }
}
