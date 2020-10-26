package com.strategy.formatacao.service.formatacao;

import javax.swing.text.Style;

import com.strategy.formatacao.service.Formatacao;

public class CaixaBaixa  implements Formatacao {

	

	@Override
	public String solicitarModificacoesString(String textoBruto) {
		return textoBruto.toLowerCase();
	}

	@Override
	public void adicionarModificacoesDeEstilo(Style estilo, boolean deveAtivar) {}

}
