package Lab7;

public class StudentApp {
    public static void main (String [] args){


        //create object of Student class
        Student std1 = new Student();


        std1.setName("Kanokwan Wetarun");
        std1.setPerson_id("363211760032");
        std1.setAge(21);

        displayDataObject(std1);


        Student std2 = new Student();

        std2.setName("Paramat Pantaweep");
        std2.setPerson_id("363211760022");
        std2.setAge(21);

        displayDataObject(std2);

        std2.setName("Model Athiwara");

        Student std3 = new Student("Theerapol Nuijaroen ","363211760039",21);

        displayDataObject(std3);

        System.out.println(std3.toString());





    }//main

    private static void displayDataObject(Student std){
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }


}//class
