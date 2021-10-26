package com.lyricgan.gson.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.lyricgan.gson.Utils;

import java.io.IOException;

/**
 * 自定义json浮点型数据解析
 * @author Lyric Gan
 */
public class FloatTypeAdapter extends TypeAdapter<Float> {

    @Override
    public void write(JsonWriter out, Float value) throws IOException {
        out.value(value);
    }

    @Override
    public Float read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return 0.0f;
        }
        return Utils.parseFloat(in.nextString(), 0.0f);
    }
}
