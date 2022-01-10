package arraysecollections;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario a1 = new Usuario();
		a1.nome = "Roberto Justos";
		a1.email = "mimosa@gmail.com";
		

		Usuario a2 = new Usuario();
		a2.nome = "Roberto Justos";
		a2.email = "mimosa@gmail.com";
		
		
		System.out.println(a1.equals(a2));
	}

}
