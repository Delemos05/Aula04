package bomba;

public class BombaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bomba bd = new Bomba(1000, 500, 1000);
		Bomba bg = new Bomba(1000, 1000, 1000);
		Bomba be = new Bomba(1000, 1000, 1000);
		
		bd.setQuantidade(5000);
		System.out.println ("Abasteceu? Resposta : " + bd.abastecerPorLitros(60));
		System.out.println("Combustivel restante na bomba : " + bd.getQuantidade());
		
		bg.setQuantidade(150);
		System.out.println ("Abasteceu? Resposta : " + bg.abastecerPorLitros(100));
		System.out.println("Combustivel restante na bomba : " + bg.getQuantidade());
		
		be.setQuantidade(2500);
		System.out.println ("Abasteceu? Resposta : " + be.abastecerPorLitros(500));
		System.out.println("Combustivel restante na bomba : " + be.getQuantidade());
		
		

	}

}
