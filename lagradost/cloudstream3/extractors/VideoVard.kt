package com.lagradost.cloudstream3.extractors

import java.math.BigInteger
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: VideoVard.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/VideoVard;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VideoVard : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var name = "Videovard"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var mainUrl = "https://videovard.to"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0124 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */ /* JADX WARN: Removed duplicated region for block: B:28:0x01c1 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:29:0x01c2  */
    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getUrl(
        r33: String?,
        r34: String?,
        r35: Continuation<in MutableList<out ExtractorLink?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.VideoVard.getUrl(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: VideoVard.kt */
    @Metadata(
        m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002*+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0002J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\u000c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\u000c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J*\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/VideoVard\$Companion;", "", "()V", "big0", "Ljava/math/BigInteger;", "big15", "big16", "big255", "big3", "big4", "ascii2bytes", "", TvContractCompat.PARAM_INPUT, "", "binaryDigest", "blocks2bytes", "inp", "bytes2blocks", "a22", "decode", "dataFile", "seed", "digestPad", TypedValues.Custom.S_STRING, "padLastChars", "rShift", "by", "", "replace", "a", "tearCode", "", "list1", "list2", "tearDecode", "a90", "a91", "unPad", "a46", "xorBlocks", "a76", "a77", "HashResponse", "SetupResponse", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* JADX INFO: Access modifiers changed from: private */
        fun decode(str: String, str2: String): String {
            val binaryDigest: List<BigInteger> = binaryDigest(replace(str2))
            val bytes2blocks: List<BigInteger> = bytes2blocks(ascii2bytes(str))
            var i = 0
            val listOf: List<Number> =
                CollectionsKt.listOf<Object>(*arrayOf(1633837924, 1650680933) as Array<Object>)
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10))
            for (number in listOf) {
                val valueOf: BigInteger = BigInteger.valueOf(number.intValue())
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())")
                arrayList.add(valueOf)
            }
            var arrayList2: ArrayList = arrayList
            val arrayList3 = ArrayList()
            val progressionLastElement: Int =
                progressionUtil.getProgressionLastElement(0, bytes2blocks.size() - 1, 2)
            if (progressionLastElement >= 0) {
                while (true) {
                    val slice: List<BigInteger?> =
                        CollectionsKt.slice(bytes2blocks, IntRange(i, i + 1))
                    CollectionsKt.addAll(
                        arrayList3,
                        xorBlocks(arrayList2, tearDecode(slice, binaryDigest))
                    )
                    if (i == progressionLastElement) {
                        break
                    }
                    i += 2
                    arrayList2 = slice
                }
            }
            val unPad: List<BigInteger> = unPad(blocks2bytes(arrayList3))
            val arrayList4 = ArrayList(CollectionsKt.collectionSizeOrDefault(unPad, 10))
            for (bigInteger in unPad) {
                arrayList4.add(Character.valueOf(bigInteger.intValue() as Char))
            }
            return padLastChars(
                replace(
                    CollectionsKt.`joinToString$default`(
                        arrayList4,
                        "",
                        null,
                        null,
                        0,
                        null,
                        null,
                        62,
                        null
                    )
                )
            )
        }

        private fun binaryDigest(str: String): List<BigInteger> {
            val listOf: List<Number> = CollectionsKt.listOf<Object>(
                *arrayOf(
                    1633837924,
                    1650680933,
                    1667523942,
                    1684366951
                ) as Array<Object>
            )
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10))
            for (number in listOf) {
                val valueOf: BigInteger = BigInteger.valueOf(number.intValue())
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())")
                arrayList.add(valueOf)
            }
            val arrayList2: ArrayList = arrayList
            var slice: List<BigInteger?> = CollectionsKt.slice(arrayList2 as List, IntRange(0, 1))
            val bytes2blocks: List<BigInteger> = bytes2blocks(digestPad(str))
            val progressionLastElement: Int =
                progressionUtil.getProgressionLastElement(0, bytes2blocks.size() - 1, 4)
            var list: List<BigInteger?> = slice
            if (progressionLastElement >= 0) {
                var i = 0
                while (true) {
                    slice = CollectionsKt.toMutableList(
                        tearCode(
                            xorBlocks(
                                CollectionsKt.slice(
                                    bytes2blocks, IntRange(i, i + 1)
                                ), slice
                            ), arrayList2
                        ) as Collection
                    )
                    list = CollectionsKt.toMutableList(
                        tearCode(
                            xorBlocks(
                                CollectionsKt.slice(
                                    bytes2blocks, IntRange(i + 2, i + 3)
                                ), list
                            ), arrayList2
                        ) as Collection
                    )
                    slice.set(0, slice[1])
                    slice.set(1, list[0])
                    list.set(0, list[1])
                    list.set(1, slice[0])
                    if (i == progressionLastElement) {
                        break
                    }
                    i += 4
                }
            }
            return CollectionsKt.listOf<Object>(
                *arrayOf<BigInteger?>(
                    slice[0],
                    slice[1],
                    list[0],
                    list[1]
                ) as Array<Object?>
            )
        }

        private fun tearDecode(
            list: List<BigInteger?>,
            list2: List<BigInteger?>
        ): List<BigInteger> {
            var bigInteger: BigInteger? = list[0]
            var bigInteger2: BigInteger? = list[1]
            var valueOf: BigInteger = BigInteger.valueOf(-957401312)
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())")
            for (i in 0..31) {
                val shiftLeft: BigInteger = bigInteger.shiftLeft(4)
                Intrinsics.checkNotNullExpressionValue(shiftLeft, "this.shiftLeft(n)")
                val xor: BigInteger = shiftLeft.xor(rShift(bigInteger, 5))
                Intrinsics.checkNotNullExpressionValue(xor, "this.xor(other)")
                val add: BigInteger = xor.add(bigInteger)
                Intrinsics.checkNotNullExpressionValue(add, "this.add(other)")
                val rShift: BigInteger = rShift(valueOf, 11)
                val j: Long = 3
                val valueOf2: BigInteger = BigInteger.valueOf(j)
                Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(this.toLong())")
                val add2: BigInteger = valueOf.add(list2[rShift.and(valueOf2).intValue()])
                Intrinsics.checkNotNullExpressionValue(add2, "this.add(other)")
                val xor2: BigInteger = add.xor(add2)
                Intrinsics.checkNotNullExpressionValue(xor2, "this.xor(other)")
                bigInteger2 = bigInteger2.subtract(xor2)
                Intrinsics.checkNotNullExpressionValue(bigInteger2, "this.subtract(other)")
                val valueOf3: BigInteger = BigInteger.valueOf(1640531527)
                Intrinsics.checkNotNullExpressionValue(valueOf3, "valueOf(this.toLong())")
                valueOf = valueOf.add(valueOf3)
                Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)")
                val shiftLeft2: BigInteger = bigInteger2.shiftLeft(4)
                Intrinsics.checkNotNullExpressionValue(shiftLeft2, "this.shiftLeft(n)")
                val xor3: BigInteger = shiftLeft2.xor(rShift(bigInteger2, 5))
                Intrinsics.checkNotNullExpressionValue(xor3, "this.xor(other)")
                val add3: BigInteger = xor3.add(bigInteger2)
                Intrinsics.checkNotNullExpressionValue(add3, "this.add(other)")
                val valueOf4: BigInteger = BigInteger.valueOf(j)
                Intrinsics.checkNotNullExpressionValue(valueOf4, "valueOf(this.toLong())")
                val add4: BigInteger = valueOf.add(list2[valueOf.and(valueOf4).intValue()])
                Intrinsics.checkNotNullExpressionValue(add4, "this.add(other)")
                val xor4: BigInteger = add3.xor(add4)
                Intrinsics.checkNotNullExpressionValue(xor4, "this.xor(other)")
                bigInteger = bigInteger.subtract(xor4)
                Intrinsics.checkNotNullExpressionValue(bigInteger, "this.subtract(other)")
            }
            return CollectionsKt.mutableListOf<Any>(bigInteger, bigInteger2)
        }

        private fun digestPad(str: String): List<BigInteger> {
            val arrayList = ArrayList()
            val length: Int = str.length()
            val bigInteger: BigInteger = VideoVard.Companion.big15
            val valueOf: BigInteger = BigInteger.valueOf(length)
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())")
            val remainder: BigInteger = valueOf.remainder(VideoVard.Companion.big16)
            Intrinsics.checkNotNullExpressionValue(remainder, "this.remainder(other)")
            val subtract: BigInteger = bigInteger.subtract(remainder)
            Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(other)")
            arrayList.add(subtract)
            for (i in 0 until length) {
                val valueOf2: BigInteger = BigInteger.valueOf(str.charAt(i))
                Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(this.toLong())")
                arrayList.add(valueOf2)
            }
            val intValue: Int = subtract.intValue()
            for (i2 in 0 until intValue) {
                arrayList.add(VideoVard.Companion.big0)
            }
            return arrayList
        }

        private fun bytes2blocks(list: List<BigInteger?>): List<BigInteger> {
            val arrayList = ArrayList()
            val size: Int = list.size()
            var i = 0
            for (i2 in 0 until size) {
                val i3: Int = i2 % 4
                val shiftLeft: BigInteger = list[i2].shiftLeft((3 - i3) * 8)
                Intrinsics.checkNotNullExpressionValue(shiftLeft, "this.shiftLeft(n)")
                if (i3 == 0) {
                    arrayList.add(shiftLeft)
                } else {
                    val or: BigInteger = (arrayList.get(i) as BigInteger).or(shiftLeft)
                    Intrinsics.checkNotNullExpressionValue(or, "this.or(other)")
                    arrayList.set(i, or)
                }
                if (i3 == 3) {
                    i++
                }
            }
            return arrayList
        }

        private fun blocks2bytes(list: List<BigInteger?>): List<BigInteger> {
            val arrayList = ArrayList()
            val it: Iterator<Integer> = CollectionsKt.getIndices(list).iterator()
            while (it.hasNext()) {
                val nextInt = (it as IntIterator).nextInt()
                val arrayList2: ArrayList = arrayList
                val and: BigInteger = VideoVard.Companion.big255.and(
                    VideoVard.Companion.Companion.rShift(
                        list[nextInt], 24
                    )
                )
                Intrinsics.checkNotNullExpressionValue(and, "this.and(other)")
                arrayList2.add(and)
                val and2: BigInteger = VideoVard.Companion.big255.and(
                    VideoVard.Companion.Companion.rShift(
                        list[nextInt], 16
                    )
                )
                Intrinsics.checkNotNullExpressionValue(and2, "this.and(other)")
                arrayList2.add(and2)
                val and3: BigInteger = VideoVard.Companion.big255.and(
                    VideoVard.Companion.Companion.rShift(
                        list[nextInt], 8
                    )
                )
                Intrinsics.checkNotNullExpressionValue(and3, "this.and(other)")
                arrayList2.add(and3)
                val and4: BigInteger = VideoVard.Companion.big255.and(list[nextInt])
                Intrinsics.checkNotNullExpressionValue(and4, "this.and(other)")
                arrayList2.add(and4)
            }
            return arrayList
        }

        private fun unPad(list: List<BigInteger?>): List<BigInteger> {
            val intValue: Int = list[0].intValue() % 2
            val until = RangesKt.until(
                1,
                list.size() - (intValue + (intValue xor 2 and (-intValue or intValue) shr 31 and 2))
            )
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10))
            val it: Iterator<Integer> = until.iterator()
            while (it.hasNext()) {
                arrayList.add(list[(it as IntIterator).nextInt()])
            }
            return arrayList
        }

        private fun xorBlocks(list: List<BigInteger?>, list2: List<BigInteger?>): List<BigInteger> {
            val xor: BigInteger = list[0].xor(list2[0])
            Intrinsics.checkNotNullExpressionValue(xor, "this.xor(other)")
            val xor2: BigInteger = list[1].xor(list2[1])
            Intrinsics.checkNotNullExpressionValue(xor2, "this.xor(other)")
            return CollectionsKt.listOf<Object>(*arrayOf<BigInteger>(xor, xor2) as Array<Object>)
        }

        private fun rShift(bigInteger: BigInteger?, i: Int): BigInteger {
            val valueOf: BigInteger = BigInteger.valueOf(4294967296L)
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)")
            val mod: BigInteger = bigInteger.mod(valueOf)
            Intrinsics.checkNotNullExpressionValue(mod, "input.mod(4294967296.toBigInteger())")
            val shiftRight: BigInteger = mod.shiftRight(i)
            Intrinsics.checkNotNullExpressionValue(shiftRight, "this.shiftRight(n)")
            return shiftRight
        }

        private fun tearCode(list: List<BigInteger?>, list2: List<BigInteger?>): List<BigInteger> {
            var bigInteger: BigInteger? = list[0]
            var bigInteger2: BigInteger? = list[1]
            var bigInteger3: BigInteger = VideoVard.Companion.big0
            for (i in 0..31) {
                val shiftLeft: BigInteger = bigInteger2.shiftLeft(4)
                Intrinsics.checkNotNullExpressionValue(shiftLeft, "this.shiftLeft(n)")
                val xor: BigInteger = shiftLeft.xor(rShift(bigInteger2, 5))
                Intrinsics.checkNotNullExpressionValue(xor, "this.xor(other)")
                val add: BigInteger = xor.add(bigInteger2)
                Intrinsics.checkNotNullExpressionValue(add, "this.add(other)")
                val and: BigInteger = bigInteger3.and(VideoVard.Companion.big3)
                Intrinsics.checkNotNullExpressionValue(and, "this.and(other)")
                val add2: BigInteger = bigInteger3.add(list2[and.intValue()])
                Intrinsics.checkNotNullExpressionValue(add2, "this.add(other)")
                val xor2: BigInteger = add.xor(add2)
                Intrinsics.checkNotNullExpressionValue(xor2, "this.xor(other)")
                bigInteger = bigInteger.add(xor2)
                Intrinsics.checkNotNullExpressionValue(bigInteger, "this.add(other)")
                val valueOf: BigInteger = BigInteger.valueOf(1640531527)
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())")
                bigInteger3 = bigInteger3.subtract(valueOf)
                Intrinsics.checkNotNullExpressionValue(bigInteger3, "this.subtract(other)")
                val shiftLeft2: BigInteger = bigInteger.shiftLeft(4)
                Intrinsics.checkNotNullExpressionValue(shiftLeft2, "this.shiftLeft(n)")
                val xor3: BigInteger = shiftLeft2.xor(rShift(bigInteger, 5))
                Intrinsics.checkNotNullExpressionValue(xor3, "this.xor(other)")
                val add3: BigInteger = xor3.add(bigInteger)
                Intrinsics.checkNotNullExpressionValue(add3, "this.add(other)")
                val and2: BigInteger = rShift(bigInteger3, 11).and(VideoVard.Companion.big3)
                Intrinsics.checkNotNullExpressionValue(and2, "this.and(other)")
                val add4: BigInteger = bigInteger3.add(list2[and2.intValue()])
                Intrinsics.checkNotNullExpressionValue(add4, "this.add(other)")
                val xor4: BigInteger = add3.xor(add4)
                Intrinsics.checkNotNullExpressionValue(xor4, "this.xor(other)")
                bigInteger2 = bigInteger2.add(xor4)
                Intrinsics.checkNotNullExpressionValue(bigInteger2, "this.add(other)")
            }
            return CollectionsKt.mutableListOf<Any>(bigInteger, bigInteger2)
        }

        private fun ascii2bytes(str: String): List<BigInteger> {
            val arrayList = ArrayList(r0.length())
            var i = 0
            var i2 = 0
            while (i < r0.length()) {
                val i3 = i2 + 1
                val valueOf: Character = Character.valueOf(r0.charAt(i))
                val valueOf2: BigInteger = BigInteger.valueOf(i2)
                Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(this.toLong())")
                arrayList.add(TuplesKt.m100to(valueOf, valueOf2))
                i++
                i2 = i3
            }
            val map: Map = MapsKt.toMap(arrayList)
            var i4 = -1
            val length: Int = str.length()
            val arrayList2 = ArrayList()
            var i5 = 0
            while (true) {
                val length2: Int = str.length()
                var i6 = 0
                while (true) {
                    if (i6 >= length2) {
                        break
                    } else if (StringsKt.`contains$default`(
                            r0 as CharSequence?,
                            str.charAt(i6),
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        i4++
                        break
                    } else {
                        i6++
                    }
                }
                val orNull: Character = StringsKt.getOrNull(str, i4) ?: return arrayList2
                val obj: Object = map.get(Character.valueOf(orNull.charValue()))
                Intrinsics.checkNotNull(obj)
                val multiply: BigInteger = (obj as BigInteger).multiply(VideoVard.Companion.big4)
                Intrinsics.checkNotNullExpressionValue(multiply, "this.multiply(other)")
                arrayList2.add(multiply)
                do {
                    i4++
                } while (!StringsKt.`contains$default`(
                        r0 as CharSequence?,
                        str.charAt(i4),
                        false,
                        2,
                        null as Object?
                    )
                )
                val obj2: Object = map.get(Character.valueOf(str.charAt(i4)))
                Intrinsics.checkNotNull(obj2)
                val bigInteger: BigInteger = obj2 as BigInteger
                val or: BigInteger = (arrayList2.get(i5) as BigInteger).or(rShift(bigInteger, 4))
                Intrinsics.checkNotNullExpressionValue(or, "this.or(other)")
                arrayList2.set(i5, or)
                val i7 = i5 + 1
                val and: BigInteger = VideoVard.Companion.big15.and(bigInteger)
                Intrinsics.checkNotNullExpressionValue(and, "big15.and(temp)")
                if (Intrinsics.areEqual(and, VideoVard.Companion.big0) && i4 == length - 1) {
                    return arrayList2
                }
                val multiply2: BigInteger = and.multiply(VideoVard.Companion.big4)
                Intrinsics.checkNotNullExpressionValue(multiply2, "this.multiply(other)")
                val multiply3: BigInteger = multiply2.multiply(VideoVard.Companion.big4)
                Intrinsics.checkNotNullExpressionValue(multiply3, "this.multiply(other)")
                arrayList2.add(multiply3)
                do {
                    i4++
                    if (i4 >= length) {
                        return arrayList2
                    }
                } while (!StringsKt.`contains$default`(
                        r0 as CharSequence?,
                        str.charAt(i4),
                        false,
                        2,
                        null as Object?
                    )
                )
                val obj3: Object = map.get(Character.valueOf(str.charAt(i4)))
                Intrinsics.checkNotNull(obj3)
                val bigInteger2: BigInteger = obj3 as BigInteger
                val or2: BigInteger = (arrayList2.get(i7) as BigInteger).or(rShift(bigInteger2, 2))
                Intrinsics.checkNotNullExpressionValue(or2, "this.or(other)")
                arrayList2.set(i7, or2)
                val i8 = i7 + 1
                val and2: BigInteger = VideoVard.Companion.big3.and(bigInteger2)
                Intrinsics.checkNotNullExpressionValue(and2, "this.and(other)")
                if (Intrinsics.areEqual(and2, VideoVard.Companion.big0) && i4 == length - 1) {
                    return arrayList2
                }
                val shiftLeft: BigInteger = and2.shiftLeft(6)
                Intrinsics.checkNotNullExpressionValue(shiftLeft, "this.shiftLeft(n)")
                arrayList2.add(shiftLeft)
                val length3: Int = str.length()
                for (i9 in 0 until length3) {
                    str.charAt(i9)
                    i4++
                    if (StringsKt.`contains$default`(
                            r0 as CharSequence?,
                            str.charAt(i4),
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        break
                    }
                }
                val obj4: Object = map.get(Character.valueOf(str.charAt(i4)))
                Intrinsics.checkNotNull(obj4)
                val or3: BigInteger = (arrayList2.get(i8) as BigInteger).or(obj4 as BigInteger)
                Intrinsics.checkNotNullExpressionValue(or3, "this.or(other)")
                arrayList2.set(i8, or3)
                i5 = i8 + 1
            }
        }

        private fun replace(str: String): String {
            val mapOf: Map = MapsKt.mapOf(
                TuplesKt.m100to('0', '5'),
                TuplesKt.m100to('1', '6'),
                TuplesKt.m100to('2', '7'),
                TuplesKt.m100to('5', '0'),
                TuplesKt.m100to('6', '1'),
                TuplesKt.m100to('7', '2')
            )
            var str3 = ""
            for (i in 0 until str.length()) {
                val charAt: Char = str.charAt(i)
                val sb = StringBuilder()
                sb.append(str3)
                sb.append(
                    if (mapOf.containsKey(Character.valueOf(charAt))) mapOf.get(
                        Character.valueOf(
                            charAt
                        )
                    ) as Character else Character.valueOf(charAt)
                )
                str3 = sb.toString()
            }
            return str3
        }

        private fun padLastChars(str: String): String {
            return if (Character.isDigit(
                    StringsKt.reversed(str as CharSequence).toString().charAt(3)
                )
            ) str else StringsKt.dropLast(str, 4)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* compiled from: VideoVard.kt */
        @Metadata(
            m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
            m107d2 = ["Lcom/lagradost/cloudstream3/extractors/VideoVard\$Companion\$HashResponse;", "", "hash", "", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "(Ljava/lang/String;Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes3.dex */
        class HashResponse(val hash: String?, val version: String?) {
            operator fun component1(): String? {
                return hash
            }

            operator fun component2(): String? {
                return version
            }

            fun copy(str: String?, str2: String?): HashResponse {
                return HashResponse(str, str2)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is HashResponse) {
                    val hashResponse = obj as HashResponse
                    return Intrinsics.areEqual(hash, hashResponse.hash) && Intrinsics.areEqual(
                        version, hashResponse.version
                    )
                }
                return false
            }

            override fun hashCode(): Int {
                val str = hash
                val hashCode = (str?.hashCode() ?: 0) * 31
                val str2 = version
                return hashCode + (str2?.hashCode() ?: 0)
            }

            override fun toString(): String {
                return "HashResponse(hash=" + hash + ", version=" + version + ')'
            }

            @JvmOverloads
                    /* synthetic */   constructor(
                str: String? = null,
                str2: String? = null,
                i: Int = 3,
                defaultConstructorMarker: DefaultConstructorMarker? = null
            ) : this(if (i and 1 != 0) null else str, if (i and 2 != 0) null else str2) {
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    hashResponse: HashResponse,
                    str: String?,
                    str2: String?,
                    i: Int,
                    obj: Object?
                ): HashResponse {
                    var str = str
                    var str2 = str2
                    if (i and 1 != 0) {
                        str = hashResponse.hash
                    }
                    if (i and 2 != 0) {
                        str2 = hashResponse.version
                    }
                    return hashResponse.copy(str, str2)
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* compiled from: VideoVard.kt */
        @Metadata(
            m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
            m107d2 = ["Lcom/lagradost/cloudstream3/extractors/VideoVard\$Companion\$SetupResponse;", "", "seed", "", "src", "link", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getSeed", "getSrc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes3.dex */
        class SetupResponse(seed: String, str: String?, str2: String?) {
            val link: String?
            val seed: String
            val src: String?
            operator fun component1(): String {
                return seed
            }

            operator fun component2(): String? {
                return src
            }

            operator fun component3(): String? {
                return link
            }

            fun copy(seed: String, str: String?, str2: String?): SetupResponse {
                Intrinsics.checkNotNullParameter(seed, "seed")
                return SetupResponse(seed, str, str2)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is SetupResponse) {
                    val setupResponse = obj as SetupResponse
                    return Intrinsics.areEqual(seed, setupResponse.seed) && Intrinsics.areEqual(
                        src, setupResponse.src
                    ) && Intrinsics.areEqual(link, setupResponse.link)
                }
                return false
            }

            override fun hashCode(): Int {
                val hashCode = seed.hashCode() * 31
                val str = src
                val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
                val str2 = link
                return hashCode2 + (str2?.hashCode() ?: 0)
            }

            override fun toString(): String {
                return "SetupResponse(seed=" + seed + ", src=" + src + ", link=" + link + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(seed, "seed")
                this.seed = seed
                src = str
                link = str2
            }

            /* synthetic */   constructor(
                str: String,
                str2: String?,
                str3: String?,
                i: Int,
                defaultConstructorMarker: DefaultConstructorMarker?
            ) : this(str, if (i and 2 != 0) null else str2, if (i and 4 != 0) null else str3) {
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    setupResponse: SetupResponse,
                    str: String,
                    str2: String?,
                    str3: String?,
                    i: Int,
                    obj: Object?
                ): SetupResponse {
                    var str = str
                    var str2 = str2
                    var str3 = str3
                    if (i and 1 != 0) {
                        str = setupResponse.seed
                    }
                    if (i and 2 != 0) {
                        str2 = setupResponse.src
                    }
                    if (i and 4 != 0) {
                        str3 = setupResponse.link
                    }
                    return setupResponse.copy(str, str2, str3)
                }
            }
        }
    }

    companion object {
        val Companion = Companion(null)
        private val big0: BigInteger? = null
        private val big15: BigInteger? = null
        private val big16: BigInteger? = null
        private val big255: BigInteger? = null
        private val big3: BigInteger? = null
        private val big4: BigInteger? = null

        init {
            val valueOf: BigInteger = BigInteger.valueOf(0L)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.extractors.valueOf,
                "valueOf(this.toLong())"
            )
            VideoVard.Companion.big0 = com.lagradost.cloudstream3.extractors.valueOf
            val valueOf2: BigInteger = BigInteger.valueOf(3)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.extractors.valueOf2,
                "valueOf(this.toLong())"
            )
            VideoVard.Companion.big3 = com.lagradost.cloudstream3.extractors.valueOf2
            val valueOf3: BigInteger = BigInteger.valueOf(4)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.extractors.valueOf3,
                "valueOf(this.toLong())"
            )
            VideoVard.Companion.big4 = com.lagradost.cloudstream3.extractors.valueOf3
            val valueOf4: BigInteger = BigInteger.valueOf(15)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.extractors.valueOf4,
                "valueOf(this.toLong())"
            )
            VideoVard.Companion.big15 = com.lagradost.cloudstream3.extractors.valueOf4
            val valueOf5: BigInteger = BigInteger.valueOf(16)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.extractors.valueOf5,
                "valueOf(this.toLong())"
            )
            VideoVard.Companion.big16 = com.lagradost.cloudstream3.extractors.valueOf5
            val valueOf6: BigInteger = BigInteger.valueOf(255)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.extractors.valueOf6,
                "valueOf(this.toLong())"
            )
            VideoVard.Companion.big255 = com.lagradost.cloudstream3.extractors.valueOf6
        }
    }
}