public class Assignment_P1 {
    public static String processText(String input) {
        // Step 1: Remove leading/trailing whitespace
        String cleaned = input.trim(); // Demonstrates trim()
        String stripped = cleaned.strip(); // Demonstrates strip()
        // Step 2: If cleaned string is empty, return "EMPTY_STRING"
        if (stripped.isEmpty()) { // Demonstrates isEmpty()
            return "EMPTY_STRING";
        }
        // Step 3: Check case-insensitively if string equals "admin"
        if (stripped.equalsIgnoreCase("admin")) { // Demonstrates equalsIgnoreCase()
            return "RESERVED_WORD";
        }
        // Demonstrating equals()
        if (stripped.equals("ADMIN")) {
            // Checked exact equality
        }
        // Step 4: Replace all occurrences of "_" with a space " "
        String replaced = stripped.replace("_", " "); // Demonstrates replace()
        // Step 5: If resulting string starts with "temp" and ends with "user" (case-insensitive)
        String lowerCaseStr = replaced.toLowerCase(); // Demonstrates toLowerCase()
        if (lowerCaseStr.startsWith("temp") && lowerCaseStr.endsWith("user")) { // Demonstrates startsWith(), endsWi
            return replaced.concat("_FLAGGED"); // Demonstrates concat()
        }
        return replaced;
    }
    public static void main(String[] args) {
        String input1 = "  temp_John_user  ";
        String input2 = "  ADMIN  ";
        String input3 = "   ";
        System.out.println("Input: \"" + input1 + "\" -> Output: \"" + processText(input1) + "\"");
        System.out.println("Input: \"" + input2 + "\" -> Output: \"" + processText(input2) + "\"");
        System.out.println("Input: \"" + input3 + "\" -> Output: \"" + processText(input3) + "\"");
    }
}