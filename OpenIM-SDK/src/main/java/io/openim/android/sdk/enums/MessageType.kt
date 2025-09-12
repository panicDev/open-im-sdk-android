package io.openim.android.sdk.enums

/**
 * 消息类型
 */
object MessageType {
    const val TEXT = 101
    const val PICTURE = 102
    const val VOICE = 103
    const val VIDEO = 104
    const val FILE = 105
    const val AT_TEXT = 106
    const val MERGER = 107
    const val CARD = 108
    const val LOCATION = 109
    const val CUSTOM = 110
    const val HAS_READ_RECEIPT = 112
    const val TYPING = 113
    const val QUOTE = 114
    const val CUSTOM_FACE = 115
    const val GROUP_HAS_READ_RECEIPT = 116
    const val ADVANCED_TEXT = 117
    const val CUSTOM_MSG_NOT_TRIGGER_CONVERSATION = 119
    const val CUSTOM_MSG_ONLINE_ONLY = 120
    const val NTF_BEGIN = 1000
    const val FRIEND_NTF_BEGIN = 1200
    const val FRIEND_APPLICATION_APPROVED_NTF = 1201
    const val FRIEND_APPLICATION_REJECTED_NTF = 1202
    const val FRIEND_APPLICATION_NTF = 1203
    const val FRIEND_ADDED_NTF = 1204
    const val FRIEND_DELETED_NTF = 1205
    const val FRIEND_REMARK_SET_NTF = 1206
    const val BLACK_ADDED_NTF = 1207
    const val BLACK_DELETED_NTF = 1208
    const val FRIEND_NTF_END = 1299
    const val CONVERSATION_CHANGE_NTF = 1300
    const val USER_NTF_BEGIN = 1301
    const val USERINFO_UPDATED_NTF = 1303
    const val USER_NTF_END = 1399
    const val OA_NTF = 1400
    const val GROUP_NTF_BEGIN = 1500
    const val GROUP_CREATED_NTF = 1501
    const val GROUP_INFO_SET_NTF = 1502
    const val JOIN_GROUP_APPLICATION_NTF = 1503
    const val MEMBER_QUIT_NTF = 1504
    const val GROUP_APPLICATION_ACCEPTED_NTF = 1505
    const val GROUP_APPLICATION_REJECTED_NTF = 1506
    const val GROUP_OWNER_TRANSFERRED_NTF = 1507
    const val MEMBER_KICKED_NTF = 1508
    const val MEMBER_INVITED_NTF = 1509
    const val MEMBER_ENTER_NTF = 1510
    const val GROUP_DISBAND_NTF = 1511
    const val GROUP_NTF_END = 1599
    const val GROUP_MEMBER_MUTED_NTF = 1512
    const val GROUP_MEMBER_CANCEL_MUTED_NTF = 1513
    const val GROUP_MUTED_NTF = 1514
    const val GROUP_CANCEL_MUTED_NTF = 1515
    const val GROUP_MEMBER_INFO_CHANGED_NTF = 1516
    const val GROUP_ANNOUNCEMENT_NTF = 1519
    const val GROUP_NAME_CHANGED_NTF = 1520
    const val SIGNALING_NTF_BEGIN = 1600
    const val SIGNALING_NTF = 1601
    const val SIGNALING_NTF_END = 1699
    const val BURN_AFTER_READING_NTF = 1701
    const val NTF_END = 2000
    const val REVOKE_MESSAGE_NTF = 2101
}
