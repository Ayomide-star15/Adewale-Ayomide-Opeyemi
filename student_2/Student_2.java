/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_2;

/**
 *
 * @author Ayomide Adewale
 */
public class Student_2 {
    public void writeExam(){
        System.out.println("Student is writting an exam");
        
    }
    

    public static void main(String[] args) {
        Undergraduate ug = new Undergraduate();
        ug.writeExam();
        ug.project();
        
        DiplomaStudent dp = new DiplomaStudent();
        dp.writeExam();
        dp.internship();
        System.out.println("Hello World!");
    }
}
