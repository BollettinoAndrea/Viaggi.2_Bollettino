package com.example.viaggi_bollettino;

public class viaggioEscursioni extends viaggioPasti{
    private  int escursioni;

    public viaggioEscursioni(String destinazione, int durataG, double costo, boolean pensioneComp, int escursioni){
        super(destinazione, durataG, costo, pensioneComp);
        this.escursioni=escursioni;
    }

    public int getEscursioni() {
        return escursioni;
    }

    public void setEscursioni(int escursioni) {
        this.escursioni = escursioni;
    }

    @Override
    public String toString() {
        return super.toString() + " escursioni " + this.escursioni;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof viaggio){
            viaggio r=(viaggio) o;
            return super.equals(o) && this.escursioni==getEscursioni();
        }
        return false;
    }

    @Override
    public double getCosto() {
        return super.getCosto() + getEscursioni()*15;
    }
}
