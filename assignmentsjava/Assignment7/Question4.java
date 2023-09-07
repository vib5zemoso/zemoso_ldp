package assignmentsjava.Assignment7;

interface cycle{
    void code();
    void factory();
}
class unicycle implements cycle{
    public void code(){
        factory();
    }
    public void factory(){
        System.out.println("Factory of Unicycle");
    }

};
class bicycle implements cycle{
    public void code(){
        factory();
    }
    public void factory(){
        System.out.println("Factory of Bicycle");
    }
};
class tricycle implements cycle{
    public void code(){
        factory();
    }
    public void factory(){
        System.out.println("Factory of tricycle");
    }
};
public class Question4 {
    public static void main(String[] args){
        unicycle uni = new unicycle();
        uni.code();
        bicycle bi = new bicycle();
        bi.code();
        tricycle tri = new tricycle();
        tri.code();
    }
}
