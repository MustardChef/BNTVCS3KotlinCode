package com.lagradost.cloudstream3.syncproviders

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SyncRepo.kt */
@Metadata(
    m108d1 = ["\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bJ\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0006\u0010\u001b\u001a\u00020\u001cJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00152\u0006\u0010#\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/SyncRepo;", "", "repo", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI;", "(Lcom/lagradost/cloudstream3/syncproviders/SyncAPI;)V", "icon", "", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "idPrefix", "", "getIdPrefix", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "name", "getName", "getIdFromUrl", "url", "getResult", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "hasAccount", "", "score", "status", "(Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "query", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class SyncRepo(repo: SyncAPI) {
    private val icon: Integer?
    val idPrefix: String?
    val mainUrl: String?
    val name: String?
    val repo: SyncAPI

    init {
        Intrinsics.checkNotNullParameter(repo, "repo")
        this.repo = repo
        idPrefix = repo.idPrefix
        name = repo.name
        icon = repo.icon
        mainUrl = repo.mainUrl
    }

    fun getIcon(): Integer? {
        return icon
    }

    fun score(
        str: String?,
        syncStatus: SyncStatus,
        continuation: Continuation<in Resource<Boolean?>?>?
    ): Object {
        return ArchComponentExt.safeApiCall(
            `SyncRepo$score$2`(this, str, syncStatus, null),
            continuation
        )
    }

    fun getStatus(str: String?, continuation: Continuation<in Resource<SyncStatus?>?>?): Object {
        return ArchComponentExt.safeApiCall(`SyncRepo$getStatus$2`(this, str, null), continuation)
    }

    fun getResult(str: String?, continuation: Continuation<in Resource<SyncResult?>?>?): Object {
        return ArchComponentExt.safeApiCall(`SyncRepo$getResult$2`(this, str, null), continuation)
    }

    fun search(
        str: String?,
        continuation: Continuation<in Resource<out List<SyncSearchResult?>?>?>?
    ): Object {
        return ArchComponentExt.safeApiCall(`SyncRepo$search$2`(this, str, null), continuation)
    }

    fun hasAccount(): Boolean {
        val bool = ArchComponentExt.normalSafeApiCall(`SyncRepo$hasAccount$1`(this)) as Boolean
        return if (bool != null) {
            bool.booleanValue()
        } else false
    }

    fun getIdFromUrl(url: String?): String? {
        Intrinsics.checkNotNullParameter(url, "url")
        return repo.getIdFromUrl(url)
    }
}