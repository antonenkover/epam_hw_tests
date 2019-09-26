public class Calculations {

    public int changeCharacterValue (String binNum, int pos) {

        int binNumInt = Integer.parseInt(binNum, 2);
        int val = 1;
        int changedNum;
        val <<= (binNum.length() - pos);

        if (binNum.charAt(pos - 1) == '1') {
            changedNum = binNumInt ^ val;
        }
        else
            changedNum = binNumInt | val;

        return changedNum;
    }

}
