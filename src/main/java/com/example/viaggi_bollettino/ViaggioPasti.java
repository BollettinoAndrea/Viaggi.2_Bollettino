package com.example.viaggi_bollettino;

public class ViaggioPasti extends Viaggio {
    private  boolean PensioneCompleta;

    public ViaggioPasti(String destinazione, int durataG, double costo, boolean PensioneComp){
        super(destinazione,  durataG, costo);
        this.PensioneCompleta =PensioneComp;
    }

    public boolean GetPensioneCompleta() {
        return PensioneCompleta;
    }

    public void setPensioneCompleta(boolean pensioneCompleta) {
        PensioneCompleta = pensioneCompleta;
    }

    @Override
    public String toString() {
        return super.toString() + " pensioneCompleta: " + this.PensioneCompleta;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Viaggio){
            Viaggio r=(Viaggio) o;
            return super.equals(o) && this.PensioneCompleta == GetPensioneCompleta();
        }
        return false;
    }

    @Override
    public double getCosto() {
        if (GetPensioneCompleta()) {
            return super.getCosto() + getDurataG()*35;
        }
        return super.getCosto() + getDurataG()*25;
    }
}