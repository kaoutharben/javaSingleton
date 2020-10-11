package com.company;

public class Terre_opt{
    static volatile private Terre_opt objetTerre =null;
    static int population;
    static int age;
    private Terre_opt(int population,int age){
        Terre.population=population;
        Terre.age=age;
    }
    public String toString() {
        return ("ObjetTerre : Poulation : "+population+" Age: "+age);
    }
    public static  Terre_opt getInstance(int population,int age ){
        if(objetTerre==null){
            synchronized (Terre.class){
                if(objetTerre==null)
                    objetTerre=new Terre_opt(population, age);
            }
        }

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
