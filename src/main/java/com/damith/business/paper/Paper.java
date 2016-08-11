package main.java.com.damith.business.paper;

import main.java.com.damith.business.charges.PrintCharges;
import main.java.com.damith.domain.PrintJob;

public abstract class Paper{

	private PrintJob printJob;
	private PrintCharges printCharges;
	
	public Paper(PrintJob printJob, PrintCharges printCharges){
		this.printJob = printJob;
		this.printCharges = printCharges;
	}

	public PrintJob getPrintJob() {
		return printJob;
	}

	public PrintCharges getPrintCharges() {
		return printCharges;
	}
}
