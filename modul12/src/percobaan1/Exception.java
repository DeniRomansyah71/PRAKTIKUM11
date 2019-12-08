/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author deni romansyah
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println( args[1] );
        }
        catch(ArrayIndexOutOfBoundsException exp){
            System.out.println("Exception caught!");
        }
    }
}
