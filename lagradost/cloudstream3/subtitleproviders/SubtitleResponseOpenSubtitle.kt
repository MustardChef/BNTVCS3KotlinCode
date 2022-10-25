package com.lagradost.cloudstream3.subtitleproviders

import com.facebook.appevents.UserDataStore
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.subtitleproviders.SubtitleApi
import com.lagradost.cloudstream3.services.ApiService
import com.lagradost.cloudstream3.services.ApiUtils
import com.lagradost.cloudstream3.subtitleproviders.MovieIMDB
import com.lagradost.cloudstream3.subtitleproviders.SubtitleResponseOpenSubtitle
import kotlin.text.StringsKt
import kotlin.collections.CollectionsKt
import kotlin.random.Random
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants

/* compiled from: SubtitleResponseOpenSubtitle.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b>\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\bk\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR \u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR \u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR \u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR \u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR \u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR \u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR \u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR \u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR \u0010<\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR \u0010?\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR \u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR \u0010T\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR \u0010W\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR \u0010Z\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR \u0010]\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR \u0010`\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR \u0010c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR \u0010f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR \u0010i\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR \u0010l\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR \u0010o\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR \u0010r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR \u0010u\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR \u0010x\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR \u0010{\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR!\u0010~\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR#\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR#\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR#\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR#\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR#\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR#\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0006\"\u0005\b\u0092\u0001\u0010\bR#\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0006\"\u0005\b\u0095\u0001\u0010\bR#\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0006\"\u0005\b\u0098\u0001\u0010\bR#\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR#\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR#\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010\u0006\"\u0005\b¡\u0001\u0010\bR#\u0010¢\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010\u0006\"\u0005\b¤\u0001\u0010\bR#\u0010¥\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010\u0006\"\u0005\b§\u0001\u0010\bR#\u0010¨\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010\u0006\"\u0005\bª\u0001\u0010\bR#\u0010«\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010\u0006\"\u0005\b\u00ad\u0001\u0010\bR#\u0010®\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010\u0006\"\u0005\b°\u0001\u0010\bR#\u0010±\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u0006\"\u0005\b³\u0001\u0010\bR#\u0010´\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010\u0006\"\u0005\b¶\u0001\u0010\b¨\u0006·\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/subtitleproviders/SubtitleResponseOpenSubtitle;", "", "()V", "iDMovie", "", "getIDMovie", "()Ljava/lang/String;", "setIDMovie", "(Ljava/lang/String;)V", "iDMovieImdb", "getIDMovieImdb", "setIDMovieImdb", "iDSubMovieFile", "getIDSubMovieFile", "setIDSubMovieFile", "iDSubtitle", "getIDSubtitle", "setIDSubtitle", "iDSubtitleFile", "getIDSubtitleFile", "setIDSubtitleFile", "iSO639", "getISO639", "setISO639", "infoFormat", "getInfoFormat", "setInfoFormat", "infoOther", "getInfoOther", "setInfoOther", "infoReleaseGroup", "getInfoReleaseGroup", "setInfoReleaseGroup", "languageName", "getLanguageName", "setLanguageName", "matchedBy", "getMatchedBy", "setMatchedBy", "movieByteSize", "getMovieByteSize", "setMovieByteSize", "movieFPS", "getMovieFPS", "setMovieFPS", "movieHash", "getMovieHash", "setMovieHash", "movieImdbRating", "getMovieImdbRating", "setMovieImdbRating", "movieKind", "getMovieKind", "setMovieKind", "movieName", "getMovieName", "setMovieName", "movieReleaseName", "getMovieReleaseName", "setMovieReleaseName", "movieTimeMS", "getMovieTimeMS", "setMovieTimeMS", "movieYear", "getMovieYear", "setMovieYear", "queryCached", "", "getQueryCached", "()I", "setQueryCached", "(I)V", "queryNumber", "getQueryNumber", "setQueryNumber", "score", "", "getScore", "()D", "setScore", "(D)V", "seriesEpisode", "getSeriesEpisode", "setSeriesEpisode", "seriesIMDBParent", "getSeriesIMDBParent", "setSeriesIMDBParent", "seriesSeason", "getSeriesSeason", "setSeriesSeason", "subActualCD", "getSubActualCD", "setSubActualCD", "subAddDate", "getSubAddDate", "setSubAddDate", "subAuthorComment", "getSubAuthorComment", "setSubAuthorComment", "subAutoTranslation", "getSubAutoTranslation", "setSubAutoTranslation", "subBad", "getSubBad", "setSubBad", "subComments", "getSubComments", "setSubComments", "subDownloadLink", "getSubDownloadLink", "setSubDownloadLink", "subDownloadsCnt", "getSubDownloadsCnt", "setSubDownloadsCnt", "subEncoding", "getSubEncoding", "setSubEncoding", "subFeatured", "getSubFeatured", "setSubFeatured", "subFileName", "getSubFileName", "setSubFileName", "subForeignPartsOnly", "getSubForeignPartsOnly", "setSubForeignPartsOnly", "subFormat", "getSubFormat", "setSubFormat", "subFromTrusted", "getSubFromTrusted", "setSubFromTrusted", "subHD", "getSubHD", "setSubHD", "subHash", "getSubHash", "setSubHash", "subHearingImpaired", "getSubHearingImpaired", "setSubHearingImpaired", "subLanguageID", "getSubLanguageID", "setSubLanguageID", "subLastTS", "getSubLastTS", "setSubLastTS", "subRating", "getSubRating", "setSubRating", "subSize", "getSubSize", "setSubSize", "subSumCD", "getSubSumCD", "setSubSumCD", "subSumVotes", "getSubSumVotes", "setSubSumVotes", "subTSGroup", "getSubTSGroup", "setSubTSGroup", "subTSGroupHash", "getSubTSGroupHash", "setSubTSGroupHash", "subTranslator", "getSubTranslator", "setSubTranslator", "subtitlesLink", "getSubtitlesLink", "setSubtitlesLink", SDKConstants.PARAM_USER_ID, "getUserID", "setUserID", "userNickName", "getUserNickName", "setUserNickName", "userRank", "getUserRank", "setUserRank", "zipDownloadLink", "getZipDownloadLink", "setZipDownloadLink", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class SubtitleResponseOpenSubtitle {
    @SerializedName("IDMovie")
    @Expose
    var iDMovie: String? = null

    @SerializedName("IDMovieImdb")
    @Expose
    var iDMovieImdb: String? = null

    @SerializedName("IDSubMovieFile")
    @Expose
    var iDSubMovieFile: String? = null

    @SerializedName("IDSubtitle")
    @Expose
    var iDSubtitle: String? = null

    @SerializedName("IDSubtitleFile")
    @Expose
    var iDSubtitleFile: String? = null

    @SerializedName("ISO639")
    @Expose
    var iSO639: String? = null

    @SerializedName("InfoFormat")
    @Expose
    var infoFormat: String? = null

    @SerializedName("InfoOther")
    @Expose
    var infoOther: String? = null

    @SerializedName("InfoReleaseGroup")
    @Expose
    var infoReleaseGroup: String? = null

    @SerializedName("LanguageName")
    @Expose
    var languageName: String? = null

    @SerializedName("MatchedBy")
    @Expose
    var matchedBy: String? = null

    @SerializedName("MovieByteSize")
    @Expose
    var movieByteSize: String? = null

    @SerializedName("MovieFPS")
    @Expose
    var movieFPS: String? = null

    @SerializedName("MovieHash")
    @Expose
    var movieHash: String? = null

    @SerializedName("MovieImdbRating")
    @Expose
    var movieImdbRating: String? = null

    @SerializedName("MovieKind")
    @Expose
    var movieKind: String? = null

    @SerializedName("MovieName")
    @Expose
    var movieName: String? = null

    @SerializedName("MovieReleaseName")
    @Expose
    var movieReleaseName: String? = null

    @SerializedName("MovieTimeMS")
    @Expose
    var movieTimeMS: String? = null

    @SerializedName("MovieYear")
    @Expose
    var movieYear: String? = null

    @SerializedName("QueryCached")
    @Expose
    var queryCached = 0

    @SerializedName("QueryNumber")
    @Expose
    var queryNumber: String? = null

    @SerializedName("Score")
    @Expose
    var score = 0.0

    @SerializedName("SeriesEpisode")
    @Expose
    var seriesEpisode: String? = null

    @SerializedName("SeriesIMDBParent")
    @Expose
    var seriesIMDBParent: String? = null

    @SerializedName("SeriesSeason")
    @Expose
    var seriesSeason: String? = null

    @SerializedName("SubActualCD")
    @Expose
    var subActualCD: String? = null

    @SerializedName("SubAddDate")
    @Expose
    var subAddDate: String? = null

    @SerializedName("SubAuthorComment")
    @Expose
    var subAuthorComment: String? = null

    @SerializedName("SubAutoTranslation")
    @Expose
    var subAutoTranslation: String? = null

    @SerializedName("SubBad")
    @Expose
    var subBad: String? = null

    @SerializedName("SubComments")
    @Expose
    var subComments: String? = null

    @SerializedName("SubDownloadLink")
    @Expose
    var subDownloadLink: String? = null

    @SerializedName("SubDownloadsCnt")
    @Expose
    var subDownloadsCnt: String? = null

    @SerializedName("SubEncoding")
    @Expose
    var subEncoding: String? = null

    @SerializedName("SubFeatured")
    @Expose
    var subFeatured: String? = null

    @SerializedName("SubFileName")
    @Expose
    var subFileName: String? = null

    @SerializedName("SubForeignPartsOnly")
    @Expose
    var subForeignPartsOnly: String? = null

    @SerializedName("SubFormat")
    @Expose
    var subFormat: String? = null

    @SerializedName("SubFromTrusted")
    @Expose
    var subFromTrusted: String? = null

    @SerializedName("SubHD")
    @Expose
    var subHD: String? = null

    @SerializedName("SubHash")
    @Expose
    var subHash: String? = null

    @SerializedName("SubHearingImpaired")
    @Expose
    var subHearingImpaired: String? = null

    @SerializedName("SubLanguageID")
    @Expose
    var subLanguageID: String? = null

    @SerializedName("SubLastTS")
    @Expose
    var subLastTS: String? = null

    @SerializedName("SubRating")
    @Expose
    var subRating: String? = null

    @SerializedName("SubSize")
    @Expose
    var subSize: String? = null

    @SerializedName("SubSumCD")
    @Expose
    var subSumCD: String? = null

    @SerializedName("SubSumVotes")
    @Expose
    var subSumVotes: String? = null

    @SerializedName("SubTSGroup")
    @Expose
    var subTSGroup: String? = null

    @SerializedName("SubTSGroupHash")
    @Expose
    var subTSGroupHash: String? = null

    @SerializedName("SubTranslator")
    @Expose
    var subTranslator: String? = null

    @SerializedName("SubtitlesLink")
    @Expose
    var subtitlesLink: String? = null

    @SerializedName("UserID")
    @Expose
    var userID: String? = null

    @SerializedName("UserNickName")
    @Expose
    var userNickName: String? = null

    @SerializedName("UserRank")
    @Expose
    var userRank: String? = null

    @SerializedName("ZipDownloadLink")
    @Expose
    var zipDownloadLink: String? = null
}