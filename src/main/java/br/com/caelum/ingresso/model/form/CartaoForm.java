package br.com.caelum.ingresso.model.form;

import java.time.YearMonth;

public class CartaoForm {
	
	private String numero;
	private YearMonth vencimento;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public YearMonth getVencimento() {
		return vencimento;
	}
	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}
	
	

}
