package covid_19_VaccineBooking;

public class VaccineEligibility 
{
	private int age;
	private boolean hasHealthCondition;
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public void isEligible()
	{
		
		if(age>=18 && age<60 && hasHealthCondition==true)
		{
			System.out.println("user is eligible for vaccine:");
		}
		else
		{
			System.out.println("Not eligible for vaccine:");
		}
	}

	
	
}
