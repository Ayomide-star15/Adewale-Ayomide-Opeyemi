/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_2;

/**
 *
 * @author Ayomide Adewale
 */
public class Question_2 {

    public static void main(String[] args) {
        int height = 6;
        int width = 11;
        
        int starsHeight = 3;
        int starsWidth = width / 2;
        
        for(int i = 0; i < height; i++){
            if(i < starsHeight){
                for(int j = 0; j < width; j++){
                   if(j < starsWidth){
                       System.out.print("*");
                   
                }else{
                       System.out.print("=");
                   }
                }
            }else{
                for(int j= 0; j < width; j++){
                    System.out.print("=");   
                }    
            }
             System.out.println();
                   
      
}
    }
}