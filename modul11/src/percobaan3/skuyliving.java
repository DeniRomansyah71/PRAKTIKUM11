/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author deni romansyah
 */
public abstract class skuyliving {
    public void breath(){
        System.out.println("Living Thing breathing..."); 
    }
    public void eat(){
        System.out.println("Living Thing eating...");
    }
    /**
    * abstract method walk
    * Kita ingin method ini di-overridden oleh subclasses
    */
    public abstract void walk();
}
