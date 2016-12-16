package com.example.rafaelramos.agenda.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.rafaelramos.agenda.modelo.Aluno;

/**
 * Created by rafaelramos on 16/12/16.
 */

public class AlunoDAO extends SQLiteOpenHelper {

    public AlunoDAO(Context context) {
        super(context, "Agenda", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE Alunos (id INTEGER PRIMARY KEY, nome TEXTO NOT NULL, endereco TEXT, telefone TEXT, site TEXT, nota REAL);";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DRO TABLE IF EXISTS Aluno";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public void insere(Aluno aluno) {
        String sql = " INERT INTO Alunos (nome, endereco, telefone, site, nota) VALUE ()"
    }
}
