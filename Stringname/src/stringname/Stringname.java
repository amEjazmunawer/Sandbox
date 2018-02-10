/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringname;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Stringname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String name;
        
        System.out.println("Please enter your full name.");
        name = value.nextLine();
        String[] splitstr = name.split("\\s");
        
        
        System.out.println(splitstr[0]);
        System.out.println(splitstr[1]);
        System.out.println(splitstr[2]);
        
        
           
       
        
        
        
        
    }
    
}
