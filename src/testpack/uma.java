package testpack;

public class uma {
			int id;  
		    String name;  
		      
		        uma(int i,String n){  
			       id = i;  
			       name = n;  
			       }  
			         
			       void display(){System.out.println(id+" "+name);}  
			      
			       public static void main(String args[]){  
			       
			      uma s1 = new uma(111,"Karan");  
			       uma s2 = new uma(222,"Aryan");  
			         
			       s1.display();  
			       s2.display();  


	}

}
