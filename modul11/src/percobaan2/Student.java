/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author deni romansyah
 */
public class Student extends Person{
    public Student()
    {
    System.out.println("Inside Student:Constructor");
    }
    public String getName() {
        System.out.println("Student Name : " +name);
        return name;
    }
    public static void main( String[] args) {
    Student anna = new Student();
    }   
}
