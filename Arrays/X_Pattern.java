package Take_U_Forward;

public class X_Pattern {
    public static void main(String[] args) {
        String word = "PROGRAMMER";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (i == j || i + j == word.length() - 1)
                    System.out.print(word.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
