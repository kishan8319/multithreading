package covid_19_VaccineBooking;

public class CoronaVaccineApp {
	public static void main(String[] args) {
		VaccineEligibility v = new VaccineEligibility(18, true);
		DoseBooking d = new DoseBooking(false);

		User u1 = new User("kishan", v, d);
		User u2 = new User("Ramesh", v, d);
		u2.bookDose();
	}

	Thread t1=new Thread(){
		@Override
		public void run(){

	}};

	Thread t2 = new Thread()

			{
				@Override
				public void run()
				{
					 
				}
			};
					
}
