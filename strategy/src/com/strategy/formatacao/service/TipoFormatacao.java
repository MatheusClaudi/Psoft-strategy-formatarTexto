package com.strategy.formatacao.service;

import com.strategy.formatacao.service.formatacao.CaixaAlta;
import com.strategy.formatacao.service.formatacao.CaixaBaixa;
import com.strategy.formatacao.service.formatacao.Italico;
import com.strategy.formatacao.service.formatacao.Negrito;

public enum TipoFormatacao {
	
	CAIXALTA {
		@Override
		public Formatacao obterFormatacao() {
			return new CaixaAlta();
		}
	},
	CAIXABAIXA{
		@Override
		public Formatacao obterFormatacao() {
			return new CaixaBaixa();
		}
	},
	ITALICO{
		@Override
		public Formatacao obterFormatacao() {
			return new Italico();
		}
	},
	NEGRITO{
		@Override
		public Formatacao obterFormatacao() {
			return new Negrito();
		}
	};
	
	public abstract Formatacao obterFormatacao();
}
