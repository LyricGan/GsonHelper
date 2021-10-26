package com.lyricgan.gson;

import com.google.gson.Gson;

/**
 * @author Lyric Gan
 */
public class GsonHelper {
    private Gson mGson;

    private static class Holder {
        private static final GsonHelper INSTANCE = new GsonHelper();
    }

    private GsonHelper() {
        if (mGson == null) {
            mGson = GsonCompat.build();
        }
    }

    public static GsonHelper getInstance() {
        return Holder.INSTANCE;
    }

    public Gson getGson() {
        return mGson;
    }
}
