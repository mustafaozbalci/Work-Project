
public class Employer extends Employee {
	private int Employee_Number;
	public Employer(String Name, String SurName, int id, int Employee_Number) {
		super(Name, SurName, id);
		this.Employee_Number = Employee_Number;
	}
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("He/She has : " + Employee_Number + " people in command.");
	}
	public void UpPrice (int Price) {
		System.out.println("Price is upgraded : " + Price + "$");
	}

	

}
