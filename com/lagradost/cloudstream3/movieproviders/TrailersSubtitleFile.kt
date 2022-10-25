package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: TrailersTwoProvider.kt */
@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003J¶\u0001\u00104\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\$R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001f¨\u0006:"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TrailersSubtitleFile;", "", "SubtitleID", "", "ItemID", "ContentText", "", "ContentHash", "LanguageCode", "MetaInfo", "Lcom/lagradost/cloudstream3/movieproviders/MetaInfo;", "EntryDate", "ItemSubtitleAdaptations", "", "Lcom/lagradost/cloudstream3/movieproviders/ItemSubtitleAdaptations;", "ReleaseNames", "SubFileNames", "Framerates", "IsRelevant", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/MetaInfo;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getContentHash", "()Ljava/lang/String;", "getContentText", "getEntryDate", "getFramerates", "()Ljava/util/List;", "getIsRelevant", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItemID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemSubtitleAdaptations", "getLanguageCode", "getMetaInfo", "()Lcom/lagradost/cloudstream3/movieproviders/MetaInfo;", "getReleaseNames", "getSubFileNames", "getSubtitleID", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/MetaInfo;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/movieproviders/TrailersSubtitleFile;", "equals", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TrailersSubtitleFile(
    @JsonProperty("SubtitleID") num: Integer,
    @JsonProperty("ItemID") num2: Integer,
    @JsonProperty("ContentText") str: String,
    @JsonProperty("ContentHash") str2: String,
    @JsonProperty("LanguageCode") str3: String,
    @JsonProperty("MetaInfo") metaInfo: MetaInfo,
    @JsonProperty("EntryDate") str4: String,
    @JsonProperty("ItemSubtitleAdaptations") list: List<ItemSubtitleAdaptations>,
    @JsonProperty("ReleaseNames") list2: List<String>,
    @JsonProperty("SubFileNames") list3: List<String>,
    @JsonProperty("Framerates") list4: List<Integer>,
    @JsonProperty("IsRelevant") bool: Boolean
) {
    val contentHash: String
    val contentText: String
    val entryDate: String
    private val Framerates: List<Integer>
    val isRelevant: Boolean
    private val ItemID: Integer
    val itemSubtitleAdaptations: List<ItemSubtitleAdaptations>
    val languageCode: String
    val metaInfo: MetaInfo
    val releaseNames: List<String>
    val subFileNames: List<String>
    private val SubtitleID: Integer
    operator fun component1(): Integer {
        return SubtitleID
    }

    operator fun component10(): List<String> {
        return subFileNames
    }

    operator fun component11(): List<Integer> {
        return Framerates
    }

    operator fun component12(): Boolean {
        return isRelevant
    }

    operator fun component2(): Integer {
        return ItemID
    }

    operator fun component3(): String {
        return contentText
    }

    operator fun component4(): String {
        return contentHash
    }

    operator fun component5(): String {
        return languageCode
    }

    operator fun component6(): MetaInfo {
        return metaInfo
    }

    operator fun component7(): String {
        return entryDate
    }

    operator fun component8(): List<ItemSubtitleAdaptations> {
        return itemSubtitleAdaptations
    }

    operator fun component9(): List<String> {
        return releaseNames
    }

    fun copy(
        @JsonProperty("SubtitleID") num: Integer,
        @JsonProperty("ItemID") num2: Integer,
        @JsonProperty("ContentText") str: String,
        @JsonProperty("ContentHash") str2: String,
        @JsonProperty("LanguageCode") str3: String,
        @JsonProperty("MetaInfo") metaInfo: MetaInfo,
        @JsonProperty("EntryDate") str4: String,
        @JsonProperty("ItemSubtitleAdaptations") list: List<ItemSubtitleAdaptations>,
        @JsonProperty("ReleaseNames") list2: List<String>,
        @JsonProperty("SubFileNames") list3: List<String>,
        @JsonProperty("Framerates") list4: List<Integer>,
        @JsonProperty("IsRelevant") bool: Boolean
    ): TrailersSubtitleFile {
        return TrailersSubtitleFile(
            num,
            num2,
            str,
            str2,
            str3,
            metaInfo,
            str4,
            list,
            list2,
            list3,
            list4,
            bool
        )
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is TrailersSubtitleFile) {
            val trailersSubtitleFile = obj as TrailersSubtitleFile
            return Intrinsics.areEqual(
                SubtitleID,
                trailersSubtitleFile.SubtitleID
            ) && Intrinsics.areEqual(
                ItemID, trailersSubtitleFile.ItemID
            ) && Intrinsics.areEqual(
                contentText, trailersSubtitleFile.contentText
            ) && Intrinsics.areEqual(
                contentHash, trailersSubtitleFile.contentHash
            ) && Intrinsics.areEqual(
                languageCode, trailersSubtitleFile.languageCode
            ) && Intrinsics.areEqual(
                metaInfo, trailersSubtitleFile.metaInfo
            ) && Intrinsics.areEqual(
                entryDate, trailersSubtitleFile.entryDate
            ) && Intrinsics.areEqual(
                itemSubtitleAdaptations, trailersSubtitleFile.itemSubtitleAdaptations
            ) && Intrinsics.areEqual(
                releaseNames, trailersSubtitleFile.releaseNames
            ) && Intrinsics.areEqual(
                subFileNames, trailersSubtitleFile.subFileNames
            ) && Intrinsics.areEqual(
                Framerates, trailersSubtitleFile.Framerates
            ) && Intrinsics.areEqual(
                isRelevant, trailersSubtitleFile.isRelevant
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val num: Integer = SubtitleID
        val hashCode = (if (num == null) 0 else num.hashCode()) * 31
        val num2: Integer = ItemID
        val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
        val str = contentText
        val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
        val str2 = contentHash
        val hashCode4 = (hashCode3 + (str2?.hashCode() ?: 0)) * 31
        val str3 = languageCode
        val hashCode5 = (hashCode4 + (str3?.hashCode() ?: 0)) * 31
        val metaInfo = metaInfo
        val hashCode6 = (hashCode5 + (metaInfo?.hashCode() ?: 0)) * 31
        val str4 = entryDate
        val hashCode7 = (hashCode6 + (str4?.hashCode() ?: 0)) * 31
        val list = itemSubtitleAdaptations
        val hashCode8 = (hashCode7 + (list?.hashCode() ?: 0)) * 31
        val list2 = releaseNames
        val hashCode9 = (hashCode8 + (list2?.hashCode() ?: 0)) * 31
        val list3 = subFileNames
        val hashCode10 = (hashCode9 + (list3?.hashCode() ?: 0)) * 31
        val list4: List<Integer> = Framerates
        val hashCode11 = (hashCode10 + (list4?.hashCode() ?: 0)) * 31
        val bool = isRelevant
        return hashCode11 + (bool?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "TrailersSubtitleFile(SubtitleID=" + SubtitleID + ", ItemID=" + ItemID + ", ContentText=" + contentText + ", ContentHash=" + contentHash + ", LanguageCode=" + languageCode + ", MetaInfo=" + metaInfo + ", EntryDate=" + entryDate + ", ItemSubtitleAdaptations=" + itemSubtitleAdaptations + ", ReleaseNames=" + releaseNames + ", SubFileNames=" + subFileNames + ", Framerates=" + Framerates + ", IsRelevant=" + isRelevant + ')'
    }

    init {
        SubtitleID = num
        ItemID = num2
        contentText = str
        contentHash = str2
        languageCode = str3
        this.metaInfo = metaInfo
        entryDate = str4
        itemSubtitleAdaptations = list
        releaseNames = list2
        subFileNames = list3
        Framerates = list4
        isRelevant = bool
    }

    fun getSubtitleID(): Integer {
        return SubtitleID
    }

    fun getItemID(): Integer {
        return ItemID
    }

    fun getFramerates(): List<Integer> {
        return Framerates
    }
}