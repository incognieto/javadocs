public class ManagerTest{
    public static void main (String[] args){
	Sortable[] staff = new Manager[4];
	staff[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 2000);
	staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
	staff[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 2019);
	staff[3] = new Manager("Nieto Salim Maula", 6666, 7, 6, 2018);
	
    Sortable.shell_sort(staff);
    
    int i;
	for (i = 0; i < 4; i++) staff[i].raiseSalary(5);
	for (i = 0; i < 4; i++) staff[i].print();
    
    }
}