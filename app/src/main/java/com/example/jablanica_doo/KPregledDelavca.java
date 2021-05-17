package com.example.jablanica_doo;

public class KPregledDelavca {
    /** @pdRoleInfo migr=no name=Delavci assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
    public java.util.Collection delavci;
    /** @pdRoleInfo migr=no name=Statistika assc=association6 mult=1 side=A */
    public Statistika statistika;

    /** @pdOid 83b76758-136e-4c79-ace4-8a771636ac80 */
    public static String[][] vrniSeznamDelavcev() {
        return Delavci.vrniSeznamDelavcev();
    }

    /** @pdOid a994b884-fe9b-4e6c-80a2-a8c3e78f4b74 */
    public static String izberiDelavca(String delavecID) {
        return (Delavci.izberiDelavca(delavecID));
    }

    /** @pdOid 9ef59a15-ca94-419a-b1b1-0fa080f09a90 */
    public static void vrniPodrobnePodatke(String podatki) {
        //return MainActivity.prikaziPodrobnePodatke(podatki);
    }

    /** @pdOid 569cd5e7-a452-4af3-8d25-d98b93b6563c */
    public int vrniNapako() {
        // TODO: implement
        return 0;
    }

    /** @pdOid 5ec02bc6-8680-405a-b4e3-28e140400856 */
    public int vrniLjubilej() {
        // TODO: implement
        return 0;
    }

    /** @pdOid 18795a28-65e9-43a3-beb2-973979e45779 */
    public int vrniRojstniDan() {
        // TODO: implement
        return 0;
    }

    /** @pdOid bf677bef-176e-4bc9-8a4e-1b7a849d0339 */
    public int dodajLjubilej() {
        // TODO: implement
        return 0;
    }

    /** @pdOid 0b8d575a-105f-4950-b1c1-4d10ac4447ba */
    public int dodajRojstniDan() {
        // TODO: implement
        return 0;
    }


    /** @pdGenerated default getter */
    public java.util.Collection getDelavci() {
        if (delavci == null)
            delavci = new java.util.HashSet();
        return delavci;
    }

    /** @pdGenerated default iterator getter */
    public java.util.Iterator getIteratorDelavci() {
        if (delavci == null)
            delavci = new java.util.HashSet();
        return delavci.iterator();
    }

    /** @pdGenerated default setter
     * @param newDelavci */
    public void setDelavci(java.util.Collection newDelavci) {
        removeAllDelavci();
        for (java.util.Iterator iter = newDelavci.iterator(); iter.hasNext();)
            addDelavci((Delavci)iter.next());
    }

    /** @pdGenerated default add
     * @param newDelavci */
    public void addDelavci(Delavci newDelavci) {
        if (newDelavci == null)
            return;
        if (this.delavci == null)
            this.delavci = new java.util.HashSet();
        if (!this.delavci.contains(newDelavci))
            this.delavci.add(newDelavci);
    }

    /** @pdGenerated default remove
     * @param oldDelavci */
    public void removeDelavci(Delavci oldDelavci) {
        if (oldDelavci == null)
            return;
        if (this.delavci != null)
            if (this.delavci.contains(oldDelavci))
                this.delavci.remove(oldDelavci);
    }

    /** @pdGenerated default removeAll */
    public void removeAllDelavci() {
        if (delavci != null)
            delavci.clear();
    }
    /** @pdGenerated default parent getter */
    public Statistika getStatistika() {
        return statistika;
    }

    /** @pdGenerated default parent setter
     * @param newStatistika */
    public void setStatistika(Statistika newStatistika) {
        this.statistika = newStatistika;
    }
}
