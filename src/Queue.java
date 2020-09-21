import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    ArrayList<Duck> duckListA = new ArrayList<>();
    ArrayList<Duck> duckListB = new ArrayList<>();
    ArrayList<Duck> duckListC = new ArrayList<>();
    ArrayList<Duck> duckListD = new ArrayList<>();
    ArrayList<Duck> duckListE = new ArrayList<>();
    ArrayList<Duck> duckListF = new ArrayList<>();
    ArrayList<Duck> duckListG = new ArrayList<>();
    ArrayList<Duck> duckListH = new ArrayList<>();
    ArrayList<Duck> duckListI = new ArrayList<>();
    ArrayList<Duck> duckListJ = new ArrayList<>();

    void loadInQueues() {
        for (int i = 0; i < 10; i++) {
            Duck tempA = new Duck(i, "A" + i);
            duckListA.add(tempA);

            Duck tempB = new Duck(i, "B" + i);
            duckListB.add(tempB);

            Duck tempC = new Duck(i, "C" + i);
            duckListC.add(tempC);

            Duck tempD = new Duck(i, "D" + i);
            duckListD.add(tempD);

            Duck tempE = new Duck(i, "E" + i);
            duckListE.add(tempE);

            Duck tempF = new Duck(i, "F" + i);
            duckListF.add(tempF);

            Duck tempG = new Duck(i, "G" + i);
            duckListG.add(tempG);

            Duck tempH = new Duck(i, "H" + i);
            duckListH.add(tempH);

            Duck tempI = new Duck(i, "I" + i);
            duckListI.add(tempI);

            Duck tempJ = new Duck(i, "J" + i);
            duckListJ.add(tempJ);
        }
    }

    void addAndRemoveDuck() {

        System.out.println("Which queue would you like to add a duck to?");
        System.out.println("A\t\tB\t\tC\t\tD\t\tE\nF\t\tG\t\tH\t\tI\t\tJ ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");

        int i;
        switch (sc.nextLine()) {
            case "A":
                System.out.println(duckListA.size());
                i = duckListA.size() + 1;
                Duck tempDuckA = new Duck(i, "A" + i);
                duckListA.add(tempDuckA);
                System.out.println("Duck " + duckListA.get(i-1).getName() + " have been added to the queue!");
                duckListA.remove(0);
                break;
            case "B":
                i = duckListB.size() + 1;
                Duck tempDuckB = new Duck(i, "B" + i);
                duckListB.add(tempDuckB);
                System.out.println("Duck " + duckListB.get(i-1).getName() + " have been added to the queue!");
                duckListB.remove(0);
                break;
            case "C":
                i = duckListC.size() + 1;
                Duck tempDuckC = new Duck(i, "C" + i);
                duckListC.add(tempDuckC);
                System.out.println("Duck " + duckListC.get(i-1).getName() + " have been added to the queue!");
                duckListC.remove(0);
                break;
            case "D":
                i = duckListD.size() + 1;
                Duck tempDuckD = new Duck(i, "D" + i);
                duckListD.add(tempDuckD);
                System.out.println("Duck " + duckListD.get(i-1).getName() + " have been added to the queue!");
                duckListD.remove(0);
                break;
            case "E":
                i = duckListE.size() + 1;
                Duck tempDuckE = new Duck(i, "E" + i);
                duckListE.add(tempDuckE);
                System.out.println("Duck " + duckListE.get(i-1).getName() + " have been added to the queue!");
                duckListE.remove(0);
                break;
            case "F":
                i = duckListF.size() + 1;
                Duck tempDuckF = new Duck(i, "F" + i);
                duckListF.add(tempDuckF);
                System.out.println("Duck " + duckListF.get(i-1).getName() + " have been added to the queue!");
                duckListF.remove(0);
                break;
            case "G":
                i = duckListG.size() + 1;
                Duck tempDuckG = new Duck(i, "G" + i);
                duckListG.add(tempDuckG);
                System.out.println("Duck " + duckListG.get(i-1).getName() + " have been added to the queue!");
                duckListG.remove(0);
                break;
            case "H":
                i = duckListH.size() + 1;
                Duck tempDuckH = new Duck(i, "H" + i);
                duckListH.add(tempDuckH);
                System.out.println("Duck " + duckListH.get(i-1).getName() + " have been added to the queue!");
                duckListH.remove(0);
                break;
            case "I":
                i = duckListI.size() + 1;
                Duck tempDuckI = new Duck(i, "I" + i);
                duckListI.add(tempDuckI);
                System.out.println("Duck " + duckListI.get(i-1).getName() + " have been added to the queue!");
                duckListI.remove(0);
                break;
            case "J":
                i = duckListJ.size() + 1;
                Duck tempDuckJ = new Duck(i, "J" + i);
                duckListJ.add(tempDuckJ);
                System.out.println("Duck " + duckListJ.get(i-1).getName() + " at index " + duckListJ.get(i-1).getValue() +  " have been added to the queue!");
                duckListH.remove(0);
                break;
        }
    }

    void removeDuck() {

    }

    void duckListSize() {
    }
}