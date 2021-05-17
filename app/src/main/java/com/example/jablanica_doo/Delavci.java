package com.example.jablanica_doo;

public class Delavci {

        private int id;
        private String ime;
        private String priimek;
        private String rojstniDan;
        private String ljubilej;

        public static Delavci delavec1 = new Delavci(1, "Anej", "Prvi", "1.1.2000", "14.9.2015");
        public static Delavci delavec2 = new Delavci(2, "Janez", "Drugi", "15.8.1999", "18.7.2017");
        public static Delavci delavec3 = new Delavci(3, "Miha", "Tretji", "3.6.2002", "7.2.2019");

        public Delavci(int id, String ime, String priimek, String rojstniDan, String ljubilej) {
                this.id=id;
                this.ime=ime;
                this.priimek=priimek;
                this.rojstniDan=rojstniDan;
                this.ljubilej=ljubilej;
        }


        public static String[][] vrniSeznamDelavcev(){
                //V primeru da ne bi bil hard codan seznam uporabimo try catch za lovljenje napake;
                String[][] seznam = new String[3][3];
                try {
                        seznam[0][0] = String.valueOf(delavec1.id);
                        seznam[1][0] = delavec1.ime;
                        seznam[2][0] = delavec1.priimek;
                        seznam[0][1] = String.valueOf(delavec2.id);
                        seznam[1][1] = delavec2.ime;
                        seznam[2][1] = delavec2.priimek;
                        seznam[0][2] = String.valueOf(delavec3.id);
                        seznam[1][2] = delavec3.ime;
                        seznam[2][2] = delavec3.priimek;
                }catch (Exception e){
                        vrniNapako("Prazen seznam");
                        return null;
                }
                return seznam;
        }

        public String getIme() {
                return this.ime;
        }
        public String getPriimek() {
                return this.priimek;
        }

        public static String izberiDelavca(String delavecID) {
                Delavci[] seznam = new Delavci[3];
                seznam[0] = delavec1;
                seznam[1] = delavec2;
                seznam[2] = delavec3;
                for (int i = 0; i < seznam.length; i++) {
                        if(String.valueOf(seznam[i].id).equals(delavecID)){
                                return " Ime: " + String.valueOf(seznam[i].ime) +
                                        "\r\n Priimek: " + String.valueOf(seznam[i].priimek) +
                                        "\r\n Rojstni dan: " + String.valueOf(seznam[i].rojstniDan) +
                                        "\r\n Ljubilej: " + String.valueOf(seznam[i].ljubilej) +
                                        Podatki.vrniPodatke(delavecID);
                        }
                }
                return "";
        }

        public static void vrniNapako(String s) {
                //vrnemo lahko različne tipe napak
            KPregledDelavca.vrniNapako(s);
        }

        public int dodajRojstniDan() {
            // TODO: implement
            return 0;
        }

        public int dodajLjubilej() {
            // TODO: implement
            return 0;
        }

        public int vrniLjubilej() {
            // TODO: implement
            return 0;
        }

        public int vrniRojstniDan() {
            // TODO: implement
            return 0;
        }
}
