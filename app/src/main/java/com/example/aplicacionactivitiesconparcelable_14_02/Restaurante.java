package com.example.aplicacionactivitiesconparcelable_14_02;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by Vicente FN on 14/02/2018.
 */

public class Restaurante implements Parcelable {

    String nombre;
    String opinion;
    int valoracion;

    //CREATOR
    public static final Parcelable.Creator<Restaurante> CREATOR = new Parcelable.Creator<Restaurante>(){
        @NonNull
        public Restaurante createFromParcel(Parcel in){
            return new Restaurante(in);
        }
        public Restaurante[] newArray(int size){return new Restaurante[size];
        }

    };

    //FIN CREATOR

    public Restaurante(String nombre, String opinion, int valoracion) {
        this.nombre = nombre;
        this.opinion = opinion;
        this.valoracion = valoracion;
    }

    //Crear constructor que reciba por parametros un Parcel
    public Restaurante(Parcel parcel){
        readFromParcel(parcel);
        //Llamamos al método readFromParcel

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeString(this.opinion);
        dest.writeInt(this.valoracion);

    }


    //Creamos metodo readFromParcel que usaremos para llamarla en el constructor parecelable

    private void readFromParcel (Parcel parcel){
        this.nombre = parcel.readString();
        this.opinion = parcel.readString();
        this.valoracion = parcel.readInt();
    }





}
