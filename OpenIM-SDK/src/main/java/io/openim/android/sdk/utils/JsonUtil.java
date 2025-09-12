package io.openim.android.sdk.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    private static final Gson gson = new Gson();

    /**
     * Convert an object to a JSON string
     */
    public static String toString(Object object) {
        String gsonString = "";
        try {
            if (null != object) {
                gsonString = gson.toJson(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gsonString;
    }

    /**
     * Convert an object to a JSON string without null values
     */
    public static String toStringWithoutNull(Object object) {
        String gsonString = "";
        try {
            if (null != object) {
                gsonString = new GsonBuilder().create().toJson(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gsonString;
    }


    /**
     * Convert a JSON string to a generic bean
     */
    public static <T> T toObj(String gsonString, Class<T> cls) {
        T t = null;
        try {
            if (null != gsonString) {
                t = gson.fromJson(gsonString, cls);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }


    /**
     * Convert to list
     * Generic type erasure at compile time causes errors
     * @param gsonString JSON string
     * @param cls Class type
     * @return List of type T
     */
//    public static <T> List<T> GsonToList(String gsonString, Class<T> cls) {
//        List<T> list = null;
//        if (gson != null) {
//            list = gson.fromJson(gsonString, new TypeToken<List<T>>() {
//            }.getType());
//        }
//        return list;
//    }

    /**
     * Convert to list and resolve generic type erasure issue
     */
    public static <T> List<T> toArray(String json, Class<T> cls) {
        List<T> list = null;
        try {
            if (null != json) {
                list = new ArrayList<T>();
                JsonArray array = JsonParser.parseString(json).getAsJsonArray();
                for (final JsonElement elem : array) {
                    list.add(gson.fromJson(elem, cls));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    /**
     * Convert to a list containing maps
     */
    public static <T> List<Map<String, T>> toListMaps(String gsonString) {
        List<Map<String, T>> list = null;
        if (null != gsonString) {
            list = gson.fromJson(gsonString,
                new TypeToken<List<Map<String, T>>>() {
                }.getType());
        }
        return list;
    }


    /**
     * Convert to a map
     */
    public static <T> Map<String, T> toMaps(String gsonString) {
        Map<String, T> map = null;
        if (null != gsonString) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }
}
