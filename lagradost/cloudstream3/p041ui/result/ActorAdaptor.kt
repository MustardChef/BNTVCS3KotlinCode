package com.lagradost.cloudstream3.p041ui.result

import android.view.LayoutInflater
import kotlin.jvm.internal.Intrinsics

/* compiled from: ActorAdaptor.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\u000c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0002J\u0014\u0010\u0014\u001a\u00020\n2\u000c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ActorAdaptor;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "()V", "actors", "", "Lcom/lagradost/cloudstream3/ui/result/ActorAdaptor\$ActorMetaData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateActorList", "newList", "", "updateList", "Lcom/lagradost/cloudstream3/ActorData;", "ActorMetaData", "CardViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ActorAdaptor */ /* loaded from: classes4.dex */
class ActorAdaptor constructor() : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    val actors: List<ActorMetaData> = ArrayList()

    /* compiled from: ActorAdaptor.kt */
    @Metadata(
        m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ActorAdaptor\$ActorMetaData;", "", "isInverted", "", "actor", "Lcom/lagradost/cloudstream3/ActorData;", "(ZLcom/lagradost/cloudstream3/ActorData;)V", "getActor", "()Lcom/lagradost/cloudstream3/ActorData;", "()Z", "setInverted", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ActorAdaptor$ActorMetaData */ /* loaded from: classes4.dex */
    class ActorMetaData constructor(z: Boolean, actor: ActorData) {
        private val actor: ActorData
        var isInverted: Boolean
        operator fun component1(): Boolean {
            return isInverted
        }

        operator fun component2(): ActorData {
            return actor
        }

        fun copy(z: Boolean, actor: ActorData): ActorMetaData {
            Intrinsics.checkNotNullParameter(actor, "actor")
            return ActorMetaData(z, actor)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ActorMetaData) {
                val actorMetaData: ActorMetaData = obj
                return isInverted == actorMetaData.isInverted && Intrinsics.areEqual(
                    actor, actorMetaData.actor
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v4 */ /* JADX WARN: Type inference failed for: r0v5 */
        override fun hashCode(): Int {
            val z: Boolean = isInverted
            r0 = z
            if (z) {
                r0 = 1
            }
            return (r0 * 31) + actor.hashCode()
        }

        override fun toString(): String {
            return "ActorMetaData(isInverted=" + isInverted + ", actor=" + actor + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(actor, "actor")
            isInverted = z
            this.actor = actor
        }

        fun getActor(): ActorData {
            return actor
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                actorMetaData: ActorMetaData,
                z: Boolean,
                actorData: ActorData,
                i: Int,
                obj: Object?
            ): ActorMetaData {
                var z: Boolean = z
                var actorData: ActorData = actorData
                if ((i and 1) != 0) {
                    z = actorMetaData.isInverted
                }
                if ((i and 2) != 0) {
                    actorData = actorMetaData.actor
                }
                return actorMetaData.copy(z, actorData)
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View =
            LayoutInflater.from(parent.getContext()).inflate(R.layout.cast_item, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…cast_item, parent, false)"
        )
        return CardViewHolder(inflate)
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is CardViewHolder) {
            (holder as CardViewHolder).bind(
                actors.get(i).getActor(),
                actors.get(i).isInverted,
                i,
                `ActorAdaptor$onBindViewHolder$1`(this, i)
            )
        }
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            return actors.size()
        }

    private fun updateActorList(list: List<ActorMetaData>) {
        val calculateDiff: DiffResult = DiffUtil.calculateDiff(ActorDiffCallback(actors, list))
        Intrinsics.checkNotNullExpressionValue(
            calculateDiff,
            "calculateDiff(\n         …ctors, newList)\n        )"
        )
        actors.clear()
        actors.addAll(list)
        calculateDiff.dispatchUpdatesTo(this)
    }

    fun updateList(newList: List<ActorData>) {
        var actorMetaData: ActorMetaData?
        Intrinsics.checkNotNullParameter(newList, "newList")
        if (actors.size() >= newList.size()) {
            val list: List<ActorData> = newList
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            var i: Int = 0
            for (obj: Object in list) {
                val i2: Int = i + 1
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow()
                }
                arrayList.add(
                    ActorMetaData.`copy$default`(
                        actors.get(i),
                        false,
                        obj as ActorData,
                        1,
                        null
                    )
                )
                i = i2
            }
            updateActorList(arrayList)
            return
        }
        val list2: List<ActorData> = newList
        val arrayList2: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
        var i3: Int = 0
        for (obj2: Object in list2) {
            val i4: Int = i3 + 1
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow()
            }
            val actorData: ActorData = obj2 as ActorData
            if (i3 < actors.size()) {
                actorMetaData =
                    ActorMetaData.`copy$default`(actors.get(i3), false, actorData, 1, null)
            } else {
                actorMetaData = ActorMetaData(false, actorData)
            }
            arrayList2.add(actorMetaData)
            i3 = i4
        }
        updateActorList(arrayList2)
    }

    /* compiled from: ActorAdaptor.kt */
    @Metadata(
        m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ActorAdaptor\$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "actorExtra", "Landroid/widget/TextView;", "actorImage", "Landroid/widget/ImageView;", "actorName", "voiceActorImage", "voiceActorImageHolder", "voiceActorName", "bind", "", "actor", "Lcom/lagradost/cloudstream3/ActorData;", "isInverted", "", "position", "", "callback", "Lkotlin/Function1;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* renamed from: com.lagradost.cloudstream3.ui.result.ActorAdaptor$CardViewHolder */ /* loaded from: classes4.dex */
    private class CardViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val actorExtra: TextView
        private val actorImage: ImageView
        private val actorName: TextView
        private val voiceActorImage: ImageView
        private val voiceActorImageHolder: View
        private val voiceActorName: TextView

        /* compiled from: ActorAdaptor.kt */
        @Metadata(
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* renamed from: com.lagradost.cloudstream3.ui.result.ActorAdaptor$CardViewHolder$WhenMappings */ /* loaded from: classes4.dex */
        /* synthetic */
        object WhenMappings {
            /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

            init {
                val iArr: IntArray = IntArray(ActorRole.values().size)
                com.lagradost.cloudstream3.p041ui.result.iArr.get(ActorRole.Main.ordinal()) = 1
                com.lagradost.cloudstream3.p041ui.result.iArr.get(ActorRole.Supporting.ordinal()) =
                    2
                com.lagradost.cloudstream3.p041ui.result.iArr.get(ActorRole.Background.ordinal()) =
                    3
                `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.result.iArr
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            val imageView: ImageView =
                itemView.findViewById(C4761R.C4764id.actor_image) as ImageView
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.actor_image")
            actorImage = imageView
            val textView: TextView = itemView.findViewById(C4761R.C4764id.actor_name) as TextView
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.actor_name")
            actorName = textView
            val textView2: TextView = itemView.findViewById(C4761R.C4764id.actor_extra) as TextView
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.actor_extra")
            actorExtra = textView2
            val imageView2: ImageView =
                itemView.findViewById(C4761R.C4764id.voice_actor_image) as ImageView
            Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.voice_actor_image")
            voiceActorImage = imageView2
            val cardView: CardView =
                itemView.findViewById(C4761R.C4764id.voice_actor_image_holder) as CardView
            Intrinsics.checkNotNullExpressionValue(cardView, "itemView.voice_actor_image_holder")
            voiceActorImageHolder = cardView
            val textView3: TextView =
                itemView.findViewById(C4761R.C4764id.voice_actor_name) as TextView
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.voice_actor_name")
            voiceActorName = textView3
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */ /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */ /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */ /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */ /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */ /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun bind(r19: ActorData?, r20: Boolean, r21: Int, r22: Function1<Int?, Unit>?) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ActorAdaptor.CardViewHolder.bind(com.lagradost.cloudstream3.ActorData, boolean, int, kotlin.jvm.functions.Function1):void")
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8753bind$lambda0`(callback: Function1<*, *>, i: Int, view: View?) {
                Intrinsics.checkNotNullParameter(callback, "\$callback")
                callback.invoke(Integer.valueOf(i))
            }
        }
    }
}