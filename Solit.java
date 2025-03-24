import java.util.Scanner;

public class Solit {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();
        System.out.println("age =  ");
        person1.age= input.nextInt();

        System.out.println("name");
        person1.name = input.nextLine();

        System.out.println("vas zovut " + person1.name + "i vam " + person1.age);


    }
}
class Person{
    String name;
    int age;
}