package main.java.com.damith.service;

import main.java.com.damith.business.PrintAnalyserService;
import main.java.com.damith.business.PrintAnalyserServiceImpl;

public class PrintFactory {
	
	/**
	 * Factory responsible for generating the PrintAnalyserService
	 * @return
	 */
    public static PrintAnalyserService getServiceBean() {
        return new PrintAnalyserServiceImpl();
    }

}
