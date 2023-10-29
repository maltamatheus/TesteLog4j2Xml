package main;

import main.logging.LogConfig;

public class Execute {

	public static void main(String[] args) {
		
		LogConfig logConfig = new LogConfig();
		
		logConfig.settingLogConfigurations();
		
		logConfig.incluirLogInfo();
		
	}
}
