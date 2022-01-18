package orientacaoobjeto.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    //Uma vez definido o implements a classe da problema
    //Ferrari deve implementar o metodo LigaTurbo

    //Melhorando o delta
    boolean ligarTurbo;
    boolean ligarAr;

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public void ligarTurbo() {
        //setDelta(35);
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
       //setDelta(15);
        ligarTurbo = false;
    }

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public int getDelta() {
        if(ligarTurbo  && !ligarAr){
            return 35;
        }else if (ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;
        } else{
            return 15;
        }
    }
//	void acelerar() {
//		velocidadeAtual += 15;
//	}

}
