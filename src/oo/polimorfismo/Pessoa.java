package oo.polimorfismo;

public class Pessoa {

    private final String nome;
    private double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public String toString() {
        return "O " + getNome() + " tem " + getPeso() + "Kg";
    }
}
