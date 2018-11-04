/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;

/**
 *
 * @author Diak
 */
public class EmberekOOP {

    
    public static void main(String[] args) {
       Ember akos = new Ember(); //Default
       Ember laszlo = new Ember("Debreczeni László","1996-01-13","Budapest");
        System.out.println(akos);
        System.out.println(laszlo);
        //akos.sajt();
        Ember niki = new Ember("Gáti Nikolett","1997-10-13","Szeged");
        System.out.println(niki);
        System.out.println(laszlo.szuletesEv());
        System.out.println(laszlo.szuletesiHonap());
        System.out.println(laszlo.szulNap());
        System.out.println(niki.eletkor());
        System.out.println(laszlo.monogram());
        System.out.println(laszlo.keresztnev());
        System.out.println(laszlo.vezetekNev());
        
        Emberek sokEmber = new Emberek();
        System.out.println(sokEmber);
        
        Emberek nagyonSokEmber = new Emberek("emberek.txt");
        System.out.println(nagyonSokEmber);
        
        System.out.println("A decemberben születettek száma: "
        +nagyonSokEmber.adottHonapbanSzuletettekSzama(12));
        
        System.out.println("Átlagos életkor "+ nagyonSokEmber.atlagEletkor());
        System.out.println("A legfiatalabb "+nagyonSokEmber.legfiatalabb().getNev());
        System.out.println("A legidősebb a "+nagyonSokEmber.legidosebb()+".");
        
    }
    
}
