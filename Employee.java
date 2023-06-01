
public class Employee {

	private String Name;
	private String SurName;
	private int id;

	public Employee(String Name, String SurName, int id) {
		this.Name = Name;
		this.SurName = SurName;
		this.id = id;
	}
	public void bilgileriGoster() {
		System.out.println("Employee Information ...");
		System.out.println("Name : " + Name);
		System.out.println("SurName : " + SurName);
		System.out.println("Id : " + id);
	
		}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getSurName() {
		return SurName;
	}
	public void setSurName(String SurName) {
		this.SurName = SurName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Name : " + Name + " SurName : " + SurName + " Id : " + id;
	}
	}