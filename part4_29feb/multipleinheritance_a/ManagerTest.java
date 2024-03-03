public class ManagerTest{
    public static void main (String[] args){
	Sortable[] staff = new Employee[4];
	staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
	staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
	staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
	staff[3] = new Manager("Naia Siti Az-zahra", 2500000, 7, 6, 2004);
	int i;
	for (i = 0; i < 4; i++) staff[i].raiseSalary(5);
	for (i = 0; i < 4; i++) staff[i].print();
	Sortable.shell_sort(staff);
    }
}