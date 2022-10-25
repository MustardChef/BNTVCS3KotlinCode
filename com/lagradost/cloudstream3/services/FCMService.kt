package com.lagradost.cloudstream3.services

import android.util.Log
import kotlin.jvm.internal.Intrinsics

/* compiled from: FCMService.kt */
@Metadata(
    m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000cH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"],
    m107d2 = ["Lcom/lagradost/cloudstream3/services/FCMService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "handleNow", "", "map", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "sendRegistrationToServer", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class FCMService : FirebaseMessagingService() {
    private var TAG = "DuongKK"
    fun getTAG(): String {
        return TAG
    }

    fun setTAG(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        TAG = str
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    override fun onNewToken(token: String) {
        Intrinsics.checkNotNullParameter(token, "token")
        val str = TAG
        Log.d(str, "Refreshed token: $token")
        sendRegistrationToServer(token)
    }

    private fun sendRegistrationToServer(str: String) {
        LogUtils.m6080d("sendRegistrationToServer = $str", *arrayOfNulls<Object>(0))
        val companion: AppController = AppController.Companion.getInstance()
        if (companion != null) {
            companion.setTokenFCM(str)
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage")
        LogUtils.m6080d(TAG, "onMessageReceived:=====> ")
        val str = TAG
        LogUtils.m6080d(str, "From: " + remoteMessage.getFrom())
        val data: Map<String, String> = remoteMessage.getData()
        if ((if (data != null) Integer.valueOf(data.size()) else null).intValue() > 0) {
            val str2 = TAG
            LogUtils.m6080d(str2, "Message data payload: " + remoteMessage.getData())
            val data2: Map<String, String> = remoteMessage.getData()
            Intrinsics.checkNotNullExpressionValue(data2, "remoteMessage.getData()")
            handleNow(data2)
        }
        if (remoteMessage.getNotification() != null) {
            val str3 = TAG
            val objArr: Array<Object> = arrayOfNulls<Object>(1)
            val sb = StringBuilder()
            sb.append("Message Notification Body: ")
            val notification: RemoteMessage.Notification = remoteMessage.getNotification()
            sb.append(if (notification != null) notification.getBody() else null)
            objArr[0] = sb.toString()
            LogUtils.m6080d(str3, *objArr)
        }
    }

    private fun handleNow(map: Map<String, String>) {
        LogUtils.m6080d("New Notification ====> handleNow()", *arrayOfNulls<Object>(0))
    }
}