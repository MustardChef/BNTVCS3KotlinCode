package com.lagradost.cloudstream3.utils

import android.app.Notification
import androidx.work.Data
import com.anggrayudi.storage.file.MimeType
import com.google.common.net.HttpHeaders
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001:\u0018\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u000bH\u0002J\u0081\u0001\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010C\u001a\u00020D2\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010I\u001a\u0004\u0018\u00010\u000b2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020,2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0018\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020Q0P2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010TJC\u0010U\u001a\u00020\u00042\u0006\u0010C\u001a\u00020D2\u0006\u0010V\u001a\u00020\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010X\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0002\u0010[J\u0018\u0010\\\u001a\u0002022\u0006\u0010C\u001a\u00020D2\u0006\u0010]\u001a\u00020\u0004H\u0002J\u0016\u0010^\u001a\u0002022\u0006\u0010C\u001a\u00020D2\u0006\u0010]\u001a\u00020\u0004J/\u0010_\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020D2\u0018\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020Q0P¢\u0006\u0002\u0010`J\u000e\u0010a\u001a\u00020Q2\u0006\u0010C\u001a\u00020DJT\u0010b\u001a\u00020Q2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010J\u001a\u00020K2\u000c\u0010c\u001a\b\u0012\u0004\u0012\u00020e0d2\u0018\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020Q0PJ8\u0010f\u001a\u00020Q2\u0006\u0010C\u001a\u00020D2\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010J\u001a\u00020K2\u000c\u0010c\u001a\b\u0012\u0004\u0012\u00020e0dJ:\u0010g\u001a\u00020Q2\u0006\u0010C\u001a\u00020D2\u0006\u0010h\u001a\u00020(2\u0018\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020Q0P2\b\b\u0002\u0010i\u001a\u000202J\u0016\u0010j\u001a\u00020Q2\u0006\u0010C\u001a\u00020D2\u0006\u0010h\u001a\u00020(JW\u0010k\u001a\u00020\u00042\u0006\u0010C\u001a\u00020D2\u0006\u0010l\u001a\u00020e2\u0006\u0010V\u001a\u00020\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u00042\b\u0010m\u001a\u0004\u0018\u00010\u00042\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020Q0oH\u0002¢\u0006\u0002\u0010qJX\u0010r\u001a\u00020\u00042\u0006\u0010C\u001a\u00020D2\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010J\u001a\u00020K2\u0006\u0010l\u001a\u00020e2\u0018\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020Q0P2\b\b\u0002\u0010s\u001a\u000202H\u0002J[\u0010t\u001a\u00020\u00042\u0006\u0010C\u001a\u00020D2\u0006\u0010l\u001a\u00020u2\u0006\u0010V\u001a\u00020\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010s\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u00042\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020Q0o¢\u0006\u0002\u0010vJ\u0018\u0010w\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000bH\u0002J\b\u0010x\u001a\u0004\u0018\u00010BJ\u001a\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010C\u001a\u00020D2\u0006\u0010]\u001a\u00020\u0004H\u0002J\u0018\u0010{\u001a\u0004\u0018\u00010z2\u0006\u0010C\u001a\u00020D2\u0006\u0010]\u001a\u00020\u0004J\u0018\u0010|\u001a\u0004\u0018\u00010(2\u0006\u0010C\u001a\u00020D2\u0006\u0010]\u001a\u00020\u0004J\u000e\u0010}\u001a\u00020,2\u0006\u0010]\u001a\u00020\u0004J\u0016\u0010~\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\u0006\u0010\u007f\u001a\u00020KJ7\u0010~\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0003\u0010\u0083\u0001J7\u0010\u0084\u0001\u001a\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u0085\u00010\u001f\u0018\u00010d2\u0006\u0010C\u001a\u00020D2\u0007\u0010\u0086\u0001\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000bJ\u0013\u0010\u0087\u0001\u001a\u00020\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000bH\u0003J\u000f\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000bJ\t\u0010\u0089\u0001\u001a\u00020QH\u0002J2\u0010\u008a\u0001\u001a\u00030\u008b\u00012\u0006\u0010C\u001a\u00020D2\u0006\u0010V\u001a\u00020\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010s\u001a\u000202J\u001a\u0010\u008c\u0001\u001a\u00020Q2\u0006\u0010C\u001a\u00020D2\u0007\u0010\u008d\u0001\u001a\u00020\u000bH\u0002J\r\u0010\u008e\u0001\u001a\u00020Q*\u00020DH\u0002J\u001b\u0010\u008f\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001f*\u00020DJ#\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0085\u0001*\u00030\u0091\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000bH\u0003J,\u0010\u0093\u0001\u001a\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u0085\u00010\u001f\u0018\u00010d*\u00030\u0091\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u000bH\u0003J \u0010\u0094\u0001\u001a\u0004\u0018\u00010$*\u00030\u0091\u00012\b\u0010\u0095\u0001\u001a\u00030\u0085\u0001H\u0007¢\u0006\u0003\u0010\u0096\u0001J\u000b\u0010\u0097\u0001\u001a\u00020\u0004*\u00020uJ\u0018\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0016*\u00020D2\u0007\u0010\u0099\u0001\u001a\u00020\u000bH\u0002J%\u0010\u009a\u0001\u001a\u0004\u0018\u00010B*\u00020B2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000b2\t\b\u0002\u0010\u009c\u0001\u001a\u000202H\u0002J\r\u0010\u009d\u0001\u001a\u000202*\u0004\u0018\u00010BJ\u000b\u0010\u009e\u0001\u001a\u00020$*\u00020BR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR)\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#0\u001b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,0\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R#\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,0\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0010\u0010=\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006«\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager;", "", "()V", "ERROR_CONNECTION_ERROR", "", "ERROR_CONTENT_RESOLVER_NOT_FOUND", "ERROR_CREATE_FILE", "ERROR_DELETING_FILE", "ERROR_TOO_SMALL_CONNECTION", "ERROR_UNKNOWN", "KEY_DOWNLOAD_INFO", "", "KEY_RESUME_PACKAGES", "KEY_RESUME_QUEUE_PACKAGES", "SUCCESS_DOWNLOAD_DONE", "SUCCESS_STOPPED", "SUCCESS_STREAM", "USER_AGENT", "WORK_KEY_INFO", "WORK_KEY_PACKAGE", "cachedBitmaps", "Ljava/util/HashMap;", "Landroid/graphics/Bitmap;", "Lkotlin/collections/HashMap;", "currentDownloads", "", "downloadDeleteEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "getDownloadDeleteEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "downloadEvent", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadActionType;", "getDownloadEvent", "downloadProgressEvent", "Lkotlin/Triple;", "", "getDownloadProgressEvent", "downloadQueue", "Ljava/util/LinkedList;", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadResumePackage;", "getDownloadQueue", "()Ljava/util/LinkedList;", "downloadStatus", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "getDownloadStatus", "()Ljava/util/HashMap;", "downloadStatusEvent", "getDownloadStatusEvent", "hasCreatedNotChanel", "", "imgDone", "imgDownloading", "imgError", "imgPaused", "imgStopped", "maxConcurrentDownloads", "getMaxConcurrentDownloads", "()I", "setMaxConcurrentDownloads", "(I)V", "pressToPauseIcon", "pressToResumeIcon", "pressToStopIcon", "reservedChars", "basePathToFile", "Lcom/hippo/unifile/UniFile;", "context", "Landroid/content/Context;", "path", "createNotification", "Landroid/app/Notification;", "source", "linkName", "ep", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", ServerProtocol.DIALOG_PARAM_STATE, "progress", "total", "notificationCallback", "Lkotlin/Function2;", "", "hlsProgress", "hlsTotal", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;JJLkotlin/jvm/functions/Function2;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "name", "folder", ShareConstants.MEDIA_EXTENSION, "parentId", "basePath", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/hippo/unifile/UniFile;)I", "deleteFile", "id", "deleteFileAndUpdateSettings", "downloadCheck", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)Ljava/lang/Integer;", "downloadCheckUsingWorker", "downloadEpisode", "links", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "downloadEpisodeUsingWorker", "downloadFromResume", "pkg", "setKey", "downloadFromResumeUsingWorker", "downloadHLS", "link", "startIndex", "createNotificationCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$CreateNotificationMetadata;", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/utils/ExtractorLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)I", "downloadSingleEpisode", "tryResume", "downloadThing", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$IDownloadableMinimum;", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$IDownloadableMinimum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;)I", "getDisplayName", "getDownloadDir", "getDownloadFileInfo", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadedFileInfoResult;", "getDownloadFileInfoAndUpdateSettings", "getDownloadResumePackage", "getDownloadState", "getFileName", TtmlNode.TAG_METADATA, "epName", "episode", "season", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "getFolder", "Landroid/net/Uri;", "relativePath", "getRelativePath", "sanitizeFilename", "saveQueue", "setupStream", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$StreamData;", "startWork", SDKConstants.PARAM_KEY, "createNotificationChannel", "getBasePath", "getExistingDownloadUriOrNullQ", "Landroid/content/ContentResolver;", "displayName", "getExistingFolderStartName", "getFileLength", "fileUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Long;", "getId", "getImageBitmapFromUrl", "url", "gotoDir", "directoryName", "createMissingDirectories", "isDownloadDir", "size", "CreateNotificationMetadata", "DownloadActionType", "DownloadEpisodeMetadata", "DownloadInfo", "DownloadItem", "DownloadQueueResumePackage", "DownloadResumePackage", "DownloadType", "DownloadedFileInfo", "DownloadedFileInfoResult", "IDownloadableMinimum", "StreamData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class VideoDownloadManager private constructor() {
    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadActionType;", "", "(Ljava/lang/String;I)V", "Pause", "Resume", "Stop", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes4.dex */
    enum class DownloadActionType {
        Pause, Resume, Stop
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "", "(Ljava/lang/String;I)V", "IsPaused", "IsDownloading", "IsDone", "IsFailed", "IsStopped", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes4.dex */
    enum class DownloadType {
        IsPaused, IsDownloading, IsDone, IsFailed, IsStopped
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$IDownloadableMinimum;", "", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "referer", "getReferer", "()Ljava/lang/String;", "url", "getUrl", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    interface IDownloadableMinimum {
        val headers: Map<String, String>
        val referer: String
        val url: String
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes4.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray
        /* synthetic */ val `$EnumSwitchMapping$1`: IntArray

        init {
            val iArr = IntArray(DownloadType.values().size)
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsDone.ordinal()) = 1
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsDownloading.ordinal()) = 2
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsPaused.ordinal()) = 3
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsFailed.ordinal()) = 4
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsStopped.ordinal()) = 5
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.utils.iArr
            val iArr2 = IntArray(DownloadActionType.values().size)
            com.lagradost.cloudstream3.utils.iArr2.get(DownloadActionType.Resume.ordinal()) = 1
            com.lagradost.cloudstream3.utils.iArr2.get(DownloadActionType.Pause.ordinal()) = 2
            com.lagradost.cloudstream3.utils.iArr2.get(DownloadActionType.Stop.ordinal()) = 3
            `$EnumSwitchMapping$1` = com.lagradost.cloudstream3.utils.iArr2
        }
    }

    var maxConcurrentDownloads: Int
        get() = Companion.maxConcurrentDownloads
        set(i) {
            Companion.maxConcurrentDownloads = i
        }

    fun getId(iDownloadableMinimum: IDownloadableMinimum): Int {
        Intrinsics.checkNotNullParameter(iDownloadableMinimum, "<this>")
        return iDownloadableMinimum.url.hashCode()
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jj\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "", "id", "", "mainName", "", "sourceApiName", "poster", "name", "season", "episode", "type", "Lcom/lagradost/cloudstream3/TvType;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/TvType;)V", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "getMainName", "()Ljava/lang/String;", "getName", "getPoster", "getSeason", "getSourceApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/TvType;)Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadEpisodeMetadata(
        @JsonProperty("id") i: Int,
        @JsonProperty("mainName") mainName: String,
        @JsonProperty("sourceApiName") str: String,
        @JsonProperty("poster") str2: String,
        @JsonProperty("name") str3: String,
        @JsonProperty("season") num: Integer,
        @JsonProperty("episode") num2: Integer,
        @JsonProperty("type") tvType: TvType
    ) {
        private val episode: Integer

        /* renamed from: id */
        val id: Int
        val mainName: String
        val name: String
        val poster: String
        private val season: Integer
        val sourceApiName: String
        private val type: TvType
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return mainName
        }

        operator fun component3(): String {
            return sourceApiName
        }

        operator fun component4(): String {
            return poster
        }

        operator fun component5(): String {
            return name
        }

        operator fun component6(): Integer {
            return season
        }

        operator fun component7(): Integer {
            return episode
        }

        operator fun component8(): TvType {
            return type
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("mainName") mainName: String,
            @JsonProperty("sourceApiName") str: String,
            @JsonProperty("poster") str2: String,
            @JsonProperty("name") str3: String,
            @JsonProperty("season") num: Integer,
            @JsonProperty("episode") num2: Integer,
            @JsonProperty("type") tvType: TvType
        ): DownloadEpisodeMetadata {
            Intrinsics.checkNotNullParameter(mainName, "mainName")
            return DownloadEpisodeMetadata(i, mainName, str, str2, str3, num, num2, tvType)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadEpisodeMetadata) {
                val downloadEpisodeMetadata = obj as DownloadEpisodeMetadata
                return id == downloadEpisodeMetadata.id && Intrinsics.areEqual(
                    mainName, downloadEpisodeMetadata.mainName
                ) && Intrinsics.areEqual(
                    sourceApiName, downloadEpisodeMetadata.sourceApiName
                ) && Intrinsics.areEqual(
                    poster, downloadEpisodeMetadata.poster
                ) && Intrinsics.areEqual(
                    name, downloadEpisodeMetadata.name
                ) && Intrinsics.areEqual(
                    season, downloadEpisodeMetadata.season
                ) && Intrinsics.areEqual(
                    episode, downloadEpisodeMetadata.episode
                ) && type === downloadEpisodeMetadata.type
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = (id * 31 + mainName.hashCode()) * 31
            val str = sourceApiName
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = poster
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val str3 = name
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val num: Integer = season
            val hashCode5: Int = (hashCode4 + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = episode
            val hashCode6: Int = (hashCode5 + if (num2 == null) 0 else num2.hashCode()) * 31
            val tvType: TvType = type
            return hashCode6 + if (tvType != null) tvType.hashCode() else 0
        }

        override fun toString(): String {
            return "DownloadEpisodeMetadata(id=" + id + ", mainName=" + mainName + ", sourceApiName=" + sourceApiName + ", poster=" + poster + ", name=" + name + ", season=" + season + ", episode=" + episode + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(mainName, "mainName")
            id = i
            this.mainName = mainName
            sourceApiName = str
            poster = str2
            name = str3
            season = num
            episode = num2
            type = tvType
        }

        fun getSeason(): Integer {
            return season
        }

        fun getEpisode(): Integer {
            return episode
        }

        fun getType(): TvType {
            return type
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadItem;", "", "source", "", "folder", "ep", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "links", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;Ljava/util/List;)V", "getEp", "()Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "getFolder", "()Ljava/lang/String;", "getLinks", "()Ljava/util/List;", "getSource", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadItem(
        @JsonProperty("source") str: String,
        @JsonProperty("folder") str2: String,
        @JsonProperty("ep") ep: DownloadEpisodeMetadata,
        @JsonProperty("links") links: List<ExtractorLink>
    ) {
        /* renamed from: ep */
        val ep: DownloadEpisodeMetadata
        val folder: String
        val links: List<ExtractorLink>
        val source: String
        operator fun component1(): String {
            return source
        }

        operator fun component2(): String {
            return folder
        }

        operator fun component3(): DownloadEpisodeMetadata {
            return ep
        }

        operator fun component4(): List<ExtractorLink> {
            return links
        }

        fun copy(
            @JsonProperty("source") str: String,
            @JsonProperty("folder") str2: String,
            @JsonProperty("ep") ep: DownloadEpisodeMetadata,
            @JsonProperty("links") links: List<ExtractorLink>
        ): DownloadItem {
            Intrinsics.checkNotNullParameter(ep, "ep")
            Intrinsics.checkNotNullParameter(links, "links")
            return DownloadItem(str, str2, ep, links)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadItem) {
                val downloadItem = obj as DownloadItem
                return Intrinsics.areEqual(source, downloadItem.source) && Intrinsics.areEqual(
                    folder, downloadItem.folder
                ) && Intrinsics.areEqual(ep, downloadItem.ep) && Intrinsics.areEqual(
                    links, downloadItem.links
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = source
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = folder
            return ((hashCode + (str2?.hashCode()
                ?: 0)) * 31 + ep.hashCode()) * 31 + links.hashCode()
        }

        override fun toString(): String {
            return "DownloadItem(source=" + source + ", folder=" + folder + ", ep=" + ep + ", links=" + links + ')'
        }

        /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(ep, "ep")
            Intrinsics.checkNotNullParameter(links, "links")
            source = str
            folder = str2
            this.ep = ep
            this.links = links
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                downloadItem: DownloadItem,
                str: String,
                str2: String,
                downloadEpisodeMetadata: DownloadEpisodeMetadata,
                list: List,
                i: Int,
                obj: Object?
            ): DownloadItem {
                var str = str
                var str2 = str2
                var downloadEpisodeMetadata = downloadEpisodeMetadata
                var list: List = list
                if (i and 1 != 0) {
                    str = downloadItem.source
                }
                if (i and 2 != 0) {
                    str2 = downloadItem.folder
                }
                if (i and 4 != 0) {
                    downloadEpisodeMetadata = downloadItem.ep
                }
                if (i and 8 != 0) {
                    list = downloadItem.links
                }
                return downloadItem.copy(str, str2, downloadEpisodeMetadata, list)
            }
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadResumePackage;", "", "item", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadItem;", "linkIndex", "", "(Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadItem;Ljava/lang/Integer;)V", "getItem", "()Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadItem;", "getLinkIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadItem;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadResumePackage;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadResumePackage(
        @JsonProperty("item") item: DownloadItem,
        @JsonProperty("linkIndex") num: Integer?
    ) {
        val item: DownloadItem
        private val linkIndex: Integer?
        operator fun component1(): DownloadItem {
            return item
        }

        operator fun component2(): Integer? {
            return linkIndex
        }

        fun copy(
            @JsonProperty("item") item: DownloadItem,
            @JsonProperty("linkIndex") num: Integer?
        ): DownloadResumePackage {
            Intrinsics.checkNotNullParameter(item, "item")
            return DownloadResumePackage(item, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadResumePackage) {
                val downloadResumePackage = obj as DownloadResumePackage
                return Intrinsics.areEqual(item, downloadResumePackage.item) && Intrinsics.areEqual(
                    linkIndex, downloadResumePackage.linkIndex
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = item.hashCode() * 31
            val num: Integer? = linkIndex
            return hashCode + if (num == null) 0 else num.hashCode()
        }

        override fun toString(): String {
            return "DownloadResumePackage(item=" + item + ", linkIndex=" + linkIndex + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(item, "item")
            this.item = item
            linkIndex = num
        }

        fun getLinkIndex(): Integer? {
            return linkIndex
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                downloadResumePackage: DownloadResumePackage,
                downloadItem: DownloadItem,
                num: Integer?,
                i: Int,
                obj: Object?
            ): DownloadResumePackage {
                var downloadItem = downloadItem
                var num: Integer? = num
                if (i and 1 != 0) {
                    downloadItem = downloadResumePackage.item
                }
                if (i and 2 != 0) {
                    num = downloadResumePackage.linkIndex
                }
                return downloadResumePackage.copy(downloadItem, num)
            }
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadedFileInfo;", "", "totalBytes", "", "relativePath", "", "displayName", "extraInfo", "basePath", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBasePath", "()Ljava/lang/String;", "getDisplayName", "getExtraInfo", "getRelativePath", "getTotalBytes", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadedFileInfo(
        @JsonProperty("totalBytes") j: Long,
        @JsonProperty("relativePath") relativePath: String,
        @JsonProperty("displayName") displayName: String,
        @JsonProperty("extraInfo") str: String?,
        @JsonProperty("basePath") str2: String?
    ) {
        val basePath: String?
        val displayName: String
        val extraInfo: String?
        val relativePath: String
        val totalBytes: Long
        operator fun component1(): Long {
            return totalBytes
        }

        operator fun component2(): String {
            return relativePath
        }

        operator fun component3(): String {
            return displayName
        }

        operator fun component4(): String? {
            return extraInfo
        }

        operator fun component5(): String? {
            return basePath
        }

        fun copy(
            @JsonProperty("totalBytes") j: Long,
            @JsonProperty("relativePath") relativePath: String,
            @JsonProperty("displayName") displayName: String,
            @JsonProperty("extraInfo") str: String?,
            @JsonProperty("basePath") str2: String?
        ): DownloadedFileInfo {
            Intrinsics.checkNotNullParameter(relativePath, "relativePath")
            Intrinsics.checkNotNullParameter(displayName, "displayName")
            return DownloadedFileInfo(j, relativePath, displayName, str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadedFileInfo) {
                val downloadedFileInfo = obj as DownloadedFileInfo
                return totalBytes == downloadedFileInfo.totalBytes && Intrinsics.areEqual(
                    relativePath, downloadedFileInfo.relativePath
                ) && Intrinsics.areEqual(
                    displayName, downloadedFileInfo.displayName
                ) && Intrinsics.areEqual(
                    extraInfo, downloadedFileInfo.extraInfo
                ) && Intrinsics.areEqual(
                    basePath, downloadedFileInfo.basePath
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = ((`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                totalBytes
            ) * 31 + relativePath.hashCode()) * 31 + displayName.hashCode()) * 31
            val str = extraInfo
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = basePath
            return hashCode2 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "DownloadedFileInfo(totalBytes=" + totalBytes + ", relativePath=" + relativePath + ", displayName=" + displayName + ", extraInfo=" + extraInfo + ", basePath=" + basePath + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(relativePath, "relativePath")
            Intrinsics.checkNotNullParameter(displayName, "displayName")
            totalBytes = j
            this.relativePath = relativePath
            this.displayName = displayName
            extraInfo = str
            basePath = str2
        }

        /* synthetic */   constructor(
            j: Long,
            str: String,
            str2: String,
            str3: String?,
            str4: String?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            j,
            str,
            str2,
            if (i and 8 != 0) null else str3,
            if (i and 16 != 0) null else str4
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                downloadedFileInfo: DownloadedFileInfo,
                j: Long,
                str: String,
                str2: String,
                str3: String?,
                str4: String?,
                i: Int,
                obj: Object?
            ): DownloadedFileInfo {
                var j = j
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                if (i and 1 != 0) {
                    j = downloadedFileInfo.totalBytes
                }
                val j2 = j
                if (i and 2 != 0) {
                    str = downloadedFileInfo.relativePath
                }
                val str5 = str
                if (i and 4 != 0) {
                    str2 = downloadedFileInfo.displayName
                }
                val str6 = str2
                if (i and 8 != 0) {
                    str3 = downloadedFileInfo.extraInfo
                }
                val str7 = str3
                if (i and 16 != 0) {
                    str4 = downloadedFileInfo.basePath
                }
                return downloadedFileInfo.copy(j2, str5, str6, str7, str4)
            }
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadedFileInfoResult;", "", "fileLength", "", "totalBytes", "path", "Landroid/net/Uri;", "(JJLandroid/net/Uri;)V", "getFileLength", "()J", "getPath", "()Landroid/net/Uri;", "getTotalBytes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadedFileInfoResult(
        @JsonProperty("fileLength") j: Long,
        @JsonProperty("totalBytes") j2: Long,
        @JsonProperty("path") path: Uri
    ) {
        val fileLength: Long
        private val path: Uri
        val totalBytes: Long
        operator fun component1(): Long {
            return fileLength
        }

        operator fun component2(): Long {
            return totalBytes
        }

        operator fun component3(): Uri {
            return path
        }

        fun copy(
            @JsonProperty("fileLength") j: Long,
            @JsonProperty("totalBytes") j2: Long,
            @JsonProperty("path") path: Uri
        ): DownloadedFileInfoResult {
            Intrinsics.checkNotNullParameter(path, "path")
            return DownloadedFileInfoResult(j, j2, path)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadedFileInfoResult) {
                val downloadedFileInfoResult = obj as DownloadedFileInfoResult
                return fileLength == downloadedFileInfoResult.fileLength && totalBytes == downloadedFileInfoResult.totalBytes && Intrinsics.areEqual(
                    path, downloadedFileInfoResult.path
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(fileLength) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                totalBytes
            )) * 31 + path.hashCode()
        }

        override fun toString(): String {
            return "DownloadedFileInfoResult(fileLength=" + fileLength + ", totalBytes=" + totalBytes + ", path=" + path + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(path, "path")
            fileLength = j
            totalBytes = j2
            this.path = path
        }

        fun getPath(): Uri {
            return path
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                downloadedFileInfoResult: DownloadedFileInfoResult,
                j: Long,
                j2: Long,
                uri: Uri,
                i: Int,
                obj: Object?
            ): DownloadedFileInfoResult {
                var j = j
                var j2 = j2
                var uri: Uri = uri
                if (i and 1 != 0) {
                    j = downloadedFileInfoResult.fileLength
                }
                val j3 = j
                if (i and 2 != 0) {
                    j2 = downloadedFileInfoResult.totalBytes
                }
                val j4 = j2
                if (i and 4 != 0) {
                    uri = downloadedFileInfoResult.path
                }
                return downloadedFileInfoResult.copy(j3, j4, uri)
            }
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadQueueResumePackage;", "", FirebaseAnalytics.Param.INDEX, "", "pkg", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadResumePackage;", "(ILcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadResumePackage;)V", "getIndex", "()I", "getPkg", "()Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadResumePackage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadQueueResumePackage(
        @JsonProperty("index") i: Int,
        @JsonProperty("pkg") pkg: DownloadResumePackage
    ) {
        val index: Int
        val pkg: DownloadResumePackage
        operator fun component1(): Int {
            return index
        }

        operator fun component2(): DownloadResumePackage {
            return pkg
        }

        fun copy(
            @JsonProperty("index") i: Int,
            @JsonProperty("pkg") pkg: DownloadResumePackage
        ): DownloadQueueResumePackage {
            Intrinsics.checkNotNullParameter(pkg, "pkg")
            return DownloadQueueResumePackage(i, pkg)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadQueueResumePackage) {
                val downloadQueueResumePackage = obj as DownloadQueueResumePackage
                return index == downloadQueueResumePackage.index && Intrinsics.areEqual(
                    pkg, downloadQueueResumePackage.pkg
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return index * 31 + pkg.hashCode()
        }

        override fun toString(): String {
            return "DownloadQueueResumePackage(index=" + index + ", pkg=" + pkg + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(pkg, "pkg")
            index = i
            this.pkg = pkg
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                downloadQueueResumePackage: DownloadQueueResumePackage,
                i: Int,
                downloadResumePackage: DownloadResumePackage,
                i2: Int,
                obj: Object?
            ): DownloadQueueResumePackage {
                var i = i
                var downloadResumePackage = downloadResumePackage
                if (i2 and 1 != 0) {
                    i = downloadQueueResumePackage.index
                }
                if (i2 and 2 != 0) {
                    downloadResumePackage = downloadQueueResumePackage.pkg
                }
                return downloadQueueResumePackage.copy(i, downloadResumePackage)
            }
        }
    }

    val downloadStatus: HashMap<Integer, DownloadType>
        get() = Companion.downloadStatus
    val downloadStatusEvent: Event<Tuples<Any, DownloadType>>
        get() = Companion.downloadStatusEvent
    val downloadDeleteEvent: Event<Any>
        get() = Companion.downloadDeleteEvent
    val downloadEvent: Event<Tuples<Any?, DownloadActionType>>
        get() = Companion.downloadEvent
    val downloadProgressEvent: Event<Triple<Any, Long, Long>>
        get() = Companion.downloadProgressEvent
    val downloadQueue: LinkedList<DownloadResumePackage>
        get() = Companion.downloadQueue

    private fun createNotificationChannel(context: Context) {
        hasCreatedNotChanel = true
        if (Build.VERSION.SDK_INT >= 26) {
            val notificationChannel = NotificationChannel(
                VideoDownloadManagerKt.DOWNLOAD_CHANNEL_ID,
                VideoDownloadManagerKt.DOWNLOAD_CHANNEL_NAME,
                3
            )
            notificationChannel.setDescription(VideoDownloadManagerKt.DOWNLOAD_CHANNEL_DESCRIPT)
            val systemService: Object = context.getSystemService("notification")
            Objects.requireNonNull(
                systemService,
                "null cannot be cast to non-null type android.app.NotificationManager"
            )
            (systemService as NotificationManager).createNotificationChannel(notificationChannel)
        }
    }

    fun getDownloadState(i: Int): DownloadType {
        return try {
            var downloadType: DownloadType = Companion.downloadStatus.get(Integer.valueOf(i))
            if (downloadType == null) {
                downloadType = DownloadType.IsDone
            }
            Intrinsics.checkNotNullExpressionValue(
                downloadType,
                "{\n            downloadSt…loadType.IsDone\n        }"
            )
            downloadType
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            DownloadType.IsDone
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getImageBitmapFromUrl(context: Context?, str: String?): Bitmap? {
        return try {
            val hashMap: HashMap<String, Bitmap> = cachedBitmaps
            if (hashMap.containsKey(str)) {
                return hashMap.get(str)
            }
            val bitmap: Bitmap = GlideApp.with(context).asBitmap().load(str).into(720, 720).get()
            if (bitmap != null) {
                hashMap.put(str, bitmap)
            }
            null
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            null
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:103:0x0377  */ /* JADX WARN: Removed duplicated region for block: B:104:0x037c A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:107:0x03cb A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */ /* JADX WARN: Removed duplicated region for block: B:123:0x043e A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:129:0x0453 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:132:0x0461 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:136:0x0476 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:172:0x052d A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */ /* JADX WARN: Removed duplicated region for block: B:58:0x017e A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:59:0x0199  */ /* JADX WARN: Removed duplicated region for block: B:67:0x01e0 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:68:0x0203 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:74:0x022b A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:82:0x027f A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:86:0x0297 A[ADDED_TO_REGION] */ /* JADX WARN: Removed duplicated region for block: B:91:0x030e A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:96:0x0317 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /* JADX WARN: Removed duplicated region for block: B:97:0x0334 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0072, B:80:0x027b, B:82:0x027f, B:87:0x0299, B:89:0x030a, B:91:0x030e, B:94:0x0313, B:96:0x0317, B:106:0x03b5, B:121:0x043a, B:123:0x043e, B:170:0x0529, B:172:0x052d, B:173:0x0530, B:125:0x0442, B:127:0x0448, B:129:0x0453, B:130:0x045d, B:132:0x0461, B:133:0x046b, B:134:0x0470, B:136:0x0476, B:147:0x04a6, B:158:0x04ed, B:164:0x04fe, B:169:0x051e, B:165:0x0506, B:166:0x050b, B:167:0x050c, B:168:0x0515, B:154:0x04e0, B:155:0x04e5, B:143:0x049b, B:144:0x04a0, B:97:0x0334, B:99:0x0338, B:100:0x0354, B:101:0x0370, B:105:0x038d, B:104:0x037c, B:88:0x02ce, B:22:0x00a1, B:33:0x00ed, B:34:0x00f2, B:39:0x0102, B:41:0x0111, B:43:0x011c, B:45:0x013d, B:47:0x0155, B:49:0x015b, B:51:0x015f, B:56:0x0178, B:58:0x017e, B:60:0x019a, B:62:0x01a0, B:64:0x01a6, B:72:0x0219, B:74:0x022b, B:76:0x0231, B:107:0x03cb, B:109:0x03cf, B:112:0x03d4, B:114:0x03d8, B:116:0x03f5, B:118:0x03f9, B:119:0x0415, B:120:0x0430, B:65:0x01da, B:67:0x01e0, B:68:0x0203, B:71:0x020f, B:55:0x0168, B:46:0x014a), top: B:177:0x0036 }] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun createNotification(
        r21: android.content.Context?,
        r22: String?,
        r23: String?,
        r24: DownloadEpisodeMetadata?,
        r25: DownloadType?,
        r26: Long,
        r28: Long,
        r30: Function2<Int?, android.app.Notification?, Unit>?,
        r31: Long?,
        r32: Long?,
        r33: Continuation<in android.app.Notification?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.createNotification(android.content.Context, java.lang.String, java.lang.String, com.lagradost.cloudstream3.utils.VideoDownloadManager\$DownloadEpisodeMetadata, com.lagradost.cloudstream3.utils.VideoDownloadManager\$DownloadType, long, long, kotlin.jvm.functions.Function2, java.lang.Long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun sanitizeFilename(name: String?): String {
        Intrinsics.checkNotNullParameter(name, "name")
        var str = name
        for (i in 0..12) {
            str = StringsKt.`replace$default`(
                str,
                reservedChars.charAt(i),
                ' ',
                false,
                4,
                null as Object?
            )
        }
        return StringsKt.trim(
            StringsKt.`replace$default`(
                str,
                "  ",
                " ",
                false,
                4,
                null as Object?
            ), ' '
        )
    }

    private fun getExistingFolderStartName(
        contentResolver: ContentResolver,
        str: String
    ): List<Tuples<String, Uri>>? {
        return try {
            val query: Cursor = contentResolver.query(
                MediaStore.Downloads.getContentUri("external_primary"),
                arrayOf("_id", "_display_name"),
                "relative_path='$str'",
                null,
                null
            )
            val arrayList = ArrayList()
            val cursor: Cursor = query
            val cursor2: Cursor = cursor
            if (cursor2 != null && cursor2.getCount() >= 1) {
                cursor2.moveToFirst()
                while (true) {
                    val j: Long = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"))
                    val string: String =
                        cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name"))
                    val withAppendedId: Uri =
                        ContentUris.withAppendedId(MediaStore.Downloads.EXTERNAL_CONTENT_URI, j)
                    Intrinsics.checkNotNullExpressionValue(
                        withAppendedId,
                        "withAppendedId(\n        …                        )"
                    )
                    arrayList.add(Tuples<Any?, Any?>(string, withAppendedId))
                    if (cursor2.isLast()) {
                        break
                    }
                    cursor2.moveToNext()
                }
            }
            val unit = Unit.INSTANCE
            Closeable.closeFinally(cursor, null)
            arrayList
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            null
        }
    }

    fun getFolder(context: Context, relativePath: String, str: String): List<Tuples<String, Uri>>? {
        var listFiles: Array<UniFile?>
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(relativePath, "relativePath")
        val basePathToFile: UniFile = basePathToFile(context, str)
        val gotoDir: UniFile? =
            if (basePathToFile != null) gotoDir(basePathToFile, relativePath, false) else null
        if (Build.VERSION.SDK_INT >= 29 && isDownloadDir(basePathToFile)) {
            val contentResolver: ContentResolver = context.getContentResolver()
            return if (contentResolver != null) {
                getExistingFolderStartName(contentResolver, relativePath)
            } else null
        }
        val z = true
        if (!(if (gotoDir == null || !gotoDir.isDirectory()) false else false) || gotoDir.listFiles()
                .also { listFiles = it } == null
        ) {
            return null
        }
        val arrayList = ArrayList(listFiles.size)
        for (uniFile in listFiles) {
            var name: String = uniFile.getName()
            if (name == null) {
                name = ""
            }
            arrayList.add(Tuples<Any?, Any?>(name, uniFile.getUri()))
        }
        return arrayList
    }

    private fun getExistingDownloadUriOrNullQ(
        contentResolver: ContentResolver,
        str: String,
        str2: String
    ): Uri? {
        return try {
            val query: Cursor = contentResolver.query(
                MediaStore.Downloads.getContentUri("external_primary"),
                arrayOf("_id"),
                "relative_path='$str' AND _display_name='$str2'",
                null,
                null
            )
            val cursor: Cursor = query
            if (cursor != null && cursor.getCount() >= 1) {
                cursor.moveToFirst()
                val withAppendedId: Uri = ContentUris.withAppendedId(
                    MediaStore.Downloads.EXTERNAL_CONTENT_URI,
                    cursor.getLong(cursor.getColumnIndexOrThrow("_id"))
                )
                Closeable.closeFinally(query, null)
                return withAppendedId
            }
            val unit = Unit.INSTANCE
            Closeable.closeFinally(query, null)
            null
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            null
        }
    }

    fun getFileLength(contentResolver: ContentResolver, fileUri: Uri?): Long? {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>")
        Intrinsics.checkNotNullParameter(fileUri, "fileUri")
        return try {
            val openFileDescriptor: ParcelFileDescriptor =
                contentResolver.openFileDescriptor(fileUri, "r")
            val parcelFileDescriptor: ParcelFileDescriptor = openFileDescriptor
            val valueOf: Long =
                Long.valueOf(if (parcelFileDescriptor != null) parcelFileDescriptor.getStatSize() else 0L)
            Closeable.closeFinally(openFileDescriptor, null)
            valueOf
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            null
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$CreateNotificationMetadata;", "", "type", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "bytesDownloaded", "", "bytesTotal", "hlsProgress", "hlsTotal", "(Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;JJLjava/lang/Long;Ljava/lang/Long;)V", "getBytesDownloaded", "()J", "getBytesTotal", "getHlsProgress", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHlsTotal", "getType", "()Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;JJLjava/lang/Long;Ljava/lang/Long;)Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$CreateNotificationMetadata;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class CreateNotificationMetadata(type: DownloadType, j: Long, j2: Long, l: Long?, l2: Long?) {
        val bytesDownloaded: Long
        val bytesTotal: Long
        val hlsProgress: Long?
        val hlsTotal: Long?
        val type: DownloadType
        operator fun component1(): DownloadType {
            return type
        }

        operator fun component2(): Long {
            return bytesDownloaded
        }

        operator fun component3(): Long {
            return bytesTotal
        }

        operator fun component4(): Long? {
            return hlsProgress
        }

        operator fun component5(): Long? {
            return hlsTotal
        }

        fun copy(
            type: DownloadType,
            j: Long,
            j2: Long,
            l: Long?,
            l2: Long?
        ): CreateNotificationMetadata {
            Intrinsics.checkNotNullParameter(type, "type")
            return CreateNotificationMetadata(type, j, j2, l, l2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CreateNotificationMetadata) {
                val createNotificationMetadata = obj as CreateNotificationMetadata
                return type == createNotificationMetadata.type && bytesDownloaded == createNotificationMetadata.bytesDownloaded && bytesTotal == createNotificationMetadata.bytesTotal && Intrinsics.areEqual(
                    hlsProgress, createNotificationMetadata.hlsProgress
                ) && Intrinsics.areEqual(
                    hlsTotal, createNotificationMetadata.hlsTotal
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int =
                ((type.hashCode() * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                    bytesDownloaded
                )) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(bytesTotal)) * 31
            val l = hlsProgress
            val hashCode2 = (hashCode + (l?.hashCode() ?: 0)) * 31
            val l2 = hlsTotal
            return hashCode2 + (l2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CreateNotificationMetadata(type=" + type + ", bytesDownloaded=" + bytesDownloaded + ", bytesTotal=" + bytesTotal + ", hlsProgress=" + hlsProgress + ", hlsTotal=" + hlsTotal + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(type, "type")
            this.type = type
            bytesDownloaded = j
            bytesTotal = j2
            hlsProgress = l
            hlsTotal = l2
        }

        /* synthetic */   constructor(
            downloadType: DownloadType,
            j: Long,
            j2: Long,
            l: Long?,
            l2: Long?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            downloadType,
            j,
            j2,
            if (i and 8 != 0) null else l,
            if (i and 16 != 0) null else l2
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                createNotificationMetadata: CreateNotificationMetadata,
                downloadType: DownloadType,
                j: Long,
                j2: Long,
                l: Long?,
                l2: Long?,
                i: Int,
                obj: Object?
            ): CreateNotificationMetadata {
                var downloadType = downloadType
                var j = j
                var j2 = j2
                var l = l
                var l2 = l2
                if (i and 1 != 0) {
                    downloadType = createNotificationMetadata.type
                }
                if (i and 2 != 0) {
                    j = createNotificationMetadata.bytesDownloaded
                }
                val j3 = j
                if (i and 4 != 0) {
                    j2 = createNotificationMetadata.bytesTotal
                }
                val j4 = j2
                if (i and 8 != 0) {
                    l = createNotificationMetadata.hlsProgress
                }
                val l3 = l
                if (i and 16 != 0) {
                    l2 = createNotificationMetadata.hlsTotal
                }
                return createNotificationMetadata.copy(downloadType, j3, j4, l3, l2)
            }
        }
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$StreamData;", "", "errorCode", "", "resume", "", "fileLength", "", "fileStream", "Ljava/io/OutputStream;", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/io/OutputStream;)V", "getErrorCode", "()I", "getFileLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFileStream", "()Ljava/io/OutputStream;", "getResume", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/io/OutputStream;)Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$StreamData;", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class StreamData(
        val errorCode: Int,
        val resume: Boolean?,
        val fileLength: Long?,
        outputStream: OutputStream?
    ) {
        private val fileStream: OutputStream?
        operator fun component1(): Int {
            return errorCode
        }

        operator fun component2(): Boolean? {
            return resume
        }

        operator fun component3(): Long? {
            return fileLength
        }

        operator fun component4(): OutputStream? {
            return fileStream
        }

        fun copy(i: Int, bool: Boolean?, l: Long?, outputStream: OutputStream?): StreamData {
            return StreamData(i, bool, l, outputStream)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is StreamData) {
                val streamData = obj as StreamData
                return errorCode == streamData.errorCode && Intrinsics.areEqual(
                    resume, streamData.resume
                ) && Intrinsics.areEqual(fileLength, streamData.fileLength) && Intrinsics.areEqual(
                    fileStream, streamData.fileStream
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = errorCode * 31
            val bool = resume
            val hashCode = (i + (bool?.hashCode() ?: 0)) * 31
            val l = fileLength
            val hashCode2 = (hashCode + (l?.hashCode() ?: 0)) * 31
            val outputStream: OutputStream? = fileStream
            return hashCode2 + if (outputStream != null) outputStream.hashCode() else 0
        }

        override fun toString(): String {
            return "StreamData(errorCode=" + errorCode + ", resume=" + resume + ", fileLength=" + fileLength + ", fileStream=" + fileStream + ')'
        }

        init {
            fileStream = outputStream
        }

        /* synthetic */   constructor(
            i: Int,
            bool: Boolean?,
            l: Long?,
            outputStream: OutputStream?,
            i2: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            i,
            if (i2 and 2 != 0) null else bool,
            if (i2 and 4 != 0) null else l,
            if (i2 and 8 != 0) null else outputStream
        ) {
        }

        fun getFileStream(): OutputStream? {
            return fileStream
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                streamData: StreamData,
                i: Int,
                bool: Boolean?,
                l: Long?,
                outputStream: OutputStream?,
                i2: Int,
                obj: Object?
            ): StreamData {
                var i = i
                var bool = bool
                var l = l
                var outputStream: OutputStream? = outputStream
                if (i2 and 1 != 0) {
                    i = streamData.errorCode
                }
                if (i2 and 2 != 0) {
                    bool = streamData.resume
                }
                if (i2 and 4 != 0) {
                    l = streamData.fileLength
                }
                if (i2 and 8 != 0) {
                    outputStream = streamData.fileStream
                }
                return streamData.copy(i, bool, l, outputStream)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01a0  */ /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun setupStream(
        r22: android.content.Context?,
        r23: String?,
        r24: String?,
        r25: String?,
        r26: Boolean
    ): StreamData {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.setupStream(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean):com.lagradost.cloudstream3.utils.VideoDownloadManager\$StreamData")
    }

    fun downloadThing(
        context: Context,
        link: IDownloadableMinimum,
        name: String,
        str: String,
        extension: String,
        z: Boolean,
        num: Integer?,
        createNotificationCallback: Function1<CreateNotificationMetadata?, Unit>
    ): Int {
        val j: Long
        var booleanRef: BooleanRef?
        var booleanRef2: BooleanRef
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(link, "link")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(extension, "extension")
        Intrinsics.checkNotNullParameter(createNotificationCallback, "createNotificationCallback")
        if (StringsKt.`startsWith$default`(
                link.url,
                "magnet",
                false,
                2,
                null as Object?
            ) || StringsKt.`endsWith$default`(link.url, ".torrent", false, 2, null as Object?)
        ) {
            return ERROR_UNKNOWN
        }
        val basePath: Tuples<UniFile, String> = getBasePath(context)
        val displayName = getDisplayName(name, extension)
        val relativePath =
            if (Build.VERSION.SDK_INT < 29 || !isDownloadDir(basePath.getFirst())) str else getRelativePath(
                str
            )
        val streamData = setupStream(context, name, relativePath, extension, z)
        if (streamData.errorCode != 3) {
            return streamData.errorCode
        }
        val resume = streamData.resume
        Intrinsics.checkNotNull(resume)
        val booleanValue: Boolean = resume.booleanValue()
        val fileStream: OutputStream? = streamData.getFileStream()
        Intrinsics.checkNotNull(fileStream)
        val fileLength = streamData.fileLength
        Intrinsics.checkNotNull(fileLength)
        var longValue: Long = fileLength.longValue()
        val openConnection: URLConnection = URL(
            StringsKt.`replace$default`(
                link.url,
                " ",
                "%20",
                false,
                4,
                null as Object?
            )
        ).openConnection()
        Intrinsics.checkNotNullExpressionValue(
            openConnection,
            "URL(link.url.replace(\" \", \"%20\")).openConnection()"
        )
        openConnection.setConnectTimeout(10000)
        openConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity")
        openConnection.setRequestProperty(
            "user-agent",
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
        )
        if (link.referer.length() > 0) {
            openConnection.setRequestProperty("referer", link.referer)
        }
        openConnection.setRequestProperty(
            "sec-ch-ua",
            "\"Chromium\";v=\"91\", \" Not;A Brand\";v=\"99\""
        )
        openConnection.setRequestProperty("sec-ch-ua-mobile", "?0")
        openConnection.setRequestProperty("accept", MimeType.UNKNOWN)
        openConnection.setRequestProperty("sec-fetch-user", "?1")
        openConnection.setRequestProperty("sec-fetch-mode", "navigate")
        openConnection.setRequestProperty("sec-fetch-dest", "video")
        val it: Iterator<T> = link.headers.entrySet().iterator()
        while (it.hasNext()) {
            val entry: Map.Entry = it.next()
            openConnection.setRequestProperty(entry.getKey() as String, entry.getValue() as String)
        }
        if (booleanValue) {
            openConnection.setRequestProperty("Range", "bytes=$longValue-")
        }
        if (!booleanValue) {
            longValue = 0
        }
        openConnection.connect()
        j = try {
            if (Build.VERSION.SDK_INT >= 24) {
                openConnection.getContentLengthLong()
            } else {
                val headerField: String = openConnection.getHeaderField("content-length")
                Intrinsics.checkNotNullExpressionValue(
                    headerField,
                    "connection.getHeaderField(\"content-length\")"
                )
                val longOrNull: Long? = StringsKt.toLongOrNull(headerField)
                if (longOrNull != null) longOrNull.longValue() else openConnection.getContentLength()
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            0
        }
        val j2 = j + longValue
        if (!Intrinsics.areEqual(extension, "mp4") || j2 >= 5000000) {
            if (num != null) {
                AcraApplication.Companion.setKey(
                    KEY_DOWNLOAD_INFO,
                    String.valueOf(num.intValue()),
                    DownloadedFileInfo(
                        j2,
                        relativePath ?: "",
                        displayName,
                        null,
                        basePath.getSecond(),
                        8,
                        null
                    )
                )
            }
            val bufferedInputStream = BufferedInputStream(openConnection.getInputStream())
            val bArr = ByteArray(1024)
            val longRef = LongRef()
            longRef.element = longValue
            val booleanRef3 = BooleanRef()
            val booleanRef4 = BooleanRef()
            val booleanRef5 = BooleanRef()
            val booleanRef6 = BooleanRef()
            val `videoDownloadManager$downloadThing$downloadEventListener$1` =
                `VideoDownloadManager$downloadThing$downloadEventListener$1`(
                    num,
                    booleanRef3,
                    booleanRef4,
                    booleanRef5,
                    booleanRef6,
                    createNotificationCallback,
                    longRef,
                    j2
                )
            if (num != null) {
                Companion.downloadEvent.plusAssign(
                    `videoDownloadManager$downloadThing$downloadEventListener$1`
                )
            }
            val main: Job = Coroutines.Companion.INSTANCE.main(
                `VideoDownloadManager$downloadThing$notificationCoroutine$1`(
                    booleanRef3,
                    booleanRef5,
                    booleanRef4,
                    booleanRef6,
                    num,
                    createNotificationCallback,
                    longRef,
                    j2,
                    null
                )
            )
            while (true) {
                try {
                    val read: Int = bufferedInputStream.read(bArr)
                    if (read < 0) {
                        break
                    }
                    longRef.element += read.toLong()
                    while (booleanRef3.element) {
                        Thread.sleep(100L)
                        if (booleanRef4.element) {
                            break
                        }
                    }
                    if (booleanRef4.element) {
                        break
                    }
                    fileStream.write(bArr, 0, read)
                } catch (e2: Exception) {
                    ArchComponentExt.logError(e2)
                    booleanRef6.element = true
                    booleanRef = booleanRef3
                    booleanRef2 = booleanRef6
                    `downloadThing$updateNotification`(
                        booleanRef5,
                        booleanRef4,
                        booleanRef6,
                        booleanRef3,
                        num,
                        createNotificationCallback,
                        longRef,
                        j2
                    )
                }
            }
            booleanRef2 = booleanRef6
            booleanRef = booleanRef3
            fileStream.close()
            bufferedInputStream.close()
            Job.DefaultImpls.`cancel$default`(
                main,
                null as CancellationException?,
                1,
                null as Object?
            )
            if (num != null) {
                try {
                    Companion.downloadEvent.minusAssign(
                        `videoDownloadManager$downloadThing$downloadEventListener$1`
                    )
                } catch (e3: Exception) {
                    ArchComponentExt.logError(e3)
                }
            }
            if (num != null) {
                try {
                    Companion.downloadStatus.remove(Integer.valueOf(num.intValue()))
                } catch (unused: Exception) {
                }
            }
            return if (booleanRef2.element) {
                if (num != null) {
                    Companion.downloadProgressEvent.invoke(
                        Triple<A, B, C>(
                            Integer.valueOf(num.intValue()),
                            0L,
                            0L
                        )
                    )
                }
                -6
            } else if (booleanRef4.element) {
                if (num != null) {
                    Companion.downloadProgressEvent.invoke(
                        Triple<A, B, C>(
                            Integer.valueOf(num.intValue()),
                            0L,
                            0L
                        )
                    )
                }
                `downloadThing$deleteFile`(context, name, relativePath, extension, num, basePath)
            } else {
                if (num != null) {
                    Companion.downloadProgressEvent.invoke(
                        Triple<A, B, C>(
                            Integer.valueOf(num.intValue()),
                            Long.valueOf(longRef.element),
                            Long.valueOf(j2)
                        )
                    )
                }
                booleanRef5.element = true
                `downloadThing$updateNotification`(
                    booleanRef5,
                    booleanRef4,
                    booleanRef2,
                    booleanRef,
                    num,
                    createNotificationCallback,
                    longRef,
                    j2
                )
                1
            }
        }
        return -4
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:3:0x0001, B:6:0x000b, B:8:0x0013, B:14:0x001f, B:16:0x0025, B:18:0x002b, B:19:0x0033, B:21:0x0039, B:23:0x004f, B:25:0x0058, B:28:0x006d, B:35:0x007b, B:36:0x0081, B:38:0x0087, B:41:0x0096, B:43:0x009f, B:51:0x00ae, B:60:0x00c1, B:65:0x00cb, B:66:0x00d3, B:68:0x00d9, B:69:0x00de, B:71:0x00e4), top: B:76:0x0001 }] */ /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */ /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun gotoDir(r11: UniFile, r12: String, r13: Boolean): UniFile {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.gotoDir(com.hippo.unifile.UniFile, java.lang.String, boolean):com.hippo.unifile.UniFile")
    }

    private fun getDisplayName(str: String, str2: String): String {
        return "$str.$str2"
    }

    val downloadDir: UniFile
        get() = UniFile.fromFile(
            File(
                Environment.getExternalStorageDirectory()
                    .getAbsolutePath() + File.separatorChar + Environment.DIRECTORY_DOWNLOADS
            )
        )

    @Deprecated(message = "TODO fix UniFile to work with download directory.")
    private fun getRelativePath(str: String): String {
        return StringsKt.`replace$default`(
            Environment.DIRECTORY_DOWNLOADS + JsonPointer.SEPARATOR + str + JsonPointer.SEPARATOR,
            JsonPointer.SEPARATOR as Char,
            File.separatorChar,
            false,
            4,
            null as Object?
        )
    }

    private fun basePathToFile(context: Context, str: String): UniFile {
        if (str == null || StringsKt.isBlank(str)) {
            return downloadDir
        }
        if (!StringsKt.`startsWith$default`(str, "content://", false, 2, null as Object?)) {
            return UniFile.fromFile(File(str))
        }
        val parse: Uri = Uri.parse(str)
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)")
        return UniFile.fromUri(context, parse)
    }

    fun getBasePath(context: Context): Tuples<UniFile, String> {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val string: String = PreferenceManager.getDefaultSharedPreferences(context)
            .getString(context.getString(R.string.download_path_key), null)
        return TuplesKt.m100to<UniFile, String>(basePathToFile(context, string), string)
    }

    fun isDownloadDir(uniFile: UniFile?): Boolean {
        if (uniFile != null) {
            val filePath: String = uniFile.getFilePath()
            val downloadDir: UniFile? = downloadDir
            if (Intrinsics.areEqual(
                    filePath,
                    if (downloadDir != null) downloadDir.getFilePath() else null
                )
            ) {
                return true
            }
        }
        return false
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if ((r2.length == 0) == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun delete(
        r14: android.content.Context,
        r15: String,
        r16: String?,
        r17: String,
        r18: Int?,
        r19: UniFile
    ): Int {
        /*
            r13 = this;
            r8 = r13
            r0 = r17
            r9 = r18
            r10 = r15
            r11 = r19
            java.lang.String r12 = r13.getDisplayName(r15, r0)
            java.lang.String r1 = "mp4"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L37
            java.lang.String r5 = "vtt"
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r1.delete(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "srt"
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r1.delete(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L31
            goto L37
        L31:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r0)
        L37:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r7 = 0
            if (r0 < r1) goto L61
            boolean r0 = r13.isDownloadDir(r11)
            if (r0 == 0) goto L61
            r3 = r16
            java.lang.String r0 = r13.getRelativePath(r3)
            android.content.ContentResolver r1 = r14.getContentResolver()
            java.lang.String r2 = "context.contentResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.net.Uri r0 = r13.getExistingDownloadUriOrNullQ(r1, r0, r12)
            if (r0 == 0) goto Lb5
            android.content.ContentResolver r1 = r14.getContentResolver()
            r1.delete(r0, r7, r7)
            goto Lb5
        L61:
            r3 = r16
            if (r11 == 0) goto L72
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r13
            r2 = r19
            r3 = r16
            com.hippo.unifile.UniFile r0 = gotoDir$default(r1, r2, r3, r4, r5, r6)
            goto L73
        L72:
            r0 = r7
        L73:
            if (r0 == 0) goto L7a
            com.hippo.unifile.UniFile r1 = r0.findFile(r12)
            goto L7b
        L7a:
            r1 = r7
        L7b:
            if (r1 == 0) goto L85
            boolean r1 = r1.delete()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
        L85:
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r2 != 0) goto L92
            r0 = 3
            return r0
        L92:
            com.hippo.unifile.UniFile[] r2 = r0.listFiles()
            r3 = 0
            if (r2 == 0) goto La2
            int r2 = r2.length
            if (r2 != 0) goto L9e
            r2 = 1
            goto L9f
        L9e:
            r2 = 0
        L9f:
            if (r2 != r1) goto La2
            goto La3
        La2:
            r1 = 0
        La3:
            if (r1 == 0) goto La8
            r0.delete()
        La8:
            if (r9 == 0) goto Lb5
            r0 = r9
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            com.lagradost.cloudstream3.utils.Event<java.lang.Integer> r0 = com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadDeleteEvent
            r0.invoke(r9)
        Lb5:
            r0 = 2
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.delete(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.hippo.unifile.UniFile):int")
    }

    private fun downloadHLS(
        context: Context,
        extractorLink: ExtractorLink,
        str: String,
        str2: String,
        num: Integer?,
        num2: Integer?,
        function1: Function1<CreateNotificationMetadata, Unit>
    ): Int {
        val m3u8Helper = M3u8Helper()
        `downloadHLS$logcatPrint`("initialised the HLS downloader.")
        val m3u8Stream = M3u8Stream(
            extractorLink.url,
            Integer.valueOf(extractorLink.quality),
            MapsKt.mapOf(TuplesKt.m100to<Any, Any?>("referer", extractorLink.referer))
        )
        var intValue = if (num2 != null) num2.intValue() else 0
        val basePath: Tuples<UniFile, String> = getBasePath(context)
        val relativePath =
            if (Build.VERSION.SDK_INT < 29 || !isDownloadDir(basePath.getFirst())) str2 else getRelativePath(
                str2
            )
        val streamData = setupStream(context, str, relativePath, "mp4", intValue > 0)
        if (streamData.errorCode != 3) {
            return streamData.errorCode
        }
        val resume = streamData.resume
        Intrinsics.checkNotNull(resume)
        if (!resume.booleanValue()) {
            intValue = 0
        }
        val fileLength = streamData.fileLength
        Intrinsics.checkNotNull(fileLength)
        val longValue: Long = fileLength.longValue()
        val hlsYield: Iterator<HlsDownloadData?>? =
            m3u8Helper.hlsYield(CollectionsKt.listOf<M3u8Stream>(m3u8Stream), intValue)
        val displayName = getDisplayName(str, "mp4")
        val fileStream: OutputStream? = streamData.getFileStream()
        Intrinsics.checkNotNull(fileStream)
        val next: HlsDownloadData? = hlsYield!!.next()
        val booleanRef = BooleanRef()
        val booleanRef2 = BooleanRef()
        val booleanRef3 = BooleanRef()
        val longRef = LongRef()
        longRef.element = next.getBytes().size + longValue
        val longRef2 = LongRef()
        longRef2.element = (intValue + 1).toLong()
        val totalTs: Long = next.getTotalTs().toLong()
        var booleanRef4: BooleanRef = booleanRef2
        var j = totalTs
        `downloadHLS$updateInfo`(
            num,
            longRef,
            totalTs,
            longRef2,
            relativePath,
            displayName,
            basePath
        )
        val main: Job = Coroutines.Companion.INSTANCE.main(
            `VideoDownloadManager$downloadHLS$notificationCoroutine$1`(
                booleanRef,
                booleanRef4,
                booleanRef3,
                num,
                function1,
                longRef,
                j,
                longRef2,
                null
            )
        )
        val `videoDownloadManager$downloadHLS$downloadEventListener$1` =
            `VideoDownloadManager$downloadHLS$downloadEventListener$1`(
                num,
                booleanRef4,
                booleanRef3,
                booleanRef,
                function1,
                longRef,
                j,
                longRef2
            )
        val `downloadHLS$stopIfError`: Integer? = `downloadHLS$stopIfError`(
            booleanRef4,
            fileStream,
            context,
            str,
            relativePath,
            "mp4",
            num,
            basePath,
            booleanRef,
            booleanRef3,
            function1,
            longRef,
            j,
            longRef2,
            next
        )
        if (`downloadHLS$stopIfError` != null) {
            `downloadHLS$closeAll`(
                num,
                `videoDownloadManager$downloadHLS$downloadEventListener$1`,
                main
            )
            return `downloadHLS$stopIfError`.intValue()
        }
        if (num != null) {
            Companion.downloadEvent.plusAssign(
                `videoDownloadManager$downloadHLS$downloadEventListener$1`
            )
        }
        fileStream.write(next.getBytes())
        while (hlsYield.hasNext()) {
            val next2: HlsDownloadData? = hlsYield.next()
            while (booleanRef3.element) {
                val booleanRef5: BooleanRef = booleanRef4
                if (booleanRef5.element) {
                    `downloadHLS$onFailed`(
                        fileStream,
                        context,
                        str,
                        relativePath,
                        "mp4",
                        num,
                        basePath,
                        booleanRef,
                        booleanRef5,
                        booleanRef3,
                        function1,
                        longRef,
                        j,
                        longRef2,
                        `videoDownloadManager$downloadHLS$downloadEventListener$1`,
                        main
                    )
                    return 2
                }
                Thread.sleep(100L)
                booleanRef4 = booleanRef5
            }
            val booleanRef6: BooleanRef = booleanRef4
            if (booleanRef6.element) {
                `downloadHLS$onFailed`(
                    fileStream,
                    context,
                    str,
                    relativePath,
                    "mp4",
                    num,
                    basePath,
                    booleanRef,
                    booleanRef6,
                    booleanRef3,
                    function1,
                    longRef,
                    j,
                    longRef2,
                    `videoDownloadManager$downloadHLS$downloadEventListener$1`,
                    main
                )
                return 2
            }
            val `downloadHLS$stopIfError2`: Integer? = `downloadHLS$stopIfError`(
                booleanRef6,
                fileStream,
                context,
                str,
                relativePath,
                "mp4",
                num,
                basePath,
                booleanRef,
                booleanRef3,
                function1,
                longRef,
                j,
                longRef2,
                next2
            )
            if (`downloadHLS$stopIfError2` != null) {
                `downloadHLS$closeAll`(
                    num,
                    `videoDownloadManager$downloadHLS$downloadEventListener$1`,
                    main
                )
                return `downloadHLS$stopIfError2`.intValue()
            }
            fileStream.write(next2.getBytes())
            longRef2.element = next2.getCurrentIndex().toLong()
            longRef.element += next2.getBytes().size.toLong()
            val sb = StringBuilder()
            sb.append("Download progress ")
            val j2 = j
            sb.append(MathKt.roundToInt(longRef2.element.toFloat() / j2.toFloat() * 100))
            sb.append('%')
            `downloadHLS$logcatPrint`(sb.toString())
            `downloadHLS$updateInfo`(
                num,
                longRef,
                j2,
                longRef2,
                relativePath,
                displayName,
                basePath
            )
            j = j2
            booleanRef4 = booleanRef6
        }
        val j3 = j
        booleanRef.element = true
        fileStream.close()
        `m9025downloadHLS$updateNotification22`(
            booleanRef,
            booleanRef4,
            booleanRef3,
            num,
            function1,
            longRef,
            j3,
            longRef2
        )
        `downloadHLS$closeAll`(
            num,
            `videoDownloadManager$downloadHLS$downloadEventListener$1`,
            main
        )
        `downloadHLS$updateInfo`(num, longRef, j3, longRef2, relativePath, displayName, basePath)
        return 1
    }

    fun getFileName(context: Context, metadata: DownloadEpisodeMetadata): String {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(metadata, "metadata")
        return getFileName(context, metadata.name, metadata.getEpisode(), metadata.getSeason())
    }

    private fun getFileName(context: Context, str: String, num: Integer?, num2: Integer?): String {
        var str: String? = str
        if (str == null) {
            str = if (num2 != null) {
                context.getString(R.string.season) + ' ' + num2 + ' ' + context.getString(R.string.episode) + ' ' + num
            } else {
                context.getString(R.string.episode) + ' ' + num
            }
        } else if (num != null) {
            str = if (num2 != null) {
                context.getString(R.string.season) + ' ' + num2 + ' ' + context.getString(R.string.episode) + ' ' + num.toString() + " - " + str
            } else {
                context.getString(R.string.episode) + ' ' + num + " - " + str
            }
        }
        return sanitizeFilename(str)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun downloadSingleEpisode(
        r18: android.content.Context?,
        r19: String?,
        r20: String?,
        r21: DownloadEpisodeMetadata?,
        r22: ExtractorLink?,
        r23: Function2<Int?, android.app.Notification?, Unit>?,
        r24: Boolean
    ): Int {
        /*
            r17 = this;
            r6 = r18
            r9 = r17
            r7 = r21
            java.lang.String r8 = r9.getFileName(r6, r7)
            com.lagradost.cloudstream3.utils.Coroutines r0 = com.lagradost.cloudstream3.utils.Coroutines.INSTANCE
            com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$extractorJob$1 r1 = new com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$extractorJob$1
            r10 = 0
            r11 = r22
            r1.<init>(r11, r10)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlinx.coroutines.Job r12 = r0.ioSafe(r1)
            boolean r0 = r22.isM3u8()
            r13 = 1
            if (r0 != 0) goto L68
            java.net.URI r0 = new java.net.URI
            java.lang.String r1 = r22.getUrl()
            r0.<init>(r1)
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "URI(link.url).path"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2 = 2
            java.lang.String r3 = ".m3u8"
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r0, r3, r1, r2, r10)
            if (r0 == 0) goto L3e
            goto L68
        L3e:
            com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$3 r14 = new com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$3
            r0 = r14
            r1 = r18
            r2 = r22
            r3 = r8
            r4 = r20
            r5 = r24
            r6 = r21
            r7 = r19
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Functions) r14
            java.lang.Object r0 = com.lagradost.cloudstream3.mvvm.ArchComponentExt.normalSafeApiCall(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r12, r10, r13, r10)
            if (r0 == 0) goto L65
            int r0 = r0.intValue()
            goto L67
        L65:
            r0 = -10
        L67:
            return r0
        L68:
            if (r24 == 0) goto Lae
            com.lagradost.cloudstream3.utils.DataStore r0 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            int r1 = r21.getId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "download_info"
            java.lang.String r1 = r0.getFolderName(r2, r1)
            android.content.SharedPreferences r2 = r0.getSharedPrefs(r6)     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = r2.getString(r1, r10)     // Catch: java.lang.Exception -> L9a
            if (r1 != 0) goto L85
            goto L9a
        L85:
            java.lang.String r2 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Exception -> L9a
            com.fasterxml.jackson.databind.json.JsonMapper r0 = r0.getMapper()     // Catch: java.lang.Exception -> L9a
            java.lang.Class<com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfo> r2 = com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfo.class
            java.lang.Object r0 = r0.readValue(r1, r2)     // Catch: java.lang.Exception -> L9a
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L9a
            goto L9b
        L9a:
            r0 = r10
        L9b:
            if (r0 != 0) goto L9e
            r0 = r10
        L9e:
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfo r0 = (com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfo) r0
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.getExtraInfo()
            if (r0 == 0) goto Lae
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            r14 = r0
            goto Laf
        Lae:
            r14 = r10
        Laf:
            int r0 = r21.getId()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$1 r16 = new com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$1
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r22
            r4 = r21
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r16
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r0 = r17
            r2 = r22
            r3 = r8
            r4 = r20
            r5 = r15
            r6 = r14
            int r0 = r0.downloadHLS(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r12, r10, r13, r10)
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadSingleEpisode(android.content.Context, java.lang.String, java.lang.String, com.lagradost.cloudstream3.utils.VideoDownloadManager\$DownloadEpisodeMetadata, com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.jvm.functions.Function2, boolean):int")
    }

    fun downloadCheck(
        context: Context?,
        notificationCallback: Function2<Integer?, Notification?, Unit>?
    ): Integer? {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(notificationCallback, "notificationCallback")
        if (currentDownloads.size() < Companion.maxConcurrentDownloads) {
            val linkedList: LinkedList<DownloadResumePackage> = Companion.downloadQueue
            if (linkedList.size() > 0) {
                val removeFirst: DownloadResumePackage = linkedList.removeFirst()
                val item = removeFirst.item
                val id = item.ep.id
                if (currentDownloads.contains(Integer.valueOf(id))) {
                    Companion.downloadEvent.invoke(
                        Tuples<A, B>(
                            Integer.valueOf(id),
                            DownloadActionType.Resume
                        )
                    )
                    return Integer.valueOf(id)
                }
                currentDownloads.add(Integer.valueOf(id))
                Coroutines.Companion.INSTANCE.main(
                    `VideoDownloadManager$downloadCheck$1`(
                        removeFirst,
                        item,
                        id,
                        context,
                        notificationCallback,
                        null
                    )
                )
                return null
            }
            return null
        }
        return null
    }

    fun getDownloadFileInfoAndUpdateSettings(context: Context, i: Int): DownloadedFileInfoResult? {
        Intrinsics.checkNotNullParameter(context, "context")
        val downloadFileInfo = getDownloadFileInfo(context, i)
        if (downloadFileInfo == null) {
            DataStore.Companion.INSTANCE.removeKey(context, KEY_DOWNLOAD_INFO, String.valueOf(i))
        }
        return downloadFileInfo
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: Exception -> 0x00b6, TryCatch #1 {Exception -> 0x00b6, blocks: (B:3:0x0001, B:10:0x002e, B:13:0x0033, B:15:0x0041, B:17:0x0047, B:20:0x004e, B:23:0x005d, B:25:0x0063, B:28:0x006e, B:33:0x007d, B:35:0x0087, B:39:0x0094, B:44:0x009e), top: B:52:0x0001 }] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun getDownloadFileInfo(
        r10: android.content.Context,
        r11: Int
    ): DownloadedFileInfoResult {
        /*
            r9 = this;
            r0 = 0
            com.lagradost.cloudstream3.utils.DataStore r1 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE     // Catch: java.lang.Exception -> Lb6
            java.lang.String r2 = "download_info"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r11 = r1.getFolderName(r2, r11)     // Catch: java.lang.Exception -> Lb6
            android.content.SharedPreferences r2 = r1.getSharedPrefs(r10)     // Catch: java.lang.Exception -> L2d
            java.lang.String r11 = r2.getString(r11, r0)     // Catch: java.lang.Exception -> L2d
            if (r11 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r2 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)     // Catch: java.lang.Exception -> L2d
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r1.getMapper()     // Catch: java.lang.Exception -> L2d
            java.lang.Class<com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfo> r2 = com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfo.class
            java.lang.Object r11 = r1.readValue(r11, r2)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r11 = r0
        L2e:
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfo r11 = (com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfo) r11     // Catch: java.lang.Exception -> Lb6
            if (r11 != 0) goto L33
            return r0
        L33:
            java.lang.String r1 = r11.getBasePath()     // Catch: java.lang.Exception -> Lb6
            com.hippo.unifile.UniFile r1 = r9.basePathToFile(r10, r1)     // Catch: java.lang.Exception -> Lb6
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lb6
            r3 = 29
            if (r2 < r3) goto L7a
            boolean r2 = r9.isDownloadDir(r1)     // Catch: java.lang.Exception -> Lb6
            if (r2 == 0) goto L7a
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Exception -> Lb6
            if (r10 != 0) goto L4e
            return r0
        L4e:
            java.lang.String r1 = r11.getRelativePath()     // Catch: java.lang.Exception -> Lb6
            java.lang.String r2 = r11.getDisplayName()     // Catch: java.lang.Exception -> Lb6
            android.net.Uri r8 = r9.getExistingDownloadUriOrNullQ(r10, r1, r2)     // Catch: java.lang.Exception -> Lb6
            if (r8 != 0) goto L5d
            return r0
        L5d:
            java.lang.Long r10 = r9.getFileLength(r10, r8)     // Catch: java.lang.Exception -> Lb6
            if (r10 == 0) goto L79
            long r4 = r10.longValue()     // Catch: java.lang.Exception -> Lb6
            r1 = 0
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 != 0) goto L6e
            return r0
        L6e:
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfoResult r10 = new com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfoResult     // Catch: java.lang.Exception -> Lb6
            long r6 = r11.getTotalBytes()     // Catch: java.lang.Exception -> Lb6
            r3 = r10
            r3.<init>(r4, r6, r8)     // Catch: java.lang.Exception -> Lb6
            return r10
        L79:
            return r0
        L7a:
            r10 = 0
            if (r1 == 0) goto L90
            java.lang.String r2 = r11.getRelativePath()     // Catch: java.lang.Exception -> Lb6
            com.hippo.unifile.UniFile r1 = r9.gotoDir(r1, r2, r10)     // Catch: java.lang.Exception -> Lb6
            if (r1 == 0) goto L90
            java.lang.String r2 = r11.getDisplayName()     // Catch: java.lang.Exception -> Lb6
            com.hippo.unifile.UniFile r1 = r1.findFile(r2)     // Catch: java.lang.Exception -> Lb6
            goto L91
        L90:
            r1 = r0
        L91:
            r2 = 1
            if (r1 == 0) goto L9b
            boolean r3 = r1.exists()     // Catch: java.lang.Exception -> Lb6
            if (r3 != r2) goto L9b
            r10 = 1
        L9b:
            if (r10 != 0) goto L9e
            return r0
        L9e:
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfoResult r10 = new com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfoResult     // Catch: java.lang.Exception -> Lb6
            long r3 = r9.size(r1)     // Catch: java.lang.Exception -> Lb6
            long r5 = r11.getTotalBytes()     // Catch: java.lang.Exception -> Lb6
            android.net.Uri r7 = r1.getUri()     // Catch: java.lang.Exception -> Lb6
            java.lang.String r11 = "file.uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)     // Catch: java.lang.Exception -> Lb6
            r2 = r10
            r2.<init>(r3, r5, r7)     // Catch: java.lang.Exception -> Lb6
            return r10
        Lb6:
            r10 = move-exception
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r10)
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.getDownloadFileInfo(android.content.Context, int):com.lagradost.cloudstream3.utils.VideoDownloadManager\$DownloadedFileInfoResult")
    }

    fun size(uniFile: UniFile): Long {
        Intrinsics.checkNotNullParameter(uniFile, "<this>")
        val length: Long = uniFile.length()
        if (length <= 1) {
            val openInputStream: InputStream = uniFile.openInputStream()
            Intrinsics.checkNotNullExpressionValue(openInputStream, "this.openInputStream()")
            val available: Long = openInputStream.available()
            _UtilCommonKt.closeQuietly(openInputStream)
            return available
        }
        return length
    }

    fun deleteFileAndUpdateSettings(context: Context, i: Int): Boolean {
        Intrinsics.checkNotNullParameter(context, "context")
        val deleteFile = deleteFile(context, i)
        if (deleteFile) {
            DataStore.Companion.INSTANCE.removeKey(context, KEY_DOWNLOAD_INFO, String.valueOf(i))
        }
        return deleteFile
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun deleteFile(r11: android.content.Context, r12: Int): Boolean {
        /*
            r10 = this;
            com.lagradost.cloudstream3.utils.DataStore r0 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r2 = "download_info"
            java.lang.String r1 = r0.getFolderName(r2, r1)
            r2 = 0
            android.content.SharedPreferences r3 = r0.getSharedPrefs(r11)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = r3.getString(r1, r2)     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r3 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.Exception -> L2d
            com.fasterxml.jackson.databind.json.JsonMapper r0 = r0.getMapper()     // Catch: java.lang.Exception -> L2d
            java.lang.Class<com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfo> r3 = com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfo.class
            java.lang.Object r0 = r0.readValue(r1, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadedFileInfo r0 = (com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfo) r0
            r1 = 0
            if (r0 != 0) goto L34
            return r1
        L34:
            com.lagradost.cloudstream3.utils.Event<kotlin.Pair<java.lang.Integer, com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadActionType>> r3 = com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadEvent
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadActionType r6 = com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadActionType.Stop
            r4.<init>(r5, r6)
            r3.invoke(r4)
            com.lagradost.cloudstream3.utils.Event<kotlin.Triple<java.lang.Integer, java.lang.Long, java.lang.Long>> r3 = com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadProgressEvent
            kotlin.Triple r4 = new kotlin.Triple
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r6 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r8, r6)
            r3.invoke(r4)
            com.lagradost.cloudstream3.utils.Event<kotlin.Pair<java.lang.Integer, com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadType>> r3 = com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadStatusEvent
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadType r6 = com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadType.IsStopped
            r4.<init>(r5, r6)
            r3.invoke(r4)
            com.lagradost.cloudstream3.utils.Event<java.lang.Integer> r3 = com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadDeleteEvent
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.invoke(r12)
            java.lang.String r12 = r0.getBasePath()
            com.hippo.unifile.UniFile r4 = r10.basePathToFile(r11, r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r9 = 1
            if (r12 < r3) goto La8
            boolean r12 = r10.isDownloadDir(r4)
            if (r12 == 0) goto La8
            android.content.ContentResolver r11 = r11.getContentResolver()
            if (r11 != 0) goto L91
            return r1
        L91:
            java.lang.String r12 = r0.getRelativePath()
            java.lang.String r0 = r0.getDisplayName()
            android.net.Uri r12 = r10.getExistingDownloadUriOrNullQ(r11, r12, r0)
            if (r12 != 0) goto La0
            return r9
        La0:
            int r11 = r11.delete(r12, r2, r2)
            if (r11 <= 0) goto La7
            r1 = 1
        La7:
            return r1
        La8:
            if (r4 == 0) goto Lc1
            java.lang.String r5 = r0.getRelativePath()
            r6 = 0
            r7 = 2
            r8 = 0
            r3 = r10
            com.hippo.unifile.UniFile r12 = gotoDir$default(r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto Lc1
            java.lang.String r0 = r0.getDisplayName()
            com.hippo.unifile.UniFile r12 = r12.findFile(r0)
            goto Lc2
        Lc1:
            r12 = r2
        Lc2:
            if (r12 == 0) goto Lcc
            boolean r0 = r12.exists()
            if (r0 != r9) goto Lcc
            r0 = 1
            goto Lcd
        Lcc:
            r0 = 0
        Lcd:
            if (r0 != 0) goto Ld0
            return r9
        Ld0:
            boolean r11 = r12.delete()     // Catch: java.lang.Exception -> Ld5
            goto Leb
        Ld5:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r0)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r12 = r12.getUri()
            int r11 = r11.delete(r12, r2, r2)
            if (r11 <= 0) goto Lea
            r1 = 1
        Lea:
            r11 = r1
        Leb:
            return r11
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager.deleteFile(android.content.Context, int):boolean")
    }

    fun getDownloadResumePackage(context: Context, i: Int): DownloadResumePackage? {
        Intrinsics.checkNotNullParameter(context, "context")
        val dataStore: DataStore = DataStore.Companion.INSTANCE
        var obj: Object? = null
        try {
            val string: String = dataStore.getSharedPrefs(context).getString(
                dataStore.getFolderName(
                    KEY_RESUME_PACKAGES, String.valueOf(i)
                ), null
            )
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getSharedPrefs().getStri…h, null) ?: return defVal"
                )
                val readValue: Object =
                    dataStore.mapper.readValue<Any>(string, DownloadResumePackage::class.java)
                Intrinsics.checkNotNullExpressionValue(
                    readValue,
                    "mapper.readValue(this, T::class.java)"
                )
                obj = readValue
            }
        } catch (unused: Exception) {
        }
        return obj
    }

    fun downloadFromResume(
        context: Context?,
        pkg: DownloadResumePackage,
        notificationCallback: Function2<Integer?, Notification?, Unit>?,
        z: Boolean
    ) {
        var z2: Boolean
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(pkg, "pkg")
        Intrinsics.checkNotNullParameter(notificationCallback, "notificationCallback")
        val list: List<Integer> = currentDownloads
        var z3 = true
        if (list !is Collection || !list.isEmpty()) {
            for (number in list) {
                if (number.intValue() === pkg.item.ep.id) {
                    z2 = true
                    continue
                } else {
                    z2 = false
                    continue
                }
                if (z2) {
                    break
                }
            }
        }
        z3 = false
        if (!z3) {
            Companion.downloadQueue.addLast(pkg)
            downloadCheck(context, notificationCallback)
            if (z) {
                saveQueue()
                return
            }
            return
        }
        Companion.downloadEvent.invoke(
            Tuples<A, B>(
                Integer.valueOf(pkg.item.ep.id),
                DownloadActionType.Resume
            )
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun saveQueue() {
        val list: List = CollectionsKt.toList(Companion.downloadQueue)
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        var i = 0
        for (obj in list) {
            val i2 = i + 1
            if (i < 0) {
                CollectionsKt.throwIndexOverflow()
            }
            arrayList.add(DownloadQueueResumePackage(i, obj as DownloadResumePackage))
            i = i2
        }
        val array: Array<Object?> = arrayList.toArray(arrayOfNulls<DownloadQueueResumePackage>(0))
        Objects.requireNonNull(
            array,
            "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        )
        AcraApplication.Companion.setKey(
            KEY_RESUME_QUEUE_PACKAGES,
            array as Array<DownloadQueueResumePackage?>
        )
    }

    fun downloadEpisode(
        context: Context?,
        str: String,
        str2: String,
        ep: DownloadEpisodeMetadata,
        links: List<ExtractorLink>,
        notificationCallback: Function2<Integer?, Notification?, Unit>?
    ) {
        Intrinsics.checkNotNullParameter(ep, "ep")
        Intrinsics.checkNotNullParameter(links, "links")
        Intrinsics.checkNotNullParameter(notificationCallback, "notificationCallback")
        if (context != null && !links.isEmpty()) {
            `downloadFromResume$default`(
                this,
                context,
                DownloadResumePackage(DownloadItem(str, str2, ep, links), null),
                notificationCallback,
                false,
                8,
                null
            )
        }
    }

    private fun startWork(context: Context, str: String?) {
        val build: OneTimeWorkRequest =
            OneTimeWorkRequest.Builder(DownloadFileWorkManager::class.java).setInputData(
                Data.Builder().putString(SDKConstants.PARAM_KEY, str).build()
            ).build()
        Intrinsics.checkNotNullExpressionValue(
            build,
            "Builder(DownloadFileWork…   )\n            .build()"
        )
        WorkManager.getInstance(context).enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, build)
    }

    fun downloadCheckUsingWorker(context: Context) {
        Intrinsics.checkNotNullParameter(context, "context")
        startWork(context, DownloadFileWorkManagerKt.DOWNLOAD_CHECK)
    }

    fun downloadFromResumeUsingWorker(context: Context, pkg: DownloadResumePackage) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(pkg, "pkg")
        val valueOf: String = String.valueOf(pkg.item.ep.id)
        AcraApplication.Companion.setKey<DownloadResumePackage>(WORK_KEY_PACKAGE, valueOf, pkg)
        startWork(context, valueOf)
    }

    fun downloadEpisodeUsingWorker(
        context: Context,
        str: String,
        str2: String,
        ep: DownloadEpisodeMetadata,
        links: List<ExtractorLink?>
    ) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(ep, "ep")
        Intrinsics.checkNotNullParameter(links, "links")
        val downloadInfo = DownloadInfo(str, str2, ep, links)
        val valueOf: String = String.valueOf(downloadInfo.ep.id)
        AcraApplication.Companion.setKey<DownloadInfo>(WORK_KEY_INFO, valueOf, downloadInfo)
        startWork(context, valueOf)
    }

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadInfo;", "", "source", "", "folder", "ep", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "links", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;Ljava/util/List;)V", "getEp", "()Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "getFolder", "()Ljava/lang/String;", "getLinks", "()Ljava/util/List;", "getSource", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadInfo(
        @JsonProperty("source") str: String,
        @JsonProperty("folder") str2: String,
        @JsonProperty("ep") ep: DownloadEpisodeMetadata,
        @JsonProperty("links") links: List<ExtractorLink?>
    ) {
        /* renamed from: ep */
        val ep: DownloadEpisodeMetadata
        val folder: String
        val links: List<ExtractorLink?>
        val source: String
        operator fun component1(): String {
            return source
        }

        operator fun component2(): String {
            return folder
        }

        operator fun component3(): DownloadEpisodeMetadata {
            return ep
        }

        operator fun component4(): List<ExtractorLink?> {
            return links
        }

        fun copy(
            @JsonProperty("source") str: String,
            @JsonProperty("folder") str2: String,
            @JsonProperty("ep") ep: DownloadEpisodeMetadata,
            @JsonProperty("links") links: List<ExtractorLink?>
        ): DownloadInfo {
            Intrinsics.checkNotNullParameter(ep, "ep")
            Intrinsics.checkNotNullParameter(links, "links")
            return DownloadInfo(str, str2, ep, links)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadInfo) {
                val downloadInfo = obj as DownloadInfo
                return Intrinsics.areEqual(source, downloadInfo.source) && Intrinsics.areEqual(
                    folder, downloadInfo.folder
                ) && Intrinsics.areEqual(ep, downloadInfo.ep) && Intrinsics.areEqual(
                    links, downloadInfo.links
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = source
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = folder
            return ((hashCode + (str2?.hashCode()
                ?: 0)) * 31 + ep.hashCode()) * 31 + links.hashCode()
        }

        override fun toString(): String {
            return "DownloadInfo(source=" + source + ", folder=" + folder + ", ep=" + ep + ", links=" + links + ')'
        }

        /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(ep, "ep")
            Intrinsics.checkNotNullParameter(links, "links")
            source = str
            folder = str2
            this.ep = ep
            this.links = links
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                downloadInfo: DownloadInfo,
                str: String,
                str2: String,
                downloadEpisodeMetadata: DownloadEpisodeMetadata,
                list: List,
                i: Int,
                obj: Object?
            ): DownloadInfo {
                var str = str
                var str2 = str2
                var downloadEpisodeMetadata = downloadEpisodeMetadata
                var list: List = list
                if (i and 1 != 0) {
                    str = downloadInfo.source
                }
                if (i and 2 != 0) {
                    str2 = downloadInfo.folder
                }
                if (i and 4 != 0) {
                    downloadEpisodeMetadata = downloadInfo.ep
                }
                if (i and 8 != 0) {
                    list = downloadInfo.links
                }
                return downloadInfo.copy(str, str2, downloadEpisodeMetadata, list)
            }
        }
    }

    companion object {
        private const val ERROR_CONNECTION_ERROR = -6
        private const val ERROR_CONTENT_RESOLVER_NOT_FOUND = -9
        private const val ERROR_CREATE_FILE = -2
        private const val ERROR_DELETING_FILE = 3
        private const val ERROR_TOO_SMALL_CONNECTION = -4
        private const val ERROR_UNKNOWN = -10
        const val KEY_DOWNLOAD_INFO = "download_info"
        private const val KEY_RESUME_PACKAGES = "download_resume"
        private const val KEY_RESUME_QUEUE_PACKAGES = "download_q_resume"
        private const val SUCCESS_DOWNLOAD_DONE = 1
        private const val SUCCESS_STOPPED = 2
        private const val SUCCESS_STREAM = 3
        private const val USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
        const val WORK_KEY_INFO = "work_key_info"
        const val WORK_KEY_PACKAGE = "work_key_package"
        private var hasCreatedNotChanel = false
        const val imgDone = 2131231725
        const val imgDownloading = 2131231727
        const val imgError = 2131231726
        const val imgPaused = 2131231728
        const val imgStopped = 2131231726
        const val pressToPauseIcon = 2131231312
        const val pressToResumeIcon = 2131231314
        const val pressToStopIcon = 2131231218
        private const val reservedChars = "|\\?*<\":>+[]/'"
        @kotlin.jvm.JvmField
        val INSTANCE = VideoDownloadManager()
        private var maxConcurrentDownloads = 3
        private val currentDownloads: List<Integer> = ArrayList()
        private val downloadStatus: HashMap<Integer, DownloadType> = HashMap()
        private val downloadStatusEvent: Event<Tuples<Integer, DownloadType>> =
            Event<Tuples<Integer, DownloadType>>()
        private val downloadDeleteEvent: Event<Integer> = Event<Integer>()
        private val downloadEvent: Event<Tuples<Integer?, DownloadActionType>> =
            Event<Tuples<Integer?, DownloadActionType>>()
        private val downloadProgressEvent: Event<Triple<Integer, Long, Long>> =
            Event<Triple<Integer, Long, Long>>()
        private val downloadQueue: LinkedList<DownloadResumePackage> = LinkedList()
        private val cachedBitmaps: HashMap<String, Bitmap> = HashMap()
        private fun `downloadThing$deleteFile`(
            context: Context,
            str: String,
            str2: String?,
            str3: String,
            num: Integer?,
            tuples: Tuples<out UniFile, String>
        ): Int {
            return INSTANCE.delete(context, str, str2, str3, num, tuples.first)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `downloadThing$updateNotification`(
            booleanRef: BooleanRef,
            booleanRef2: BooleanRef,
            booleanRef3: BooleanRef,
            booleanRef4: BooleanRef,
            num: Integer?,
            function1: Function1<CreateNotificationMetadata?, Unit>,
            longRef: LongRef,
            j: Long
        ) {
            val downloadType: DownloadType
            downloadType = if (booleanRef.element) {
                DownloadType.IsDone
            } else if (booleanRef2.element) {
                DownloadType.IsStopped
            } else if (booleanRef3.element) {
                DownloadType.IsFailed
            } else {
                if (booleanRef4.element) DownloadType.IsPaused else DownloadType.IsDownloading
            }
            if (num != null) {
                val intValue: Int = num.intValue()
                try {
                    downloadStatus.put(
                        Integer.valueOf(intValue),
                        downloadType
                    )
                    downloadStatusEvent.invoke(
                        Tuples<A, B>(
                            Integer.valueOf(
                                intValue
                            ), downloadType
                        )
                    )
                    downloadProgressEvent.invoke(
                        Triple<A, B, C>(
                            Integer.valueOf(intValue),
                            Long.valueOf(longRef.element),
                            Long.valueOf(j)
                        )
                    )
                } catch (unused: Exception) {
                }
            }
            function1.invoke(
                CreateNotificationMetadata(
                    downloadType,
                    longRef.element,
                    j,
                    null,
                    null,
                    24,
                    null
                )
            )
        }

        fun  /* synthetic */`gotoDir$default`(
            videoDownloadManager: VideoDownloadManager,
            uniFile: UniFile,
            str: String,
            z: Boolean,
            i: Int,
            obj: Object?
        ): UniFile {
            var z = z
            if (i and 2 != 0) {
                z = true
            }
            return videoDownloadManager.gotoDir(uniFile, str, z)
        }

        /* renamed from: downloadHLS$deleteFile-19  reason: not valid java name */
        private fun `m9024downloadHLS$deleteFile19`(
            context: Context,
            str: String,
            str2: String,
            str3: String,
            num: Integer?,
            tuples: Tuples<out UniFile, String>
        ): Int {
            return INSTANCE.delete(context, str, str2, str3, num, tuples.first)
        }

        private fun `downloadHLS$updateInfo`(
            num: Integer?,
            longRef: LongRef,
            j: Long,
            longRef2: LongRef,
            str: String?,
            str2: String,
            tuples: Tuples<out UniFile, String>
        ) {
            if (num != null) {
                AcraApplication.Companion.setKey(
                    KEY_DOWNLOAD_INFO, String.valueOf(num.intValue()), DownloadedFileInfo(
                        longRef.element.toFloat() * (j.toFloat() / longRef2.element.toFloat()),
                        str ?: "",
                        str2,
                        String.valueOf(longRef2.element),
                        tuples.second
                    )
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: downloadHLS$updateNotification-22  reason: not valid java name */
        fun `m9025downloadHLS$updateNotification22`(
            booleanRef: BooleanRef,
            booleanRef2: BooleanRef,
            booleanRef3: BooleanRef,
            num: Integer?,
            function1: Function1<CreateNotificationMetadata, Unit>,
            longRef: LongRef,
            j: Long,
            longRef2: LongRef
        ) {
            val downloadType: DownloadType
            downloadType = if (booleanRef.element) {
                DownloadType.IsDone
            } else if (booleanRef2.element) {
                DownloadType.IsFailed
            } else {
                if (booleanRef3.element) DownloadType.IsPaused else DownloadType.IsDownloading
            }
            if (num != null) {
                val intValue: Int = num.intValue()
                try {
                    downloadStatus.put(
                        Integer.valueOf(intValue),
                        downloadType
                    )
                    downloadStatusEvent.invoke(
                        Tuples<A, B>(
                            Integer.valueOf(
                                intValue
                            ), downloadType
                        )
                    )
                    downloadProgressEvent.invoke(
                        Triple<A, B, C>(
                            Integer.valueOf(intValue), Long.valueOf(longRef.element), Long.valueOf(
                                longRef.element.toFloat() * (j.toFloat() / longRef2.element.toFloat())
                            )
                        )
                    )
                } catch (unused: Exception) {
                }
            }
            function1.invoke(
                CreateNotificationMetadata(
                    downloadType,
                    longRef.element,
                    longRef.element.toFloat() * (j.toFloat() / longRef2.element.toFloat()),
                    Long.valueOf(longRef2.element),
                    Long.valueOf(j)
                )
            )
        }

        private fun `downloadHLS$stopIfError`(
            booleanRef: BooleanRef,
            outputStream: OutputStream?,
            context: Context,
            str: String,
            str2: String,
            str3: String,
            num: Integer?,
            tuples: Tuples<out UniFile, String>,
            booleanRef2: BooleanRef,
            booleanRef3: BooleanRef,
            function1: Function1<CreateNotificationMetadata, Unit>,
            longRef: LongRef,
            j: Long,
            longRef2: LongRef,
            hlsDownloadData: HlsDownloadData?
        ): Integer? {
            val i: Int
            if (!hlsDownloadData.getErrored()) {
                if (hlsDownloadData.getBytes().size != 0) {
                    return null
                }
            }
            i = if (!hlsDownloadData.getErrored()) {
                `downloadHLS$logcatPrint`("Error: No stream was found.")
                ERROR_UNKNOWN
            } else {
                `downloadHLS$logcatPrint`("Error: Failed to fetch data.")
                -6
            }
            booleanRef.element = true
            outputStream.close()
            `m9024downloadHLS$deleteFile19`(context, str, str2, str3, num, tuples)
            `m9025downloadHLS$updateNotification22`(
                booleanRef2,
                booleanRef,
                booleanRef3,
                num,
                function1,
                longRef,
                j,
                longRef2
            )
            return Integer.valueOf(i)
        }

        private fun `downloadHLS$closeAll`(
            num: Integer?,
            function1: Function1<Tuples<Integer?, out DownloadActionType>?, Unit>,
            job: Job
        ) {
            if (num != null) {
                try {
                    downloadEvent.minusAssign(function1)
                } catch (e: Exception) {
                    ArchComponentExt.logError(e)
                }
            }
            if (num != null) {
                try {
                    downloadStatus.remove(Integer.valueOf(num.intValue()))
                } catch (e2: Exception) {
                    ArchComponentExt.logError(e2)
                }
            }
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }

        private fun `downloadHLS$onFailed`(
            outputStream: OutputStream?,
            context: Context,
            str: String,
            str2: String,
            str3: String,
            num: Integer?,
            tuples: Tuples<out UniFile, String>,
            booleanRef: BooleanRef,
            booleanRef2: BooleanRef,
            booleanRef3: BooleanRef,
            function1: Function1<CreateNotificationMetadata, Unit>,
            longRef: LongRef,
            j: Long,
            longRef2: LongRef,
            function12: Function1<Tuples<Integer?, out DownloadActionType>?, Unit>,
            job: Job
        ) {
            outputStream.close()
            `m9024downloadHLS$deleteFile19`(context, str, str2, str3, num, tuples)
            `m9025downloadHLS$updateNotification22`(
                booleanRef,
                booleanRef2,
                booleanRef3,
                num,
                function1,
                longRef,
                j,
                longRef2
            )
            `downloadHLS$closeAll`(num, function12, job)
        }

        fun  /* synthetic */`downloadFromResume$default`(
            videoDownloadManager: VideoDownloadManager,
            context: Context?,
            downloadResumePackage: DownloadResumePackage,
            function2: Function2<*, *, *>?,
            z: Boolean,
            i: Int,
            obj: Object?
        ) {
            var z = z
            if (i and 8 != 0) {
                z = true
            }
            videoDownloadManager.downloadFromResume(context, downloadResumePackage, function2!!, z)
        }

        private fun `downloadHLS$logcatPrint`(vararg objArr: Object) {
            for (obj in objArr) {
                System.out.println("[HLS]: $obj" as Object)
            }
        }
    }
}