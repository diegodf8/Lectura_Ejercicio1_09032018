package com.cice.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String rutaFichero="Texto.txt";

    public static void main(String[] args) {

        FileReader fr;
        BufferedReader br;
        double Nota = 0.0;
        int NumNotas = 0;
        String [] linea;

        try {
            fr = new FileReader(rutaFichero);
            br = new BufferedReader(fr);
            String cadena = null;
            while ((cadena = br.readLine()) != null){
                System.out.println(cadena);
                linea = cadena.split("\\|");
                System.out.println("*****************");
                for(String aux: linea){
                    System.out.println("-" + aux + "-");
                    Nota+=Double.parseDouble(aux);
                    NumNotas++;
                }
            }
            System.out.println(Nota/NumNotas + "---> Nota Media");
            br.close();
            fr.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex2){
            ex2.printStackTrace();
        }


    }
}
