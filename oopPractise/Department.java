package oopPractise;

public abstract class Department {

    public abstract int getEmployee();
    public abstract void method();
    public final void attendance(){
        System.out.println("I am present");
    }
}

class DeptOne extends Department{
    @Override
    public int getEmployee() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("this is implementation");
    }
}
