package Challenges;


//Test comment

public class RotateWords {
    public static void main(String[] args) {
        System.out.println(reverseSentence("This is a test string"));
    }

    public static String reverseSentence(String sentence) {
        //if the string is empty - we cant reverse it
        if(sentence.isEmpty()) {
            return null;
        }

        String[] splittedSentence = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < splittedSentence.length; i++) {
            builder.append(new StringBuilder(splittedSentence[i]).reverse());
            if(i != splittedSentence.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
