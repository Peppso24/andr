package com.example.parrucchiere;

public class Utente {
    private String Nome,Cognome,Telefono;
    private Boolean Confermato;

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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Boolean getConfermato() {
        return Confermato;
    }

    public void setConfermato(Boolean confermato) {
        Confermato = confermato;
    }
}
