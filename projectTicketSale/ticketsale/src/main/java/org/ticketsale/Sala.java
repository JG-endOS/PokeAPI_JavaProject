package org.ticketsale;

public class Sala {
    private int numeroIdentificacao;
    private int numCadeiras;
    private boolean vip;
    
    public Sala(int numeroIdentificacao, int numCadeiras, boolean vip){
        this.numeroIdentificacao = numeroIdentificacao;
        this.numCadeiras = numCadeiras;
        this.vip = vip;
    }
    
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }
    
    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
    
    public int getNumCadeiras() {
        return numCadeiras;
    }
    
    public void setNumCadeiras(int numCadeiras) {
        this.numCadeiras = numCadeiras;
    }
    
    public boolean isVip() {
        return vip;
    }
    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
