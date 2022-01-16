package orientacaoobjeto.heranca.desafio;

<<<<<<< HEAD
public class Ferrari extends Carro{
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	Ferrari(){
		this(315);
	}
//	void acelerar() {
=======
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
>>>>>>> a610c704c3e0250f7f6028f44b3d31356c44dff2
//		velocidadeAtual += 15;
//	}

}
