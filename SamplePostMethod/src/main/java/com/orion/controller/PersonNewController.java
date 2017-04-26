package com.orion.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orion.NewPerson;



@RestController
public class PersonNewController{
/*private BillingService billingService;

 @Autowired
    public HomeController(@Qualifier("domains.BillingService") BillingService billingService) {
        this.billingService = billingService;
    }*/
 
/*@RequestMapping(value = "/reference",produces = "application/json")
public @ResponseBody Account getUser(@RequestParam(value="accountNumber", required=false, defaultValue="123") String accountNumber){
System.out.println(accountNumber+"****************************");
 Account simpleAccount = new Account("1","Bhuvaneswari","Perumal","Manikandan");billingService.getUser(accountNumber);
 return simpleAccount;
 
}*/

@RequestMapping(value="/emp",method = RequestMethod.POST,consumes="application/json")
public @ResponseBody NewPerson saveEmployee(@RequestBody NewPerson employee)
{
System.out.println("employee id"+employee.getId());
System.out.println("employee id"+employee.getName());
NewPerson emp =new NewPerson();
emp.setId(employee.getId());
emp.setName(employee.getName());
return emp;

}
}


