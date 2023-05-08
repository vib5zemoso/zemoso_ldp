package basic.java;
//it is establishing relationship between two different classes through their objects.
//it is of two types
//aggregation -> if both entities that are associated can exist independently
//               destroying one entity will not affect other


import java.util.ArrayList;
import java.util.List;

class college{
    String name;
    private List<Teacher> teacher;
    public college(String name, List<Teacher> teacher){
        this.name =  name;
        this.teacher = teacher;
    }
    public List<Teacher> getTeacher(){
        return teacher;
    }
}

class Teacher{
    String name, subject;
    public Teacher(String name, String sub){
        this.name =  name;
        this.subject = sub;
    }
    @Override
    public String toString(){
        return "(Teacher:"+name+ " ,Subject: " + subject +")";
    }

}

public class AssocaiaionDemo {
    public static void main(String[] args){
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Rohan", "Java"));
        teachers.add(new Teacher("John", "C++"));

        college coll = new college("MyCollege", teachers);
    }
}
