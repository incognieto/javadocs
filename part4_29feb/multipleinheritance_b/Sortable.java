interface Sortable{
    public int compare(Sortable temp);
    public static void shell_sort(Sortable[] staff) {
        int n  = staff.length;
        for (int range = n/2; range > 0; range /= 2) {
            for (int i = range; i < n; i++) {
                Sortable temp = staff[i];
                int j;
                for (j = i; j >= range && staff[j - range].compare(temp) >   0; j -= range) {
                    staff[j] = staff[j - range];
                }
                staff[j] = temp;
            }
        }
    }
    public void raiseSalary(double i);
    public void print();
}