package main.java.com.damith.service;

import main.java.com.damith.business.PrintAnalyserService;
import main.java.com.damith.exception.InvalidJobDataException;

public class PrintAnalyserDelegate {
	
	/**
	 * 
	 * @return PrintAnalyserService
	 */
	public PrintAnalyserService getPrintService() {
		return PrintFactory.getServiceBean();
	}

	public String printJob(String path) throws InvalidJobDataException{
		PrintAnalyserService printService = getPrintService();
		return printService.analysePrintJob(path);
	}
}
