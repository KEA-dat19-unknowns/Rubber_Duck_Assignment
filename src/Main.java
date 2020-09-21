import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Duck Race!\n\nChoose an option:");
        System.out.println("1. Start the race\t2. Add a duck to a queue");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");

        Queue queue = new Queue();
        switch(sc.nextLine()){
            case "1":
                break;
            case "2":
                queue.loadInQueues();
                queue.addAndRemoveDuck();

        }


    }


}
