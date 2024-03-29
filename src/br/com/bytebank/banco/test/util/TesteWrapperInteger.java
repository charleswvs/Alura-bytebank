package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        int [] idades = new int [5];

        String[] nome = new String [5];

        int idade  = 29;//Integer

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); //unboxing

        String s = args[0]; //"10"

        //Integer numero = Integer.valueOf(s);
        Integer numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList();
        numeros.add(99); // autoboxing
    }
}
