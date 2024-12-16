package com.example.viaggi_bollettino;

public class AgenziaViaggi {
    private Viaggio[] v;
    private int viaggiInseriti;

    public AgenziaViaggi(Viaggio[] viaggios, int inseriti) {
        this.v = viaggios;
        this.viaggiInseriti =inseriti;
    }
    public AgenziaViaggi(int nViaggio) {
        this(new Viaggio[nViaggio],0);
    }
    public AgenziaViaggi() {
        this(new Viaggio[100],0);
    }


    public Viaggio[] getViaggio() { return v; }
    public void setViaggio(Viaggio[] viaggio) { this.v = viaggio; }

    public int getViaggiInseriti() { return viaggiInseriti; }
    public void setViaggiInseriti(int viaggiInseriti) { this.viaggiInseriti = viaggiInseriti; }


    @Override
    public String toString() {
        String s="Elenco: ";
        for (int i = 0; i<this.viaggiInseriti; i++){
            s=s+v[i].toString()+", costo: "+v[i].getCosto()+" ";
        }
        return s;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof AgenziaViaggi){
            AgenziaViaggi r=(AgenziaViaggi) o;
            for (int i = 0; i<this.viaggiInseriti; i++){
                if (!v[i].equals(r.getViaggio()[i])){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public boolean inserisci(Viaggio viaggio){
        if (this.viaggiInseriti == v.length)
            return false;
        else {
            v[this.viaggiInseriti] = viaggio;
            this.viaggiInseriti++;
            return true;
        }
    }
    public double getCostoMedio(){
        double costo=0.0;
        for (int i = 0; i<this.viaggiInseriti; i++){
            costo+=v[i].getCosto();
        }
        return costo/this.viaggiInseriti;
    }
    public int getPosizionePacchettoMin(){
        double costoMin=v[0].getCosto();
        int posMin=0;
        for (int i = 0; i<this.viaggiInseriti; i++){
            if (costoMin>v[i].getCosto()){
                costoMin=v[i].getCosto();
                posMin=i;
            }
        }
        return posMin;
    }
    public int getPosizionePacchettoMax(){
        double costoMax=v[0].getCosto();
        int posMax=0;
        for (int i = 0; i<this.viaggiInseriti; i++){
            if (costoMax<v[i].getCosto()){
                costoMax=v[i].getCosto();
                posMax=i;
            }
        }
        return posMax;
    }
    public String getMinMax(){
        return "Max: "+v[getPosizionePacchettoMax()].toString()+"\n\n Min: "+v[getPosizionePacchettoMin()].toString();
    }
}