package classesmetodos.playing;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;

    }

    void comer(Comida comida) {
        if (comida != null){
            this.peso += comida.peso;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
}


