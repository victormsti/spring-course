package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	@RequestMapping("showForm")
	public String showForm(Model theModel) {
		
		// create a new customer object
		Customer theCustomer = new Customer();
		// add customer object to the model
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		System.out.println("Last Name: |" + theCustomer.getLastName() + "|");
		System.out.println("Free Passes: |" + theCustomer.getFreePasses() + "|");
		
		System.out.println("Binding result: " + theBindingResult);
		System.out.println("\n\n\n\n");
		
		if(theBindingResult.hasErrors()) {
		return "customer-form";
		}
		else {
		return "customer-confirmation";
		}
	}
}
