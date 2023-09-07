package assignmentsjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Form {
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;
    public void rangeKyc(String inputSignUpDate, String inputCurrentDate) {
        try {

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate= dateFormatter.parse(inputCurrentDate);

            if(signUpDate.after(currentDate)) {
                System.out.println("No range");
            }
            else {
                startDate = signUpDate;

                startDate.setYear(currentDate.getYear());

                Calendar calendar = Calendar.getInstance();

                calendar.setTime(startDate);

                calendar.add(Calendar.DATE, -30);
                startDate=calendar.getTime();

                calendar.add(Calendar.DATE, 60);
                endDate=calendar.getTime();

                if(endDate.after(currentDate)) {
                    endDate=currentDate;
                }
                stringStartDate=dateFormatter.format(startDate);
                stringEndDate=dateFormatter.format(endDate);
                System.out.print(stringStartDate);
                System.out.print("	");
                System.out.println(stringEndDate);
            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
};

public class Assignment4 {
    public static void main(String[] args) {
        Form obj =new Form();
        obj.rangeKyc("16-07-1998", "27-06-2017");
        obj.rangeKyc("04-02-2016", "04-04-2017");
        obj.rangeKyc("04-05-2017", "04-04-2017");
        obj.rangeKyc("04-04-2015", "04-04-2016");
        obj.rangeKyc("04-04-2015", "15-03-2016");
    }
}
