package com.example.viaggi_bollettino;

public abstract class Viaggio {
    private String destinazione;
    private int durataG;
    private double costo;

    public Viaggio(String destinazione, int durata, double costo){
        this.destinazione=destinazione;
        this.durataG=durata;
        this.costo=costo;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public int getDurataG() {
        return durataG;
    }

    public void setDurataG(int durata) {
        this.durataG = durataG;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "destinazione: " + destinazione + "; giorni: " + durataG + "; costo: " + costo;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Viaggio){
            Viaggio r=(Viaggio) o;
            return r.getDestinazione().equalsIgnoreCase(this.destinazione) && this.durataG==r.getDurataG() && this.costo==getCosto();
        }
        return false;
    }
}
