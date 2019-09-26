import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        CountLength countLength = new CountLength();
        UserInput userInput = new UserInput();
        Output output = new Output();

        Scanner in = new Scanner(System.in);
        System.out.println("Choose the variable you want to know the length of:\n1.Byte\n2.Short\n3.Integer\n4.LongInteger\n");
        int result = in.nextInt();

        int out = userInput.chosenType(result);
        System.out.println(output.requiredOutput(out));
    }

}
