/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;

import java.time.LocalDateTime;

/**
 *
 * @author Diak
 */
public class Ember {
    //adattagjai
    
    private String nev;
    private String szulDatum;
    private String szulHely;
    
    
    //Osztály metódusok
    
    //Konstruktor
    
    public Ember(){//default
    
    }
    public String getNev(){
        return this.nev;
    }
    //"kis géza";"1997-22-21";"pöst"
    public Ember(String adatSor){
        String[] adatok = adatSor.split(";");
        this.nev = adatok[0];
        this.szulDatum = adatok[1];
        this.szulHely = adatok[2];
        
    }
    public Ember(String nev, String szulDatum, String szulHely){
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
        
    }
    
    public void sajt(){
        System.out.println("Kockacukor");
    }
    @Override
    public String toString(){
        return String.format("%-25s %-10s %-20s",this.nev,this.szulDatum,this.szulHely);
    }
    
    public int szuletesEv(){
        return Integer.parseInt(this.szulDatum.substring(0, 4));
    }
    public int szuletesiHonap(){
        String[] adatok = this.szulDatum.split("-");
        return Integer.parseInt(adatok[1]);
    }
    public int szulNap(){
        String[] adatok = this.szulDatum.split("-");
        return Integer.parseInt(adatok[2]);
    }
    public int eletkor(){
        return LocalDateTime.now().getYear()-this.szuletesEv();
    }
    public String vezetekNev()
    {
        return this.nev.substring(0, this.nev.indexOf(' '));
    }
    public String keresztnev()
    {
        return this.nev.substring(this.nev.indexOf(' ')+1);
    }
        
    public String monogram()
        {
           //String s = this.nev.substring(0, 1) +"."+ this.nev.substring(this.nev.indexOf(" ")+1, 1);
           return this.nev.charAt(0)+"."+this.nev.charAt(this.nev.indexOf(" ")+1);
           //return s;
            
        
    } 
            
           
        
     
}
