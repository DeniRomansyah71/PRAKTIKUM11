/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5;

/**
 *
 * @author deni romansyah
 */
public class grade5 {
    public static void main( String[] args ){
            String names[] = {"Beah", "Bianca", "Lance", "Beah"};
            int count = 0;
                for(int i=0; i<names.length; i++){
                        if( !names[i].equals("Beah") ){
                            continue; //skip next statement
                        }
                    count++;
                }
            System.out.println("There are " + count + " Beahs in the list");
    }    
}
