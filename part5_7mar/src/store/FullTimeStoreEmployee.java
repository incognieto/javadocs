package store;

public class FullTimeStoreEmployee extends AbstractStoreEmployee {

    /**
     * Constructor for FullTimeStoreEmployee.
     *
     * @param numberOfHoursWorked The number of hours worked by the employee.
     * @param hourlyRate          The hourly rate of the employee.
     * @param storeDetails        Details of the store.
     * @param basePay             The base pay of the employee.
     * @param employeeName        The name of the employee.
     */
    public FullTimeStoreEmployee(double numberOfHoursWorked, double hourlyRate, String storeDetails,
            double basePay, String employeeName) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
    }

    /**
     * Calculates pay for a full-time store employee.
     *
     * @return The calculated pay for a full-time store employee.
     */
    @Override
    public double calculatePay() {
        // Implement the calculation logic for full-time employee pay
        // For example, it could be the sum of base pay and overtime pay
        // based on the number of hours worked.
        // You need to define the specific logic based on your requirements.
        // For now, let's assume a simple calculation:
        return getBasePay() * getNumberOfHoursWorked();
    }

    /**
     * Checks if a full-time store employee is eligible for promotion.
     *
     * @return true if eligible for promotion, false otherwise.
     */
    @Override
    public boolean checkPromotionEligibility() {
        // Implement promotion eligibility logic for full-time employee
        // For now, let's assume everyone is eligible.
        return true;
    }

    @Override
    public void performEmployeeSpecificTask() {
        // Implementasikan fungsionalitas khusus FullTimeStoreEmployee di sini
        System.out.println("Full Time Store Employee melakukan tugas khusus.");
    }

}
