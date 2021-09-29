package com.example.tshirtprinting;

public class printModal {
    int Imageres;
    String Imagedes;

    public printModal(int imageres, String imagedes) {
        this.Imageres = imageres;
        this.Imagedes = imagedes;
    }


    public int getImageres() {
        return Imageres;
    }

    public void setImageres(int imageres) {
        Imageres = imageres;
    }

    public String getImagedes() {
        return Imagedes;
    }

    public void setImagedes(String imagedes) {
        Imagedes = imagedes;
    }




}

