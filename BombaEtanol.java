package bomba;

public class BombaEtanol extends Bomba {
	private String fonte;

	

	public BombaEtanol(double quantidade, double preco, double livrosVendidos, String fonte) {
		super(quantidade, preco, livrosVendidos);
		this.fonte = fonte;
	}
	
	
}
