import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){

        boolean Done = false;
        String color = null;
        while(!Done) {
            int choice = 0;
            System.out.printf("So... you want a duck huh?\n\t1.White\n\t2.Grey\n\n[Choose a color]: ");
            Scanner get = new Scanner(System.in);
            choice = get.nextInt();

            if (choice < 1 || choice > 2)
                System.out.println("Invalid Entry, Try again!\n");
            else if(choice == 1){
                color = "white";
                Done = true;
            } else{
                color = "grey";
                Done = true;
            }
        }

        chooseStore(color);
    }

    public static void chooseStore(String color){
        Duck duck = null;
        boolean Done = false;
        while(!Done) {
            int choice = 0;
            System.out.println("\nNice, you want a "+ color + " duck, but from which store...?");
            System.out.printf("\n\t1.Real Duck Store\n\t2.Fake Duck Store\n\n[Choose a store]: ");
            Scanner get = new Scanner(System.in);
            choice = get.nextInt();

            if (choice < 1 || choice > 2)
                System.out.println("Invalid Entry, Try again!\n");
            else if(choice == 1){
                duck = new RealDuckStore().getDuck(color);
                Done = true;
            } else{
                duck = new FakeDuckStore().getDuck(color);
                Done = true;
            }
        }


        System.out.println("Here's your order!\n\n\t>" + duck.getName());
    }




}
