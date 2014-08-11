/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author root
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void cetakNama(){
        System.out.println("Nama :"+this.nama);
    }
    public void cetakNim(){
        System.out.println("NIM :"+this.nim);
    }
}

