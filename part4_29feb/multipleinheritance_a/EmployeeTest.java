public class EmployeeTest{ 
    public static void main (String[] args){ 
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Upin", 9100000, 1, 10, 2003);
        staff[1] = new Employee("Mail", 1700000, 1, 12, 2004);
        staff[2] = new Employee("Jarjit", 7500000, 1, 11, 2005);

        Sortable.shell_sort(staff);

        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
    }
}