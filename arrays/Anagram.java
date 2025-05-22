//12.⁠ ⁠Perform the function Checkpassword (char str[], int n)
// Execute the function which happens to be 1 if the str is a valid password or it remains 0.
// Conditions for a valid password: 
// o	The password should have at least 4 characters.
// o	It should have at least 1 digit.
// o	It should have one capital letter.
// o	It should not have any spaces or obliques (/).
// // o	The first character should not be a number.
// Assumption
// The input is not empty.
// Example
// Input:
// aA1_67
// Output:
// 1
public class Anagram {

    public static int Checkpassword(String str, int n) {

        if (n < 4) {
            return 0;
        }

        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ' || ch == '/') {
                return 0;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
        }
        if (hasDigit && hasUpperCase) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        
        String password = "aA1_67";
        int length = password.length();

        int result = Checkpassword(password, length);
        System.out.println(result); 
    }
}

