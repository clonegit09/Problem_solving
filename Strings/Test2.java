public class Test2 {

    public static int operationsBinaryString(String str) {
        // if (str == null || str.length() % 2 == 0) {
        //     return -1;
        // }
        int result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);
            int nextDigit = str.charAt(i + 1) - '0';

            switch (operation) {
                case 'A':
                    result &= nextDigit;
                    break;
                case 'B':
                    result |= nextDigit;
                    break;
                case 'C':
                    result ^= nextDigit;
                    break;
                default:
                    return -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        int result = operationsBinaryString(str);
        System.out.println("Result: " + result);
    }
}
