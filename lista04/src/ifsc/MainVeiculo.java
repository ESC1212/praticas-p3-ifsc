package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Veiculo>carlist = new ArrayList<>();
		Veiculo fordk = new Veiculo();
		fordk.setNome("Ford Ka");
		fordk.setAno(2001);
		fordk.setRodas(8);
		fordk.setFabric("Ford");
		fordk.setCor("azul");
		
		Veiculo traker = new Veiculo();
		traker.setNome("Chev Traker");
		traker.setAno(2022);
		traker.setRodas(4);
		traker.setFabric("Chevrolet");
		traker.setCor("Branco");
		
		Veiculo renegade = new Veiculo();
		renegade.setNome("O não subidor de morros");
		renegade.setAno(1800);
		renegade.setRodas(1);
		renegade.setFabric("Jeep");
		renegade.setCor("Cinza");
		
		carlist.add(fordk);
		carlist.add(traker);
		carlist.add(renegade);
		
		for (Veiculo Veiculo : carlist) {
			System.out.println("nome: "+Veiculo.getNome());
			System.out.println("Ano: "+Veiculo.getAno());
			System.out.println("N Rodas: "+Veiculo.getRodas());
			System.out.println("Fabricante: "+Veiculo.getFabric());
			System.out.println("Cor: "+Veiculo.getCor());
			System.out.println();
		}
	}

}
