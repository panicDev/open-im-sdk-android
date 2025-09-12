package io.openim.android.sdk.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken

object JsonUtil {
    private val gson: Gson = Gson()

    fun toString(obj: Any?): String {
        var gsonString = ""
        try {
            if (obj != null) {
                gsonString = gson.toJson(obj)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return gsonString
    }

    fun toStringWithoutNull(obj: Any?): String {
        var gsonString = ""
        try {
            if (obj != null) {
                gsonString = GsonBuilder().create().toJson(obj)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return gsonString
    }

    fun <T> toObj(gsonString: String?, cls: Class<T>): T? {
        var t: T? = null
        try {
            if (gsonString != null) {
                t = gson.fromJson(gsonString, cls)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return t
    }

    fun <T> toArray(json: String?, cls: Class<T>): List<T> {
        val list = ArrayList<T>()
        try {
            if (json != null) {
                val array: JsonArray = JsonParser.parseString(json).asJsonArray
                for (elem in array) {
                    list.add(gson.fromJson(elem, cls))
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return list
    }

    fun <T> toListMaps(gsonString: String?): List<Map<String, T>>? {
        return if (gsonString != null) gson.fromJson(gsonString, object : TypeToken<List<Map<String, T>>>() {}.type) else null
    }

    fun <T> toMaps(gsonString: String?): Map<String, T>? {
        return if (gsonString != null) gson.fromJson(gsonString, object : TypeToken<Map<String, T>>() {}.type) else null
    }
}
