package com.hacker.rank.practice;

import java.util.ArrayList;
import java.util.List;

import static com.hacker.rank.practice.extraordinarysubstrings.Result.countSubstrings;
import static com.hacker.rank.practice.maximumindex.Result.maxIndex;
import static com.hacker.rank.practice.passwordsecurity.Result.getMinFlips;
import static com.hacker.rank.practice.similarpassword.Result.countMinimumOperations;
import static com.hacker.rank.practice.stringconversion.Result.getMinimumOperations;
import static com.hacker.rank.practice.util.Constantes.*;

/**
 *
 * @author mhuahuacondori
 */
public class Prueba {

    public static void main(String[] args) {

        //1. Extraordinary Substrings
        inicioMetodo(METODO_UNO);
        List<String> arrayEstraordinarySubstring = new ArrayList<>();
        arrayEstraordinarySubstring.add("bdh");
        arrayEstraordinarySubstring.add("abcd");
        for (String str : arrayEstraordinarySubstring) {
            System.out.println(INPUT);
            System.out.println("> " + str);
            System.out.println(OUPUT);
            System.out.println("> " + countSubstrings(str));
            System.out.println(SEPARADOR_02);
        }
        finMetodo(METODO_UNO);

        //2. Maximum Index
        inicioMetodo(METODO_DOS);
        int[][] arrayMaximoIndex = {{2, 2}, {2, 1}, {3, 3}};
        for (int[] ints : arrayMaximoIndex) {
            System.out.println(INPUT);
            System.out.println("> steps: " + ints[0]);
            System.out.println("> badIndex: " + ints[1]);
            System.out.println(OUPUT);
            System.out.println("> " + maxIndex(ints[0], ints[1]));
            System.out.println(SEPARADOR_02);
        }
        finMetodo(METODO_DOS);

        //3. Similar Password
        inicioMetodo(METODO_TRES);
        List<String> arraySimilarPassword = new ArrayList<>();
        arraySimilarPassword.add("abcd");
        arraySimilarPassword.add("bigbangt");
        for (String str : arraySimilarPassword) {
            System.out.println(INPUT);
            System.out.println("> " + str);
            System.out.println(OUPUT);
            System.out.println("> " + countMinimumOperations(str));
            System.out.println(SEPARADOR_02);
        }
        finMetodo(METODO_TRES);

        //4. String Conversion
        inicioMetodo(METODO_CUATRO);
        List<String> arrayStringConversion = new ArrayList<>();
        arrayStringConversion.add("1111");
        arrayStringConversion.add("0000");
        for (String str : arrayStringConversion) {
            System.out.println(INPUT);
            System.out.println("> " + str);
            System.out.println(OUPUT);
            System.out.println("> " + getMinimumOperations(str));
            System.out.println(SEPARADOR_02);
        }
        finMetodo(METODO_CUATRO);

        //5. Password Security
        inicioMetodo(METODO_CINCO);
        List<String> arrayPassSecurity = new ArrayList<>();
        arrayPassSecurity.add("100110");
        arrayPassSecurity.add("101011");
        for (String str : arrayPassSecurity) {
            System.out.println(INPUT);
            System.out.println("> " + str);
            System.out.println(OUPUT);
            System.out.println("> " + getMinFlips(str));
            System.out.println(SEPARADOR_02);
        }
        finMetodo(METODO_CINCO);

    }

    public static void inicioMetodo(String metodo) {
        System.out.println(SEPARADOR_01);
        System.out.println(CORCHETE_IZQUIERDO + INICIO_METODO + metodo + CORCHETE_DERECHO);
    }

    public static void finMetodo(String metodo) {
        System.out.println(CORCHETE_IZQUIERDO + FIN_METODO + metodo + CORCHETE_DERECHO);
        System.out.println(SEPARADOR_01);
    }
}
