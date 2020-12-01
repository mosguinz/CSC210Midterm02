package midterm2testwed;

import java.util.Scanner;

public class Midterm2Wed {
    public static void main(String[] args) {
        Employee x = new Employee("Nancy");
        System.out.println(Employee.employeeCount);

        System.out.println(x.getEmployeeName());//1d

        x.setEmployeeName("George");
        System.out.println(x.getEmployeeName());

        //2d using any method from GreetingHub is fine
        GreetingHub gh = new GreetingHub();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the event: ");
        String event = scanner.next();
        System.out.println(gh.returnGreeting(event) + "!");

        //3c need 2 objects, parameter type need to match, values can be anything
        SFSUClub sfsuClub1 = new SFSUClub();
        SFSUClub sfsuClub2 = new SFSUClub("Women\'s League", 600);
        /*
        3e.When should data fields be private?
        When they are tied to the object like sfsuClub name
        3f. When should data fields be static?
        When they are tied to the class like SFSUClub.numObj

        4. Encapsulation and abstraction when data is private it is encapsulated
        the program is this abstracted way when used by the user in the main method

        5. No
        n/a
         */

        //6
        String[][] animalArray = {
                {"Ant", "Bat", "Cat", "Dog"},
                {"Emu", "Fox", "Gar"},
                {"Hare", "Ibis"},
                {"Jackal"}
        };
        for (int i = 0; i < animalArray.length; i++) {
            for (int j = 0; j < animalArray[i].length; j++) {
                System.out.printf("%s ", animalArray[i][j]);
            }
            System.out.println();
        }


        //6b animalArray.length
        //6c animalArray[1].length
        //7a class is a blueprint, object is an instance of that class
        //7b
        SFSUClub c1 = new SFSUClub("Black Excellence in STEM", 80);
        SFSUClub c2 = new SFSUClub("Society of Women Engineers", 70);
        SFSUClub c3 = new SFSUClub("ACM", 60);
        SFSUClub[] clubArray = {c1, c2, c3};

        for (int i = 0; i < clubArray.length; i++) {
            System.out.println(clubArray[i].getName() + " " +
                    clubArray[i].getNumOfMembers());
        }

        //7d

        System.out.printf("Average is %.2f", getAverage(clubArray));

    }

    static double getAverage(SFSUClub[] clubs){
        double avg=0,sum=0;
        int len = clubs.length;
        for (int i=0; i<len; i++){

            sum += clubs[i].getNumOfMembers();
        }
        avg = sum/len;
        return avg;
    }

}

class Employee{
    private String employeeName;

    public static int employeeCount=0;
//	constructor you enter in "a.” will be placed here
    Employee(String name){// 1a
        this.employeeName = name;
        employeeCount++;// 1b
    }

//	the getter method for employeeName will be placed here
    public String getEmployeeName(){ // 1c
        return employeeName;
    }

    public void setEmployeeName(String name){// 1e
        this.employeeName = name;
    }
}

class GreetingHub{

    public String returnGreeting(String g){// 2a
        String s = "Happy " + g;
        return s;
    }
    public void makeGreeting(String g){//2b
        System.out.println("Happy "+ g);
    }
    public void displayGreeting(){
        System.out.println("Happy Coding"); //2c

    }
}
class SFSUClub{
    private String name;
    private int numOfMembers;
    public static int numObj=0; //3a
    /*
Indicate clearly if you will make the data field private or public, non-static or static?
Data will be public and static
Please also explain in detail how the data field should be used.
Data will be used in each constructor and will increment each time
  */

    SFSUClub(){ // 3b

        numObj++;//3a
    }
    SFSUClub(String name, int numOfMembers){ // 3b
        this.name = name;
        this.numOfMembers = numOfMembers;
        numObj++;//3a


    }

    public String getName() {
        return name;
    }
    public int getNumOfMembers(){
        return this.numOfMembers;

    }
    public void setName(String n){
        this.name = n;
    }
    public void setNumOfMembers(int num){
        this.numOfMembers = num;
    }


}
