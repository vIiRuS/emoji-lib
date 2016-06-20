package net.android.emoji_library.emoji;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;


public class EmojiMapTest {

    @Test
    public void shouldHaveMappingForAllEmojiStrings() {
        Collection<String> emojiNames = EmojiMap.emojiMap.values();

        for (String emojiName : emojiNames) {
            assertTrue(emojiName+" not found in inverted map", EmojiMap.invertedEmojiMap.containsKey(emojiName));
        }
    }

    @Test
    public void shouldHaveMappingForAllEmojiCodes() {
        Collection<Integer> emojiCodes = EmojiMap.invertedEmojiMap.values();

        for (Integer emojiCode : emojiCodes) {
            assertTrue(emojiCode+" not found in inverted map", EmojiMap.emojiMap.containsKey(emojiCode));
        }
    }

    @Test
    public void shouldInvertEmojisFromString() {
        Collection<String> emojiNames = EmojiMap.emojiMap.values();
        for (String emojiName : emojiNames) {
            Integer emojiCode = EmojiMap.invertedEmojiMap.get(emojiName);
            assertTrue(emojiCode+" was not translated back correctly", emojiName.equals(EmojiMap.emojiMap.get(emojiCode)));
        }
    }

    @Test
    public void shouldInvertEmojisFromCode() {
        Collection<Integer> emojiCodes = EmojiMap.invertedEmojiMap.values();
        for (Integer emojiCode : emojiCodes) {
            String emojiName = EmojiMap.emojiMap.get(emojiCode);
            assertTrue(emojiName+" was not translated back correctly", emojiCode.equals(EmojiMap.invertedEmojiMap.get(emojiName)));
        }
    }

}