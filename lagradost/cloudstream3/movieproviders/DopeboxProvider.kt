package com.lagradost.cloudstream3.movieproviders

import kotlin.jvm.internal.Intrinsics

/* compiled from: DopeboxProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/DopeboxProvider;", "Lcom/lagradost/cloudstream3/movieproviders/SflixProvider;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class DopeboxProvider : SflixProvider() {
    // com.lagradost.cloudstream3.movieproviders.SflixProvider, com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.movieproviders.SflixProvider, com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    override var mainUrl = "https://dopebox.to"
        // com.lagradost.cloudstream3.movieproviders.SflixProvider, com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.movieproviders.SflixProvider, com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.movieproviders.SflixProvider, com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    override var name = "Dopebox"
        // com.lagradost.cloudstream3.movieproviders.SflixProvider, com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
}