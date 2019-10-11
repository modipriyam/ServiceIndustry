
import java.util.Comparator;

public interface Serviceable {
	/**
	 * Get the name of company
	 * @return		name of company
	 */
	String getCompanyName();
	/**
	 * get the description of your company
	 * @return		company description
	 */
	String getCompanyDescription();
	/**
	 * add employees to list<Employable> employees
	 * @param e		Employable employee to add to list
	 */
	void addEmploees(Employable employee);
	/**
	 * display the state of all employees
	 */
	void showEmployees();
	/**
	 * sort all employees
	 * (sort by Last Name, use a Comparator)
	 */
	void sortEmployees(Employable employee);
	/**
	 * sort all employees as specified by supplied Comparator
	 * @param c		Comparator<Employable>
	 */
	void sortEmployees(Comparator<Employable> c);
	/**
	 * add client to list<AbstractPerson> clients
	 * @param e		AbstractPerson client to add to list
	 */
	void addClilents(AbstractPerson person);
	/**
	 * display the state of all clients
	 */
	void showClients();
	/**
	 * sort all clients
	 * (sort by Last Name, use a Comparator)
	 */
	void sortClients();
	/**
	 * sort all clients as specified by supplied Comparator
	 * @param c		Comparator<AbstractPerson>
	 */
	void sortClients(Comparator<AbstractPerson> c);
	
}