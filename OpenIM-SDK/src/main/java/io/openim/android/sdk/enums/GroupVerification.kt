package io.openim.android.sdk.enums

/**
 * 进群验证方式
 */
object GroupVerification {
    /** 申请需要同意 邀请直接进 */
    const val APPLY_NEED_VERIFICATION_INVITE_DIRECTLY = 0
    /** 所有人进群需要验证，除了群主管理员邀 */
    const val ALL_NEED_VERIFICATION = 1
    /** 直接进群 */
    const val DIRECTLY = 2
}
