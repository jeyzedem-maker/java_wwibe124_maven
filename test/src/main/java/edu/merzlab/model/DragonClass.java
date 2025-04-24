package edu.merzlab.model;

public class DragonClass {
    private final String name;
    private final String DragonType;
    private int age;

    public DragonClass(String name, String dragonType, int age) {
        this.name = name;
        this.DragonType = String.valueOf(dragonType.toUpperCase());
        this.age = age;
    }

    public DragonClass(String name, String dragonType) {
        this(name, dragonType, 0);
    }

    public String toString() {
        return "DragonClass{" +
                "name='" + name + '\'' +
                ", DragonType='" + DragonType + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
    public String getDragonType() {
        return DragonType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

