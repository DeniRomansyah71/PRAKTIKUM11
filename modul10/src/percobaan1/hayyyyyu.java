/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author deni romansyah
 */
public class hayyyyyu {
    public static void main( String[] args ){
    //membuat 3 object StudentRecord
    StudentRecord annaRecord = new StudentRecord();
    StudentRecord beahRecord = new StudentRecord();
    StudentRecord crisRecord = new StudentRecord();
    
    //Memberi nama siswa
    annaRecord.setName("Anna");
    beahRecord.setName("Beah");
    crisRecord.setName("Cris");
    
    //Menampilkan nama siswa “Anna”
    System.out.println(annaRecord.getName());
    
    //Menampilkan jumlah siswa
    System.out.println("Count="+StudentRecord.getStudentCount());
    }    
}
