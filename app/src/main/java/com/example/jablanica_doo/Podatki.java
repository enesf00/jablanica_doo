package com.example.jablanica_doo;

public class Podatki {

    private int id;
    private String drzavljanstvo;
    private String emso;
    private int davcnaStevilka;

    public static Podatki delavec1 = new Podatki(1, "Slovensko", "0101000500168", 14831579);
    public static Podatki delavec2 = new Podatki(2, "Slovensko", "1508999500787", 15135487);
    public static Podatki delavec3 = new Podatki(3, "Slovensko", "0306002500922", 98421246);

    public Podatki(int id, String drzavljanstvo, String emso, int davcnaStevilka) {
        this.id=id;
        this.drzavljanstvo=drzavljanstvo;
        this.emso=emso;
        this.davcnaStevilka=davcnaStevilka;
    }

    public static String vrniPodatke(String delavecID) {
        Podatki[] seznam = new Podatki[3];
        seznam[0] = delavec1;
        seznam[1] = delavec2;
        seznam[2] = delavec3;
        for (int i = 0; i < seznam.length; i++) {
            if(String.valueOf(seznam[i].id).equals(delavecID)){
                return "\r\n Državljanstvo: " + String.valueOf(seznam[i].drzavljanstvo) +
                        "\r\n EMŠO: " + String.valueOf(seznam[i].emso) +
                        "\r\n Davčna številka: " + String.valueOf(seznam[i].davcnaStevilka) + " " +
                        Dokumenti.vrniVeljavnostDokumentov(delavecID);
            }
        }
        return "";

    }
}
