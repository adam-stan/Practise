package reverseString;

public class Reversal {

    private String newWord = "";

    public void reverseWord(String word) {
        for(int i = word.length() - 1; i >= 0; i--) {
            newWord = newWord + word.charAt(i);
        }
        System.out.println(newWord);
    }
}
