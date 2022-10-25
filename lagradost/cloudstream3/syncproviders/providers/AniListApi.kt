package com.lagradost.cloudstream3.syncproviders.providers

import android.content.Context
import com.lagradost.cloudstream3.AcraApplication
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: AniListApi.kt */
@Metadata(
    m108d1 = ["\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b>\u0018\u0000 ^2\u00020\u00012\u00020\u0002:IQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0002J!\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"2\u0006\u0010$\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'¢\u0006\u0002\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\u0007H\u0002J\u001b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010$\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0013\u0010/\u001a\u0004\u0018\u000100H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0016J\u001b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010$\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u001b\u00106\u001a\u0004\u0018\u0001072\u0006\u0010$\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u0010\u00108\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0004H\u0002J\u001d\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010<J\u0019\u0010=\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u0006\u0010>\u001a\u00020\u001fJ\b\u0010?\u001a\u00020\u001fH\u0016J\n\u0010@\u001a\u0004\u0018\u00010AH\u0016J%\u0010B\u001a\u0004\u0018\u00010\u00072\u0006\u0010C\u001a\u00020\u00072\b\b\u0002\u0010D\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJ5\u0010F\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u00042\b\u0010J\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010KJ!\u0010I\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010L\u001a\u000207H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010MJ!\u0010N\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010\"2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u0019\u0010P\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u001a\u0010\u0011\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008d\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi;", "Lcom/lagradost/cloudstream3/syncproviders/AccountManager;", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI;", FirebaseAnalytics.Param.INDEX, "", "(I)V", "createAccountUrl", "", "getCreateAccountUrl", "()Ljava/lang/String;", "icon", "getIcon", "()Ljava/lang/Integer;", "idPrefix", "getIdPrefix", SDKConstants.PARAM_KEY, "getKey", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "redirectUrl", "getRedirectUrl", "requiresLogin", "", "getRequiresLogin", "()Z", "authenticate", "", "checkToken", "getAllSeasons", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonResponse;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnilistAnimeListSmart", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Lists;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnilistListCached", "()[Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Lists;", "getAuth", "getDataAboutId", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListTitleHolder;", "getFullAnilistList", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$FullAnilistList;", "getIdFromUrl", "url", "getResult", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "getUrlFromId", "getUser", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListUser;", "setSettings", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRedirect", "initGetUser", "logOut", "loginInfo", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "postApi", "q", "cache", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postDataAboutId", "type", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;", "score", "progress", "(ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "status", "(Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "toggleLike", "AniListAvatar", "AniListData", "AniListFavoritesMediaConnection", "AniListFavourites", "AniListRoot", "AniListTitleHolder", "AniListUser", "AniListViewer", "Character", "CharacterConnection", "CharacterEdge", "CharacterImage", "CharacterName", "Companion", "CompletedAt", "CoverImage", "Data", "Entries", "FullAnilistList", "GetDataData", "GetDataMedia", "GetDataMediaListEntry", "GetDataRoot", "GetSearchData", "GetSearchMedia", "GetSearchPage", "GetSearchRoot", "GetSearchTitle", "LikeAnime", "LikeData", "LikeFavourites", "LikeNode", "LikePageInfo", "LikeRoot", "LikeViewer", "Lists", "Media", "MediaCoverImage", "MediaListCollection", "MediaRecommendation", "MediaTitle", "MediaTrailer", "Nodes", "Recommendation", "RecommendationConnection", "RecommendationEdge", "Recommendations", "SeasonData", "SeasonEdge", "SeasonEdges", "SeasonMedia", "SeasonNextAiringEpisode", "SeasonNode", "SeasonResponse", "Staff", "StaffImage", "StaffName", "StartedAt", "Title", "TrailerObject", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class AniListApi(i: Int) : AccountManager(i), SyncAPI {
    private val createAccountUrl: String
    private val icon: Int

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val idPrefix = "anilist"

    // com.lagradost.cloudstream3.syncproviders.OAuth2API
    @get:Override
    val key = "6871"
    private var mainUrl = "https://anilist.co"
    private var name = "AniList"

    // com.lagradost.cloudstream3.syncproviders.OAuth2API
    @get:Override
    val redirectUrl = "anilistlogin"

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val requiresLogin: Boolean

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getName(): String {
        return name
    }

    fun setName(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        name = str
    }

    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    override fun getMainUrl(): String {
        return mainUrl
    }

    fun setMainUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        mainUrl = str
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getIcon(): Integer? {
        return Integer.valueOf(icon)
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getCreateAccountUrl(): String? {
        return createAccountUrl
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun loginInfo(): LoginInfo? {
        /*
            r5 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = r5.getAccountId()
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            java.lang.String r4 = "anilist_user"
            java.lang.String r1 = r3.getFolderName(r1, r4)
            android.content.SharedPreferences r0 = r3.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L35
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser> r3 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListUser.class
            java.lang.Object r0 = r1.readValue(r0, r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r0 = r2
        L36:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListUser) r0
            if (r0 == 0) goto L4c
            com.lagradost.cloudstream3.syncproviders.AuthAPI$LoginInfo r1 = new com.lagradost.cloudstream3.syncproviders.AuthAPI$LoginInfo
            java.lang.String r2 = r0.getPicture()
            java.lang.String r0 = r0.getName()
            int r3 = r5.getAccountIndex()
            r1.<init>(r2, r0, r3)
            return r1
        L4c:
            return r2
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.loginInfo():com.lagradost.cloudstream3.syncproviders.AuthAPI\$LoginInfo")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun logOut() {
        removeAccountKeys()
    }

    @Override // com.lagradost.cloudstream3.syncproviders.OAuth2API
    override fun authenticate() {
        AcraApplication.Companion.openBrowser("https://anilist.co/api/v2/oauth/authorize?client_id=$key&response_type=token")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */ /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    @Override // com.lagradost.cloudstream3.syncproviders.OAuth2API
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun handleRedirect(r20: String?, r21: Continuation<in Boolean?>?): Any {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$handleRedirect$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$handleRedirect$1 r2 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$handleRedirect$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$handleRedirect$1 r2 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$handleRedirect$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L38
            if (r4 != r6) goto L30
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lb4
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            com.lagradost.cloudstream3.utils.AppUtils r1 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            java.net.URL r4 = new java.net.URL
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r8 = "cloudstreamapp"
            java.lang.String r9 = "https"
            r7 = r20
            java.lang.String r13 = kotlin.text.StringsKt.replace$default(r7, r8, r9, r10, r11, r12)
            r16 = 0
            r17 = 4
            r18 = 0
            java.lang.String r14 = "/#"
            java.lang.String r15 = "?"
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r13, r14, r15, r16, r17, r18)
            r4.<init>(r7)
            java.util.Map r1 = r1.splitQuery(r4)
            java.lang.String r4 = "access_token"
            java.lang.Object r4 = r1.get(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = "expires_in"
            java.lang.Object r1 = r1.get(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.lagradost.cloudstream3.syncproviders.AccountManager$Companion r7 = com.lagradost.cloudstream3.syncproviders.AccountManager.Companion
            long r7 = r7.getUnixTime()
            long r9 = java.lang.Long.parseLong(r1)
            long r7 = r7 + r9
            r19.switchToNewAccount()
            com.lagradost.cloudstream3.AcraApplication$Companion r1 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r9 = r19.getAccountId()
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.boxing.boxLong(r7)
            java.lang.String r8 = "anilist_unixtime"
            r1.setKey(r9, r8, r7)
            com.lagradost.cloudstream3.AcraApplication$Companion r1 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r7 = r19.getAccountId()
            java.lang.String r8 = "anilist_token"
            r1.setKey(r7, r8, r4)
            com.lagradost.cloudstream3.AcraApplication$Companion r1 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r6)
            java.lang.String r7 = "anilist_should_update_list"
            r1.setKey(r7, r4)
            r1 = 0
            r2.label = r6
            java.lang.Object r1 = getUser$default(r0, r5, r2, r6, r1)
            if (r1 != r3) goto Lb4
            return r3
        Lb4:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser r1 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListUser) r1
            if (r1 == 0) goto Lb9
            r5 = 1
        Lb9:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r5)
            return r1
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.handleRedirect(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    override fun getIdFromUrl(url: String?): String {
        Intrinsics.checkNotNullParameter(url, "url")
        return StringsKt.removeSuffix(
            StringsKt.removePrefix(
                url,
                (getMainUrl() + "/anime/") as CharSequence
            ), "/" as CharSequence
        )
    }

    private fun getUrlFromId(i: Int): String {
        return getMainUrl() + "/anime/" + i
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r19: String?,
        r20: Continuation<in MutableList<SyncSearchResult?>?>?
    ): Any {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$search$1 r2 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$search$1 r2 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi r2 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L4d
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion r1 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion
            r2.L$0 = r0
            r2.label = r5
            r4 = r19
            java.lang.Object r1 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion.access$searchShows(r1, r4, r2)
            if (r1 != r3) goto L4c
            return r3
        L4c:
            r2 = r0
        L4d:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$GetSearchRoot r1 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.GetSearchRoot) r1
            r3 = 0
            if (r1 != 0) goto L53
            return r3
        L53:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$GetSearchPage r1 = r1.getData()
            if (r1 == 0) goto Lc0
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$GetSearchData r1 = r1.getPage()
            if (r1 == 0) goto Lc0
            java.util.List r1 = r1.getMedia()
            if (r1 == 0) goto Lc0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r1 = r1.iterator()
        L78:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lbc
            java.lang.Object r5 = r1.next()
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$GetSearchMedia r5 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.GetSearchMedia) r5
            com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncSearchResult r15 = new com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncSearchResult
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$GetSearchTitle r6 = r5.getTitle()
            java.lang.String r7 = r6.getRomaji()
            if (r7 != 0) goto L91
            return r3
        L91:
            java.lang.String r8 = r2.getName()
            int r6 = r5.getId()
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r6 = r5.getId()
            java.lang.String r10 = r2.getUrlFromId(r6)
            java.lang.String r11 = r5.getBannerImage()
            r12 = 0
            r13 = 0
            r14 = 0
            r5 = 0
            r16 = 480(0x1e0, float:6.73E-43)
            r17 = 0
            r6 = r15
            r3 = r15
            r15 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.add(r3)
            r3 = 0
            goto L78
        Lbc:
            r3 = r4
            java.util.List r3 = (java.util.List) r3
            goto Lc1
        Lc0:
            r3 = 0
        Lc1:
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ca, code lost:
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:127:0x01f0  */ /* JADX WARN: Removed duplicated region for block: B:135:0x0213  */ /* JADX WARN: Removed duplicated region for block: B:136:0x021f  */ /* JADX WARN: Removed duplicated region for block: B:144:0x023f  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */ /* JADX WARN: Removed duplicated region for block: B:173:0x0201 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:175:0x00ed A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:177:0x02ad A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:180:0x0239 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */ /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */ /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */ /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */ /* JADX WARN: Removed duplicated region for block: B:99:0x0192  */
    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getResult(r42: String?, r43: Continuation<in SyncResult?>?): Any {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getResult(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */ /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getStatus(r12: String?, r13: Continuation<in SyncStatus?>?): Any {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getStatus$1
            if (r0 == 0) goto L14
            r0 = r13
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getStatus$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getStatus$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getStatus$1
            r0.<init>(r11, r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r13)
            goto L49
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Integer r12 = kotlin.text.StringsKt.toIntOrNull(r12)
            if (r12 == 0) goto L6f
            int r12 = r12.intValue()
            r0.label = r3
            java.lang.Object r13 = r11.getDataAboutId(r12, r0)
            if (r13 != r1) goto L49
            return r1
        L49:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListTitleHolder r13 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListTitleHolder) r13
            if (r13 != 0) goto L4e
            return r4
        L4e:
            java.lang.Integer r7 = r13.getScore()
            java.lang.Integer r8 = r13.getProgress()
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$AniListStatusType r12 = r13.getType()
            if (r12 == 0) goto L6f
            int r6 = r12.getValue()
            java.lang.Boolean r9 = r13.isFavourite()
            java.lang.Integer r10 = r13.getEpisodes()
            com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncStatus r12 = new com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncStatus
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L6f:
            return r4
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getStatus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    override fun score(
        str: String?,
        syncStatus: SyncStatus,
        continuation: Continuation<in Boolean?>?
    ): Object {
        val intOrNull: Integer? = StringsKt.toIntOrNull(str)
        return if (intOrNull != null) {
            postDataAboutId(
                intOrNull.intValue(),
                AniListApi.Companion.Companion.fromIntToAnimeStatus(syncStatus.getStatus()),
                syncStatus.getScore(),
                syncStatus.getWatchedEpisodes(),
                continuation
            )
        } else boxing.boxBoolean(false)
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J/\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion;", "", "()V", "ANILIST_CACHED_LIST", "", "ANILIST_SHOULD_UPDATE_LIST", "ANILIST_TOKEN_KEY", "ANILIST_UNIXTIME_KEY", "ANILIST_USER_KEY", "aniListStatusString", "", "[Ljava/lang/String;", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "convertAnilistStringToStatus", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;", TypedValues.Custom.S_STRING, "fixName", "name", "fromIntToAnimeStatus", "inp", "", "getSeason", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonResponse;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShowId", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchMedia;", "malId", "year", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchShows", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchRoot;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AniListStatusType", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        private fun fixName(str: String): String {
            val ROOT: Locale = Locale.ROOT
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT")
            val lowerCase: String = str.toLowerCase(ROOT)
            Intrinsics.checkNotNullExpressionValue(
                lowerCase,
                "this as java.lang.String).toLowerCase(locale)"
            )
            return Regex("[^a-zA-Z0-9]").replace(
                StringsKt.`replace$default`(
                    lowerCase,
                    " ",
                    "",
                    false,
                    4,
                    null as Object?
                ), ""
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun searchShows(r24: String?, r25: Continuation<in GetSearchRoot?>?): Any {
            /*
                Method dump skipped, instructions count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion.searchShows(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */ /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */ /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */ /* JADX WARN: Removed duplicated region for block: B:76:0x0105 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun getShowId(
            r25: String?,
            r26: String?,
            r27: Int?,
            r28: Continuation<in GetSearchMedia?>?
        ): Any {
            /*
                Method dump skipped, instructions count: 413
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion.getShowId(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* compiled from: AniListApi.kt */
        @Metadata(
            m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\u000cj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"],
            m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "Watching", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Paused", "Dropped", "Planning", "ReWatching", "None", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        /* loaded from: classes3.dex */
        enum class AniListStatusType(var value: Int) {
            Watching(0), Completed(1), Paused(2), Dropped(3), Planning(4), ReWatching(5), None(-1);

        }

        fun fromIntToAnimeStatus(i: Int): AniListStatusType {
            return when (i) {
                -1 -> AniListStatusType.None
                0 -> AniListStatusType.Watching
                1 -> AniListStatusType.Completed
                2 -> AniListStatusType.Paused
                3 -> AniListStatusType.Dropped
                4 -> AniListStatusType.Planning
                5 -> AniListStatusType.ReWatching
                else -> AniListStatusType.None
            }
        }

        fun convertAnilistStringToStatus(string: String?): AniListStatusType {
            Intrinsics.checkNotNullParameter(string, "string")
            return fromIntToAnimeStatus(
                ArraysKt.indexOf(
                    AniListApi.Companion.aniListStatusString,
                    string
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun getSeason(r24: Int, r25: Continuation<in SeasonResponse?>?): Any {
            /*
                r23 = this;
                r0 = r25
                boolean r1 = r0 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$1
                if (r1 == 0) goto L18
                r1 = r0
                com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$1 r1 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 & r3
                if (r2 == 0) goto L18
                int r0 = r1.label
                int r0 = r0 - r3
                r1.label = r0
                r2 = r23
                goto L1f
            L18:
                com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$1 r1 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$1
                r2 = r23
                r1.<init>(r2, r0)
            L1f:
                java.lang.Object r0 = r1.result
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.label
                r15 = 1
                if (r3 == 0) goto L38
                if (r3 != r15) goto L30
                kotlin.ResultKt.throwOnFailure(r0)
                goto L8b
            L30:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L38:
                kotlin.ResultKt.throwOnFailure(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "\n               query ($id: Int = "
                r0.append(r3)
                r3 = r24
                r0.append(r3)
                java.lang.String r3 = ") {\n                   Media (id: $id, type: ANIME) {\n                       id\n                       idMal\n                       coverImage {\n                           extraLarge\n                           large\n                           medium\n                           color\n                       }\n                       title {\n                           romaji\n                           english\n                           native\n                           userPreferred\n                       }\n                       duration\n                       episodes\n                       genres\n                       synonyms\n                       averageScore\n                       isAdult\n                       description(asHtml: false)\n                       characters(sort: ROLE page: 1 perPage: 20) {\n                           edges {\n                               role\n                               voiceActors {\n                                   name {\n                                       userPreferred\n                                       full\n                                       native\n                                   }\n                                   age\n                                   image {\n                                       large\n                                       medium\n                                   }\n                               }\n                               node {\n                                   name {\n                                       userPreferred\n                                       full\n                                       native\n                                   }\n                                   age\n                                   image {\n                                       large\n                                       medium\n                                   }\n                               }\n                           }\n                       }\n                       trailer {\n                           id\n                           site\n                           thumbnail\n                       }\n                       relations {\n                           edges {\n                                id\n                                relationType(version: 2)\n                                node {\n                                     id\n                                     coverImage {\n                                         extraLarge\n                                         large\n                                         medium\n                                         color\n                                     }\n                                }\n                           }\n                       }\n                       recommendations {\n                           edges {\n                               node {\n                                   mediaRecommendation {\n                                       id\n                                       coverImage {\n                                           extraLarge\n                                           large\n                                           medium\n                                           color\n                                       }\n                                       title {\n                                           romaji\n                                           english\n                                           native\n                                           userPreferred\n                                       }\n                                   }\n                               }\n                           }\n                       }\n                       nextAiringEpisode {\n                           timeUntilAiring\n                           episode\n                       }\n                       format\n                   }\n               }\n        "
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.lagradost.cloudstream3.utils.Extensions$RequestCustom r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
                com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.String r9 = "query"
                kotlin.Pair r0 = kotlin.TuplesKt.m100to(r9, r0)
                java.util.Map r9 = kotlin.collections.MapsKt.mapOf(r0)
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r0 = 0
                r5 = 1
                r15 = r0
                r16 = 0
                r18 = 0
                r19 = 0
                r21 = 31710(0x7bde, float:4.4435E-41)
                r22 = 0
                r1.label = r5
                java.lang.String r0 = "https://graphql.anilist.co"
                r5 = r4
                r4 = r0
                r20 = r1
                r0 = r5
                r5 = 0
                java.lang.Object r1 = com.lagradost.nicehttp.Requests.post$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22)
                if (r1 != r0) goto L8a
                return r0
            L8a:
                r0 = r1
            L8b:
                com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
                java.lang.String r0 = r0.getText()
                com.lagradost.cloudstream3.utils.AppUtils r1 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
                r1 = 0
                if (r0 != 0) goto L97
                goto Laa
            L97:
                com.fasterxml.jackson.databind.json.JsonMapper r3 = com.lagradost.cloudstream3.MainAPIKt.getMapper()     // Catch: java.lang.Exception -> La9
                com.fasterxml.jackson.databind.ObjectMapper r3 = (com.fasterxml.jackson.databind.ObjectMapper) r3     // Catch: java.lang.Exception -> La9
                com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$$inlined$tryParseJson$1 r4 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion$getSeason$$inlined$tryParseJson$1     // Catch: java.lang.Exception -> La9
                r4.<init>()     // Catch: java.lang.Exception -> La9
                com.fasterxml.jackson.core.type.TypeReference r4 = (com.fasterxml.jackson.core.type.TypeReference) r4     // Catch: java.lang.Exception -> La9
                java.lang.Object r1 = r3.readValue(r0, r4)     // Catch: java.lang.Exception -> La9
                goto Laa
            La9:
            Laa:
                com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonResponse r1 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.SeasonResponse) r1
                if (r1 == 0) goto Laf
                return r1
            Laf:
                com.lagradost.cloudstream3.ErrorLoadingException r1 = new com.lagradost.cloudstream3.ErrorLoadingException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error parsing "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.<init>(r0)
                throw r1
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion.getSeason(int, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }

    init {
        icon = R.drawable.ic_anilist_icon
        requiresLogin = true
        createAccountUrl = getMainUrl() + "/signup"
    }

    fun initGetUser() {
        if (auth == null) {
            return
        }
        Coroutines.INSTANCE.ioSafe(`AniListApi$initGetUser$1`(this, null))
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r5 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun checkToken(): Boolean {
        /*
            r8 = this;
            com.lagradost.cloudstream3.syncproviders.AccountManager$Companion r0 = com.lagradost.cloudstream3.syncproviders.AccountManager.Companion
            long r0 = r0.getUnixTime()
            com.lagradost.cloudstream3.AcraApplication$Companion r2 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r3 = r8.getAccountId()
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            android.content.Context r2 = r2.getContext()
            r5 = 0
            if (r2 == 0) goto L47
            com.lagradost.cloudstream3.utils.DataStore r6 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            java.lang.String r7 = "anilist_unixtime"
            java.lang.String r3 = r6.getFolderName(r3, r7)
            android.content.SharedPreferences r2 = r6.getSharedPrefs(r2)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = r2.getString(r3, r5)     // Catch: java.lang.Exception -> L43
            if (r2 != 0) goto L2d
            r5 = r4
            goto L44
        L2d:
            java.lang.String r3 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Exception -> L43
            com.fasterxml.jackson.databind.json.JsonMapper r3 = r6.getMapper()     // Catch: java.lang.Exception -> L43
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Object r2 = r3.readValue(r2, r6)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Exception -> L43
            r5 = r2
            goto L44
        L43:
        L44:
            if (r5 != 0) goto L47
            goto L48
        L47:
            r4 = r5
        L48:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            long r2 = r4.longValue()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.checkToken():boolean")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */ /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getDataAboutId(r11: Int, r12: Continuation<in AniListTitleHolder?>?): Any {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getDataAboutId(int, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private val auth: String?
        private get() {
            val companion: AcraApplication.Companion = AcraApplication.Companion
            val accountId: String = getAccountId()
            val context: Context = companion.getContext()
            var obj: Object? = null
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String = dataStore.getSharedPrefs(context).getString(
                        dataStore.getFolderName(
                            accountId,
                            AniListApi.Companion.ANILIST_TOKEN_KEY
                        ), null
                    )
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue(string, String::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        obj = readValue
                    }
                } catch (unused: Exception) {
                }
            }
            return obj
        }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun postApi(r24: String?, r25: Boolean, r26: Continuation<in String?>?): Any {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.postApi(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000cJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000cJH\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\u000cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaRecommendation;", "", "id", "", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "idMal", "coverImage", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "averageScore", "(ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;Ljava/lang/Integer;)V", "getAverageScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoverImage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "getId", "()I", "getIdMal", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaRecommendation;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MediaRecommendation(/* renamed from: id */
        @param:JsonProperty("id") val id: Int,
        @param:JsonProperty("title") val title: Title,
        @JsonProperty("idMal") num: Integer,
        @JsonProperty("coverImage") coverImage: CoverImage,
        @JsonProperty("averageScore") num2: Integer
    ) {
        private val averageScore: Integer
        val coverImage: CoverImage

        private val idMal: Integer
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): Title {
            return title
        }

        operator fun component3(): Integer {
            return idMal
        }

        operator fun component4(): CoverImage {
            return coverImage
        }

        operator fun component5(): Integer {
            return averageScore
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("title") title: Title,
            @JsonProperty("idMal") num: Integer,
            @JsonProperty("coverImage") coverImage: CoverImage,
            @JsonProperty("averageScore") num2: Integer
        ): MediaRecommendation {
            return MediaRecommendation(i, title, num, coverImage, num2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MediaRecommendation) {
                val mediaRecommendation = obj as MediaRecommendation
                return id == mediaRecommendation.id && Intrinsics.areEqual(
                    title,
                    mediaRecommendation.title
                ) && Intrinsics.areEqual(
                    idMal, mediaRecommendation.idMal
                ) && Intrinsics.areEqual(
                    coverImage, mediaRecommendation.coverImage
                ) && Intrinsics.areEqual(
                    averageScore, mediaRecommendation.averageScore
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = id * 31
            val title = title
            val hashCode = (i + (title?.hashCode() ?: 0)) * 31
            val num: Integer = idMal
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val coverImage = coverImage
            val hashCode3 = (hashCode2 + (coverImage?.hashCode() ?: 0)) * 31
            val num2: Integer = averageScore
            return hashCode3 + if (num2 != null) num2.hashCode() else 0
        }

        override fun toString(): String {
            return "MediaRecommendation(id=" + id + ", title=" + title + ", idMal=" + idMal + ", coverImage=" + coverImage + ", averageScore=" + averageScore + ')'
        }

        init {
            idMal = num
            this.coverImage = coverImage
            averageScore = num2
        }

        fun getIdMal(): Integer {
            return idMal
        }

        fun getAverageScore(): Integer {
            return averageScore
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                mediaRecommendation: MediaRecommendation,
                i: Int,
                title: Title,
                num: Integer,
                coverImage: CoverImage,
                num2: Integer,
                i2: Int,
                obj: Object?
            ): MediaRecommendation {
                var i = i
                var title = title
                var num: Integer = num
                var coverImage = coverImage
                var num2: Integer = num2
                if (i2 and 1 != 0) {
                    i = mediaRecommendation.id
                }
                if (i2 and 2 != 0) {
                    title = mediaRecommendation.title
                }
                val title2 = title
                if (i2 and 4 != 0) {
                    num = mediaRecommendation.idMal
                }
                val num3: Integer = num
                if (i2 and 8 != 0) {
                    coverImage = mediaRecommendation.coverImage
                }
                val coverImage2 = coverImage
                if (i2 and 16 != 0) {
                    num2 = mediaRecommendation.averageScore
                }
                return mediaRecommendation.copy(i, title2, num3, coverImage2, num2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$FullAnilistList;", "", "data", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Data;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Data;)V", "getData", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class FullAnilistList(@param:JsonProperty("data") val data: Data) {
        operator fun component1(): Data {
            return data
        }

        fun copy(@JsonProperty("data") data: Data): FullAnilistList {
            return FullAnilistList(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is FullAnilistList && Intrinsics.areEqual(
                data,
                (obj as FullAnilistList).data
            )
        }

        override fun hashCode(): Int {
            val data = data
                ?: return 0
            return data.hashCode()
        }

        override fun toString(): String {
            return "FullAnilistList(data=" + data + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                fullAnilistList: FullAnilistList,
                data: Data,
                i: Int,
                obj: Object?
            ): FullAnilistList {
                var data = data
                if (i and 1 != 0) {
                    data = fullAnilistList.data
                }
                return fullAnilistList.copy(data)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CompletedAt;", "", "year", "", "month", "day", "(III)V", "getDay", "()I", "getMonth", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CompletedAt(
        @param:JsonProperty("year") val year: Int, @param:JsonProperty(
            "month"
        ) val month: Int, @param:JsonProperty("day") val day: Int
    ) {
        operator fun component1(): Int {
            return year
        }

        operator fun component2(): Int {
            return month
        }

        operator fun component3(): Int {
            return day
        }

        fun copy(
            @JsonProperty("year") i: Int,
            @JsonProperty("month") i2: Int,
            @JsonProperty("day") i3: Int
        ): CompletedAt {
            return CompletedAt(i, i2, i3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CompletedAt) {
                val completedAt = obj as CompletedAt
                return year == completedAt.year && month == completedAt.month && day == completedAt.day
            }
            return false
        }

        override fun hashCode(): Int {
            return (year * 31 + month) * 31 + day
        }

        override fun toString(): String {
            return "CompletedAt(year=" + year + ", month=" + month + ", day=" + day + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                completedAt: CompletedAt,
                i: Int,
                i2: Int,
                i3: Int,
                i4: Int,
                obj: Object?
            ): CompletedAt {
                var i = i
                var i2 = i2
                var i3 = i3
                if (i4 and 1 != 0) {
                    i = completedAt.year
                }
                if (i4 and 2 != 0) {
                    i2 = completedAt.month
                }
                if (i4 and 4 != 0) {
                    i3 = completedAt.day
                }
                return completedAt.copy(i, i2, i3)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;", "", "year", "", "month", "day", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDay", "()Ljava/lang/String;", "getMonth", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class StartedAt(
        @param:JsonProperty("year") val year: String, @param:JsonProperty(
            "month"
        ) val month: String, @param:JsonProperty("day") val day: String
    ) {
        operator fun component1(): String {
            return year
        }

        operator fun component2(): String {
            return month
        }

        operator fun component3(): String {
            return day
        }

        fun copy(
            @JsonProperty("year") str: String,
            @JsonProperty("month") str2: String,
            @JsonProperty("day") str3: String
        ): StartedAt {
            return StartedAt(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is StartedAt) {
                val startedAt = obj as StartedAt
                return Intrinsics.areEqual(year, startedAt.year) && Intrinsics.areEqual(
                    month, startedAt.month
                ) && Intrinsics.areEqual(day, startedAt.day)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = year
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = month
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = day
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "StartedAt(year=" + year + ", month=" + month + ", day=" + day + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                startedAt: StartedAt,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): StartedAt {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = startedAt.year
                }
                if (i and 2 != 0) {
                    str2 = startedAt.month
                }
                if (i and 4 != 0) {
                    str3 = startedAt.day
                }
                return startedAt.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "", "english", "", "romaji", "(Ljava/lang/String;Ljava/lang/String;)V", "getEnglish", "()Ljava/lang/String;", "getRomaji", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Title(
        @param:JsonProperty("english") val english: String, @param:JsonProperty(
            "romaji"
        ) val romaji: String
    ) {
        operator fun component1(): String {
            return english
        }

        operator fun component2(): String {
            return romaji
        }

        fun copy(
            @JsonProperty("english") str: String,
            @JsonProperty("romaji") str2: String
        ): Title {
            return Title(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Title) {
                val title = obj as Title
                return Intrinsics.areEqual(english, title.english) && Intrinsics.areEqual(
                    romaji, title.romaji
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = english
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = romaji
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Title(english=" + english + ", romaji=" + romaji + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                title: Title,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): Title {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = title.english
                }
                if (i and 2 != 0) {
                    str2 = title.romaji
                }
                return title.copy(str, str2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "", "medium", "", "large", "(Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CoverImage(
        @param:JsonProperty("medium") val medium: String, @param:JsonProperty(
            "large"
        ) val large: String
    ) {
        operator fun component1(): String {
            return medium
        }

        operator fun component2(): String {
            return large
        }

        fun copy(
            @JsonProperty("medium") str: String,
            @JsonProperty("large") str2: String
        ): CoverImage {
            return CoverImage(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CoverImage) {
                val coverImage = obj as CoverImage
                return Intrinsics.areEqual(medium, coverImage.medium) && Intrinsics.areEqual(
                    large, coverImage.large
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = medium
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = large
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CoverImage(medium=" + medium + ", large=" + large + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                coverImage: CoverImage,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): CoverImage {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = coverImage.medium
                }
                if (i and 2 != 0) {
                    str2 = coverImage.large
                }
                return coverImage.copy(str, str2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000c\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fHÆ\u0003J\u0080\u0001\u0010/\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u000c\u001a\u00020\r2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Media;", "", "id", "", "idMal", "season", "", "seasonYear", "format", "episodes", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "coverImage", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "synonyms", "", "nextAiringEpisode", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "(ILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;)V", "getCoverImage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "getEpisodes", "()I", "getFormat", "()Ljava/lang/String;", "getId", "getIdMal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextAiringEpisode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "getSeason", "getSeasonYear", "getSynonyms", "()Ljava/util/List;", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Media;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Media(
        @JsonProperty("id") i: Int,
        @JsonProperty("idMal") num: Integer,
        @JsonProperty("season") str: String,
        @JsonProperty("seasonYear") i2: Int,
        @JsonProperty("format") str2: String,
        @JsonProperty("episodes") i3: Int,
        @JsonProperty("title") title: Title,
        @JsonProperty("coverImage") coverImage: CoverImage,
        @JsonProperty("synonyms") synonyms: List<String>,
        @JsonProperty("nextAiringEpisode") seasonNextAiringEpisode: SeasonNextAiringEpisode
    ) {
        val coverImage: CoverImage
        val episodes: Int
        val format: String

        /* renamed from: id */
        val id: Int
        private val idMal: Integer
        val nextAiringEpisode: SeasonNextAiringEpisode
        val season: String
        val seasonYear: Int
        val synonyms: List<String>
        val title: Title
        operator fun component1(): Int {
            return id
        }

        operator fun component10(): SeasonNextAiringEpisode {
            return nextAiringEpisode
        }

        operator fun component2(): Integer {
            return idMal
        }

        operator fun component3(): String {
            return season
        }

        operator fun component4(): Int {
            return seasonYear
        }

        operator fun component5(): String {
            return format
        }

        operator fun component6(): Int {
            return episodes
        }

        operator fun component7(): Title {
            return title
        }

        operator fun component8(): CoverImage {
            return coverImage
        }

        operator fun component9(): List<String> {
            return synonyms
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("idMal") num: Integer,
            @JsonProperty("season") str: String,
            @JsonProperty("seasonYear") i2: Int,
            @JsonProperty("format") str2: String,
            @JsonProperty("episodes") i3: Int,
            @JsonProperty("title") title: Title,
            @JsonProperty("coverImage") coverImage: CoverImage,
            @JsonProperty("synonyms") synonyms: List<String>,
            @JsonProperty("nextAiringEpisode") seasonNextAiringEpisode: SeasonNextAiringEpisode
        ): Media {
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(coverImage, "coverImage")
            Intrinsics.checkNotNullParameter(synonyms, "synonyms")
            return Media(
                i,
                num,
                str,
                i2,
                str2,
                i3,
                title,
                coverImage,
                synonyms,
                seasonNextAiringEpisode
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Media) {
                val media = obj as Media
                return id == media.id && Intrinsics.areEqual(
                    idMal,
                    media.idMal
                ) && Intrinsics.areEqual(
                    season, media.season
                ) && seasonYear == media.seasonYear && Intrinsics.areEqual(
                    format, media.format
                ) && episodes == media.episodes && Intrinsics.areEqual(
                    title, media.title
                ) && Intrinsics.areEqual(coverImage, media.coverImage) && Intrinsics.areEqual(
                    synonyms, media.synonyms
                ) && Intrinsics.areEqual(
                    nextAiringEpisode, media.nextAiringEpisode
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = id * 31
            val num: Integer = idMal
            val hashCode: Int = (i + if (num == null) 0 else num.hashCode()) * 31
            val str = season
            val hashCode2 = ((hashCode + (str?.hashCode() ?: 0)) * 31 + seasonYear) * 31
            val str2 = format
            val hashCode3 = (((((hashCode2 + (str2?.hashCode()
                ?: 0)) * 31 + episodes) * 31 + title.hashCode()) * 31 + coverImage.hashCode()) * 31 + synonyms.hashCode()) * 31
            val seasonNextAiringEpisode = nextAiringEpisode
            return hashCode3 + (seasonNextAiringEpisode?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Media(id=" + id + ", idMal=" + idMal + ", season=" + season + ", seasonYear=" + seasonYear + ", format=" + format + ", episodes=" + episodes + ", title=" + title + ", coverImage=" + coverImage + ", synonyms=" + synonyms + ", nextAiringEpisode=" + nextAiringEpisode + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(coverImage, "coverImage")
            Intrinsics.checkNotNullParameter(synonyms, "synonyms")
            id = i
            idMal = num
            season = str
            seasonYear = i2
            format = str2
            episodes = i3
            this.title = title
            this.coverImage = coverImage
            this.synonyms = synonyms
            nextAiringEpisode = seasonNextAiringEpisode
        }

        fun getIdMal(): Integer {
            return idMal
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\u000c\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\u000c\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u0006,"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Entries;", "", "status", "", "completedAt", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CompletedAt;", "startedAt", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;", "updatedAt", "", "progress", "score", "private", "", "media", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Media;", "(Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CompletedAt;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;IIIZLcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Media;)V", "getCompletedAt", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CompletedAt;", "getMedia", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Media;", "getPrivate", "()Z", "getProgress", "()I", "getScore", "getStartedAt", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;", "getStatus", "()Ljava/lang/String;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Entries(
        @JsonProperty("status") str: String,
        @JsonProperty("completedAt") completedAt: CompletedAt,
        @JsonProperty("startedAt") startedAt: StartedAt,
        @JsonProperty("updatedAt") i: Int,
        @JsonProperty("progress") i2: Int,
        @JsonProperty("score") i3: Int,
        @JsonProperty("private") z: Boolean,
        @JsonProperty("media") media: Media
    ) {
        val completedAt: CompletedAt
        val media: Media

        /* renamed from: private  reason: not valid java name */
        val private: Boolean
        val progress: Int
        val score: Int
        val startedAt: StartedAt
        val status: String
        val updatedAt: Int
        operator fun component1(): String {
            return status
        }

        operator fun component2(): CompletedAt {
            return completedAt
        }

        operator fun component3(): StartedAt {
            return startedAt
        }

        operator fun component4(): Int {
            return updatedAt
        }

        operator fun component5(): Int {
            return progress
        }

        operator fun component6(): Int {
            return score
        }

        operator fun component7(): Boolean {
            return private
        }

        operator fun component8(): Media {
            return media
        }

        fun copy(
            @JsonProperty("status") str: String,
            @JsonProperty("completedAt") completedAt: CompletedAt,
            @JsonProperty("startedAt") startedAt: StartedAt,
            @JsonProperty("updatedAt") i: Int,
            @JsonProperty("progress") i2: Int,
            @JsonProperty("score") i3: Int,
            @JsonProperty("private") z: Boolean,
            @JsonProperty("media") media: Media
        ): Entries {
            Intrinsics.checkNotNullParameter(completedAt, "completedAt")
            Intrinsics.checkNotNullParameter(startedAt, "startedAt")
            Intrinsics.checkNotNullParameter(media, "media")
            return Entries(str, completedAt, startedAt, i, i2, i3, z, media)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Entries) {
                val entries = obj as Entries
                return Intrinsics.areEqual(status, entries.status) && Intrinsics.areEqual(
                    completedAt, entries.completedAt
                ) && Intrinsics.areEqual(
                    startedAt, entries.startedAt
                ) && updatedAt == entries.updatedAt && progress == entries.progress && score == entries.score && private == entries.private && Intrinsics.areEqual(
                    media, entries.media
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val str = status
            val hashCode = ((((((str?.hashCode()
                ?: 0) * 31 + completedAt.hashCode()) * 31 + startedAt.hashCode()) * 31 + updatedAt) * 31 + progress) * 31 + score) * 31
            val z = private
            var i: Int = z.toInt()
            if (z.toInt() != 0) {
                i = 1
            }
            return (hashCode + i) * 31 + media.hashCode()
        }

        override fun toString(): String {
            return "Entries(status=" + status + ", completedAt=" + completedAt + ", startedAt=" + startedAt + ", updatedAt=" + updatedAt + ", progress=" + progress + ", score=" + score + ", private=" + private + ", media=" + media + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(completedAt, "completedAt")
            Intrinsics.checkNotNullParameter(startedAt, "startedAt")
            Intrinsics.checkNotNullParameter(media, "media")
            status = str
            this.completedAt = completedAt
            this.startedAt = startedAt
            updatedAt = i
            progress = i2
            score = i3
            private = z
            this.media = media
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Lists;", "", "status", "", "entries", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Entries;", "(Ljava/lang/String;Ljava/util/List;)V", "getEntries", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Lists(
        @JsonProperty("status") str: String,
        @JsonProperty("entries") entries: List<Entries>
    ) {
        val entries: List<Entries>
        val status: String
        operator fun component1(): String {
            return status
        }

        operator fun component2(): List<Entries> {
            return entries
        }

        fun copy(
            @JsonProperty("status") str: String,
            @JsonProperty("entries") entries: List<Entries>
        ): Lists {
            Intrinsics.checkNotNullParameter(entries, "entries")
            return Lists(str, entries)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Lists) {
                val lists = obj as Lists
                return Intrinsics.areEqual(status, lists.status) && Intrinsics.areEqual(
                    entries, lists.entries
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = status
            return (str?.hashCode() ?: 0) * 31 + entries.hashCode()
        }

        override fun toString(): String {
            return "Lists(status=" + status + ", entries=" + entries + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(entries, "entries")
            status = str
            this.entries = entries
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                lists: Lists,
                str: String,
                list: List,
                i: Int,
                obj: Object?
            ): Lists {
                var str = str
                var list: List = list
                if (i and 1 != 0) {
                    str = lists.status
                }
                if (i and 2 != 0) {
                    list = lists.entries
                }
                return lists.copy(str, list)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaListCollection;", "", "lists", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Lists;", "(Ljava/util/List;)V", "getLists", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MediaListCollection(@JsonProperty("lists") lists: List<Lists>) {
        val lists: List<Lists>
        operator fun component1(): List<Lists> {
            return lists
        }

        fun copy(@JsonProperty("lists") lists: List<Lists>): MediaListCollection {
            Intrinsics.checkNotNullParameter(lists, "lists")
            return MediaListCollection(lists)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MediaListCollection && Intrinsics.areEqual(
                lists,
                (obj as MediaListCollection).lists
            )
        }

        override fun hashCode(): Int {
            return lists.hashCode()
        }

        override fun toString(): String {
            return "MediaListCollection(lists=" + lists + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(lists, "lists")
            this.lists = lists
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                mediaListCollection: MediaListCollection,
                list: List,
                i: Int,
                obj: Object?
            ): MediaListCollection {
                var list: List = list
                if (i and 1 != 0) {
                    list = mediaListCollection.lists
                }
                return mediaListCollection.copy(list)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Data;", "", "MediaListCollection", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaListCollection;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaListCollection;)V", "getMediaListCollection", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaListCollection;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(@JsonProperty("MediaListCollection") MediaListCollection: MediaListCollection) {
        val mediaListCollection: MediaListCollection
        operator fun component1(): MediaListCollection {
            return mediaListCollection
        }

        fun copy(@JsonProperty("MediaListCollection") MediaListCollection: MediaListCollection): Data {
            Intrinsics.checkNotNullParameter(MediaListCollection, "MediaListCollection")
            return Data(MediaListCollection)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Data && Intrinsics.areEqual(
                mediaListCollection,
                (obj as Data).mediaListCollection
            )
        }

        override fun hashCode(): Int {
            return mediaListCollection.hashCode()
        }

        override fun toString(): String {
            return "Data(MediaListCollection=" + mediaListCollection + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(MediaListCollection, "MediaListCollection")
            mediaListCollection = MediaListCollection
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                data: Data,
                mediaListCollection: MediaListCollection,
                i: Int,
                obj: Object?
            ): Data {
                var mediaListCollection = mediaListCollection
                if (i and 1 != 0) {
                    mediaListCollection = data.mediaListCollection
                }
                return data.copy(mediaListCollection)
            }
        }
    }/*
            r4 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = "anilist_cached_list"
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L2d
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r0 = r3.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L2d
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[]> r3 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[].class
            java.lang.Object r0 = r1.readValue(r0, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[]
            if (r1 == 0) goto L35
            r2 = r0
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[] r2 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[]) r2
        L35:
            return r2
        */

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */ /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    val anilistListCached: Array<Lists>
        get() {
            /*
            r4 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = "anilist_cached_list"
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L2d
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r0 = r3.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L2d
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[]> r3 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[].class
            java.lang.Object r0 = r1.readValue(r0, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[]
            if (r1 == 0) goto L35
            r2 = r0
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[] r2 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[]) r2
        L35:
            return r2
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getAnilistListCached():com.lagradost.cloudstream3.syncproviders.providers.AniListApi\$Lists[]")
        }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */ /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */ /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */ /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */ /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getAnilistAnimeListSmart(r8: Continuation<in Array<Lists?>?>?): Any {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAnilistAnimeListSmart$1
            if (r0 == 0) goto L14
            r0 = r8
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAnilistAnimeListSmart$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAnilistAnimeListSmart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAnilistAnimeListSmart$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAnilistAnimeListSmart$1
            r0.<init>(r7, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "anilist_should_update_list"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L88
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = r7.getAuth()
            if (r8 != 0) goto L3f
            return r5
        L3f:
            boolean r8 = r7.checkToken()
            if (r8 == 0) goto L46
            return r5
        L46:
            com.lagradost.cloudstream3.AcraApplication$Companion r8 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r4)
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L74
            com.lagradost.cloudstream3.utils.DataStore r6 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r8 = r6.getSharedPrefs(r8)     // Catch: java.lang.Exception -> L74
            java.lang.String r8 = r8.getString(r3, r5)     // Catch: java.lang.Exception -> L74
            if (r8 != 0) goto L5f
            goto L75
        L5f:
            java.lang.String r2 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)     // Catch: java.lang.Exception -> L74
            com.fasterxml.jackson.databind.json.JsonMapper r2 = r6.getMapper()     // Catch: java.lang.Exception -> L74
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            java.lang.Object r2 = r2.readValue(r8, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r8 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L75
        L74:
            r2 = r5
        L75:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r4)
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r8)
            if (r8 == 0) goto Lc2
            r0.label = r4
            java.lang.Object r8 = r7.getFullAnilistList(r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$FullAnilistList r8 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.FullAnilistList) r8
            r0 = 0
            if (r8 == 0) goto Laf
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Data r8 = r8.getData()
            if (r8 == 0) goto Laf
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$MediaListCollection r8 = r8.getMediaListCollection()
            if (r8 == 0) goto Laf
            java.util.List r8 = r8.getLists()
            if (r8 == 0) goto Laf
            java.util.Collection r8 = (java.util.Collection) r8
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[] r1 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[r0]
            java.lang.Object[] r8 = r8.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r8, r1)
            r5 = r8
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[] r5 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Lists[]) r5
        Laf:
            if (r5 == 0) goto Lc6
            com.lagradost.cloudstream3.AcraApplication$Companion r8 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = "anilist_cached_list"
            r8.setKey(r1, r5)
            com.lagradost.cloudstream3.AcraApplication$Companion r8 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r0)
            r8.setKey(r3, r0)
            goto Lc6
        Lc2:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Lists[] r5 = r7.getAnilistListCached()
        Lc6:
            return r5
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getAnilistAnimeListSmart(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */ /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */ /* JADX WARN: Removed duplicated region for block: B:43:0x0088 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:46:0x004f A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */ /* JADX WARN: Type inference failed for: r3v9, types: [T, java.lang.Integer] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getFullAnilistList(r10: Continuation<in FullAnilistList?>?): Any {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getFullAnilistList$1
            if (r0 == 0) goto L14
            r0 = r10
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getFullAnilistList$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getFullAnilistList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getFullAnilistList$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getFullAnilistList$1
            r0.<init>(r9, r10)
        L19:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            java.lang.String r7 = "mapper.readValue(this, T::class.java)"
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lc7
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.lagradost.cloudstream3.AcraApplication$Companion r1 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r3 = "anilist_user"
            java.util.List r1 = r1.getKeys(r3)
            if (r1 == 0) goto L8f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            com.lagradost.cloudstream3.AcraApplication$Companion r5 = com.lagradost.cloudstream3.AcraApplication.Companion
            android.content.Context r5 = r5.getContext()
            if (r5 == 0) goto L83
            com.lagradost.cloudstream3.utils.DataStore r6 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r5 = r6.getSharedPrefs(r5)     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = r5.getString(r3, r8)     // Catch: java.lang.Exception -> L83
            if (r3 != 0) goto L70
            goto L83
        L70:
            java.lang.String r5 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch: java.lang.Exception -> L83
            com.fasterxml.jackson.databind.json.JsonMapper r5 = r6.getMapper()     // Catch: java.lang.Exception -> L83
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser> r6 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListUser.class
            java.lang.Object r3 = r5.readValue(r3, r6)     // Catch: java.lang.Exception -> L83
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)     // Catch: java.lang.Exception -> L83
            goto L84
        L83:
            r3 = r8
        L84:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser r3 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListUser) r3
            if (r3 == 0) goto L4f
            java.lang.Integer r3 = r3.getId()
            r10.element = r3
            goto L4f
        L8f:
            T r10 = r10.element
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto Ldd
            int r10 = r10.intValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\n                query ($userID: Int = "
            r1.append(r3)
            r1.append(r10)
            java.lang.String r10 = ", $MEDIA: MediaType = "
            r1.append(r10)
            java.lang.String r10 = "ANIME"
            r1.append(r10)
            java.lang.String r10 = ") {\n                    MediaListCollection (userId: $userID, type: $MEDIA) { \n                        lists {\n                            status\n                            entries\n                            {\n                                status\n                                completedAt { year month day }\n                                startedAt { year month day }\n                                updatedAt\n                                progress\n                                score\n                                private\n                                media\n                                {\n                                    id\n                                    idMal\n                                    season\n                                    seasonYear\n                                    format\n                                    episodes\n                                    chapters\n                                    title\n                                    {\n                                        english\n                                        romaji\n                                    }\n                                    coverImage { medium }\n                                    synonyms\n                                    nextAiringEpisode {\n                                        timeUntilAiring\n                                        episode\n                                    }\n                                }\n                            }\n                        }\n                    }\n                    }\n            "
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.label = r2
            r1 = r9
            r2 = r10
            java.lang.Object r10 = postApi$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto Lc7
            return r0
        Lc7:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Ldd
            com.lagradost.cloudstream3.utils.DataStore r0 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            com.fasterxml.jackson.databind.json.JsonMapper r0 = r0.getMapper()
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.AniListApi$FullAnilistList> r1 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.FullAnilistList.class
            java.lang.Object r10 = r0.readValue(r10, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r7)
            r8 = r10
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$FullAnilistList r8 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.FullAnilistList) r8
        Ldd:
            return r8
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getFullAnilistList(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun toggleLike(r9: Int, r10: Continuation<in Boolean?>?): Any {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$toggleLike$1
            if (r0 == 0) goto L14
            r0 = r10
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$toggleLike$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$toggleLike$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$toggleLike$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$toggleLike$1
            r0.<init>(r8, r10)
        L19:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 != r7) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)
            goto L59
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "mutation ($animeId: Int = "
            r10.append(r1)
            r10.append(r9)
            java.lang.String r9 = ") {\n\t\t\t\tToggleFavourite (animeId: $animeId) {\n\t\t\t\t\tanime {\n\t\t\t\t\t\tnodes {\n\t\t\t\t\t\t\tid\n\t\t\t\t\t\t\ttitle {\n\t\t\t\t\t\t\t\tromaji\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}"
            r10.append(r9)
            java.lang.String r2 = r10.toString()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.label = r7
            r1 = r8
            java.lang.Object r10 = postApi$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L59
            return r0
        L59:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r9 = ""
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r9)
            r9 = r9 ^ r7
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r9)
            return r9
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.toggleLike(int, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun postDataAboutId(
        r10: Int,
        r11: AniListStatusType?,
        r12: Int?,
        r13: Int?,
        r14: Continuation<in Boolean?>?
    ): Any {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$postDataAboutId$1
            if (r0 == 0) goto L14
            r0 = r14
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$postDataAboutId$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$postDataAboutId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$postDataAboutId$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$postDataAboutId$1
            r0.<init>(r9, r14)
        L19:
            r4 = r0
            java.lang.Object r14 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            java.lang.String r7 = ""
            r8 = 1
            if (r1 == 0) goto L36
            if (r1 != r8) goto L2e
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lb1
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "mutation ($id: Int = "
            r14.append(r1)
            r14.append(r10)
            java.lang.String r10 = ", $status: MediaListStatus = "
            r14.append(r10)
            java.lang.String[] r10 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.aniListStatusString
            r1 = 0
            int r11 = r11.getValue()
            int r11 = java.lang.Math.max(r1, r11)
            r10 = r10[r11]
            r14.append(r10)
            java.lang.String r10 = ", "
            r14.append(r10)
            if (r12 == 0) goto L7a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "$scoreRaw: Int = "
            r10.append(r11)
            int r11 = r12.intValue()
            int r11 = r11 * 10
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            goto L7b
        L7a:
            r10 = r7
        L7b:
            r14.append(r10)
            java.lang.String r10 = " , "
            r14.append(r10)
            if (r13 == 0) goto L97
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "$progress: Int = "
            r10.append(r11)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            goto L98
        L97:
            r10 = r7
        L98:
            r14.append(r10)
            java.lang.String r10 = ") {\n                SaveMediaListEntry (mediaId: $id, status: $status, scoreRaw: $scoreRaw, progress: $progress) {\n                    id\n                    status\n                    progress\n                    score\n                }\n                }"
            r14.append(r10)
            java.lang.String r2 = r14.toString()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.label = r8
            r1 = r9
            java.lang.Object r14 = postApi$default(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto Lb1
            return r0
        Lb1:
            java.lang.String r14 = (java.lang.String) r14
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r7)
            r10 = r10 ^ r8
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r10)
            return r10
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.postDataAboutId(int, com.lagradost.cloudstream3.syncproviders.providers.AniListApi\$Companion\$AniListStatusType, java.lang.Integer, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getUser(r9: Boolean, r10: Continuation<in AniListUser?>?): Any {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$1
            if (r0 == 0) goto L14
            r0 = r10
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$1
            r0.<init>(r8, r10)
        L19:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L39
            if (r1 != r7) goto L31
            boolean r9 = r4.Z$0
            java.lang.Object r0 = r4.L$0
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L50
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r8
            r4.Z$0 = r9
            r4.label = r7
            java.lang.String r2 = "\n\t\t\t\t{\n  \t\t\t\t\tViewer {\n    \t\t\t\t\tid\n    \t\t\t\t\tname\n\t\t\t\t\t\tavatar {\n\t\t\t\t\t\t\tlarge\n\t\t\t\t\t\t}\n                        favourites {\n                            anime {\n                                nodes {\n                                    id\n                                }\n                            }\n                        }\n  \t\t\t\t\t}\n\t\t\t\t}"
            r1 = r8
            java.lang.Object r10 = postApi$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            r0 = r8
        L50:
            java.lang.String r10 = (java.lang.String) r10
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L5f
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L5e
            goto L5f
        L5e:
            r7 = 0
        L5f:
            r1 = 0
            if (r7 == 0) goto L63
            return r1
        L63:
            com.fasterxml.jackson.databind.json.JsonMapper r2 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.mapper
            com.fasterxml.jackson.databind.ObjectMapper r2 = (com.fasterxml.jackson.databind.ObjectMapper) r2
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$$inlined$readValue$1 r3 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getUser$$inlined$readValue$1
            r3.<init>()
            com.fasterxml.jackson.core.type.TypeReference r3 = (com.fasterxml.jackson.core.type.TypeReference) r3
            java.lang.Object r10 = r2.readValue(r10, r3)
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListRoot r10 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.AniListRoot) r10
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListData r10 = r10.getData()
            if (r10 == 0) goto L7f
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListViewer r10 = r10.getViewer()
            goto L80
        L7f:
            r10 = r1
        L80:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser r2 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListUser
            if (r10 == 0) goto L89
            java.lang.Integer r3 = r10.getId()
            goto L8a
        L89:
            r3 = r1
        L8a:
            if (r10 == 0) goto L91
            java.lang.String r4 = r10.getName()
            goto L92
        L91:
            r4 = r1
        L92:
            if (r10 == 0) goto L9e
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$AniListAvatar r10 = r10.getAvatar()
            if (r10 == 0) goto L9e
            java.lang.String r1 = r10.getLarge()
        L9e:
            r2.<init>(r3, r4, r1)
            if (r9 == 0) goto Lb1
            com.lagradost.cloudstream3.AcraApplication$Companion r9 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r10 = r0.getAccountId()
            java.lang.String r1 = "anilist_user"
            r9.setKey(r10, r1, r2)
            r0.registerAccount()
        Lb1:
            return r2
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getUser(boolean, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getAllSeasons(r5: Int, r6: Continuation<in MutableList<SeasonResponse?>?>?): Any {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$1
            if (r0 == 0) goto L14
            r0 = r6
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4c
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = getAllSeasons$getSeasonRecursive(r6, r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r6
        L4c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.toList(r5)
            return r5
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getAllSeasons(int, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonResponse;", "", "data", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonData;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonData;)V", "getData", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonResponse(@JsonProperty("data") data: SeasonData) {
        val data: SeasonData
        operator fun component1(): SeasonData {
            return data
        }

        fun copy(@JsonProperty("data") data: SeasonData): SeasonResponse {
            Intrinsics.checkNotNullParameter(data, "data")
            return SeasonResponse(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SeasonResponse && Intrinsics.areEqual(
                data,
                (obj as SeasonResponse).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "SeasonResponse(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                seasonResponse: SeasonResponse,
                seasonData: SeasonData,
                i: Int,
                obj: Object?
            ): SeasonResponse {
                var seasonData = seasonData
                if (i and 1 != 0) {
                    seasonData = seasonResponse.data
                }
                return seasonResponse.copy(seasonData)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonData;", "", "Media", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;)V", "getMedia", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonData(@JsonProperty("Media") Media: SeasonMedia) {
        val media: SeasonMedia
        operator fun component1(): SeasonMedia {
            return media
        }

        fun copy(@JsonProperty("Media") Media: SeasonMedia): SeasonData {
            Intrinsics.checkNotNullParameter(Media, "Media")
            return SeasonData(Media)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SeasonData && Intrinsics.areEqual(
                media,
                (obj as SeasonData).media
            )
        }

        override fun hashCode(): Int {
            return media.hashCode()
        }

        override fun toString(): String {
            return "SeasonData(Media=" + media + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(Media, "Media")
            media = Media
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                seasonData: SeasonData,
                seasonMedia: SeasonMedia,
                i: Int,
                obj: Object?
            ): SeasonData {
                var seasonMedia = seasonMedia
                if (i and 1 != 0) {
                    seasonMedia = seasonData.media
                }
                return seasonData.copy(seasonMedia)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000cHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 Jæ\u0001\u0010M\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00122\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00162\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b.\u0010 R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0015\u0010/R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006S"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "", "id", "", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTitle;", "idMal", "format", "", "nextAiringEpisode", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "relations", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;", "coverImage", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaCoverImage;", TypedValues.TransitionType.S_DURATION, "episodes", "genres", "", "synonyms", "averageScore", "isAdult", "", "trailer", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTrailer;", "description", "characters", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterConnection;", "recommendations", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationConnection;", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTitle;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaCoverImage;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTrailer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterConnection;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationConnection;)V", "getAverageScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCharacters", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterConnection;", "getCoverImage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaCoverImage;", "getDescription", "()Ljava/lang/String;", "getDuration", "getEpisodes", "getFormat", "getGenres", "()Ljava/util/List;", "getId", "getIdMal", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNextAiringEpisode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "getRecommendations", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationConnection;", "getRelations", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;", "getSynonyms", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTitle;", "getTrailer", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTrailer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTitle;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaCoverImage;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTrailer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterConnection;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationConnection;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonMedia(
        @JsonProperty("id") num: Integer,
        @JsonProperty("title") mediaTitle: MediaTitle,
        @JsonProperty("idMal") num2: Integer,
        @JsonProperty("format") str: String,
        @JsonProperty("nextAiringEpisode") seasonNextAiringEpisode: SeasonNextAiringEpisode,
        @JsonProperty("relations") seasonEdges: SeasonEdges,
        @JsonProperty("coverImage") mediaCoverImage: MediaCoverImage,
        @JsonProperty("duration") num3: Integer,
        @JsonProperty("episodes") num4: Integer,
        @JsonProperty("genres") list: List<String>,
        @JsonProperty("synonyms") list2: List<String>,
        @JsonProperty("averageScore") num5: Integer,
        @JsonProperty("isAdult") bool: Boolean,
        @JsonProperty("trailer") mediaTrailer: MediaTrailer,
        @JsonProperty("description") str2: String,
        @JsonProperty("characters") characterConnection: CharacterConnection,
        @JsonProperty("recommendations") recommendationConnection: RecommendationConnection
    ) {
        private val averageScore: Integer
        val characters: CharacterConnection
        val coverImage: MediaCoverImage
        val description: String
        private val duration: Integer
        private val episodes: Integer
        val format: String
        val genres: List<String>

        /* renamed from: id */
        private val f10003id: Integer
        private val idMal: Integer
        val isAdult: Boolean
        val nextAiringEpisode: SeasonNextAiringEpisode
        val recommendations: RecommendationConnection
        val relations: SeasonEdges
        val synonyms: List<String>
        val title: MediaTitle
        val trailer: MediaTrailer
        operator fun component1(): Integer {
            return f10003id
        }

        operator fun component10(): List<String> {
            return genres
        }

        operator fun component11(): List<String> {
            return synonyms
        }

        operator fun component12(): Integer {
            return averageScore
        }

        operator fun component13(): Boolean {
            return isAdult
        }

        operator fun component14(): MediaTrailer {
            return trailer
        }

        operator fun component15(): String {
            return description
        }

        operator fun component16(): CharacterConnection {
            return characters
        }

        operator fun component17(): RecommendationConnection {
            return recommendations
        }

        operator fun component2(): MediaTitle {
            return title
        }

        operator fun component3(): Integer {
            return idMal
        }

        operator fun component4(): String {
            return format
        }

        operator fun component5(): SeasonNextAiringEpisode {
            return nextAiringEpisode
        }

        operator fun component6(): SeasonEdges {
            return relations
        }

        operator fun component7(): MediaCoverImage {
            return coverImage
        }

        operator fun component8(): Integer {
            return duration
        }

        operator fun component9(): Integer {
            return episodes
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("title") mediaTitle: MediaTitle,
            @JsonProperty("idMal") num2: Integer,
            @JsonProperty("format") str: String,
            @JsonProperty("nextAiringEpisode") seasonNextAiringEpisode: SeasonNextAiringEpisode,
            @JsonProperty("relations") seasonEdges: SeasonEdges,
            @JsonProperty("coverImage") mediaCoverImage: MediaCoverImage,
            @JsonProperty("duration") num3: Integer,
            @JsonProperty("episodes") num4: Integer,
            @JsonProperty("genres") list: List<String>,
            @JsonProperty("synonyms") list2: List<String>,
            @JsonProperty("averageScore") num5: Integer,
            @JsonProperty("isAdult") bool: Boolean,
            @JsonProperty("trailer") mediaTrailer: MediaTrailer,
            @JsonProperty("description") str2: String,
            @JsonProperty("characters") characterConnection: CharacterConnection,
            @JsonProperty("recommendations") recommendationConnection: RecommendationConnection
        ): SeasonMedia {
            return SeasonMedia(
                num,
                mediaTitle,
                num2,
                str,
                seasonNextAiringEpisode,
                seasonEdges,
                mediaCoverImage,
                num3,
                num4,
                list,
                list2,
                num5,
                bool,
                mediaTrailer,
                str2,
                characterConnection,
                recommendationConnection
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeasonMedia) {
                val seasonMedia = obj as SeasonMedia
                return Intrinsics.areEqual(f10003id, seasonMedia.f10003id) && Intrinsics.areEqual(
                    title, seasonMedia.title
                ) && Intrinsics.areEqual(idMal, seasonMedia.idMal) && Intrinsics.areEqual(
                    format, seasonMedia.format
                ) && Intrinsics.areEqual(
                    nextAiringEpisode, seasonMedia.nextAiringEpisode
                ) && Intrinsics.areEqual(
                    relations, seasonMedia.relations
                ) && Intrinsics.areEqual(
                    coverImage, seasonMedia.coverImage
                ) && Intrinsics.areEqual(
                    duration, seasonMedia.duration
                ) && Intrinsics.areEqual(
                    episodes, seasonMedia.episodes
                ) && Intrinsics.areEqual(
                    genres, seasonMedia.genres
                ) && Intrinsics.areEqual(synonyms, seasonMedia.synonyms) && Intrinsics.areEqual(
                    averageScore, seasonMedia.averageScore
                ) && Intrinsics.areEqual(
                    isAdult, seasonMedia.isAdult
                ) && Intrinsics.areEqual(trailer, seasonMedia.trailer) && Intrinsics.areEqual(
                    description, seasonMedia.description
                ) && Intrinsics.areEqual(
                    characters, seasonMedia.characters
                ) && Intrinsics.areEqual(
                    recommendations, seasonMedia.recommendations
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f10003id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val mediaTitle = title
            val hashCode2 = (hashCode + (mediaTitle?.hashCode() ?: 0)) * 31
            val num2: Integer = idMal
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str = format
            val hashCode4 = (hashCode3 + (str?.hashCode() ?: 0)) * 31
            val seasonNextAiringEpisode = nextAiringEpisode
            val hashCode5 = (hashCode4 + (seasonNextAiringEpisode?.hashCode() ?: 0)) * 31
            val seasonEdges = relations
            val hashCode6 = (hashCode5 + (seasonEdges?.hashCode() ?: 0)) * 31
            val mediaCoverImage = coverImage
            val hashCode7 = (hashCode6 + (mediaCoverImage?.hashCode() ?: 0)) * 31
            val num3: Integer = duration
            val hashCode8: Int = (hashCode7 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer = episodes
            val hashCode9: Int = (hashCode8 + if (num4 == null) 0 else num4.hashCode()) * 31
            val list = genres
            val hashCode10 = (hashCode9 + (list?.hashCode() ?: 0)) * 31
            val list2 = synonyms
            val hashCode11 = (hashCode10 + (list2?.hashCode() ?: 0)) * 31
            val num5: Integer = averageScore
            val hashCode12: Int = (hashCode11 + if (num5 == null) 0 else num5.hashCode()) * 31
            val bool = isAdult
            val hashCode13 = (hashCode12 + (bool?.hashCode() ?: 0)) * 31
            val mediaTrailer = trailer
            val hashCode14 = (hashCode13 + (mediaTrailer?.hashCode() ?: 0)) * 31
            val str2 = description
            val hashCode15 = (hashCode14 + (str2?.hashCode() ?: 0)) * 31
            val characterConnection = characters
            val hashCode16 = (hashCode15 + (characterConnection?.hashCode() ?: 0)) * 31
            val recommendationConnection = recommendations
            return hashCode16 + (recommendationConnection?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SeasonMedia(id=" + f10003id + ", title=" + title + ", idMal=" + idMal + ", format=" + format + ", nextAiringEpisode=" + nextAiringEpisode + ", relations=" + relations + ", coverImage=" + coverImage + ", duration=" + duration + ", episodes=" + episodes + ", genres=" + genres + ", synonyms=" + synonyms + ", averageScore=" + averageScore + ", isAdult=" + isAdult + ", trailer=" + trailer + ", description=" + description + ", characters=" + characters + ", recommendations=" + recommendations + ')'
        }

        init {
            f10003id = num
            title = mediaTitle
            idMal = num2
            format = str
            nextAiringEpisode = seasonNextAiringEpisode
            relations = seasonEdges
            coverImage = mediaCoverImage
            duration = num3
            episodes = num4
            genres = list
            synonyms = list2
            averageScore = num5
            isAdult = bool
            trailer = mediaTrailer
            description = str2
            characters = characterConnection
            recommendations = recommendationConnection
        }

        val id: Integer
            get() = f10003id

        fun getIdMal(): Integer {
            return idMal
        }

        fun getDuration(): Integer {
            return duration
        }

        fun getEpisodes(): Integer {
            return episodes
        }

        fun getAverageScore(): Integer {
            return averageScore
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationConnection;", "", "edges", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationEdge;", "nodes", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendation;", "(Ljava/util/List;Ljava/util/List;)V", "getEdges", "()Ljava/util/List;", "getNodes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RecommendationConnection(
        @JsonProperty("edges") edges: List<RecommendationEdge>,
        @JsonProperty("nodes") nodes: List<Recommendation>
    ) {
        val edges: List<RecommendationEdge>
        val nodes: List<Recommendation>
        operator fun component1(): List<RecommendationEdge> {
            return edges
        }

        operator fun component2(): List<Recommendation> {
            return nodes
        }

        fun copy(
            @JsonProperty("edges") edges: List<RecommendationEdge>,
            @JsonProperty("nodes") nodes: List<Recommendation>
        ): RecommendationConnection {
            Intrinsics.checkNotNullParameter(edges, "edges")
            Intrinsics.checkNotNullParameter(nodes, "nodes")
            return RecommendationConnection(edges, nodes)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RecommendationConnection) {
                val recommendationConnection = obj as RecommendationConnection
                return Intrinsics.areEqual(
                    edges,
                    recommendationConnection.edges
                ) && Intrinsics.areEqual(
                    nodes, recommendationConnection.nodes
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return edges.hashCode() * 31 + nodes.hashCode()
        }

        override fun toString(): String {
            return "RecommendationConnection(edges=" + edges + ", nodes=" + nodes + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(edges, "edges")
            Intrinsics.checkNotNullParameter(nodes, "nodes")
            this.edges = edges
            this.nodes = nodes
        }

        @JvmOverloads
                /* synthetic */   constructor(
            list: List? = null,
            list2: List? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) CollectionsKt.emptyList<Any>() else list,
            if (i and 2 != 0) CollectionsKt.emptyList<Any>() else list2
        ) {
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                recommendationConnection: RecommendationConnection,
                list: List,
                list2: List,
                i: Int,
                obj: Object?
            ): RecommendationConnection {
                var list: List = list
                var list2: List = list2
                if (i and 1 != 0) {
                    list = recommendationConnection.edges
                }
                if (i and 2 != 0) {
                    list2 = recommendationConnection.nodes
                }
                return recommendationConnection.copy(list, list2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$RecommendationEdge;", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendation;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendation;)V", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendation;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RecommendationEdge(@JsonProperty("node") node: Recommendation) {
        val node: Recommendation
        operator fun component1(): Recommendation {
            return node
        }

        fun copy(@JsonProperty("node") node: Recommendation): RecommendationEdge {
            Intrinsics.checkNotNullParameter(node, "node")
            return RecommendationEdge(node)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is RecommendationEdge && Intrinsics.areEqual(
                node,
                (obj as RecommendationEdge).node
            )
        }

        override fun hashCode(): Int {
            return node.hashCode()
        }

        override fun toString(): String {
            return "RecommendationEdge(node=" + node + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(node, "node")
            this.node = node
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                recommendationEdge: RecommendationEdge,
                recommendation: Recommendation,
                i: Int,
                obj: Object?
            ): RecommendationEdge {
                var recommendation = recommendation
                if (i and 1 != 0) {
                    recommendation = recommendationEdge.node
                }
                return recommendationEdge.copy(recommendation)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendation;", "", "mediaRecommendation", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;)V", "getMediaRecommendation", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Recommendation(@JsonProperty("mediaRecommendation") mediaRecommendation: SeasonMedia) {
        val mediaRecommendation: SeasonMedia
        operator fun component1(): SeasonMedia {
            return mediaRecommendation
        }

        fun copy(@JsonProperty("mediaRecommendation") mediaRecommendation: SeasonMedia): Recommendation {
            Intrinsics.checkNotNullParameter(mediaRecommendation, "mediaRecommendation")
            return Recommendation(mediaRecommendation)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Recommendation && Intrinsics.areEqual(
                mediaRecommendation,
                (obj as Recommendation).mediaRecommendation
            )
        }

        override fun hashCode(): Int {
            return mediaRecommendation.hashCode()
        }

        override fun toString(): String {
            return "Recommendation(mediaRecommendation=" + mediaRecommendation + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(mediaRecommendation, "mediaRecommendation")
            this.mediaRecommendation = mediaRecommendation
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                recommendation: Recommendation,
                seasonMedia: SeasonMedia,
                i: Int,
                obj: Object?
            ): Recommendation {
                var seasonMedia = seasonMedia
                if (i and 1 != 0) {
                    seasonMedia = recommendation.mediaRecommendation
                }
                return recommendation.copy(seasonMedia)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000cJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006&"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterName;", "", "first", "", "middle", "last", MessengerShareContentUtility.WEBVIEW_RATIO_FULL, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, "alternative", "", "alternativeSpoiler", "userPreferred", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAlternative", "()Ljava/util/List;", "getAlternativeSpoiler", "getFirst", "()Ljava/lang/String;", "getFull", "getLast", "getMiddle", "getNative", "getUserPreferred", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CharacterName(
        @param:JsonProperty("name") val first: String,
        @param:JsonProperty(
            "middle"
        ) val middle: String,
        @param:JsonProperty("last") val last: String,
        @param:JsonProperty("full") val full: String, /* renamed from: native  reason: not valid java name */
        @param:JsonProperty(
            "native"
        ) val native: String,
        @param:JsonProperty("alternative") val alternative: List<String>,
        @param:JsonProperty(
            "alternativeSpoiler"
        ) val alternativeSpoiler: List<String>,
        @param:JsonProperty("userPreferred") val userPreferred: String
    ) {

        operator fun component1(): String {
            return first
        }

        operator fun component2(): String {
            return middle
        }

        operator fun component3(): String {
            return last
        }

        operator fun component4(): String {
            return full
        }

        operator fun component5(): String {
            return native
        }

        operator fun component6(): List<String> {
            return alternative
        }

        operator fun component7(): List<String> {
            return alternativeSpoiler
        }

        operator fun component8(): String {
            return userPreferred
        }

        fun copy(
            @JsonProperty("name") str: String,
            @JsonProperty("middle") str2: String,
            @JsonProperty("last") str3: String,
            @JsonProperty("full") str4: String,
            @JsonProperty("native") str5: String,
            @JsonProperty("alternative") list: List<String>,
            @JsonProperty("alternativeSpoiler") list2: List<String>,
            @JsonProperty("userPreferred") str6: String
        ): CharacterName {
            return CharacterName(str, str2, str3, str4, str5, list, list2, str6)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CharacterName) {
                val characterName = obj as CharacterName
                return Intrinsics.areEqual(first, characterName.first) && Intrinsics.areEqual(
                    middle, characterName.middle
                ) && Intrinsics.areEqual(last, characterName.last) && Intrinsics.areEqual(
                    full, characterName.full
                ) && Intrinsics.areEqual(native, characterName.native) && Intrinsics.areEqual(
                    alternative, characterName.alternative
                ) && Intrinsics.areEqual(
                    alternativeSpoiler, characterName.alternativeSpoiler
                ) && Intrinsics.areEqual(
                    userPreferred, characterName.userPreferred
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = first
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = middle
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = last
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = full
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = native
            val hashCode5 = (hashCode4 + (str5?.hashCode() ?: 0)) * 31
            val list = alternative
            val hashCode6 = (hashCode5 + (list?.hashCode() ?: 0)) * 31
            val list2 = alternativeSpoiler
            val hashCode7 = (hashCode6 + (list2?.hashCode() ?: 0)) * 31
            val str6 = userPreferred
            return hashCode7 + (str6?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CharacterName(first=" + first + ", middle=" + middle + ", last=" + last + ", full=" + full + ", native=" + native + ", alternative=" + alternative + ", alternativeSpoiler=" + alternativeSpoiler + ", userPreferred=" + userPreferred + ')'
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterImage;", "", "large", "", "medium", "(Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CharacterImage(
        @param:JsonProperty("large") val large: String, @param:JsonProperty(
            "medium"
        ) val medium: String
    ) {
        operator fun component1(): String {
            return large
        }

        operator fun component2(): String {
            return medium
        }

        fun copy(
            @JsonProperty("large") str: String,
            @JsonProperty("medium") str2: String
        ): CharacterImage {
            return CharacterImage(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CharacterImage) {
                val characterImage = obj as CharacterImage
                return Intrinsics.areEqual(large, characterImage.large) && Intrinsics.areEqual(
                    medium, characterImage.medium
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = large
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = medium
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CharacterImage(large=" + large + ", medium=" + medium + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                characterImage: CharacterImage,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): CharacterImage {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = characterImage.large
                }
                if (i and 2 != 0) {
                    str2 = characterImage.medium
                }
                return characterImage.copy(str, str2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Character;", "", "name", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterName;", "age", "", "image", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterImage;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterName;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterImage;)V", "getAge", "()Ljava/lang/String;", "getImage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterImage;", "getName", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterName;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Character(
        @param:JsonProperty("name") val name: CharacterName, @param:JsonProperty(
            "age"
        ) val age: String, @param:JsonProperty("image") val image: CharacterImage
    ) {
        operator fun component1(): CharacterName {
            return name
        }

        operator fun component2(): String {
            return age
        }

        operator fun component3(): CharacterImage {
            return image
        }

        fun copy(
            @JsonProperty("name") characterName: CharacterName,
            @JsonProperty("age") str: String,
            @JsonProperty("image") characterImage: CharacterImage
        ): Character {
            return Character(characterName, str, characterImage)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Character) {
                val character = obj as Character
                return Intrinsics.areEqual(name, character.name) && Intrinsics.areEqual(
                    age, character.age
                ) && Intrinsics.areEqual(image, character.image)
            }
            return false
        }

        override fun hashCode(): Int {
            val characterName = name
            val hashCode = (characterName?.hashCode() ?: 0) * 31
            val str = age
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val characterImage = image
            return hashCode2 + (characterImage?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Character(name=" + name + ", age=" + age + ", image=" + image + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                character: Character,
                characterName: CharacterName,
                str: String,
                characterImage: CharacterImage,
                i: Int,
                obj: Object?
            ): Character {
                var characterName = characterName
                var str = str
                var characterImage = characterImage
                if (i and 1 != 0) {
                    characterName = character.name
                }
                if (i and 2 != 0) {
                    str = character.age
                }
                if (i and 4 != 0) {
                    characterImage = character.image
                }
                return character.copy(characterName, str, characterImage)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jn\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010\$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006*"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterEdge;", "", "id", "", "role", "", "name", "voiceActors", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Staff;", "favouriteOrder", "media", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonMedia;", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Character;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Character;)V", "getFavouriteOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getMedia", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Character;", "getRole", "getVoiceActors", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Character;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterEdge;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CharacterEdge(
        @JsonProperty("id") num: Integer,
        @JsonProperty("role") str: String,
        @JsonProperty("name") str2: String,
        @JsonProperty("voiceActors") list: List<Staff>,
        @JsonProperty("favouriteOrder") num2: Integer,
        @JsonProperty("media") list2: List<SeasonMedia>,
        @JsonProperty("node") character: Character
    ) {
        private val favouriteOrder: Integer

        /* renamed from: id */
        private val f9995id: Integer
        val media: List<SeasonMedia>
        val name: String
        val node: Character
        val role: String
        val voiceActors: List<Staff>
        operator fun component1(): Integer {
            return f9995id
        }

        operator fun component2(): String {
            return role
        }

        operator fun component3(): String {
            return name
        }

        operator fun component4(): List<Staff> {
            return voiceActors
        }

        operator fun component5(): Integer {
            return favouriteOrder
        }

        operator fun component6(): List<SeasonMedia> {
            return media
        }

        operator fun component7(): Character {
            return node
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("role") str: String,
            @JsonProperty("name") str2: String,
            @JsonProperty("voiceActors") list: List<Staff>,
            @JsonProperty("favouriteOrder") num2: Integer,
            @JsonProperty("media") list2: List<SeasonMedia>,
            @JsonProperty("node") character: Character
        ): CharacterEdge {
            return CharacterEdge(num, str, str2, list, num2, list2, character)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CharacterEdge) {
                val characterEdge = obj as CharacterEdge
                return Intrinsics.areEqual(f9995id, characterEdge.f9995id) && Intrinsics.areEqual(
                    role, characterEdge.role
                ) && Intrinsics.areEqual(name, characterEdge.name) && Intrinsics.areEqual(
                    voiceActors, characterEdge.voiceActors
                ) && Intrinsics.areEqual(
                    favouriteOrder, characterEdge.favouriteOrder
                ) && Intrinsics.areEqual(
                    media, characterEdge.media
                ) && Intrinsics.areEqual(node, characterEdge.node)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f9995id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = role
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = name
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val list = voiceActors
            val hashCode4 = (hashCode3 + (list?.hashCode() ?: 0)) * 31
            val num2: Integer = favouriteOrder
            val hashCode5: Int = (hashCode4 + if (num2 == null) 0 else num2.hashCode()) * 31
            val list2 = media
            val hashCode6 = (hashCode5 + (list2?.hashCode() ?: 0)) * 31
            val character = node
            return hashCode6 + (character?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CharacterEdge(id=" + f9995id + ", role=" + role + ", name=" + name + ", voiceActors=" + voiceActors + ", favouriteOrder=" + favouriteOrder + ", media=" + media + ", node=" + node + ')'
        }

        init {
            f9995id = num
            role = str
            name = str2
            voiceActors = list
            favouriteOrder = num2
            media = list2
            node = character
        }

        val id: Integer
            get() = f9995id

        fun getFavouriteOrder(): Integer {
            return favouriteOrder
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                characterEdge: CharacterEdge,
                num: Integer,
                str: String,
                str2: String,
                list: List,
                num2: Integer,
                list2: List,
                character: Character,
                i: Int,
                obj: Object?
            ): CharacterEdge {
                var num: Integer = num
                var str = str
                var str2 = str2
                var num2: Integer = num2
                var character = character
                if (i and 1 != 0) {
                    num = characterEdge.f9995id
                }
                if (i and 2 != 0) {
                    str = characterEdge.role
                }
                val str3 = str
                if (i and 4 != 0) {
                    str2 = characterEdge.name
                }
                val str4 = str2
                var list3: List<Staff?> = list
                if (i and 8 != 0) {
                    list3 = characterEdge.voiceActors
                }
                val list4: List = list3
                if (i and 16 != 0) {
                    num2 = characterEdge.favouriteOrder
                }
                val num3: Integer = num2
                var list5: List<SeasonMedia?> = list2
                if (i and 32 != 0) {
                    list5 = characterEdge.media
                }
                val list6: List = list5
                if (i and 64 != 0) {
                    character = characterEdge.node
                }
                return characterEdge.copy(num, str3, str4, list4, num3, list6, character)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffImage;", "", "large", "", "medium", "(Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class StaffImage(
        @param:JsonProperty("large") val large: String, @param:JsonProperty(
            "medium"
        ) val medium: String
    ) {
        operator fun component1(): String {
            return large
        }

        operator fun component2(): String {
            return medium
        }

        fun copy(
            @JsonProperty("large") str: String,
            @JsonProperty("medium") str2: String
        ): StaffImage {
            return StaffImage(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is StaffImage) {
                val staffImage = obj as StaffImage
                return Intrinsics.areEqual(large, staffImage.large) && Intrinsics.areEqual(
                    medium, staffImage.medium
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = large
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = medium
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "StaffImage(large=" + large + ", medium=" + medium + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                staffImage: StaffImage,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): StaffImage {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = staffImage.large
                }
                if (i and 2 != 0) {
                    str2 = staffImage.medium
                }
                return staffImage.copy(str, str2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffName;", "", "first", "", "middle", "last", MessengerShareContentUtility.WEBVIEW_RATIO_FULL, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, "alternative", "", "userPreferred", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAlternative", "()Ljava/util/List;", "getFirst", "()Ljava/lang/String;", "getFull", "getLast", "getMiddle", "getNative", "getUserPreferred", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class StaffName(
        @param:JsonProperty("name") val first: String,
        @param:JsonProperty(
            "middle"
        ) val middle: String,
        @param:JsonProperty("last") val last: String,
        @param:JsonProperty("full") val full: String, /* renamed from: native  reason: not valid java name */
        @param:JsonProperty(
            "native"
        ) val native: String,
        @param:JsonProperty("alternative") val alternative: List<String>,
        @param:JsonProperty(
            "userPreferred"
        ) val userPreferred: String
    ) {

        operator fun component1(): String {
            return first
        }

        operator fun component2(): String {
            return middle
        }

        operator fun component3(): String {
            return last
        }

        operator fun component4(): String {
            return full
        }

        operator fun component5(): String {
            return native
        }

        operator fun component6(): List<String> {
            return alternative
        }

        operator fun component7(): String {
            return userPreferred
        }

        fun copy(
            @JsonProperty("name") str: String,
            @JsonProperty("middle") str2: String,
            @JsonProperty("last") str3: String,
            @JsonProperty("full") str4: String,
            @JsonProperty("native") str5: String,
            @JsonProperty("alternative") list: List<String>,
            @JsonProperty("userPreferred") str6: String
        ): StaffName {
            return StaffName(str, str2, str3, str4, str5, list, str6)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is StaffName) {
                val staffName = obj as StaffName
                return Intrinsics.areEqual(first, staffName.first) && Intrinsics.areEqual(
                    middle, staffName.middle
                ) && Intrinsics.areEqual(last, staffName.last) && Intrinsics.areEqual(
                    full, staffName.full
                ) && Intrinsics.areEqual(native, staffName.native) && Intrinsics.areEqual(
                    alternative, staffName.alternative
                ) && Intrinsics.areEqual(
                    userPreferred, staffName.userPreferred
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = first
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = middle
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = last
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = full
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = native
            val hashCode5 = (hashCode4 + (str5?.hashCode() ?: 0)) * 31
            val list = alternative
            val hashCode6 = (hashCode5 + (list?.hashCode() ?: 0)) * 31
            val str6 = userPreferred
            return hashCode6 + (str6?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "StaffName(first=" + first + ", middle=" + middle + ", last=" + last + ", full=" + full + ", native=" + native + ", alternative=" + alternative + ", userPreferred=" + userPreferred + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                staffName: StaffName,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                str5: String,
                list: List,
                str6: String,
                i: Int,
                obj: Object?
            ): StaffName {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                var str6 = str6
                if (i and 1 != 0) {
                    str = staffName.first
                }
                if (i and 2 != 0) {
                    str2 = staffName.middle
                }
                val str7 = str2
                if (i and 4 != 0) {
                    str3 = staffName.last
                }
                val str8 = str3
                if (i and 8 != 0) {
                    str4 = staffName.full
                }
                val str9 = str4
                if (i and 16 != 0) {
                    str5 = staffName.native
                }
                val str10 = str5
                var list2: List<String?> = list
                if (i and 32 != 0) {
                    list2 = staffName.alternative
                }
                val list3: List = list2
                if (i and 64 != 0) {
                    str6 = staffName.userPreferred
                }
                return staffName.copy(str, str7, str8, str9, str10, list3, str6)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Staff;", "", "image", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffImage;", "name", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffName;", "age", "", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffImage;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffName;Ljava/lang/Integer;)V", "getAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffImage;", "getName", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffName;", "component1", "component2", "component3", "copy", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffImage;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StaffName;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Staff;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Staff(
        @param:JsonProperty("image") val image: StaffImage, @param:JsonProperty(
            "name"
        ) val name: StaffName, @JsonProperty("age") num: Integer
    ) {
        private val age: Integer
        operator fun component1(): StaffImage {
            return image
        }

        operator fun component2(): StaffName {
            return name
        }

        operator fun component3(): Integer {
            return age
        }

        fun copy(
            @JsonProperty("image") staffImage: StaffImage,
            @JsonProperty("name") staffName: StaffName,
            @JsonProperty("age") num: Integer
        ): Staff {
            return Staff(staffImage, staffName, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Staff) {
                val staff = obj as Staff
                return Intrinsics.areEqual(image, staff.image) && Intrinsics.areEqual(
                    name, staff.name
                ) && Intrinsics.areEqual(age, staff.age)
            }
            return false
        }

        override fun hashCode(): Int {
            val staffImage = image
            val hashCode = (staffImage?.hashCode() ?: 0) * 31
            val staffName = name
            val hashCode2 = (hashCode + (staffName?.hashCode() ?: 0)) * 31
            val num: Integer = age
            return hashCode2 + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "Staff(image=" + image + ", name=" + name + ", age=" + age + ')'
        }

        init {
            age = num
        }

        fun getAge(): Integer {
            return age
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                staff: Staff,
                staffImage: StaffImage,
                staffName: StaffName,
                num: Integer,
                i: Int,
                obj: Object?
            ): Staff {
                var staffImage = staffImage
                var staffName = staffName
                var num: Integer = num
                if (i and 1 != 0) {
                    staffImage = staff.image
                }
                if (i and 2 != 0) {
                    staffName = staff.name
                }
                if (i and 4 != 0) {
                    num = staff.age
                }
                return staff.copy(staffImage, staffName, num)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterConnection;", "", "edges", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CharacterEdge;", "nodes", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Character;", "(Ljava/util/List;Ljava/util/List;)V", "getEdges", "()Ljava/util/List;", "getNodes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CharacterConnection(
        @param:JsonProperty("edges") val edges: List<CharacterEdge>, @param:JsonProperty(
            "nodes"
        ) val nodes: List<Character>
    ) {
        operator fun component1(): List<CharacterEdge> {
            return edges
        }

        operator fun component2(): List<Character> {
            return nodes
        }

        fun copy(
            @JsonProperty("edges") list: List<CharacterEdge>,
            @JsonProperty("nodes") list2: List<Character>
        ): CharacterConnection {
            return CharacterConnection(list, list2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CharacterConnection) {
                val characterConnection = obj as CharacterConnection
                return Intrinsics.areEqual(edges, characterConnection.edges) && Intrinsics.areEqual(
                    nodes, characterConnection.nodes
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val list = edges
            val hashCode = (list?.hashCode() ?: 0) * 31
            val list2 = nodes
            return hashCode + (list2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CharacterConnection(edges=" + edges + ", nodes=" + nodes + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                characterConnection: CharacterConnection,
                list: List,
                list2: List,
                i: Int,
                obj: Object?
            ): CharacterConnection {
                var list: List = list
                var list2: List = list2
                if (i and 1 != 0) {
                    list = characterConnection.edges
                }
                if (i and 2 != 0) {
                    list2 = characterConnection.nodes
                }
                return characterConnection.copy(list, list2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTrailer;", "", "id", "", "site", "thumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSite", "getThumbnail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MediaTrailer(/* renamed from: id */
        @param:JsonProperty("id") val id: String,
        @param:JsonProperty("site") val site: String,
        @param:JsonProperty(
            "thumbnail"
        ) val thumbnail: String
    ) {
        operator fun component1(): String {
            return id
        }

        operator fun component2(): String {
            return site
        }

        operator fun component3(): String {
            return thumbnail
        }

        fun copy(
            @JsonProperty("id") str: String,
            @JsonProperty("site") str2: String,
            @JsonProperty("thumbnail") str3: String
        ): MediaTrailer {
            return MediaTrailer(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MediaTrailer) {
                val mediaTrailer = obj as MediaTrailer
                return Intrinsics.areEqual(id, mediaTrailer.id) && Intrinsics.areEqual(
                    site, mediaTrailer.site
                ) && Intrinsics.areEqual(thumbnail, mediaTrailer.thumbnail)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = id
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = site
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = thumbnail
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MediaTrailer(id=" + id + ", site=" + site + ", thumbnail=" + thumbnail + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                mediaTrailer: MediaTrailer,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): MediaTrailer {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = mediaTrailer.id
                }
                if (i and 2 != 0) {
                    str2 = mediaTrailer.site
                }
                if (i and 4 != 0) {
                    str3 = mediaTrailer.thumbnail
                }
                return mediaTrailer.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaCoverImage;", "", "extraLarge", "", "large", "medium", "color", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getExtraLarge", "getLarge", "getMedium", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MediaCoverImage(
        @param:JsonProperty("extraLarge") val extraLarge: String,
        @param:JsonProperty(
            "large"
        ) val large: String,
        @param:JsonProperty("medium") val medium: String,
        @param:JsonProperty("color") val color: String
    ) {
        operator fun component1(): String {
            return extraLarge
        }

        operator fun component2(): String {
            return large
        }

        operator fun component3(): String {
            return medium
        }

        operator fun component4(): String {
            return color
        }

        fun copy(
            @JsonProperty("extraLarge") str: String,
            @JsonProperty("large") str2: String,
            @JsonProperty("medium") str3: String,
            @JsonProperty("color") str4: String
        ): MediaCoverImage {
            return MediaCoverImage(str, str2, str3, str4)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MediaCoverImage) {
                val mediaCoverImage = obj as MediaCoverImage
                return Intrinsics.areEqual(
                    extraLarge,
                    mediaCoverImage.extraLarge
                ) && Intrinsics.areEqual(
                    large, mediaCoverImage.large
                ) && Intrinsics.areEqual(medium, mediaCoverImage.medium) && Intrinsics.areEqual(
                    color, mediaCoverImage.color
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = extraLarge
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = large
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = medium
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = color
            return hashCode3 + (str4?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MediaCoverImage(extraLarge=" + extraLarge + ", large=" + large + ", medium=" + medium + ", color=" + color + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                mediaCoverImage: MediaCoverImage,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                i: Int,
                obj: Object?
            ): MediaCoverImage {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                if (i and 1 != 0) {
                    str = mediaCoverImage.extraLarge
                }
                if (i and 2 != 0) {
                    str2 = mediaCoverImage.large
                }
                if (i and 4 != 0) {
                    str3 = mediaCoverImage.medium
                }
                if (i and 8 != 0) {
                    str4 = mediaCoverImage.color
                }
                return mediaCoverImage.copy(str, str2, str3, str4)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\u000c\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "", "episode", "", "timeUntilAiring", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeUntilAiring", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonNextAiringEpisode(
        @JsonProperty("episode") num: Integer,
        @JsonProperty("timeUntilAiring") num2: Integer
    ) {
        private val episode: Integer
        private val timeUntilAiring: Integer
        operator fun component1(): Integer {
            return episode
        }

        operator fun component2(): Integer {
            return timeUntilAiring
        }

        fun copy(
            @JsonProperty("episode") num: Integer,
            @JsonProperty("timeUntilAiring") num2: Integer
        ): SeasonNextAiringEpisode {
            return SeasonNextAiringEpisode(num, num2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeasonNextAiringEpisode) {
                val seasonNextAiringEpisode = obj as SeasonNextAiringEpisode
                return Intrinsics.areEqual(
                    episode,
                    seasonNextAiringEpisode.episode
                ) && Intrinsics.areEqual(
                    timeUntilAiring, seasonNextAiringEpisode.timeUntilAiring
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = episode
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = timeUntilAiring
            return hashCode + if (num2 != null) num2.hashCode() else 0
        }

        override fun toString(): String {
            return "SeasonNextAiringEpisode(episode=" + episode + ", timeUntilAiring=" + timeUntilAiring + ')'
        }

        init {
            episode = num
            timeUntilAiring = num2
        }

        fun getEpisode(): Integer {
            return episode
        }

        fun getTimeUntilAiring(): Integer {
            return timeUntilAiring
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                seasonNextAiringEpisode: SeasonNextAiringEpisode,
                num: Integer,
                num2: Integer,
                i: Int,
                obj: Object?
            ): SeasonNextAiringEpisode {
                var num: Integer = num
                var num2: Integer = num2
                if (i and 1 != 0) {
                    num = seasonNextAiringEpisode.episode
                }
                if (i and 2 != 0) {
                    num2 = seasonNextAiringEpisode.timeUntilAiring
                }
                return seasonNextAiringEpisode.copy(num, num2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;", "", "edges", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdge;", "(Ljava/util/List;)V", "getEdges", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonEdges(@param:JsonProperty("edges") val edges: List<SeasonEdge>) {
        operator fun component1(): List<SeasonEdge> {
            return edges
        }

        fun copy(@JsonProperty("edges") list: List<SeasonEdge>): SeasonEdges {
            return SeasonEdges(list)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SeasonEdges && Intrinsics.areEqual(
                edges,
                (obj as SeasonEdges).edges
            )
        }

        override fun hashCode(): Int {
            val list = edges ?: return 0
            return list.hashCode()
        }

        override fun toString(): String {
            return "SeasonEdges(edges=" + edges + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                seasonEdges: SeasonEdges,
                list: List,
                i: Int,
                obj: Object?
            ): SeasonEdges {
                var list: List = list
                if (i and 1 != 0) {
                    list = seasonEdges.edges
                }
                return seasonEdges.copy(list)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdge;", "", "id", "", "relationType", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNode;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNode;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNode;", "getRelationType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNode;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdge;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonEdge(
        @JsonProperty("id") num: Integer,
        @JsonProperty("relationType") str: String,
        @JsonProperty("node") seasonNode: SeasonNode
    ) {
        /* renamed from: id */
        private val f10002id: Integer
        val node: SeasonNode
        val relationType: String
        operator fun component1(): Integer {
            return f10002id
        }

        operator fun component2(): String {
            return relationType
        }

        operator fun component3(): SeasonNode {
            return node
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("relationType") str: String,
            @JsonProperty("node") seasonNode: SeasonNode
        ): SeasonEdge {
            return SeasonEdge(num, str, seasonNode)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeasonEdge) {
                val seasonEdge = obj as SeasonEdge
                return Intrinsics.areEqual(f10002id, seasonEdge.f10002id) && Intrinsics.areEqual(
                    relationType, seasonEdge.relationType
                ) && Intrinsics.areEqual(
                    node, seasonEdge.node
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f10002id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = relationType
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val seasonNode = node
            return hashCode2 + (seasonNode?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SeasonEdge(id=" + f10002id + ", relationType=" + relationType + ", node=" + node + ')'
        }

        init {
            f10002id = num
            relationType = str
            node = seasonNode
        }

        val id: Integer
            get() = f10002id

        companion object {
            fun  /* synthetic */`copy$default`(
                seasonEdge: SeasonEdge,
                num: Integer,
                str: String,
                seasonNode: SeasonNode,
                i: Int,
                obj: Object?
            ): SeasonEdge {
                var num: Integer = num
                var str = str
                var seasonNode = seasonNode
                if (i and 1 != 0) {
                    num = seasonEdge.f10002id
                }
                if (i and 2 != 0) {
                    str = seasonEdge.relationType
                }
                if (i and 4 != 0) {
                    seasonNode = seasonEdge.node
                }
                return seasonEdge.copy(num, str, seasonNode)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavoritesMediaConnection;", "", "nodes", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeNode;", "(Ljava/util/List;)V", "getNodes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListFavoritesMediaConnection(@JsonProperty("nodes") nodes: List<LikeNode>) {
        val nodes: List<LikeNode>
        operator fun component1(): List<LikeNode> {
            return nodes
        }

        fun copy(@JsonProperty("nodes") nodes: List<LikeNode>): AniListFavoritesMediaConnection {
            Intrinsics.checkNotNullParameter(nodes, "nodes")
            return AniListFavoritesMediaConnection(nodes)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is AniListFavoritesMediaConnection && Intrinsics.areEqual(
                nodes,
                (obj as AniListFavoritesMediaConnection).nodes
            )
        }

        override fun hashCode(): Int {
            return nodes.hashCode()
        }

        override fun toString(): String {
            return "AniListFavoritesMediaConnection(nodes=" + nodes + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(nodes, "nodes")
            this.nodes = nodes
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                aniListFavoritesMediaConnection: AniListFavoritesMediaConnection,
                list: List,
                i: Int,
                obj: Object?
            ): AniListFavoritesMediaConnection {
                var list: List = list
                if (i and 1 != 0) {
                    list = aniListFavoritesMediaConnection.nodes
                }
                return aniListFavoritesMediaConnection.copy(list)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavourites;", "", "anime", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavoritesMediaConnection;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavoritesMediaConnection;)V", "getAnime", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavoritesMediaConnection;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListFavourites(@JsonProperty("anime") anime: AniListFavoritesMediaConnection) {
        val anime: AniListFavoritesMediaConnection
        operator fun component1(): AniListFavoritesMediaConnection {
            return anime
        }

        fun copy(@JsonProperty("anime") anime: AniListFavoritesMediaConnection): AniListFavourites {
            Intrinsics.checkNotNullParameter(anime, "anime")
            return AniListFavourites(anime)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is AniListFavourites && Intrinsics.areEqual(
                anime,
                (obj as AniListFavourites).anime
            )
        }

        override fun hashCode(): Int {
            return anime.hashCode()
        }

        override fun toString(): String {
            return "AniListFavourites(anime=" + anime + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(anime, "anime")
            this.anime = anime
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListFavourites: AniListFavourites,
                aniListFavoritesMediaConnection: AniListFavoritesMediaConnection,
                i: Int,
                obj: Object?
            ): AniListFavourites {
                var aniListFavoritesMediaConnection = aniListFavoritesMediaConnection
                if (i and 1 != 0) {
                    aniListFavoritesMediaConnection = aniListFavourites.anime
                }
                return aniListFavourites.copy(aniListFavoritesMediaConnection)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaTitle;", "", "romaji", "", "english", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, "userPreferred", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnglish", "()Ljava/lang/String;", "getNative", "getRomaji", "getUserPreferred", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MediaTitle(
        @param:JsonProperty("romaji") val romaji: String, @param:JsonProperty(
            "english"
        ) val english: String, /* renamed from: native  reason: not valid java name */
        @param:JsonProperty("native") val native: String, @param:JsonProperty(
            "userPreferred"
        ) val userPreferred: String
    ) {

        operator fun component1(): String {
            return romaji
        }

        operator fun component2(): String {
            return english
        }

        operator fun component3(): String {
            return native
        }

        operator fun component4(): String {
            return userPreferred
        }

        fun copy(
            @JsonProperty("romaji") str: String,
            @JsonProperty("english") str2: String,
            @JsonProperty("native") str3: String,
            @JsonProperty("userPreferred") str4: String
        ): MediaTitle {
            return MediaTitle(str, str2, str3, str4)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MediaTitle) {
                val mediaTitle = obj as MediaTitle
                return Intrinsics.areEqual(romaji, mediaTitle.romaji) && Intrinsics.areEqual(
                    english, mediaTitle.english
                ) && Intrinsics.areEqual(native, mediaTitle.native) && Intrinsics.areEqual(
                    userPreferred, mediaTitle.userPreferred
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = romaji
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = english
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = native
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = userPreferred
            return hashCode3 + (str4?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MediaTitle(romaji=" + romaji + ", english=" + english + ", native=" + native + ", userPreferred=" + userPreferred + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                mediaTitle: MediaTitle,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                i: Int,
                obj: Object?
            ): MediaTitle {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                if (i and 1 != 0) {
                    str = mediaTitle.romaji
                }
                if (i and 2 != 0) {
                    str2 = mediaTitle.english
                }
                if (i and 4 != 0) {
                    str3 = mediaTitle.native
                }
                if (i and 8 != 0) {
                    str4 = mediaTitle.userPreferred
                }
                return mediaTitle.copy(str, str2, str3, str4)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000cJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJT\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNode;", "", "id", "", "format", "", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "idMal", "coverImage", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "averageScore", "(ILjava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;Ljava/lang/Integer;)V", "getAverageScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoverImage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;", "getFormat", "()Ljava/lang/String;", "getId", "()I", "getIdMal", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$CoverImage;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNode;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeasonNode(/* renamed from: id */
        @param:JsonProperty("id") val id: Int,
        @param:JsonProperty("format") val format: String,
        @param:JsonProperty(
            "title"
        ) val title: Title,
        @JsonProperty("idMal") num: Integer,
        @JsonProperty("coverImage") coverImage: CoverImage,
        @JsonProperty("averageScore") num2: Integer
    ) {
        private val averageScore: Integer
        val coverImage: CoverImage

        private val idMal: Integer
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return format
        }

        operator fun component3(): Title {
            return title
        }

        operator fun component4(): Integer {
            return idMal
        }

        operator fun component5(): CoverImage {
            return coverImage
        }

        operator fun component6(): Integer {
            return averageScore
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("format") str: String,
            @JsonProperty("title") title: Title,
            @JsonProperty("idMal") num: Integer,
            @JsonProperty("coverImage") coverImage: CoverImage,
            @JsonProperty("averageScore") num2: Integer
        ): SeasonNode {
            return SeasonNode(i, str, title, num, coverImage, num2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeasonNode) {
                val seasonNode = obj as SeasonNode
                return id == seasonNode.id && Intrinsics.areEqual(
                    format,
                    seasonNode.format
                ) && Intrinsics.areEqual(
                    title, seasonNode.title
                ) && Intrinsics.areEqual(idMal, seasonNode.idMal) && Intrinsics.areEqual(
                    coverImage, seasonNode.coverImage
                ) && Intrinsics.areEqual(
                    averageScore, seasonNode.averageScore
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = id * 31
            val str = format
            val hashCode = (i + (str?.hashCode() ?: 0)) * 31
            val title = title
            val hashCode2 = (hashCode + (title?.hashCode() ?: 0)) * 31
            val num: Integer = idMal
            val hashCode3: Int = (hashCode2 + if (num == null) 0 else num.hashCode()) * 31
            val coverImage = coverImage
            val hashCode4 = (hashCode3 + (coverImage?.hashCode() ?: 0)) * 31
            val num2: Integer = averageScore
            return hashCode4 + if (num2 != null) num2.hashCode() else 0
        }

        override fun toString(): String {
            return "SeasonNode(id=" + id + ", format=" + format + ", title=" + title + ", idMal=" + idMal + ", coverImage=" + coverImage + ", averageScore=" + averageScore + ')'
        }

        init {
            idMal = num
            this.coverImage = coverImage
            averageScore = num2
        }

        fun getIdMal(): Integer {
            return idMal
        }

        fun getAverageScore(): Integer {
            return averageScore
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                seasonNode: SeasonNode,
                i: Int,
                str: String,
                title: Title,
                num: Integer,
                coverImage: CoverImage,
                num2: Integer,
                i2: Int,
                obj: Object?
            ): SeasonNode {
                var i = i
                var str = str
                var title = title
                var num: Integer = num
                var coverImage = coverImage
                var num2: Integer = num2
                if (i2 and 1 != 0) {
                    i = seasonNode.id
                }
                if (i2 and 2 != 0) {
                    str = seasonNode.format
                }
                val str2 = str
                if (i2 and 4 != 0) {
                    title = seasonNode.title
                }
                val title2 = title
                if (i2 and 8 != 0) {
                    num = seasonNode.idMal
                }
                val num3: Integer = num
                if (i2 and 16 != 0) {
                    coverImage = seasonNode.coverImage
                }
                val coverImage2 = coverImage
                if (i2 and 32 != 0) {
                    num2 = seasonNode.averageScore
                }
                return seasonNode.copy(i, str2, title2, num3, coverImage2, num2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListAvatar;", "", "large", "", "(Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListAvatar(@param:JsonProperty("large") val large: String) {
        operator fun component1(): String {
            return large
        }

        fun copy(@JsonProperty("large") str: String): AniListAvatar {
            return AniListAvatar(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is AniListAvatar && Intrinsics.areEqual(
                large,
                (obj as AniListAvatar).large
            )
        }

        override fun hashCode(): Int {
            val str = large ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "AniListAvatar(large=" + large + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListAvatar: AniListAvatar,
                str: String,
                i: Int,
                obj: Object?
            ): AniListAvatar {
                var str = str
                if (i and 1 != 0) {
                    str = aniListAvatar.large
                }
                return aniListAvatar.copy(str)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListViewer;", "", "id", "", "name", "", "avatar", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListAvatar;", "favourites", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavourites;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListAvatar;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavourites;)V", "getAvatar", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListAvatar;", "getFavourites", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavourites;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListAvatar;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListFavourites;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListViewer;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListViewer(
        @JsonProperty("id") num: Integer,
        @JsonProperty("name") str: String,
        @JsonProperty("avatar") aniListAvatar: AniListAvatar,
        @JsonProperty("favourites") aniListFavourites: AniListFavourites
    ) {
        val avatar: AniListAvatar
        val favourites: AniListFavourites

        /* renamed from: id */
        private val f9994id: Integer
        val name: String
        operator fun component1(): Integer {
            return f9994id
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): AniListAvatar {
            return avatar
        }

        operator fun component4(): AniListFavourites {
            return favourites
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("name") str: String,
            @JsonProperty("avatar") aniListAvatar: AniListAvatar,
            @JsonProperty("favourites") aniListFavourites: AniListFavourites
        ): AniListViewer {
            return AniListViewer(num, str, aniListAvatar, aniListFavourites)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is AniListViewer) {
                val aniListViewer = obj as AniListViewer
                return Intrinsics.areEqual(f9994id, aniListViewer.f9994id) && Intrinsics.areEqual(
                    name, aniListViewer.name
                ) && Intrinsics.areEqual(avatar, aniListViewer.avatar) && Intrinsics.areEqual(
                    favourites, aniListViewer.favourites
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f9994id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = name
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val aniListAvatar = avatar
            val hashCode3 = (hashCode2 + (aniListAvatar?.hashCode() ?: 0)) * 31
            val aniListFavourites = favourites
            return hashCode3 + (aniListFavourites?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "AniListViewer(id=" + f9994id + ", name=" + name + ", avatar=" + avatar + ", favourites=" + favourites + ')'
        }

        init {
            f9994id = num
            name = str
            avatar = aniListAvatar
            favourites = aniListFavourites
        }

        val id: Integer
            get() = f9994id

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListViewer: AniListViewer,
                num: Integer,
                str: String,
                aniListAvatar: AniListAvatar,
                aniListFavourites: AniListFavourites,
                i: Int,
                obj: Object?
            ): AniListViewer {
                var num: Integer = num
                var str = str
                var aniListAvatar = aniListAvatar
                var aniListFavourites = aniListFavourites
                if (i and 1 != 0) {
                    num = aniListViewer.f9994id
                }
                if (i and 2 != 0) {
                    str = aniListViewer.name
                }
                if (i and 4 != 0) {
                    aniListAvatar = aniListViewer.avatar
                }
                if (i and 8 != 0) {
                    aniListFavourites = aniListViewer.favourites
                }
                return aniListViewer.copy(num, str, aniListAvatar, aniListFavourites)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListData;", "", "Viewer", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListViewer;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListViewer;)V", "getViewer", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListViewer;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListData(@param:JsonProperty("Viewer") val viewer: AniListViewer) {
        operator fun component1(): AniListViewer {
            return viewer
        }

        fun copy(@JsonProperty("Viewer") aniListViewer: AniListViewer): AniListData {
            return AniListData(aniListViewer)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is AniListData && Intrinsics.areEqual(
                viewer,
                (obj as AniListData).viewer
            )
        }

        override fun hashCode(): Int {
            val aniListViewer = viewer ?: return 0
            return aniListViewer.hashCode()
        }

        override fun toString(): String {
            return "AniListData(Viewer=" + viewer + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListData: AniListData,
                aniListViewer: AniListViewer,
                i: Int,
                obj: Object?
            ): AniListData {
                var aniListViewer = aniListViewer
                if (i and 1 != 0) {
                    aniListViewer = aniListData.viewer
                }
                return aniListData.copy(aniListViewer)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListRoot;", "", "data", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListData;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListData;)V", "getData", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListRoot(@param:JsonProperty("data") val data: AniListData) {
        operator fun component1(): AniListData {
            return data
        }

        fun copy(@JsonProperty("data") aniListData: AniListData): AniListRoot {
            return AniListRoot(aniListData)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is AniListRoot && Intrinsics.areEqual(
                data,
                (obj as AniListRoot).data
            )
        }

        override fun hashCode(): Int {
            val aniListData = data ?: return 0
            return aniListData.hashCode()
        }

        override fun toString(): String {
            return "AniListRoot(data=" + data + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListRoot: AniListRoot,
                aniListData: AniListData,
                i: Int,
                obj: Object?
            ): AniListRoot {
                var aniListData = aniListData
                if (i and 1 != 0) {
                    aniListData = aniListRoot.data
                }
                return aniListRoot.copy(aniListData)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000c¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListUser;", "", "id", "", "name", "", "picture", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getPicture", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListUser;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListUser(
        @JsonProperty("id") num: Integer,
        @JsonProperty("name") str: String,
        @JsonProperty("picture") str2: String
    ) {
        /* renamed from: id */
        private val f9993id: Integer
        val name: String
        val picture: String
        operator fun component1(): Integer {
            return f9993id
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): String {
            return picture
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("name") str: String,
            @JsonProperty("picture") str2: String
        ): AniListUser {
            return AniListUser(num, str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is AniListUser) {
                val aniListUser = obj as AniListUser
                return Intrinsics.areEqual(f9993id, aniListUser.f9993id) && Intrinsics.areEqual(
                    name, aniListUser.name
                ) && Intrinsics.areEqual(picture, aniListUser.picture)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f9993id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = name
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = picture
            return hashCode2 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "AniListUser(id=" + f9993id + ", name=" + name + ", picture=" + picture + ')'
        }

        init {
            f9993id = num
            name = str
            picture = str2
        }

        val id: Integer
            get() = f9993id

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListUser: AniListUser,
                num: Integer,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): AniListUser {
                var num: Integer = num
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    num = aniListUser.f9993id
                }
                if (i and 2 != 0) {
                    str = aniListUser.name
                }
                if (i and 4 != 0) {
                    str2 = aniListUser.picture
                }
                return aniListUser.copy(num, str, str2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeNode;", "", "id", "", "(Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeNode;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikeNode(@JsonProperty("id") num: Integer) {
        /* renamed from: id */
        private val f9997id: Integer
        operator fun component1(): Integer {
            return f9997id
        }

        fun copy(@JsonProperty("id") num: Integer): LikeNode {
            return LikeNode(num)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is LikeNode && Intrinsics.areEqual(
                f9997id,
                (obj as LikeNode).f9997id
            )
        }

        override fun hashCode(): Int {
            val num: Integer = f9997id ?: return 0
            return num.hashCode()
        }

        override fun toString(): String {
            return "LikeNode(id=" + f9997id + ')'
        }

        init {
            f9997id = num
        }

        val id: Integer
            get() = f9997id

        companion object {
            fun  /* synthetic */`copy$default`(
                likeNode: LikeNode,
                num: Integer,
                i: Int,
                obj: Object?
            ): LikeNode {
                var num: Integer = num
                if (i and 1 != 0) {
                    num = likeNode.f9997id
                }
                return likeNode.copy(num)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\u0011\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikePageInfo;", "", "total", "", "currentPage", "lastPage", "perPage", "hasNextPage", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasNextPage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastPage", "getPerPage", "getTotal", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikePageInfo;", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikePageInfo(
        @JsonProperty("total") num: Integer,
        @JsonProperty("currentPage") num2: Integer,
        @JsonProperty("lastPage") num3: Integer,
        @JsonProperty("perPage") num4: Integer,
        @JsonProperty("hasNextPage") bool: Boolean
    ) {
        private val currentPage: Integer
        val hasNextPage: Boolean
        private val lastPage: Integer
        private val perPage: Integer
        private val total: Integer
        operator fun component1(): Integer {
            return total
        }

        operator fun component2(): Integer {
            return currentPage
        }

        operator fun component3(): Integer {
            return lastPage
        }

        operator fun component4(): Integer {
            return perPage
        }

        operator fun component5(): Boolean {
            return hasNextPage
        }

        fun copy(
            @JsonProperty("total") num: Integer,
            @JsonProperty("currentPage") num2: Integer,
            @JsonProperty("lastPage") num3: Integer,
            @JsonProperty("perPage") num4: Integer,
            @JsonProperty("hasNextPage") bool: Boolean
        ): LikePageInfo {
            return LikePageInfo(num, num2, num3, num4, bool)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LikePageInfo) {
                val likePageInfo = obj as LikePageInfo
                return Intrinsics.areEqual(total, likePageInfo.total) && Intrinsics.areEqual(
                    currentPage, likePageInfo.currentPage
                ) && Intrinsics.areEqual(
                    lastPage, likePageInfo.lastPage
                ) && Intrinsics.areEqual(
                    perPage, likePageInfo.perPage
                ) && Intrinsics.areEqual(
                    hasNextPage, likePageInfo.hasNextPage
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = total
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = currentPage
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = lastPage
            val hashCode3: Int = (hashCode2 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer = perPage
            val hashCode4: Int = (hashCode3 + if (num4 == null) 0 else num4.hashCode()) * 31
            val bool = hasNextPage
            return hashCode4 + (bool?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "LikePageInfo(total=" + total + ", currentPage=" + currentPage + ", lastPage=" + lastPage + ", perPage=" + perPage + ", hasNextPage=" + hasNextPage + ')'
        }

        init {
            total = num
            currentPage = num2
            lastPage = num3
            perPage = num4
            hasNextPage = bool
        }

        fun getTotal(): Integer {
            return total
        }

        fun getCurrentPage(): Integer {
            return currentPage
        }

        fun getLastPage(): Integer {
            return lastPage
        }

        fun getPerPage(): Integer {
            return perPage
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                likePageInfo: LikePageInfo,
                num: Integer,
                num2: Integer,
                num3: Integer,
                num4: Integer,
                bool: Boolean,
                i: Int,
                obj: Object?
            ): LikePageInfo {
                var num: Integer = num
                var num2: Integer = num2
                var num3: Integer = num3
                var num4: Integer = num4
                var bool = bool
                if (i and 1 != 0) {
                    num = likePageInfo.total
                }
                if (i and 2 != 0) {
                    num2 = likePageInfo.currentPage
                }
                val num5: Integer = num2
                if (i and 4 != 0) {
                    num3 = likePageInfo.lastPage
                }
                val num6: Integer = num3
                if (i and 8 != 0) {
                    num4 = likePageInfo.perPage
                }
                val num7: Integer = num4
                if (i and 16 != 0) {
                    bool = likePageInfo.hasNextPage
                }
                return likePageInfo.copy(num, num5, num6, num7, bool)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeAnime;", "", "nodes", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeNode;", "pageInfo", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikePageInfo;", "(Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikePageInfo;)V", "getNodes", "()Ljava/util/List;", "getPageInfo", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikePageInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikeAnime(
        @param:JsonProperty("nodes") val nodes: List<LikeNode>, @param:JsonProperty(
            "pageInfo"
        ) val pageInfo: LikePageInfo
    ) {
        operator fun component1(): List<LikeNode> {
            return nodes
        }

        operator fun component2(): LikePageInfo {
            return pageInfo
        }

        fun copy(
            @JsonProperty("nodes") list: List<LikeNode>,
            @JsonProperty("pageInfo") likePageInfo: LikePageInfo
        ): LikeAnime {
            return LikeAnime(list, likePageInfo)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LikeAnime) {
                val likeAnime = obj as LikeAnime
                return Intrinsics.areEqual(nodes, likeAnime.nodes) && Intrinsics.areEqual(
                    pageInfo, likeAnime.pageInfo
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val list = nodes
            val hashCode = (list?.hashCode() ?: 0) * 31
            val likePageInfo = pageInfo
            return hashCode + (likePageInfo?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "LikeAnime(nodes=" + nodes + ", pageInfo=" + pageInfo + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                likeAnime: LikeAnime,
                list: List,
                likePageInfo: LikePageInfo,
                i: Int,
                obj: Object?
            ): LikeAnime {
                var list: List = list
                var likePageInfo = likePageInfo
                if (i and 1 != 0) {
                    list = likeAnime.nodes
                }
                if (i and 2 != 0) {
                    likePageInfo = likeAnime.pageInfo
                }
                return likeAnime.copy(list, likePageInfo)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeFavourites;", "", "anime", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeAnime;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeAnime;)V", "getAnime", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeAnime;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikeFavourites(@param:JsonProperty("anime") val anime: LikeAnime) {
        operator fun component1(): LikeAnime {
            return anime
        }

        fun copy(@JsonProperty("anime") likeAnime: LikeAnime): LikeFavourites {
            return LikeFavourites(likeAnime)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is LikeFavourites && Intrinsics.areEqual(
                anime,
                (obj as LikeFavourites).anime
            )
        }

        override fun hashCode(): Int {
            val likeAnime = anime ?: return 0
            return likeAnime.hashCode()
        }

        override fun toString(): String {
            return "LikeFavourites(anime=" + anime + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                likeFavourites: LikeFavourites,
                likeAnime: LikeAnime,
                i: Int,
                obj: Object?
            ): LikeFavourites {
                var likeAnime = likeAnime
                if (i and 1 != 0) {
                    likeAnime = likeFavourites.anime
                }
                return likeFavourites.copy(likeAnime)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeViewer;", "", "favourites", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeFavourites;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeFavourites;)V", "getFavourites", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeFavourites;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikeViewer(@param:JsonProperty("favourites") val favourites: LikeFavourites) {
        operator fun component1(): LikeFavourites {
            return favourites
        }

        fun copy(@JsonProperty("favourites") likeFavourites: LikeFavourites): LikeViewer {
            return LikeViewer(likeFavourites)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is LikeViewer && Intrinsics.areEqual(
                favourites,
                (obj as LikeViewer).favourites
            )
        }

        override fun hashCode(): Int {
            val likeFavourites = favourites ?: return 0
            return likeFavourites.hashCode()
        }

        override fun toString(): String {
            return "LikeViewer(favourites=" + favourites + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                likeViewer: LikeViewer,
                likeFavourites: LikeFavourites,
                i: Int,
                obj: Object?
            ): LikeViewer {
                var likeFavourites = likeFavourites
                if (i and 1 != 0) {
                    likeFavourites = likeViewer.favourites
                }
                return likeViewer.copy(likeFavourites)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeData;", "", "Viewer", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeViewer;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeViewer;)V", "getViewer", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeViewer;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikeData(@param:JsonProperty("Viewer") val viewer: LikeViewer) {
        operator fun component1(): LikeViewer {
            return viewer
        }

        fun copy(@JsonProperty("Viewer") likeViewer: LikeViewer): LikeData {
            return LikeData(likeViewer)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is LikeData && Intrinsics.areEqual(
                viewer,
                (obj as LikeData).viewer
            )
        }

        override fun hashCode(): Int {
            val likeViewer = viewer ?: return 0
            return likeViewer.hashCode()
        }

        override fun toString(): String {
            return "LikeData(Viewer=" + viewer + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                likeData: LikeData,
                likeViewer: LikeViewer,
                i: Int,
                obj: Object?
            ): LikeData {
                var likeViewer = likeViewer
                if (i and 1 != 0) {
                    likeViewer = likeData.viewer
                }
                return likeData.copy(likeViewer)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeRoot;", "", "data", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeData;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeData;)V", "getData", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$LikeData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LikeRoot(@param:JsonProperty("data") val data: LikeData) {
        operator fun component1(): LikeData {
            return data
        }

        fun copy(@JsonProperty("data") likeData: LikeData): LikeRoot {
            return LikeRoot(likeData)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is LikeRoot && Intrinsics.areEqual(
                data,
                (obj as LikeRoot).data
            )
        }

        override fun hashCode(): Int {
            val likeData = data ?: return 0
            return likeData.hashCode()
        }

        override fun toString(): String {
            return "LikeRoot(data=" + data + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                likeRoot: LikeRoot,
                likeData: LikeData,
                i: Int,
                obj: Object?
            ): LikeRoot {
                var likeData = likeData
                if (i and 1 != 0) {
                    likeData = likeRoot.data
                }
                return likeRoot.copy(likeData)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u000cHÆ\u0003Jb\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListTitleHolder;", "", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "isFavourite", "", "id", "", "progress", "episodes", "score", "type", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;)V", "getEpisodes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProgress", "getScore", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "getType", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Companion\$AniListStatusType;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$AniListTitleHolder;", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AniListTitleHolder(
        @param:JsonProperty("title") val title: Title,
        @param:JsonProperty(
            "isFavourite"
        ) val isFavourite: Boolean,
        @JsonProperty("id") num: Integer,
        @JsonProperty("progress") num2: Integer,
        @JsonProperty("episodes") num3: Integer,
        @JsonProperty("score") num4: Integer,
        @JsonProperty("type") aniListStatusType: AniListStatusType
    ) {
        private val episodes: Integer

        /* renamed from: id */
        private val f9992id: Integer
        private val progress: Integer
        private val score: Integer
        private val type: AniListStatusType
        operator fun component1(): Title {
            return title
        }

        operator fun component2(): Boolean {
            return isFavourite
        }

        operator fun component3(): Integer {
            return f9992id
        }

        operator fun component4(): Integer {
            return progress
        }

        operator fun component5(): Integer {
            return episodes
        }

        operator fun component6(): Integer {
            return score
        }

        operator fun component7(): AniListStatusType {
            return type
        }

        fun copy(
            @JsonProperty("title") title: Title,
            @JsonProperty("isFavourite") bool: Boolean,
            @JsonProperty("id") num: Integer,
            @JsonProperty("progress") num2: Integer,
            @JsonProperty("episodes") num3: Integer,
            @JsonProperty("score") num4: Integer,
            @JsonProperty("type") aniListStatusType: AniListStatusType
        ): AniListTitleHolder {
            return AniListTitleHolder(title, bool, num, num2, num3, num4, aniListStatusType)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is AniListTitleHolder) {
                val aniListTitleHolder = obj as AniListTitleHolder
                return Intrinsics.areEqual(title, aniListTitleHolder.title) && Intrinsics.areEqual(
                    isFavourite, aniListTitleHolder.isFavourite
                ) && Intrinsics.areEqual(
                    f9992id, aniListTitleHolder.f9992id
                ) && Intrinsics.areEqual(
                    progress, aniListTitleHolder.progress
                ) && Intrinsics.areEqual(
                    episodes, aniListTitleHolder.episodes
                ) && Intrinsics.areEqual(
                    score, aniListTitleHolder.score
                ) && type == aniListTitleHolder.type
            }
            return false
        }

        override fun hashCode(): Int {
            val title = title
            val hashCode = (title?.hashCode() ?: 0) * 31
            val bool = isFavourite
            val hashCode2 = (hashCode + (bool?.hashCode() ?: 0)) * 31
            val num: Integer = f9992id
            val hashCode3: Int = (hashCode2 + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = progress
            val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = episodes
            val hashCode5: Int = (hashCode4 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer = score
            val hashCode6: Int = (hashCode5 + if (num4 == null) 0 else num4.hashCode()) * 31
            val aniListStatusType: AniListStatusType = type
            return hashCode6 + if (aniListStatusType != null) aniListStatusType.hashCode() else 0
        }

        override fun toString(): String {
            return "AniListTitleHolder(title=" + title + ", isFavourite=" + isFavourite + ", id=" + f9992id + ", progress=" + progress + ", episodes=" + episodes + ", score=" + score + ", type=" + type + ')'
        }

        init {
            f9992id = num
            progress = num2
            episodes = num3
            score = num4
            type = aniListStatusType
        }

        val id: Integer
            get() = f9992id

        fun getProgress(): Integer {
            return progress
        }

        fun getEpisodes(): Integer {
            return episodes
        }

        fun getScore(): Integer {
            return score
        }

        fun getType(): AniListStatusType {
            return type
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                aniListTitleHolder: AniListTitleHolder,
                title: Title,
                bool: Boolean,
                num: Integer,
                num2: Integer,
                num3: Integer,
                num4: Integer,
                aniListStatusType: AniListStatusType,
                i: Int,
                obj: Object?
            ): AniListTitleHolder {
                var title = title
                var bool = bool
                var num: Integer = num
                var num2: Integer = num2
                var num3: Integer = num3
                var num4: Integer = num4
                var aniListStatusType: AniListStatusType = aniListStatusType
                if (i and 1 != 0) {
                    title = aniListTitleHolder.title
                }
                if (i and 2 != 0) {
                    bool = aniListTitleHolder.isFavourite
                }
                val bool2 = bool
                if (i and 4 != 0) {
                    num = aniListTitleHolder.f9992id
                }
                val num5: Integer = num
                if (i and 8 != 0) {
                    num2 = aniListTitleHolder.progress
                }
                val num6: Integer = num2
                if (i and 16 != 0) {
                    num3 = aniListTitleHolder.episodes
                }
                val num7: Integer = num3
                if (i and 32 != 0) {
                    num4 = aniListTitleHolder.score
                }
                val num8: Integer = num4
                if (i and 64 != 0) {
                    aniListStatusType = aniListTitleHolder.type
                }
                return aniListTitleHolder.copy(
                    title,
                    bool2,
                    num5,
                    num6,
                    num7,
                    num8,
                    aniListStatusType
                )
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\r¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMediaListEntry;", "", "progress", "", "status", "", "score", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScore", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMediaListEntry;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetDataMediaListEntry(
        @JsonProperty("progress") num: Integer,
        @JsonProperty("status") str: String,
        @JsonProperty("score") num2: Integer
    ) {
        private val progress: Integer
        private val score: Integer
        val status: String
        operator fun component1(): Integer {
            return progress
        }

        operator fun component2(): String {
            return status
        }

        operator fun component3(): Integer {
            return score
        }

        fun copy(
            @JsonProperty("progress") num: Integer,
            @JsonProperty("status") str: String,
            @JsonProperty("score") num2: Integer
        ): GetDataMediaListEntry {
            return GetDataMediaListEntry(num, str, num2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is GetDataMediaListEntry) {
                val getDataMediaListEntry = obj as GetDataMediaListEntry
                return Intrinsics.areEqual(
                    progress,
                    getDataMediaListEntry.progress
                ) && Intrinsics.areEqual(
                    status, getDataMediaListEntry.status
                ) && Intrinsics.areEqual(
                    score, getDataMediaListEntry.score
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = progress
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = status
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val num2: Integer = score
            return hashCode2 + if (num2 != null) num2.hashCode() else 0
        }

        override fun toString(): String {
            return "GetDataMediaListEntry(progress=" + progress + ", status=" + status + ", score=" + score + ')'
        }

        init {
            progress = num
            status = str
            score = num2
        }

        fun getProgress(): Integer {
            return progress
        }

        fun getScore(): Integer {
            return score
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getDataMediaListEntry: GetDataMediaListEntry,
                num: Integer,
                str: String,
                num2: Integer,
                i: Int,
                obj: Object?
            ): GetDataMediaListEntry {
                var num: Integer = num
                var str = str
                var num2: Integer = num2
                if (i and 1 != 0) {
                    num = getDataMediaListEntry.progress
                }
                if (i and 2 != 0) {
                    str = getDataMediaListEntry.status
                }
                if (i and 4 != 0) {
                    num2 = getDataMediaListEntry.score
                }
                return getDataMediaListEntry.copy(num, str, num2)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Nodes;", "", "id", "", "mediaRecommendation", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaRecommendation;", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaRecommendation;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaRecommendation", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaRecommendation;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$MediaRecommendation;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Nodes;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Nodes(
        @JsonProperty("id") num: Integer,
        @JsonProperty("mediaRecommendation") mediaRecommendation: MediaRecommendation
    ) {
        /* renamed from: id */
        private val f10001id: Integer
        val mediaRecommendation: MediaRecommendation
        operator fun component1(): Integer {
            return f10001id
        }

        operator fun component2(): MediaRecommendation {
            return mediaRecommendation
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("mediaRecommendation") mediaRecommendation: MediaRecommendation
        ): Nodes {
            return Nodes(num, mediaRecommendation)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Nodes) {
                val nodes = obj as Nodes
                return Intrinsics.areEqual(f10001id, nodes.f10001id) && Intrinsics.areEqual(
                    mediaRecommendation, nodes.mediaRecommendation
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f10001id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val mediaRecommendation = mediaRecommendation
            return hashCode + (mediaRecommendation?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Nodes(id=" + f10001id + ", mediaRecommendation=" + mediaRecommendation + ')'
        }

        init {
            f10001id = num
            this.mediaRecommendation = mediaRecommendation
        }

        val id: Integer
            get() = f10001id

        companion object {
            fun  /* synthetic */`copy$default`(
                nodes: Nodes,
                num: Integer,
                mediaRecommendation: MediaRecommendation,
                i: Int,
                obj: Object?
            ): Nodes {
                var num: Integer = num
                var mediaRecommendation = mediaRecommendation
                if (i and 1 != 0) {
                    num = nodes.f10001id
                }
                if (i and 2 != 0) {
                    mediaRecommendation = nodes.mediaRecommendation
                }
                return nodes.copy(num, mediaRecommendation)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000cJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\u000cR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMedia;", "", "isFavourite", "", "episodes", "", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "mediaListEntry", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMediaListEntry;", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMediaListEntry;)V", "getEpisodes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMediaListEntry", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMediaListEntry;", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Title;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMediaListEntry;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMedia;", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetDataMedia(
        @param:JsonProperty("isFavourite") val isFavourite: Boolean,
        @JsonProperty("episodes") num: Integer,
        @JsonProperty("title") title: Title,
        @JsonProperty("mediaListEntry") getDataMediaListEntry: GetDataMediaListEntry
    ) {
        private val episodes: Integer
        val mediaListEntry: GetDataMediaListEntry
        val title: Title
        operator fun component1(): Boolean {
            return isFavourite
        }

        operator fun component2(): Integer {
            return episodes
        }

        operator fun component3(): Title {
            return title
        }

        operator fun component4(): GetDataMediaListEntry {
            return mediaListEntry
        }

        fun copy(
            @JsonProperty("isFavourite") bool: Boolean,
            @JsonProperty("episodes") num: Integer,
            @JsonProperty("title") title: Title,
            @JsonProperty("mediaListEntry") getDataMediaListEntry: GetDataMediaListEntry
        ): GetDataMedia {
            return GetDataMedia(bool, num, title, getDataMediaListEntry)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is GetDataMedia) {
                val getDataMedia = obj as GetDataMedia
                return Intrinsics.areEqual(
                    isFavourite,
                    getDataMedia.isFavourite
                ) && Intrinsics.areEqual(
                    episodes, getDataMedia.episodes
                ) && Intrinsics.areEqual(
                    title, getDataMedia.title
                ) && Intrinsics.areEqual(
                    mediaListEntry, getDataMedia.mediaListEntry
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val bool = isFavourite
            val hashCode = (bool?.hashCode() ?: 0) * 31
            val num: Integer = episodes
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val title = title
            val hashCode3 = (hashCode2 + (title?.hashCode() ?: 0)) * 31
            val getDataMediaListEntry = mediaListEntry
            return hashCode3 + (getDataMediaListEntry?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "GetDataMedia(isFavourite=" + isFavourite + ", episodes=" + episodes + ", title=" + title + ", mediaListEntry=" + mediaListEntry + ')'
        }

        init {
            episodes = num
            this.title = title
            mediaListEntry = getDataMediaListEntry
        }

        fun getEpisodes(): Integer {
            return episodes
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getDataMedia: GetDataMedia,
                bool: Boolean,
                num: Integer,
                title: Title,
                getDataMediaListEntry: GetDataMediaListEntry,
                i: Int,
                obj: Object?
            ): GetDataMedia {
                var bool = bool
                var num: Integer = num
                var title = title
                var getDataMediaListEntry = getDataMediaListEntry
                if (i and 1 != 0) {
                    bool = getDataMedia.isFavourite
                }
                if (i and 2 != 0) {
                    num = getDataMedia.episodes
                }
                if (i and 4 != 0) {
                    title = getDataMedia.title
                }
                if (i and 8 != 0) {
                    getDataMediaListEntry = getDataMedia.mediaListEntry
                }
                return getDataMedia.copy(bool, num, title, getDataMediaListEntry)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendations;", "", "nodes", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Nodes;", "(Ljava/util/List;)V", "getNodes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Recommendations(@param:JsonProperty("nodes") val nodes: List<Nodes>) {
        operator fun component1(): List<Nodes> {
            return nodes
        }

        fun copy(@JsonProperty("nodes") list: List<Nodes>): Recommendations {
            return Recommendations(list)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Recommendations && Intrinsics.areEqual(
                nodes,
                (obj as Recommendations).nodes
            )
        }

        override fun hashCode(): Int {
            val list = nodes ?: return 0
            return list.hashCode()
        }

        override fun toString(): String {
            return "Recommendations(nodes=" + nodes + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                recommendations: Recommendations,
                list: List,
                i: Int,
                obj: Object?
            ): Recommendations {
                var list: List = list
                if (i and 1 != 0) {
                    list = recommendations.nodes
                }
                return recommendations.copy(list)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataData;", "", "Media", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMedia;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMedia;)V", "getMedia", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataMedia;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetDataData(@param:JsonProperty("Media") val media: GetDataMedia) {
        operator fun component1(): GetDataMedia {
            return media
        }

        fun copy(@JsonProperty("Media") getDataMedia: GetDataMedia): GetDataData {
            return GetDataData(getDataMedia)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GetDataData && Intrinsics.areEqual(
                media,
                (obj as GetDataData).media
            )
        }

        override fun hashCode(): Int {
            val getDataMedia = media ?: return 0
            return getDataMedia.hashCode()
        }

        override fun toString(): String {
            return "GetDataData(Media=" + media + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getDataData: GetDataData,
                getDataMedia: GetDataMedia,
                i: Int,
                obj: Object?
            ): GetDataData {
                var getDataMedia = getDataMedia
                if (i and 1 != 0) {
                    getDataMedia = getDataData.media
                }
                return getDataData.copy(getDataMedia)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataRoot;", "", "data", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataData;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataData;)V", "getData", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetDataData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetDataRoot(@param:JsonProperty("data") val data: GetDataData) {
        operator fun component1(): GetDataData {
            return data
        }

        fun copy(@JsonProperty("data") getDataData: GetDataData): GetDataRoot {
            return GetDataRoot(getDataData)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GetDataRoot && Intrinsics.areEqual(
                data,
                (obj as GetDataRoot).data
            )
        }

        override fun hashCode(): Int {
            val getDataData = data ?: return 0
            return getDataData.hashCode()
        }

        override fun toString(): String {
            return "GetDataRoot(data=" + data + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getDataRoot: GetDataRoot,
                getDataData: GetDataData,
                i: Int,
                obj: Object?
            ): GetDataRoot {
                var getDataData = getDataData
                if (i and 1 != 0) {
                    getDataData = getDataRoot.data
                }
                return getDataRoot.copy(getDataData)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchTitle;", "", "romaji", "", "(Ljava/lang/String;)V", "getRomaji", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetSearchTitle(@param:JsonProperty("romaji") val romaji: String) {
        operator fun component1(): String {
            return romaji
        }

        fun copy(@JsonProperty("romaji") str: String): GetSearchTitle {
            return GetSearchTitle(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GetSearchTitle && Intrinsics.areEqual(
                romaji,
                (obj as GetSearchTitle).romaji
            )
        }

        override fun hashCode(): Int {
            val str = romaji ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "GetSearchTitle(romaji=" + romaji + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getSearchTitle: GetSearchTitle,
                str: String,
                i: Int,
                obj: Object?
            ): GetSearchTitle {
                var str = str
                if (i and 1 != 0) {
                    str = getSearchTitle.romaji
                }
                return getSearchTitle.copy(str)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$TrailerObject;", "", "id", "", "thumbnail", "site", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSite", "getThumbnail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TrailerObject(/* renamed from: id */
        @param:JsonProperty("id") val id: String,
        @param:JsonProperty("thumbnail") val thumbnail: String,
        @param:JsonProperty(
            "site"
        ) val site: String
    ) {
        operator fun component1(): String {
            return id
        }

        operator fun component2(): String {
            return thumbnail
        }

        operator fun component3(): String {
            return site
        }

        fun copy(
            @JsonProperty("id") str: String,
            @JsonProperty("thumbnail") str2: String,
            @JsonProperty("site") str3: String
        ): TrailerObject {
            return TrailerObject(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TrailerObject) {
                val trailerObject = obj as TrailerObject
                return Intrinsics.areEqual(id, trailerObject.id) && Intrinsics.areEqual(
                    thumbnail, trailerObject.thumbnail
                ) && Intrinsics.areEqual(
                    site, trailerObject.site
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = id
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = thumbnail
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = site
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "TrailerObject(id=" + id + ", thumbnail=" + thumbnail + ", site=" + site + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                trailerObject: TrailerObject,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): TrailerObject {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = trailerObject.id
                }
                if (i and 2 != 0) {
                    str2 = trailerObject.thumbnail
                }
                if (i and 4 != 0) {
                    str3 = trailerObject.site
                }
                return trailerObject.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0096\u0001\u00109\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\rHÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006@"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchMedia;", "", "id", "", "idMal", "seasonYear", "title", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchTitle;", "startDate", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;", "averageScore", "meanScore", "bannerImage", "", "trailer", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$TrailerObject;", "nextAiringEpisode", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "recommendations", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendations;", "relations", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;", "(ILjava/lang/Integer;ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchTitle;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$TrailerObject;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendations;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;)V", "getAverageScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBannerImage", "()Ljava/lang/String;", "getId", "()I", "getIdMal", "getMeanScore", "getNextAiringEpisode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;", "getRecommendations", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendations;", "getRelations", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;", "getSeasonYear", "getStartDate", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;", "getTitle", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchTitle;", "getTrailer", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$TrailerObject;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;ILcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchTitle;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$StartedAt;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$TrailerObject;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonNextAiringEpisode;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$Recommendations;Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$SeasonEdges;)Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchMedia;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetSearchMedia(
        @JsonProperty("id") i: Int,
        @JsonProperty("idMal") num: Integer,
        @JsonProperty("seasonYear") i2: Int,
        @JsonProperty("title") title: GetSearchTitle,
        @JsonProperty("startDate") startDate: StartedAt,
        @JsonProperty("averageScore") num2: Integer,
        @JsonProperty("meanScore") num3: Integer,
        @JsonProperty("bannerImage") str: String,
        @JsonProperty("trailer") trailerObject: TrailerObject,
        @JsonProperty("nextAiringEpisode") seasonNextAiringEpisode: SeasonNextAiringEpisode,
        @JsonProperty("recommendations") recommendations: Recommendations,
        @JsonProperty("relations") seasonEdges: SeasonEdges
    ) {
        private val averageScore: Integer
        val bannerImage: String

        /* renamed from: id */
        val id: Int
        private val idMal: Integer
        private val meanScore: Integer
        val nextAiringEpisode: SeasonNextAiringEpisode
        val recommendations: Recommendations
        val relations: SeasonEdges
        val seasonYear: Int
        val startDate: StartedAt
        val title: GetSearchTitle
        val trailer: TrailerObject
        operator fun component1(): Int {
            return id
        }

        operator fun component10(): SeasonNextAiringEpisode {
            return nextAiringEpisode
        }

        operator fun component11(): Recommendations {
            return recommendations
        }

        operator fun component12(): SeasonEdges {
            return relations
        }

        operator fun component2(): Integer {
            return idMal
        }

        operator fun component3(): Int {
            return seasonYear
        }

        operator fun component4(): GetSearchTitle {
            return title
        }

        operator fun component5(): StartedAt {
            return startDate
        }

        operator fun component6(): Integer {
            return averageScore
        }

        operator fun component7(): Integer {
            return meanScore
        }

        operator fun component8(): String {
            return bannerImage
        }

        operator fun component9(): TrailerObject {
            return trailer
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("idMal") num: Integer,
            @JsonProperty("seasonYear") i2: Int,
            @JsonProperty("title") title: GetSearchTitle,
            @JsonProperty("startDate") startDate: StartedAt,
            @JsonProperty("averageScore") num2: Integer,
            @JsonProperty("meanScore") num3: Integer,
            @JsonProperty("bannerImage") str: String,
            @JsonProperty("trailer") trailerObject: TrailerObject,
            @JsonProperty("nextAiringEpisode") seasonNextAiringEpisode: SeasonNextAiringEpisode,
            @JsonProperty("recommendations") recommendations: Recommendations,
            @JsonProperty("relations") seasonEdges: SeasonEdges
        ): GetSearchMedia {
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(startDate, "startDate")
            return GetSearchMedia(
                i,
                num,
                i2,
                title,
                startDate,
                num2,
                num3,
                str,
                trailerObject,
                seasonNextAiringEpisode,
                recommendations,
                seasonEdges
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is GetSearchMedia) {
                val getSearchMedia = obj as GetSearchMedia
                return id == getSearchMedia.id && Intrinsics.areEqual(
                    idMal,
                    getSearchMedia.idMal
                ) && seasonYear == getSearchMedia.seasonYear && Intrinsics.areEqual(
                    title, getSearchMedia.title
                ) && Intrinsics.areEqual(
                    startDate, getSearchMedia.startDate
                ) && Intrinsics.areEqual(
                    averageScore, getSearchMedia.averageScore
                ) && Intrinsics.areEqual(
                    meanScore, getSearchMedia.meanScore
                ) && Intrinsics.areEqual(
                    bannerImage, getSearchMedia.bannerImage
                ) && Intrinsics.areEqual(
                    trailer, getSearchMedia.trailer
                ) && Intrinsics.areEqual(
                    nextAiringEpisode, getSearchMedia.nextAiringEpisode
                ) && Intrinsics.areEqual(
                    recommendations, getSearchMedia.recommendations
                ) && Intrinsics.areEqual(
                    relations, getSearchMedia.relations
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = id * 31
            val num: Integer = idMal
            val hashCode: Int =
                ((((i + if (num == null) 0 else num.hashCode()) * 31 + seasonYear) * 31 + title.hashCode()) * 31 + startDate.hashCode()) * 31
            val num2: Integer = averageScore
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = meanScore
            val hashCode3: Int = (hashCode2 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str = bannerImage
            val hashCode4 = (hashCode3 + (str?.hashCode() ?: 0)) * 31
            val trailerObject = trailer
            val hashCode5 = (hashCode4 + (trailerObject?.hashCode() ?: 0)) * 31
            val seasonNextAiringEpisode = nextAiringEpisode
            val hashCode6 = (hashCode5 + (seasonNextAiringEpisode?.hashCode() ?: 0)) * 31
            val recommendations = recommendations
            val hashCode7 = (hashCode6 + (recommendations?.hashCode() ?: 0)) * 31
            val seasonEdges = relations
            return hashCode7 + (seasonEdges?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "GetSearchMedia(id=" + id + ", idMal=" + idMal + ", seasonYear=" + seasonYear + ", title=" + title + ", startDate=" + startDate + ", averageScore=" + averageScore + ", meanScore=" + meanScore + ", bannerImage=" + bannerImage + ", trailer=" + trailer + ", nextAiringEpisode=" + nextAiringEpisode + ", recommendations=" + recommendations + ", relations=" + relations + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(startDate, "startDate")
            id = i
            idMal = num
            seasonYear = i2
            this.title = title
            this.startDate = startDate
            averageScore = num2
            meanScore = num3
            bannerImage = str
            trailer = trailerObject
            nextAiringEpisode = seasonNextAiringEpisode
            this.recommendations = recommendations
            relations = seasonEdges
        }

        fun getIdMal(): Integer {
            return idMal
        }

        fun getAverageScore(): Integer {
            return averageScore
        }

        fun getMeanScore(): Integer {
            return meanScore
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchPage;", "", "Page", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchData;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchData;)V", "getPage", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetSearchPage(@param:JsonProperty("Page") val page: GetSearchData) {
        operator fun component1(): GetSearchData {
            return page
        }

        fun copy(@JsonProperty("Page") getSearchData: GetSearchData): GetSearchPage {
            return GetSearchPage(getSearchData)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GetSearchPage && Intrinsics.areEqual(
                page,
                (obj as GetSearchPage).page
            )
        }

        override fun hashCode(): Int {
            val getSearchData = page ?: return 0
            return getSearchData.hashCode()
        }

        override fun toString(): String {
            return "GetSearchPage(Page=" + page + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getSearchPage: GetSearchPage,
                getSearchData: GetSearchData,
                i: Int,
                obj: Object?
            ): GetSearchPage {
                var getSearchData = getSearchData
                if (i and 1 != 0) {
                    getSearchData = getSearchPage.page
                }
                return getSearchPage.copy(getSearchData)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchData;", "", "media", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchMedia;", "(Ljava/util/List;)V", "getMedia", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetSearchData(@param:JsonProperty("media") val media: List<GetSearchMedia>) {
        operator fun component1(): List<GetSearchMedia> {
            return media
        }

        fun copy(@JsonProperty("media") list: List<GetSearchMedia>): GetSearchData {
            return GetSearchData(list)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GetSearchData && Intrinsics.areEqual(
                media,
                (obj as GetSearchData).media
            )
        }

        override fun hashCode(): Int {
            val list = media ?: return 0
            return list.hashCode()
        }

        override fun toString(): String {
            return "GetSearchData(media=" + media + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                getSearchData: GetSearchData,
                list: List,
                i: Int,
                obj: Object?
            ): GetSearchData {
                var list: List = list
                if (i and 1 != 0) {
                    list = getSearchData.media
                }
                return getSearchData.copy(list)
            }
        }
    }

    /* compiled from: AniListApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchRoot;", "", "data", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchPage;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchPage;)V", "getData", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi\$GetSearchPage;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GetSearchRoot(@param:JsonProperty("data") val data: GetSearchPage) {
        operator fun component1(): GetSearchPage {
            return data
        }

        fun copy(@JsonProperty("data") getSearchPage: GetSearchPage): GetSearchRoot {
            return GetSearchRoot(getSearchPage)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GetSearchRoot && Intrinsics.areEqual(
                data,
                (obj as GetSearchRoot).data
            )
        }

        override fun hashCode(): Int {
            val getSearchPage = data ?: return 0
            return getSearchPage.hashCode()
        }

        override fun toString(): String {
            return "GetSearchRoot(data=" + data + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                getSearchRoot: GetSearchRoot,
                getSearchPage: GetSearchPage,
                i: Int,
                obj: Object?
            ): GetSearchRoot {
                var getSearchPage = getSearchPage
                if (i and 1 != 0) {
                    getSearchPage = getSearchRoot.data
                }
                return getSearchRoot.copy(getSearchPage)
            }
        }
    }

    companion object {
        const val ANILIST_CACHED_LIST = "anilist_cached_list"
        const val ANILIST_SHOULD_UPDATE_LIST = "anilist_should_update_list"
        const val ANILIST_TOKEN_KEY = "anilist_token"
        const val ANILIST_UNIXTIME_KEY = "anilist_unixtime"
        const val ANILIST_USER_KEY = "anilist_user"
        val Companion = Companion(null)
        private val aniListStatusString: Array<String>
        private val mapper: JsonMapper? = null

        init {
            val build: JsonMapper = JsonMapper.builder()
                .addModule(KotlinModule(0, false, false, false, null, false, 63, null))
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build()
            Intrinsics.checkNotNull(com.lagradost.cloudstream3.syncproviders.providers.build)
            AniListApi.Companion.mapper = com.lagradost.cloudstream3.syncproviders.providers.build
            AniListApi.Companion.aniListStatusString =
                arrayOf("CURRENT", "COMPLETED", "PAUSED", "DROPPED", "PLANNING", "REPEATING")
        }

        fun  /* synthetic */`postApi$default`(
            aniListApi: AniListApi,
            str: String?,
            z: Boolean,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var z = z
            if (i and 2 != 0) {
                z = false
            }
            return aniListApi.postApi(str, z, continuation)
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        fun  /* synthetic */`getUser$default`(
            aniListApi: AniListApi,
            z: Boolean,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var z = z
            if (i and 1 != 0) {
                z = true
            }
            return aniListApi.getUser(z, continuation)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */ /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun `getAllSeasons$getSeasonRecursive`(
            r9: List<SeasonResponse?>?,
            r10: Int,
            r11: Continuation<in Unit>?
        ): Any {
            /*
            boolean r0 = r11 instanceof com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$getSeasonRecursive$1
            if (r0 == 0) goto L14
            r0 = r11
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$getSeasonRecursive$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$getSeasonRecursive$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$getSeasonRecursive$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.AniListApi$getAllSeasons$getSeasonRecursive$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "TV"
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L41
            if (r2 != r6) goto L39
            java.lang.Object r9 = r0.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.L$0
            java.util.List r10 = (java.util.List) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L93
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            java.lang.Object r9 = r0.L$0
            java.util.List r9 = (java.util.List) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L59
        L49:
            kotlin.ResultKt.throwOnFailure(r11)
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$Companion r11 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion
            r0.L$0 = r9
            r0.label = r7
            java.lang.Object r11 = com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion.access$getSeason(r11, r10, r0)
            if (r11 != r1) goto L59
            return r1
        L59:
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonResponse r11 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.SeasonResponse) r11
            r9.add(r11)
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonData r10 = r11.getData()
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonMedia r10 = r10.getMedia()
            java.lang.String r10 = r10.getFormat()
            if (r10 == 0) goto L73
            boolean r10 = kotlin.text.StringsKt.startsWith$default(r10, r3, r5, r6, r4)
            if (r10 != r7) goto L73
            goto L74
        L73:
            r7 = 0
        L74:
            if (r7 == 0) goto Ldc
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonData r10 = r11.getData()
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonMedia r10 = r10.getMedia()
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonEdges r10 = r10.getRelations()
            if (r10 == 0) goto Ldc
            java.util.List r10 = r10.getEdges()
            if (r10 == 0) goto Ldc
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r8 = r10
            r10 = r9
            r9 = r8
        L93:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Ldc
            java.lang.Object r11 = r9.next()
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonEdge r11 = (com.lagradost.cloudstream3.syncproviders.providers.AniListApi.SeasonEdge) r11
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonNode r2 = r11.getNode()
            if (r2 == 0) goto Laa
            java.lang.String r2 = r2.getFormat()
            goto Lab
        Laa:
            r2 = r4
        Lab:
            if (r2 == 0) goto L93
            java.lang.String r2 = r11.getRelationType()
            java.lang.String r7 = "SEQUEL"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)
            if (r2 == 0) goto L93
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonNode r2 = r11.getNode()
            java.lang.String r2 = r2.getFormat()
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r2, r3, r5, r6, r4)
            if (r2 == 0) goto L93
            com.lagradost.cloudstream3.syncproviders.providers.AniListApi$SeasonNode r11 = r11.getNode()
            int r11 = r11.getId()
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r11 = getAllSeasons$getSeasonRecursive(r10, r11, r0)
            if (r11 != r1) goto L93
            return r1
        Ldc:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.AniListApi.getAllSeasons\$getSeasonRecursive(java.util.List, int, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}