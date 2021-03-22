package EmployeeTest;

class Employee {
     private String firstname, lastname;
     private double  monthlysalary;
     
     public Employee(String firstname,String lastname,double monthlysalary){
         this.firstname=firstname;
         this.lastname=lastname;
         this.monthlysalary=monthlysalary;
     }
     
     public void setFirstname(String firstname){
         this.firstname=firstname;
     }
     public String getFirstname(){
         return firstname;
     }
     public void setLastname(String lastname){
         this.lastname=lastname;
     }
     public String getLastname(){
         return lastname;
     }
     public void setMonthlysalary(double monthlysalary){
         if(monthlysalary>0){
             this.monthlysalary=monthlysalary;
         }
         else{
             monthlysalary=0;
             this.monthlysalary=monthlysalary;
         }
     }
     public double getMonthlysalary(){
         return monthlysalary;
     }

    }
