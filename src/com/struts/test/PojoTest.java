package com.struts.test;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.DivPojo;

public class PojoTest extends ActionSupport {
	  DivPojo divObj;
		public DivPojo getDivObj() {
			return divObj;
		}
		public void setDivObj(DivPojo divObj) {
			this.divObj = divObj;
		}
		
		public String test() {
			int res=divObj.getNum()/divObj.getDenom();
			System.out.println("PojoTest"+res);
			return "Success";
		}
}
