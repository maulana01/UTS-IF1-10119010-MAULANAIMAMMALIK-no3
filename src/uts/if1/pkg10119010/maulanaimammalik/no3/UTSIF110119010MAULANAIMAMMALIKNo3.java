/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119010.maulanaimammalik.no3;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF-1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan berbagai 
 *                     genre musik dengan konsep OOP
 */
public class UTSIF110119010MAULANAIMAMMALIKNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MusicGenre jimmyHendrik = new MusicGenre();
        Rnb rnb = new Rnb();
        
        jimmyHendrik.setArtistName("Jimmy Hendrik");
        System.out.println(jimmyHendrik.getArtistName() + " adalah musisi " + jimmyHendrik.setArtistName(rnb.genreBlues(artistName)));
    }
    
}
