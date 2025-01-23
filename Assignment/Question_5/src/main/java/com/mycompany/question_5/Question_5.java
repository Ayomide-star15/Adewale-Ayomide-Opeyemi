/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_5;

/**
 *
 * @author Ayomide Adewale
 */
import java.util.Scanner;
public class Question_5 {

    public static void main(String[] args) {
        int [][] array = new int[2][2];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("Please enter a value for index [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
            
                
            }
        System.out.println("\nThe values entered by the user are: ");
        for(int[] row : array){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
