package com.example.jablanica_doo;

import android.text.method.DialerKeyListener;

public class Dokumenti {
    private int id;
    private int veljavnostPogodbe;
    private int veljavnostVarstvoPriDelu;
    private int veljavnostZdravniskoSpricevalo;

    public static Dokumenti delavec1 = new Dokumenti(1, 2, 2, 4);
    public static Dokumenti delavec2 = new Dokumenti(2, 1, 4, 5);
    public static Dokumenti delavec3 = new Dokumenti(3, 3, 3, 1);

    public Dokumenti(int id, int veljavnostPogodbe, int veljavnostVarstvoPriDelu, int veljavnostZdravniskoSpricevalo) {
        this.id=id;
        this.veljavnostPogodbe=veljavnostPogodbe;
        this.veljavnostVarstvoPriDelu=veljavnostVarstvoPriDelu;
        this.veljavnostZdravniskoSpricevalo=veljavnostZdravniskoSpricevalo;
    }

    public static String vrniVeljavnostDokumentov(String delavecID) {
        Dokumenti[] seznam = new Dokumenti[3];
        seznam[0] = delavec1;
        seznam[1] = delavec2;
        seznam[2] = delavec3;
        for (int i = 0; i < seznam.length; i++) {
            if(String.valueOf(seznam[i].id).equals(delavecID)){
                return "\r\n Veljavnost pogodbe: " + String.valueOf(seznam[i].veljavnostPogodbe) +
                        " let \r\n Veljavnost varstva pri delu: " + String.valueOf(seznam[i].veljavnostVarstvoPriDelu) +
                        " let \r\n Veljavnost zdravniškega spričevala: " + String.valueOf(seznam[i].veljavnostZdravniskoSpricevalo) + " let" +
                        Statistika.vrniStatistiko(delavecID);
            }
        }
        return "";

    }

    public static void preveriVeljavnostDokumentov() {

    }
}
