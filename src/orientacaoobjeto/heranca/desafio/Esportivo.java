package orientacaoobjeto.heranca.desafio;

public interface Esportivo {

    /**
     * Essa eh uma interface
     * Quando criada a classe que herdar tera a obrigacao de implementar o metodo, veja:
     * Vamos supor que voce tem o metodo turbo que sera implementadao nos carros
     * mas voce nao pode implementar o mesmo metodo nos carros pq voce nao sabe como
     * o carro ira se comportar, logo voce pode criar uma interface e os metodos vazio,
     * quem herdar essa classe tera a obrigacao de criar o metodo
     */
    void ligarTurbo();

    //Metodo vazio
    void desligarTurbo();
    //Voce vai decidir o comportamento mas nao tem como voce implementar
    //Ferrari vai herdar, voce introdus a palavra ""implements""
}
