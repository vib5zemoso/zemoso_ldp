package assignmentsjava.Assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female","Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        // 1. Print the name of all departments in the college
        System.out.println("1.Departments are : ");
        students.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(s -> System.out.print(s+ ", "));
        System.out.println();
        System.out.println();

        // 2. Get the names of all students who have enrolled after 2018
        System.out.println("2. Students enrolled after 2018: ");
        students.stream()
                .filter(s -> s.getYearOfEnrollment() > 2018)
                .map(Student::getName)
                .forEach(s -> System.out.print(s+ ", "));
        System.out.println();
        System.out.println();

        // 3. Get the details of all male student in the computer sci department
        System.out.println("3. Male students in Computer Science: ");
        students.stream()
                .filter(s -> s.getGender().equals("Male") && s.getEngDepartment().equals("Computer Science"))
                .forEach(System.out::println);
        System.out.println();

        // 4. How many male and female student are there ?
        System.out.println("4. Number of male and female students : ");
        Map<String, Long> genderCount = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("Male Count: " + genderCount.get("Male"));
        System.out.println("Female Count: " + genderCount.get("Female"));
        System.out.println();

        // 5.What is the average age of male and female students?
        System.out.println("5. Average age of male and female students are as follows: ");
        Map<String, Double> averageAgeByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));

        System.out.println("Average age of male students: " + averageAgeByGender.get("Male"));
        System.out.println("Average age of female students: " + averageAgeByGender.get("Female"));
        System.out.println();

        // 6.Get the details of the highest student having the highest percentage ?
        System.out.println("6. Details of highest student : ");
        System.out.println(students.stream()
                .max(Comparator.comparingDouble(Student::getPerTillDate)));
        System.out.println();

        // 7.Count the number of students in each department?
        System.out.println("7. Count the number of students in each department are as follows: ");
        Map<String, Long> countByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
        System.out.println("Number of students in each department: " + countByDepartment);
        System.out.println();

        // 8. What is the average percentage achieved in each department?
        Map<String, Double> avgByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println("8. Average percentage achieved in each department: " + avgByDepartment);
        System.out.println();

        // 9. Get the details of the youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        Optional<Student> youngestMaleInElectronic = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("male") && student.getEngDepartment().equalsIgnoreCase("Electronic"))
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
        if (youngestMaleInElectronic.isPresent()) {
            System.out.println("9. Details of youngest male student in the Electronic department: " + youngestMaleInElectronic.get());
        } else {
            System.out.println("9. No male student found in the Electronic department");
        }
        System.out.println();

        // 10.How many male and female students are there in the computer science department?
        Map<String, Long> countByGenderInComputerScience = students.stream()
                .filter(student -> student.getEngDepartment().equalsIgnoreCase("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("10. Number of male and female students in the Computer Science department: " + countByGenderInComputerScience);
        System.out.println();



    }
}
