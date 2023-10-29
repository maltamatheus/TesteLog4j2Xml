package main.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogConfig {
	
	private static Logger logger = LogManager.getLogger(LogConfig.class);
	
	public void settingLogConfigurations() {
		System.setProperty("logFilePath", "logPath");
	}
	
	public void incluirLogInfo() {
		logger.debug("Mensagem de Debug");
		logger.info("Mensagem de Info");
		logger.error("Mensagem de Erro");
		logger.fatal("Mensagem de Fatal");
		logger.log(Level.OFF, "Mensagem de OFF");
	}
}
