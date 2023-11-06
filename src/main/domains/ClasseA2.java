package main.domains;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClasseA2 {
	
	private static Logger logger = LogManager.getLogger(ClasseA2.class);
	
	private String atributoA2;

	public String getAtributoA2() {
		logger.info("Get atributoA2");
		return atributoA2;
	}

	public void setAtributoA2(String atributoA2) {
		logger.error("Set atributoA2");
		this.atributoA2 = atributoA2;
	}
}
