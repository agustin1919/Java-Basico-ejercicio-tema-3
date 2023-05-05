package com.company;

public class EjercicioTemaTres {
    public static void main(String[] args) {
        String[] nombres = {"Facundo", "Paz", "Leandro", "Giuliano", "Zoe"};
        System.out.println(func(nombres));


    }
    public static String func(String[]array){
        String cadena="";
        for(int i=0; i<array.length; i++){
        cadena+=array[i] + ", " ;

        }
        return cadena;
    }
}
