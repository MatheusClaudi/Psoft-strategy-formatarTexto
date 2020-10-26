package com.strategy.formatacao.service.formatacao;

import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import com.strategy.formatacao.service.Formatacao;

public class CaixaAlta implements Formatacao {



	@Override
	public String solicitarModificacoesString(String textoBruto) {
		return textoBruto.toUpperCase();
	}

	@Override
	public void adicionarModificacoesDeEstilo(Style estilo, boolean deveAtivar) {}

}
