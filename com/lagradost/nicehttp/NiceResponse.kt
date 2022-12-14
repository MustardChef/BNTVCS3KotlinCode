package com.lagradost.nicehttp

import com.fasterxml.jackson.core.type.TypeReference
import okhttp3.Headers
import okhttp3.Response
import java.util.Map
import kotlin.jvm.internal.Intrinsics

/* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010/\u001a\u0002H0\"\n\b\u0000\u00100\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u00101J\u001c\u00102\u001a\u0004\u0018\u0001H0\"\n\b\u0000\u00100\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u00101J\b\u00103\u001a\u00020\u0011H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u000c¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001d\u0010#\u001a\u0004\u0018\u00010$8FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b'\u0010\n\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b.\u0010\n\u001a\u0004\b-\u0010*¨\u00064"],
    m107d2 = ["Lcom/lagradost/nicehttp/NiceResponse;", "", "okhttpResponse", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "body", "Lokhttp3/ResponseBody;", "getBody", "()Lokhttp3/ResponseBody;", "body\$delegate", "Lkotlin/Lazy;", "code", "", "getCode", "()I", "cookies", "", "", "getCookies", "()Ljava/util/Map;", "cookies\$delegate", "document", "Lorg/jsoup/nodes/Document;", "getDocument", "()Lorg/jsoup/nodes/Document;", "document\$delegate", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "isSuccessful", "", "()Z", "getOkhttpResponse", "()Lokhttp3/Response;", "size", "", "getSize", "()Ljava/lang/Long;", "size\$delegate", "text", "getText", "()Ljava/lang/String;", "text\$delegate", "url", "getUrl", "url\$delegate", "parsed", ExifInterface.GPS_DIRECTION_TRUE, "()Ljava/lang/Object;", "parsedSafe", "toString", "library_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class NiceResponse(okhttpResponse: Response) {
    private val `body$delegate`: Lazy<*>
    val code: Int
    private val `cookies$delegate`: Lazy<*>
    private val `document$delegate`: Lazy<*>
    val headers: Headers
    val isSuccessful: Boolean
    val okhttpResponse: Response
    private val `size$delegate`: Lazy<*>
    private val `text$delegate`: Lazy<*>
    private val `url$delegate`: Lazy<*>

    init {
        Intrinsics.checkNotNullParameter(okhttpResponse, "okhttpResponse")
        this.okhttpResponse = okhttpResponse
        `text$delegate` = LazyKt.lazy(`NiceResponse$text$2`(this))
        `url$delegate` = LazyKt.lazy(`NiceResponse$url$2`(this))
        `cookies$delegate` = LazyKt.lazy(`NiceResponse$cookies$2`(this))
        `body$delegate` = LazyKt.lazy(`NiceResponse$body$2`(this))
        code = okhttpResponse.code()
        headers = okhttpResponse.headers()
        `size$delegate` = LazyKt.lazy(`NiceResponse$size$2`(this))
        isSuccessful = okhttpResponse.isSuccessful
        `document$delegate` = LazyKt.lazy(`NiceResponse$document$2`(this))
    }

    val text: String
        get() = `text$delegate`.value as String
    val url: String
        get() = `url$delegate`.value as String
    val cookies: Map<String, String>
        get() = `cookies$delegate`.value as Map
    val body: ResponseBody
        get() = `body$delegate`.value as ResponseBody
    val size: Long
        get() = `size$delegate`.value as Long
    val document: Document
        get() {
            val value: Object = `document$delegate`.value
            Intrinsics.checkNotNullExpressionValue(value, "<get-document>(...)")
            return value as Document
        }

    /* synthetic */  fun <T> parsed(): T {
        val mapper: ObjectMapper = Requests.Companion.Companion.getMapper()
        val text = text
        Intrinsics.needClassReification()
        return mapper.readValue<T>(
            text,
            object :
                TypeReference<T>() { // from class: com.lagradost.nicehttp.NiceResponse$parsed$$inlined$readValue$1
            })
    }

    /* synthetic */  fun <T> parsedSafe(): T? {
        return try {
            val mapper: ObjectMapper = Requests.Companion.Companion.getMapper()
            val text = text
            Intrinsics.needClassReification()
            mapper.readValue<T>(
                text,
                object :
                    TypeReference<T>() { // from class: com.lagradost.nicehttp.NiceResponse$parsedSafe$$inlined$readValue$1
                })
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override fun toString(): String {
        return text
    }
}