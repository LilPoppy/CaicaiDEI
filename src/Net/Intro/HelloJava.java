/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Net.Intro;

import java.util.ArrayList;
import static javax.swing.text.StyleConstants.Family;

/**
 *
 * @author Administrator
 */
public class HelloJava {
    
    public static Family Country = new Family(); 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Person jacky = new Person("Jacky", "Cai" , (int) Math.random());
        Person jerry = new Person("Jerry", "Huang", 24);
        
        
        
        Country.add(jacky);
        Country.add(jerry);
        
        
        //family ids print out
        
        System.out.println(jacky.getFamily());
        System.out.println(jerry.getFamily());
        
        //solve add your family members into your family and output in console
        //..
    }
    
}
