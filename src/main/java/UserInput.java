public class UserInput {

    public int chosenType (int input) {

        CountLength countLength = new CountLength();

        int result = 0;

        switch(input) {
            case (1):
                result = countLength.countByteLength();
                break;

            case (2):
                result = countLength.countShortLength();;
                break;

            case (3):
                result = countLength.countIntegerLength();
                break;

            case (4):
                result = countLength.countLongLength();
                break;

            default:
                System.out.println("Wrong input!!!");
                break;
        }
        return result;
    }
}
