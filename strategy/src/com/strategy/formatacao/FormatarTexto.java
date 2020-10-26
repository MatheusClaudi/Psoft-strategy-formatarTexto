package com.strategy.formatacao;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.JCheckBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import com.strategy.formatacao.service.StyleChangeListener;
import com.strategy.formatacao.service.TipoFormatacao;

public class FormatarTexto extends JFrame{

    private JCheckBox negrito = new JCheckBox("Negrito");
    private JCheckBox italico = new JCheckBox("Itálico");
    private JCheckBox caixaAlta = new JCheckBox("CaixaAlta");
    private JCheckBox caixaBaixa = new JCheckBox("CaixaBaixa");
    
    private JTextPane areaDeTexto = new JTextPane();
    private JPanel painelEstilo = new JPanel();
    private JScrollPane scroll = new JScrollPane();

    public FormatarTexto() {

        configuraJanela();
        detectarMudancas();
        adicionaBotoesTela();
        
        add(painelEstilo, BorderLayout.SOUTH);
        setVisible(true);
    }


    private void configuraJanela() {
        setSize(400, 400);
        setTitle("Formatacao de entrada");
        setLayout(new GridLayout(2, 0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        scroll.add(areaDeTexto);
        areaDeTexto.setText("Valor Inicial");
        scroll.setViewportView(areaDeTexto);
        add(scroll, BorderLayout.CENTER);
    }
    
    private void adicionaBotoesTela() {
    	painelEstilo.add(negrito);
        painelEstilo.add(italico);
        painelEstilo.add(caixaAlta);
        painelEstilo.add(caixaBaixa);
    }
    
    private void detectarMudancas() {
   
        negrito.addChangeListener(new StyleChangeListener(areaDeTexto, negrito, TipoFormatacao.NEGRITO));
        italico.addChangeListener(new StyleChangeListener(areaDeTexto, italico, TipoFormatacao.ITALICO));
        caixaAlta.addChangeListener(new StyleChangeListener(areaDeTexto, caixaAlta, TipoFormatacao.CAIXALTA));
        caixaBaixa.addChangeListener(new StyleChangeListener(areaDeTexto, caixaBaixa, TipoFormatacao.CAIXABAIXA));   
    }

    public static void main(String[] args) {
        new FormatarTexto();
    }

}