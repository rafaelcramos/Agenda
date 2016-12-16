package com.example.rafaelramos.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rafaelramos.agenda.DAO.AlunoDAO;
import com.example.rafaelramos.agenda.modelo.Aluno;

import junit.framework.Test;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        final FormularioHelper helper = new FormularioHelper(this);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno aluno = helper.pegaAluno();
                AlunoDAO dao = new AlunoDAO(this);
                dao.insere(aluno);


                Toast.makeText(FormularioActivity.this, "Aluno " + aluno.getNome() + " Salvo", Toast.LENGTH_SHORT).show();

                finish();
        }
    });
    }
}
