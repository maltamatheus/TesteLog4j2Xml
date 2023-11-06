package main;

import main.domains.ClasseA1;
import main.domains.ClasseA2;
import main.domains.Erros;
import main.domains.Pessoa;
import main.logging.LogConfig;

public class Execute {
	
	public static void main(String[] args) {
		
		System.setProperty("logFilePath", "logPath");
		
		LogConfig logConfig = new LogConfig();
		
		logConfig.incluirLogInfo();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Matheus Malta");
		
		System.out.println(pessoa.getNome());
		
		ClasseA1 a1 = new ClasseA1();
		a1.setAtributoA1("Atributo A1");
		a1.getAtributoA1();
		
		ClasseA2 a2 = new ClasseA2();
		a2.setAtributoA2("Atributo A2");
		a2.getAtributoA2();
		
		Erros erros = new Erros();
		
		erros.setNome("Erros");
		erros.getNome();
		
	}
}
