package main.java.com.damith.userInterface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.damith.service.PrintAnalyserDelegate;


@Controller
@RequestMapping(value = "/CalculatorOperation")
public class UIController {
	
	@RequestMapping(value = "/{pathVal}", method = RequestMethod.GET)
	@ResponseBody
    public String mathOperation(@PathVariable("pathVal") String path, ModelMap model) {
		System.out.println("Path ---------------- >"+path.toString());
		path = "C:/Damith/Development/Projects/AngularModelProject/printjobs.csv";
	    PrintAnalyserDelegate analyserDelegate = new PrintAnalyserDelegate();
	    String finalReceipt = "";
		
		finalReceipt = analyserDelegate.printJob(path);
		System.out.println("finalReceipt"+finalReceipt);
		return "{\"answer\":" + "123.30" + "}";
    }
}