package bomba;

public class Bomba {

	private double quantidade;
	private double preco; 
	private double litrosVendidos;
	
	public Bomba(double quantidade, double preco, double litrosVendidos) {
		// TODO Auto-generated constructor stub
		this.quantidade = quantidade;
		this.preco = preco;
		this.litrosVendidos = litrosVendidos;
			
		}
	

	// Getters and Setters
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getLitrosVendidos() {
		return litrosVendidos;
	}
	public void setLitrosVendidos(double livrosVendidos) {
		this.litrosVendidos = livrosVendidos;
	}
	
	
	
	private double valorParaLitros(double valor) {
		setPreco(valor);
		return getPreco();
	}
	public boolean abastecerPorLitros(double litros) {
		boolean abastecer = (getQuantidade() >= litros);
	    setQuantidade(getQuantidade() - litros);
	    setLitrosVendidos(getLitrosVendidos() + litros);
	    
	      return  abastecer;
	}
	public boolean abastecerPorValor(double valor) {
		 double litros = valorParaLitros(valor);
		    return abastecerPorLitros(litros);
	}
	
	
	

}
