/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_1;

/**
 *
 * @author Ayomide Adewale
 */
public class Question_1 {

    public static void main(String[] args) {
        int height = 4; 
        int width = 12;
        
        int sectionWidth = width / 3;
        
        for (int i = 0; i < height; i++){
            for(int j = 0; j < sectionWidth; j++ ){
                System.out.print("*");
            }
            for(int j = 0; j < sectionWidth; j++){
                System.out.print("=");
            }
            for(int j = 0; j < sectionWidth; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}