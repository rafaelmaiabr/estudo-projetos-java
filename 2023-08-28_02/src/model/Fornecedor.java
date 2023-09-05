package model;

public class Fornecedor {
	
	private String fornecedor;

	public Fornecedor() {
		super();
	}
	
	public Fornecedor(String fornecedor) {
		this.setFornecedor(fornecedor);
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
