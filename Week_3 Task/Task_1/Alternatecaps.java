public class Alternatecaps {
    public static String capitalizeAlternate(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(str.charAt(i)));
            } 
            else {
                result.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeAlternate("anurag"));
    }
}
