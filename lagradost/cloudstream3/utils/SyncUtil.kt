package com.lagradost.cloudstream3.utils

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SyncUtil.kt */
@Metadata(
    m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0018\u0019\u001a\u001b\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J-\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil;", "", "()V", "GOGOANIME", "", "NINE_ANIME", "TAG", "TWIST_MOE", "matchList", "", "regexs", "", "Lkotlin/text/Regex;", "getIdsFromSlug", "Lkotlin/Pair;", "slug", "site", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdsFromUrl", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUrlsFromId", "id", "type", "Anilist", "Mal", "MalSyncPage", "ProviderPage", "SyncPage", "SyncPages", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class SyncUtil private constructor() {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */ /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:30:0x00b3). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getIdsFromUrl(r10: String?, r11: Continuation<in Tuples<String?, String?>?>?): Any {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.lagradost.cloudstream3.utils.SyncUtil$getIdsFromUrl$1
            if (r0 == 0) goto L14
            r0 = r11
            com.lagradost.cloudstream3.utils.SyncUtil$getIdsFromUrl$1 r0 = (com.lagradost.cloudstream3.utils.SyncUtil$getIdsFromUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            com.lagradost.cloudstream3.utils.SyncUtil$getIdsFromUrl$1 r0 = new com.lagradost.cloudstream3.utils.SyncUtil$getIdsFromUrl$1
            r0.<init>(r9, r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r10 = r0.L$1
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb3
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.ResultKt.throwOnFailure(r11)
            if (r10 != 0) goto L42
            return r4
        L42:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "getIdsFromUrl "
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r2 = "SYNCUTIL"
            android.util.Log.i(r2, r11)
            java.util.List<kotlin.text.Regex> r11 = com.lagradost.cloudstream3.utils.SyncUtil.regexs
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r11 = r10
            r10 = r8
        L61:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r10.next()
            kotlin.text.Regex r2 = (kotlin.text.Regex) r2
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 0
            r7 = 2
            kotlin.text.MatchResult r2 = kotlin.text.Regex.find$default(r2, r5, r6, r7, r4)
            if (r2 == 0) goto L61
            java.util.List r5 = r2.getGroupValues()
            int r5 = r5.size()
            r6 = 3
            if (r5 != r6) goto L61
            java.util.List r5 = r2.getGroupValues()
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.util.List r2 = r2.getGroupValues()
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.String> r6 = com.lagradost.cloudstream3.utils.SyncUtil.matchList
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L61
            com.lagradost.cloudstream3.utils.SyncUtil r6 = com.lagradost.cloudstream3.utils.SyncUtil.INSTANCE
            r0.L$0 = r11
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r2 = r6.getIdsFromSlug(r2, r5, r0)
            if (r2 != r1) goto Lb0
            return r1
        Lb0:
            r8 = r2
            r2 = r11
            r11 = r8
        Lb3:
            kotlin.Pair r11 = (kotlin.Tuples) r11
            if (r11 == 0) goto Lb8
            return r11
        Lb8:
            r11 = r4
            java.lang.Void r11 = (java.lang.Void) r11
            r11 = r2
            goto L61
        Lbd:
            return r4
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.SyncUtil.getIdsFromUrl(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */ /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */ /* JADX WARN: Removed duplicated region for block: B:45:0x0101 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:11:0x0032, B:21:0x00a7, B:23:0x00c2, B:37:0x00ea, B:45:0x0101, B:47:0x0107, B:49:0x010e, B:40:0x00f2, B:42:0x00f8, B:26:0x00ca, B:28:0x00d0, B:32:0x00db, B:34:0x00e1, B:18:0x0062), top: B:54:0x002e }] */ /* JADX WARN: Removed duplicated region for block: B:51:0x0113 A[RETURN] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getIdsFromSlug(
        r23: String?,
        r24: String?,
        r25: Continuation<in Tuples<String?, String?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.SyncUtil.getIdsFromSlug(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */ /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getUrlsFromId(
        r20: String?,
        r21: String?,
        r22: Continuation<in MutableList<String?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.SyncUtil.getUrlsFromId(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: SyncUtil.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil\$SyncPage;", "", "pages", "Lcom/lagradost/cloudstream3/utils/SyncUtil\$SyncPages;", "(Lcom/lagradost/cloudstream3/utils/SyncUtil\$SyncPages;)V", "getPages", "()Lcom/lagradost/cloudstream3/utils/SyncUtil\$SyncPages;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class SyncPage(@param:JsonProperty("Pages") val pages: SyncPages) {
        operator fun component1(): SyncPages {
            return pages
        }

        fun copy(@JsonProperty("Pages") syncPages: SyncPages): SyncPage {
            return SyncPage(syncPages)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SyncPage && Intrinsics.areEqual(
                pages,
                (obj as SyncPage).pages
            )
        }

        override fun hashCode(): Int {
            val syncPages = pages ?: return 0
            return syncPages.hashCode()
        }

        override fun toString(): String {
            return "SyncPage(pages=" + pages + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                syncPage: SyncPage,
                syncPages: SyncPages,
                i: Int,
                obj: Object?
            ): SyncPage {
                var syncPages = syncPages
                if (i and 1 != 0) {
                    syncPages = syncPage.pages
                }
                return syncPage.copy(syncPages)
            }
        }
    }

    /* compiled from: SyncUtil.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003JK\u0010\u0010\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\n¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil\$SyncPages;", "", "nineanime", "", "", "Lcom/lagradost/cloudstream3/utils/SyncUtil\$ProviderPage;", "gogoanime", "twistmoe", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getGogoanime", "()Ljava/util/Map;", "getNineanime", "getTwistmoe", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class SyncPages(
        @JsonProperty("9anime") nineanime: Map<String, ProviderPage>,
        @JsonProperty("Gogoanime") gogoanime: Map<String, ProviderPage>,
        @JsonProperty("Twistmoe") twistmoe: Map<String, ProviderPage>
    ) {
        val gogoanime: Map<String, ProviderPage>
        val nineanime: Map<String, ProviderPage>
        val twistmoe: Map<String, ProviderPage>
        operator fun component1(): Map<String, ProviderPage> {
            return nineanime
        }

        operator fun component2(): Map<String, ProviderPage> {
            return gogoanime
        }

        operator fun component3(): Map<String, ProviderPage> {
            return twistmoe
        }

        fun copy(
            @JsonProperty("9anime") nineanime: Map<String, ProviderPage>,
            @JsonProperty("Gogoanime") gogoanime: Map<String, ProviderPage>,
            @JsonProperty("Twistmoe") twistmoe: Map<String, ProviderPage>
        ): SyncPages {
            Intrinsics.checkNotNullParameter(nineanime, "nineanime")
            Intrinsics.checkNotNullParameter(gogoanime, "gogoanime")
            Intrinsics.checkNotNullParameter(twistmoe, "twistmoe")
            return SyncPages(nineanime, gogoanime, twistmoe)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SyncPages) {
                val syncPages = obj as SyncPages
                return Intrinsics.areEqual(nineanime, syncPages.nineanime) && Intrinsics.areEqual(
                    gogoanime, syncPages.gogoanime
                ) && Intrinsics.areEqual(
                    twistmoe, syncPages.twistmoe
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (nineanime.hashCode() * 31 + gogoanime.hashCode()) * 31 + twistmoe.hashCode()
        }

        override fun toString(): String {
            return "SyncPages(nineanime=" + nineanime + ", gogoanime=" + gogoanime + ", twistmoe=" + twistmoe + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(nineanime, "nineanime")
            Intrinsics.checkNotNullParameter(gogoanime, "gogoanime")
            Intrinsics.checkNotNullParameter(twistmoe, "twistmoe")
            this.nineanime = nineanime
            this.gogoanime = gogoanime
            this.twistmoe = twistmoe
        }

        @JvmOverloads
                /* synthetic */   constructor(
            map: Map? = null,
            map2: Map? = null,
            map3: Map? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) MapsKt.emptyMap<Any, Any>() else map,
            if (i and 2 != 0) MapsKt.emptyMap<Any, Any>() else map2,
            if (i and 4 != 0) MapsKt.emptyMap<Any, Any>() else map3
        ) {
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                syncPages: SyncPages,
                map: Map,
                map2: Map,
                map3: Map,
                i: Int,
                obj: Object?
            ): SyncPages {
                var map: Map = map
                var map2: Map = map2
                var map3: Map = map3
                if (i and 1 != 0) {
                    map = syncPages.nineanime
                }
                if (i and 2 != 0) {
                    map2 = syncPages.gogoanime
                }
                if (i and 4 != 0) {
                    map3 = syncPages.twistmoe
                }
                return syncPages.copy(map, map2, map3)
            }
        }
    }

    /* compiled from: SyncUtil.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil\$ProviderPage;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class ProviderPage(@param:JsonProperty("url") val url: String) {
        operator fun component1(): String {
            return url
        }

        fun copy(@JsonProperty("url") str: String): ProviderPage {
            return ProviderPage(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is ProviderPage && Intrinsics.areEqual(
                url,
                (obj as ProviderPage).url
            )
        }

        override fun hashCode(): Int {
            val str = url ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "ProviderPage(url=" + url + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                providerPage: ProviderPage,
                str: String,
                i: Int,
                obj: Object?
            ): ProviderPage {
                var str = str
                if (i and 1 != 0) {
                    str = providerPage.url
                }
                return providerPage.copy(str)
            }
        }
    }

    /* compiled from: SyncUtil.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\$J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\$J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJæ\u0001\u0010E\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u000fHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010\$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b+\u0010\$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"¨\u0006K"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil\$MalSyncPage;", "", "identifier", "", "type", "page", "title", "url", "image", "hentai", "", "sticky", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "actor", "malId", "", "aniId", "createdAt", "updatedAt", "deletedAt", "Mal", "Lcom/lagradost/cloudstream3/utils/SyncUtil\$Mal;", "Anilist", "Lcom/lagradost/cloudstream3/utils/SyncUtil\$Anilist;", "malUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/SyncUtil\$Mal;Lcom/lagradost/cloudstream3/utils/SyncUtil\$Anilist;Ljava/lang/String;)V", "getAnilist", "()Lcom/lagradost/cloudstream3/utils/SyncUtil\$Anilist;", "getMal", "()Lcom/lagradost/cloudstream3/utils/SyncUtil\$Mal;", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getActor", "()Ljava/lang/String;", "getAniId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatedAt", "getDeletedAt", "getHentai", "getIdentifier", "getImage", "getMalId", "getMalUrl", "getPage", "getSticky", "getTitle", "getType", "getUpdatedAt", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/SyncUtil\$Mal;Lcom/lagradost/cloudstream3/utils/SyncUtil\$Anilist;Ljava/lang/String;)Lcom/lagradost/cloudstream3/utils/SyncUtil\$MalSyncPage;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class MalSyncPage(
        @param:JsonProperty("identifier") val identifier: String,
        @param:JsonProperty(
            "type"
        ) val type: String,
        @param:JsonProperty("page") val page: String,
        @param:JsonProperty("title") val title: String,
        @param:JsonProperty(
            "url"
        ) val url: String,
        @param:JsonProperty("image") val image: String,
        @param:JsonProperty("hentai") val hentai: Boolean,
        @param:JsonProperty(
            "sticky"
        ) val sticky: Boolean,
        @param:JsonProperty("active") val active: Boolean,
        @param:JsonProperty("actor") val actor: String,
        @JsonProperty("malId") num: Integer,
        @JsonProperty("aniId") num2: Integer,
        @JsonProperty("createdAt") str8: String,
        @JsonProperty("updatedAt") str9: String,
        @JsonProperty("deletedAt") str10: String,
        @JsonProperty("Mal") mal: Mal,
        @JsonProperty("Anilist") anilist: Anilist,
        @JsonProperty("malUrl") str11: String
    ) {
        val anilist: Anilist
        val mal: Mal
        private val aniId: Integer
        val createdAt: String
        val deletedAt: String
        private val malId: Integer
        val malUrl: String
        val updatedAt: String
        operator fun component1(): String {
            return identifier
        }

        operator fun component10(): String {
            return actor
        }

        operator fun component11(): Integer {
            return malId
        }

        operator fun component12(): Integer {
            return aniId
        }

        operator fun component13(): String {
            return createdAt
        }

        operator fun component14(): String {
            return updatedAt
        }

        operator fun component15(): String {
            return deletedAt
        }

        operator fun component16(): Mal {
            return mal
        }

        operator fun component17(): Anilist {
            return anilist
        }

        operator fun component18(): String {
            return malUrl
        }

        operator fun component2(): String {
            return type
        }

        operator fun component3(): String {
            return page
        }

        operator fun component4(): String {
            return title
        }

        operator fun component5(): String {
            return url
        }

        operator fun component6(): String {
            return image
        }

        operator fun component7(): Boolean {
            return hentai
        }

        operator fun component8(): Boolean {
            return sticky
        }

        operator fun component9(): Boolean {
            return active
        }

        fun copy(
            @JsonProperty("identifier") str: String,
            @JsonProperty("type") str2: String,
            @JsonProperty("page") str3: String,
            @JsonProperty("title") str4: String,
            @JsonProperty("url") str5: String,
            @JsonProperty("image") str6: String,
            @JsonProperty("hentai") bool: Boolean,
            @JsonProperty("sticky") bool2: Boolean,
            @JsonProperty("active") bool3: Boolean,
            @JsonProperty("actor") str7: String,
            @JsonProperty("malId") num: Integer,
            @JsonProperty("aniId") num2: Integer,
            @JsonProperty("createdAt") str8: String,
            @JsonProperty("updatedAt") str9: String,
            @JsonProperty("deletedAt") str10: String,
            @JsonProperty("Mal") mal: Mal,
            @JsonProperty("Anilist") anilist: Anilist,
            @JsonProperty("malUrl") str11: String
        ): MalSyncPage {
            return MalSyncPage(
                str,
                str2,
                str3,
                str4,
                str5,
                str6,
                bool,
                bool2,
                bool3,
                str7,
                num,
                num2,
                str8,
                str9,
                str10,
                mal,
                anilist,
                str11
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalSyncPage) {
                val malSyncPage = obj as MalSyncPage
                return Intrinsics.areEqual(
                    identifier,
                    malSyncPage.identifier
                ) && Intrinsics.areEqual(
                    type, malSyncPage.type
                ) && Intrinsics.areEqual(page, malSyncPage.page) && Intrinsics.areEqual(
                    title, malSyncPage.title
                ) && Intrinsics.areEqual(url, malSyncPage.url) && Intrinsics.areEqual(
                    image, malSyncPage.image
                ) && Intrinsics.areEqual(hentai, malSyncPage.hentai) && Intrinsics.areEqual(
                    sticky, malSyncPage.sticky
                ) && Intrinsics.areEqual(active, malSyncPage.active) && Intrinsics.areEqual(
                    actor, malSyncPage.actor
                ) && Intrinsics.areEqual(malId, malSyncPage.malId) && Intrinsics.areEqual(
                    aniId, malSyncPage.aniId
                ) && Intrinsics.areEqual(createdAt, malSyncPage.createdAt) && Intrinsics.areEqual(
                    updatedAt, malSyncPage.updatedAt
                ) && Intrinsics.areEqual(
                    deletedAt, malSyncPage.deletedAt
                ) && Intrinsics.areEqual(mal, malSyncPage.mal) && Intrinsics.areEqual(
                    anilist, malSyncPage.anilist
                ) && Intrinsics.areEqual(malUrl, malSyncPage.malUrl)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = identifier
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = type
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = page
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = title
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = url
            val hashCode5 = (hashCode4 + (str5?.hashCode() ?: 0)) * 31
            val str6 = image
            val hashCode6 = (hashCode5 + (str6?.hashCode() ?: 0)) * 31
            val bool = hentai
            val hashCode7 = (hashCode6 + (bool?.hashCode() ?: 0)) * 31
            val bool2 = sticky
            val hashCode8 = (hashCode7 + (bool2?.hashCode() ?: 0)) * 31
            val bool3 = active
            val hashCode9 = (hashCode8 + (bool3?.hashCode() ?: 0)) * 31
            val str7 = actor
            val hashCode10 = (hashCode9 + (str7?.hashCode() ?: 0)) * 31
            val num: Integer = malId
            val hashCode11: Int = (hashCode10 + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = aniId
            val hashCode12: Int = (hashCode11 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str8 = createdAt
            val hashCode13 = (hashCode12 + (str8?.hashCode() ?: 0)) * 31
            val str9 = updatedAt
            val hashCode14 = (hashCode13 + (str9?.hashCode() ?: 0)) * 31
            val str10 = deletedAt
            val hashCode15 = (hashCode14 + (str10?.hashCode() ?: 0)) * 31
            val mal = mal
            val hashCode16 = (hashCode15 + (mal?.hashCode() ?: 0)) * 31
            val anilist = anilist
            val hashCode17 = (hashCode16 + (anilist?.hashCode() ?: 0)) * 31
            val str11 = malUrl
            return hashCode17 + (str11?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MalSyncPage(identifier=" + identifier + ", type=" + type + ", page=" + page + ", title=" + title + ", url=" + url + ", image=" + image + ", hentai=" + hentai + ", sticky=" + sticky + ", active=" + active + ", actor=" + actor + ", malId=" + malId + ", aniId=" + aniId + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + ", Mal=" + mal + ", Anilist=" + anilist + ", malUrl=" + malUrl + ')'
        }

        init {
            malId = num
            aniId = num2
            createdAt = str8
            updatedAt = str9
            deletedAt = str10
            this.mal = mal
            this.anilist = anilist
            malUrl = str11
        }

        fun getMalId(): Integer {
            return malId
        }

        fun getAniId(): Integer {
            return aniId
        }
    }

    /* compiled from: SyncUtil.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000c2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00062"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil\$Anilist;", "", "id", "", "malId", "type", "", "title", "url", "image", MonitorLogServerProtocol.PARAM_CATEGORY, "hentai", "", "createdAt", "updatedAt", "deletedAt", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCreatedAt", "getDeletedAt", "getHentai", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getMalId", "getTitle", "getType", "getUpdatedAt", "getUrl", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/utils/SyncUtil\$Anilist;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Anilist(
        @JsonProperty("id") num: Integer,
        @JsonProperty("malId") num2: Integer,
        @JsonProperty("type") str: String,
        @JsonProperty("title") str2: String,
        @JsonProperty("url") str3: String,
        @JsonProperty("image") str4: String,
        @JsonProperty("category") str5: String,
        @JsonProperty("hentai") bool: Boolean,
        @JsonProperty("createdAt") str6: String,
        @JsonProperty("updatedAt") str7: String,
        @JsonProperty("deletedAt") str8: String
    ) {
        val category: String
        val createdAt: String
        val deletedAt: String
        val hentai: Boolean

        /* renamed from: id */
        private val f10029id: Integer
        val image: String
        private val malId: Integer
        val title: String
        val type: String
        val updatedAt: String
        val url: String
        operator fun component1(): Integer {
            return f10029id
        }

        operator fun component10(): String {
            return updatedAt
        }

        operator fun component11(): String {
            return deletedAt
        }

        operator fun component2(): Integer {
            return malId
        }

        operator fun component3(): String {
            return type
        }

        operator fun component4(): String {
            return title
        }

        operator fun component5(): String {
            return url
        }

        operator fun component6(): String {
            return image
        }

        operator fun component7(): String {
            return category
        }

        operator fun component8(): Boolean {
            return hentai
        }

        operator fun component9(): String {
            return createdAt
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("malId") num2: Integer,
            @JsonProperty("type") str: String,
            @JsonProperty("title") str2: String,
            @JsonProperty("url") str3: String,
            @JsonProperty("image") str4: String,
            @JsonProperty("category") str5: String,
            @JsonProperty("hentai") bool: Boolean,
            @JsonProperty("createdAt") str6: String,
            @JsonProperty("updatedAt") str7: String,
            @JsonProperty("deletedAt") str8: String
        ): Anilist {
            return Anilist(num, num2, str, str2, str3, str4, str5, bool, str6, str7, str8)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Anilist) {
                val anilist = obj as Anilist
                return Intrinsics.areEqual(f10029id, anilist.f10029id) && Intrinsics.areEqual(
                    malId, anilist.malId
                ) && Intrinsics.areEqual(type, anilist.type) && Intrinsics.areEqual(
                    title, anilist.title
                ) && Intrinsics.areEqual(url, anilist.url) && Intrinsics.areEqual(
                    image, anilist.image
                ) && Intrinsics.areEqual(category, anilist.category) && Intrinsics.areEqual(
                    hentai, anilist.hentai
                ) && Intrinsics.areEqual(createdAt, anilist.createdAt) && Intrinsics.areEqual(
                    updatedAt, anilist.updatedAt
                ) && Intrinsics.areEqual(
                    deletedAt, anilist.deletedAt
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f10029id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = malId
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val str = type
            val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
            val str2 = title
            val hashCode4 = (hashCode3 + (str2?.hashCode() ?: 0)) * 31
            val str3 = url
            val hashCode5 = (hashCode4 + (str3?.hashCode() ?: 0)) * 31
            val str4 = image
            val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
            val str5 = category
            val hashCode7 = (hashCode6 + (str5?.hashCode() ?: 0)) * 31
            val bool = hentai
            val hashCode8 = (hashCode7 + (bool?.hashCode() ?: 0)) * 31
            val str6 = createdAt
            val hashCode9 = (hashCode8 + (str6?.hashCode() ?: 0)) * 31
            val str7 = updatedAt
            val hashCode10 = (hashCode9 + (str7?.hashCode() ?: 0)) * 31
            val str8 = deletedAt
            return hashCode10 + (str8?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Anilist(id=" + f10029id + ", malId=" + malId + ", type=" + type + ", title=" + title + ", url=" + url + ", image=" + image + ", category=" + category + ", hentai=" + hentai + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + ')'
        }

        init {
            f10029id = num
            malId = num2
            type = str
            title = str2
            url = str3
            image = str4
            category = str5
            hentai = bool
            createdAt = str6
            updatedAt = str7
            deletedAt = str8
        }

        val id: Integer
            get() = f10029id

        fun getMalId(): Integer {
            return malId
        }
    }

    /* compiled from: SyncUtil.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u0006/"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SyncUtil\$Mal;", "", "id", "", "type", "", "title", "url", "image", MonitorLogServerProtocol.PARAM_CATEGORY, "hentai", "", "createdAt", "updatedAt", "deletedAt", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCreatedAt", "getDeletedAt", "getHentai", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getTitle", "getType", "getUpdatedAt", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/utils/SyncUtil\$Mal;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Mal(
        @JsonProperty("id") num: Integer,
        @JsonProperty("type") str: String,
        @JsonProperty("title") str2: String,
        @JsonProperty("url") str3: String,
        @JsonProperty("image") str4: String,
        @JsonProperty("category") str5: String,
        @JsonProperty("hentai") bool: Boolean,
        @JsonProperty("createdAt") str6: String,
        @JsonProperty("updatedAt") str7: String,
        @JsonProperty("deletedAt") str8: String
    ) {
        val category: String
        val createdAt: String
        val deletedAt: String
        val hentai: Boolean

        /* renamed from: id */
        private val f10030id: Integer
        val image: String
        val title: String
        val type: String
        val updatedAt: String
        val url: String
        operator fun component1(): Integer {
            return f10030id
        }

        operator fun component10(): String {
            return deletedAt
        }

        operator fun component2(): String {
            return type
        }

        operator fun component3(): String {
            return title
        }

        operator fun component4(): String {
            return url
        }

        operator fun component5(): String {
            return image
        }

        operator fun component6(): String {
            return category
        }

        operator fun component7(): Boolean {
            return hentai
        }

        operator fun component8(): String {
            return createdAt
        }

        operator fun component9(): String {
            return updatedAt
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("type") str: String,
            @JsonProperty("title") str2: String,
            @JsonProperty("url") str3: String,
            @JsonProperty("image") str4: String,
            @JsonProperty("category") str5: String,
            @JsonProperty("hentai") bool: Boolean,
            @JsonProperty("createdAt") str6: String,
            @JsonProperty("updatedAt") str7: String,
            @JsonProperty("deletedAt") str8: String
        ): Mal {
            return Mal(num, str, str2, str3, str4, str5, bool, str6, str7, str8)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Mal) {
                val mal = obj as Mal
                return Intrinsics.areEqual(f10030id, mal.f10030id) && Intrinsics.areEqual(
                    type, mal.type
                ) && Intrinsics.areEqual(title, mal.title) && Intrinsics.areEqual(
                    url, mal.url
                ) && Intrinsics.areEqual(image, mal.image) && Intrinsics.areEqual(
                    category, mal.category
                ) && Intrinsics.areEqual(hentai, mal.hentai) && Intrinsics.areEqual(
                    createdAt, mal.createdAt
                ) && Intrinsics.areEqual(updatedAt, mal.updatedAt) && Intrinsics.areEqual(
                    deletedAt, mal.deletedAt
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f10030id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = type
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = title
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val str3 = url
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val str4 = image
            val hashCode5 = (hashCode4 + (str4?.hashCode() ?: 0)) * 31
            val str5 = category
            val hashCode6 = (hashCode5 + (str5?.hashCode() ?: 0)) * 31
            val bool = hentai
            val hashCode7 = (hashCode6 + (bool?.hashCode() ?: 0)) * 31
            val str6 = createdAt
            val hashCode8 = (hashCode7 + (str6?.hashCode() ?: 0)) * 31
            val str7 = updatedAt
            val hashCode9 = (hashCode8 + (str7?.hashCode() ?: 0)) * 31
            val str8 = deletedAt
            return hashCode9 + (str8?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Mal(id=" + f10030id + ", type=" + type + ", title=" + title + ", url=" + url + ", image=" + image + ", category=" + category + ", hentai=" + hentai + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + ')'
        }

        init {
            f10030id = num
            type = str
            title = str2
            url = str3
            image = str4
            category = str5
            hentai = bool
            createdAt = str6
            updatedAt = str7
            deletedAt = str8
        }

        val id: Integer
            get() = f10030id
    }

    companion object {
        private const val TAG = "SYNCUTIL"
        @kotlin.jvm.JvmField
        val INSTANCE = SyncUtil()
        private val regexs: List<Regex> = CollectionsKt.listOf<Object>(
            *arrayOf<Regex>(
                Regex("(9anime)\\.(?:to|center|id)/watch/(?:.*?)\\.([^/?]*)"),
                Regex("(gogoanime|gogoanimes)\\..*?/category/([^/?]*)"),
                Regex("(twist\\.moe)/a/([^/?]*)")
            ) as Array<Object>
        )
        private const val NINE_ANIME = "9anime"
        private const val GOGOANIME = "Gogoanime"
        private const val TWIST_MOE = "Twistmoe"
        private val matchList: Map<String, String> = MapsKt.mapOf(
            TuplesKt.m100to<Any, Any>(
                NINE_ANIME, NINE_ANIME
            ),
            TuplesKt.m100to<Any, Any>("gogoanime", GOGOANIME),
            TuplesKt.m100to<Any, Any>("gogoanimes", GOGOANIME),
            TuplesKt.m100to<Any, Any>("twist.moe", TWIST_MOE)
        )

        fun  /* synthetic */`getIdsFromSlug$default`(
            syncUtil: SyncUtil,
            str: String?,
            str2: String?,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var str2 = str2
            if (i and 2 != 0) {
                str2 = GOGOANIME
            }
            return syncUtil.getIdsFromSlug(str, str2, continuation)
        }

        fun  /* synthetic */`getUrlsFromId$default`(
            syncUtil: SyncUtil,
            str: String?,
            str2: String?,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var str2 = str2
            if (i and 2 != 0) {
                str2 = "anilist"
            }
            return syncUtil.getUrlsFromId(str, str2, continuation)
        }
    }
}