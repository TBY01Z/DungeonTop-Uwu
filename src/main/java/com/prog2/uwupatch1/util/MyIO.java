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

    /**
     *
     * @param arg ausgabe des Strings "arg" in der Console.
     */
    public static void print(String arg){
        System.out.println(arg);
       
    }
    public static int random(int min,int max){
        Random rn = new Random();
        return rn.nextInt(max-min+1)+min;
    }

}