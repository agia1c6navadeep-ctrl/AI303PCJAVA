import java.util.Arrays;
public class Assignment_P3 {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Demonstrates replaceAll(), matches con
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    public static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String str1 = "A man a plan a canal Panama";
        String str2 = "listen";
        String str3 = "silent";
        boolean palindromeCheck = isPalindrome(str1);
        boolean anagramCheck = isAnagram(str2, str3);
        // Demonstrates matches()
        boolean isAlphanumeric = str2.matches("[a-zA-Z0-9]+");
        // Demonstrates contains()
        boolean containsPlan = str1.toLowerCase().contains("plan");
		  // Demonstrates String.format() and String.join()
        String part1 = String.format("Palindrome: %b", palindromeCheck);
        String part2 = String.format("Anagram: %b", anagramCheck);
        String formattedReport = "[" + String.join("  ", part1, part2) + "]";
        // Demonstrates intern() and hashCode()
        String s1 = new String("Java").intern();
        String s2 = "Java";
        boolean hashCodesEqual = (s1.hashCode() == s2.hashCode()) && (s1 == s2);
        System.out.println("Palindrome Check: \"" + str1 + "\" -> " + palindromeCheck);
        System.out.println("Anagram Check: \"" + str2 + "\" & \"" + str3 + "\" -> " + anagramCheck);
        System.out.println("Formatted Report: " + formattedReport);
        System.out.println("Contains 'plan': " + containsPlan);
        System.out.println("HashCodes equal for interned strings: " + hashCodesEqual);
    }
}