package com.example.jablanica_doo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = findViewById(R.id.button);


        button.setOnClickListener(v -> prikaziSeznamDelavcev());

       /*

        final String[] delavec = new String[1];

        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                delavec[0] = (String) parent.getItemAtPosition(position);
                if(parent.getItemAtPosition(position).equals("Izberi delavca")){
                    //
                }
                else{
                    dropdown.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        */

    }

    public KPregledDelavca kPregledDelavca;

    public void prikaziSeznamDelavcev() {
            Spinner dropdown = findViewById(R.id.spinner);
            dropdown.setVisibility(View.VISIBLE);
            String[][] seznam = KPregledDelavca.vrniSeznamDelavcev();
            String[] seznam1 = new String[3];
            for (int i = 0; i < 3; i++) {
                seznam1[i] = seznam[0][i] + " " + seznam[1][i];
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, seznam1);
            dropdown.setAdapter(adapter);

    }

    public int izberiDelavca() {
        // TODO: implement
        return 0;
    }

    public int prikaziPodrobnePodatke() {
        // TODO: implement
        return 0;
    }

    public int prikaziNapako() {
        // TODO: implement
        return 0;
    }

    public int prikaziVeljavnostDokumentov() {
        // TODO: implement
        return 0;
    }

    public int prikaziStatistiko() {
        // TODO: implement
        return 0;
    }

    public int prikaziRojstniDan() {
        // TODO: implement
        return 0;
    }

    public int prikaziLjubilej() {
        // TODO: implement
        return 0;
    }

    public int dodajRojstiDan() {
        // TODO: implement
        return 0;
    }

    public int dodajLjubilej() {
        // TODO: implement
        return 0;
    }


    /** @pdGenerated default parent getter */
    public KPregledDelavca getKPregledDelavca() {
        return kPregledDelavca;
    }

    /** @pdGenerated default parent setter
     * @param newKPregledDelavca */
   public void setKPregledDelavca(KPregledDelavca newKPregledDelavca) {
        this.kPregledDelavca = newKPregledDelavca;
    }




}