/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Ayomide Adewale
 */
public class Student {
    public void read(){
        System.out.println("Student is reading");
    }
    

    public static void main(String[] args) {
        Undergraduate u  = new Undergraduate();
        u.read();
        u.attendClass();
        System.out.println("Hello World!");
    }
}
