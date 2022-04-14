package com.motivity;

import com.motivity.configs.AirlinesConfig;
import com.motivity.services.AirlineService;



import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainMethod3 {
                
	public static void main(String[] args) throws InterruptedException, SQLException
	
	{
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AirlinesConfig.class);

        AirlineService airlineService = context.getBean(AirlineService.class);
        Scanner sc=new Scanner(System.in);
       
        int a,k,f;
        String b,c,d,e;
        
       do {
        	System.out.println("1.insert .delete 3.update 4.select 5.exit");
        	k=sc.nextInt();
        switch(k) {
        
        case 1:System.out.println("Enter the passport_id to insert");
        a=sc.nextInt();
        System.out.println("insert name");
        b=sc.next();
        System.out.println("insert login");
        c=sc.next();
        System.out.println("insert password");
        d=sc.next();
        System.out.println("insert mobile");
        e=sc.next();
        Airlines a1=new Airlines(a,b,c,d,e);
        airlineService.add(a1);
         break;
         
        case 2:System.out.println("Enter the passport_id to delete");
                 f=sc.nextInt();
           Airlines a2=new Airlines(f);
           a2.setPassport_id(f);
           airlineService.delete(a2);
           break;
       
       
      case 3:System.out.println("Enter the passport_id to  update");
            a=sc.nextInt();
            System.out.println("update name");
            b=sc.next();
            System.out.println("update login");
            c=sc.next();
            System.out.println("update password");
            d=sc.next();
            System.out.println(" update mobile");
            e=sc.next();
            Airlines x= new Airlines(a,b, c, d,e);
            airlineService.update(x);
            break;
      case 4:System.out.println("Select passport_id to display the details");
      
		List<Airlines> a9=airlineService.select();
		for(Airlines i:a9) {
			System.out.println(i.getPassport_id()+" "+i.getName()+" "+" "+i.getLogin()+i.getPassword()+" "+i.getMobile());
		}
		break;
        
        
            
       default : System.out.println("no such passport_id exists");
    	   
    	   java.lang.System.exit(0);
	        break;
	        
        }

        }while(true);
        
	}
	
	
}
       
       
       
        
    
	
