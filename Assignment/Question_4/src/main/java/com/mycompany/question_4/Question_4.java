/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_4;

/**
 *
 * @author Ayomide Adewale
 */
import java.util.Scanner;
public class Question_4 {

    public static void main(String[] args) {
        int[] array = new int[10];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Please enter a value for index"  + i + ": ");
            array[i] = input.nextInt();
        }
                
        System.out.println("\nThe values entered by the user are: ");
        for(int value : array){
            System.out.println(value);
        }
    }
}
