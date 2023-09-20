package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro dodo = new Cachorro();
		dodo.setNome("Dodo");
		dodo.setRaca("Humano");
		dodo.setComprimento(150);
		dodo.setNumpatas(4);
		dodo.setCor("Roxo");
		dodo.setEcosis("Escola");
		
		Gato dog = new Gato();
		dog.setNome("Não é um gato");
		dog.setRaca("Pincher");
		dog.setComprimento(999);
		dog.setNumpatas(1);
		dog.setCor("Cinza");
		dog.setEcosis("Casa do Douglas");
		
		dodo.caminhada();
		dog.mia();
		System.out.println(dodo.getNome());
		System.out.println(dodo.getRaca());
		System.out.println(dodo.getComprimento());
		System.out.println(dodo.getNumpatas());
		System.out.println(dodo.getCor());
		System.out.println(dodo.getEcosis());
		System.out.println();
		
		dog.caminhada();
		dodo.late();
		System.out.println(dog.getNome());
		System.out.println(dog.getRaca());
		System.out.println(dog.getComprimento());
		System.out.println(dog.getNumpatas());
		System.out.println(dog.getCor());
		System.out.println(dog.getEcosis());
		
	}
}