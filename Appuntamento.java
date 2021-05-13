package com.example.parrucchiere.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Appuntamenti",
        foreignKeys = @ForeignKey(entity = Users.class,parentColumns = "id",childColumns = "idUtente"))
public class Appuntamento {
    @PrimaryKey(autoGenerate = true)

    private int id;

    private int idUtente;
    private String Data;
    private int oIni,oFin;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getData() {
        return Data;
    }

    public void setEmail(String data) {
        Data = data;
    }

    public int getoIni() {
        return oIni;
    }

    public void setoIni(int oIni) {
        this.oIni = oIni;
    }

    public int getoFin() {
        return oFin;
    }

    public void setoFin(int oFin) {
        this.oFin = oFin;
    }

}
