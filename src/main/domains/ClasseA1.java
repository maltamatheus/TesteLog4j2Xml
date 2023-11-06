package main.domains;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClasseA1 {
	
	private static Logger logger = LogManager.getLogger(ClasseA1.class);
	
	private String atributoA1;

	public String getAtributoA1() {
		logger.info("Get atributoA1");
		return atributoA1;
	}

	public void setAtributoA1(String atributoA1) {
		logger.error("Set atributoA1");
		this.atributoA1 = atributoA1;
	}
}
