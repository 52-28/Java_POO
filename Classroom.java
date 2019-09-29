class Classroom{

	public static void main(String[] args){
	
		Wilder jeanClaude = new Wilder("Jean-Claude",true);
		Wilder aymeric 	  = new Wilder("Aymeric",true);	
		Wilder student42  = new Wilder("student42", false);

		System.out.println(jeanClaude.whoAmI());
		System.out.println(aymeric.whoAmI());
		System.out.println(student42.whoAmI());
	}

}
