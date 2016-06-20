package net.android.emoji_library;

import android.content.Context;

import net.android.emoji_library.emoji.Emojicon;

/**
 * @author Daniele Ricci
 *
 * @since 0.0.1
 */
public interface EmojiRecents {
    public void addRecentEmoji(Context context, Emojicon emojicon);
}
