package EmployeeTest;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee Employee1 = new Employee("Paula","Hawkins",500);
        Employee Employee2 = new Employee("John","Blue",400);
        double yearlysalary=Employee1.getMonthlysalary()*12;
        System.out.printf("Yearly salary of %s %s is $%.2f ",Employee1.getFirstname(),Employee1.getLastname(),yearlysalary);
        System.out.println();
        yearlysalary=Employee2.getMonthlysalary()*12;
        System.out.printf("Yearly salary of %s %s is $%.2f ",Employee2.getFirstname(),Employee2.getLastname(),yearlysalary);
        System.out.println();        
        
        double raised_yearly=yearlysalary*1.1;
        System.out.printf(" %s %s ’s yearly salary after  10percent raise is $%.2f",Employee1.getFirstname(),Employee1.getLastname(),raised_yearly);
        System.out.println();
        raised_yearly=yearlysalary*1.1;
        System.out.printf(" %s %s ’s yearly salary after  10percent raise is $%.2f",Employee2.getFirstname(),Employee2.getLastname(),raised_yearly);

    }
}
