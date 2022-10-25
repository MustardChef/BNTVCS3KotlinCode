package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadViewModel.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001d"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_availableBytes", "Landroidx/lifecycle/MutableLiveData;", "", "_downloadBytes", "_headerCards", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadHeaderCached;", "_noDownloadsText", "", "_usedBytes", "availableBytes", "Landroidx/lifecycle/LiveData;", "getAvailableBytes", "()Landroidx/lifecycle/LiveData;", "downloadBytes", "getDownloadBytes", "headerCards", "getHeaderCards", "noDownloadsText", "getNoDownloadsText", "usedBytes", "getUsedBytes", "updateList", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadViewModel */ /* loaded from: classes3.dex */
class DownloadViewModel constructor() : ViewModel() {
    private val _availableBytes: MutableLiveData<Long>
    private val _downloadBytes: MutableLiveData<Long>
    private val _headerCards: MutableLiveData<List<VisualDownloadHeaderCached>>
    private val _noDownloadsText: MutableLiveData<String>
    private val _usedBytes: MutableLiveData<Long>
    private val availableBytes: LiveData<Long>
    private val downloadBytes: LiveData<Long>
    private val headerCards: LiveData<List<VisualDownloadHeaderCached>>
    private val noDownloadsText: LiveData<String>
    private val usedBytes: LiveData<Long>

    init {
        val mutableLiveData: MutableLiveData<String> = MutableLiveData<String>()
        mutableLiveData.setValue("")
        _noDownloadsText = mutableLiveData
        noDownloadsText = mutableLiveData
        val mutableLiveData2: MutableLiveData<List<VisualDownloadHeaderCached>> =
            MutableLiveData<List<VisualDownloadHeaderCached>>()
        CollectionsKt.emptyList<Any>()
        _headerCards = mutableLiveData2
        headerCards = mutableLiveData2
        val mutableLiveData3: MutableLiveData<Long> = MutableLiveData<Long>()
        _usedBytes = mutableLiveData3
        val mutableLiveData4: MutableLiveData<Long> = MutableLiveData<Long>()
        _availableBytes = mutableLiveData4
        val mutableLiveData5: MutableLiveData<Long> = MutableLiveData<Long>()
        _downloadBytes = mutableLiveData5
        usedBytes = mutableLiveData3
        availableBytes = mutableLiveData4
        downloadBytes = mutableLiveData5
    }

    fun getNoDownloadsText(): LiveData<String> {
        return noDownloadsText
    }

    fun getHeaderCards(): LiveData<List<VisualDownloadHeaderCached>> {
        return headerCards
    }

    fun getUsedBytes(): LiveData<Long> {
        return usedBytes
    }

    fun getAvailableBytes(): LiveData<Long> {
        return availableBytes
    }

    fun getDownloadBytes(): LiveData<Long> {
        return downloadBytes
    }

    fun updateList(context: Context?): Job {
        val `launch$default`: Job
        Intrinsics.checkNotNullParameter(context, "context")
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `DownloadViewModel$updateList$1`(this, context, null),
            3,
            null
        )
        return `launch$default`
    }
}