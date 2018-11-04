/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Emberek {
    private List<Ember> emberekLista;
    public Emberek(){
        String[] nevek = {"Kis Géza","Kolompár Endre","Lakatos Krisztián","Nagy Andor","Kiss Mittudmén"};
        String[] szuletesiDatumok = {"1965-02-05","1967-05-02","1995-10-25","1988-05-15","2000-01-13"};
        String[] szuletesiHelyek = {"Budapest","Budapest","Gödöllő","Miskolc","Debrecen"};
        
        this.emberekLista = new ArrayList<Ember>();
        for (int i = 0; i < nevek.length; i++) {
            this.emberekLista.add(
                    new Ember(
                            nevek[i],
                            szuletesiDatumok[i],
                            szuletesiHelyek[i])
            );
        }
    }public String toString(){
        String s="";
            for (Ember e:  this.emberekLista) {
                s+=e+"\n";
            }
            return s;
    }
    public int adottHonapbanSzuletettekSzama(int honap){
        int db = 0;
        for (int i = 0; i < this.emberekLista.size(); i++) {
            if(this.emberekLista.get(i).szuletesiHonap() == honap){
                db++;
            }
        }
        return db;
    }
    public int atlagEletkor(){
        int s = 0;
        
        for (int i = 0; i < this.emberekLista.size(); i++) {
          
            s+=this.emberekLista.get(i).eletkor();
            
        }
        return (int)(s*1.0/this.emberekLista.size());
    }
    public Ember legfiatalabb(){
        int min = 0;
        for (int i = 1; i < this.emberekLista.size(); i++) {
            if(this.emberekLista.get(i).eletkor() < this.emberekLista.get(min).eletkor()){
                min = i;
            }
        }
        return this.emberekLista.get(min);
    }
    public int legidosebb(){
        int max = 0;
        for (int i = 1; i < this.emberekLista.size(); i++) {
            if(this.emberekLista.get(i).eletkor() > this.emberekLista.get(max).eletkor()){
                max = i;
            }
        }
        return this.emberekLista.indexOf(this.emberekLista.get(max))+1;
    }
   
    public Emberek(String fajl){
        this.emberekLista = new ArrayList<Ember>();
        try{
            FileReader fr = new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);
            
            String sor = br.readLine();
            while(sor != null){
                this.emberekLista.add(new Ember(sor));
                sor = br.readLine();
            }
            
            fr.close();
        }
        catch(Exception ex){
            System.out.println("Hiba: "+ex);
        }
    }
    
}
