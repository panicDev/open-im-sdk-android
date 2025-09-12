package io.openim.android.sdk.enums

/**
 * Group entry verification methods
 */
object GroupVerification {
    /** Application requires approval; invitations join directly */
    const val APPLY_NEED_VERIFICATION_INVITE_DIRECTLY = 0
    /** Everyone needs verification except owner/admin invitations */
    const val ALL_NEED_VERIFICATION = 1
    /** Join directly */
    const val DIRECTLY = 2
}
