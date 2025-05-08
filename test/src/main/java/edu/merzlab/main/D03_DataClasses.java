package edu.merzlab.main;

import edu.merzlab.model.DragonClass;

public class D03_DataClasses {
    public static void main(String[] args) {
        DragonClass fafnir = new DragonClass("Fafnir", "Fire", 1000);
        DragonClass smaug = new DragonClass("Smaug", "Fire");

        System.out.println(fafnir.getDragonType());
        System.out.println(smaug.getDragonType());
        
    }
}
