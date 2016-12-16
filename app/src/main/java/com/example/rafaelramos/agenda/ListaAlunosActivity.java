package com.example.rafaelramos.agenda;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aluno);

        String[] alunos = {"Rafael" , "Daniel" , "Lucas", "Rafael" , "Daniel" , "Lucas", "Rafael" , "Daniel" , "Lucas",  "Rafael" , "Daniel" , "Lucas", "Rafael" , "Daniel" , "Lucas", "Rafael" , "Daniel" , "Lucas", };
        ListView listaAluno = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
        listaAluno.setAdapter(adapter);

        Button novoAluno = (Button) findViewById(R.id.lista_novoAluno);
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentFormulario);

            }
        });


    }
}
