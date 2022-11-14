import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //variables and scanner
        Scanner scan = new Scanner(System.in);
        String p1Name;
        String p2Name;
        String p1Type;
        String p2Type;
        int p1Power;
        int p2Power;

        //Fill out the classes
        System.out.println("P1: Enter the name of your dragon");
        p1Name = scan.next();
        System.out.println("P1: Enter the type of your dragon");
        p1Type = scan.next();
        System.out.println("P1: Enter the power of your dragon");
        p1Power = scan.nextInt();
        System.out.println("P2: Enter the name of your dragon");
        p2Name = scan.next();
        System.out.println("P2: Enter the type of your dragon");
        p2Type = scan.next();
        System.out.println("P2: Enter the power of your dragon");
        p2Power = scan.nextInt();

        Dragon p1 = new Dragon(p1Name, p1Power, p1Type);
        Dragon p2 = new Dragon(p2Name, p2Power, p2Type);

        System.out.println("\n");
        System.out.println("Player One Stats");
        System.out.println(p1.toString());
        System.out.println("Player Two Stats");
        System.out.println(p2.toString());

        System.out.println("\n");
        if(p1.getDragPower() == p2.getDragPower())
        {
            System.out.println("Your dragons have the same power, they end up respecting each other and " + p1.getName() + " and " +
                    p2.getName() + " married and run into the distance with each other!!");
        }
        else if(p1.getDragPower() > p2.getDragPower())
        {
            System.out.println("The dragon " + p1.getName() + " has overpowered " + p2.getName() + " and thus is the better dragon.");
        }
        else
        {
            System.out.println("The dragon " + p2.getName() + " has overpowered " + p1.getName() + " and thus is the better dragon.");
        }
    }
}