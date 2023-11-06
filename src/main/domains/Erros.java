package main.domains;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Erros {
	
	private static Logger logger = LogManager.getLogger(Erros.class);
	
	private String nome;
	
	public void setNome(String nome) {
		logger.info("Seta nome do Erro");
		this.nome = nome;
	}
	
	public String getNome() {
		logger.error("Pega nome do Erro");
		return nome;
	}
}
