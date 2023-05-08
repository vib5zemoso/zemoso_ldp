package javacourse;

class Laptop{
    private int id;
    private String brand;
    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Laptop [id=" + id + ", brand=" + brand + "]";

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (id != other.id)
            return false;
        return true;
    }


}
public class EqualsMethod {
    public static void main(String[] args) {

        System.out.println(new Object());

        Laptop laptop1 = new Laptop(250, "HP");
        Laptop laptop2 = new Laptop(90, "DELL");

        System.out.println(laptop1.equals(laptop2));

        int firstNumber = 8;
        int secondNumber= 8;

        System.out.println(firstNumber == secondNumber);

        String a = "Yes";
        String b = "Yesopss".substring(0,3);

        System.out.println(a.equals(b));
        System.out.println(b);

    }
}
