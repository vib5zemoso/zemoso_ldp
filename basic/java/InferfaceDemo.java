package basic.java;

public interface InferfaceDemo {
    static final String a= "hello";
    public void methodOne();
    public int methodTwo();
    static  void methodThree() {};
    default  int methodFour() {return 0;};
    private void methodFive() {};
}
class Test implements  InferfaceDemo{

    @Override
    public void methodOne() {

    }

    @Override
    public int methodTwo() {
        return 0;
    }
}
