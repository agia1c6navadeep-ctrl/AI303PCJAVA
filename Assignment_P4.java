public class Assignment_P4 {
    public static String toTitleCase(String name) {
        if (name == null || name.isBlank()) return ""; // Demonstrates isBlank()
        String[] words = name.split(" "); // Demonstrates split()
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                titleCase.append(word.substring(0, 1).toUpperCase()) // Demonstrates substring(), toUpperCase()
                         .append(word.substring(1).toLowerCase())    // Demonstrates toLowerCase()
                         .append(" ");
            }
        }
        return titleCase.toString().trim();
    }
    public static String maskEmail(String email) {
        int atIndex = email.indexOf("@"); // Demonstrates indexOf()
        if (atIndex <= 3) {
            return email;
        }
        String prefix = email.substring(0, 3);
        int maskLength = atIndex - 3;
        String masked = prefix + "*".repeat(maskLength) + email.substring(atIndex); // Demonstrates repeat()
        return masked;
    }
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim().toLowerCase();
    }
    public static int countVowels(String sentence) {
        int count = 0;
        char[] chars = sentence.toCharArray(); // Demonstrates toCharArray()
        for (char c : chars) {
            char lower = Character.toLowerCase(c);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                count++;
            }
        }
        return count;
    }
	  public static void main(String[] args) {
        String fullName = "john WICK";
        String email = "john.wick@example.com";
        String sentence = "Hello World From Java";
        System.out.println("Formatted Name: " + toTitleCase(fullName));
        System.out.println("Masked Email: " + maskEmail(email));
        // Demonstrates matches()
        boolean isValidEmail = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
        System.out.println("Valid Email: " + isValidEmail);
        System.out.println("Reversed Words: " + reverseWords(sentence));
        System.out.println("Vowel Count: " + countVowels(sentence));
        // Demonstrates difference between == and equals()
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println("s1 == s2: " + (s1 == s2)); // false (different objects)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true (same content)
    }
}