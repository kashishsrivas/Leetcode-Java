package Easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length =0;
        int i = s.length() -1;

        //skip the spaces
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }

        //count the letters
        while(i>=0 && s.charAt(i) != ' '){
            length ++;
            i--;
        }

        return length;
    }
}
