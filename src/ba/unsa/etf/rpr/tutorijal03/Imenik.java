package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    private String ime;
    private TelefonskiBroj broj;
    private HashMap<TelefonskiBroj, String> hmap = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        hmap.putIfAbsent(broj, ime);
    }

    String dajBroj(String ime) {
        return  broj.Ispisi();
    }

    String dajIme(TelefonskiBroj broj) {
        return hmap.get(broj);
    }


}
