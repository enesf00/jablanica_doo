package com.example.jablanica_doo;

import android.content.Context;

public class KPregledDelavca {

    public java.util.Collection delavci;
    public Statistika statistika;


    public static String[][] vrniSeznamDelavcev() {
        return Delavci.vrniSeznamDelavcev();
    }

    public static String izberiDelavca(String delavecID) {
        return (Delavci.izberiDelavca(delavecID));
    }

    public static void vrniPodrobnePodatke(String podatki) {

    }

    public static void vrniNapako(String s) {
        // TODO: implement
        if (s.equals("Prazen seznam"))
        MainActivity.prikaziNapako ("Prazen seznam" );
        else
            MainActivity.prikaziNapako ("Druge napake...");
    }

    public int vrniLjubilej() {
        // TODO: implement
        return 0;
    }

    public static String vrniRojstniDan() {
        return Delavci.vrniRojstniDan();
    }

    public int dodajLjubilej() {
        // TODO: implement
        return 0;
    }

    public int dodajRojstniDan() {
        // TODO: implement
        return 0;
    }


    public java.util.Collection getDelavci() {
        if (delavci == null)
            delavci = new java.util.HashSet();
        return delavci;
    }

    public java.util.Iterator getIteratorDelavci() {
        if (delavci == null)
            delavci = new java.util.HashSet();
        return delavci.iterator();
    }


    public void setDelavci(java.util.Collection newDelavci) {
        removeAllDelavci();
        for (java.util.Iterator iter = newDelavci.iterator(); iter.hasNext();)
            addDelavci((Delavci)iter.next());
    }


    public void addDelavci(Delavci newDelavci) {
        if (newDelavci == null)
            return;
        if (this.delavci == null)
            this.delavci = new java.util.HashSet();
        if (!this.delavci.contains(newDelavci))
            this.delavci.add(newDelavci);
    }

    public void removeDelavci(Delavci oldDelavci) {
        if (oldDelavci == null)
            return;
        if (this.delavci != null)
            if (this.delavci.contains(oldDelavci))
                this.delavci.remove(oldDelavci);
    }

    public void removeAllDelavci() {
        if (delavci != null)
            delavci.clear();
    }

    public Statistika getStatistika() {
        return statistika;
    }


    public void setStatistika(Statistika newStatistika) {
        this.statistika = newStatistika;
    }
}
