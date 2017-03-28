package mianxiang;

public class Play {
	
	   /* public void feed( Dog dog ) {
	              dog.eat();
	       } 
		public void feed(Run run ) {
	               run.eat();
	        }*/
		public void feed(Pet pet ) {
            pet.eat();
     }
		public Pet getPet(String typrId) {
			  if (typrId.equalsIgnoreCase("dog")) {
				  Pet pet  = new Dog();
					 return pet;
		     }	else if (typrId.equals("run")) {
		    	 Pet pet  = new Run();
				 return pet;
			}
			  return null;
		}
} 