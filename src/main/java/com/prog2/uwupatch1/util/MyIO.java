/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.uwupatch1.util;
import java.util.Random;

/**
 *
 * @author rieck
 * TODO: Check Grammatical
 */
public class MyIO {
    private static int MIN_RANDOM_VALUE = 0;
    private static int MAX_RANDOM_VALUE = 999999999;

    /**
     *
     * @param arg ausgabe des Strings "arg" in der Console.
     */
    public static void print(String arg){
        System.out.println(arg);
       
    }
    public static int random(){
        Random rn = new Random();
        return rn.nextInt(MAX_RANDOM_VALUE-MIN_RANDOM_VALUE+1)+MIN_RANDOM_VALUE;
    }

}