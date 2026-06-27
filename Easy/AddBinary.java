package Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            
            // Append the remainder (0 or 1)
            res.append(sum % 2);
            // Calculate the new carry (0 or 1)
            carry = sum / 2;
        }

        return res.reverse().toString();
    }
}
