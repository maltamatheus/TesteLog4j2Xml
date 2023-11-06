package main.domains;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pessoa {
	
	private static Logger logger = LogManager.getLogger(Pessoa.class);
	
	private String nome;
	
	public void setNome(String nome) {
		logger.info("Seta nome da Pessoa");
		this.nome = nome;
	}
	
	public String getNome() {
		logger.error("Pega nome da Pessoa");
		return nome;
	}
}
