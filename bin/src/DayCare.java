import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DayCare implements Serviceable{
	private String CompanyName;
	private String CompanyDescription;
	public List<Employable> elist = new ArrayList<Employable>();
	public List<String> clist = new ArrayList<String>();

	public DayCare() {
		// TODO Auto-generated constructor stub
	}

	public void demo() {
		Employable employee = new Person();
		AbstractPerson ap1 = new Person();
		DayCare d1 = new DayCare();
		d1.addEmploees(employee);
		d1.addClilents(ap1);
		d1.showClients();
		d1.showEmployees();
		d1.sortClients();
		d1.sortEmployees(employee);
	}
	
	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return CompanyName;
	}
	
	public String getCompanyDescription() {
		// TODO Auto-generated method stub
		return CompanyDescription;
	}
	
	public void showEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Show All Employees");
		for (Employable employee : elist) {
			System.out.println("Employee : " + employee);
		}
		System.out.println("\n");
		
	}
		
	//Sorting Using LastName
	@Override
	public void sortEmployees(Employable employee) {
		// TODO Auto-generated method stub
		elist.sort(new Comparator<Employable>(){
			@Override
			public int compare(Employable o1, Employable o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});System.out.println("Sorting Employees With LastName");
		showEmployees();
	}
	
	public void showClients() {
		// TODO Auto-generated method stub
		System.out.println("Showing All Clients ");
		for (String ap1 : clist) {
			System.out.println("Client : " + ap1);
		}
		System.out.println("\n");
	}
	public void sortClients() {
		// TODO Auto-generated method stub
		Collections.sort(clist);
		System.out.println("Sorting Clients by Lastname");
		showClients();
		System.out.println("\n");
	}
	
	public void sortClients(Comparator<AbstractPerson> c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sortEmployees(Comparator<Employable> c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmploees(Employable employee) {
		// TODO Auto-generated method stub
		Employable o1 = new Person(21,"John","White",01, 2000);
		Employable o2 = new Person(10,"Angela","Snow",02,4000);
		Employable o3 = new Person(60,"Bill","Gates",03,9000);
		Employable o4 = new Person(80,"Mark","Zugerbug",04,1000);
		Employable o5 = new Person(70,"Denita","Kemron",05,8000);
		elist.add(o1);
		elist.add(o2);
		elist.add(o3);
		elist.add(o4);
		elist.add(o5);
	}

	@Override
	public void addClilents(AbstractPerson person) {
		// TODO Auto-generated method stub
		clist.add("Angle Chemberlin");
		clist.add("Keith Dunn");
		clist.add("Rushit Shah");
		clist.add("Snow White");
		clist.add("Vikrant Zumba");
		
	}

}
