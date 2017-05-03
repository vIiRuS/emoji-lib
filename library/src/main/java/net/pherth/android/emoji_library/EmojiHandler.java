package net.pherth.android.emoji_library;

import com.github.viirus.emojilib.R;

import android.content.Context;
import android.text.Spannable;
import android.util.SparseIntArray;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hieu Rocker
 * @author data5tream
 * 
 * @since 0.0.1
 */
public final class EmojiHandler {
    private EmojiHandler() {
    }

    private static Map<String, Integer> sEmojisModifiedMap = new HashMap<>();

    private static boolean isSoftBankEmoji(char c) {
        return ((c >> 12) == 0xe);
    }

    private static int getEmojiResource(Context context, int codePoint) {
        switch(codePoint) {

            // People
            case 0x1f604: return R.drawable.emoji_1f604;
            case 0x1f603: return R.drawable.emoji_1f603;
            case 0x1f600: return R.drawable.emoji_1f600;
            case 0x1f60a: return R.drawable.emoji_1f60a;
            case 0x263a: return R.drawable.emoji_263a;
            case 0x1f609: return R.drawable.emoji_1f609;
            case 0x1f60d: return R.drawable.emoji_1f60d;
            case 0x1f618: return R.drawable.emoji_1f618;
            case 0x1f61a: return R.drawable.emoji_1f61a;
            case 0x1f617: return R.drawable.emoji_1f617;
            case 0x1f619: return R.drawable.emoji_1f619;
            case 0x1f61c: return R.drawable.emoji_1f61c;
            case 0x1f61d: return R.drawable.emoji_1f61d;
            case 0x1f61b: return R.drawable.emoji_1f61b;
            case 0x1f633: return R.drawable.emoji_1f633;
            case 0x1f601: return R.drawable.emoji_1f601;
            case 0x1f614: return R.drawable.emoji_1f614;
            case 0x1f60c: return R.drawable.emoji_1f60c;
            case 0x1f612: return R.drawable.emoji_1f612;
            case 0x1f61e: return R.drawable.emoji_1f61e;
            case 0x1f623: return R.drawable.emoji_1f623;
            case 0x1f622: return R.drawable.emoji_1f622;
            case 0x1f602: return R.drawable.emoji_1f602;
            case 0x1f62d: return R.drawable.emoji_1f62d;
            case 0x1f62a: return R.drawable.emoji_1f62a;
            case 0x1f625: return R.drawable.emoji_1f625;
            case 0x1f630: return R.drawable.emoji_1f630;
            case 0x1f605: return R.drawable.emoji_1f605;
            case 0x1f613: return R.drawable.emoji_1f613;
            case 0x1f629: return R.drawable.emoji_1f629;
            case 0x1f62b: return R.drawable.emoji_1f62b;
            case 0x1f628: return R.drawable.emoji_1f628;
            case 0x1f631: return R.drawable.emoji_1f631;
            case 0x1f620: return R.drawable.emoji_1f620;
            case 0x1f621: return R.drawable.emoji_1f621;
            case 0x1f624: return R.drawable.emoji_1f624;
            case 0x1f616: return R.drawable.emoji_1f616;
            case 0x1f606: return R.drawable.emoji_1f606;
            case 0x1f60b: return R.drawable.emoji_1f60b;
            case 0x1f637: return R.drawable.emoji_1f637;
            case 0x1f60e: return R.drawable.emoji_1f60e;
            case 0x1f634: return R.drawable.emoji_1f634;
            case 0x1f635: return R.drawable.emoji_1f635;
            case 0x1f632: return R.drawable.emoji_1f632;
            case 0x1f61f: return R.drawable.emoji_1f61f;
            case 0x1f626: return R.drawable.emoji_1f626;
            case 0x1f627: return R.drawable.emoji_1f627;
            case 0x1f608: return R.drawable.emoji_1f608;
            case 0x1f47f: return R.drawable.emoji_1f47f;
            case 0x1f62e: return R.drawable.emoji_1f62e;
            case 0x1f62c: return R.drawable.emoji_1f62c;
            case 0x1f610: return R.drawable.emoji_1f610;
            case 0x1f615: return R.drawable.emoji_1f615;
            case 0x1f62f: return R.drawable.emoji_1f62f;
            case 0x1f636: return R.drawable.emoji_1f636;
            case 0x1f607: return R.drawable.emoji_1f607;
            case 0x1f60f: return R.drawable.emoji_1f60f;
            case 0x1f611: return R.drawable.emoji_1f611;
            case 0x1f472: return R.drawable.emoji_1f472;
            case 0x1f473: return R.drawable.emoji_1f473;
            case 0x1f46e: return R.drawable.emoji_1f46e;
            case 0x1f477: return R.drawable.emoji_1f477;
            case 0x1f482: return R.drawable.emoji_1f482;
            case 0x1f476: return R.drawable.emoji_1f476;
            case 0x1f466: return R.drawable.emoji_1f466;
            case 0x1f467: return R.drawable.emoji_1f467;
            case 0x1f468: return R.drawable.emoji_1f468;
            case 0x1f469: return R.drawable.emoji_1f469;
            case 0x1f474: return R.drawable.emoji_1f474;
            case 0x1f475: return R.drawable.emoji_1f475;
            case 0x1f471: return R.drawable.emoji_1f471;
            case 0x1f47c: return R.drawable.emoji_1f47c;
            case 0x1f478: return R.drawable.emoji_1f478;
            case 0x1f63a: return R.drawable.emoji_1f63a;
            case 0x1f638: return R.drawable.emoji_1f638;
            case 0x1f63b: return R.drawable.emoji_1f63b;
            case 0x1f63d: return R.drawable.emoji_1f63d;
            case 0x1f63c: return R.drawable.emoji_1f63c;
            case 0x1f640: return R.drawable.emoji_1f640;
            case 0x1f63f: return R.drawable.emoji_1f63f;
            case 0x1f639: return R.drawable.emoji_1f639;
            case 0x1f63e: return R.drawable.emoji_1f63e;
            case 0x1f479: return R.drawable.emoji_1f479;
            case 0x1f47a: return R.drawable.emoji_1f47a;
            case 0x1f648: return R.drawable.emoji_1f648;
            case 0x1f649: return R.drawable.emoji_1f649;
            case 0x1f64a: return R.drawable.emoji_1f64a;
            case 0x1f480: return R.drawable.emoji_1f480;
            case 0x1f47d: return R.drawable.emoji_1f47d;
            case 0x1f4a9: return R.drawable.emoji_1f4a9;
            case 0x1f525: return R.drawable.emoji_1f525;
            case 0x2728: return R.drawable.emoji_2728;
            case 0x1f31f: return R.drawable.emoji_1f31f;
            case 0x1f4ab: return R.drawable.emoji_1f4ab;
            case 0x1f4a5: return R.drawable.emoji_1f4a5;
            case 0x1f4a2: return R.drawable.emoji_1f4a2;
            case 0x1f4a6: return R.drawable.emoji_1f4a6;
            case 0x1f4a7: return R.drawable.emoji_1f4a7;
            case 0x1f4a4: return R.drawable.emoji_1f4a4;
            case 0x1f4a8: return R.drawable.emoji_1f4a8;
            case 0x1f442: return R.drawable.emoji_1f442;
            case 0x1f440: return R.drawable.emoji_1f440;
            case 0x1f443: return R.drawable.emoji_1f443;
            case 0x1f445: return R.drawable.emoji_1f445;
            case 0x1f444: return R.drawable.emoji_1f444;
            case 0x1f44d: return R.drawable.emoji_1f44d;
            case 0x1f44e: return R.drawable.emoji_1f44e;
            case 0x1f44c: return R.drawable.emoji_1f44c;
            case 0x1f44a: return R.drawable.emoji_1f44a;
            case 0x270a: return R.drawable.emoji_270a;
            case 0x270c: return R.drawable.emoji_270c;
            case 0x1f44b: return R.drawable.emoji_1f44b;
            case 0x270b: return R.drawable.emoji_270b;
            case 0x1f450: return R.drawable.emoji_1f450;
            case 0x1f446: return R.drawable.emoji_1f446;
            case 0x1f447: return R.drawable.emoji_1f447;
            case 0x1f449: return R.drawable.emoji_1f449;
            case 0x1f448: return R.drawable.emoji_1f448;
            case 0x1f64c: return R.drawable.emoji_1f64c;
            case 0x1f64f: return R.drawable.emoji_1f64f;
            case 0x261d: return R.drawable.emoji_261d;
            case 0x1f44f: return R.drawable.emoji_1f44f;
            case 0x1f4aa: return R.drawable.emoji_1f4aa;
            case 0x1f6b6: return R.drawable.emoji_1f6b6;
            case 0x1f3c3: return R.drawable.emoji_1f3c3;
            case 0x1f483: return R.drawable.emoji_1f483;
            case 0x1f46b: return R.drawable.emoji_1f46b;
            case 0x1f46a: return R.drawable.emoji_1f46a;
            case 0x1f46c: return R.drawable.emoji_1f46c;
            case 0x1f46d: return R.drawable.emoji_1f46d;
            case 0x1f48f: return R.drawable.emoji_1f48f;
            case 0x1f491: return R.drawable.emoji_1f491;
            case 0x1f46f: return R.drawable.emoji_1f46f;
            case 0x1f646: return R.drawable.emoji_1f646;
            case 0x1f645: return R.drawable.emoji_1f645;
            case 0x1f481: return R.drawable.emoji_1f481;
            case 0x1f64b: return R.drawable.emoji_1f64b;
            case 0x1f486: return R.drawable.emoji_1f486;
            case 0x1f487: return R.drawable.emoji_1f487;
            case 0x1f485: return R.drawable.emoji_1f485;
            case 0x1f470: return R.drawable.emoji_1f470;
            case 0x1f64e: return R.drawable.emoji_1f64e;
            case 0x1f64d: return R.drawable.emoji_1f64d;
            case 0x1f647: return R.drawable.emoji_1f647;
            case 0x1f3a9: return R.drawable.emoji_1f3a9;
            case 0x1f451: return R.drawable.emoji_1f451;
            case 0x1f452: return R.drawable.emoji_1f452;
            case 0x1f45f: return R.drawable.emoji_1f45f;
            case 0x1f45e: return R.drawable.emoji_1f45e;
            case 0x1f461: return R.drawable.emoji_1f461;
            case 0x1f460: return R.drawable.emoji_1f460;
            case 0x1f462: return R.drawable.emoji_1f462;
            case 0x1f455: return R.drawable.emoji_1f455;
            case 0x1f454: return R.drawable.emoji_1f454;
            case 0x1f45a: return R.drawable.emoji_1f45a;
            case 0x1f457: return R.drawable.emoji_1f457;
            case 0x1f3bd: return R.drawable.emoji_1f3bd;
            case 0x1f456: return R.drawable.emoji_1f456;
            case 0x1f458: return R.drawable.emoji_1f458;
            case 0x1f459: return R.drawable.emoji_1f459;
            case 0x1f4bc: return R.drawable.emoji_1f4bc;
            case 0x1f45c: return R.drawable.emoji_1f45c;
            case 0x1f45d: return R.drawable.emoji_1f45d;
            case 0x1f45b: return R.drawable.emoji_1f45b;
            case 0x1f453: return R.drawable.emoji_1f453;
            case 0x1f380: return R.drawable.emoji_1f380;
            case 0x1f302: return R.drawable.emoji_1f302;
            case 0x1f484: return R.drawable.emoji_1f484;
            case 0x1f49b: return R.drawable.emoji_1f49b;
            case 0x1f499: return R.drawable.emoji_1f499;
            case 0x1f49c: return R.drawable.emoji_1f49c;
            case 0x1f49a: return R.drawable.emoji_1f49a;
            case 0x2764: return R.drawable.emoji_2764;
            case 0x1f494: return R.drawable.emoji_1f494;
            case 0x1f497: return R.drawable.emoji_1f497;
            case 0x1f493: return R.drawable.emoji_1f493;
            case 0x1f495: return R.drawable.emoji_1f495;
            case 0x1f496: return R.drawable.emoji_1f496;
            case 0x1f49e: return R.drawable.emoji_1f49e;
            case 0x1f498: return R.drawable.emoji_1f498;
            case 0x1f48c: return R.drawable.emoji_1f48c;
            case 0x1f48b: return R.drawable.emoji_1f48b;
            case 0x1f48d: return R.drawable.emoji_1f48d;
            case 0x1f48e: return R.drawable.emoji_1f48e;
            case 0x1f464: return R.drawable.emoji_1f464;
            case 0x1f465: return R.drawable.emoji_1f465;
            case 0x1f4ac: return R.drawable.emoji_1f4ac;
            case 0x1f463: return R.drawable.emoji_1f463;
            case 0x1f4ad: return R.drawable.emoji_1f4ad;

            // Nature
            case 0x1f436: return R.drawable.emoji_1f436;
            case 0x1f43a: return R.drawable.emoji_1f43a;
            case 0x1f431: return R.drawable.emoji_1f431;
            case 0x1f42d: return R.drawable.emoji_1f42d;
            case 0x1f439: return R.drawable.emoji_1f439;
            case 0x1f430: return R.drawable.emoji_1f430;
            case 0x1f438: return R.drawable.emoji_1f438;
            case 0x1f42f: return R.drawable.emoji_1f42f;
            case 0x1f428: return R.drawable.emoji_1f428;
            case 0x1f43b: return R.drawable.emoji_1f43b;
            case 0x1f437: return R.drawable.emoji_1f437;
            case 0x1f43d: return R.drawable.emoji_1f43d;
            case 0x1f42e: return R.drawable.emoji_1f42e;
            case 0x1f417: return R.drawable.emoji_1f417;
            case 0x1f435: return R.drawable.emoji_1f435;
            case 0x1f412: return R.drawable.emoji_1f412;
            case 0x1f434: return R.drawable.emoji_1f434;
            case 0x1f411: return R.drawable.emoji_1f411;
            case 0x1f418: return R.drawable.emoji_1f418;
            case 0x1f43c: return R.drawable.emoji_1f43c;
            case 0x1f427: return R.drawable.emoji_1f427;
            case 0x1f426: return R.drawable.emoji_1f426;
            case 0x1f424: return R.drawable.emoji_1f424;
            case 0x1f425: return R.drawable.emoji_1f425;
            case 0x1f423: return R.drawable.emoji_1f423;
            case 0x1f414: return R.drawable.emoji_1f414;
            case 0x1f40d: return R.drawable.emoji_1f40d;
            case 0x1f422: return R.drawable.emoji_1f422;
            case 0x1f41b: return R.drawable.emoji_1f41b;
            case 0x1f41d: return R.drawable.emoji_1f41d;
            case 0x1f41c: return R.drawable.emoji_1f41c;
            case 0x1f41e: return R.drawable.emoji_1f41e;
            case 0x1f40c: return R.drawable.emoji_1f40c;
            case 0x1f419: return R.drawable.emoji_1f419;
            case 0x1f41a: return R.drawable.emoji_1f41a;
            case 0x1f420: return R.drawable.emoji_1f420;
            case 0x1f41f: return R.drawable.emoji_1f41f;
            case 0x1f42c: return R.drawable.emoji_1f42c;
            case 0x1f433: return R.drawable.emoji_1f433;
            case 0x1f40b: return R.drawable.emoji_1f40b;
            case 0x1f404: return R.drawable.emoji_1f404;
            case 0x1f40f: return R.drawable.emoji_1f40f;
            case 0x1f400: return R.drawable.emoji_1f400;
            case 0x1f403: return R.drawable.emoji_1f403;
            case 0x1f405: return R.drawable.emoji_1f405;
            case 0x1f407: return R.drawable.emoji_1f407;
            case 0x1f409: return R.drawable.emoji_1f409;
            case 0x1f40e: return R.drawable.emoji_1f40e;
            case 0x1f410: return R.drawable.emoji_1f410;
            case 0x1f413: return R.drawable.emoji_1f413;
            case 0x1f415: return R.drawable.emoji_1f415;
            case 0x1f416: return R.drawable.emoji_1f416;
            case 0x1f401: return R.drawable.emoji_1f401;
            case 0x1f402: return R.drawable.emoji_1f402;
            case 0x1f432: return R.drawable.emoji_1f432;
            case 0x1f421: return R.drawable.emoji_1f421;
            case 0x1f40a: return R.drawable.emoji_1f40a;
            case 0x1f42b: return R.drawable.emoji_1f42b;
            case 0x1f42a: return R.drawable.emoji_1f42a;
            case 0x1f406: return R.drawable.emoji_1f406;
            case 0x1f408: return R.drawable.emoji_1f408;
            case 0x1f429: return R.drawable.emoji_1f429;
            case 0x1f43e: return R.drawable.emoji_1f43e;
            case 0x1f490: return R.drawable.emoji_1f490;
            case 0x1f338: return R.drawable.emoji_1f338;
            case 0x1f337: return R.drawable.emoji_1f337;
            case 0x1f340: return R.drawable.emoji_1f340;
            case 0x1f339: return R.drawable.emoji_1f339;
            case 0x1f33b: return R.drawable.emoji_1f33b;
            case 0x1f33a: return R.drawable.emoji_1f33a;
            case 0x1f341: return R.drawable.emoji_1f341;
            case 0x1f343: return R.drawable.emoji_1f343;
            case 0x1f342: return R.drawable.emoji_1f342;
            case 0x1f33f: return R.drawable.emoji_1f33f;
            case 0x1f33e: return R.drawable.emoji_1f33e;
            case 0x1f344: return R.drawable.emoji_1f344;
            case 0x1f335: return R.drawable.emoji_1f335;
            case 0x1f334: return R.drawable.emoji_1f334;
            case 0x1f332: return R.drawable.emoji_1f332;
            case 0x1f333: return R.drawable.emoji_1f333;
            case 0x1f330: return R.drawable.emoji_1f330;
            case 0x1f331: return R.drawable.emoji_1f331;
            case 0x1f33c: return R.drawable.emoji_1f33c;
            case 0x1f310: return R.drawable.emoji_1f310;
            case 0x1f31e: return R.drawable.emoji_1f31e;
            case 0x1f31d: return R.drawable.emoji_1f31d;
            case 0x1f31a: return R.drawable.emoji_1f31a;
            case 0x1f311: return R.drawable.emoji_1f311;
            case 0x1f312: return R.drawable.emoji_1f312;
            case 0x1f313: return R.drawable.emoji_1f313;
            case 0x1f314: return R.drawable.emoji_1f314;
            case 0x1f315: return R.drawable.emoji_1f315;
            case 0x1f316: return R.drawable.emoji_1f316;
            case 0x1f317: return R.drawable.emoji_1f317;
            case 0x1f318: return R.drawable.emoji_1f318;
            case 0x1f31c: return R.drawable.emoji_1f31c;
            case 0x1f31b: return R.drawable.emoji_1f31b;
            case 0x1f319: return R.drawable.emoji_1f319;
            case 0x1f30d: return R.drawable.emoji_1f30d;
            case 0x1f30e: return R.drawable.emoji_1f30e;
            case 0x1f30f: return R.drawable.emoji_1f30f;
            case 0x1f30b: return R.drawable.emoji_1f30b;
            case 0x1f30c: return R.drawable.emoji_1f30c;
            case 0x1f320: return R.drawable.emoji_1f303; // TODO (github) review this emoji
            case 0x2b50: return R.drawable.emoji_2b50;
            case 0x2600: return R.drawable.emoji_2600;
            case 0x26c5: return R.drawable.emoji_26c5;
            case 0x2601: return R.drawable.emoji_2601;
            case 0x26a1: return R.drawable.emoji_26a1;
            case 0x2614: return R.drawable.emoji_2614;
            case 0x2744: return R.drawable.emoji_2744;
            case 0x26c4: return R.drawable.emoji_26c4;
            case 0x1f300: return R.drawable.emoji_1f300;
            case 0x1f301: return R.drawable.emoji_1f301;
            case 0x1f308: return R.drawable.emoji_1f308;
            case 0x1f30a: return R.drawable.emoji_1f30a;

            // Objects
            case 0x1f38d: return R.drawable.emoji_1f38d;
            case 0x1f49d: return R.drawable.emoji_1f49d;
            case 0x1f38e: return R.drawable.emoji_1f38e;
            case 0x1f392: return R.drawable.emoji_1f392;
            case 0x1f393: return R.drawable.emoji_1f393;
            case 0x1f38f: return R.drawable.emoji_1f38f;
            case 0x1f386: return R.drawable.emoji_1f386;
            case 0x1f387: return R.drawable.emoji_1f387;
            case 0x1f390: return R.drawable.emoji_1f390;
            case 0x1f391: return R.drawable.emoji_1f391;
            case 0x1f383: return R.drawable.emoji_1f383;
            case 0x1f47b: return R.drawable.emoji_1f47b;
            case 0x1f385: return R.drawable.emoji_1f385;
            case 0x1f384: return R.drawable.emoji_1f384;
            case 0x1f381: return R.drawable.emoji_1f381;
            case 0x1f38b: return R.drawable.emoji_1f38b;
            case 0x1f389: return R.drawable.emoji_1f389;
            case 0x1f38a: return R.drawable.emoji_1f38a;
            case 0x1f388: return R.drawable.emoji_1f388;
            case 0x1f38c: return R.drawable.emoji_1f38c;
            case 0x1f52e: return R.drawable.emoji_1f52e;
            case 0x1f3a5: return R.drawable.emoji_1f3a5;
            case 0x1f4f7: return R.drawable.emoji_1f4f7;
            case 0x1f4f9: return R.drawable.emoji_1f4f9;
            case 0x1f4fc: return R.drawable.emoji_1f4fc;
            case 0x1f4bf: return R.drawable.emoji_1f4bf;
            case 0x1f4c0: return R.drawable.emoji_1f4c0;
            case 0x1f4bd: return R.drawable.emoji_1f4bd;
            case 0x1f4be: return R.drawable.emoji_1f4be;
            case 0x1f4bb: return R.drawable.emoji_1f4bb;
            case 0x1f4f1: return R.drawable.emoji_1f4f1;
            case 0x260e: return R.drawable.emoji_260e;
            case 0x1f4de: return R.drawable.emoji_1f4de;
            case 0x1f4df: return R.drawable.emoji_1f4df;
            case 0x1f4e0: return R.drawable.emoji_1f4e0;
            case 0x1f4e1: return R.drawable.emoji_1f4e1;
            case 0x1f4fa: return R.drawable.emoji_1f4fa;
            case 0x1f4fb: return R.drawable.emoji_1f4fb;
            case 0x1f50a: return R.drawable.emoji_1f50a;
            case 0x1f509: return R.drawable.emoji_1f509;
            case 0x1f508: return R.drawable.emoji_1f508; // TODO (github): review this emoji
            case 0x1f507: return R.drawable.emoji_1f507;
            case 0x1f514: return R.drawable.emoji_1f514;
            case 0x1f515: return R.drawable.emoji_1f515;
            case 0x1f4e2: return R.drawable.emoji_1f4e2;
            case 0x1f4e3: return R.drawable.emoji_1f4e3;
            case 0x23f3: return R.drawable.emoji_23f3;
            case 0x231b: return R.drawable.emoji_231b;
            case 0x23f0: return R.drawable.emoji_23f0;
            case 0x231a: return R.drawable.emoji_231a;
            case 0x1f513: return R.drawable.emoji_1f513;
            case 0x1f512: return R.drawable.emoji_1f512;
            case 0x1f50f: return R.drawable.emoji_1f50f;
            case 0x1f510: return R.drawable.emoji_1f510;
            case 0x1f511: return R.drawable.emoji_1f511;
            case 0x1f50e: return R.drawable.emoji_1f50e;
            case 0x1f4a1: return R.drawable.emoji_1f4a1;
            case 0x1f526: return R.drawable.emoji_1f526;
            case 0x1f506: return R.drawable.emoji_1f506;
            case 0x1f505: return R.drawable.emoji_1f505;
            case 0x1f50c: return R.drawable.emoji_1f50c;
            case 0x1f50b: return R.drawable.emoji_1f50b;
            case 0x1f50d: return R.drawable.emoji_1f50d;
            case 0x1f6c1: return R.drawable.emoji_1f6c1;
            case 0x1f6c0: return R.drawable.emoji_1f6c0;
            case 0x1f6bf: return R.drawable.emoji_1f6bf;
            case 0x1f6bd: return R.drawable.emoji_1f6bd;
            case 0x1f527: return R.drawable.emoji_1f527;
            case 0x1f529: return R.drawable.emoji_1f529;
            case 0x1f528: return R.drawable.emoji_1f528;
            case 0x1f6aa: return R.drawable.emoji_1f6aa;
            case 0x1f6ac: return R.drawable.emoji_1f6ac;
            case 0x1f4a3: return R.drawable.emoji_1f4a3;
            case 0x1f52b: return R.drawable.emoji_1f52b;
            case 0x1f52a: return R.drawable.emoji_1f52a;
            case 0x1f48a: return R.drawable.emoji_1f48a;
            case 0x1f489: return R.drawable.emoji_1f489;
            case 0x1f4b0: return R.drawable.emoji_1f4b0;
            case 0x1f4b4: return R.drawable.emoji_1f4b4;
            case 0x1f4b5: return R.drawable.emoji_1f4b5;
            case 0x1f4b7: return R.drawable.emoji_1f4b7;
            case 0x1f4b6: return R.drawable.emoji_1f4b6;
            case 0x1f4b3: return R.drawable.emoji_1f4b3;
            case 0x1f4b8: return R.drawable.emoji_1f4b8;
            case 0x1f4f2: return R.drawable.emoji_1f4f2;
            case 0x1f4e7: return R.drawable.emoji_1f4e7;
            case 0x1f4e5: return R.drawable.emoji_1f4e5;
            case 0x1f4e4: return R.drawable.emoji_1f4e4;
            case 0x2709: return R.drawable.emoji_2709;
            case 0x1f4e9: return R.drawable.emoji_1f4e9;
            case 0x1f4e8: return R.drawable.emoji_1f4e8;
            case 0x1f4ef: return R.drawable.emoji_1f4ef;
            case 0x1f4eb: return R.drawable.emoji_1f4eb;
            case 0x1f4ea: return R.drawable.emoji_1f4ea;
            case 0x1f4ec: return R.drawable.emoji_1f4ec;
            case 0x1f4ed: return R.drawable.emoji_1f4ed;
            case 0x1f4ee: return R.drawable.emoji_1f4ee;
            case 0x1f4e6: return R.drawable.emoji_1f4e6;
            case 0x1f4dd: return R.drawable.emoji_1f4dd;
            case 0x1f4c4: return R.drawable.emoji_1f4c4;
            case 0x1f4c3: return R.drawable.emoji_1f4c3;
            case 0x1f4d1: return R.drawable.emoji_1f4d1;
            case 0x1f4ca: return R.drawable.emoji_1f4ca;
            case 0x1f4c8: return R.drawable.emoji_1f4c8;
            case 0x1f4c9: return R.drawable.emoji_1f4c9;
            case 0x1f4dc: return R.drawable.emoji_1f4dc;
            case 0x1f4cb: return R.drawable.emoji_1f4cb;
            case 0x1f4c5: return R.drawable.emoji_1f4c5;
            case 0x1f4c6: return R.drawable.emoji_1f4c6;
            case 0x1f4c7: return R.drawable.emoji_1f4c7;
            case 0x1f4c1: return R.drawable.emoji_1f4c1;
            case 0x1f4c2: return R.drawable.emoji_1f4c2;
            case 0x2702: return R.drawable.emoji_2702;
            case 0x1f4cc: return R.drawable.emoji_1f4cc;
            case 0x1f4ce: return R.drawable.emoji_1f4ce;
            case 0x2712: return R.drawable.emoji_2712;
            case 0x270f: return R.drawable.emoji_270f;
            case 0x1f4cf: return R.drawable.emoji_1f4cf;
            case 0x1f4d0: return R.drawable.emoji_1f4d0;
            case 0x1f4d5: return R.drawable.emoji_1f4d5;
            case 0x1f4d7: return R.drawable.emoji_1f4d7;
            case 0x1f4d8: return R.drawable.emoji_1f4d8;
            case 0x1f4d9: return R.drawable.emoji_1f4d9;
            case 0x1f4d3: return R.drawable.emoji_1f4d3;
            case 0x1f4d4: return R.drawable.emoji_1f4d4;
            case 0x1f4d2: return R.drawable.emoji_1f4d2;
            case 0x1f4da: return R.drawable.emoji_1f4da;
            case 0x1f4d6: return R.drawable.emoji_1f4d6;
            case 0x1f516: return R.drawable.emoji_1f516;
            case 0x1f4db: return R.drawable.emoji_1f4db;
            case 0x1f52c: return R.drawable.emoji_1f52c;
            case 0x1f52d: return R.drawable.emoji_1f52d;
            case 0x1f4f0: return R.drawable.emoji_1f4f0;
            case 0x1f3a8: return R.drawable.emoji_1f3a8;
            case 0x1f3ac: return R.drawable.emoji_1f3ac;
            case 0x1f3a4: return R.drawable.emoji_1f3a4;
            case 0x1f3a7: return R.drawable.emoji_1f3a7;
            case 0x1f3bc: return R.drawable.emoji_1f3bc;
            case 0x1f3b5: return R.drawable.emoji_1f3b5;
            case 0x1f3b6: return R.drawable.emoji_1f3b6;
            case 0x1f3b9: return R.drawable.emoji_1f3b9;
            case 0x1f3bb: return R.drawable.emoji_1f3bb;
            case 0x1f3ba: return R.drawable.emoji_1f3ba;
            case 0x1f3b7: return R.drawable.emoji_1f3b7;
            case 0x1f3b8: return R.drawable.emoji_1f3b8;
            case 0x1f47e: return R.drawable.emoji_1f47e;
            case 0x1f3ae: return R.drawable.emoji_1f3ae;
            case 0x1f0cf: return R.drawable.emoji_1f0cf;
            case 0x1f3b4: return R.drawable.emoji_1f3b4;
            case 0x1f004: return R.drawable.emoji_1f004;
            case 0x1f3b2: return R.drawable.emoji_1f3b2;
            case 0x1f3af: return R.drawable.emoji_1f3af;
            case 0x1f3c8: return R.drawable.emoji_1f3c8;
            case 0x1f3c0: return R.drawable.emoji_1f3c0;
            case 0x26bd: return R.drawable.emoji_26bd;
            case 0x26be: return R.drawable.emoji_26be;
            case 0x1f3be: return R.drawable.emoji_1f3be;
            case 0x1f3b1: return R.drawable.emoji_1f3b1;
            case 0x1f3c9: return R.drawable.emoji_1f3c9;
            case 0x1f3b3: return R.drawable.emoji_1f3b3;
            case 0x26f3: return R.drawable.emoji_26f3;
            case 0x1f6b5: return R.drawable.emoji_1f6b5;
            case 0x1f6b4: return R.drawable.emoji_1f6b4;
            case 0x1f3c1: return R.drawable.emoji_1f3c1;
            case 0x1f3c7: return R.drawable.emoji_1f3c7;
            case 0x1f3c6: return R.drawable.emoji_1f3c6;
            case 0x1f3bf: return R.drawable.emoji_1f3bf;
            case 0x1f3c2: return R.drawable.emoji_1f3c2;
            case 0x1f3ca: return R.drawable.emoji_1f3ca;
            case 0x1f3c4: return R.drawable.emoji_1f3c4;
            case 0x1f3a3: return R.drawable.emoji_1f3a3;
            case 0x2615: return R.drawable.emoji_2615;
            case 0x1f375: return R.drawable.emoji_1f375;
            case 0x1f376: return R.drawable.emoji_1f376;
            case 0x1f37c: return R.drawable.emoji_1f37c;
            case 0x1f37a: return R.drawable.emoji_1f37a;
            case 0x1f37b: return R.drawable.emoji_1f37b;
            case 0x1f378: return R.drawable.emoji_1f378;
            case 0x1f379: return R.drawable.emoji_1f379;
            case 0x1f377: return R.drawable.emoji_1f377;
            case 0x1f374: return R.drawable.emoji_1f374;
            case 0x1f355: return R.drawable.emoji_1f355;
            case 0x1f354: return R.drawable.emoji_1f354;
            case 0x1f35f: return R.drawable.emoji_1f35f;
            case 0x1f357: return R.drawable.emoji_1f357;
            case 0x1f356: return R.drawable.emoji_1f356;
            case 0x1f35d: return R.drawable.emoji_1f35d;
            case 0x1f35b: return R.drawable.emoji_1f35b;
            case 0x1f364: return R.drawable.emoji_1f364;
            case 0x1f371: return R.drawable.emoji_1f371;
            case 0x1f363: return R.drawable.emoji_1f363;
            case 0x1f365: return R.drawable.emoji_1f365;
            case 0x1f359: return R.drawable.emoji_1f359;
            case 0x1f358: return R.drawable.emoji_1f358;
            case 0x1f35a: return R.drawable.emoji_1f35a;
            case 0x1f35c: return R.drawable.emoji_1f35c;
            case 0x1f372: return R.drawable.emoji_1f372;
            case 0x1f362: return R.drawable.emoji_1f362;
            case 0x1f361: return R.drawable.emoji_1f361;
            case 0x1f373: return R.drawable.emoji_1f373;
            case 0x1f35e: return R.drawable.emoji_1f35e;
            case 0x1f369: return R.drawable.emoji_1f369;
            case 0x1f36e: return R.drawable.emoji_1f36e;
            case 0x1f366: return R.drawable.emoji_1f366;
            case 0x1f368: return R.drawable.emoji_1f368;
            case 0x1f367: return R.drawable.emoji_1f367;
            case 0x1f382: return R.drawable.emoji_1f382;
            case 0x1f370: return R.drawable.emoji_1f370;
            case 0x1f36a: return R.drawable.emoji_1f36a;
            case 0x1f36b: return R.drawable.emoji_1f36b;
            case 0x1f36c: return R.drawable.emoji_1f36c;
            case 0x1f36d: return R.drawable.emoji_1f36d;
            case 0x1f36f: return R.drawable.emoji_1f36f;
            case 0x1f34e: return R.drawable.emoji_1f34e;
            case 0x1f34f: return R.drawable.emoji_1f34f;
            case 0x1f34a: return R.drawable.emoji_1f34a;
            case 0x1f34b: return R.drawable.emoji_1f34b;
            case 0x1f352: return R.drawable.emoji_1f352;
            case 0x1f347: return R.drawable.emoji_1f347;
            case 0x1f349: return R.drawable.emoji_1f349;
            case 0x1f353: return R.drawable.emoji_1f353;
            case 0x1f351: return R.drawable.emoji_1f351;
            case 0x1f348: return R.drawable.emoji_1f348;
            case 0x1f34c: return R.drawable.emoji_1f34c;
            case 0x1f350: return R.drawable.emoji_1f350;
            case 0x1f34d: return R.drawable.emoji_1f34d;
            case 0x1f360: return R.drawable.emoji_1f360;
            case 0x1f346: return R.drawable.emoji_1f346;
            case 0x1f345: return R.drawable.emoji_1f345;
            case 0x1f33d: return R.drawable.emoji_1f33d;

            // Places
            case 0x1f3e0: return R.drawable.emoji_1f3e0;
            case 0x1f3e1: return R.drawable.emoji_1f3e1;
            case 0x1f3eb: return R.drawable.emoji_1f3eb;
            case 0x1f3e2: return R.drawable.emoji_1f3e2;
            case 0x1f3e3: return R.drawable.emoji_1f3e3;
            case 0x1f3e5: return R.drawable.emoji_1f3e5;
            case 0x1f3e6: return R.drawable.emoji_1f3e6;
            case 0x1f3ea: return R.drawable.emoji_1f3ea;
            case 0x1f3e9: return R.drawable.emoji_1f3e9;
            case 0x1f3e8: return R.drawable.emoji_1f3e8;
            case 0x1f492: return R.drawable.emoji_1f492;
            case 0x26ea: return R.drawable.emoji_26ea;
            case 0x1f3ec: return R.drawable.emoji_1f3ec;
            case 0x1f3e4: return R.drawable.emoji_1f3e4;
            case 0x1f307: return R.drawable.emoji_1f307;
            case 0x1f306: return R.drawable.emoji_1f306;
            case 0x1f3ef: return R.drawable.emoji_1f3ef;
            case 0x1f3f0: return R.drawable.emoji_1f3f0;
            case 0x26fa: return R.drawable.emoji_26fa;
            case 0x1f3ed: return R.drawable.emoji_1f3ed;
            case 0x1f5fc: return R.drawable.emoji_1f5fc;
            case 0x1f5fe: return R.drawable.emoji_1f5fe;
            case 0x1f5fb: return R.drawable.emoji_1f5fb;
            case 0x1f304: return R.drawable.emoji_1f304;
            case 0x1f305: return R.drawable.emoji_1f305;
            case 0x1f303: return R.drawable.emoji_1f303;
            case 0x1f5fd: return R.drawable.emoji_1f5fd;
            case 0x1f309: return R.drawable.emoji_1f309;
            case 0x1f3a0: return R.drawable.emoji_1f3a0;
            case 0x1f3a1: return R.drawable.emoji_1f3a1;
            case 0x26f2: return R.drawable.emoji_26f2;
            case 0x1f3a2: return R.drawable.emoji_1f3a2;
            case 0x1f6a2: return R.drawable.emoji_1f6a2;
            case 0x26f5: return R.drawable.emoji_26f5;
            case 0x1f6a4: return R.drawable.emoji_1f6a4;
            case 0x1f6a3: return R.drawable.emoji_1f6a3;
            case 0x2693: return R.drawable.emoji_2693;
            case 0x1f680: return R.drawable.emoji_1f680;
            case 0x2708: return R.drawable.emoji_2708;
            case 0x1f4ba: return R.drawable.emoji_1f4ba;
            case 0x1f681: return R.drawable.emoji_1f681;
            case 0x1f682: return R.drawable.emoji_1f682;
            case 0x1f68a: return R.drawable.emoji_1f68a;
            case 0x1f689: return R.drawable.emoji_1f689;
            case 0x1f69e: return R.drawable.emoji_1f69e;
            case 0x1f686: return R.drawable.emoji_1f686;
            case 0x1f684: return R.drawable.emoji_1f684;
            case 0x1f685: return R.drawable.emoji_1f685;
            case 0x1f688: return R.drawable.emoji_1f688;
            case 0x1f687: return R.drawable.emoji_1f687;
            case 0x1f69d: return R.drawable.emoji_1f69d;
            case 0x1f68b: return R.drawable.emoji_1f68b; // TODO (github) review this emoji
            case 0x1f683: return R.drawable.emoji_1f683;
            case 0x1f68e: return R.drawable.emoji_1f68e;
            case 0x1f68c: return R.drawable.emoji_1f68c;
            case 0x1f68d: return R.drawable.emoji_1f68d;
            case 0x1f699: return R.drawable.emoji_1f699;
            case 0x1f698: return R.drawable.emoji_1f698;
            case 0x1f697: return R.drawable.emoji_1f697;
            case 0x1f695: return R.drawable.emoji_1f695;
            case 0x1f696: return R.drawable.emoji_1f696;
            case 0x1f69b: return R.drawable.emoji_1f69b;
            case 0x1f69a: return R.drawable.emoji_1f69a;
            case 0x1f6a8: return R.drawable.emoji_1f6a8;
            case 0x1f693: return R.drawable.emoji_1f693;
            case 0x1f694: return R.drawable.emoji_1f694;
            case 0x1f692: return R.drawable.emoji_1f692;
            case 0x1f691: return R.drawable.emoji_1f691;
            case 0x1f690: return R.drawable.emoji_1f690;
            case 0x1f6b2: return R.drawable.emoji_1f6b2;
            case 0x1f6a1: return R.drawable.emoji_1f6a1;
            case 0x1f69f: return R.drawable.emoji_1f69f;
            case 0x1f6a0: return R.drawable.emoji_1f6a0;
            case 0x1f69c: return R.drawable.emoji_1f69c;
            case 0x1f488: return R.drawable.emoji_1f488;
            case 0x1f68f: return R.drawable.emoji_1f68f;
            case 0x1f3ab: return R.drawable.emoji_1f3ab;
            case 0x1f6a6: return R.drawable.emoji_1f6a6;
            case 0x1f6a5: return R.drawable.emoji_1f6a5;
            case 0x26a0: return R.drawable.emoji_26a0;
            case 0x1f6a7: return R.drawable.emoji_1f6a7;
            case 0x1f530: return R.drawable.emoji_1f530;
            case 0x26fd: return R.drawable.emoji_26fd;
            case 0x1f3ee: return R.drawable.emoji_1f3ee;
            case 0x1f3b0: return R.drawable.emoji_1f3b0;
            case 0x2668: return R.drawable.emoji_2668;
            case 0x1f5ff: return R.drawable.emoji_1f5ff;
            case 0x1f3aa: return R.drawable.emoji_1f3aa;
            case 0x1f3ad: return R.drawable.emoji_1f3ad;
            case 0x1f4cd: return R.drawable.emoji_1f4cd;
            case 0x1f6a9: return R.drawable.emoji_1f6a9;
//        Emoji.fromChars("\ud83c\uddef\ud83c\uddf5";
//        Emoji.fromChars("\ud83c\uddf0\ud83c\uddf7";
//        Emoji.fromChars("\ud83c\udde9\ud83c\uddea";
//        Emoji.fromChars("\ud83c\udde8\ud83c\uddf3";
//        Emoji.fromChars("\ud83c\uddfa\ud83c\uddf8";
//        Emoji.fromChars("\ud83c\uddeb\ud83c\uddf7";
//        Emoji.fromChars("\ud83c\uddea\ud83c\uddf8";
//        Emoji.fromChars("\ud83c\uddee\ud83c\uddf9";
//        Emoji.fromChars("\ud83c\uddf7\ud83c\uddfa";
//        Emoji.fromChars("\ud83c\uddec\ud83c\udde7";

            // Symbols
//        Emoji.fromChars("\u0031\u20e3"): return
//        Emoji.fromChars("\u0032\u20e3"): return
//        Emoji.fromChars("\u0033\u20e3"): return
//        Emoji.fromChars("\u0034\u20e3"): return
//        Emoji.fromChars("\u0035\u20e3"): return
//        Emoji.fromChars("\u0036\u20e3"): return
//        Emoji.fromChars("\u0037\u20e3"): return
//        Emoji.fromChars("\u0038\u20e3"): return
//        Emoji.fromChars("\u0039\u20e3"): return
//        Emoji.fromChars("\u0030\u20e3"): return
            case 0x1f51f: return R.drawable.emoji_1f51f;
            case 0x1f522: return R.drawable.emoji_1f522;
//        Emoji.fromChars("\u0023\u20e3"): return
            case 0x1f523: return R.drawable.emoji_1f523;
            case 0x2b06: return R.drawable.emoji_2b06;
            case 0x2b07: return R.drawable.emoji_2b07;
            case 0x2b05: return R.drawable.emoji_2b05;
            case 0x27a1: return R.drawable.emoji_27a1;
            case 0x1f520: return R.drawable.emoji_1f520;
            case 0x1f521: return R.drawable.emoji_1f521;
            case 0x1f524: return R.drawable.emoji_1f524;
            case 0x2197: return R.drawable.emoji_2197;
            case 0x2196: return R.drawable.emoji_2196;
            case 0x2198: return R.drawable.emoji_2198;
            case 0x2199: return R.drawable.emoji_2199;
            case 0x2194: return R.drawable.emoji_2194;
            case 0x2195: return R.drawable.emoji_2195;
            case 0x1f504: return R.drawable.emoji_1f504;
            case 0x25c0: return R.drawable.emoji_25c0;
            case 0x25b6: return R.drawable.emoji_25b6;
            case 0x1f53c: return R.drawable.emoji_1f53c;
            case 0x1f53d: return R.drawable.emoji_1f53d;
            case 0x21a9: return R.drawable.emoji_21a9;
            case 0x21aa: return R.drawable.emoji_21aa;
            case 0x2139: return R.drawable.emoji_2139;
            case 0x23ea: return R.drawable.emoji_23ea;
            case 0x23e9: return R.drawable.emoji_23e9;
            case 0x23eb: return R.drawable.emoji_23eb;
            case 0x23ec: return R.drawable.emoji_23ec;
            case 0x2935: return R.drawable.emoji_2935;
            case 0x2934: return R.drawable.emoji_2934;
            case 0x1f197: return R.drawable.emoji_1f197;
            case 0x1f500: return R.drawable.emoji_1f500;
            case 0x1f501: return R.drawable.emoji_1f501;
            case 0x1f502: return R.drawable.emoji_1f502;
            case 0x1f195: return R.drawable.emoji_1f195;
            case 0x1f199: return R.drawable.emoji_1f199;
            case 0x1f192: return R.drawable.emoji_1f192;
            case 0x1f193: return R.drawable.emoji_1f193;
            case 0x1f196: return R.drawable.emoji_1f196;
            case 0x1f4f6: return R.drawable.emoji_1f4f6;
            case 0x1f3a6: return R.drawable.emoji_1f3a6;
            case 0x1f201: return R.drawable.emoji_1f201;
            case 0x1f22f: return R.drawable.emoji_1f22f;
            case 0x1f233: return R.drawable.emoji_1f233;
            case 0x1f235: return R.drawable.emoji_1f235;
            case 0x1f234: return R.drawable.emoji_1f234;
            case 0x1f232: return R.drawable.emoji_1f232;
            case 0x1f250: return R.drawable.emoji_1f250;
            case 0x1f239: return R.drawable.emoji_1f239;
            case 0x1f23a: return R.drawable.emoji_1f23a;
            case 0x1f236: return R.drawable.emoji_1f236;
            case 0x1f21a: return R.drawable.emoji_1f21a;
            case 0x1f6bb: return R.drawable.emoji_1f6bb;
            case 0x1f6b9: return R.drawable.emoji_1f6b9;
            case 0x1f6ba: return R.drawable.emoji_1f6ba;
            case 0x1f6bc: return R.drawable.emoji_1f6bc;
            case 0x1f6be: return R.drawable.emoji_1f6be;
            case 0x1f6b0: return R.drawable.emoji_1f6b0;
            case 0x1f6ae: return R.drawable.emoji_1f6ae;
            case 0x1f17f: return R.drawable.emoji_1f17f;
            case 0x267f: return R.drawable.emoji_267f;
            case 0x1f6ad: return R.drawable.emoji_1f6ad;
            case 0x1f237: return R.drawable.emoji_1f237;
            case 0x1f238: return R.drawable.emoji_1f238;
            case 0x1f202: return R.drawable.emoji_1f202;
            case 0x24c2: return R.drawable.emoji_24c2;
            case 0x1f6c2: return R.drawable.emoji_1f6c2;
            case 0x1f6c4: return R.drawable.emoji_1f6c4;
            case 0x1f6c5: return R.drawable.emoji_1f6c5;
            case 0x1f6c3: return R.drawable.emoji_1f6c3;
            case 0x1f251: return R.drawable.emoji_1f251;
            case 0x3299: return R.drawable.emoji_3299;
            case 0x3297: return R.drawable.emoji_3297;
            case 0x1f191: return R.drawable.emoji_1f191;
            case 0x1f198: return R.drawable.emoji_1f198;
            case 0x1f194: return R.drawable.emoji_1f194;
            case 0x1f6ab: return R.drawable.emoji_1f6ab;
            case 0x1f51e: return R.drawable.emoji_1f51e;
            case 0x1f4f5: return R.drawable.emoji_1f4f5;
            case 0x1f6af: return R.drawable.emoji_1f6af;
            case 0x1f6b1: return R.drawable.emoji_1f6b1;
            case 0x1f6b3: return R.drawable.emoji_1f6b3;
            case 0x1f6b7: return R.drawable.emoji_1f6b7;
            case 0x1f6b8: return R.drawable.emoji_1f6b8;
            case 0x26d4: return R.drawable.emoji_26d4;
            case 0x2733: return R.drawable.emoji_2733;
            case 0x2747: return R.drawable.emoji_2747;
            case 0x274e: return R.drawable.emoji_274e;
            case 0x2705: return R.drawable.emoji_2705;
            case 0x2734: return R.drawable.emoji_2734;
            case 0x1f49f: return R.drawable.emoji_1f49f;
            case 0x1f19a: return R.drawable.emoji_1f19a;
            case 0x1f4f3: return R.drawable.emoji_1f4f3;
            case 0x1f4f4: return R.drawable.emoji_1f4f4;
            case 0x1f170: return R.drawable.emoji_1f170;
            case 0x1f171: return R.drawable.emoji_1f171;
            case 0x1f18e: return R.drawable.emoji_1f18e;
            case 0x1f17e: return R.drawable.emoji_1f17e;
            case 0x1f4a0: return R.drawable.emoji_1f4a0;
            case 0x27bf: return R.drawable.emoji_27bf;
            case 0x267b: return R.drawable.emoji_267b;
            case 0x2648: return R.drawable.emoji_2648;
            case 0x2649: return R.drawable.emoji_2649;
            case 0x264a: return R.drawable.emoji_264a;
            case 0x264b: return R.drawable.emoji_264b;
            case 0x264c: return R.drawable.emoji_264c;
            case 0x264d: return R.drawable.emoji_264d;
            case 0x264e: return R.drawable.emoji_264e;
            case 0x264f: return R.drawable.emoji_264f;
            case 0x2650: return R.drawable.emoji_2650;
            case 0x2651: return R.drawable.emoji_2651;
            case 0x2652: return R.drawable.emoji_2652;
            case 0x2653: return R.drawable.emoji_2653;
            case 0x26ce: return R.drawable.emoji_26ce;
            case 0x1f52f: return R.drawable.emoji_1f52f;
            case 0x1f3e7: return R.drawable.emoji_1f3e7;
            case 0x1f4b9: return R.drawable.emoji_1f4b9;
            case 0x1f4b2: return R.drawable.emoji_1f4b2;
            case 0x1f4b1: return R.drawable.emoji_1f4b1;
            case 0x00a9: return R.drawable.emoji_00a9;
            case 0x00ae: return R.drawable.emoji_00ae;
            case 0x2122: return R.drawable.emoji_2122;
            case 0x274c: return R.drawable.emoji_274c;
            case 0x203c: return R.drawable.emoji_203c;
            case 0x2049: return R.drawable.emoji_2049;
            case 0x2757: return R.drawable.emoji_2757;
            case 0x2753: return R.drawable.emoji_2753;
            case 0x2755: return R.drawable.emoji_2755;
            case 0x2754: return R.drawable.emoji_2754;
            case 0x2b55: return R.drawable.emoji_2b55;
            case 0x1f51d: return R.drawable.emoji_1f51d;
            case 0x1f51a: return R.drawable.emoji_1f51a;
            case 0x1f519: return R.drawable.emoji_1f519;
            case 0x1f51b: return R.drawable.emoji_1f51b;
            case 0x1f51c: return R.drawable.emoji_1f51c;
            case 0x1f503: return R.drawable.emoji_1f503;
            case 0x1f55b: return R.drawable.emoji_1f55b;
            case 0x1f567: return R.drawable.emoji_1f567;
            case 0x1f550: return R.drawable.emoji_1f550;
            case 0x1f55c: return R.drawable.emoji_1f55c;
            case 0x1f551: return R.drawable.emoji_1f551;
            case 0x1f55d: return R.drawable.emoji_1f55d;
            case 0x1f552: return R.drawable.emoji_1f552;
            case 0x1f55e: return R.drawable.emoji_1f55e;
            case 0x1f553: return R.drawable.emoji_1f553;
            case 0x1f55f: return R.drawable.emoji_1f55f;
            case 0x1f554: return R.drawable.emoji_1f554;
            case 0x1f560: return R.drawable.emoji_1f560;
            case 0x1f555: return R.drawable.emoji_1f555;
            case 0x1f556: return R.drawable.emoji_1f556;
            case 0x1f557: return R.drawable.emoji_1f557;
            case 0x1f558: return R.drawable.emoji_1f558;
            case 0x1f559: return R.drawable.emoji_1f559;
            case 0x1f55a: return R.drawable.emoji_1f55a;
            case 0x1f561: return R.drawable.emoji_1f561;
            case 0x1f562: return R.drawable.emoji_1f562;
            case 0x1f563: return R.drawable.emoji_1f563;
            case 0x1f564: return R.drawable.emoji_1f564;
            case 0x1f565: return R.drawable.emoji_1f565;
            case 0x1f566: return R.drawable.emoji_1f566;
            case 0x2716: return R.drawable.emoji_2716;
            case 0x2795: return R.drawable.emoji_2795;
            case 0x2796: return R.drawable.emoji_2796;
            case 0x2797: return R.drawable.emoji_2797;
            case 0x2660: return R.drawable.emoji_2660;
            case 0x2665: return R.drawable.emoji_2665;
            case 0x2663: return R.drawable.emoji_2663;
            case 0x2666: return R.drawable.emoji_2666;
            case 0x1f4ae: return R.drawable.emoji_1f4ae;
            case 0x1f4af: return R.drawable.emoji_1f4af;
            case 0x2714: return R.drawable.emoji_2714;
            case 0x2611: return R.drawable.emoji_2611;
            case 0x1f518: return R.drawable.emoji_1f518;
            case 0x1f517: return R.drawable.emoji_1f517;
            case 0x27b0: return R.drawable.emoji_27b0;
            case 0x3030: return R.drawable.emoji_3030;
            case 0x303d: return R.drawable.emoji_303d;
            case 0x1f531: return R.drawable.emoji_1f531;
            case 0x25fc: return R.drawable.emoji_25fc;
            case 0x25fb: return R.drawable.emoji_25fb;
            case 0x25fe: return R.drawable.emoji_25fe;
            case 0x25fd: return R.drawable.emoji_25fd;
            case 0x25aa: return R.drawable.emoji_25aa;
            case 0x25ab: return R.drawable.emoji_25ab;
            case 0x1f53a: return R.drawable.emoji_1f53a;
            case 0x1f532: return R.drawable.emoji_1f532;
            case 0x1f533: return R.drawable.emoji_1f533;
            case 0x26ab: return R.drawable.emoji_26ab;
            case 0x26aa: return R.drawable.emoji_26aa;
            case 0x1f534: return R.drawable.emoji_1f534;
            case 0x1f535: return R.drawable.emoji_1f535;
            case 0x1f53b: return R.drawable.emoji_1f53b;
            case 0x2b1c: return R.drawable.emoji_2b1c;
            case 0x2b1b: return R.drawable.emoji_2b1b;
            case 0x1f536: return R.drawable.emoji_1f536;
            case 0x1f537: return R.drawable.emoji_1f537;
            case 0x1f538: return R.drawable.emoji_1f538;
            case 0x1f539: return R.drawable.emoji_1f539;


            //these are taken from below
            case 0x1f642: return R.drawable.emoji_1f642;
            case 0x1f917: return R.drawable.emoji_1f917;
            case 0x1f914: return R.drawable.emoji_1f914;
            case 0x1f644: return R.drawable.emoji_1f644;
            case 0x1f910: return R.drawable.emoji_1f910;
            case 0x1f913: return R.drawable.emoji_1f913;
            case 0x2639: return R.drawable.emoji_2639;
            case 0x1f641: return R.drawable.emoji_1f641;
            case 0x1f643: return R.drawable.emoji_1f643;
            case 0x1f912: return R.drawable.emoji_1f912;
            case 0x1f915: return R.drawable.emoji_1f915;
            case 0x1f911: return R.drawable.emoji_1f911;
            case 0x26d1: return R.drawable.emoji_26d1;
            case 0x1f575: return R.drawable.emoji_1f575;
            case 0x1f5e3: return R.drawable.emoji_1f5e3;
            case 0x1f574: return R.drawable.emoji_1f574;
            case 0x1f595: return R.drawable.emoji_1f595;
            case 0x1f918: return R.drawable.emoji_1f918;
            case 0x1f590: return R.drawable.emoji_1f590;
            case 0x270d: return R.drawable.emoji_270d;
            case 0x1f441: return R.drawable.emoji_1f441;
            case 0x2763: return R.drawable.emoji_2763;
            case 0x1f573: return R.drawable.emoji_1f573;
            case 0x1f5ef: return R.drawable.emoji_1f5ef;
            case 0x1f576: return R.drawable.emoji_1f576;
            case 0x1f6cd: return R.drawable.emoji_1f6cd;
            case 0x1f4ff: return R.drawable.emoji_1f4ff;
            case 0x2620: return R.drawable.emoji_2620;
            case 0x1f916: return R.drawable.emoji_1f916;
            case 0x1f981: return R.drawable.emoji_1f981;
            case 0x1f984: return R.drawable.emoji_1f984;
            case 0x1f43f: return R.drawable.emoji_1f43f;
            case 0x1f983: return R.drawable.emoji_1f983;
            case 0x1f54a: return R.drawable.emoji_1f54a;
            case 0x1f980: return R.drawable.emoji_1f980;
            case 0x1f577: return R.drawable.emoji_1f577;
            case 0x1f578: return R.drawable.emoji_1f578;
            case 0x1f982: return R.drawable.emoji_1f982;
            case 0x1f3f5: return R.drawable.emoji_1f3f5;
            case 0x2618: return R.drawable.emoji_2618;
            case 0x1f336: return R.drawable.emoji_1f336;
            case 0x1f9c0: return R.drawable.emoji_1f9c0;
            case 0x1f32d: return R.drawable.emoji_1f32d;
            case 0x1f32e: return R.drawable.emoji_1f32e;
            case 0x1f32f: return R.drawable.emoji_1f32f;
            case 0x1f37f: return R.drawable.emoji_1f37f;
            case 0x1f37e: return R.drawable.emoji_1f37e;
            case 0x1f37d: return R.drawable.emoji_1f37d;
            case 0x1f3fa: return R.drawable.emoji_1f3fa;
            case 0x1f5fa: return R.drawable.emoji_1f5fa;
            case 0x1f3d4: return R.drawable.emoji_1f3d4;
            case 0x26f0: return R.drawable.emoji_26f0;
            case 0x1f3d5: return R.drawable.emoji_1f3d5;
            case 0x1f3d6: return R.drawable.emoji_1f3d6;
            case 0x1f3dc: return R.drawable.emoji_1f3dc;
            case 0x1f3dd: return R.drawable.emoji_1f3dd;
            case 0x1f3de: return R.drawable.emoji_1f3de;
            case 0x1f3df: return R.drawable.emoji_1f3df;
            case 0x1f3db: return R.drawable.emoji_1f3db;
            case 0x1f3d7: return R.drawable.emoji_1f3d7;
            case 0x1f3d8: return R.drawable.emoji_1f3d8;
            case 0x1f3d9: return R.drawable.emoji_1f3d9;
            case 0x1f3da: return R.drawable.emoji_1f3da;
            case 0x1f6d0: return R.drawable.emoji_1f6d0;
            case 0x1f54b: return R.drawable.emoji_1f54b;
            case 0x1f54c: return R.drawable.emoji_1f54c;
            case 0x1f54d: return R.drawable.emoji_1f54d;
            case 0x1f5bc: return R.drawable.emoji_1f5bc;
            case 0x1f6e2: return R.drawable.emoji_1f6e2;
            case 0x1f6e3: return R.drawable.emoji_1f6e3;
            case 0x1f6e4: return R.drawable.emoji_1f6e4;
            case 0x1f6f3: return R.drawable.emoji_1f6f3;
            case 0x26f4: return R.drawable.emoji_26f4;
            case 0x1f6e5: return R.drawable.emoji_1f6e5;
            case 0x1f6e9: return R.drawable.emoji_1f6e9;
            case 0x1f6eb: return R.drawable.emoji_1f6eb;
            case 0x1f6ec: return R.drawable.emoji_1f6ec;
            case 0x1f6f0: return R.drawable.emoji_1f6f0;
            case 0x1f6ce: return R.drawable.emoji_1f6ce;
            case 0x1f6cc: return R.drawable.emoji_1f6cc;
            case 0x1f6cf: return R.drawable.emoji_1f6cf;
            case 0x1f6cb: return R.drawable.emoji_1f6cb;
            case 0x23f1: return R.drawable.emoji_23f1;
            case 0x23f2: return R.drawable.emoji_23f2;
            case 0x1f570: return R.drawable.emoji_1f570;
            case 0x1f321: return R.drawable.emoji_1f321;
            case 0x26c8: return R.drawable.emoji_26c8;
            case 0x1f324: return R.drawable.emoji_1f324;
            case 0x1f325: return R.drawable.emoji_1f325;
            case 0x1f326: return R.drawable.emoji_1f326;
            case 0x1f327: return R.drawable.emoji_1f327;
            case 0x1f328: return R.drawable.emoji_1f328;
            case 0x1f329: return R.drawable.emoji_1f329;
            case 0x1f32a: return R.drawable.emoji_1f32a;
            case 0x1f32b: return R.drawable.emoji_1f32b;
            case 0x1f32c: return R.drawable.emoji_1f32c;
            case 0x2602: return R.drawable.emoji_2602;
            case 0x26f1: return R.drawable.emoji_26f1;
            case 0x2603: return R.drawable.emoji_2603;
            case 0x2604: return R.drawable.emoji_2604;
            case 0x1f54e: return R.drawable.emoji_1f54e;
            case 0x1f396: return R.drawable.emoji_1f396;
            case 0x1f397: return R.drawable.emoji_1f397;
            case 0x1f39e: return R.drawable.emoji_1f39e;
            case 0x1f39f: return R.drawable.emoji_1f39f;
            case 0x1f3f7: return R.drawable.emoji_1f3f7;
            case 0x1f3cc: return R.drawable.emoji_1f3cc;
            case 0x26f8: return R.drawable.emoji_26f8;
            case 0x26f7: return R.drawable.emoji_26f7;
            case 0x26f9: return R.drawable.emoji_26f9;
            case 0x1f3cb: return R.drawable.emoji_1f3cb;
            case 0x1f3ce: return R.drawable.emoji_1f3ce;
            case 0x1f3cd: return R.drawable.emoji_1f3cd;
            case 0x1f3c5: return R.drawable.emoji_1f3c5;
            case 0x1f3cf: return R.drawable.emoji_1f3cf;
            case 0x1f3d0: return R.drawable.emoji_1f3d0;
            case 0x1f3d1: return R.drawable.emoji_1f3d1;
            case 0x1f3d2: return R.drawable.emoji_1f3d2;
            case 0x1f3d3: return R.drawable.emoji_1f3d3;
            case 0x1f3f8: return R.drawable.emoji_1f3f8;
            case 0x1f579: return R.drawable.emoji_1f579;
            case 0x23ed: return R.drawable.emoji_23ed;
            case 0x23ef: return R.drawable.emoji_23ef;
            case 0x23ee: return R.drawable.emoji_23ee;
            case 0x23f8: return R.drawable.emoji_23f8;
            case 0x23f9: return R.drawable.emoji_23f9;
            case 0x23fa: return R.drawable.emoji_23fa;
            case 0x1f399: return R.drawable.emoji_1f399;
            case 0x1f39a: return R.drawable.emoji_1f39a;
            case 0x1f39b: return R.drawable.emoji_1f39b;
            case 0x1f5a5: return R.drawable.emoji_1f5a5;
            case 0x1f5a8: return R.drawable.emoji_1f5a8;
            case 0x2328: return R.drawable.emoji_2328;
            case 0x1f5b1: return R.drawable.emoji_1f5b1;
            case 0x1f5b2: return R.drawable.emoji_1f5b2;
            case 0x1f4fd: return R.drawable.emoji_1f4fd;
            case 0x1f4f8: return R.drawable.emoji_1f4f8;
            case 0x1f56f: return R.drawable.emoji_1f56f;
            case 0x1f5de: return R.drawable.emoji_1f5de;
            case 0x1f5f3: return R.drawable.emoji_1f5f3;
            case 0x1f58b: return R.drawable.emoji_1f58b;
            case 0x1f58a: return R.drawable.emoji_1f58a;
            case 0x1f58c: return R.drawable.emoji_1f58c;
            case 0x1f58d: return R.drawable.emoji_1f58d;
            case 0x1f5c2: return R.drawable.emoji_1f5c2;
            case 0x1f5d2: return R.drawable.emoji_1f5d2;
            case 0x1f5d3: return R.drawable.emoji_1f5d3;
            case 0x1f587: return R.drawable.emoji_1f587;
            case 0x1f5c3: return R.drawable.emoji_1f5c3;
            case 0x1f5c4: return R.drawable.emoji_1f5c4;
            case 0x1f5d1: return R.drawable.emoji_1f5d1;
            case 0x1f5dd: return R.drawable.emoji_1f5dd;
            case 0x26cf: return R.drawable.emoji_26cf;
            case 0x2692: return R.drawable.emoji_2692;
            case 0x1f6e0: return R.drawable.emoji_1f6e0;
            case 0x2699: return R.drawable.emoji_2699;
            case 0x1f5dc: return R.drawable.emoji_1f5dc;
            case 0x2697: return R.drawable.emoji_2697;
            case 0x2696: return R.drawable.emoji_2696;
            case 0x26d3: return R.drawable.emoji_26d3;
            case 0x1f5e1: return R.drawable.emoji_1f5e1;
            case 0x2694: return R.drawable.emoji_2694;
            case 0x1f6e1: return R.drawable.emoji_1f6e1;
            case 0x1f3f9: return R.drawable.emoji_1f3f9;
            case 0x26b0: return R.drawable.emoji_26b0;
            case 0x26b1: return R.drawable.emoji_26b1;
            case 0x1f3f3: return R.drawable.emoji_1f3f3;
            case 0x1f3f4: return R.drawable.emoji_1f3f4;
            case 0x269c: return R.drawable.emoji_269c;
            case 0x269b: return R.drawable.emoji_269b;
            case 0x1f549: return R.drawable.emoji_1f549;
            case 0x2721: return R.drawable.emoji_2721;
            case 0x2638: return R.drawable.emoji_2638;
            case 0x262f: return R.drawable.emoji_262f;
            case 0x271d: return R.drawable.emoji_271d;
            case 0x2626: return R.drawable.emoji_2626;
            case 0x26e9: return R.drawable.emoji_26e9;
            case 0x262a: return R.drawable.emoji_262a;
            case 0x262e: return R.drawable.emoji_262e;
            case 0x2622: return R.drawable.emoji_2622;
            case 0x2623: return R.drawable.emoji_2623;
            case 0x1f5e8: return R.drawable.emoji_1f5e8;
        }

        return 0;
    }

    private static int getSoftbankEmojiResource(char c) {
        switch(c) {
            case 0xe001: return R.drawable.emoji_1f466;
            case 0xe002: return R.drawable.emoji_1f467;
            case 0xe003: return R.drawable.emoji_1f48b;
            case 0xe004: return R.drawable.emoji_1f468;
            case 0xe005: return R.drawable.emoji_1f469;
            case 0xe006: return R.drawable.emoji_1f455;
            case 0xe007: return R.drawable.emoji_1f45e;
            case 0xe008: return R.drawable.emoji_1f4f7;
            case 0xe009: return R.drawable.emoji_1f4de;
            case 0xe00a: return R.drawable.emoji_1f4f1;
            case 0xe00b: return R.drawable.emoji_1f4e0;
            case 0xe00c: return R.drawable.emoji_1f4bb;
            case 0xe00d: return R.drawable.emoji_1f44a;
            case 0xe00e: return R.drawable.emoji_1f44d;
            case 0xe00f: return R.drawable.emoji_261d;
            case 0xe010: return R.drawable.emoji_270a;
            case 0xe011: return R.drawable.emoji_270c;
            case 0xe012: return R.drawable.emoji_1f64b;
            case 0xe013: return R.drawable.emoji_1f3bf;
            case 0xe014: return R.drawable.emoji_26f3;
            case 0xe015: return R.drawable.emoji_1f3be;
            case 0xe016: return R.drawable.emoji_26be;
            case 0xe017: return R.drawable.emoji_1f3c4;
            case 0xe018: return R.drawable.emoji_26bd;
            case 0xe019: return R.drawable.emoji_1f3a3;
            case 0xe01a: return R.drawable.emoji_1f434;
            case 0xe01b: return R.drawable.emoji_1f697;
            case 0xe01c: return R.drawable.emoji_26f5;
            case 0xe01d: return R.drawable.emoji_2708;
            case 0xe01e: return R.drawable.emoji_1f683;
            case 0xe01f: return R.drawable.emoji_1f685;
            case 0xe020: return R.drawable.emoji_2753;
            case 0xe021: return R.drawable.emoji_2757;
            case 0xe022: return R.drawable.emoji_2764;
            case 0xe023: return R.drawable.emoji_1f494;
            case 0xe024: return R.drawable.emoji_1f550;
            case 0xe025: return R.drawable.emoji_1f551;
            case 0xe026: return R.drawable.emoji_1f552;
            case 0xe027: return R.drawable.emoji_1f553;
            case 0xe028: return R.drawable.emoji_1f554;
            case 0xe029: return R.drawable.emoji_1f555;
            case 0xe02a: return R.drawable.emoji_1f556;
            case 0xe02b: return R.drawable.emoji_1f557;
            case 0xe02c: return R.drawable.emoji_1f558;
            case 0xe02d: return R.drawable.emoji_1f559;
            case 0xe02e: return R.drawable.emoji_1f55a;
            case 0xe02f: return R.drawable.emoji_1f55b;
            case 0xe030: return R.drawable.emoji_1f338;
            case 0xe031: return R.drawable.emoji_1f531;
            case 0xe032: return R.drawable.emoji_1f339;
            case 0xe033: return R.drawable.emoji_1f384;
            case 0xe034: return R.drawable.emoji_1f48d;
            case 0xe035: return R.drawable.emoji_1f48e;
            case 0xe036: return R.drawable.emoji_1f3e0;
            case 0xe037: return R.drawable.emoji_26ea;
            case 0xe038: return R.drawable.emoji_1f3e2;
            case 0xe039: return R.drawable.emoji_1f689;
            case 0xe03a: return R.drawable.emoji_26fd;
            case 0xe03b: return R.drawable.emoji_1f5fb;
            case 0xe03c: return R.drawable.emoji_1f3a4;
            case 0xe03d: return R.drawable.emoji_1f3a5;
            case 0xe03e: return R.drawable.emoji_1f3b5;
            case 0xe03f: return R.drawable.emoji_1f511;
            case 0xe040: return R.drawable.emoji_1f3b7;
            case 0xe041: return R.drawable.emoji_1f3b8;
            case 0xe042: return R.drawable.emoji_1f3ba;
            case 0xe043: return R.drawable.emoji_1f374;
            case 0xe044: return R.drawable.emoji_1f377;
            case 0xe045: return R.drawable.emoji_2615;
            case 0xe046: return R.drawable.emoji_1f370;
            case 0xe047: return R.drawable.emoji_1f37a;
            case 0xe048: return R.drawable.emoji_26c4;
            case 0xe049: return R.drawable.emoji_2601;
            case 0xe04a: return R.drawable.emoji_2600;
            case 0xe04b: return R.drawable.emoji_2614;
            case 0xe04c: return R.drawable.emoji_1f313;
            case 0xe04d: return R.drawable.emoji_1f304;
            case 0xe04e: return R.drawable.emoji_1f47c;
            case 0xe04f: return R.drawable.emoji_1f431;
            case 0xe050: return R.drawable.emoji_1f42f;
            case 0xe051: return R.drawable.emoji_1f43b;
            case 0xe052: return R.drawable.emoji_1f429;
            case 0xe053: return R.drawable.emoji_1f42d;
            case 0xe054: return R.drawable.emoji_1f433;
            case 0xe055: return R.drawable.emoji_1f427;
            case 0xe056: return R.drawable.emoji_1f60a;
            case 0xe057: return R.drawable.emoji_1f603;
            case 0xe058: return R.drawable.emoji_1f61e;
            case 0xe059: return R.drawable.emoji_1f620;
            case 0xe05a: return R.drawable.emoji_1f4a9;
            case 0xe101: return R.drawable.emoji_1f4ea;
            case 0xe102: return R.drawable.emoji_1f4ee;
            case 0xe103: return R.drawable.emoji_1f4e7;
            case 0xe104: return R.drawable.emoji_1f4f2;
            case 0xe105: return R.drawable.emoji_1f61c;
            case 0xe106: return R.drawable.emoji_1f60d;
            case 0xe107: return R.drawable.emoji_1f631;
            case 0xe108: return R.drawable.emoji_1f613;
            case 0xe109: return R.drawable.emoji_1f435;
            case 0xe10a: return R.drawable.emoji_1f419;
            case 0xe10b: return R.drawable.emoji_1f437;
            case 0xe10c: return R.drawable.emoji_1f47d;
            case 0xe10d: return R.drawable.emoji_1f680;
            case 0xe10e: return R.drawable.emoji_1f451;
            case 0xe10f: return R.drawable.emoji_1f4a1;
            case 0xe110: return R.drawable.emoji_1f331;
            case 0xe111: return R.drawable.emoji_1f48f;
            case 0xe112: return R.drawable.emoji_1f381;
            case 0xe113: return R.drawable.emoji_1f52b;
            case 0xe114: return R.drawable.emoji_1f50d;
            case 0xe115: return R.drawable.emoji_1f3c3;
            case 0xe116: return R.drawable.emoji_1f528;
            case 0xe117: return R.drawable.emoji_1f386;
            case 0xe118: return R.drawable.emoji_1f341;
            case 0xe119: return R.drawable.emoji_1f342;
            case 0xe11a: return R.drawable.emoji_1f47f;
            case 0xe11b: return R.drawable.emoji_1f47b;
            case 0xe11c: return R.drawable.emoji_1f480;
            case 0xe11d: return R.drawable.emoji_1f525;
            case 0xe11e: return R.drawable.emoji_1f4bc;
            case 0xe11f: return R.drawable.emoji_1f4ba;
            case 0xe120: return R.drawable.emoji_1f354;
            case 0xe121: return R.drawable.emoji_26f2;
            case 0xe122: return R.drawable.emoji_26fa;
            case 0xe123: return R.drawable.emoji_2668;
            case 0xe124: return R.drawable.emoji_1f3a1;
            case 0xe125: return R.drawable.emoji_1f3ab;
            case 0xe126: return R.drawable.emoji_1f4bf;
            case 0xe127: return R.drawable.emoji_1f4c0;
            case 0xe128: return R.drawable.emoji_1f4fb;
            case 0xe129: return R.drawable.emoji_1f4fc;
            case 0xe12a: return R.drawable.emoji_1f4fa;
            case 0xe12b: return R.drawable.emoji_1f47e;
            case 0xe12c: return R.drawable.emoji_303d;
            case 0xe12d: return R.drawable.emoji_1f004;
            case 0xe12e: return R.drawable.emoji_1f19a;
            case 0xe12f: return R.drawable.emoji_1f4b0;
            case 0xe130: return R.drawable.emoji_1f3af;
            case 0xe131: return R.drawable.emoji_1f3c6;
            case 0xe132: return R.drawable.emoji_1f3c1;
            case 0xe133: return R.drawable.emoji_1f3b0;
            case 0xe134: return R.drawable.emoji_1f40e;
            case 0xe135: return R.drawable.emoji_1f6a4;
            case 0xe136: return R.drawable.emoji_1f6b2;
            case 0xe137: return R.drawable.emoji_1f6a7;
            case 0xe138: return R.drawable.emoji_1f6b9;
            case 0xe139: return R.drawable.emoji_1f6ba;
            case 0xe13a: return R.drawable.emoji_1f6bc;
            case 0xe13b: return R.drawable.emoji_1f489;
            case 0xe13c: return R.drawable.emoji_1f4a4;
            case 0xe13d: return R.drawable.emoji_26a1;
            case 0xe13e: return R.drawable.emoji_1f460;
            case 0xe13f: return R.drawable.emoji_1f6c0;
            case 0xe140: return R.drawable.emoji_1f6bd;
            case 0xe141: return R.drawable.emoji_1f50a;
            case 0xe142: return R.drawable.emoji_1f4e2;
            case 0xe143: return R.drawable.emoji_1f38c;
            case 0xe144: return R.drawable.emoji_1f50f;
            case 0xe145: return R.drawable.emoji_1f513;
            case 0xe146: return R.drawable.emoji_1f306;
            case 0xe147: return R.drawable.emoji_1f373;
            case 0xe148: return R.drawable.emoji_1f4c7;
            case 0xe149: return R.drawable.emoji_1f4b1;
            case 0xe14a: return R.drawable.emoji_1f4b9;
            case 0xe14b: return R.drawable.emoji_1f4e1;
            case 0xe14c: return R.drawable.emoji_1f4aa;
            case 0xe14d: return R.drawable.emoji_1f3e6;
            case 0xe14e: return R.drawable.emoji_1f6a5;
            case 0xe14f: return R.drawable.emoji_1f17f;
            case 0xe150: return R.drawable.emoji_1f68f;
            case 0xe151: return R.drawable.emoji_1f6bb;
            case 0xe152: return R.drawable.emoji_1f46e;
            case 0xe153: return R.drawable.emoji_1f3e3;
            case 0xe154: return R.drawable.emoji_1f3e7;
            case 0xe155: return R.drawable.emoji_1f3e5;
            case 0xe156: return R.drawable.emoji_1f3ea;
            case 0xe157: return R.drawable.emoji_1f3eb;
            case 0xe158: return R.drawable.emoji_1f3e8;
            case 0xe159: return R.drawable.emoji_1f68c;
            case 0xe15a: return R.drawable.emoji_1f695;
            case 0xe201: return R.drawable.emoji_1f6b6;
            case 0xe202: return R.drawable.emoji_1f6a2;
            case 0xe203: return R.drawable.emoji_1f201;
            case 0xe204: return R.drawable.emoji_1f49f;
            case 0xe205: return R.drawable.emoji_2734;
            case 0xe206: return R.drawable.emoji_2733;
            case 0xe207: return R.drawable.emoji_1f51e;
            case 0xe208: return R.drawable.emoji_1f6ad;
            case 0xe209: return R.drawable.emoji_1f530;
            case 0xe20a: return R.drawable.emoji_267f;
            case 0xe20b: return R.drawable.emoji_1f4f6;
            case 0xe20c: return R.drawable.emoji_2665;
            case 0xe20d: return R.drawable.emoji_2666;
            case 0xe20e: return R.drawable.emoji_2660;
            case 0xe20f: return R.drawable.emoji_2663;
            case 0xe210: return R.drawable.emoji_0023;
            case 0xe211: return R.drawable.emoji_27bf;
            case 0xe212: return R.drawable.emoji_1f195;
            case 0xe213: return R.drawable.emoji_1f199;
            case 0xe214: return R.drawable.emoji_1f192;
            case 0xe215: return R.drawable.emoji_1f236;
            case 0xe216: return R.drawable.emoji_1f21a;
            case 0xe217: return R.drawable.emoji_1f237;
            case 0xe218: return R.drawable.emoji_1f238;
            case 0xe219: return R.drawable.emoji_1f534;
            case 0xe21a: return R.drawable.emoji_1f532;
            case 0xe21b: return R.drawable.emoji_1f533;
            case 0xe21c: return R.drawable.emoji_0031;
            case 0xe21d: return R.drawable.emoji_0032;
            case 0xe21e: return R.drawable.emoji_0033;
            case 0xe21f: return R.drawable.emoji_0034;
            case 0xe220: return R.drawable.emoji_0035;
            case 0xe221: return R.drawable.emoji_0036;
            case 0xe222: return R.drawable.emoji_0037;
            case 0xe223: return R.drawable.emoji_0038;
            case 0xe224: return R.drawable.emoji_0039;
            case 0xe225: return R.drawable.emoji_0030;
            case 0xe226: return R.drawable.emoji_1f250;
            case 0xe227: return R.drawable.emoji_1f239;
            case 0xe228: return R.drawable.emoji_1f202;
            case 0xe229: return R.drawable.emoji_1f194;
            case 0xe22a: return R.drawable.emoji_1f235;
            case 0xe22b: return R.drawable.emoji_1f233;
            case 0xe22c: return R.drawable.emoji_1f22f;
            case 0xe22d: return R.drawable.emoji_1f23a;
            case 0xe22e: return R.drawable.emoji_1f446;
            case 0xe22f: return R.drawable.emoji_1f447;
            case 0xe230: return R.drawable.emoji_1f448;
            case 0xe231: return R.drawable.emoji_1f449;
            case 0xe232: return R.drawable.emoji_2b06;
            case 0xe233: return R.drawable.emoji_2b07;
            case 0xe234: return R.drawable.emoji_27a1;
            case 0xe235: return R.drawable.emoji_1f519;
            case 0xe236: return R.drawable.emoji_2197;
            case 0xe237: return R.drawable.emoji_2196;
            case 0xe238: return R.drawable.emoji_2198;
            case 0xe239: return R.drawable.emoji_2199;
            case 0xe23a: return R.drawable.emoji_25b6;
            case 0xe23b: return R.drawable.emoji_25c0;
            case 0xe23c: return R.drawable.emoji_23e9;
            case 0xe23d: return R.drawable.emoji_23ea;
            case 0xe23e: return R.drawable.emoji_1f52e;
            case 0xe23f: return R.drawable.emoji_2648;
            case 0xe240: return R.drawable.emoji_2649;
            case 0xe241: return R.drawable.emoji_264a;
            case 0xe242: return R.drawable.emoji_264b;
            case 0xe243: return R.drawable.emoji_264c;
            case 0xe244: return R.drawable.emoji_264d;
            case 0xe245: return R.drawable.emoji_264e;
            case 0xe246: return R.drawable.emoji_264f;
            case 0xe247: return R.drawable.emoji_2650;
            case 0xe248: return R.drawable.emoji_2651;
            case 0xe249: return R.drawable.emoji_2652;
            case 0xe24a: return R.drawable.emoji_2653;
            case 0xe24b: return R.drawable.emoji_26ce;
            case 0xe24c: return R.drawable.emoji_1f51d;
            case 0xe24d: return R.drawable.emoji_1f197;
            case 0xe24e: return R.drawable.emoji_00a9;
            case 0xe24f: return R.drawable.emoji_00ae;
            case 0xe250: return R.drawable.emoji_1f4f3;
            case 0xe251: return R.drawable.emoji_1f4f4;
            case 0xe252: return R.drawable.emoji_26a0;
            case 0xe253: return R.drawable.emoji_1f481;
            case 0xe301: return R.drawable.emoji_1f4c3;
            case 0xe302: return R.drawable.emoji_1f454;
            case 0xe303: return R.drawable.emoji_1f33a;
            case 0xe304: return R.drawable.emoji_1f337;
            case 0xe305: return R.drawable.emoji_1f33b;
            case 0xe306: return R.drawable.emoji_1f490;
            case 0xe307: return R.drawable.emoji_1f334;
            case 0xe308: return R.drawable.emoji_1f335;
            case 0xe309: return R.drawable.emoji_1f6be;
            case 0xe30a: return R.drawable.emoji_1f3a7;
            case 0xe30b: return R.drawable.emoji_1f376;
            case 0xe30c: return R.drawable.emoji_1f37b;
            case 0xe30d: return R.drawable.emoji_3297;
            case 0xe30e: return R.drawable.emoji_1f6ac;
            case 0xe30f: return R.drawable.emoji_1f48a;
            case 0xe310: return R.drawable.emoji_1f388;
            case 0xe311: return R.drawable.emoji_1f4a3;
            case 0xe312: return R.drawable.emoji_1f389;
            case 0xe313: return R.drawable.emoji_2702;
            case 0xe314: return R.drawable.emoji_1f380;
            case 0xe315: return R.drawable.emoji_3299;
            case 0xe316: return R.drawable.emoji_1f4bd;
            case 0xe317: return R.drawable.emoji_1f4e3;
            case 0xe318: return R.drawable.emoji_1f452;
            case 0xe319: return R.drawable.emoji_1f457;
            case 0xe31a: return R.drawable.emoji_1f461;
            case 0xe31b: return R.drawable.emoji_1f462;
            case 0xe31c: return R.drawable.emoji_1f484;
            case 0xe31d: return R.drawable.emoji_1f485;
            case 0xe31e: return R.drawable.emoji_1f486;
            case 0xe31f: return R.drawable.emoji_1f487;
            case 0xe320: return R.drawable.emoji_1f488;
            case 0xe321: return R.drawable.emoji_1f458;
            case 0xe322: return R.drawable.emoji_1f459;
            case 0xe323: return R.drawable.emoji_1f45c;
            case 0xe324: return R.drawable.emoji_1f3ac;
            case 0xe325: return R.drawable.emoji_1f514;
            case 0xe326: return R.drawable.emoji_1f3b6;
            case 0xe327: return R.drawable.emoji_1f493;
            case 0xe328: return R.drawable.emoji_1f48c;
            case 0xe329: return R.drawable.emoji_1f498;
            case 0xe32a: return R.drawable.emoji_1f499;
            case 0xe32b: return R.drawable.emoji_1f49a;
            case 0xe32c: return R.drawable.emoji_1f49b;
            case 0xe32d: return R.drawable.emoji_1f49c;
            case 0xe32e: return R.drawable.emoji_2728;
            case 0xe32f: return R.drawable.emoji_2b50;
            case 0xe330: return R.drawable.emoji_1f4a8;
            case 0xe331: return R.drawable.emoji_1f4a6;
            case 0xe332: return R.drawable.emoji_2b55;
            case 0xe333: return R.drawable.emoji_2716;
            case 0xe334: return R.drawable.emoji_1f4a2;
            case 0xe335: return R.drawable.emoji_1f31f;
            case 0xe336: return R.drawable.emoji_2754;
            case 0xe337: return R.drawable.emoji_2755;
            case 0xe338: return R.drawable.emoji_1f375;
            case 0xe339: return R.drawable.emoji_1f35e;
            case 0xe33a: return R.drawable.emoji_1f366;
            case 0xe33b: return R.drawable.emoji_1f35f;
            case 0xe33c: return R.drawable.emoji_1f361;
            case 0xe33d: return R.drawable.emoji_1f358;
            case 0xe33e: return R.drawable.emoji_1f35a;
            case 0xe33f: return R.drawable.emoji_1f35d;
            case 0xe340: return R.drawable.emoji_1f35c;
            case 0xe341: return R.drawable.emoji_1f35b;
            case 0xe342: return R.drawable.emoji_1f359;
            case 0xe343: return R.drawable.emoji_1f362;
            case 0xe344: return R.drawable.emoji_1f363;
            case 0xe345: return R.drawable.emoji_1f34e;
            case 0xe346: return R.drawable.emoji_1f34a;
            case 0xe347: return R.drawable.emoji_1f353;
            case 0xe348: return R.drawable.emoji_1f349;
            case 0xe349: return R.drawable.emoji_1f345;
            case 0xe34a: return R.drawable.emoji_1f346;
            case 0xe34b: return R.drawable.emoji_1f382;
            case 0xe34c: return R.drawable.emoji_1f371;
            case 0xe34d: return R.drawable.emoji_1f372;
            case 0xe401: return R.drawable.emoji_1f625;
            case 0xe402: return R.drawable.emoji_1f60f;
            case 0xe403: return R.drawable.emoji_1f614;
            case 0xe404: return R.drawable.emoji_1f601;
            case 0xe405: return R.drawable.emoji_1f609;
            case 0xe406: return R.drawable.emoji_1f623;
            case 0xe407: return R.drawable.emoji_1f616;
            case 0xe408: return R.drawable.emoji_1f62a;
            case 0xe409: return R.drawable.emoji_1f445;
            case 0xe40a: return R.drawable.emoji_1f606;
            case 0xe40b: return R.drawable.emoji_1f628;
            case 0xe40c: return R.drawable.emoji_1f637;
            case 0xe40d: return R.drawable.emoji_1f633;
            case 0xe40e: return R.drawable.emoji_1f612;
            case 0xe40f: return R.drawable.emoji_1f630;
            case 0xe410: return R.drawable.emoji_1f632;
            case 0xe411: return R.drawable.emoji_1f62d;
            case 0xe412: return R.drawable.emoji_1f602;
            case 0xe413: return R.drawable.emoji_1f622;
            case 0xe414: return R.drawable.emoji_263a;
            case 0xe415: return R.drawable.emoji_1f605;
            case 0xe416: return R.drawable.emoji_1f621;
            case 0xe417: return R.drawable.emoji_1f61a;
            case 0xe418: return R.drawable.emoji_1f618;
            case 0xe419: return R.drawable.emoji_1f440;
            case 0xe41a: return R.drawable.emoji_1f443;
            case 0xe41b: return R.drawable.emoji_1f442;
            case 0xe41c: return R.drawable.emoji_1f444;
            case 0xe41d: return R.drawable.emoji_1f64f;
            case 0xe41e: return R.drawable.emoji_1f44b;
            case 0xe41f: return R.drawable.emoji_1f44f;
            case 0xe420: return R.drawable.emoji_1f44c;
            case 0xe421: return R.drawable.emoji_1f44e;
            case 0xe422: return R.drawable.emoji_1f450;
            case 0xe423: return R.drawable.emoji_1f645;
            case 0xe424: return R.drawable.emoji_1f646;
            case 0xe425: return R.drawable.emoji_1f491;
            case 0xe426: return R.drawable.emoji_1f647;
            case 0xe427: return R.drawable.emoji_1f64c;
            case 0xe428: return R.drawable.emoji_1f46b;
            case 0xe429: return R.drawable.emoji_1f46f;
            case 0xe42a: return R.drawable.emoji_1f3c0;
            case 0xe42b: return R.drawable.emoji_1f3c8;
            case 0xe42c: return R.drawable.emoji_1f3b1;
            case 0xe42d: return R.drawable.emoji_1f3ca;
            case 0xe42e: return R.drawable.emoji_1f699;
            case 0xe42f: return R.drawable.emoji_1f69a;
            case 0xe430: return R.drawable.emoji_1f692;
            case 0xe431: return R.drawable.emoji_1f691;
            case 0xe432: return R.drawable.emoji_1f693;
            case 0xe433: return R.drawable.emoji_1f3a2;
            case 0xe434: return R.drawable.emoji_1f687;
            case 0xe435: return R.drawable.emoji_1f684;
            case 0xe436: return R.drawable.emoji_1f38d;
            case 0xe437: return R.drawable.emoji_1f49d;
            case 0xe438: return R.drawable.emoji_1f38e;
            case 0xe439: return R.drawable.emoji_1f393;
            case 0xe43a: return R.drawable.emoji_1f392;
            case 0xe43b: return R.drawable.emoji_1f38f;
            case 0xe43c: return R.drawable.emoji_1f302;
            case 0xe43d: return R.drawable.emoji_1f492;
            case 0xe43e: return R.drawable.emoji_1f30a;
            case 0xe43f: return R.drawable.emoji_1f367;
            case 0xe440: return R.drawable.emoji_1f387;
            case 0xe441: return R.drawable.emoji_1f41a;
            case 0xe442: return R.drawable.emoji_1f390;
            case 0xe443: return R.drawable.emoji_1f300;
            case 0xe444: return R.drawable.emoji_1f33e;
            case 0xe445: return R.drawable.emoji_1f383;
            case 0xe446: return R.drawable.emoji_1f391;
            case 0xe447: return R.drawable.emoji_1f343;
            case 0xe448: return R.drawable.emoji_1f385;
            case 0xe449: return R.drawable.emoji_1f305;
            case 0xe44a: return R.drawable.emoji_1f307;
            case 0xe44b: return R.drawable.emoji_1f303;
            //case 0xe44b: return R.drawable.emoji_1f30c;
            case 0xe44c: return R.drawable.emoji_1f308;
            case 0xe501: return R.drawable.emoji_1f3e9;
            case 0xe502: return R.drawable.emoji_1f3a8;
            case 0xe503: return R.drawable.emoji_1f3a9;
            case 0xe504: return R.drawable.emoji_1f3ec;
            case 0xe505: return R.drawable.emoji_1f3ef;
            case 0xe506: return R.drawable.emoji_1f3f0;
            case 0xe507: return R.drawable.emoji_1f3a6;
            case 0xe508: return R.drawable.emoji_1f3ed;
            case 0xe509: return R.drawable.emoji_1f5fc;
            case 0xe50b: return R.drawable.emoji_1f1ef_1f1f5;
            case 0xe50c: return R.drawable.emoji_1f1fa_1f1f8;
            case 0xe50d: return R.drawable.emoji_1f1eb_1f1f7;
            case 0xe50e: return R.drawable.emoji_1f1e9_1f1ea;
            case 0xe50f: return R.drawable.emoji_1f1ee_1f1f9;
            case 0xe510: return R.drawable.emoji_1f1ec_1f1e7;
            case 0xe511: return R.drawable.emoji_1f1ea_1f1f8;
            case 0xe512: return R.drawable.emoji_1f1f7_1f1fa;
            case 0xe513: return R.drawable.emoji_1f1e8_1f1f3;
            case 0xe514: return R.drawable.emoji_1f1f0_1f1f7;
            case 0xe515: return R.drawable.emoji_1f471;
            case 0xe516: return R.drawable.emoji_1f472;
            case 0xe517: return R.drawable.emoji_1f473;
            case 0xe518: return R.drawable.emoji_1f474;
            case 0xe519: return R.drawable.emoji_1f475;
            case 0xe51a: return R.drawable.emoji_1f476;
            case 0xe51b: return R.drawable.emoji_1f477;
            case 0xe51c: return R.drawable.emoji_1f478;
            case 0xe51d: return R.drawable.emoji_1f5fd;
            case 0xe51e: return R.drawable.emoji_1f482;
            case 0xe51f: return R.drawable.emoji_1f483;
            case 0xe520: return R.drawable.emoji_1f42c;
            case 0xe521: return R.drawable.emoji_1f426;
            case 0xe522: return R.drawable.emoji_1f420;
            case 0xe523: return R.drawable.emoji_1f423;
            case 0xe524: return R.drawable.emoji_1f439;
            case 0xe525: return R.drawable.emoji_1f41b;
            case 0xe526: return R.drawable.emoji_1f418;
            case 0xe527: return R.drawable.emoji_1f428;
            case 0xe528: return R.drawable.emoji_1f412;
            case 0xe529: return R.drawable.emoji_1f411;
            case 0xe52a: return R.drawable.emoji_1f43a;
            case 0xe52b: return R.drawable.emoji_1f42e;
            case 0xe52c: return R.drawable.emoji_1f430;
            case 0xe52d: return R.drawable.emoji_1f40d;
            case 0xe52e: return R.drawable.emoji_1f414;
            case 0xe52f: return R.drawable.emoji_1f417;
            case 0xe530: return R.drawable.emoji_1f42b;
            case 0xe531: return R.drawable.emoji_1f438;
            case 0xe532: return R.drawable.emoji_1f170;
            case 0xe533: return R.drawable.emoji_1f171;
            case 0xe534: return R.drawable.emoji_1f18e;
            case 0xe535: return R.drawable.emoji_1f17e;
            case 0xe536: return R.drawable.emoji_1f43e;
            case 0xe537: return R.drawable.emoji_2122;
        }

        return 0;
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context the calling context
     * @param text input text
     * @param emojiSize size of the emoji in pixels
     * @param emojiAlignment alignment of the emoji (bottom or baseline)
     * @param textSize size of the text in pixels
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context the calling context
     * @param text input text
     * @param emojiSize size of the emoji in pixels
     * @param emojiAlignment alignment of the emoji (bottom or baseline)
     * @param textSize size of the text in pixels
     * @param index the index of the cursor
     * @param length the length of the text
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, index, length, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context the calling context
     * @param text input text
     * @param emojiSize size of the emoji in pixels
     * @param emojiAlignment alignment of the emoji (bottom or baseline)
     * @param textSize size of the text in pixels
     * @param useSystemDefault boolean that indicates if stock emojis should be used
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, boolean useSystemDefault) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, useSystemDefault);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context the calling context
     * @param text input text
     * @param emojiSize size of the emoji in pixels
     * @param emojiAlignment alignment of the emoji (bottom or baseline)
     * @param textSize size of the text in pixels
     * @param index the index of the cursor
     * @param length the length of the text
     * @param useSystemDefault boolean that indicates if stock emojis should be used
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length, boolean useSystemDefault) {
        if (useSystemDefault) {
            return;
        }

        int textLength = text.length();
        int textLengthToProcessMax = textLength - index;
        int textLengthToProcess = length < 0 || length >= textLengthToProcessMax ? textLength : (length + index);

        // remove spans throughout all text
        EmojiSpan[] oldSpans = text.getSpans(0, textLength, EmojiSpan.class);
        for (int i = 0; i < oldSpans.length; i++) {
            text.removeSpan(oldSpans[i]);
        }

        int skip;
        int icon;
        for (int i = index; i < textLengthToProcess; i += skip) {
            char c = text.charAt(i);
            if(c > ' ' && c < '~') { // ascii
                skip = 1;
                continue;
            }

            skip = 0;
            icon = 0;
            if (isSoftBankEmoji(c)) {
                icon = getSoftbankEmojiResource(c);
                skip = icon == 0 ? 0 : 1;
            }

            if (icon == 0) {
                int unicode = Character.codePointAt(text, i);
                skip = Character.charCount(unicode);

                if (unicode > 0xff) {
                    icon = getEmojiResource(context, unicode);
                }

                if (i + skip < textLengthToProcess) {
                    int followUnicode = Character.codePointAt(text, i + skip);
                    //Non-spacing mark (Combining mark)
                    if (followUnicode == 0xfe0f) {
                        int followSkip = Character.charCount(followUnicode);
                        if (i + skip + followSkip < textLengthToProcess) {

                            int nextFollowUnicode = Character.codePointAt(text, i + skip + followSkip);
                            if (nextFollowUnicode == 0x20e3) {
                                int nextFollowSkip = Character.charCount(nextFollowUnicode);
                                int tempIcon = getKeyCapEmoji(unicode);

                                if (tempIcon == 0) {
                                    followSkip = 0;
                                    nextFollowSkip = 0;
                                } else {
                                    icon = tempIcon;
                                }
                                skip += (followSkip + nextFollowSkip);
                            }
                        }
                    } else if (followUnicode == 0x20e3) {
                        //some older versions of iOS don't use a combining character, instead it just goes straight to the second part
                        int followSkip = Character.charCount(followUnicode);

                        int tempIcon = getKeyCapEmoji(unicode);
                        if (tempIcon == 0) {
                            followSkip = 0;
                        } else {
                            icon = tempIcon;
                        }
                        skip += followSkip;

                    } else {
                        //handle other emoji modifiers
                        int followSkip = Character.charCount(followUnicode);

                        //TODO seems like we could do this for every emoji type rather than having that giant static map, maybe this is too slow?
                        String hexUnicode = Integer.toHexString(unicode);
                        String hexFollowUnicode = Integer.toHexString(followUnicode);

                        String resourceName = "emoji_" + hexUnicode + "_" + hexFollowUnicode;

                        int resourceId = 0;
                        if (sEmojisModifiedMap.containsKey(resourceName)) {
                            resourceId = sEmojisModifiedMap.get(resourceName);
                        } else {
                            resourceId = context.getResources().getIdentifier(resourceName, "drawable", context.getApplicationContext().getPackageName());
                            if (resourceId != 0) {
                                sEmojisModifiedMap.put(resourceName, resourceId);
                            }
                        }

                        if (resourceId == 0) {
                            followSkip = 0;
                        } else {
                            icon = resourceId;
                        }
                        skip += followSkip;
                    }
                }
            }

            if (icon > 0) {
                text.setSpan(new EmojiSpan(context, icon, emojiSize, emojiAlignment, textSize), i, i + skip, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }

    private static int getKeyCapEmoji(int unicode) {
        int icon = 0;
        switch (unicode) {
            case 0x0023:
                icon = R.drawable.emoji_0023;
                break;
            case 0x002a:
                icon = R.drawable.emoji_002a_20e3;
                break;
            case 0x0030:
                icon = R.drawable.emoji_0030;
                break;
            case 0x0031:
                icon = R.drawable.emoji_0031;
                break;
            case 0x0032:
                icon = R.drawable.emoji_0032;
                break;
            case 0x0033:
                icon = R.drawable.emoji_0033;
                break;
            case 0x0034:
                icon = R.drawable.emoji_0034;
                break;
            case 0x0035:
                icon = R.drawable.emoji_0035;
                break;
            case 0x0036:
                icon = R.drawable.emoji_0036;
                break;
            case 0x0037:
                icon = R.drawable.emoji_0037;
                break;
            case 0x0038:
                icon = R.drawable.emoji_0038;
                break;
            case 0x0039:
                icon = R.drawable.emoji_0039;
                break;
            default:
                break;
        }
        return icon;
    }

}
