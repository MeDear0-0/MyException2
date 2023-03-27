/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception2;

/**
 *
 * @author Student
 */
public class Lab3 {
    public static void main(String[] args){
        try {
            System.out.println("Statement1");
            System.out.println(1/0);
            System.out.println("Statement3");
        }catch(IndexOutOfBoundsException e) {
        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement4");
        
    }
}
