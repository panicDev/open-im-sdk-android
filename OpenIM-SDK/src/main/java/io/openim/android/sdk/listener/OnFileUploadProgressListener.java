package io.openim.android.sdk.listener;


/**
 * File upload progress listener
 */
public interface OnFileUploadProgressListener extends OnBase<String> {
    /**
     * Upload failed
     */
    default void onError(int code, String error){}

    /**
     * Upload progress
     */
    default void onProgress(long progress){}

    /**
     * Upload succeeded
     */
    default void onSuccess(String s){}
}
