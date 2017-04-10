package net.pherth.android.emoji_library;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author data5tream
 *
 * @since 0.0.1
 */
public class EmojiParser {

    /**
     * Converts Cheat Sheet emoji-codes into unicode characters
     *
     * @param text String containing Cheat Sheet codes
     * @return Formatted String containing unicode characters
     */
    @Nullable
    public static String parseEmojis(String text){
        if (text == null) {
            return text;
        }
        String returnString = text;

        Pattern pattern = Pattern.compile("(:[^:]+:)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String found = matcher.group();
            if(EmojiMap.invertedEmojiMap.get(found)==null)continue;
            int hexInt = EmojiMap.invertedEmojiMap.get(found);
            String replacement = new String(Character.toChars(hexInt));
            returnString = returnString.replace(found, replacement);
        }

        return returnString;
    }

    /**
     * Converts unicode characters into Cheat Sheet codes
     *
     * @param text String containing unicode formatted emojis
     * @return String containing the Cheat Sheet codes of the emojis
     */
    @Nullable
    public static String convertToCheatCode(String text){
        if (text == null) {
            return text;
        }
        String returnString = text;

        char[] charArray = text.toCharArray();
        for (int i = 0; i <= charArray.length - 2; i++) {
            String testString = new String(Arrays.copyOfRange(charArray, i, i+2));
            int test = testString.codePointAt(0);
            if (EmojiMap.emojiMap.containsKey(test)) {
                returnString = returnString.replace(testString, EmojiMap.emojiMap.get(test));
            }
        }

        return returnString;
    }
}
