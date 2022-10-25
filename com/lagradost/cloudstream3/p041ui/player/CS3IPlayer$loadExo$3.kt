package com.lagradost.cloudstream3.p041ui.player

import com.google.android.exoplayer2.Format
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.MediaMetadata
import com.google.android.exoplayer2.Player
import java.util.List
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: CS3IPlayer.kt */
@Metadata(
    m108d1 = ["\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"],
    m107d2 = ["com/lagradost/cloudstream3/ui/player/CS3IPlayer\$loadExo$3", "Lcom/google/android/exoplayer2/Player\$Listener;", "onIsPlayingChanged", "", "isPlaying", "", "onPlaybackStateChanged", "playbackState", "", "onPlayerError", "error", "Lcom/google/android/exoplayer2/PlaybackException;", "onPlayerStateChanged", "playWhenReady", "onRenderedFirstFrame", "onTracksInfoChanged", "tracksInfo", "Lcom/google/android/exoplayer2/TracksInfo;", "onVideoSizeChanged", "videoSize", "Lcom/google/android/exoplayer2/video/VideoSize;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.CS3IPlayer$loadExo$3 */ /* loaded from: classes3.dex */
class `CS3IPlayer$loadExo$3`     /* JADX INFO: Access modifiers changed from: package-private */ constructor(  /* synthetic */
    val `this$0`: CS3IPlayer
) : Player.Listener {
    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onAudioAttributesChanged(audioAttributes: AudioAttributes) {
        Player.Listener.CC.`$default$onAudioAttributesChanged`(this, audioAttributes)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onAudioSessionIdChanged(i: Int) {
        Player.Listener.CC.`$default$onAudioSessionIdChanged`(this, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onAvailableCommandsChanged(commands: Commands) {
        Player.Listener.CC.`$default$onAvailableCommandsChanged`(this, commands)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onCues(list: List) {
        Player.Listener.CC.`$default$onCues`(this, list)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onDeviceInfoChanged(deviceInfo: DeviceInfo) {
        Player.Listener.CC.`$default$onDeviceInfoChanged`(this, deviceInfo)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onDeviceVolumeChanged(i: Int, z: Boolean) {
        Player.Listener.CC.`$default$onDeviceVolumeChanged`(this, i, z)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onEvents(player: Player, events: Player.Events) {
        Player.Listener.CC.`$default$onEvents`(this, player, events)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onIsLoadingChanged(z: Boolean) {
        Player.Listener.CC.`$default$onIsLoadingChanged`(this, z)
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onLoadingChanged(z: Boolean) {
        Player.EventListener.CC.`$default$onLoadingChanged`(this, z)
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onMaxSeekToPreviousPositionChanged(j: Long) {
        Player.EventListener.CC.`$default$onMaxSeekToPreviousPositionChanged`(this, j)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onMediaItemTransition(mediaItem: MediaItem, i: Int) {
        Player.Listener.CC.`$default$onMediaItemTransition`(this, mediaItem, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onMediaMetadataChanged(mediaMetadata: MediaMetadata) {
        Player.Listener.CC.`$default$onMediaMetadataChanged`(this, mediaMetadata)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onMetadata(metadata: com.google.android.exoplayer2.metadata.Metadata) {
        Player.Listener.CC.`$default$onMetadata`(this, metadata)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPlayWhenReadyChanged(z: Boolean, i: Int) {
        Player.Listener.CC.`$default$onPlayWhenReadyChanged`(this, z, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters) {
        Player.Listener.CC.`$default$onPlaybackParametersChanged`(this, playbackParameters)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPlaybackSuppressionReasonChanged(i: Int) {
        Player.Listener.CC.`$default$onPlaybackSuppressionReasonChanged`(this, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPlayerErrorChanged(playbackException: PlaybackException) {
        Player.Listener.CC.`$default$onPlayerErrorChanged`(this, playbackException)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPlaylistMetadataChanged(mediaMetadata: MediaMetadata) {
        Player.Listener.CC.`$default$onPlaylistMetadataChanged`(this, mediaMetadata)
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPositionDiscontinuity(i: Int) {
        Player.EventListener.CC.`$default$onPositionDiscontinuity`(this, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onPositionDiscontinuity(
        positionInfo: PositionInfo,
        positionInfo2: PositionInfo,
        i: Int
    ) {
        Player.Listener.CC.`$default$onPositionDiscontinuity`(this, positionInfo, positionInfo2, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onRepeatModeChanged(i: Int) {
        Player.Listener.CC.`$default$onRepeatModeChanged`(this, i)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onSeekBackIncrementChanged(j: Long) {
        Player.Listener.CC.`$default$onSeekBackIncrementChanged`(this, j)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onSeekForwardIncrementChanged(j: Long) {
        Player.Listener.CC.`$default$onSeekForwardIncrementChanged`(this, j)
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onSeekProcessed() {
        Player.EventListener.CC.`$default$onSeekProcessed`(this)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onShuffleModeEnabledChanged(z: Boolean) {
        Player.Listener.CC.`$default$onShuffleModeEnabledChanged`(this, z)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onSkipSilenceEnabledChanged(z: Boolean) {
        Player.Listener.CC.`$default$onSkipSilenceEnabledChanged`(this, z)
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onSurfaceSizeChanged(i: Int, i2: Int) {
        Player.Listener.CC.`$default$onSurfaceSizeChanged`(this, i, i2)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onTimelineChanged(timeline: Timeline, i: Int) {
        Player.Listener.CC.`$default$onTimelineChanged`(this, timeline, i)
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onTrackSelectionParametersChanged(trackSelectionParameters: TrackSelectionParameters) {
        Player.EventListener.CC.`$default$onTrackSelectionParametersChanged`(
            this,
            trackSelectionParameters
        )
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */  override fun onTracksChanged(
        trackGroupArray: TrackGroupArray,
        trackSelectionArray: TrackSelectionArray
    ) {
        Player.EventListener.CC.`$default$onTracksChanged`(
            this,
            trackGroupArray,
            trackSelectionArray
        )
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */  override fun onVolumeChanged(f: Float) {
        Player.Listener.CC.`$default$onVolumeChanged`(this, f)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public override fun onTracksInfoChanged(tracksInfo: TracksInfo) {
        Intrinsics.checkNotNullParameter(tracksInfo, "tracksInfo")
        ArchComponentExt.normalSafeApiCall<Unit>(
            `CS3IPlayer$loadExo$3$onTracksInfoChanged$1`(
                `this$0`, tracksInfo
            )
        )
        Player.Listener.CC.`$default$onTracksInfoChanged`(this, tracksInfo)
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public override fun onPlayerStateChanged(z: Boolean, i: Int) {
        val exoPlayer: ExoPlayer?
        val functions: Functions<*>?
        val function1: Function1<*, *>?
        val z2: Boolean
        val cSPlayerLoading: CSPlayerLoading
        exoPlayer = `this$0`.exoPlayer
        if (exoPlayer != null) {
            val cS3IPlayer: CS3IPlayer = `this$0`
            function1 = cS3IPlayer.updateIsPlaying
            if (function1 != null) {
                z2 = cS3IPlayer.isPlaying
                val cSPlayerLoading2: CSPlayerLoading =
                    if (z2) CSPlayerLoading.IsPlaying else CSPlayerLoading.IsPaused
                if (i == 2) {
                    cSPlayerLoading = CSPlayerLoading.IsBuffering
                } else {
                    cSPlayerLoading =
                        if (exoPlayer.isPlaying()) CSPlayerLoading.IsPlaying else CSPlayerLoading.IsPaused
                }
                function1.invoke(Tuples<Any?, Any?>(cSPlayerLoading2, cSPlayerLoading))
            }
            cS3IPlayer.isPlaying = exoPlayer.isPlaying()
        }
        if (i == 3) {
            `this$0`.onRenderFirst()
        }
        if (z) {
            if (i == 2) {
                `this$0`.updatedTime()
            } else if (i != 3) {
                if (i != 4) {
                    return
                }
                `this$0`.handleEvent(CSPlayerEvent.NextEpisode)
            } else {
                functions = `this$0`.requestAutoFocus
                if (functions != null) {
                    functions.invoke()
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public override fun onPlayerError(error: PlaybackException) {
        val function1: Function1<*, *>?
        val exoPlayer: ExoPlayer?
        val exoPlayer2: ExoPlayer?
        Intrinsics.checkNotNullParameter(error, "error")
        if (error.errorCode == 1002) {
            exoPlayer = `this$0`.exoPlayer
            if (exoPlayer != null) {
                exoPlayer.seekToDefaultPosition()
            }
            exoPlayer2 = `this$0`.exoPlayer
            if (exoPlayer2 != null) {
                exoPlayer2.prepare()
                return
            }
            return
        }
        function1 = `this$0`.playerError
        if (function1 != null) {
            function1.invoke(error)
        }
        error.printStackTrace()
        Player.Listener.CC.`$default$onPlayerError`(this, error)
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public override fun onIsPlayingChanged(z: Boolean) {
        Player.Listener.CC.`$default$onIsPlayingChanged`(this, z)
        if (z) {
            `this$0`.onRenderFirst()
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public override fun onPlaybackStateChanged(i: Int) {
        val functions: Functions<*>?
        Player.Listener.CC.`$default$onPlaybackStateChanged`(this, i)
        if (i == 2) {
            `this$0`.updatedTime()
        } else if (i != 3) {
            if (i != 4) {
                return
            }
            `this$0`.handleEvent(CSPlayerEvent.NextEpisode)
        } else {
            functions = `this$0`.requestAutoFocus
            if (functions != null) {
                functions.invoke()
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public override fun onVideoSizeChanged(videoSize: VideoSize) {
        val function1: Function1<*, *>?
        Intrinsics.checkNotNullParameter(videoSize, "videoSize")
        Player.Listener.CC.`$default$onVideoSizeChanged`(this, videoSize)
        function1 = `this$0`.playerDimensionsLoaded
        if (function1 != null) {
            function1.invoke(
                Tuples<Any?, Any?>(
                    Integer.valueOf(videoSize.width),
                    Integer.valueOf(videoSize.height)
                )
            )
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public override fun onRenderedFirstFrame() {
        `this$0`.updatedTime()
        Player.Listener.CC.`$default$onRenderedFirstFrame`(this)
        `this$0`.onRenderFirst()
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */
        fun `onTracksInfoChanged$isSubtitle`(format: Format): Boolean {
            val str: String? = format.sampleMimeType
            if (if ((str == null || StringsKt.`contains$default`(
                        str as CharSequence?,
                        "video/" as CharSequence?,
                        false,
                        2,
                        null as Object?
                    ))
                ) false else true
            ) {
                val str2: String? = format.sampleMimeType
                if (if ((str2 == null || StringsKt.`contains$default`(
                            str2 as CharSequence?,
                            "audio/" as CharSequence?,
                            false,
                            2,
                            null as Object?
                        ))
                    ) false else true
                ) {
                    return true
                }
            }
            return false
        }
    }
}