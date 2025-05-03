package covid_19_VaccineBooking;

public class User
{
	
	private String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;
	
    

	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}

	public void isEligible()
	{
		eligibility.isEligible();
	}
	
	public void bookDose()
	{
		doseBooking.bookDose();
		System.out.print(name);
	}
	
	public void isDoseBooked()
	{
		if(doseBooking.isDoseBooked())
		{
		System.out.println("Booked");	
		}
		else
		{
			System.out.println("Not Booked");
		}
	}
}
