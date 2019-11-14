package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value )
public class FirstController 
{   
	@RequestMapping(value="/hey", method= RequestMethod.GET)
	public ModelAndView sayHelloToName(@RequestParam("name") String name)
	{
		ModelAndView model = new ModelAndView("sayHello");
		model.addObject("name",name);
		return model;
		
	}
//	public ModelAndView prime(@RequestParam("number") int num)
//	{
//		ModelAndView model = new ModelAndView("prime");
//		 int i,m=0,flag=0;      
//		  
//		  m=num/2;      
//		  if(num==0||num==1){  
//		   System.out.println(n+" is not prime number");      
//		  }
//		  
//		  else{  
//		   for(i=2;i<=m;i++){      
//		    if(n%i==0){      
//		     System.out.println(n+" is not prime number");      
//		     flag=1;      
//		     break;      
//		    }      
//		   }      
//		   if(flag==0)  { System.out.println(n+" is prime number"); }  
//		  }
//		
//	}
	
}
