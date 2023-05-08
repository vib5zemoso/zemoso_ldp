package solidprinciple.singleresponsibility.good;

import java.util.Random;

public class NotificationService {
    public String sendOTP(String medium) {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        if (medium.equals("email")) {
            System.out.println("Sending notification via email");
            return String.format("%06d", number);
        }
        if(medium.equals("mobile")){
            System.out.println("Sending notification to mobile");
            return String.format("%06d", number);
        }
        return "no OTP sent";
    }
}
