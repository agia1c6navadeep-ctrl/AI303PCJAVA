public class Assignment_P2 {
    public static void analyzeString(String sentence, char targetChar) {
        // 1. Word Count
        String[] words = sentence.split(" "); // Demonstrates split()
        int wordCount = words.length;
        // 2. First Word and Last Word
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        // Demonstrating substring()
        String substringFirstWord = sentence.substring(0, sentence.indexOf(" "));
        // 3. First and Last Occurrence Index of a given character
		  int firstIndex = sentence.indexOf(targetChar); // Demonstrates indexOf()
        int lastIndex = sentence.lastIndexOf(targetChar); // Demonstrates lastIndexOf()
        // 4. Lexicographic Comparison
        int comparisonResult = firstWord.compareTo(lastWord); // Demonstrates compareTo()
        // 5. Character array and first character's ASCII value
        char[] charArray = sentence.toCharArray(); // Demonstrates toCharArray()
        char firstChar = sentence.charAt(0); // Demonstrates charAt()
        int asciiValue = (int) firstChar;
        // Demonstrating String.valueOf()
        String convertedVal = String.valueOf(firstChar);
        System.out.println("Word Count: " + wordCount);
        System.out.println("First Word: " + firstWord);
        System.out.println("Last Word: " + lastWord);
        System.out.println("First '" + targetChar + "' index: " + firstIndex);
        System.out.println("Last '" + targetChar + "' index: " + lastIndex);
        System.out.println("Comparison (first vs last word): " + comparisonResult);
        System.out.println("First Character ASCII Value: " + asciiValue);
    }
    public static void main(String[] args) {
        String input = "Java is fun and Java is powerful";
        analyzeString(input, 'J');
    }
}