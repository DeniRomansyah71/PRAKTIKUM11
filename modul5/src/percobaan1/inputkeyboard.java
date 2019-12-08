/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author deni romansyah
 */
public class inputkeyboard {
    
    public static void main( String[] args ){
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in) );
    String name = "";
    System.out.print("Please Enter Your Name: ");
        try{
            name = dataIn.readLine();
        }catch( IOException e ){
        System.out.println("Error!");
        }
        System.out.println("Hello " + name +"!");
    }    
}
