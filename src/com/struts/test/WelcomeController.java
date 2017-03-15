package com.struts.test;

import java.util.Iterator;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.DivPojo;


public class WelcomeController extends ActionSupport {
	  public String name;
	  public String pass;
	  public String[] checkbox;

	public String[] getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String[] checkbox) {
		this.checkbox = checkbox;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	  
	  		DivPojo divObj;
			public DivPojo getDivObj() {
				System.out.println("In get");
				return divObj;
			}
			public void setDivObj(DivPojo divObj) {
				System.out.println("In set");
				this.divObj = divObj;
			}
			
			@org.apache.struts2.interceptor.validation.SkipValidation
			public String test() {
				String[] itr = getCheckbox();
				
					  for(String cb : itr){

							System.out.println(cb);
					   }
					
				System.out.println("In Test");
				int res=divObj.getNum()/divObj.getDenom();
				System.out.println("Test method Called :"+res);
				return "Success";
			}
	
	public String execute() {
		System.out.println(getName() +"-"+getPass());
		return "Success";
	}
	
	/*public void validate() {
		System.out.println("Password Length : "+pass.length());
		if(pass.length()<4){
			addFieldError("pass", "Password is too short !!");
		}
	}*/
}
