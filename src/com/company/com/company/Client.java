package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client extends Thread {
    static int  population;
    static int age;

    @Override
    public void run() {
        System.out.println("ENTRER AGE: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            age= Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ENTRER LA POPULATION: ");
        BufferedReader readerPop = new BufferedReader(new InputStreamReader(System.in));
        try {
            population= Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Terre terre=Terre.getInstance(population,age);
        System.out.println(Thread.currentThread().getId()+" TERRE: "+ terre);

    }

    public static void main(String[] args)  {

        Client client=new Client();
        client.start();
        Client client1=new Client();
        client1.start();


    }
}
