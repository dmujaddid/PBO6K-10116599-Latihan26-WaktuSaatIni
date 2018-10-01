/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan26.waktusaatini;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program :
 * 
 */
public class PBO6K10116599Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    
     private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBO6K10116599Latihan26WaktuSaatIni tgl = new PBO6K10116599Latihan26WaktuSaatIni();
        System.out.println("Hari ini adalah hari : "+tgl.getTanggal());
    }
    
}
