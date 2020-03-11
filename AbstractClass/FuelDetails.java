package AbstractClass;

public class FuelDetails extends Fuel{

	public void FuelDetails() {
		System.out.println("vechicles");
	}
	@Override
	public void diesel() {
		System.out.println("90");
	}

	@Override
	public void oil() {
		System.out.println("70");

	}
    public static void main(String[] args) {
     	FuelDetails s = new FuelDetails();
	    s.diesel();
	    s.oil();
	    s.FuelDetails();
}
}