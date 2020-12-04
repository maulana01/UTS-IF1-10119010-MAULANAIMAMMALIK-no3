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
        Rnb blues = new Rnb();
        blues.genreBlues("Jimmy Hendrik");
        
        Rnb jazz = new Rnb();
        jazz.genreJazz("Chad Baker");
        
        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        
        Rockabilly rockabilly = new Rockabilly();
        rockabilly.genreRockabilly("Elvis Presley");
        
        HardRock progressiveRock = new HardRock();
        progressiveRock.genreProgressiveRock("DreamTheater");
        
        HardRock psychedellic = new HardRock();
        psychedellic.genrePsychedellicRock("The Doors");
        
        HardRock popRock = new HardRock();
        popRock.genrePopRock("Kiss");
        
        Metal punk = new Metal();
        punk.genrePunk("MXPX");
        
        Metal heavyMetal = new Metal();
        heavyMetal.genreHeavyMetal("METALLICA");
        
        GrindCore grindcore = new GrindCore();
        grindcore.genreGrindCore("Mesin Tempur");
        
        DeathMetal deathMetal = new DeathMetal();
        deathMetal.genreDeathMetal("JASAD");
        
        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal blackMetal = new BlackMetal();
        blackMetal.genreBlackMetal("Behemoth");
        
        NewSkul newSkul = new NewSkul();
        newSkul.genreNewSkul("HATEBREED");
    }
    
}
