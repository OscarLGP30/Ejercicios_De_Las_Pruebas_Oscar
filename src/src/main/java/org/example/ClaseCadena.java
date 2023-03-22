package org.example;

public class ClaseCadena {
    public String DevuelveIniciales(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0);
        }
        return iniciales;
    }

    public String DevuelveIniciales2(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        for (int i = 0; i < palabras.length; i++) {
            iniciales += palabras[i].charAt(0);
        }
        return iniciales;
    }

    public String DevuelveIniciales3(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        int i = 0;
        while (i < palabras.length) {
            iniciales += palabras[i].charAt(0);
            i++;
        }
        return iniciales;
    }

    public String DevuelveIniciales4(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        int i = 0;
        do {
            iniciales += palabras[i].charAt(0);
            i++;
        } while (i < palabras.length);
        return iniciales;
    }

    public String DevuelveIniciales5(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        for (int i = 0, j = palabras.length; i < j; i++) {
            iniciales += palabras[i].charAt(0);
        }
        return iniciales;
    }

    public String DevuelveIniciales6(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        int i = 0, j = palabras.length;
        while (i < j) {
            iniciales += palabras[i].charAt(0);
            i++;
        }
        return iniciales;
    }

    public String DevuelveIniciales7(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        int i = 0, j = palabras.length;
        do {
            iniciales += palabras[i].charAt(0);
            i++;
        } while (i < j);
        return iniciales;
    }

    public String DevuelveIniciales8(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        for (int i = 0, j = palabras.length; i < j; i++) {
            iniciales += palabras[i].charAt(0);
        }
        return iniciales;
    }

    public String DevuelveIniciales9(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        int i = 0, j = palabras.length;
        while (i < j) {
            iniciales += palabras[i].charAt(0);
            i++;
        }
        return iniciales;
    }

    public String DevuelveIniciales10(String cadena) {
        String[] palabras = cadena.split(" ");
        String iniciales = "";
        int i = 0, j = palabras.length;
        do {
            iniciales += palabras[i].charAt(0);
            i++;
        } while (i < j);
        return iniciales;
    }
}
