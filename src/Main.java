public class Main {

    public static void main (String[] args){
       // THIS IS MY FIRST JAVA REVISION  PROGRAM
        /*
        this
        is
        a
        multiline
        comment
         */
        System.out.println("Hello world!");
        System.out.println("I like Pizza!");
        System.out.println("It's really good!");
        System.out.println("Buy me Pizza!");

        int age = 21;
        int year = 2025;
        int quantity = 2;

        System.out.println(age);

        double price = 6.4;
        double marks = 33.54;
        double temperature = -33.4;
        System.out.println(price);

        char grade = 'A';
        char symbole = '!';

        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;

        if(isStudent){
            System.out.println("You are a student !");
        }
        else{
            System.out.println("you are not a student");
        }

        String name = "bro code";
        String food = "pizza";
        String email = "fake1234@gmail.com";

        System.out.println("your email is :"+ email);
    }
}