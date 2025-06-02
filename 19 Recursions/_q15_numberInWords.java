public class _q15_numberInWords {
    public static final String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine" };

    public static String numberInWords(int number) {
        if (number < 10) {
            if (number < 0) {
                return " ";
            }
            return arr[number];
        }

        int ld = number % 10;
        int temp = number / 10;
        String lastDigit = arr[ld];
        return numberInWords(temp) + " " + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(numberInWords(10));
    }
}
