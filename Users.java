package com.example.parrucchiere.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Users")
public class Users {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String Nome,Cognome,Numero;

    public int getId(){
        return id;
    }
    public void setId(int Id){
        id=Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }
}
