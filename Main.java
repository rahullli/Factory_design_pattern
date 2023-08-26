import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cardType = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Salary :");
        double Salary = scanner.nextDouble();
        scanner.close();

        if(Salary<50000){
            cardType = "Silver";
        }
        else  if(Salary<100000){
            cardType = "Gold";
        }
        else{
            cardType = "Platinum"; 
        }

        CardType mycard = Factory.getCard(cardType);
        System.out.println(mycard);
    }
}