import java.util.Scanner;

public class wordcounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String sentence = scan.nextLine();
        sentence += " ";
        int wordCount = 0;
        boolean last = false;

        for (int i = 0; i < sentence.length(); i++) {
            String lett = sentence.substring(i, i + 1);
            if (lett.equals("?") || lett.equals("-") || lett.equals(" ") || lett.equals("!") || lett.equals(",") || lett.equals(".")) {
                last = false;
            } else if (!last) {
                last = true;
                wordCount++;
            }
        }

        System.out.println("Word count: " + wordCount);
    }
}
