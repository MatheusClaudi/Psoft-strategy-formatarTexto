package com.strategy.formatacao.service;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;



public class StyleChangeListener implements ChangeListener {

	private JTextPane pane;
	private JCheckBox box;
	private TipoFormatacao formatacao;
	
	public StyleChangeListener(JTextPane j, JCheckBox box, TipoFormatacao formatacao){
		this.pane = j;
		this.box = box;
		this.formatacao = formatacao;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		Formatacao formatacao = this.formatacao.obterFormatacao();
		
		StyledDocument documento = (StyledDocument) this.pane.getDocument();
        Style estilo = documento.getStyle(documento.addStyle("StyleAdd", null)
                .getName());

        
        
        if (box.isSelected()) {
        	formatacao.adicionarModificacoesDeEstilo(estilo, box.isSelected());
            
            String textoFormatado;
        	textoFormatado = formatacao.solicitarModificacoesString(this.pane.getText());
        	
        	this.pane.setText("");
            documento.addStyle("Style", estilo);
            
            try {
                documento.insertString(documento.getLength(), textoFormatado,
                        estilo);
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }	
        }
        
        this.box.setSelected(false);        
	}

}
