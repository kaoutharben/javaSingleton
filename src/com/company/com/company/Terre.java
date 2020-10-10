package com.company;

public class Terre {
    static private Terre objetTerre =null;
    static int population;
    static int age;
    private Terre(int population,int age){
            Terre.population=population;
            Terre.age=age;
    }
    public String toString() {
        return ("ObjetTerre : Poulation : "+population+" Age: "+age);
    }
    public static Terre getInstance(int population,int age ){
        if(objetTerre==null)
            objetTerre=new Terre(population, age);
        return (objetTerre);
    }

    public static int getPopulation(){
        return (population);
    }
    public static int getAge(){
        return (age);
    }

    public static void setPopulation(int population) {
        Terre.population = population;
    }

    public static void setAge(int age) {
        Terre.age = age;
    }
}
