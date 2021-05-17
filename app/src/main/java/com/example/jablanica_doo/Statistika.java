package com.example.jablanica_doo;

public class Statistika {
    private int id;
    private int povprecnoSteviloUrDan;
    private int povprecnoSteviloUrMesec;
    private int povprecnoSteviloUrLeto;
    private int steviloDelovnihDni;

    public static Statistika delavec1 = new Statistika(1, 7, 168, 2016 , 1800);
    public static Statistika delavec2 = new Statistika(2, 8, 170, 2100 , 1900);
    public static Statistika delavec3 = new Statistika(3, 7, 150, 2050 , 1850);

    public Statistika(int id, int povprecnoSteviloUrDan, int povprecnoSteviloUrMesec, int povprecnoSteviloUrLeto, int steviloDelovnihDni) {
        this.id=id;
        this.povprecnoSteviloUrDan=povprecnoSteviloUrDan;
        this.povprecnoSteviloUrMesec=povprecnoSteviloUrMesec;
        this.povprecnoSteviloUrLeto=povprecnoSteviloUrLeto;
        this.steviloDelovnihDni=steviloDelovnihDni;
    }



    public static String vrniStatistiko(String delavecID) {
        Statistika[] seznam = new Statistika[3];
        seznam[0] = delavec1;
        seznam[1] = delavec2;
        seznam[2] = delavec3;
        for (int i = 0; i < seznam.length; i++) {
            if(String.valueOf(seznam[i].id).equals(delavecID)){
                return " \r\n Povprečno število ur na dan: " + String.valueOf(seznam[i].povprecnoSteviloUrDan) +
                        " \r\n Povprečno število ur na mesec: " + String.valueOf(seznam[i].povprecnoSteviloUrMesec) +
                        " \r\n Povprečno število ur na leto: " + String.valueOf(seznam[i].povprecnoSteviloUrLeto) +
                        " \r\n Število delovnih dni: " + String.valueOf(seznam[i].steviloDelovnihDni);
            }
        }
        return "";
    }
}
