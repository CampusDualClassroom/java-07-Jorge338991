package com.campusdual.classroom;
import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(9);
        sumFirstNaturalNumbers(2);
        showFirstNaturalNumbers(3);
    }

    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        boolean existe = false;
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            List.add(i);
        }
        for (Integer n : List) {
            //System.out.println(n);
            if (n.equals(num)) {
                existe = true;
                System.out.println("El elemento " + n + " se encuentra en la posición: " + (List.indexOf(num) + 1));
                break;
            }
        }
        if (!existe) {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int count = 0;
        int num_sum = num;
        int size;
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            List.add(i);
        }
        size = List.size();
        if (size >= num) {
            for (Integer number : List) {
                count += number;
                num_sum--;
                if (num_sum == 0) {
                    break;
                }
            }
            System.out.println("La suma de el/los " + num + " primeros numero/s positivo/s es: " + count);
        } else {
            System.out.println("La lista no tiene los " + num + " números que indicas, prueba a introducir otra cantidad" +
            " inferior o igual a " + size + ".");
        }
    }

    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 20; i > 0; i--) {
            List.add(i);
        }
        if (num > 0 && List.size() >= num) {
            for (int i = 0; i < num; i++) {
                //System.out.println("Posicion " + (i + 1) + " -> " + List.get(i));
                if (List.get(i) > -1) {
                    System.out.println(List.get(i));
                }
            }
        }

    }
}
