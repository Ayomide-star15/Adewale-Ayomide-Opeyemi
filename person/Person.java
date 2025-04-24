/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author Ayomide Adewale
 */
public class Person {
    public void sleep(){
        System.out.println("Person is sleeping");
    }

    public static void main(String[] args) {
        postGraduate p = new postGraduate();
        p.sleep();
        p.read();
        p.research();
        System.out.println("Hello World!");
    }
}
