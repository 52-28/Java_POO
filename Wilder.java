class Wilder{

	private String firstname;
	private boolean aware;

	// Constructeur
	public Wilder(String firstname, boolean aware){
		this.firstname = firstname;
		this.aware = aware;	
	}
	
	//getters
	public String getFirstname(){
		return this.firstname;	
	}
	
	public boolean isAware(){
		return this.aware;	
	}

	//setters
	public void setFirstname(String firstname){
		this.firstname = firstname;	
	}
	public void setBoolean(Boolean aware){
		this.aware = aware;	
	}

	//méthodes
	public String whoAmI(){

		String isAware = "je ne suis pas aware";
		if (this.aware == true){
			isAware = "je suis aware";		
		}		
		
		return "Je m'appelle " + this.getFirstname() + " et " + isAware; 	
	}
}
