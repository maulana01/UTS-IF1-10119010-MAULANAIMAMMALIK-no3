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
public class Metal extends MusicGenre implements Punk, HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.println("Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println("Heavy Metal");
    }
    
    @Override
    public void genrePunk(String artistName) {
        System.out.println("Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.println("Grunge");
    }
}
