package com.example.jablanica_doo;

public class Delavci {

        private int id;
        private String ime;
        private String priimek;
        private String rojstniDan;
        private int ljubilej;

        public static Delavci delavec1 = new Delavci(1, "Anej", "Prvi", "1.1.2000", 5);
        public static Delavci delavec2 = new Delavci(2, "Janez", "Drugi", "15.8.1999", 0);
        public static Delavci delavec3 = new Delavci(3, "Miha", "Tretji", "3.6.2002", 2);

        public Delavci(int id, String ime, String priimek, String rojstniDan, int ljubilej) {
                this.id=id;
                this.ime=ime;
                this.priimek=priimek;
                this.rojstniDan=rojstniDan;
                this.ljubilej=ljubilej;
        }


        public static String[][] vrniSeznamDelavcev() {
                String[][] seznam = new String[2][3];
                seznam[0][0] = delavec1.ime;
                seznam[1][0] = delavec1.priimek;
                seznam[0][1] = delavec2.ime;
                seznam[1][1] = delavec2.priimek;
                seznam[0][2] = delavec3.ime;
                seznam[1][2] = delavec3.priimek;

                return seznam;
        }

        public String getIme() {
                return this.ime;
        }
        public String getPriimek() {
                return this.priimek;
        }

        public int izberiDelavca() {
            // TODO: implement
            return 0;
        }

        public int vrniNapako() {
            // TODO: implement
            return 0;
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
