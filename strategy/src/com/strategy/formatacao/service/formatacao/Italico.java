package com.strategy.formatacao.service.formatacao;

import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import com.strategy.formatacao.service.Formatacao;

public class Italico  implements Formatacao {



	@Override
	public String solicitarModificacoesString(String textoBruto) {
		return textoBruto;
	}

	@Override
	public void adicionarModificacoesDeEstilo(Style estilo, boolean deveAtivar) {
        StyleConstants.setItalic(estilo, deveAtivar);		
	}

}
