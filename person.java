import java.util.Scanner;
public class person {
    Scanner input = new Scanner(System.in);

    private String FullN;
    private int Age;
    private String Adss;



    public void setAdss(String adss) {

        Adss = adss;
    }

    public void setAge(int age) {

        if(Age>0) {
            Age = age;
        }
        else {
            System.out.println("Invalid number of age ");
            System.out.println("age: ");

        }
    }

    public void setFullN(String fullN) {
        FullN = fullN;
    }

    public String getFullN() {
        return FullN;
    }

    public String getAdss() {
        return Adss;
    }

    public int getAge() {
        return Age;
    }



    public void Display(){

        System.out.println("Enter Your Full Name:");
        String name= input.next();
        setFullN(name);
        System.out.println("enter your age: ");
        int ag=input.nextInt();
        setAge(ag);
        System.out.println("Enter your Adress");
        String Ads=input.next();
        setAdss(Ads);


    }
}
