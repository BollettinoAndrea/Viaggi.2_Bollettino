package com.example.viaggi_bollettino;

public class viaggioVolo extends viaggio {
    private boolean andata_ritorno;

    public viaggioVolo(String destinazione, int durataG, double costo, boolean andataRitorno) {
        super(destinazione, durataG, costo);
        this.andata_ritorno = andataRitorno;
    }

    public boolean GetAndata_Ritorno() {
        return andata_ritorno;
    }

    public void setAndata_Ritorno(boolean andata_ritorno) {
        this.andata_ritorno = andata_ritorno;
    }

    @Override
    public String toString() {
        return super.toString() + " andata_ritorno " + this.andata_ritorno;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof viaggio) {
            viaggio r = (viaggio) o;
            return super.equals(o) && this.andata_ritorno == GetAndata_Ritorno();
        }
        return false;
    }

    @Override
    public double getCosto() {
        if (GetAndata_Ritorno()) {
            return super.getCosto() + super.getCosto() / 100 * 85;
        }
        return super.getCosto() + super.getCosto() / 100 * 50;
    }
}