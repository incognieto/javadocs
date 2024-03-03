//sorted for Employee
abstract class Sortable{
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a) {
        int n  = a.length;
        for (int range = n/2; range > 0; range /= 2) {
            for (int i = range; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= range && a[j - range].compare(temp) > 0; j -= range) {
                    a[j] = a[j - range];
                }
                a[j] = temp;
            }
        }
    }
    
    public static void printPerson(Sortable[] p) {
        for (Sortable person : p) {
            System.out.println(p);
        }
    }
}

//sorted for Manager
interface Sortable{
    public int compare(Sortable temp);
    public static void shell_sort(Sortable[] staff) {
        int n  = staff.length;
        for (int jarak = n/2; jarak > 0; jarak /= 2) {
            for (int i = jarak; i < n; i++) {
                Sortable temp = staff[i];
                int j;
                for (j = i; j >= jarak && staff[j - jarak].compare(temp) >   0; j -= jarak) {
                    staff[j] = staff[j - jarak];
                }
                staff[j] = temp;
            }
        }
    }
    public void raiseSalary(double i);
    public void print();
}