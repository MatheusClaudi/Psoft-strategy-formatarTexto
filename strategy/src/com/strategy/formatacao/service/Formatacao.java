package com.strategy.formatacao.service;

import javax.swing.text.Style;

public interface Formatacao {

	public void adicionarModificacoesDeEstilo(Style estilo, boolean deveAtivar);
	public String solicitarModificacoesString(String textoBruto);
}
