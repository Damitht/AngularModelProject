package main.java.com.damith.business.paper;

import main.java.com.damith.business.charges.A4PrintCharges;
import main.java.com.damith.domain.PrintJob;
import main.java.com.damith.util.PrintUtil;

public class PrintableObjectFactory {

	/**
	 * Factory to create PrintableObject. Factory has to make sure that the PrintableObject has its 
	 * PrintJob and PrintCharges attached.
	 * @param paperType
	 * @param printJob
	 * @return
	 */
	public PrintableObject buildPrintableObject(String paperType, PrintJob printJob){
		if(PrintUtil.isNotEmpty(paperType) && paperType.equals(PaperType.A4.getDescription())){
			A4Paper a4Paper = new A4Paper(printJob, new A4PrintCharges());
			return a4Paper;
		}
		return null;
	}
}
