package oopPractise;

public class DepartmentDriver {

    public static void main(String[] args){
        DeptOne one =  new DeptOne();
        int emp = one.getEmployee();

        System.out.println("Dept one has " + emp + " employees");
        one.attendance();
    }
}
