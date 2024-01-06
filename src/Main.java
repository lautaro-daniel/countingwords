public class Main {
    public static void main(String[] args) {
        String sentence = "Hello my name is Lautaro. My complete name is Lautaro Daniel Gonzalez";

        System.out.println("There are " +  countWords(sentence) + "words not counting repeat words");
    }

    public static int countWords(String sentence){
        if (sentence == null || sentence.isEmpty()){
            return 0;
        }
        String[] words = sentence.split("\\s+");

        for (int i = 0; i <= words.length; i++)
            for (int j = 0; j <= words.length; j++){
                if (words[i].contentEquals(words[j])){
                    return words.length-1;
                }else {
                    return words.length;
                }
            }
        return 0;
    }
}