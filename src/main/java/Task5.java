import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Calculations calculations = new Calculations();
        ConvertToBinary convertToBinary = new ConvertToBinary();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your binary number: ");
        String binNum = in.nextLine();
        System.out.println("Enter the position to which you want to apply changes: ");
        int pos = in.nextInt();

        int result = calculations.changeCharacterValue(binNum, pos);
        System.out.println(convertToBinary.convert(result));

    }

}
