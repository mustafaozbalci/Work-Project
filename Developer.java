
public class Developer extends Employee{
	private String languages;
	public Developer(String Name, String SurName, int id, String languages) {
		super(Name, SurName, id);
		this.languages = languages;
	}
	public void Restart(String platform) {
		System.out.println(getName() + " downloading "  + platform);
	}
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("He/She knows : " + languages);
	}

}
