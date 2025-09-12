package io.openim.android.sdk.models;

import io.openim.android.sdk.utils.CommonUtil;

public class PutArgs {
    /**
     * Local file path
     */
    public String filepath;
    /**
     * File name
     */
    public String name;

    /**
     * Type
     */
    public String cuase;

    public PutArgs(String filepath) {
        this.filepath = filepath;
        this.name = filepath;
    }
}
