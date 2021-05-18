package com.example.jablanica_doo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Spinner dropdown = findViewById(R.id.spinner);

        button.setOnClickListener(v -> prikaziSeznamDelavcev());
        button2.setOnClickListener(v ->{ prikaziRojstniDan(); dropdown.setVisibility(View.INVISIBLE);});

    }

    public KPregledDelavca kPregledDelavca;
    public void prikaziSeznamDelavcev() {
            Spinner dropdown = findViewById(R.id.spinner);
            dropdown.setVisibility(View.VISIBLE);
            String[][] seznam = KPregledDelavca.vrniSeznamDelavcev();
            String[] seznam1 = new String[4];
            for (int i = 0; i < 4; i++) {
                if (i == 0){
                    seznam1[i] = "Izberi delavca";
                }
                else {
                seznam1[i] = seznam[0][i-1] + " " + seznam[1][i-1] + " " + seznam[2][i-1];
                }
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, seznam1);
            dropdown.setAdapter(adapter);

            izberiDelavca();
    }

    public int izberiDelavca() {
        Spinner dropdown = findViewById(R.id.spinner);
        TextView besedilo = (TextView)findViewById(R.id.textView);


        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String delavecID;

                if(parent.getItemAtPosition(position).equals("Izberi delavca")){
                    besedilo.setText("");
                }
                else{
                    delavecID = parent.getItemAtPosition(position).toString();
                    delavecID = String.valueOf(delavecID.charAt(0));
                    besedilo.setText(KPregledDelavca.izberiDelavca(delavecID));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return 0;
    }

    public static String prikaziPodrobnePodatke(String podatki) {
        return podatki;
    }

    public static void prikaziNapako(String s) {
        System.out.println(s);
        if(s.equals("Prazen seznam"))
        new MainActivity().nap();
        //else drug toast

    }

    public void nap(){
        Context context = getApplicationContext();
        CharSequence text = "Prazen seznam!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public int prikaziVeljavnostDokumentov() {
        // TODO: implement
        return 0;
    }

    public int prikaziStatistiko() {
        // TODO: implement
        return 0;
    }

    public void prikaziRojstniDan() {
        TextView besedilo = (TextView)findViewById(R.id.textView);

        besedilo.setText(KPregledDelavca.vrniRojstniDan());
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



    public KPregledDelavca getKPregledDelavca() {
        return kPregledDelavca;
    }


   public void setKPregledDelavca(KPregledDelavca newKPregledDelavca) {
        this.kPregledDelavca = newKPregledDelavca;
    }

}