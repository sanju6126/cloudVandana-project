public static boolean isPangram(String s) {
    s = s.toLowerCase();
    boolean[] isPresent = new boolean[26];

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c >= 'a' && c <= 'z') {
            isPresent[c - 'a'] = true;
        }
    }

    for (boolean b : isPresent) {
        if (!b) {
            return false;
        }
    }

    return true;
}

public static void main(String[] args) {
    String sentence = "The quick brown fox jumps over the lazy dog";
    boolean isPangram = isPangram(sentence);
    System.out.println("Is it a pangram? " + isPangram);
}
