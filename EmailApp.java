package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em = new Email("Davin","Smith");
		
		em.setAlternateEmail("davesmith@hotmail.com");
		System.out.println("Alternate Email is: " + em.getAlternateEmail());

	}

}
