package example.oop.piglatin;

public class PigLatinTranslator {
    public boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }

    public boolean isVowel(char ch) {
        // Check if the character is a vowel (ignoring case)
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    public String translate(String sentence) {
        String[] words = sentence.split(" ");
        String finalSentence = "";

        for (String word : words) {
            String translated = translateWord(word);

            finalSentence = finalSentence + translated + " ";
        }
        return finalSentence.trim();
    }

    public String translateWord(String text) {
        String translated = "";

        char primulCaracter = text.charAt(0);

        if (text.length() == 2 && text.charAt(1) == 'y') {
            translated = text.substring(1) + text.charAt(0) + "ay";
        } else if (text.startsWith("xr") || text.startsWith("yt")) {
            translated = text + "ay";
        } else if (isVowel(primulCaracter)) {
            translated = text + "ay";
        } else if (text.length() > 2 && isConsonant(primulCaracter)) {
            char alDoileaCharacter = text.charAt(1);
            char alTreileaCharacter = text.charAt(2);

            if (text.startsWith("qu")) {
                translated = text.substring(2) + text.substring(0, 2) + "ay";
            } else if (text.length() > 2 && (text.startsWith("sch") || text.startsWith("qu", 1))) {
                translated = text.substring(3) + text.substring(0, 3) + "ay";
            } else if (alDoileaCharacter == 'h' || alDoileaCharacter == 'H') {
                if (isConsonant(alTreileaCharacter) && alTreileaCharacter != 'y') {
                    translated = text.substring(3)
                            + primulCaracter
                            + alDoileaCharacter
                            + alTreileaCharacter + "ay";
                } else {
                    translated = text.substring(2) + primulCaracter + alDoileaCharacter + "ay";
                }

            } else {
                translated = text.substring(1) + primulCaracter + "ay";
            }
        }

        return translated;
    }
}
