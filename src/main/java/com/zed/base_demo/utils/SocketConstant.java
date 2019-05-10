package com.zed.base_demo.utils;/** * @author:Zed * @date: 2019/5/9 */public class SocketConstant {    /**     * 客户端连接时传递id的参数key,对于客服来说id,对于客户来说用于携带用户名     */    public static final String CONNECT_ID = "id";    /**     * 客户端连接时传递通信密码的参数key,用于鉴权     */    public static final String PWD_CONNECT = "pd";    /**     * 客户端连接时传递socketClientType的参数key,用于区分客服和客户     */    public static final String SOCKET_CLIENT_TYPE = "sct";    /**     * 客户端连接时传递客户端ID的参数key     */    public static final String CLIENT_ID = "clientId";    /**     * 客户端连接时传递租户代号的参数key     */    public static final String TENANT_CODE = "tc";    /**     * 客户端连接时传递房间ID的参数key     */    public static final String ROOM_ID = "ri";    /**     * 客户端连接时传递一个时间戳的参数key     */    public static final String CONNECT_TIME = "ct";    /**     * 用户名称     */    public static final String CUSTOMER_NAME = "cn";    /**     * 用户信息（充值流水信息）     */    public static final String CUSTOMER_IS_SPEAK = "cis";    /**     * 用户账号     */    public static final String ACCOUNT = "account";    public static final String IS_BACKEND = "isBackend";    /**     * 是否跟单     */    public static final String BET_SHARE = "BetShare";    /**     * 消息记录ID     */    public static final String CHAT_RECORD_ID = "chatRecordId";    /******************************************事件 start***************************************************/    /**     * 点对点通信事件     */    public static final String P2P_MESSAGE_EVENT = "p2pMessageEvent";    /**     * 消息发送成功事件     */    public static final String MESSAGE_SEND_SUCCESS = "messageSendSuccess";    /**     * 消息发送失败事件     */    public static final String MESSAGE_SEND_FAIL = "messageSendFail";    /**     * 消息接受者不在线事件     */    public static final String TARGET_OFFLINE_EVENT = "targetOfflineEvent";    /**     * 消息接受者不存在事件     */    public static final String TARGET_NOT_EXIST_EVENT = "targetNotExistEvent";    /**     * 客户端连接信息不存在事件     */    public static final String CLIENT_CONNECT_INFO_NOT_EXIST = "clientConnectInfoNotExist";    /**     * 房间不存在事件     */    public static final String SOCKET_ROOM_NOT_EXIST = "socketRoomNotExist";    /**     * 客户连接事件     */    public static final String CUSTOMER_CONNECT = "customerConnect";    /**     * 客服获取之前联系的客户事件     */    public static final String GET_HISTORY_CUSTOMER = "getHistoryCustomer";    /**     * 创建公共聊天室     */    public static final String CREATE_PUBLIC_CHAT_ROOM = "createPublicChatRoom";    /**     * 加入公共聊天室     */    public static final String JION_PUBLIC_CHAT_ROOM = "jionPublicChatRoom";    /**     * 房间配置更新事件     */    public static final String CHAT_ROOM_UPDATE = "chatRoomUpdate";    /**     * 禁言事件     */    public static final String CHAT_BANNED = "chatBanned";    /**     * 建立连接获取历史聊天记录事件     */    public static final String GET_HISTORY_MSGINFO = "getHistoryMsgInfo";    /**     * 建立连接获取历史聊天记录事件     */    public static final String PULL_HISTORY_MSGINFO = "pullHistoryMsgInfo";    /**     * 客户进入房间事件     */    public static final String CS_INTO_ROOM = "csIntoRoom";    /**     * 客户和客服在房间中交流事件     */    public static final String CS_CHAT_C = "csChatC";    /**     * 客户端创建房间事件     */    public static final String CS_CREATE_ROOM = "csCreateRoom";    /**     * 客户和客服在房间中交流事件     */    public static final String CS_CHAT_BACK = "csChatBack";    /**     * 客户断开连接事件     */    public static final String CUSTOMER_LEAVE = "customerLeave";    /**     * 无可用客服事件     */    public static final String NOT_EXIST_AVAILABLE_CS = "notExistAvailableCS";    /**     * 客户连接因为缺少必要参数导致连接失败事件     */    public static final String CONNECT_FAIL_BY_NON_PARAM = "connectFailByNonParam";    /**     * 创建房间结果事件     */    public static final String CREATE_ROOM_RESULT = "createRoomResult";    /**     * 消息发送失败因为缺少必要参数     */    public static final String SEND_MSG_FAIL_BY_NON_PARAM = "sendMsgFailByNonParam";    /**     * 房间信息事件     */    public static final String SOCKET_ROOM_INFO = "socketRoomInfo";    /**     * 客服结束对话事件     */    public static final String END_CHAT = "endChat";    /**     * 客服离开房间事件     */    public static final String LEAVE_ROOM = "leaveRoom";    /**     * 客服连接成功之后推送联系的房间信息给客服事件     */    public static final String CONTACTS_ROOM_INFO = "contactsRoomInfo";    /**     * 客服转接事件     */    public static final String TRANSFER = "transfer";    /**     * 客服转接成功事件     */    public static final String TRANSFER_SUCCESS = "transferSuccess";    /**     * 客服转接失败事件     */    public static final String TRANSFER_FAIL = "transferFail";    /**     * 客服发送内部消息事件     */    public static final String CUSTOMER_ROOM_INNER_MSG = "customerRoomInnerMsg";    /**     * 客服邀请其他客服进入房间事件     */    public static final String CS_INVITE_CS = "CSInviteCS";    /**     * 客服邀请其他客服进入房间成功事件     */    public static final String CS_INVITE_CS_SUCCESS = "CSInviteCSSuccess";    /**     * 文件上传事件     */    public static final String FILE_UPLOAD_EVENT = "fileUploadEvent";    /**     * 连接超时事件     */    public static final String TIME_OUT_EVENT = "timeOutEvent";    /**     * 第二次登录相同账号，先前登录的强制下线     */    public static final String KICK_OUT = "kickOutEvent";    /**     * 管理员踢出用户     */    public static final String ADMIN_KICK_OUT = "adminKickOutEvent";    /**     * 通知前台删除对应的消息事件     */    public static final String RECALL = "recall";    /**     * 删除消息     */    public static final String DELETE_CHAT_RECORD = "deleteChatRecord";}