package org.example;

public class Main {
    public static void main(String[] args) {
        //Una clase ClaseCadena que contenga un método DevuelveIniciales que permita devolver las iniciales de los nombres y apellidos que se pasan como argumento en forma de cadena.
        //Ejemplo: Si se pasa como argumento "Juan Pérez García" debe devolver "JPG".

        ClaseCadena cadena = new ClaseCadena();
        System.out.println(cadena.DevuelveIniciales("Juan Pérez García"));
        System.out.println(cadena.DevuelveIniciales2("Oscar Legal Perez"));
        System.out.println(cadena.DevuelveIniciales3("Paula Bergasa Corbella"));
        System.out.println(cadena.DevuelveIniciales4("Javier Garcia Perez"));
        System.out.println(cadena.DevuelveIniciales5("Marta Perez Gil"));
        System.out.println(cadena.DevuelveIniciales6("Roberto Perez Cao"));
        System.out.println(cadena.DevuelveIniciales7("Maria Luisa Gil Zapater"));
        System.out.println(cadena.DevuelveIniciales8("Sara Perez Gil"));
        System.out.println(cadena.DevuelveIniciales9("Hector Hevia Perez"));
        System.out.println(cadena.DevuelveIniciales10("David Hevia Perez"));
        System.out.println(cadena.DevuelveIniciales11(""));
    }
}