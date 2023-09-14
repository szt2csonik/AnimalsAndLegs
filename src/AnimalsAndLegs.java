import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the number of chickens:");
        int chicken=scanner.nextInt();
        System.out.print("Please enter the number of pigs:");
        int pigs=scanner.nextInt();
        System.out.println("The number of legs:" + chicken*2+pigs*4);

    }
}
