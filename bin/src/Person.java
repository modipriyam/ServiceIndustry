import java.util.Comparator;

public class Person extends AbstractPerson implements Employable{
	
	private int Age;
	private String FirstName;
	private String LastName;
	private int EmployeeId;
	private double Wage;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int age, String Firstname, String Lastname, int Employeeid, double wage) {
		this.Age = age;
		this.FirstName = Firstname;
		this.LastName = Lastname;
		this.EmployeeId = Employeeid;
		this.Wage = wage;
		
	}
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return Age;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.Age = age;
		
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return FirstName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.FirstName = firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return LastName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.LastName = lastName;
		
	}

	@Override
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return EmployeeId;
	}

	@Override
	public void setEmployeeId(int employeeid) {
		// TODO Auto-generated method stub
		this.EmployeeId = employeeid;
		
	}

	@Override
	public double getWage() {
		return Wage;
	}

	@Override
	public void setWage(double wage) {
		this.Wage = wage;
		
	}
	
		Comparator<Employable> id = new Comparator<Employable>() {

			@Override
			public int compare(Employable o1, Employable o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getAge()- o2.getAge());
			}
	    };

		@Override
		public String toString() {
			return "Person [Age=" + Age + ", FirstName=" + FirstName + ", LastName=" + LastName + ", EmployeeId="
					+ EmployeeId + ", Wage=" + Wage + "]";
		}

}
