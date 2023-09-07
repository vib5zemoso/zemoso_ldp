package assignmentsjava;

class WrongPassword extends Exception{
    public WrongPassword(String str){
        super(str);
    }
};

class InvalidAge extends Exception{
    public InvalidAge(String str){
        super(str);
    }
};

class WrongEmail extends Exception{
    public WrongEmail(String str){
        super(str);
    }
};
class Check extends Exception{

    public void CheckErrors(String password,String age,String email)throws WrongPassword,InvalidAge,WrongEmail {

        if(password.length()<8)
        {
            throw new WrongPassword("Wrong password, Minimum length is 8");
        }
        if(Integer.parseInt(age) < 18){
            throw new InvalidAge("Age is less than 18, account cannot be created");
        }

        String regex = "^(.+)@(\\S+)$";
        if(!email.matches(regex)){
            throw new WrongEmail("Wrong email");
        }
    }
};
public class Assignment8 {
    public static void main(String[] args) {

        try {
            Check obj = new Check();
            obj.CheckErrors("Password","18","vibhuti#gmail.com");
        }
        catch(WrongPassword | WrongEmail | InvalidAge e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception not caught.");
        }

    }
}
