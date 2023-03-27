/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception2;

/**
 *
 * @author Student
 */
public class Lab4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("Statement1");
            System.out.println(list[10]);
            System.out.println("Statement3");
        }catch(ArithmeticException ex1){
        }catch(IndexOutOfBoundsException ex2){
            throw ex2;
        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement4");
    }
}
