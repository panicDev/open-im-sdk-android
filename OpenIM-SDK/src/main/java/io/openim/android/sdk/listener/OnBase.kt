package io.openim.android.sdk.listener

/**
 * API callback interface
 */
interface OnBase<T> {
    /**
     * Called when the operation fails
     */
    fun onError(code: Int, error: String) {}

    /**
     * Called when the operation succeeds
     */
    fun onSuccess(data: T) {}
}
