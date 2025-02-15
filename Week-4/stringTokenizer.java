import java.util.StringTokenizer;
import java.util.Scanner;
public class stringTokenizer {

    String text;
    stringTokenizer(String st){
        text=st;
    }
    public int countWords() {
        StringTokenizer st = new StringTokenizer(text);
        return st.countTokens(); 
    }

    public int countSentences() {
        StringTokenizer st = new StringTokenizer(text, ".");
        int sentences = 0;
        while (st.hasMoreTokens()) {
            sentences++;
            st.nextToken();
        }
        return sentences;
    }

    public int countE() {
        StringTokenizer st = new StringTokenizer(text);
        int e = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'e' || word.charAt(i) == 'E') {
                    e++;
                }
            }

        }
        return e;
    }

    public int countZ() {
        StringTokenizer st = new StringTokenizer(text);
        int z = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'z' || word.charAt(i) == 'Z') {
                    z++;
                }
            }
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string here:");
        String str= sc.nextLine();
        stringTokenizer obj = new stringTokenizer(str);
        System.out.println("The number of words in the text = " + obj.countWords());
        System.out.println("The number of sentences in the text = " + obj.countSentences());
        System.out.println("The number of times the letter 'e' occurs in the text = " + obj.countE());
        System.out.println("The number of times the letter 'z' occurs in the text = " + obj.countZ());
    }
}

