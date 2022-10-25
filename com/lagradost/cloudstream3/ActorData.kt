package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ActorData;", "", "actor", "Lcom/lagradost/cloudstream3/Actor;", "role", "Lcom/lagradost/cloudstream3/ActorRole;", "roleString", "", "voiceActor", "(Lcom/lagradost/cloudstream3/Actor;Lcom/lagradost/cloudstream3/ActorRole;Ljava/lang/String;Lcom/lagradost/cloudstream3/Actor;)V", "getActor", "()Lcom/lagradost/cloudstream3/Actor;", "getRole", "()Lcom/lagradost/cloudstream3/ActorRole;", "getRoleString", "()Ljava/lang/String;", "getVoiceActor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class ActorData(actor: Actor, actorRole: ActorRole?, str: String?, actor2: Actor?) {
    val actor: Actor
    val role: ActorRole?
    val roleString: String?
    val voiceActor: Actor?
    operator fun component1(): Actor {
        return actor
    }

    operator fun component2(): ActorRole? {
        return role
    }

    operator fun component3(): String? {
        return roleString
    }

    operator fun component4(): Actor? {
        return voiceActor
    }

    fun copy(actor: Actor, actorRole: ActorRole?, str: String?, actor2: Actor?): ActorData {
        Intrinsics.checkNotNullParameter(actor, "actor")
        return ActorData(actor, actorRole, str, actor2)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is ActorData) {
            val actorData = obj as ActorData
            return Intrinsics.areEqual(
                actor,
                actorData.actor
            ) && role == actorData.role && Intrinsics.areEqual(
                roleString, actorData.roleString
            ) && Intrinsics.areEqual(
                voiceActor, actorData.voiceActor
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = actor.hashCode() * 31
        val actorRole = role
        val hashCode2: Int = (hashCode + if (actorRole == null) 0 else actorRole.hashCode()) * 31
        val str = roleString
        val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
        val actor = voiceActor
        return hashCode3 + (actor?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "ActorData(actor=" + actor + ", role=" + role + ", roleString=" + roleString + ", voiceActor=" + voiceActor + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(actor, "actor")
        this.actor = actor
        role = actorRole
        roleString = str
        voiceActor = actor2
    }

    /* synthetic */   constructor(
        actor: Actor,
        actorRole: ActorRole?,
        str: String?,
        actor2: Actor?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        actor,
        if (i and 2 != 0) null else actorRole,
        if (i and 4 != 0) null else str,
        if (i and 8 != 0) null else actor2
    ) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            actorData: ActorData,
            actor: Actor,
            actorRole: ActorRole?,
            str: String?,
            actor2: Actor?,
            i: Int,
            obj: Object?
        ): ActorData {
            var actor = actor
            var actorRole = actorRole
            var str = str
            var actor2 = actor2
            if (i and 1 != 0) {
                actor = actorData.actor
            }
            if (i and 2 != 0) {
                actorRole = actorData.role
            }
            if (i and 4 != 0) {
                str = actorData.roleString
            }
            if (i and 8 != 0) {
                actor2 = actorData.voiceActor
            }
            return actorData.copy(actor, actorRole, str, actor2)
        }
    }
}