public class main {
    public static void main(String[] args) {
        System.out.println(longestStreak("CCAAAAATTT!"));
        System.out.println(longestStreak("CCCCAAATTT!"));
        System.out.println(longestStreak("CCCAATTT!"));
        System.out.println(longestStreak("CCCCAATTTTTT!"));
        System.out.println(longestStreak("cbbaaabbmgg"));
        System.out.println(longestStreak("cbbaaabbggg"));
        System.out.println(longestStreak("ABCDEFGHIJ"));
        System.out.println(longestStreak("AAAAAAAAAA"));

    }

    public static String longestStreak(String str) {
        int longest = 1;
        int currentCharacterStreak = 1;
        char longestChar = str.charAt(0);
        for (int i = 0 ; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            currentCharacterStreak = 1;
            for (int j = i+1 ; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    currentCharacterStreak++;
                    if (currentCharacterStreak > longest) {
                        longest = currentCharacterStreak;
                        longestChar = currentChar;
                    }
                } else {
                    break;
                }

            }
        }

        return longestChar + " " + longest;

    }
}
