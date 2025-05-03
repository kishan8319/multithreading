package covid_19_VaccineBooking;

public class DoseBooking 
{
	private boolean booked;

	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}
	
	public void bookDose()
	{
		if(booked)
		{
			throw new BookeDoseException("Dose already booked");
		}
		else
		{
			booked=true;
			System.out.print("Dose Booked for :");
		}
	}
	
	public boolean isDoseBooked()
	{
		if(booked)return true;
		return false;
	}

	
}
