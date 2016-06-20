package net.pherth.android.emoji_library.emoji;

import android.content.Context;

import net.pherth.android.emoji_library.emoji.emoji.Emojicon;

/**
 * @author Daniele Ricci
 *
 * @since 0.0.1
 */
public interface EmojiRecents {
    public void addRecentEmoji(Context context, Emojicon emojicon);
}
