package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import com.bongngotv2.R
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`

/* renamed from: com.lagradost.cloudstream3.R */ /* loaded from: classes3.dex */
class C4761R private constructor() {
    /* renamed from: com.lagradost.cloudstream3.R$anim */ /* loaded from: classes3.dex */
    object anim {
        const val abc_fade_in = 2130771968
        const val abc_fade_out = 2130771969
        const val abc_grow_fade_in_from_bottom = 2130771970
        const val abc_popup_enter = 2130771971
        const val abc_popup_exit = 2130771972
        const val abc_shrink_fade_out_from_bottom = 2130771973
        const val abc_slide_in_bottom = 2130771974
        const val abc_slide_in_top = 2130771975
        const val abc_slide_out_bottom = 2130771976
        const val abc_slide_out_top = 2130771977
        const val abc_tooltip_enter = 2130771978
        const val abc_tooltip_exit = 2130771979
        const val btn_checkbox_to_checked_box_inner_merged_animation = 2130771980
        const val btn_checkbox_to_checked_box_outer_merged_animation = 2130771981
        const val btn_checkbox_to_checked_icon_null_animation = 2130771982
        const val btn_checkbox_to_unchecked_box_inner_merged_animation = 2130771983
        const val btn_checkbox_to_unchecked_check_path_merged_animation = 2130771984
        const val btn_checkbox_to_unchecked_icon_null_animation = 2130771985
        const val btn_radio_to_off_mtrl_dot_group_animation = 2130771986
        const val btn_radio_to_off_mtrl_ring_outer_animation = 2130771987
        const val btn_radio_to_off_mtrl_ring_outer_path_animation = 2130771988
        const val btn_radio_to_on_mtrl_dot_group_animation = 2130771989
        const val btn_radio_to_on_mtrl_ring_outer_animation = 2130771990
        const val btn_radio_to_on_mtrl_ring_outer_path_animation = 2130771991
        const val design_bottom_sheet_slide_in = 2130771992
        const val design_bottom_sheet_slide_out = 2130771993
        const val design_snackbar_in = 2130771994
        const val design_snackbar_out = 2130771995
        const val enter_anim = 2130771996
        const val exit_anim = 2130771997
        const val fragment_fast_out_extra_slow_in = 2130771998
        const val go_left = 2130771999
        const val go_right = 2130772000
        const val mtrl_bottom_sheet_slide_in = 2130772001
        const val mtrl_bottom_sheet_slide_out = 2130772002
        const val mtrl_card_lowers_interpolator = 2130772003
        const val nav_default_enter_anim = 2130772004
        const val nav_default_exit_anim = 2130772005
        const val nav_default_pop_enter_anim = 2130772006
        const val nav_default_pop_exit_anim = 2130772007
        const val nav_enter_anim = 2130772008
        const val nav_exit_anim = 2130772009
        const val nav_pop_enter = 2130772010
        const val nav_pop_exit = 2130772011
        const val pop_enter = 2130772012
        const val pop_exit = 2130772013
        const val rotate_left = 2130772014
        const val rotate_right = 2130772015
    }

    /* renamed from: com.lagradost.cloudstream3.R$animator */ /* loaded from: classes3.dex */
    object animator {
        const val design_appbar_state_list_animator = 2130837504
        const val design_fab_hide_motion_spec = 2130837505
        const val design_fab_show_motion_spec = 2130837506
        const val fragment_close_enter = 2130837507
        const val fragment_close_exit = 2130837508
        const val fragment_fade_enter = 2130837509
        const val fragment_fade_exit = 2130837510
        const val fragment_open_enter = 2130837511
        const val fragment_open_exit = 2130837512
        const val linear_indeterminate_line1_head_interpolator = 2130837513
        const val linear_indeterminate_line1_tail_interpolator = 2130837514
        const val linear_indeterminate_line2_head_interpolator = 2130837515
        const val linear_indeterminate_line2_tail_interpolator = 2130837516
        const val m3_btn_elevated_btn_state_list_anim = 2130837517
        const val m3_btn_state_list_anim = 2130837518
        const val m3_card_elevated_state_list_anim = 2130837519
        const val m3_card_state_list_anim = 2130837520
        const val m3_chip_state_list_anim = 2130837521
        const val m3_elevated_chip_state_list_anim = 2130837522
        const val mtrl_btn_state_list_anim = 2130837523
        const val mtrl_btn_unelevated_state_list_anim = 2130837524
        const val mtrl_card_state_list_anim = 2130837525
        const val mtrl_chip_state_list_anim = 2130837526
        const val mtrl_extended_fab_change_size_collapse_motion_spec = 2130837527
        const val mtrl_extended_fab_change_size_expand_motion_spec = 2130837528
        const val mtrl_extended_fab_hide_motion_spec = 2130837529
        const val mtrl_extended_fab_show_motion_spec = 2130837530
        const val mtrl_extended_fab_state_list_animator = 2130837531
        const val mtrl_fab_hide_motion_spec = 2130837532
        const val mtrl_fab_show_motion_spec = 2130837533
        const val mtrl_fab_transformation_sheet_collapse_spec = 2130837534
        const val mtrl_fab_transformation_sheet_expand_spec = 2130837535
        const val nav_default_enter_anim = 2130837536
        const val nav_default_exit_anim = 2130837537
        const val nav_default_pop_enter_anim = 2130837538
        const val nav_default_pop_exit_anim = 2130837539
    }

    /* renamed from: com.lagradost.cloudstream3.R$array */ /* loaded from: classes3.dex */
    object array {
        const val app_layout = 2130903040
        const val app_layout_values = 2130903041
        const val cast_expanded_controller_control_buttons = 2130903042
        const val cast_expanded_controller_default_control_buttons = 2130903043
        const val cast_mini_controller_control_buttons = 2130903044
        const val cast_mini_controller_default_control_buttons = 2130903045
        const val dns_pref = 2130903046
        const val dns_pref_values = 2130903047
        const val episode_long_click_options = 2130903048
        const val episode_long_click_options_values = 2130903049
        const val exo_playback_speeds = 2130903050
        const val exo_speed_multiplied_by_100 = 2130903051
        const val limit_title_pref_names = 2130903052
        const val limit_title_pref_values = 2130903053
        const val limit_title_rez_pref_names = 2130903054
        const val limit_title_rez_pref_values = 2130903055
        const val media_type_pref = 2130903056
        const val media_type_pref_values = 2130903057
        const val poster_ui_options = 2130903058
        const val poster_ui_options_values = 2130903059
        const val skip_sec_values = 2130903060
        const val subtitles_encoding_list = 2130903061
        const val subtitles_encoding_values = 2130903062
        const val themes_names = 2130903063
        const val themes_names_values = 2130903064
        const val themes_overlay_names = 2130903065
        const val themes_overlay_names_values = 2130903066
        const val video_buffer_length_names = 2130903067
        const val video_buffer_length_values = 2130903068
        const val video_buffer_size_names = 2130903069
        const val video_buffer_size_values = 2130903070
    }

    /* renamed from: com.lagradost.cloudstream3.R$attr */ /* loaded from: classes3.dex */
    object attr {
        const val SharedValue = 2130968576
        const val SharedValueId = 2130968577
        const val action = 2130968578
        const val actionBarDivider = 2130968579
        const val actionBarItemBackground = 2130968580
        const val actionBarPopupTheme = 2130968581
        const val actionBarSize = 2130968582
        const val actionBarSplitStyle = 2130968583
        const val actionBarStyle = 2130968584
        const val actionBarTabBarStyle = 2130968585
        const val actionBarTabStyle = 2130968586
        const val actionBarTabTextStyle = 2130968587
        const val actionBarTheme = 2130968588
        const val actionBarWidgetTheme = 2130968589
        const val actionButtonStyle = 2130968590
        const val actionDropDownStyle = 2130968591
        const val actionLayout = 2130968592
        const val actionMenuTextAppearance = 2130968593
        const val actionMenuTextColor = 2130968594
        const val actionModeBackground = 2130968595
        const val actionModeCloseButtonStyle = 2130968596
        const val actionModeCloseContentDescription = 2130968597
        const val actionModeCloseDrawable = 2130968598
        const val actionModeCopyDrawable = 2130968599
        const val actionModeCutDrawable = 2130968600
        const val actionModeFindDrawable = 2130968601
        const val actionModePasteDrawable = 2130968602
        const val actionModePopupWindowStyle = 2130968603
        const val actionModeSelectAllDrawable = 2130968604
        const val actionModeShareDrawable = 2130968605
        const val actionModeSplitBackground = 2130968606
        const val actionModeStyle = 2130968607
        const val actionModeTheme = 2130968608
        const val actionModeWebSearchDrawable = 2130968609
        const val actionOverflowButtonStyle = 2130968610
        const val actionOverflowMenuStyle = 2130968611
        const val actionProviderClass = 2130968612
        const val actionTextColorAlpha = 2130968613
        const val actionViewClass = 2130968614
        const val activityAction = 2130968615
        const val activityChooserViewStyle = 2130968616
        const val activityName = 2130968617
        const val ad_marker_color = 2130968618
        const val ad_marker_width = 2130968619
        const val adjustable = 2130968620
        const val alertDialogButtonGroupStyle = 2130968621
        const val alertDialogCenterButtons = 2130968622
        const val alertDialogStyle = 2130968623
        const val alertDialogTheme = 2130968624
        const val allowDividerAbove = 2130968625
        const val allowDividerAfterLastItem = 2130968626
        const val allowDividerBelow = 2130968627
        const val allowStacking = 2130968628
        const val alpha = 2130968629
        const val alphabeticModifiers = 2130968630
        const val altSrc = 2130968631
        const val alwaysExpand = 2130968632
        const val animateCircleAngleTo = 2130968633
        const val animateRelativeTo = 2130968634
        const val animationMode = 2130968635
        const val animation_enabled = 2130968636
        const val appBarLayoutStyle = 2130968637
        const val applyMotionScene = 2130968638
        const val arcMode = 2130968639
        const val argType = 2130968640
        const val arrowHeadLength = 2130968641
        const val arrowShaftLength = 2130968642
        const val attributeName = 2130968643
        const val autoCompleteMode = 2130968644
        const val autoCompleteTextViewStyle = 2130968645
        const val autoSizeMaxTextSize = 2130968646
        const val autoSizeMinTextSize = 2130968647
        const val autoSizePresetSizes = 2130968648
        const val autoSizeStepGranularity = 2130968649
        const val autoSizeTextType = 2130968650
        const val autoTransition = 2130968651
        const val auto_show = 2130968652
        const val avvy_badge_color = 2130968653
        const val avvy_badge_position = 2130968654
        const val avvy_badge_radius = 2130968655
        const val avvy_badge_stroke_color = 2130968656
        const val avvy_badge_stroke_width = 2130968657
        const val avvy_border_color = 2130968658
        const val avvy_border_color_end = 2130968659
        const val avvy_border_highlight_color = 2130968660
        const val avvy_border_highlight_color_end = 2130968661
        const val avvy_border_thickness = 2130968662
        const val avvy_border_thickness_highlight = 2130968663
        const val avvy_circle_background_color = 2130968664
        const val avvy_distance_to_border = 2130968665
        const val avvy_highlighted = 2130968666
        const val avvy_loading_arc_degree_length = 2130968667
        const val avvy_loading_arches = 2130968668
        const val avvy_loading_arches_degree_area = 2130968669
        const val avvy_middle_color = 2130968670
        const val avvy_show_badge = 2130968671
        const val avvy_text = 2130968672
        const val avvy_text_color = 2130968673
        const val avvy_text_size = 2130968674
        const val background = 2130968675
        const val backgroundColor = 2130968676
        const val backgroundInsetBottom = 2130968677
        const val backgroundInsetEnd = 2130968678
        const val backgroundInsetStart = 2130968679
        const val backgroundInsetTop = 2130968680
        const val backgroundOverlayColorAlpha = 2130968681
        const val backgroundSplit = 2130968682
        const val backgroundStacked = 2130968683
        const val backgroundTint = 2130968684
        const val backgroundTintMode = 2130968685
        const val badgeGravity = 2130968686
        const val badgeRadius = 2130968687
        const val badgeStyle = 2130968688
        const val badgeTextColor = 2130968689
        const val badgeWidePadding = 2130968690
        const val badgeWithTextRadius = 2130968691
        const val barLength = 2130968692
        const val bar_gravity = 2130968693
        const val bar_height = 2130968694
        const val barrierAllowsGoneWidgets = 2130968695
        const val barrierDirection = 2130968696
        const val barrierMargin = 2130968697
        const val behavior_autoHide = 2130968698
        const val behavior_autoShrink = 2130968699
        const val behavior_draggable = 2130968700
        const val behavior_expandedOffset = 2130968701
        const val behavior_fitToContents = 2130968702
        const val behavior_halfExpandedRatio = 2130968703
        const val behavior_hideable = 2130968704
        const val behavior_overlapTop = 2130968705
        const val behavior_peekHeight = 2130968706
        const val behavior_saveFlags = 2130968707
        const val behavior_skipCollapsed = 2130968708
        const val blendSrc = 2130968709
        const val blurOverlayColor = 2130968710
        const val borderRound = 2130968711
        const val borderRoundPercent = 2130968712
        const val borderWidth = 2130968713
        const val borderlessButtonStyle = 2130968714
        const val bottomAppBarStyle = 2130968715
        const val bottomInsetScrimEnabled = 2130968716
        const val bottomNavigationStyle = 2130968717
        const val bottomSheetDialogTheme = 2130968718
        const val bottomSheetStyle = 2130968719
        const val boxBackgroundColor = 2130968720
        const val boxBackgroundMode = 2130968721
        const val boxCollapsedPaddingTop = 2130968722
        const val boxCornerRadiusBottomEnd = 2130968723
        const val boxCornerRadiusBottomStart = 2130968724
        const val boxCornerRadiusTopEnd = 2130968725
        const val boxCornerRadiusTopStart = 2130968726
        const val boxItemBackground = 2130968727
        const val boxStrokeColor = 2130968728
        const val boxStrokeErrorColor = 2130968729
        const val boxStrokeWidth = 2130968730
        const val boxStrokeWidthFocused = 2130968731
        const val brightness = 2130968732
        const val buffered_color = 2130968733
        const val buttonBarButtonStyle = 2130968734
        const val buttonBarNegativeButtonStyle = 2130968735
        const val buttonBarNeutralButtonStyle = 2130968736
        const val buttonBarPositiveButtonStyle = 2130968737
        const val buttonBarStyle = 2130968738
        const val buttonCompat = 2130968739
        const val buttonGravity = 2130968740
        const val buttonIconDimen = 2130968741
        const val buttonPanelSideLayout = 2130968742
        const val buttonSize = 2130968743
        const val buttonStyle = 2130968744
        const val buttonStyleSmall = 2130968745
        const val buttonTint = 2130968746
        const val buttonTintMode = 2130968747
        const val cardBackgroundColor = 2130968748
        const val cardCornerRadius = 2130968749
        const val cardElevation = 2130968750
        const val cardForegroundColor = 2130968751
        const val cardMaxElevation = 2130968752
        const val cardPreventCornerOverlap = 2130968753
        const val cardUseCompatPadding = 2130968754
        const val cardViewStyle = 2130968755
        const val carousel_backwardTransition = 2130968756
        const val carousel_emptyViewsBehavior = 2130968757
        const val carousel_firstView = 2130968758
        const val carousel_forwardTransition = 2130968759
        const val carousel_infinite = 2130968760
        const val carousel_nextState = 2130968761
        const val carousel_previousState = 2130968762
        const val carousel_touchUpMode = 2130968763
        const val carousel_touchUp_dampeningFactor = 2130968764
        const val carousel_touchUp_velocityThreshold = 2130968765
        const val castAdBreakMarkerColor = 2130968766
        const val castAdInProgressLabelTextAppearance = 2130968767
        const val castAdInProgressText = 2130968768
        const val castAdInProgressTextColor = 2130968769
        const val castAdLabelColor = 2130968770
        const val castAdLabelTextAppearance = 2130968771
        const val castAdLabelTextColor = 2130968772
        const val castBackground = 2130968773
        const val castBackgroundColor = 2130968774
        const val castButtonBackgroundColor = 2130968775
        const val castButtonColor = 2130968776
        const val castButtonText = 2130968777
        const val castButtonTextAppearance = 2130968778
        const val castClosedCaptionsButtonDrawable = 2130968779
        const val castControlButtons = 2130968780
        const val castDefaultAdPosterUrl = 2130968781
        const val castExpandedControllerLoadingIndicatorColor = 2130968782
        const val castExpandedControllerStyle = 2130968783
        const val castExpandedControllerToolbarStyle = 2130968784
        const val castFocusRadius = 2130968785
        const val castForward30ButtonDrawable = 2130968786
        const val castIntroOverlayStyle = 2130968787
        const val castLargePauseButtonDrawable = 2130968788
        const val castLargePlayButtonDrawable = 2130968789
        const val castLargeStopButtonDrawable = 2130968790
        const val castLiveIndicatorColor = 2130968791
        const val castMiniControllerLoadingIndicatorColor = 2130968792
        const val castMiniControllerStyle = 2130968793
        const val castMuteToggleButtonDrawable = 2130968794
        const val castPauseButtonDrawable = 2130968795
        const val castPlayButtonDrawable = 2130968796
        const val castProgressBarColor = 2130968797
        const val castRewind30ButtonDrawable = 2130968798
        const val castSeekBarProgressAndThumbColor = 2130968799
        const val castSeekBarProgressDrawable = 2130968800
        const val castSeekBarSecondaryProgressColor = 2130968801
        const val castSeekBarThumbDrawable = 2130968802
        const val castSeekBarTooltipBackgroundColor = 2130968803
        const val castSeekBarUnseekableProgressColor = 2130968804
        const val castShowImageThumbnail = 2130968805
        const val castSkipNextButtonDrawable = 2130968806
        const val castSkipPreviousButtonDrawable = 2130968807
        const val castStopButtonDrawable = 2130968808
        const val castSubtitleTextAppearance = 2130968809
        const val castTitleTextAppearance = 2130968810
        const val chainUseRtl = 2130968811
        const val checkBoxPreferenceStyle = 2130968812
        const val checkMarkCompat = 2130968813
        const val checkMarkTint = 2130968814
        const val checkMarkTintMode = 2130968815
        const val checkboxStyle = 2130968816
        const val checkedButton = 2130968817
        const val checkedChip = 2130968818
        const val checkedIcon = 2130968819
        const val checkedIconEnabled = 2130968820
        const val checkedIconMargin = 2130968821
        const val checkedIconSize = 2130968822
        const val checkedIconTint = 2130968823
        const val checkedIconVisible = 2130968824
        const val checkedTextViewStyle = 2130968825
        const val chipBackgroundColor = 2130968826
        const val chipCornerRadius = 2130968827
        const val chipEndPadding = 2130968828
        const val chipGroupStyle = 2130968829
        const val chipIcon = 2130968830
        const val chipIconEnabled = 2130968831
        const val chipIconSize = 2130968832
        const val chipIconTint = 2130968833
        const val chipIconVisible = 2130968834
        const val chipMinHeight = 2130968835
        const val chipMinTouchTargetSize = 2130968836
        const val chipSpacing = 2130968837
        const val chipSpacingHorizontal = 2130968838
        const val chipSpacingVertical = 2130968839
        const val chipStandaloneStyle = 2130968840
        const val chipStartPadding = 2130968841
        const val chipStrokeColor = 2130968842
        const val chipStrokeWidth = 2130968843
        const val chipStyle = 2130968844
        const val chipSurfaceColor = 2130968845
        const val circleCrop = 2130968846
        const val circleRadius = 2130968847
        const val circularProgressIndicatorStyle = 2130968848
        const val circularflow_angles = 2130968849
        const val circularflow_defaultAngle = 2130968850
        const val circularflow_defaultRadius = 2130968851
        const val circularflow_radiusInDP = 2130968852
        const val circularflow_viewCenter = 2130968853
        const val clearTop = 2130968854
        const val clearsTag = 2130968855
        const val clickAction = 2130968856
        const val clockFaceBackgroundColor = 2130968857
        const val clockHandColor = 2130968858
        const val clockIcon = 2130968859
        const val clockNumberTextColor = 2130968860
        const val closeIcon = 2130968861
        const val closeIconEnabled = 2130968862
        const val closeIconEndPadding = 2130968863
        const val closeIconSize = 2130968864
        const val closeIconStartPadding = 2130968865
        const val closeIconTint = 2130968866
        const val closeIconVisible = 2130968867
        const val closeItemLayout = 2130968868
        const val collapseContentDescription = 2130968869
        const val collapseIcon = 2130968870
        const val collapsedSize = 2130968871
        const val collapsedTitleGravity = 2130968872
        const val collapsedTitleTextAppearance = 2130968873
        const val collapsedTitleTextColor = 2130968874
        const val collapsingToolbarLayoutLargeSize = 2130968875
        const val collapsingToolbarLayoutLargeStyle = 2130968876
        const val collapsingToolbarLayoutMediumSize = 2130968877
        const val collapsingToolbarLayoutMediumStyle = 2130968878
        const val collapsingToolbarLayoutStyle = 2130968879
        const val color = 2130968880
        const val colorAccent = 2130968881
        const val colorBackgroundFloating = 2130968882
        const val colorButtonNormal = 2130968883
        const val colorContainer = 2130968884
        const val colorControlActivated = 2130968885
        const val colorControlHighlight = 2130968886
        const val colorControlNormal = 2130968887
        const val colorError = 2130968888
        const val colorErrorContainer = 2130968889
        const val colorOnBackground = 2130968890
        const val colorOnContainer = 2130968891
        const val colorOnError = 2130968892
        const val colorOnErrorContainer = 2130968893
        const val colorOnPrimary = 2130968894
        const val colorOnPrimaryContainer = 2130968895
        const val colorOnPrimarySurface = 2130968896
        const val colorOnSecondary = 2130968897
        const val colorOnSecondaryContainer = 2130968898
        const val colorOnSurface = 2130968899
        const val colorOnSurfaceInverse = 2130968900
        const val colorOnSurfaceVariant = 2130968901
        const val colorOnTertiary = 2130968902
        const val colorOnTertiaryContainer = 2130968903
        const val colorOngoing = 2130968904
        const val colorOutline = 2130968905
        const val colorPrimary = 2130968906
        const val colorPrimaryContainer = 2130968907
        const val colorPrimaryDark = 2130968908
        const val colorPrimaryInverse = 2130968909
        const val colorPrimarySurface = 2130968910
        const val colorPrimaryVariant = 2130968911
        const val colorScheme = 2130968912
        const val colorSearch = 2130968913
        const val colorSecondary = 2130968914
        const val colorSecondaryContainer = 2130968915
        const val colorSecondaryVariant = 2130968916
        const val colorSurface = 2130968917
        const val colorSurfaceInverse = 2130968918
        const val colorSurfaceVariant = 2130968919
        const val colorSwitchThumbNormal = 2130968920
        const val colorTertiary = 2130968921
        const val colorTertiaryContainer = 2130968922
        const val com_facebook_auxiliary_view_position = 2130968923
        const val com_facebook_confirm_logout = 2130968924
        const val com_facebook_foreground_color = 2130968925
        const val com_facebook_horizontal_alignment = 2130968926
        const val com_facebook_is_cropped = 2130968927
        const val com_facebook_login_text = 2130968928
        const val com_facebook_logout_text = 2130968929
        const val com_facebook_object_id = 2130968930
        const val com_facebook_object_type = 2130968931
        const val com_facebook_preset_size = 2130968932
        const val com_facebook_style = 2130968933
        const val com_facebook_tooltip_mode = 2130968934
        const val commitIcon = 2130968935
        const val constraintRotate = 2130968936
        const val constraintSet = 2130968937
        const val constraintSetEnd = 2130968938
        const val constraintSetStart = 2130968939
        const val constraint_referenced_ids = 2130968940
        const val constraint_referenced_tags = 2130968941
        const val constraints = 2130968942
        const val content = 2130968943
        const val contentDescription = 2130968944
        const val contentInsetEnd = 2130968945
        const val contentInsetEndWithActions = 2130968946
        const val contentInsetLeft = 2130968947
        const val contentInsetRight = 2130968948
        const val contentInsetStart = 2130968949
        const val contentInsetStartWithNavigation = 2130968950
        const val contentPadding = 2130968951
        const val contentPaddingBottom = 2130968952
        const val contentPaddingEnd = 2130968953
        const val contentPaddingLeft = 2130968954
        const val contentPaddingRight = 2130968955
        const val contentPaddingStart = 2130968956
        const val contentPaddingTop = 2130968957
        const val contentScrim = 2130968958
        const val contrast = 2130968959
        const val controlBackground = 2130968960
        const val controller_layout_id = 2130968961
        const val coordinatorLayoutStyle = 2130968962
        const val cornerFamily = 2130968963
        const val cornerFamilyBottomLeft = 2130968964
        const val cornerFamilyBottomRight = 2130968965
        const val cornerFamilyTopLeft = 2130968966
        const val cornerFamilyTopRight = 2130968967
        const val cornerRadius = 2130968968
        const val cornerSize = 2130968969
        const val cornerSizeBottomLeft = 2130968970
        const val cornerSizeBottomRight = 2130968971
        const val cornerSizeTopLeft = 2130968972
        const val cornerSizeTopRight = 2130968973
        const val counterEnabled = 2130968974
        const val counterMaxLength = 2130968975
        const val counterOverflowTextAppearance = 2130968976
        const val counterOverflowTextColor = 2130968977
        const val counterTextAppearance = 2130968978
        const val counterTextColor = 2130968979
        const val cpv_allowCustom = 2130968980
        const val cpv_allowPresets = 2130968981
        const val cpv_alphaChannelText = 2130968982
        const val cpv_alphaChannelVisible = 2130968983
        const val cpv_borderColor = 2130968984
        const val cpv_colorPresets = 2130968985
        const val cpv_colorShape = 2130968986
        const val cpv_dialogTitle = 2130968987
        const val cpv_dialogType = 2130968988
        const val cpv_previewSize = 2130968989
        const val cpv_showAlphaSlider = 2130968990
        const val cpv_showColorShades = 2130968991
        const val cpv_showDialog = 2130968992
        const val cpv_showOldColor = 2130968993
        const val cpv_sliderColor = 2130968994
        const val crossfade = 2130968995
        const val currentState = 2130968996
        const val curveFit = 2130968997
        const val customBoolean = 2130968998
        const val customCastBackgroundColor = 2130968999
        const val customColorDrawableValue = 2130969000
        const val customColorValue = 2130969001
        const val customDimension = 2130969002
        const val customFloatValue = 2130969003
        const val customIntegerValue = 2130969004
        const val customNavigationLayout = 2130969005
        const val customPixelDimension = 2130969006
        const val customReference = 2130969007
        const val customStringValue = 2130969008
        const val data = 2130969009
        const val dataPattern = 2130969010
        const val dayInvalidStyle = 2130969011
        const val daySelectedStyle = 2130969012
        const val dayStyle = 2130969013
        const val dayTodayStyle = 2130969014
        const val defaultDuration = 2130969015
        const val defaultNavHost = 2130969016
        const val defaultQueryHint = 2130969017
        const val defaultState = 2130969018
        const val defaultValue = 2130969019
        const val default_artwork = 2130969020
        const val deltaPolarAngle = 2130969021
        const val deltaPolarRadius = 2130969022
        const val dependency = 2130969023
        const val deriveConstraintsFrom = 2130969024
        const val destination = 2130969025
        const val dialogCornerRadius = 2130969026
        const val dialogIcon = 2130969027
        const val dialogLayout = 2130969028
        const val dialogMessage = 2130969029
        const val dialogPreferenceStyle = 2130969030
        const val dialogPreferredPadding = 2130969031
        const val dialogTheme = 2130969032
        const val dialogTitle = 2130969033
        const val disableDependentsState = 2130969034
        const val displayOptions = 2130969035
        const val divider = 2130969036
        const val dividerColor = 2130969037
        const val dividerHorizontal = 2130969038
        const val dividerInsetEnd = 2130969039
        const val dividerInsetStart = 2130969040
        const val dividerPadding = 2130969041
        const val dividerThickness = 2130969042
        const val dividerVertical = 2130969043
        const val dragDirection = 2130969044
        const val dragScale = 2130969045
        const val dragThreshold = 2130969046
        const val drawPath = 2130969047
        const val drawableBottomCompat = 2130969048
        const val drawableEndCompat = 2130969049
        const val drawableLeftCompat = 2130969050
        const val drawableRightCompat = 2130969051
        const val drawableSize = 2130969052
        const val drawableStartCompat = 2130969053
        const val drawableTint = 2130969054
        const val drawableTintMode = 2130969055
        const val drawableTopCompat = 2130969056
        const val drawerArrowStyle = 2130969057
        const val drawerLayoutCornerSize = 2130969058
        const val drawerLayoutStyle = 2130969059
        const val dropDownListViewStyle = 2130969060
        const val dropdownListPreferredItemHeight = 2130969061
        const val dropdownPreferenceStyle = 2130969062
        const val duration = 2130969063
        const val dynamicColorThemeOverlay = 2130969064
        const val editTextBackground = 2130969065
        const val editTextColor = 2130969066
        const val editTextPreferenceStyle = 2130969067
        const val editTextStyle = 2130969068
        const val elevation = 2130969069
        const val elevationOverlayAccentColor = 2130969070
        const val elevationOverlayColor = 2130969071
        const val elevationOverlayEnabled = 2130969072
        const val emojiCompatEnabled = 2130969073
        const val enableCopying = 2130969074
        const val enableEdgeToEdge = 2130969075
        const val enabled = 2130969076
        const val endIconCheckable = 2130969077
        const val endIconContentDescription = 2130969078
        const val endIconDrawable = 2130969079
        const val endIconMode = 2130969080
        const val endIconTint = 2130969081
        const val endIconTintMode = 2130969082
        const val enforceMaterialTheme = 2130969083
        const val enforceTextAppearance = 2130969084
        const val ensureMinTouchTargetSize = 2130969085
        const val enterAnim = 2130969086
        const val entries = 2130969087
        const val entryValues = 2130969088
        const val errorContentDescription = 2130969089
        const val errorEnabled = 2130969090
        const val errorIconDrawable = 2130969091
        const val errorIconTint = 2130969092
        const val errorIconTintMode = 2130969093
        const val errorTextAppearance = 2130969094
        const val errorTextColor = 2130969095
        const val exitAnim = 2130969096
        const val expandActivityOverflowButtonDrawable = 2130969097
        const val expanded = 2130969098
        const val expandedHintEnabled = 2130969099
        const val expandedTitleGravity = 2130969100
        const val expandedTitleMargin = 2130969101
        const val expandedTitleMarginBottom = 2130969102
        const val expandedTitleMarginEnd = 2130969103
        const val expandedTitleMarginStart = 2130969104
        const val expandedTitleMarginTop = 2130969105
        const val expandedTitleTextAppearance = 2130969106
        const val expandedTitleTextColor = 2130969107
        const val extendMotionSpec = 2130969108
        const val extendedFloatingActionButtonPrimaryStyle = 2130969109
        const val extendedFloatingActionButtonSecondaryStyle = 2130969110
        const val extendedFloatingActionButtonStyle = 2130969111
        const val extendedFloatingActionButtonSurfaceStyle = 2130969112
        const val extendedFloatingActionButtonTertiaryStyle = 2130969113
        const val externalRouteEnabledDrawable = 2130969114
        const val externalRouteEnabledDrawableStatic = 2130969115
        const val extraMultilineHeightEnabled = 2130969116
        const val fabAlignmentMode = 2130969117
        const val fabAnimationMode = 2130969118
        const val fabCradleMargin = 2130969119
        const val fabCradleRoundedCornerRadius = 2130969120
        const val fabCradleVerticalOffset = 2130969121
        const val fabCustomSize = 2130969122
        const val fabSize = 2130969123
        const val fastScrollEnabled = 2130969124
        const val fastScrollHorizontalThumbDrawable = 2130969125
        const val fastScrollHorizontalTrackDrawable = 2130969126
        const val fastScrollVerticalThumbDrawable = 2130969127
        const val fastScrollVerticalTrackDrawable = 2130969128
        const val finishPrimaryWithSecondary = 2130969129
        const val finishSecondaryWithPrimary = 2130969130
        const val firstBaselineToTopHeight = 2130969131
        const val floatingActionButtonLargePrimaryStyle = 2130969132
        const val floatingActionButtonLargeSecondaryStyle = 2130969133
        const val floatingActionButtonLargeStyle = 2130969134
        const val floatingActionButtonLargeSurfaceStyle = 2130969135
        const val floatingActionButtonLargeTertiaryStyle = 2130969136
        const val floatingActionButtonPrimaryStyle = 2130969137
        const val floatingActionButtonSecondaryStyle = 2130969138
        const val floatingActionButtonStyle = 2130969139
        const val floatingActionButtonSurfaceStyle = 2130969140
        const val floatingActionButtonTertiaryStyle = 2130969141
        const val flow_firstHorizontalBias = 2130969142
        const val flow_firstHorizontalStyle = 2130969143
        const val flow_firstVerticalBias = 2130969144
        const val flow_firstVerticalStyle = 2130969145
        const val flow_horizontalAlign = 2130969146
        const val flow_horizontalBias = 2130969147
        const val flow_horizontalGap = 2130969148
        const val flow_horizontalStyle = 2130969149
        const val flow_lastHorizontalBias = 2130969150
        const val flow_lastHorizontalStyle = 2130969151
        const val flow_lastVerticalBias = 2130969152
        const val flow_lastVerticalStyle = 2130969153
        const val flow_maxElementsWrap = 2130969154
        const val flow_padding = 2130969155
        const val flow_verticalAlign = 2130969156
        const val flow_verticalBias = 2130969157
        const val flow_verticalGap = 2130969158
        const val flow_verticalStyle = 2130969159
        const val flow_wrapMode = 2130969160
        const val font = 2130969161
        const val fontFamily = 2130969162
        const val fontProviderAuthority = 2130969163
        const val fontProviderCerts = 2130969164
        const val fontProviderFetchStrategy = 2130969165
        const val fontProviderFetchTimeout = 2130969166
        const val fontProviderPackage = 2130969167
        const val fontProviderQuery = 2130969168
        const val fontProviderSystemFontFamily = 2130969169
        const val fontStyle = 2130969170
        const val fontVariationSettings = 2130969171
        const val fontWeight = 2130969172
        const val forceApplySystemWindowInsetTop = 2130969173
        const val foregroundInsidePadding = 2130969174
        const val fragment = 2130969175
        const val framePosition = 2130969176
        const val gapBetweenBars = 2130969177
        const val gestureInsetBottomIgnored = 2130969178
        const val goIcon = 2130969179
        const val graph = 2130969180
        const val grayTextColor = 2130969181
        const val guidelineUseRtl = 2130969182
        const val haloColor = 2130969183
        const val haloRadius = 2130969184
        const val headerLayout = 2130969185
        const val height = 2130969186
        const val helperText = 2130969187
        const val helperTextEnabled = 2130969188
        const val helperTextTextAppearance = 2130969189
        const val helperTextTextColor = 2130969190
        const val hideAnimationBehavior = 2130969191
        const val hideMotionSpec = 2130969192
        const val hideOnContentScroll = 2130969193
        const val hideOnScroll = 2130969194
        const val hide_during_ads = 2130969195
        const val hide_on_touch = 2130969196
        const val hintAnimationEnabled = 2130969197
        const val hintEnabled = 2130969198
        const val hintTextAppearance = 2130969199
        const val hintTextColor = 2130969200
        const val homeAsUpIndicator = 2130969201
        const val homeLayout = 2130969202
        const val horizontalOffset = 2130969203
        const val horizontalOffsetWithText = 2130969204
        const val hoveredFocusedTranslationZ = 2130969205
        const val icon = 2130969206
        const val iconColor = 2130969207
        const val iconEndPadding = 2130969208
        const val iconGravity = 2130969209
        const val iconGrayBackground = 2130969210
        const val iconPadding = 2130969211
        const val iconSize = 2130969212
        const val iconSpaceReserved = 2130969213
        const val iconStartPadding = 2130969214
        const val iconTint = 2130969215
        const val iconTintMode = 2130969216
        const val iconifiedByDefault = 2130969217
        const val ifTagNotSet = 2130969218
        const val ifTagSet = 2130969219
        const val imageAspectRatio = 2130969220
        const val imageAspectRatioAdjust = 2130969221
        const val imageButtonStyle = 2130969222
        const val imagePanX = 2130969223
        const val imagePanY = 2130969224
        const val imageRotate = 2130969225
        const val imageZoom = 2130969226
        const val indeterminateAnimationType = 2130969227
        const val indeterminateProgressStyle = 2130969228
        const val indicator = 2130969229
        const val indicatorColor = 2130969230
        const val indicatorDirectionCircular = 2130969231
        const val indicatorDirectionLinear = 2130969232
        const val indicatorInset = 2130969233
        const val indicatorSize = 2130969234
        const val indicator_color = 2130969235
        const val initialActivityCount = 2130969236
        const val initialExpandedChildrenCount = 2130969237
        const val insetForeground = 2130969238
        const val isLightTheme = 2130969239
        const val isMaterial3Theme = 2130969240
        const val isMaterialTheme = 2130969241
        const val isPreferenceVisible = 2130969242
        const val itemActiveIndicatorStyle = 2130969243
        const val itemBackground = 2130969244
        const val itemFillColor = 2130969245
        const val itemHorizontalPadding = 2130969246
        const val itemHorizontalTranslationEnabled = 2130969247
        const val itemIconPadding = 2130969248
        const val itemIconSize = 2130969249
        const val itemIconTint = 2130969250
        const val itemMaxLines = 2130969251
        const val itemMinHeight = 2130969252
        const val itemPadding = 2130969253
        const val itemPaddingBottom = 2130969254
        const val itemPaddingTop = 2130969255
        const val itemRippleColor = 2130969256
        const val itemShapeAppearance = 2130969257
        const val itemShapeAppearanceOverlay = 2130969258
        const val itemShapeFillColor = 2130969259
        const val itemShapeInsetBottom = 2130969260
        const val itemShapeInsetEnd = 2130969261
        const val itemShapeInsetStart = 2130969262
        const val itemShapeInsetTop = 2130969263
        const val itemSpacing = 2130969264
        const val itemStrokeColor = 2130969265
        const val itemStrokeWidth = 2130969266
        const val itemTextAppearance = 2130969267
        const val itemTextAppearanceActive = 2130969268
        const val itemTextAppearanceInactive = 2130969269
        const val itemTextColor = 2130969270
        const val itemVerticalPadding = 2130969271
        const val keep_content_on_player_reset = 2130969272
        const val key = 2130969273
        const val keyPositionType = 2130969274
        const val keyboardIcon = 2130969275
        const val keylines = 2130969276
        const val lStar = 2130969277
        const val labelBehavior = 2130969278
        const val labelStyle = 2130969279
        const val labelVisibilityMode = 2130969280
        const val lastBaselineToBottomHeight = 2130969281
        const val launchSingleTop = 2130969282
        const val layout = 2130969283
        const val layoutDescription = 2130969284
        const val layoutDuringTransition = 2130969285
        const val layoutManager = 2130969286
        const val layout_anchor = 2130969287
        const val layout_anchorGravity = 2130969288
        const val layout_behavior = 2130969289
        const val layout_collapseMode = 2130969290
        const val layout_collapseParallaxMultiplier = 2130969291
        const val layout_constrainedHeight = 2130969292
        const val layout_constrainedWidth = 2130969293
        const val layout_constraintBaseline_creator = 2130969294
        const val layout_constraintBaseline_toBaselineOf = 2130969295
        const val layout_constraintBaseline_toBottomOf = 2130969296
        const val layout_constraintBaseline_toTopOf = 2130969297
        const val layout_constraintBottom_creator = 2130969298
        const val layout_constraintBottom_toBottomOf = 2130969299
        const val layout_constraintBottom_toTopOf = 2130969300
        const val layout_constraintCircle = 2130969301
        const val layout_constraintCircleAngle = 2130969302
        const val layout_constraintCircleRadius = 2130969303
        const val layout_constraintDimensionRatio = 2130969304
        const val layout_constraintEnd_toEndOf = 2130969305
        const val layout_constraintEnd_toStartOf = 2130969306
        const val layout_constraintGuide_begin = 2130969307
        const val layout_constraintGuide_end = 2130969308
        const val layout_constraintGuide_percent = 2130969309
        const val layout_constraintHeight = 2130969310
        const val layout_constraintHeight_default = 2130969311
        const val layout_constraintHeight_max = 2130969312
        const val layout_constraintHeight_min = 2130969313
        const val layout_constraintHeight_percent = 2130969314
        const val layout_constraintHorizontal_bias = 2130969315
        const val layout_constraintHorizontal_chainStyle = 2130969316
        const val layout_constraintHorizontal_weight = 2130969317
        const val layout_constraintLeft_creator = 2130969318
        const val layout_constraintLeft_toLeftOf = 2130969319
        const val layout_constraintLeft_toRightOf = 2130969320
        const val layout_constraintRight_creator = 2130969321
        const val layout_constraintRight_toLeftOf = 2130969322
        const val layout_constraintRight_toRightOf = 2130969323
        const val layout_constraintStart_toEndOf = 2130969324
        const val layout_constraintStart_toStartOf = 2130969325
        const val layout_constraintTag = 2130969326
        const val layout_constraintTop_creator = 2130969327
        const val layout_constraintTop_toBottomOf = 2130969328
        const val layout_constraintTop_toTopOf = 2130969329
        const val layout_constraintVertical_bias = 2130969330
        const val layout_constraintVertical_chainStyle = 2130969331
        const val layout_constraintVertical_weight = 2130969332
        const val layout_constraintWidth = 2130969333
        const val layout_constraintWidth_default = 2130969334
        const val layout_constraintWidth_max = 2130969335
        const val layout_constraintWidth_min = 2130969336
        const val layout_constraintWidth_percent = 2130969337
        const val layout_dodgeInsetEdges = 2130969338
        const val layout_editor_absoluteX = 2130969339
        const val layout_editor_absoluteY = 2130969340
        const val layout_goneMarginBaseline = 2130969341
        const val layout_goneMarginBottom = 2130969342
        const val layout_goneMarginEnd = 2130969343
        const val layout_goneMarginLeft = 2130969344
        const val layout_goneMarginRight = 2130969345
        const val layout_goneMarginStart = 2130969346
        const val layout_goneMarginTop = 2130969347
        const val layout_insetEdge = 2130969348
        const val layout_keyline = 2130969349
        const val layout_marginBaseline = 2130969350
        const val layout_optimizationLevel = 2130969351
        const val layout_scrollEffect = 2130969352
        const val layout_scrollFlags = 2130969353
        const val layout_scrollInterpolator = 2130969354
        const val layout_wrapBehaviorInParent = 2130969355
        const val liftOnScroll = 2130969356
        const val liftOnScrollTargetViewId = 2130969357
        const val limitBoundsTo = 2130969358
        const val lineHeight = 2130969359
        const val lineSpacing = 2130969360
        const val linearProgressIndicatorStyle = 2130969361
        const val listChoiceBackgroundIndicator = 2130969362
        const val listChoiceIndicatorMultipleAnimated = 2130969363
        const val listChoiceIndicatorSingleAnimated = 2130969364
        const val listDividerAlertDialog = 2130969365
        const val listItemLayout = 2130969366
        const val listLayout = 2130969367
        const val listMenuViewStyle = 2130969368
        const val listPopupWindowStyle = 2130969369
        const val listPreferredItemHeight = 2130969370
        const val listPreferredItemHeightLarge = 2130969371
        const val listPreferredItemHeightSmall = 2130969372
        const val listPreferredItemPaddingEnd = 2130969373
        const val listPreferredItemPaddingLeft = 2130969374
        const val listPreferredItemPaddingRight = 2130969375
        const val listPreferredItemPaddingStart = 2130969376
        const val logo = 2130969377
        const val logoDescription = 2130969378
        const val lottie_autoPlay = 2130969379
        const val lottie_cacheComposition = 2130969380
        const val lottie_colorFilter = 2130969381
        const val lottie_enableMergePathsForKitKatAndAbove = 2130969382
        const val lottie_fallbackRes = 2130969383
        const val lottie_fileName = 2130969384
        const val lottie_imageAssetsFolder = 2130969385
        const val lottie_loop = 2130969386
        const val lottie_progress = 2130969387
        const val lottie_rawRes = 2130969388
        const val lottie_renderMode = 2130969389
        const val lottie_repeatCount = 2130969390
        const val lottie_repeatMode = 2130969391
        const val lottie_scale = 2130969392
        const val lottie_speed = 2130969393
        const val lottie_url = 2130969394
        const val marginHorizontal = 2130969395
        const val materialAlertDialogBodyTextStyle = 2130969396
        const val materialAlertDialogButtonSpacerVisibility = 2130969397
        const val materialAlertDialogTheme = 2130969398
        const val materialAlertDialogTitleIconStyle = 2130969399
        const val materialAlertDialogTitlePanelStyle = 2130969400
        const val materialAlertDialogTitleTextStyle = 2130969401
        const val materialButtonOutlinedStyle = 2130969402
        const val materialButtonStyle = 2130969403
        const val materialButtonToggleGroupStyle = 2130969404
        const val materialCalendarDay = 2130969405
        const val materialCalendarDayOfWeekLabel = 2130969406
        const val materialCalendarFullscreenTheme = 2130969407
        const val materialCalendarHeaderCancelButton = 2130969408
        const val materialCalendarHeaderConfirmButton = 2130969409
        const val materialCalendarHeaderDivider = 2130969410
        const val materialCalendarHeaderLayout = 2130969411
        const val materialCalendarHeaderSelection = 2130969412
        const val materialCalendarHeaderTitle = 2130969413
        const val materialCalendarHeaderToggleButton = 2130969414
        const val materialCalendarMonth = 2130969415
        const val materialCalendarMonthNavigationButton = 2130969416
        const val materialCalendarStyle = 2130969417
        const val materialCalendarTheme = 2130969418
        const val materialCalendarYearNavigationButton = 2130969419
        const val materialCardViewElevatedStyle = 2130969420
        const val materialCardViewFilledStyle = 2130969421
        const val materialCardViewOutlinedStyle = 2130969422
        const val materialCardViewStyle = 2130969423
        const val materialCircleRadius = 2130969424
        const val materialClockStyle = 2130969425
        const val materialDisplayDividerStyle = 2130969426
        const val materialDividerHeavyStyle = 2130969427
        const val materialDividerStyle = 2130969428
        const val materialThemeOverlay = 2130969429
        const val materialTimePickerStyle = 2130969430
        const val materialTimePickerTheme = 2130969431
        const val materialTimePickerTitleStyle = 2130969432
        const val maxAcceleration = 2130969433
        const val maxActionInlineWidth = 2130969434
        const val maxButtonHeight = 2130969435
        const val maxCharacterCount = 2130969436
        const val maxHeight = 2130969437
        const val maxImageSize = 2130969438
        const val maxLines = 2130969439
        const val maxSidePanelNonFullScreenWidth = 2130969440
        const val maxVelocity = 2130969441
        const val maxWidth = 2130969442
        const val measureWithLargestChild = 2130969443
        const val mediaRouteAudioTrackDrawable = 2130969444
        const val mediaRouteBodyTextAppearance = 2130969445
        const val mediaRouteButtonStyle = 2130969446
        const val mediaRouteButtonTint = 2130969447
        const val mediaRouteCloseDrawable = 2130969448
        const val mediaRouteControlPanelThemeOverlay = 2130969449
        const val mediaRouteDefaultIconDrawable = 2130969450
        const val mediaRouteDividerColor = 2130969451
        const val mediaRouteHeaderTextAppearance = 2130969452
        const val mediaRoutePauseDrawable = 2130969453
        const val mediaRoutePlayDrawable = 2130969454
        const val mediaRouteSpeakerGroupIconDrawable = 2130969455
        const val mediaRouteSpeakerIconDrawable = 2130969456
        const val mediaRouteStopDrawable = 2130969457
        const val mediaRouteTheme = 2130969458
        const val mediaRouteTvIconDrawable = 2130969459
        const val menu = 2130969460
        const val menuGravity = 2130969461
        const val methodName = 2130969462
        const val mimeType = 2130969463
        const val min = 2130969464
        const val minHeight = 2130969465
        const val minHideDelay = 2130969466
        const val minSeparation = 2130969467
        const val minTouchTargetSize = 2130969468
        const val minWidth = 2130969469
        const val mock_diagonalsColor = 2130969470
        const val mock_label = 2130969471
        const val mock_labelBackgroundColor = 2130969472
        const val mock_labelColor = 2130969473
        const val mock_showDiagonals = 2130969474
        const val mock_showLabel = 2130969475
        const val motionDebug = 2130969476
        const val motionDurationLong1 = 2130969477
        const val motionDurationLong2 = 2130969478
        const val motionDurationMedium1 = 2130969479
        const val motionDurationMedium2 = 2130969480
        const val motionDurationShort1 = 2130969481
        const val motionDurationShort2 = 2130969482
        const val motionEasingAccelerated = 2130969483
        const val motionEasingDecelerated = 2130969484
        const val motionEasingEmphasized = 2130969485
        const val motionEasingLinear = 2130969486
        const val motionEasingStandard = 2130969487
        const val motionEffect_alpha = 2130969488
        const val motionEffect_end = 2130969489
        const val motionEffect_move = 2130969490
        const val motionEffect_start = 2130969491
        const val motionEffect_strict = 2130969492
        const val motionEffect_translationX = 2130969493
        const val motionEffect_translationY = 2130969494
        const val motionEffect_viewTransition = 2130969495
        const val motionInterpolator = 2130969496
        const val motionPath = 2130969497
        const val motionPathRotate = 2130969498
        const val motionProgress = 2130969499
        const val motionStagger = 2130969500
        const val motionTarget = 2130969501
        const val motion_postLayoutCollision = 2130969502
        const val motion_triggerOnCollision = 2130969503
        const val moveWhenScrollAtTop = 2130969504
        const val multiChoiceItemLayout = 2130969505
        const val navGraph = 2130969506
        const val navigationContentDescription = 2130969507
        const val navigationIcon = 2130969508
        const val navigationIconTint = 2130969509
        const val navigationMode = 2130969510
        const val navigationRailStyle = 2130969511
        const val navigationViewStyle = 2130969512
        const val negativeButtonText = 2130969513
        const val nestedScrollFlags = 2130969514
        const val nestedScrollViewStyle = 2130969515
        const val nestedScrollable = 2130969516
        const val nullable = 2130969517
        const val number = 2130969518
        const val numericModifiers = 2130969519
        const val onCross = 2130969520
        const val onHide = 2130969521
        const val onNegativeCross = 2130969522
        const val onPositiveCross = 2130969523
        const val onShow = 2130969524
        const val onStateTransition = 2130969525
        const val onTouchUp = 2130969526
        const val order = 2130969527
        const val orderingFromXml = 2130969528
        const val overlapAnchor = 2130969529
        const val overlay = 2130969530
        const val paddingBottomNoButtons = 2130969531
        const val paddingBottomSystemWindowInsets = 2130969532
        const val paddingEnd = 2130969533
        const val paddingLeftSystemWindowInsets = 2130969534
        const val paddingRightSystemWindowInsets = 2130969535
        const val paddingStart = 2130969536
        const val paddingTopNoTitle = 2130969537
        const val paddingTopSystemWindowInsets = 2130969538
        const val panelBackground = 2130969539
        const val panelMenuListTheme = 2130969540
        const val panelMenuListWidth = 2130969541
        const val passwordToggleContentDescription = 2130969542
        const val passwordToggleDrawable = 2130969543
        const val passwordToggleEnabled = 2130969544
        const val passwordToggleTint = 2130969545
        const val passwordToggleTintMode = 2130969546
        const val pathMotionArc = 2130969547
        const val path_percent = 2130969548
        const val percentHeight = 2130969549
        const val percentWidth = 2130969550
        const val percentX = 2130969551
        const val percentY = 2130969552
        const val perpendicularPath_percent = 2130969553
        const val persistent = 2130969554
        const val pivotAnchor = 2130969555
        const val placeholderActivityName = 2130969556
        const val placeholderText = 2130969557
        const val placeholderTextAppearance = 2130969558
        const val placeholderTextColor = 2130969559
        const val placeholder_emptyVisibility = 2130969560
        const val played_ad_marker_color = 2130969561
        const val played_color = 2130969562
        const val player_layout_id = 2130969563
        const val polarRelativeTo = 2130969564
        const val popEnterAnim = 2130969565
        const val popExitAnim = 2130969566
        const val popUpTo = 2130969567
        const val popUpToInclusive = 2130969568
        const val popUpToSaveState = 2130969569
        const val popupMenuBackground = 2130969570
        const val popupMenuStyle = 2130969571
        const val popupTheme = 2130969572
        const val popupWindowStyle = 2130969573
        const val positiveButtonText = 2130969574
        const val preferenceCategoryStyle = 2130969575
        const val preferenceCategoryTitleTextAppearance = 2130969576
        const val preferenceFragmentCompatStyle = 2130969577
        const val preferenceFragmentListStyle = 2130969578
        const val preferenceFragmentStyle = 2130969579
        const val preferenceInformationStyle = 2130969580
        const val preferenceScreenStyle = 2130969581
        const val preferenceStyle = 2130969582
        const val preferenceTheme = 2130969583
        const val prefixText = 2130969584
        const val prefixTextAppearance = 2130969585
        const val prefixTextColor = 2130969586
        const val preserveIconSpacing = 2130969587
        const val pressedTranslationZ = 2130969588
        const val primaryActivityName = 2130969589
        const val primaryBlackBackground = 2130969590
        const val primaryGrayBackground = 2130969591
        const val progressBarPadding = 2130969592
        const val progressBarStyle = 2130969593
        const val quantizeMotionInterpolator = 2130969594
        const val quantizeMotionPhase = 2130969595
        const val quantizeMotionSteps = 2130969596
        const val queryBackground = 2130969597
        const val queryHint = 2130969598
        const val queryPatterns = 2130969599
        const val radioButtonStyle = 2130969600
        const val rangeFillColor = 2130969601
        const val ratingBarStyle = 2130969602
        const val ratingBarStyleIndicator = 2130969603
        const val ratingBarStyleSmall = 2130969604
        const val reactiveGuide_animateChange = 2130969605
        const val reactiveGuide_applyToAllConstraintSets = 2130969606
        const val reactiveGuide_applyToConstraintSet = 2130969607
        const val reactiveGuide_valueId = 2130969608
        const val recyclerViewStyle = 2130969609
        const val region_heightLessThan = 2130969610
        const val region_heightMoreThan = 2130969611
        const val region_widthLessThan = 2130969612
        const val region_widthMoreThan = 2130969613
        const val repeat_toggle_modes = 2130969614
        const val resize_mode = 2130969615
        const val restoreState = 2130969616
        const val reverseLayout = 2130969617
        const val rippleColor = 2130969618
        const val rotationCenterId = 2130969619
        const val round = 2130969620
        const val roundPercent = 2130969621
        const val route = 2130969622
        const val saturation = 2130969623
        const val scaleFromTextSize = 2130969624
        const val scopeUris = 2130969625
        const val scrimAnimationDuration = 2130969626
        const val scrimBackground = 2130969627
        const val scrimVisibleHeightTrigger = 2130969628
        const val scrubber_color = 2130969629
        const val scrubber_disabled_size = 2130969630
        const val scrubber_dragged_size = 2130969631
        const val scrubber_drawable = 2130969632
        const val scrubber_enabled_size = 2130969633
        const val searchHintIcon = 2130969634
        const val searchIcon = 2130969635
        const val searchViewStyle = 2130969636
        const val secondaryActivityAction = 2130969637
        const val secondaryActivityName = 2130969638
        const val seekBarIncrement = 2130969639
        const val seekBarPreferenceStyle = 2130969640
        const val seekBarStyle = 2130969641
        const val selectable = 2130969642
        const val selectableItemBackground = 2130969643
        const val selectableItemBackgroundBorderless = 2130969644
        const val selectionRequired = 2130969645
        const val selectorSize = 2130969646
        const val setsTag = 2130969647
        const val shapeAppearance = 2130969648
        const val shapeAppearanceLargeComponent = 2130969649
        const val shapeAppearanceMediumComponent = 2130969650
        const val shapeAppearanceOverlay = 2130969651
        const val shapeAppearanceSmallComponent = 2130969652
        const val shimmer_auto_start = 2130969653
        const val shimmer_base_alpha = 2130969654
        const val shimmer_base_color = 2130969655
        const val shimmer_clip_to_children = 2130969656
        const val shimmer_colored = 2130969657
        const val shimmer_direction = 2130969658
        const val shimmer_dropoff = 2130969659
        const val shimmer_duration = 2130969660
        const val shimmer_fixed_height = 2130969661
        const val shimmer_fixed_width = 2130969662
        const val shimmer_height_ratio = 2130969663
        const val shimmer_highlight_alpha = 2130969664
        const val shimmer_highlight_color = 2130969665
        const val shimmer_intensity = 2130969666
        const val shimmer_repeat_count = 2130969667
        const val shimmer_repeat_delay = 2130969668
        const val shimmer_repeat_mode = 2130969669
        const val shimmer_shape = 2130969670
        const val shimmer_tilt = 2130969671
        const val shimmer_width_ratio = 2130969672
        const val shortcutMatchRequired = 2130969673
        const val shouldDisableView = 2130969674
        const val showAnimationBehavior = 2130969675
        const val showAsAction = 2130969676
        const val showDelay = 2130969677
        const val showDividers = 2130969678
        const val showMotionSpec = 2130969679
        const val showPaths = 2130969680
        const val showSeekBarValue = 2130969681
        const val showText = 2130969682
        const val showTitle = 2130969683
        const val show_buffering = 2130969684
        const val show_fastforward_button = 2130969685
        const val show_next_button = 2130969686
        const val show_previous_button = 2130969687
        const val show_rewind_button = 2130969688
        const val show_shuffle_button = 2130969689
        const val show_subtitle_button = 2130969690
        const val show_timeout = 2130969691
        const val show_vr_button = 2130969692
        const val shrinkMotionSpec = 2130969693
        const val shutter_background_color = 2130969694
        const val singleChoiceItemLayout = 2130969695
        const val singleLine = 2130969696
        const val singleLineTitle = 2130969697
        const val singleSelection = 2130969698
        const val sizePercent = 2130969699
        const val sliderStyle = 2130969700
        const val snackbarButtonStyle = 2130969701
        const val snackbarStyle = 2130969702
        const val snackbarTextViewStyle = 2130969703
        const val spanCount = 2130969704
        const val spinBars = 2130969705
        const val spinnerDropDownItemStyle = 2130969706
        const val spinnerStyle = 2130969707
        const val splitLayoutDirection = 2130969708
        const val splitMinSmallestWidth = 2130969709
        const val splitMinWidth = 2130969710
        const val splitRatio = 2130969711
        const val splitTrack = 2130969712
        const val springBoundary = 2130969713
        const val springDamping = 2130969714
        const val springMass = 2130969715
        const val springStiffness = 2130969716
        const val springStopThreshold = 2130969717
        const val srcCompat = 2130969718
        const val stackFromEnd = 2130969719
        const val staggered = 2130969720
        const val startDestination = 2130969721
        const val startIconCheckable = 2130969722
        const val startIconContentDescription = 2130969723
        const val startIconDrawable = 2130969724
        const val startIconTint = 2130969725
        const val startIconTintMode = 2130969726
        const val state_above_anchor = 2130969727
        const val state_collapsed = 2130969728
        const val state_collapsible = 2130969729
        const val state_dragged = 2130969730
        const val state_liftable = 2130969731
        const val state_lifted = 2130969732
        const val statusBarBackground = 2130969733
        const val statusBarForeground = 2130969734
        const val statusBarScrim = 2130969735
        const val strokeColor = 2130969736
        const val strokeWidth = 2130969737
        const val subMenuArrow = 2130969738
        const val subheaderColor = 2130969739
        const val subheaderInsetEnd = 2130969740
        const val subheaderInsetStart = 2130969741
        const val subheaderTextAppearance = 2130969742
        const val submitBackground = 2130969743
        const val subtitle = 2130969744
        const val subtitleCentered = 2130969745
        const val subtitleTextAppearance = 2130969746
        const val subtitleTextColor = 2130969747
        const val subtitleTextStyle = 2130969748
        const val suffixText = 2130969749
        const val suffixTextAppearance = 2130969750
        const val suffixTextColor = 2130969751
        const val suggestionRowLayout = 2130969752
        const val summary = 2130969753
        const val summaryOff = 2130969754
        const val summaryOn = 2130969755
        const val surface_type = 2130969756
        const val swipeRefreshLayoutProgressSpinnerBackgroundColor = 2130969757
        const val switchMinWidth = 2130969758
        const val switchPadding = 2130969759
        const val switchPreferenceCompatStyle = 2130969760
        const val switchPreferenceStyle = 2130969761
        const val switchStyle = 2130969762
        const val switchTextAppearance = 2130969763
        const val switchTextOff = 2130969764
        const val switchTextOn = 2130969765
        const val tabBackground = 2130969766
        const val tabContentStart = 2130969767
        const val tabGravity = 2130969768
        const val tabIconTint = 2130969769
        const val tabIconTintMode = 2130969770
        const val tabIndicator = 2130969771
        const val tabIndicatorAnimationDuration = 2130969772
        const val tabIndicatorAnimationMode = 2130969773
        const val tabIndicatorColor = 2130969774
        const val tabIndicatorFullWidth = 2130969775
        const val tabIndicatorGravity = 2130969776
        const val tabIndicatorHeight = 2130969777
        const val tabInlineLabel = 2130969778
        const val tabMaxWidth = 2130969779
        const val tabMinWidth = 2130969780
        const val tabMode = 2130969781
        const val tabPadding = 2130969782
        const val tabPaddingBottom = 2130969783
        const val tabPaddingEnd = 2130969784
        const val tabPaddingStart = 2130969785
        const val tabPaddingTop = 2130969786
        const val tabRippleColor = 2130969787
        const val tabSecondaryStyle = 2130969788
        const val tabSelectedTextColor = 2130969789
        const val tabStyle = 2130969790
        const val tabTextAppearance = 2130969791
        const val tabTextColor = 2130969792
        const val tabUnboundedRipple = 2130969793
        const val targetId = 2130969794
        const val targetPackage = 2130969795
        const val telltales_tailColor = 2130969796
        const val telltales_tailScale = 2130969797
        const val telltales_velocityMode = 2130969798
        const val textAllCaps = 2130969799
        const val textAppearanceBody1 = 2130969800
        const val textAppearanceBody2 = 2130969801
        const val textAppearanceBodyLarge = 2130969802
        const val textAppearanceBodyMedium = 2130969803
        const val textAppearanceBodySmall = 2130969804
        const val textAppearanceButton = 2130969805
        const val textAppearanceCaption = 2130969806
        const val textAppearanceDisplayLarge = 2130969807
        const val textAppearanceDisplayMedium = 2130969808
        const val textAppearanceDisplaySmall = 2130969809
        const val textAppearanceHeadline1 = 2130969810
        const val textAppearanceHeadline2 = 2130969811
        const val textAppearanceHeadline3 = 2130969812
        const val textAppearanceHeadline4 = 2130969813
        const val textAppearanceHeadline5 = 2130969814
        const val textAppearanceHeadline6 = 2130969815
        const val textAppearanceHeadlineLarge = 2130969816
        const val textAppearanceHeadlineMedium = 2130969817
        const val textAppearanceHeadlineSmall = 2130969818
        const val textAppearanceLabelLarge = 2130969819
        const val textAppearanceLabelMedium = 2130969820
        const val textAppearanceLabelSmall = 2130969821
        const val textAppearanceLargePopupMenu = 2130969822
        const val textAppearanceLineHeightEnabled = 2130969823
        const val textAppearanceListItem = 2130969824
        const val textAppearanceListItemSecondary = 2130969825
        const val textAppearanceListItemSmall = 2130969826
        const val textAppearanceOverline = 2130969827
        const val textAppearancePopupMenuHeader = 2130969828
        const val textAppearanceSearchResultSubtitle = 2130969829
        const val textAppearanceSearchResultTitle = 2130969830
        const val textAppearanceSmallPopupMenu = 2130969831
        const val textAppearanceSubtitle1 = 2130969832
        const val textAppearanceSubtitle2 = 2130969833
        const val textAppearanceTitleLarge = 2130969834
        const val textAppearanceTitleMedium = 2130969835
        const val textAppearanceTitleSmall = 2130969836
        const val textBackground = 2130969837
        const val textBackgroundPanX = 2130969838
        const val textBackgroundPanY = 2130969839
        const val textBackgroundRotate = 2130969840
        const val textBackgroundZoom = 2130969841
        const val textColor = 2130969842
        const val textColorAlertDialogListItem = 2130969843
        const val textColorSearchUrl = 2130969844
        const val textEndPadding = 2130969845
        const val textFillColor = 2130969846
        const val textInputFilledDenseStyle = 2130969847
        const val textInputFilledExposedDropdownMenuStyle = 2130969848
        const val textInputFilledStyle = 2130969849
        const val textInputLayoutFocusedRectEnabled = 2130969850
        const val textInputOutlinedDenseStyle = 2130969851
        const val textInputOutlinedExposedDropdownMenuStyle = 2130969852
        const val textInputOutlinedStyle = 2130969853
        const val textInputStyle = 2130969854
        const val textLocale = 2130969855
        const val textOutlineColor = 2130969856
        const val textOutlineThickness = 2130969857
        const val textPanX = 2130969858
        const val textPanY = 2130969859
        const val textStartPadding = 2130969860
        const val textureBlurFactor = 2130969861
        const val textureEffect = 2130969862
        const val textureHeight = 2130969863
        const val textureWidth = 2130969864
        const val theme = 2130969865
        const val themeLineHeight = 2130969866
        const val thickness = 2130969867
        const val thumbColor = 2130969868
        const val thumbElevation = 2130969869
        const val thumbRadius = 2130969870
        const val thumbStrokeColor = 2130969871
        const val thumbStrokeWidth = 2130969872
        const val thumbTextPadding = 2130969873
        const val thumbTint = 2130969874
        const val thumbTintMode = 2130969875
        const val tickColor = 2130969876
        const val tickColorActive = 2130969877
        const val tickColorInactive = 2130969878
        const val tickMark = 2130969879
        const val tickMarkTint = 2130969880
        const val tickMarkTintMode = 2130969881
        const val tickVisible = 2130969882
        const val time_bar_min_update_interval = 2130969883
        const val tint = 2130969884
        const val tintMode = 2130969885
        const val title = 2130969886
        const val titleCentered = 2130969887
        const val titleCollapseMode = 2130969888
        const val titleEnabled = 2130969889
        const val titleMargin = 2130969890
        const val titleMarginBottom = 2130969891
        const val titleMarginEnd = 2130969892
        const val titleMarginStart = 2130969893
        const val titleMarginTop = 2130969894
        const val titleMargins = 2130969895
        const val titlePositionInterpolator = 2130969896
        const val titleTextAppearance = 2130969897
        const val titleTextColor = 2130969898
        const val titleTextStyle = 2130969899
        const val toolbarId = 2130969900
        const val toolbarNavigationButtonStyle = 2130969901
        const val toolbarStyle = 2130969902
        const val toolbarSurfaceStyle = 2130969903
        const val tooltipForegroundColor = 2130969904
        const val tooltipFrameBackground = 2130969905
        const val tooltipStyle = 2130969906
        const val tooltipText = 2130969907
        const val topInsetScrimEnabled = 2130969908
        const val touchAnchorId = 2130969909
        const val touchAnchorSide = 2130969910
        const val touchRegionId = 2130969911
        const val touch_target_height = 2130969912
        const val track = 2130969913
        const val trackColor = 2130969914
        const val trackColorActive = 2130969915
        const val trackColorInactive = 2130969916
        const val trackCornerRadius = 2130969917
        const val trackHeight = 2130969918
        const val trackThickness = 2130969919
        const val trackTint = 2130969920
        const val trackTintMode = 2130969921
        const val transformPivotTarget = 2130969922
        const val transitionDisable = 2130969923
        const val transitionEasing = 2130969924
        const val transitionFlags = 2130969925
        const val transitionPathRotate = 2130969926
        const val transitionShapeAppearance = 2130969927
        const val triggerId = 2130969928
        const val triggerReceiver = 2130969929
        const val triggerSlack = 2130969930
        const val ttcIndex = 2130969931
        const val unicorn_background = 2130969932
        const val unicorn_colorAccent = 2130969933
        const val unicorn_fabColor = 2130969934
        const val unicorn_file_arrowIconTint = 2130969935
        const val unicorn_file_heading = 2130969936
        const val unicorn_file_iconTint = 2130969937
        const val unicorn_file_selectionTint = 2130969938
        const val unicorn_file_subHeading = 2130969939
        const val unicorn_iconTintColor = 2130969940
        const val unicorn_primaryTextColor = 2130969941
        const val unicorn_secondaryTextColor = 2130969942
        const val unplayed_color = 2130969943
        const val upDuration = 2130969944
        const val updatesContinuously = 2130969945
        const val uri = 2130969946
        const val useCompatPadding = 2130969947
        const val useMaterialThemeColors = 2130969948
        const val useSimpleSummaryProvider = 2130969949
        const val use_artwork = 2130969950
        const val use_controller = 2130969951
        const val values = 2130969952
        const val verticalOffset = 2130969953
        const val verticalOffsetWithText = 2130969954
        const val viewInflaterClass = 2130969955
        const val viewTransitionMode = 2130969956
        const val viewTransitionOnCross = 2130969957
        const val viewTransitionOnNegativeCross = 2130969958
        const val viewTransitionOnPositiveCross = 2130969959
        const val visibilityMode = 2130969960
        const val voiceIcon = 2130969961
        const val warmth = 2130969962
        const val waveDecay = 2130969963
        const val waveOffset = 2130969964
        const val wavePeriod = 2130969965
        const val wavePhase = 2130969966
        const val waveShape = 2130969967
        const val waveVariesBy = 2130969968
        const val white = 2130969969
        const val widgetLayout = 2130969970
        const val windowActionBar = 2130969971
        const val windowActionBarOverlay = 2130969972
        const val windowActionModeOverlay = 2130969973
        const val windowFixedHeightMajor = 2130969974
        const val windowFixedHeightMinor = 2130969975
        const val windowFixedWidthMajor = 2130969976
        const val windowFixedWidthMinor = 2130969977
        const val windowMinWidthMajor = 2130969978
        const val windowMinWidthMinor = 2130969979
        const val windowNoTitle = 2130969980
        const val yearSelectedStyle = 2130969981
        const val yearStyle = 2130969982
        const val yearTodayStyle = 2130969983
    }

    /* renamed from: com.lagradost.cloudstream3.R$bool */ /* loaded from: classes3.dex */
    object bool {
        const val abc_action_bar_embed_tabs = 2131034112
        const val abc_config_actionMenuItemAllCaps = 2131034113
        const val acra_enable_job_service = 2131034114
        const val acra_enable_legacy_service = 2131034115
        const val config_materialPreferenceIconSpaceReserved = 2131034116
        const val enable_system_alarm_service_default = 2131034117
        const val enable_system_foreground_service_default = 2131034118
        const val enable_system_job_service_default = 2131034119
        const val is_tablet = 2131034120
        const val m3_sys_typescale_body_large_text_all_caps = 2131034121
        const val m3_sys_typescale_body_medium_text_all_caps = 2131034122
        const val m3_sys_typescale_body_small_text_all_caps = 2131034123
        const val m3_sys_typescale_display_large_text_all_caps = 2131034124
        const val m3_sys_typescale_display_medium_text_all_caps = 2131034125
        const val m3_sys_typescale_display_small_text_all_caps = 2131034126
        const val m3_sys_typescale_headline_large_text_all_caps = 2131034127
        const val m3_sys_typescale_headline_medium_text_all_caps = 2131034128
        const val m3_sys_typescale_headline_small_text_all_caps = 2131034129
        const val m3_sys_typescale_label_large_text_all_caps = 2131034130
        const val m3_sys_typescale_label_medium_text_all_caps = 2131034131
        const val m3_sys_typescale_label_small_text_all_caps = 2131034132
        const val m3_sys_typescale_title_large_text_all_caps = 2131034133
        const val m3_sys_typescale_title_medium_text_all_caps = 2131034134
        const val m3_sys_typescale_title_small_text_all_caps = 2131034135
        const val mtrl_btn_textappearance_all_caps = 2131034136
        const val workmanager_test_configuration = 2131034137
    }

    /* renamed from: com.lagradost.cloudstream3.R$color */ /* loaded from: classes3.dex */
    object C4762color {
        const val abc_background_cache_hint_selector_material_dark = 2131099648
        const val abc_background_cache_hint_selector_material_light = 2131099649
        const val abc_btn_colored_borderless_text_material = 2131099650
        const val abc_btn_colored_text_material = 2131099651
        const val abc_color_highlight_material = 2131099652
        const val abc_decor_view_status_guard = 2131099653
        const val abc_decor_view_status_guard_light = 2131099654
        const val abc_hint_foreground_material_dark = 2131099655
        const val abc_hint_foreground_material_light = 2131099656
        const val abc_primary_text_disable_only_material_dark = 2131099657
        const val abc_primary_text_disable_only_material_light = 2131099658
        const val abc_primary_text_material_dark = 2131099659
        const val abc_primary_text_material_light = 2131099660
        const val abc_search_url_text = 2131099661
        const val abc_search_url_text_normal = 2131099662
        const val abc_search_url_text_pressed = 2131099663
        const val abc_search_url_text_selected = 2131099664
        const val abc_secondary_text_material_dark = 2131099665
        const val abc_secondary_text_material_light = 2131099666
        const val abc_tint_btn_checkable = 2131099667
        const val abc_tint_default = 2131099668
        const val abc_tint_edittext = 2131099669
        const val abc_tint_seek_thumb = 2131099670
        const val abc_tint_spinner = 2131099671
        const val abc_tint_switch_track = 2131099672
        const val accent_material_dark = 2131099673
        const val accent_material_light = 2131099674
        const val amoledModeLight = 2131099675
        const val androidx_core_ripple_material_light = 2131099676
        const val androidx_core_secondary_text_default_material_light = 2131099677
        const val applovin_sdk_adBadgeTextColor = 2131099678
        const val applovin_sdk_adControlbutton_brightBlueColor = 2131099679
        const val applovin_sdk_brand_color = 2131099680
        const val applovin_sdk_brand_color_dark = 2131099681
        const val applovin_sdk_checkmarkColor = 2131099682
        const val applovin_sdk_colorEdgeEffect = 2131099683
        const val applovin_sdk_ctaButtonColor = 2131099684
        const val applovin_sdk_ctaButtonPressedColor = 2131099685
        const val applovin_sdk_disclosureButtonColor = 2131099686
        const val applovin_sdk_greenColor = 2131099687
        const val applovin_sdk_listViewBackground = 2131099688
        const val applovin_sdk_listViewSectionTextColor = 2131099689
        const val applovin_sdk_textColorPrimary = 2131099690
        const val applovin_sdk_xmarkColor = 2131099691
        const val background_color = 2131099692
        const val background_floating_material_dark = 2131099693
        const val background_floating_material_light = 2131099694
        const val background_material_dark = 2131099695
        const val background_material_light = 2131099696
        const val bitDarkerGrayBackground = 2131099697
        const val black = 2131099698
        const val black_overlay = 2131099699
        const val blue = 2131099700
        const val boxItemBackground = 2131099701
        const val bright_foreground_disabled_material_dark = 2131099702
        const val bright_foreground_disabled_material_light = 2131099703
        const val bright_foreground_inverse_material_dark = 2131099704
        const val bright_foreground_inverse_material_light = 2131099705
        const val bright_foreground_material_dark = 2131099706
        const val bright_foreground_material_light = 2131099707
        const val browser_actions_bg_grey = 2131099708
        const val browser_actions_divider_color = 2131099709
        const val browser_actions_text_color = 2131099710
        const val browser_actions_title_color = 2131099711
        const val button_material_dark = 2131099712
        const val button_material_light = 2131099713
        const val cardview_dark_background = 2131099714
        const val cardview_light_background = 2131099715
        const val cardview_shadow_end_color = 2131099716
        const val cardview_shadow_start_color = 2131099717
        const val cast_expanded_controller_ad_break_marker_color = 2131099718
        const val cast_expanded_controller_ad_container_white_stripe_color = 2131099719
        const val cast_expanded_controller_ad_in_progress_text_color = 2131099720
        const val cast_expanded_controller_ad_label_background_color = 2131099721
        const val cast_expanded_controller_ad_label_text_color = 2131099722
        const val cast_expanded_controller_background_color = 2131099723
        const val cast_expanded_controller_live_indicator_color = 2131099724
        const val cast_expanded_controller_loading_indicator_color = 2131099725
        const val cast_expanded_controller_progress_text_color = 2131099726
        const val cast_expanded_controller_seek_bar_progress_background_tint_color = 2131099727
        const val cast_expanded_controller_text_color = 2131099728
        const val cast_intro_overlay_background_color = 2131099729
        const val cast_intro_overlay_button_background_color = 2131099730

        /* renamed from: cast_libraries_material_featurehighlight_outer_highlight_default_color */
        const val f9908xfbd34f47 = 2131099731
        const val cast_libraries_material_featurehighlight_text_body_color = 2131099732
        const val cast_libraries_material_featurehighlight_text_header_color = 2131099733
        const val cast_mini_controller_loading_indicator_color = 2131099734
        const val cast_seekbar_progress_thumb_color = 2131099735
        const val cast_seekbar_secondary_progress_color = 2131099736
        const val cast_seekbar_tooltip_background_color = 2131099737
        const val cast_seekbar_unseekable_progress_color = 2131099738
        const val check_selection_color = 2131099739
        const val checkbox_themeable_attribute_color = 2131099740
        const val colorAccent = 2131099741
        const val colorAccent_80 = 2131099742
        const val colorOngoing = 2131099743
        const val colorOverlay = 2131099744
        const val colorPrimary = 2131099745
        const val colorPrimaryBanana = 2131099746
        const val colorPrimaryBlue = 2131099747
        const val colorPrimaryBrown = 2131099748
        const val colorPrimaryCarnationPink = 2131099749
        const val colorPrimaryDark = 2131099750
        const val colorPrimaryDarkGreen = 2131099751
        const val colorPrimaryGreen = 2131099752
        const val colorPrimaryGreenApple = 2131099753
        const val colorPrimaryGrey = 2131099754
        const val colorPrimaryMaroon = 2131099755
        const val colorPrimaryNavyBlue = 2131099756
        const val colorPrimaryParty = 2131099757
        const val colorPrimaryPink = 2131099758
        const val colorPrimaryPurple = 2131099759
        const val colorPrimaryRed = 2131099760
        const val colorPrimarySecond = 2131099761
        const val colorPrimaryWhite = 2131099762
        const val colorSearch = 2131099763
        const val com_facebook_blue = 2131099764
        const val com_facebook_button_background_color = 2131099765
        const val com_facebook_button_background_color_disabled = 2131099766
        const val com_facebook_button_background_color_pressed = 2131099767
        const val com_facebook_button_send_background_color = 2131099768
        const val com_facebook_button_send_background_color_pressed = 2131099769
        const val com_facebook_button_text_color = 2131099770
        const val com_facebook_device_auth_text = 2131099771
        const val com_facebook_likeboxcountview_border_color = 2131099772
        const val com_facebook_likeboxcountview_text_color = 2131099773
        const val com_facebook_likeview_text_color = 2131099774
        const val com_facebook_messenger_blue = 2131099775
        const val com_facebook_primary_button_disabled_text_color = 2131099776
        const val com_facebook_primary_button_pressed_text_color = 2131099777
        const val com_facebook_primary_button_text_color = 2131099778
        const val com_facebook_send_button_text_color = 2131099779
        const val com_smart_login_code = 2131099780
        const val common_google_signin_btn_text_dark = 2131099781
        const val common_google_signin_btn_text_dark_default = 2131099782
        const val common_google_signin_btn_text_dark_disabled = 2131099783
        const val common_google_signin_btn_text_dark_focused = 2131099784
        const val common_google_signin_btn_text_dark_pressed = 2131099785
        const val common_google_signin_btn_text_light = 2131099786
        const val common_google_signin_btn_text_light_default = 2131099787
        const val common_google_signin_btn_text_light_disabled = 2131099788
        const val common_google_signin_btn_text_light_focused = 2131099789
        const val common_google_signin_btn_text_light_pressed = 2131099790
        const val common_google_signin_btn_tint = 2131099791
        const val darkBackground = 2131099792
        const val darkBar = 2131099793
        const val darkBarTransparent = 2131099794
        const val design_bottom_navigation_shadow_color = 2131099795
        const val design_box_stroke_color = 2131099796
        const val design_dark_default_color_background = 2131099797
        const val design_dark_default_color_error = 2131099798
        const val design_dark_default_color_on_background = 2131099799
        const val design_dark_default_color_on_error = 2131099800
        const val design_dark_default_color_on_primary = 2131099801
        const val design_dark_default_color_on_secondary = 2131099802
        const val design_dark_default_color_on_surface = 2131099803
        const val design_dark_default_color_primary = 2131099804
        const val design_dark_default_color_primary_dark = 2131099805
        const val design_dark_default_color_primary_variant = 2131099806
        const val design_dark_default_color_secondary = 2131099807
        const val design_dark_default_color_secondary_variant = 2131099808
        const val design_dark_default_color_surface = 2131099809
        const val design_default_color_background = 2131099810
        const val design_default_color_error = 2131099811
        const val design_default_color_on_background = 2131099812
        const val design_default_color_on_error = 2131099813
        const val design_default_color_on_primary = 2131099814
        const val design_default_color_on_secondary = 2131099815
        const val design_default_color_on_surface = 2131099816
        const val design_default_color_primary = 2131099817
        const val design_default_color_primary_dark = 2131099818
        const val design_default_color_primary_variant = 2131099819
        const val design_default_color_secondary = 2131099820
        const val design_default_color_secondary_variant = 2131099821
        const val design_default_color_surface = 2131099822
        const val design_error = 2131099823
        const val design_fab_shadow_end_color = 2131099824
        const val design_fab_shadow_mid_color = 2131099825
        const val design_fab_shadow_start_color = 2131099826
        const val design_fab_stroke_end_inner_color = 2131099827
        const val design_fab_stroke_end_outer_color = 2131099828
        const val design_fab_stroke_top_inner_color = 2131099829
        const val design_fab_stroke_top_outer_color = 2131099830
        const val design_icon_tint = 2131099831
        const val design_snackbar_background_color = 2131099832
        const val dim_foreground_disabled_material_dark = 2131099833
        const val dim_foreground_disabled_material_light = 2131099834
        const val dim_foreground_material_dark = 2131099835
        const val dim_foreground_material_light = 2131099836
        const val dubColor = 2131099837
        const val dubColorBg = 2131099838
        const val error_color_material_dark = 2131099839
        const val error_color_material_light = 2131099840
        const val exo_black_opacity_60 = 2131099841
        const val exo_black_opacity_70 = 2131099842
        const val exo_bottom_bar_background = 2131099843
        const val exo_edit_mode_background_color = 2131099844
        const val exo_error_message_background_color = 2131099845
        const val exo_styled_error_message_background = 2131099846
        const val exo_white = 2131099847
        const val exo_white_opacity_70 = 2131099848
        const val foreground_material_dark = 2131099849
        const val foreground_material_light = 2131099850
        const val freeStorageColor = 2131099851
        const val gray = 2131099852
        const val grayBackground = 2131099853
        const val grayShimmer = 2131099854
        const val grayTextColor = 2131099855
        const val gray_btn = 2131099856
        const val gray_detail = 2131099857
        const val gray_light = 2131099858
        const val highlighted_text_material_dark = 2131099859
        const val highlighted_text_material_light = 2131099860
        const val ic_launcher_background = 2131099861
        const val iconColor = 2131099862
        const val iconGrayBackground = 2131099863
        const val item_select_color = 2131099864
        const val lightBitDarkerGrayBackground = 2131099865
        const val lightGrayBackground = 2131099866
        const val lightGrayTextColor = 2131099867
        const val lightIconColor = 2131099868
        const val lightItemBackground = 2131099869
        const val lightPrimaryGrayBackground = 2131099870
        const val lightTextColor = 2131099871
        const val m3_appbar_overlay_color = 2131099872
        const val m3_assist_chip_icon_tint_color = 2131099873
        const val m3_assist_chip_stroke_color = 2131099874
        const val m3_button_background_color_selector = 2131099875
        const val m3_button_foreground_color_selector = 2131099876
        const val m3_button_outline_color_selector = 2131099877
        const val m3_button_ripple_color = 2131099878
        const val m3_button_ripple_color_selector = 2131099879
        const val m3_calendar_item_disabled_text = 2131099880
        const val m3_calendar_item_stroke_color = 2131099881
        const val m3_card_foreground_color = 2131099882
        const val m3_card_ripple_color = 2131099883
        const val m3_card_stroke_color = 2131099884
        const val m3_chip_assist_text_color = 2131099885
        const val m3_chip_background_color = 2131099886
        const val m3_chip_ripple_color = 2131099887
        const val m3_chip_stroke_color = 2131099888
        const val m3_chip_text_color = 2131099889
        const val m3_dark_default_color_primary_text = 2131099890
        const val m3_dark_default_color_secondary_text = 2131099891
        const val m3_dark_highlighted_text = 2131099892
        const val m3_dark_hint_foreground = 2131099893
        const val m3_dark_primary_text_disable_only = 2131099894
        const val m3_default_color_primary_text = 2131099895
        const val m3_default_color_secondary_text = 2131099896
        const val m3_dynamic_dark_default_color_primary_text = 2131099897
        const val m3_dynamic_dark_default_color_secondary_text = 2131099898
        const val m3_dynamic_dark_highlighted_text = 2131099899
        const val m3_dynamic_dark_hint_foreground = 2131099900
        const val m3_dynamic_dark_primary_text_disable_only = 2131099901
        const val m3_dynamic_default_color_primary_text = 2131099902
        const val m3_dynamic_default_color_secondary_text = 2131099903
        const val m3_dynamic_highlighted_text = 2131099904
        const val m3_dynamic_hint_foreground = 2131099905
        const val m3_dynamic_primary_text_disable_only = 2131099906
        const val m3_elevated_chip_background_color = 2131099907
        const val m3_highlighted_text = 2131099908
        const val m3_hint_foreground = 2131099909
        const val m3_navigation_bar_item_with_indicator_icon_tint = 2131099910
        const val m3_navigation_bar_item_with_indicator_label_tint = 2131099911
        const val m3_navigation_bar_ripple_color_selector = 2131099912
        const val m3_navigation_item_background_color = 2131099913
        const val m3_navigation_item_icon_tint = 2131099914
        const val m3_navigation_item_text_color = 2131099915
        const val m3_popupmenu_overlay_color = 2131099916
        const val m3_primary_text_disable_only = 2131099917
        const val m3_radiobutton_ripple_tint = 2131099918
        const val m3_ref_palette_dynamic_neutral0 = 2131099919
        const val m3_ref_palette_dynamic_neutral10 = 2131099920
        const val m3_ref_palette_dynamic_neutral100 = 2131099921
        const val m3_ref_palette_dynamic_neutral20 = 2131099922
        const val m3_ref_palette_dynamic_neutral30 = 2131099923
        const val m3_ref_palette_dynamic_neutral40 = 2131099924
        const val m3_ref_palette_dynamic_neutral50 = 2131099925
        const val m3_ref_palette_dynamic_neutral60 = 2131099926
        const val m3_ref_palette_dynamic_neutral70 = 2131099927
        const val m3_ref_palette_dynamic_neutral80 = 2131099928
        const val m3_ref_palette_dynamic_neutral90 = 2131099929
        const val m3_ref_palette_dynamic_neutral95 = 2131099930
        const val m3_ref_palette_dynamic_neutral99 = 2131099931
        const val m3_ref_palette_dynamic_neutral_variant0 = 2131099932
        const val m3_ref_palette_dynamic_neutral_variant10 = 2131099933
        const val m3_ref_palette_dynamic_neutral_variant100 = 2131099934
        const val m3_ref_palette_dynamic_neutral_variant20 = 2131099935
        const val m3_ref_palette_dynamic_neutral_variant30 = 2131099936
        const val m3_ref_palette_dynamic_neutral_variant40 = 2131099937
        const val m3_ref_palette_dynamic_neutral_variant50 = 2131099938
        const val m3_ref_palette_dynamic_neutral_variant60 = 2131099939
        const val m3_ref_palette_dynamic_neutral_variant70 = 2131099940
        const val m3_ref_palette_dynamic_neutral_variant80 = 2131099941
        const val m3_ref_palette_dynamic_neutral_variant90 = 2131099942
        const val m3_ref_palette_dynamic_neutral_variant95 = 2131099943
        const val m3_ref_palette_dynamic_neutral_variant99 = 2131099944
        const val m3_ref_palette_dynamic_primary0 = 2131099945
        const val m3_ref_palette_dynamic_primary10 = 2131099946
        const val m3_ref_palette_dynamic_primary100 = 2131099947
        const val m3_ref_palette_dynamic_primary20 = 2131099948
        const val m3_ref_palette_dynamic_primary30 = 2131099949
        const val m3_ref_palette_dynamic_primary40 = 2131099950
        const val m3_ref_palette_dynamic_primary50 = 2131099951
        const val m3_ref_palette_dynamic_primary60 = 2131099952
        const val m3_ref_palette_dynamic_primary70 = 2131099953
        const val m3_ref_palette_dynamic_primary80 = 2131099954
        const val m3_ref_palette_dynamic_primary90 = 2131099955
        const val m3_ref_palette_dynamic_primary95 = 2131099956
        const val m3_ref_palette_dynamic_primary99 = 2131099957
        const val m3_ref_palette_dynamic_secondary0 = 2131099958
        const val m3_ref_palette_dynamic_secondary10 = 2131099959
        const val m3_ref_palette_dynamic_secondary100 = 2131099960
        const val m3_ref_palette_dynamic_secondary20 = 2131099961
        const val m3_ref_palette_dynamic_secondary30 = 2131099962
        const val m3_ref_palette_dynamic_secondary40 = 2131099963
        const val m3_ref_palette_dynamic_secondary50 = 2131099964
        const val m3_ref_palette_dynamic_secondary60 = 2131099965
        const val m3_ref_palette_dynamic_secondary70 = 2131099966
        const val m3_ref_palette_dynamic_secondary80 = 2131099967
        const val m3_ref_palette_dynamic_secondary90 = 2131099968
        const val m3_ref_palette_dynamic_secondary95 = 2131099969
        const val m3_ref_palette_dynamic_secondary99 = 2131099970
        const val m3_ref_palette_dynamic_tertiary0 = 2131099971
        const val m3_ref_palette_dynamic_tertiary10 = 2131099972
        const val m3_ref_palette_dynamic_tertiary100 = 2131099973
        const val m3_ref_palette_dynamic_tertiary20 = 2131099974
        const val m3_ref_palette_dynamic_tertiary30 = 2131099975
        const val m3_ref_palette_dynamic_tertiary40 = 2131099976
        const val m3_ref_palette_dynamic_tertiary50 = 2131099977
        const val m3_ref_palette_dynamic_tertiary60 = 2131099978
        const val m3_ref_palette_dynamic_tertiary70 = 2131099979
        const val m3_ref_palette_dynamic_tertiary80 = 2131099980
        const val m3_ref_palette_dynamic_tertiary90 = 2131099981
        const val m3_ref_palette_dynamic_tertiary95 = 2131099982
        const val m3_ref_palette_dynamic_tertiary99 = 2131099983
        const val m3_ref_palette_error0 = 2131099984
        const val m3_ref_palette_error10 = 2131099985
        const val m3_ref_palette_error100 = 2131099986
        const val m3_ref_palette_error20 = 2131099987
        const val m3_ref_palette_error30 = 2131099988
        const val m3_ref_palette_error40 = 2131099989
        const val m3_ref_palette_error50 = 2131099990
        const val m3_ref_palette_error60 = 2131099991
        const val m3_ref_palette_error70 = 2131099992
        const val m3_ref_palette_error80 = 2131099993
        const val m3_ref_palette_error90 = 2131099994
        const val m3_ref_palette_error95 = 2131099995
        const val m3_ref_palette_error99 = 2131099996
        const val m3_ref_palette_neutral0 = 2131099997
        const val m3_ref_palette_neutral10 = 2131099998
        const val m3_ref_palette_neutral100 = 2131099999
        const val m3_ref_palette_neutral20 = 2131100000
        const val m3_ref_palette_neutral30 = 2131100001
        const val m3_ref_palette_neutral40 = 2131100002
        const val m3_ref_palette_neutral50 = 2131100003
        const val m3_ref_palette_neutral60 = 2131100004
        const val m3_ref_palette_neutral70 = 2131100005
        const val m3_ref_palette_neutral80 = 2131100006
        const val m3_ref_palette_neutral90 = 2131100007
        const val m3_ref_palette_neutral95 = 2131100008
        const val m3_ref_palette_neutral99 = 2131100009
        const val m3_ref_palette_neutral_variant0 = 2131100010
        const val m3_ref_palette_neutral_variant10 = 2131100011
        const val m3_ref_palette_neutral_variant100 = 2131100012
        const val m3_ref_palette_neutral_variant20 = 2131100013
        const val m3_ref_palette_neutral_variant30 = 2131100014
        const val m3_ref_palette_neutral_variant40 = 2131100015
        const val m3_ref_palette_neutral_variant50 = 2131100016
        const val m3_ref_palette_neutral_variant60 = 2131100017
        const val m3_ref_palette_neutral_variant70 = 2131100018
        const val m3_ref_palette_neutral_variant80 = 2131100019
        const val m3_ref_palette_neutral_variant90 = 2131100020
        const val m3_ref_palette_neutral_variant95 = 2131100021
        const val m3_ref_palette_neutral_variant99 = 2131100022
        const val m3_ref_palette_primary0 = 2131100023
        const val m3_ref_palette_primary10 = 2131100024
        const val m3_ref_palette_primary100 = 2131100025
        const val m3_ref_palette_primary20 = 2131100026
        const val m3_ref_palette_primary30 = 2131100027
        const val m3_ref_palette_primary40 = 2131100028
        const val m3_ref_palette_primary50 = 2131100029
        const val m3_ref_palette_primary60 = 2131100030
        const val m3_ref_palette_primary70 = 2131100031
        const val m3_ref_palette_primary80 = 2131100032
        const val m3_ref_palette_primary90 = 2131100033
        const val m3_ref_palette_primary95 = 2131100034
        const val m3_ref_palette_primary99 = 2131100035
        const val m3_ref_palette_secondary0 = 2131100036
        const val m3_ref_palette_secondary10 = 2131100037
        const val m3_ref_palette_secondary100 = 2131100038
        const val m3_ref_palette_secondary20 = 2131100039
        const val m3_ref_palette_secondary30 = 2131100040
        const val m3_ref_palette_secondary40 = 2131100041
        const val m3_ref_palette_secondary50 = 2131100042
        const val m3_ref_palette_secondary60 = 2131100043
        const val m3_ref_palette_secondary70 = 2131100044
        const val m3_ref_palette_secondary80 = 2131100045
        const val m3_ref_palette_secondary90 = 2131100046
        const val m3_ref_palette_secondary95 = 2131100047
        const val m3_ref_palette_secondary99 = 2131100048
        const val m3_ref_palette_tertiary0 = 2131100049
        const val m3_ref_palette_tertiary10 = 2131100050
        const val m3_ref_palette_tertiary100 = 2131100051
        const val m3_ref_palette_tertiary20 = 2131100052
        const val m3_ref_palette_tertiary30 = 2131100053
        const val m3_ref_palette_tertiary40 = 2131100054
        const val m3_ref_palette_tertiary50 = 2131100055
        const val m3_ref_palette_tertiary60 = 2131100056
        const val m3_ref_palette_tertiary70 = 2131100057
        const val m3_ref_palette_tertiary80 = 2131100058
        const val m3_ref_palette_tertiary90 = 2131100059
        const val m3_ref_palette_tertiary95 = 2131100060
        const val m3_ref_palette_tertiary99 = 2131100061
        const val m3_selection_control_button_tint = 2131100062
        const val m3_selection_control_ripple_color_selector = 2131100063
        const val m3_slider_active_track_color = 2131100064
        const val m3_slider_halo_color = 2131100065
        const val m3_slider_inactive_track_color = 2131100066
        const val m3_slider_thumb_color = 2131100067
        const val m3_switch_thumb_tint = 2131100068
        const val m3_switch_track_tint = 2131100069
        const val m3_sys_color_dark_background = 2131100070
        const val m3_sys_color_dark_error = 2131100071
        const val m3_sys_color_dark_error_container = 2131100072
        const val m3_sys_color_dark_inverse_on_surface = 2131100073
        const val m3_sys_color_dark_inverse_primary = 2131100074
        const val m3_sys_color_dark_inverse_surface = 2131100075
        const val m3_sys_color_dark_on_background = 2131100076
        const val m3_sys_color_dark_on_error = 2131100077
        const val m3_sys_color_dark_on_error_container = 2131100078
        const val m3_sys_color_dark_on_primary = 2131100079
        const val m3_sys_color_dark_on_primary_container = 2131100080
        const val m3_sys_color_dark_on_secondary = 2131100081
        const val m3_sys_color_dark_on_secondary_container = 2131100082
        const val m3_sys_color_dark_on_surface = 2131100083
        const val m3_sys_color_dark_on_surface_variant = 2131100084
        const val m3_sys_color_dark_on_tertiary = 2131100085
        const val m3_sys_color_dark_on_tertiary_container = 2131100086
        const val m3_sys_color_dark_outline = 2131100087
        const val m3_sys_color_dark_primary = 2131100088
        const val m3_sys_color_dark_primary_container = 2131100089
        const val m3_sys_color_dark_secondary = 2131100090
        const val m3_sys_color_dark_secondary_container = 2131100091
        const val m3_sys_color_dark_surface = 2131100092
        const val m3_sys_color_dark_surface_variant = 2131100093
        const val m3_sys_color_dark_tertiary = 2131100094
        const val m3_sys_color_dark_tertiary_container = 2131100095
        const val m3_sys_color_dynamic_dark_background = 2131100096
        const val m3_sys_color_dynamic_dark_inverse_on_surface = 2131100097
        const val m3_sys_color_dynamic_dark_inverse_primary = 2131100098
        const val m3_sys_color_dynamic_dark_inverse_surface = 2131100099
        const val m3_sys_color_dynamic_dark_on_background = 2131100100
        const val m3_sys_color_dynamic_dark_on_primary = 2131100101
        const val m3_sys_color_dynamic_dark_on_primary_container = 2131100102
        const val m3_sys_color_dynamic_dark_on_secondary = 2131100103
        const val m3_sys_color_dynamic_dark_on_secondary_container = 2131100104
        const val m3_sys_color_dynamic_dark_on_surface = 2131100105
        const val m3_sys_color_dynamic_dark_on_surface_variant = 2131100106
        const val m3_sys_color_dynamic_dark_on_tertiary = 2131100107
        const val m3_sys_color_dynamic_dark_on_tertiary_container = 2131100108
        const val m3_sys_color_dynamic_dark_outline = 2131100109
        const val m3_sys_color_dynamic_dark_primary = 2131100110
        const val m3_sys_color_dynamic_dark_primary_container = 2131100111
        const val m3_sys_color_dynamic_dark_secondary = 2131100112
        const val m3_sys_color_dynamic_dark_secondary_container = 2131100113
        const val m3_sys_color_dynamic_dark_surface = 2131100114
        const val m3_sys_color_dynamic_dark_surface_variant = 2131100115
        const val m3_sys_color_dynamic_dark_tertiary = 2131100116
        const val m3_sys_color_dynamic_dark_tertiary_container = 2131100117
        const val m3_sys_color_dynamic_light_background = 2131100118
        const val m3_sys_color_dynamic_light_inverse_on_surface = 2131100119
        const val m3_sys_color_dynamic_light_inverse_primary = 2131100120
        const val m3_sys_color_dynamic_light_inverse_surface = 2131100121
        const val m3_sys_color_dynamic_light_on_background = 2131100122
        const val m3_sys_color_dynamic_light_on_primary = 2131100123
        const val m3_sys_color_dynamic_light_on_primary_container = 2131100124
        const val m3_sys_color_dynamic_light_on_secondary = 2131100125
        const val m3_sys_color_dynamic_light_on_secondary_container = 2131100126
        const val m3_sys_color_dynamic_light_on_surface = 2131100127
        const val m3_sys_color_dynamic_light_on_surface_variant = 2131100128
        const val m3_sys_color_dynamic_light_on_tertiary = 2131100129
        const val m3_sys_color_dynamic_light_on_tertiary_container = 2131100130
        const val m3_sys_color_dynamic_light_outline = 2131100131
        const val m3_sys_color_dynamic_light_primary = 2131100132
        const val m3_sys_color_dynamic_light_primary_container = 2131100133
        const val m3_sys_color_dynamic_light_secondary = 2131100134
        const val m3_sys_color_dynamic_light_secondary_container = 2131100135
        const val m3_sys_color_dynamic_light_surface = 2131100136
        const val m3_sys_color_dynamic_light_surface_variant = 2131100137
        const val m3_sys_color_dynamic_light_tertiary = 2131100138
        const val m3_sys_color_dynamic_light_tertiary_container = 2131100139
        const val m3_sys_color_light_background = 2131100140
        const val m3_sys_color_light_error = 2131100141
        const val m3_sys_color_light_error_container = 2131100142
        const val m3_sys_color_light_inverse_on_surface = 2131100143
        const val m3_sys_color_light_inverse_primary = 2131100144
        const val m3_sys_color_light_inverse_surface = 2131100145
        const val m3_sys_color_light_on_background = 2131100146
        const val m3_sys_color_light_on_error = 2131100147
        const val m3_sys_color_light_on_error_container = 2131100148
        const val m3_sys_color_light_on_primary = 2131100149
        const val m3_sys_color_light_on_primary_container = 2131100150
        const val m3_sys_color_light_on_secondary = 2131100151
        const val m3_sys_color_light_on_secondary_container = 2131100152
        const val m3_sys_color_light_on_surface = 2131100153
        const val m3_sys_color_light_on_surface_variant = 2131100154
        const val m3_sys_color_light_on_tertiary = 2131100155
        const val m3_sys_color_light_on_tertiary_container = 2131100156
        const val m3_sys_color_light_outline = 2131100157
        const val m3_sys_color_light_primary = 2131100158
        const val m3_sys_color_light_primary_container = 2131100159
        const val m3_sys_color_light_secondary = 2131100160
        const val m3_sys_color_light_secondary_container = 2131100161
        const val m3_sys_color_light_surface = 2131100162
        const val m3_sys_color_light_surface_variant = 2131100163
        const val m3_sys_color_light_tertiary = 2131100164
        const val m3_sys_color_light_tertiary_container = 2131100165
        const val m3_tabs_icon_color = 2131100166
        const val m3_tabs_ripple_color = 2131100167
        const val m3_text_button_background_color_selector = 2131100168
        const val m3_text_button_foreground_color_selector = 2131100169
        const val m3_text_button_ripple_color_selector = 2131100170
        const val m3_textfield_filled_background_color = 2131100171
        const val m3_textfield_indicator_text_color = 2131100172
        const val m3_textfield_input_text_color = 2131100173
        const val m3_textfield_label_color = 2131100174
        const val m3_textfield_stroke_color = 2131100175
        const val m3_timepicker_button_background_color = 2131100176
        const val m3_timepicker_button_ripple_color = 2131100177
        const val m3_timepicker_button_text_color = 2131100178
        const val m3_timepicker_clock_text_color = 2131100179
        const val m3_timepicker_display_background_color = 2131100180
        const val m3_timepicker_display_ripple_color = 2131100181
        const val m3_timepicker_display_stroke_color = 2131100182
        const val m3_timepicker_display_text_color = 2131100183
        const val m3_timepicker_secondary_text_button_ripple_color = 2131100184
        const val m3_timepicker_secondary_text_button_text_color = 2131100185
        const val m3_tonal_button_ripple_color_selector = 2131100186
        const val material_blue_grey_800 = 2131100187
        const val material_blue_grey_900 = 2131100188
        const val material_blue_grey_950 = 2131100189
        const val material_cursor_color = 2131100190
        const val material_deep_teal_200 = 2131100191
        const val material_deep_teal_500 = 2131100192
        const val material_divider_color = 2131100193
        const val material_dynamic_neutral0 = 2131100194
        const val material_dynamic_neutral10 = 2131100195
        const val material_dynamic_neutral100 = 2131100196
        const val material_dynamic_neutral20 = 2131100197
        const val material_dynamic_neutral30 = 2131100198
        const val material_dynamic_neutral40 = 2131100199
        const val material_dynamic_neutral50 = 2131100200
        const val material_dynamic_neutral60 = 2131100201
        const val material_dynamic_neutral70 = 2131100202
        const val material_dynamic_neutral80 = 2131100203
        const val material_dynamic_neutral90 = 2131100204
        const val material_dynamic_neutral95 = 2131100205
        const val material_dynamic_neutral99 = 2131100206
        const val material_dynamic_neutral_variant0 = 2131100207
        const val material_dynamic_neutral_variant10 = 2131100208
        const val material_dynamic_neutral_variant100 = 2131100209
        const val material_dynamic_neutral_variant20 = 2131100210
        const val material_dynamic_neutral_variant30 = 2131100211
        const val material_dynamic_neutral_variant40 = 2131100212
        const val material_dynamic_neutral_variant50 = 2131100213
        const val material_dynamic_neutral_variant60 = 2131100214
        const val material_dynamic_neutral_variant70 = 2131100215
        const val material_dynamic_neutral_variant80 = 2131100216
        const val material_dynamic_neutral_variant90 = 2131100217
        const val material_dynamic_neutral_variant95 = 2131100218
        const val material_dynamic_neutral_variant99 = 2131100219
        const val material_dynamic_primary0 = 2131100220
        const val material_dynamic_primary10 = 2131100221
        const val material_dynamic_primary100 = 2131100222
        const val material_dynamic_primary20 = 2131100223
        const val material_dynamic_primary30 = 2131100224
        const val material_dynamic_primary40 = 2131100225
        const val material_dynamic_primary50 = 2131100226
        const val material_dynamic_primary60 = 2131100227
        const val material_dynamic_primary70 = 2131100228
        const val material_dynamic_primary80 = 2131100229
        const val material_dynamic_primary90 = 2131100230
        const val material_dynamic_primary95 = 2131100231
        const val material_dynamic_primary99 = 2131100232
        const val material_dynamic_secondary0 = 2131100233
        const val material_dynamic_secondary10 = 2131100234
        const val material_dynamic_secondary100 = 2131100235
        const val material_dynamic_secondary20 = 2131100236
        const val material_dynamic_secondary30 = 2131100237
        const val material_dynamic_secondary40 = 2131100238
        const val material_dynamic_secondary50 = 2131100239
        const val material_dynamic_secondary60 = 2131100240
        const val material_dynamic_secondary70 = 2131100241
        const val material_dynamic_secondary80 = 2131100242
        const val material_dynamic_secondary90 = 2131100243
        const val material_dynamic_secondary95 = 2131100244
        const val material_dynamic_secondary99 = 2131100245
        const val material_dynamic_tertiary0 = 2131100246
        const val material_dynamic_tertiary10 = 2131100247
        const val material_dynamic_tertiary100 = 2131100248
        const val material_dynamic_tertiary20 = 2131100249
        const val material_dynamic_tertiary30 = 2131100250
        const val material_dynamic_tertiary40 = 2131100251
        const val material_dynamic_tertiary50 = 2131100252
        const val material_dynamic_tertiary60 = 2131100253
        const val material_dynamic_tertiary70 = 2131100254
        const val material_dynamic_tertiary80 = 2131100255
        const val material_dynamic_tertiary90 = 2131100256
        const val material_dynamic_tertiary95 = 2131100257
        const val material_dynamic_tertiary99 = 2131100258
        const val material_grey_100 = 2131100259
        const val material_grey_300 = 2131100260
        const val material_grey_50 = 2131100261
        const val material_grey_600 = 2131100262
        const val material_grey_800 = 2131100263
        const val material_grey_850 = 2131100264
        const val material_grey_900 = 2131100265
        const val material_on_background_disabled = 2131100266
        const val material_on_background_emphasis_high_type = 2131100267
        const val material_on_background_emphasis_medium = 2131100268
        const val material_on_primary_disabled = 2131100269
        const val material_on_primary_emphasis_high_type = 2131100270
        const val material_on_primary_emphasis_medium = 2131100271
        const val material_on_surface_disabled = 2131100272
        const val material_on_surface_emphasis_high_type = 2131100273
        const val material_on_surface_emphasis_medium = 2131100274
        const val material_on_surface_stroke = 2131100275
        const val material_slider_active_tick_marks_color = 2131100276
        const val material_slider_active_track_color = 2131100277
        const val material_slider_halo_color = 2131100278
        const val material_slider_inactive_tick_marks_color = 2131100279
        const val material_slider_inactive_track_color = 2131100280
        const val material_slider_thumb_color = 2131100281
        const val material_timepicker_button_background = 2131100282
        const val material_timepicker_button_stroke = 2131100283
        const val material_timepicker_clock_text_color = 2131100284
        const val material_timepicker_clockface = 2131100285
        const val material_timepicker_modebutton_tint = 2131100286
        const val mr_cast_meta_black_scrim = 2131100287
        const val mr_cast_meta_default_background = 2131100288
        const val mr_cast_meta_default_text_color = 2131100289
        const val mr_cast_progressbar_background_dark = 2131100290
        const val mr_cast_progressbar_background_light = 2131100291
        const val mr_cast_progressbar_progress_and_thumb_dark = 2131100292
        const val mr_cast_progressbar_progress_and_thumb_light = 2131100293
        const val mr_cast_route_divider_dark = 2131100294
        const val mr_cast_route_divider_light = 2131100295
        const val mr_dynamic_dialog_background_dark = 2131100296
        const val mr_dynamic_dialog_background_light = 2131100297
        const val mr_dynamic_dialog_header_text_color_dark = 2131100298
        const val mr_dynamic_dialog_header_text_color_light = 2131100299
        const val mr_dynamic_dialog_icon_dark = 2131100300
        const val mr_dynamic_dialog_icon_light = 2131100301
        const val mr_dynamic_dialog_route_text_color_dark = 2131100302
        const val mr_dynamic_dialog_route_text_color_light = 2131100303
        const val mtrl_btn_bg_color_selector = 2131100304
        const val mtrl_btn_ripple_color = 2131100305
        const val mtrl_btn_stroke_color_selector = 2131100306
        const val mtrl_btn_text_btn_bg_color_selector = 2131100307
        const val mtrl_btn_text_btn_ripple_color = 2131100308
        const val mtrl_btn_text_color_disabled = 2131100309
        const val mtrl_btn_text_color_selector = 2131100310
        const val mtrl_btn_transparent_bg_color = 2131100311
        const val mtrl_calendar_item_stroke_color = 2131100312
        const val mtrl_calendar_selected_range = 2131100313
        const val mtrl_card_view_foreground = 2131100314
        const val mtrl_card_view_ripple = 2131100315
        const val mtrl_chip_background_color = 2131100316
        const val mtrl_chip_close_icon_tint = 2131100317
        const val mtrl_chip_surface_color = 2131100318
        const val mtrl_chip_text_color = 2131100319
        const val mtrl_choice_chip_background_color = 2131100320
        const val mtrl_choice_chip_ripple_color = 2131100321
        const val mtrl_choice_chip_text_color = 2131100322
        const val mtrl_error = 2131100323
        const val mtrl_fab_bg_color_selector = 2131100324
        const val mtrl_fab_icon_text_color_selector = 2131100325
        const val mtrl_fab_ripple_color = 2131100326
        const val mtrl_filled_background_color = 2131100327
        const val mtrl_filled_icon_tint = 2131100328
        const val mtrl_filled_stroke_color = 2131100329
        const val mtrl_indicator_text_color = 2131100330
        const val mtrl_navigation_bar_colored_item_tint = 2131100331
        const val mtrl_navigation_bar_colored_ripple_color = 2131100332
        const val mtrl_navigation_bar_item_tint = 2131100333
        const val mtrl_navigation_bar_ripple_color = 2131100334
        const val mtrl_navigation_item_background_color = 2131100335
        const val mtrl_navigation_item_icon_tint = 2131100336
        const val mtrl_navigation_item_text_color = 2131100337
        const val mtrl_on_primary_text_btn_text_color_selector = 2131100338
        const val mtrl_on_surface_ripple_color = 2131100339
        const val mtrl_outlined_icon_tint = 2131100340
        const val mtrl_outlined_stroke_color = 2131100341
        const val mtrl_popupmenu_overlay_color = 2131100342
        const val mtrl_scrim_color = 2131100343
        const val mtrl_tabs_colored_ripple_color = 2131100344
        const val mtrl_tabs_icon_color_selector = 2131100345
        const val mtrl_tabs_icon_color_selector_colored = 2131100346
        const val mtrl_tabs_legacy_text_color_selector = 2131100347
        const val mtrl_tabs_ripple_color = 2131100348
        const val mtrl_text_btn_text_color_selector = 2131100349
        const val mtrl_textinput_default_box_stroke_color = 2131100350
        const val mtrl_textinput_disabled_color = 2131100351
        const val mtrl_textinput_filled_box_default_background_color = 2131100352
        const val mtrl_textinput_focused_box_stroke_color = 2131100353
        const val mtrl_textinput_hovered_box_stroke_color = 2131100354
        const val notification_action_color_filter = 2131100355
        const val notification_icon_bg_color = 2131100356
        const val notification_material_background_media_default_color = 2131100357
        const val player_button_tv = 2131100358
        const val player_on_button_tv = 2131100359
        const val preference_fallback_accent_color = 2131100360
        const val primaryBlackBackground = 2131100361
        const val primaryGrayBackground = 2131100362
        const val primary_dark_material_dark = 2131100363
        const val primary_dark_material_light = 2131100364
        const val primary_material_dark = 2131100365
        const val primary_material_light = 2131100366
        const val primary_text_default_material_dark = 2131100367
        const val primary_text_default_material_light = 2131100368
        const val primary_text_disabled_material_dark = 2131100369
        const val primary_text_disabled_material_light = 2131100370
        const val radiobutton_themeable_attribute_color = 2131100371
        const val ripple_material_dark = 2131100372
        const val ripple_material_light = 2131100373
        const val searchColorTransparent = 2131100374
        const val secondary_text_default_material_dark = 2131100375
        const val secondary_text_default_material_light = 2131100376
        const val secondary_text_disabled_material_dark = 2131100377
        const val secondary_text_disabled_material_light = 2131100378
        const val subColor = 2131100379
        const val subColorBg = 2131100380
        const val switch_thumb_disabled_material_dark = 2131100381
        const val switch_thumb_disabled_material_light = 2131100382
        const val switch_thumb_material_dark = 2131100383
        const val switch_thumb_material_light = 2131100384
        const val switch_thumb_normal_material_dark = 2131100385
        const val switch_thumb_normal_material_light = 2131100386
        const val tag_stroke_color = 2131100387
        const val test_color = 2131100388
        const val test_mtrl_calendar_day = 2131100389
        const val test_mtrl_calendar_day_selected = 2131100390
        const val textColor = 2131100391
        const val text_selection_color = 2131100392
        const val toggle_button = 2131100393
        const val toggle_button_outline = 2131100394
        const val toggle_button_text = 2131100395
        const val toggle_selector = 2131100396
        const val tooltip_background_dark = 2131100397
        const val tooltip_background_light = 2131100398
        const val transparent = 2131100399
        const val typeColor = 2131100400
        const val typeColorBg = 2131100401
        const val unicorn_black = 2131100402
        const val unicorn_black_70 = 2131100403
        const val unicorn_colorAccent = 2131100404
        const val unicorn_colorPrimary = 2131100405
        const val unicorn_colorPrimaryDark = 2131100406
        const val unicorn_grey = 2131100407
        const val unicorn_light_black = 2131100408
        const val unicorn_white = 2131100409
        const val unicorn_white_70 = 2131100410
        const val usedStorageColor = 2131100411
        const val videoProgress = 2131100412
        const val video_button_ripple = 2131100413
        const val video_ripple = 2131100414
        const val white = 2131100415
        const val white_90 = 2131100416
    }

    /* renamed from: com.lagradost.cloudstream3.R$dimen */ /* loaded from: classes3.dex */
    object dimen {
        const val _12dp = 2131165184
        const val _12sp = 2131165185
        const val _20sp = 2131165186
        const val _26sp = 2131165187
        const val _4dp = 2131165188
        const val abc_action_bar_content_inset_material = 2131165189
        const val abc_action_bar_content_inset_with_nav = 2131165190
        const val abc_action_bar_default_height_material = 2131165191
        const val abc_action_bar_default_padding_end_material = 2131165192
        const val abc_action_bar_default_padding_start_material = 2131165193
        const val abc_action_bar_elevation_material = 2131165194
        const val abc_action_bar_icon_vertical_padding_material = 2131165195
        const val abc_action_bar_overflow_padding_end_material = 2131165196
        const val abc_action_bar_overflow_padding_start_material = 2131165197
        const val abc_action_bar_stacked_max_height = 2131165198
        const val abc_action_bar_stacked_tab_max_width = 2131165199
        const val abc_action_bar_subtitle_bottom_margin_material = 2131165200
        const val abc_action_bar_subtitle_top_margin_material = 2131165201
        const val abc_action_button_min_height_material = 2131165202
        const val abc_action_button_min_width_material = 2131165203
        const val abc_action_button_min_width_overflow_material = 2131165204
        const val abc_alert_dialog_button_bar_height = 2131165205
        const val abc_alert_dialog_button_dimen = 2131165206
        const val abc_button_inset_horizontal_material = 2131165207
        const val abc_button_inset_vertical_material = 2131165208
        const val abc_button_padding_horizontal_material = 2131165209
        const val abc_button_padding_vertical_material = 2131165210
        const val abc_cascading_menus_min_smallest_width = 2131165211
        const val abc_config_prefDialogWidth = 2131165212
        const val abc_control_corner_material = 2131165213
        const val abc_control_inset_material = 2131165214
        const val abc_control_padding_material = 2131165215
        const val abc_dialog_corner_radius_material = 2131165216
        const val abc_dialog_fixed_height_major = 2131165217
        const val abc_dialog_fixed_height_minor = 2131165218
        const val abc_dialog_fixed_width_major = 2131165219
        const val abc_dialog_fixed_width_minor = 2131165220
        const val abc_dialog_list_padding_bottom_no_buttons = 2131165221
        const val abc_dialog_list_padding_top_no_title = 2131165222
        const val abc_dialog_min_width_major = 2131165223
        const val abc_dialog_min_width_minor = 2131165224
        const val abc_dialog_padding_material = 2131165225
        const val abc_dialog_padding_top_material = 2131165226
        const val abc_dialog_title_divider_material = 2131165227
        const val abc_disabled_alpha_material_dark = 2131165228
        const val abc_disabled_alpha_material_light = 2131165229
        const val abc_dropdownitem_icon_width = 2131165230
        const val abc_dropdownitem_text_padding_left = 2131165231
        const val abc_dropdownitem_text_padding_right = 2131165232
        const val abc_edit_text_inset_bottom_material = 2131165233
        const val abc_edit_text_inset_horizontal_material = 2131165234
        const val abc_edit_text_inset_top_material = 2131165235
        const val abc_floating_window_z = 2131165236
        const val abc_list_item_height_large_material = 2131165237
        const val abc_list_item_height_material = 2131165238
        const val abc_list_item_height_small_material = 2131165239
        const val abc_list_item_padding_horizontal_material = 2131165240
        const val abc_panel_menu_list_width = 2131165241
        const val abc_progress_bar_height_material = 2131165242
        const val abc_search_view_preferred_height = 2131165243
        const val abc_search_view_preferred_width = 2131165244
        const val abc_seekbar_track_background_height_material = 2131165245
        const val abc_seekbar_track_progress_height_material = 2131165246
        const val abc_select_dialog_padding_start_material = 2131165247
        const val abc_star_big = 2131165248
        const val abc_star_medium = 2131165249
        const val abc_star_small = 2131165250
        const val abc_switch_padding = 2131165251
        const val abc_text_size_body_1_material = 2131165252
        const val abc_text_size_body_2_material = 2131165253
        const val abc_text_size_button_material = 2131165254
        const val abc_text_size_caption_material = 2131165255
        const val abc_text_size_display_1_material = 2131165256
        const val abc_text_size_display_2_material = 2131165257
        const val abc_text_size_display_3_material = 2131165258
        const val abc_text_size_display_4_material = 2131165259
        const val abc_text_size_headline_material = 2131165260
        const val abc_text_size_large_material = 2131165261
        const val abc_text_size_medium_material = 2131165262
        const val abc_text_size_menu_header_material = 2131165263
        const val abc_text_size_menu_material = 2131165264
        const val abc_text_size_small_material = 2131165265
        const val abc_text_size_subhead_material = 2131165266
        const val abc_text_size_subtitle_material_toolbar = 2131165267
        const val abc_text_size_title_material = 2131165268
        const val abc_text_size_title_material_toolbar = 2131165269
        const val action_bar_size = 2131165270
        const val activity_horizontal_margin = 2131165271
        const val activity_vertical_margin = 2131165272
        const val appcompat_dialog_background_inset = 2131165273
        const val applovin_sdk_actionBarHeight = 2131165274
        const val applovin_sdk_adControlButton_height = 2131165275
        const val applovin_sdk_adControlButton_width = 2131165276
        const val applovin_sdk_mediationDebuggerDetailListItemTextSize = 2131165277
        const val applovin_sdk_mediationDebuggerSectionHeight = 2131165278
        const val applovin_sdk_mediationDebuggerSectionTextSize = 2131165279
        const val applovin_sdk_mrec_height = 2131165280
        const val applovin_sdk_mrec_width = 2131165281
        const val banner_height = 2131165282
        const val browser_actions_context_menu_max_width = 2131165283
        const val browser_actions_context_menu_min_padding = 2131165284
        const val card_corner_radius = 2131165285
        const val cardview_compat_inset_shadow = 2131165286
        const val cardview_default_elevation = 2131165287
        const val cardview_default_radius = 2131165288
        const val cast_expanded_controller_ad_background_layout_height = 2131165289
        const val cast_expanded_controller_ad_background_layout_width = 2131165290
        const val cast_expanded_controller_ad_container_layout_height = 2131165291
        const val cast_expanded_controller_ad_label_layout_height = 2131165292
        const val cast_expanded_controller_ad_layout_height = 2131165293
        const val cast_expanded_controller_ad_layout_width = 2131165294
        const val cast_expanded_controller_control_button_margin = 2131165295
        const val cast_expanded_controller_control_toolbar_min_height = 2131165296

        /* renamed from: cast_expanded_controller_margin_between_seek_bar_and_control_buttons */
        const val f9909xa46da72f = 2131165297
        const val cast_expanded_controller_margin_between_status_text_and_seek_bar = 2131165298
        const val cast_expanded_controller_seekbar_disabled_alpha = 2131165299
        const val cast_intro_overlay_button_margin_bottom = 2131165300
        const val cast_intro_overlay_focus_radius = 2131165301
        const val cast_intro_overlay_title_margin_top = 2131165302

        /* renamed from: cast_libraries_material_featurehighlight_center_horizontal_offset */
        const val f9910xd1678993 = 2131165303
        const val cast_libraries_material_featurehighlight_center_threshold = 2131165304
        const val cast_libraries_material_featurehighlight_inner_margin = 2131165305
        const val cast_libraries_material_featurehighlight_inner_radius = 2131165306
        const val cast_libraries_material_featurehighlight_outer_padding = 2131165307
        const val cast_libraries_material_featurehighlight_text_body_size = 2131165308
        const val cast_libraries_material_featurehighlight_text_header_size = 2131165309
        const val cast_libraries_material_featurehighlight_text_horizontal_margin = 2131165310
        const val cast_libraries_material_featurehighlight_text_horizontal_offset = 2131165311
        const val cast_libraries_material_featurehighlight_text_max_width = 2131165312
        const val cast_libraries_material_featurehighlight_text_vertical_space = 2131165313
        const val cast_mini_controller_control_button_margin = 2131165314
        const val cast_mini_controller_icon_height = 2131165315
        const val cast_mini_controller_icon_width = 2131165316
        const val cast_notification_image_size = 2131165317
        const val cast_seek_bar_ad_break_minimum_width = 2131165318
        const val cast_seek_bar_minimum_height = 2131165319
        const val cast_seek_bar_minimum_width = 2131165320
        const val cast_seek_bar_progress_height = 2131165321
        const val cast_seek_bar_thumb_size = 2131165322
        const val cast_tracks_chooser_dialog_no_message_text_size = 2131165323
        const val cast_tracks_chooser_dialog_row_text_size = 2131165324
        const val clock_face_margin_start = 2131165325
        const val com_facebook_auth_dialog_corner_radius = 2131165326
        const val com_facebook_auth_dialog_corner_radius_oversized = 2131165327
        const val com_facebook_button_corner_radius = 2131165328
        const val com_facebook_button_login_corner_radius = 2131165329
        const val com_facebook_likeboxcountview_border_radius = 2131165330
        const val com_facebook_likeboxcountview_border_width = 2131165331
        const val com_facebook_likeboxcountview_caret_height = 2131165332
        const val com_facebook_likeboxcountview_caret_width = 2131165333
        const val com_facebook_likeboxcountview_text_padding = 2131165334
        const val com_facebook_likeboxcountview_text_size = 2131165335
        const val com_facebook_likeview_edge_padding = 2131165336
        const val com_facebook_likeview_internal_padding = 2131165337
        const val com_facebook_likeview_text_size = 2131165338
        const val com_facebook_profilepictureview_preset_size_large = 2131165339
        const val com_facebook_profilepictureview_preset_size_normal = 2131165340
        const val com_facebook_profilepictureview_preset_size_small = 2131165341
        const val compat_button_inset_horizontal_material = 2131165342
        const val compat_button_inset_vertical_material = 2131165343
        const val compat_button_padding_horizontal_material = 2131165344
        const val compat_button_padding_vertical_material = 2131165345
        const val compat_control_corner_material = 2131165346
        const val compat_notification_large_icon_max_height = 2131165347
        const val compat_notification_large_icon_max_width = 2131165348
        const val cpv_color_preference_large = 2131165349
        const val cpv_color_preference_normal = 2131165350
        const val cpv_column_width = 2131165351
        const val cpv_dialog_preview_height = 2131165352
        const val cpv_dialog_preview_width = 2131165353
        const val cpv_item_horizontal_padding = 2131165354
        const val cpv_item_size = 2131165355
        const val cpv_required_padding = 2131165356
        const val def_drawer_elevation = 2131165357
        const val default_dimension = 2131165358
        const val design_appbar_elevation = 2131165359
        const val design_bottom_navigation_active_item_max_width = 2131165360
        const val design_bottom_navigation_active_item_min_width = 2131165361
        const val design_bottom_navigation_active_text_size = 2131165362
        const val design_bottom_navigation_elevation = 2131165363
        const val design_bottom_navigation_height = 2131165364
        const val design_bottom_navigation_icon_size = 2131165365
        const val design_bottom_navigation_item_max_width = 2131165366
        const val design_bottom_navigation_item_min_width = 2131165367
        const val design_bottom_navigation_label_padding = 2131165368
        const val design_bottom_navigation_margin = 2131165369
        const val design_bottom_navigation_shadow_height = 2131165370
        const val design_bottom_navigation_text_size = 2131165371
        const val design_bottom_sheet_elevation = 2131165372
        const val design_bottom_sheet_modal_elevation = 2131165373
        const val design_bottom_sheet_peek_height_min = 2131165374
        const val design_fab_border_width = 2131165375
        const val design_fab_elevation = 2131165376
        const val design_fab_image_size = 2131165377
        const val design_fab_size_mini = 2131165378
        const val design_fab_size_normal = 2131165379
        const val design_fab_translation_z_hovered_focused = 2131165380
        const val design_fab_translation_z_pressed = 2131165381
        const val design_navigation_elevation = 2131165382
        const val design_navigation_icon_padding = 2131165383
        const val design_navigation_icon_size = 2131165384
        const val design_navigation_item_horizontal_padding = 2131165385
        const val design_navigation_item_icon_padding = 2131165386
        const val design_navigation_item_vertical_padding = 2131165387
        const val design_navigation_max_width = 2131165388
        const val design_navigation_padding_bottom = 2131165389
        const val design_navigation_separator_vertical_padding = 2131165390
        const val design_snackbar_action_inline_max_width = 2131165391
        const val design_snackbar_action_text_color_alpha = 2131165392
        const val design_snackbar_background_corner_radius = 2131165393
        const val design_snackbar_elevation = 2131165394
        const val design_snackbar_extra_spacing_horizontal = 2131165395
        const val design_snackbar_max_width = 2131165396
        const val design_snackbar_min_width = 2131165397
        const val design_snackbar_padding_horizontal = 2131165398
        const val design_snackbar_padding_vertical = 2131165399
        const val design_snackbar_padding_vertical_2lines = 2131165400
        const val design_snackbar_text_size = 2131165401
        const val design_tab_max_width = 2131165402
        const val design_tab_scrollable_min_width = 2131165403
        const val design_tab_text_size = 2131165404
        const val design_tab_text_size_2line = 2131165405
        const val design_textinput_caption_translate_y = 2131165406
        const val disabled_alpha_material_dark = 2131165407
        const val disabled_alpha_material_light = 2131165408
        const val dp_16 = 2131165409
        const val dp_4 = 2131165410
        const val exo_error_message_height = 2131165411
        const val exo_error_message_margin_bottom = 2131165412
        const val exo_error_message_text_padding_horizontal = 2131165413
        const val exo_error_message_text_padding_vertical = 2131165414
        const val exo_error_message_text_size = 2131165415
        const val exo_icon_horizontal_margin = 2131165416
        const val exo_icon_padding = 2131165417
        const val exo_icon_padding_bottom = 2131165418
        const val exo_icon_size = 2131165419
        const val exo_icon_text_size = 2131165420
        const val exo_media_button_height = 2131165421
        const val exo_media_button_width = 2131165422
        const val exo_setting_width = 2131165423
        const val exo_settings_height = 2131165424
        const val exo_settings_icon_size = 2131165425
        const val exo_settings_main_text_size = 2131165426
        const val exo_settings_offset = 2131165427
        const val exo_settings_sub_text_size = 2131165428
        const val exo_settings_text_height = 2131165429
        const val exo_small_icon_height = 2131165430
        const val exo_small_icon_horizontal_margin = 2131165431
        const val exo_small_icon_padding_horizontal = 2131165432
        const val exo_small_icon_padding_vertical = 2131165433
        const val exo_small_icon_width = 2131165434
        const val exo_styled_bottom_bar_height = 2131165435
        const val exo_styled_bottom_bar_margin_top = 2131165436
        const val exo_styled_bottom_bar_time_padding = 2131165437
        const val exo_styled_controls_padding = 2131165438
        const val exo_styled_minimal_controls_margin_bottom = 2131165439
        const val exo_styled_progress_bar_height = 2131165440
        const val exo_styled_progress_dragged_thumb_size = 2131165441
        const val exo_styled_progress_enabled_thumb_size = 2131165442
        const val exo_styled_progress_layout_height = 2131165443
        const val exo_styled_progress_margin_bottom = 2131165444
        const val exo_styled_progress_touch_target_height = 2131165445
        const val fastscroll_default_thickness = 2131165446
        const val fastscroll_margin = 2131165447
        const val fastscroll_minimum_range = 2131165448
        const val header_margin_top = 2131165449
        const val highlight_alpha_material_colored = 2131165450
        const val highlight_alpha_material_dark = 2131165451
        const val highlight_alpha_material_light = 2131165452
        const val hint_alpha_material_dark = 2131165453
        const val hint_alpha_material_light = 2131165454
        const val hint_pressed_alpha_material_dark = 2131165455
        const val hint_pressed_alpha_material_light = 2131165456
        const val item_touch_helper_max_drag_scroll_per_frame = 2131165457
        const val item_touch_helper_swipe_escape_max_velocity = 2131165458
        const val item_touch_helper_swipe_escape_velocity = 2131165459
        const val loading_line_height = 2131165460
        const val loading_margin = 2131165461
        const val loading_radius = 2131165462
        const val m3_alert_dialog_action_bottom_padding = 2131165463
        const val m3_alert_dialog_action_top_padding = 2131165464
        const val m3_alert_dialog_corner_size = 2131165465
        const val m3_alert_dialog_elevation = 2131165466
        const val m3_alert_dialog_icon_margin = 2131165467
        const val m3_alert_dialog_icon_size = 2131165468
        const val m3_alert_dialog_title_bottom_margin = 2131165469
        const val m3_appbar_expanded_title_margin_bottom = 2131165470
        const val m3_appbar_expanded_title_margin_horizontal = 2131165471
        const val m3_appbar_scrim_height_trigger = 2131165472
        const val m3_appbar_scrim_height_trigger_large = 2131165473
        const val m3_appbar_scrim_height_trigger_medium = 2131165474
        const val m3_appbar_size_compact = 2131165475
        const val m3_appbar_size_large = 2131165476
        const val m3_appbar_size_medium = 2131165477
        const val m3_badge_horizontal_offset = 2131165478
        const val m3_badge_radius = 2131165479
        const val m3_badge_vertical_offset = 2131165480
        const val m3_badge_with_text_horizontal_offset = 2131165481
        const val m3_badge_with_text_radius = 2131165482
        const val m3_badge_with_text_vertical_offset = 2131165483
        const val m3_bottom_nav_item_active_indicator_height = 2131165484
        const val m3_bottom_nav_item_active_indicator_margin_horizontal = 2131165485
        const val m3_bottom_nav_item_active_indicator_width = 2131165486
        const val m3_bottom_nav_item_padding_bottom = 2131165487
        const val m3_bottom_nav_item_padding_top = 2131165488
        const val m3_bottom_nav_min_height = 2131165489
        const val m3_bottom_sheet_elevation = 2131165490
        const val m3_bottom_sheet_modal_elevation = 2131165491
        const val m3_bottomappbar_fab_cradle_margin = 2131165492
        const val m3_bottomappbar_fab_cradle_rounded_corner_radius = 2131165493
        const val m3_bottomappbar_fab_cradle_vertical_offset = 2131165494
        const val m3_btn_dialog_btn_min_width = 2131165495
        const val m3_btn_dialog_btn_spacing = 2131165496
        const val m3_btn_disabled_elevation = 2131165497
        const val m3_btn_disabled_translation_z = 2131165498
        const val m3_btn_elevated_btn_elevation = 2131165499
        const val m3_btn_elevation = 2131165500
        const val m3_btn_icon_btn_padding_left = 2131165501
        const val m3_btn_icon_btn_padding_right = 2131165502
        const val m3_btn_icon_only_default_padding = 2131165503
        const val m3_btn_icon_only_default_size = 2131165504
        const val m3_btn_icon_only_icon_padding = 2131165505
        const val m3_btn_icon_only_min_width = 2131165506
        const val m3_btn_inset = 2131165507
        const val m3_btn_max_width = 2131165508
        const val m3_btn_padding_bottom = 2131165509
        const val m3_btn_padding_left = 2131165510
        const val m3_btn_padding_right = 2131165511
        const val m3_btn_padding_top = 2131165512
        const val m3_btn_stroke_size = 2131165513
        const val m3_btn_text_btn_icon_padding_left = 2131165514
        const val m3_btn_text_btn_icon_padding_right = 2131165515
        const val m3_btn_text_btn_padding_left = 2131165516
        const val m3_btn_text_btn_padding_right = 2131165517
        const val m3_btn_translation_z_base = 2131165518
        const val m3_btn_translation_z_hovered = 2131165519
        const val m3_card_dragged_z = 2131165520
        const val m3_card_elevated_dragged_z = 2131165521
        const val m3_card_elevated_elevation = 2131165522
        const val m3_card_elevated_hovered_z = 2131165523
        const val m3_card_elevation = 2131165524
        const val m3_card_hovered_z = 2131165525
        const val m3_card_stroke_width = 2131165526
        const val m3_chip_checked_hovered_translation_z = 2131165527
        const val m3_chip_corner_size = 2131165528
        const val m3_chip_disabled_translation_z = 2131165529
        const val m3_chip_dragged_translation_z = 2131165530
        const val m3_chip_elevated_elevation = 2131165531
        const val m3_chip_hovered_translation_z = 2131165532
        const val m3_chip_icon_size = 2131165533
        const val m3_datepicker_elevation = 2131165534
        const val m3_divider_heavy_thickness = 2131165535
        const val m3_extended_fab_bottom_padding = 2131165536
        const val m3_extended_fab_end_padding = 2131165537
        const val m3_extended_fab_icon_padding = 2131165538
        const val m3_extended_fab_min_height = 2131165539
        const val m3_extended_fab_start_padding = 2131165540
        const val m3_extended_fab_top_padding = 2131165541
        const val m3_fab_border_width = 2131165542
        const val m3_fab_corner_size = 2131165543
        const val m3_fab_translation_z_hovered_focused = 2131165544
        const val m3_fab_translation_z_pressed = 2131165545
        const val m3_large_fab_max_image_size = 2131165546
        const val m3_large_fab_size = 2131165547
        const val m3_menu_elevation = 2131165548
        const val m3_navigation_drawer_layout_corner_size = 2131165549
        const val m3_navigation_item_horizontal_padding = 2131165550
        const val m3_navigation_item_icon_padding = 2131165551
        const val m3_navigation_item_shape_inset_bottom = 2131165552
        const val m3_navigation_item_shape_inset_end = 2131165553
        const val m3_navigation_item_shape_inset_start = 2131165554
        const val m3_navigation_item_shape_inset_top = 2131165555
        const val m3_navigation_item_vertical_padding = 2131165556
        const val m3_navigation_menu_divider_horizontal_padding = 2131165557
        const val m3_navigation_menu_headline_horizontal_padding = 2131165558
        const val m3_navigation_rail_default_width = 2131165559
        const val m3_navigation_rail_item_active_indicator_height = 2131165560
        const val m3_navigation_rail_item_active_indicator_margin_horizontal = 2131165561
        const val m3_navigation_rail_item_active_indicator_width = 2131165562
        const val m3_navigation_rail_item_min_height = 2131165563
        const val m3_navigation_rail_item_padding_bottom = 2131165564
        const val m3_navigation_rail_item_padding_top = 2131165565
        const val m3_ripple_default_alpha = 2131165566
        const val m3_ripple_focused_alpha = 2131165567
        const val m3_ripple_hovered_alpha = 2131165568
        const val m3_ripple_pressed_alpha = 2131165569
        const val m3_ripple_selectable_pressed_alpha = 2131165570
        const val m3_slider_thumb_elevation = 2131165571
        const val m3_snackbar_action_text_color_alpha = 2131165572
        const val m3_snackbar_margin = 2131165573
        const val m3_sys_elevation_level0 = 2131165574
        const val m3_sys_elevation_level1 = 2131165575
        const val m3_sys_elevation_level2 = 2131165576
        const val m3_sys_elevation_level3 = 2131165577
        const val m3_sys_elevation_level4 = 2131165578
        const val m3_sys_elevation_level5 = 2131165579
        const val m3_sys_shape_large_corner_size = 2131165580
        const val m3_sys_shape_medium_corner_size = 2131165581
        const val m3_sys_shape_small_corner_size = 2131165582
        const val m3_sys_state_dragged_state_layer_opacity = 2131165583
        const val m3_sys_state_focus_state_layer_opacity = 2131165584
        const val m3_sys_state_hover_state_layer_opacity = 2131165585
        const val m3_sys_state_pressed_state_layer_opacity = 2131165586
        const val m3_sys_typescale_body_large_letter_spacing = 2131165587
        const val m3_sys_typescale_body_large_text_size = 2131165588
        const val m3_sys_typescale_body_medium_letter_spacing = 2131165589
        const val m3_sys_typescale_body_medium_text_size = 2131165590
        const val m3_sys_typescale_body_small_letter_spacing = 2131165591
        const val m3_sys_typescale_body_small_text_size = 2131165592
        const val m3_sys_typescale_display_large_letter_spacing = 2131165593
        const val m3_sys_typescale_display_large_text_size = 2131165594
        const val m3_sys_typescale_display_medium_letter_spacing = 2131165595
        const val m3_sys_typescale_display_medium_text_size = 2131165596
        const val m3_sys_typescale_display_small_letter_spacing = 2131165597
        const val m3_sys_typescale_display_small_text_size = 2131165598
        const val m3_sys_typescale_headline_large_letter_spacing = 2131165599
        const val m3_sys_typescale_headline_large_text_size = 2131165600
        const val m3_sys_typescale_headline_medium_letter_spacing = 2131165601
        const val m3_sys_typescale_headline_medium_text_size = 2131165602
        const val m3_sys_typescale_headline_small_letter_spacing = 2131165603
        const val m3_sys_typescale_headline_small_text_size = 2131165604
        const val m3_sys_typescale_label_large_letter_spacing = 2131165605
        const val m3_sys_typescale_label_large_text_size = 2131165606
        const val m3_sys_typescale_label_medium_letter_spacing = 2131165607
        const val m3_sys_typescale_label_medium_text_size = 2131165608
        const val m3_sys_typescale_label_small_letter_spacing = 2131165609
        const val m3_sys_typescale_label_small_text_size = 2131165610
        const val m3_sys_typescale_title_large_letter_spacing = 2131165611
        const val m3_sys_typescale_title_large_text_size = 2131165612
        const val m3_sys_typescale_title_medium_letter_spacing = 2131165613
        const val m3_sys_typescale_title_medium_text_size = 2131165614
        const val m3_sys_typescale_title_small_letter_spacing = 2131165615
        const val m3_sys_typescale_title_small_text_size = 2131165616
        const val m3_timepicker_display_stroke_width = 2131165617
        const val m3_timepicker_window_elevation = 2131165618
        const val margin_bottom_btn_home = 2131165619
        const val margin_bottom_filter_blur = 2131165620
        const val margin_top_filter_blur = 2131165621
        const val material_bottom_sheet_max_width = 2131165622
        const val material_clock_display_padding = 2131165623
        const val material_clock_face_margin_top = 2131165624
        const val material_clock_hand_center_dot_radius = 2131165625
        const val material_clock_hand_padding = 2131165626
        const val material_clock_hand_stroke_width = 2131165627
        const val material_clock_number_text_size = 2131165628
        const val material_clock_period_toggle_height = 2131165629
        const val material_clock_period_toggle_margin_left = 2131165630
        const val material_clock_period_toggle_width = 2131165631
        const val material_clock_size = 2131165632
        const val material_cursor_inset_bottom = 2131165633
        const val material_cursor_inset_top = 2131165634
        const val material_cursor_width = 2131165635
        const val material_divider_thickness = 2131165636
        const val material_emphasis_disabled = 2131165637
        const val material_emphasis_disabled_background = 2131165638
        const val material_emphasis_high_type = 2131165639
        const val material_emphasis_medium = 2131165640
        const val material_filled_edittext_font_1_3_padding_bottom = 2131165641
        const val material_filled_edittext_font_1_3_padding_top = 2131165642
        const val material_filled_edittext_font_2_0_padding_bottom = 2131165643
        const val material_filled_edittext_font_2_0_padding_top = 2131165644
        const val material_font_1_3_box_collapsed_padding_top = 2131165645
        const val material_font_2_0_box_collapsed_padding_top = 2131165646
        const val material_helper_text_default_padding_top = 2131165647
        const val material_helper_text_font_1_3_padding_horizontal = 2131165648
        const val material_helper_text_font_1_3_padding_top = 2131165649
        const val material_input_text_to_prefix_suffix_padding = 2131165650
        const val material_text_view_test_line_height = 2131165651
        const val material_text_view_test_line_height_override = 2131165652
        const val material_textinput_default_width = 2131165653
        const val material_textinput_max_width = 2131165654
        const val material_textinput_min_width = 2131165655
        const val material_time_picker_minimum_screen_height = 2131165656
        const val material_time_picker_minimum_screen_width = 2131165657
        const val material_timepicker_dialog_buttons_margin_top = 2131165658
        const val mr_cast_group_volume_seekbar_height = 2131165659
        const val mr_cast_meta_art_size = 2131165660
        const val mr_cast_meta_subtitle_text_size = 2131165661
        const val mr_cast_route_volume_seekbar_height = 2131165662
        const val mr_cast_seekbar_thumb_size = 2131165663
        const val mr_controller_volume_group_list_item_height = 2131165664
        const val mr_controller_volume_group_list_item_icon_size = 2131165665
        const val mr_controller_volume_group_list_max_height = 2131165666
        const val mr_controller_volume_group_list_padding_top = 2131165667
        const val mr_dialog_fixed_width_major = 2131165668
        const val mr_dialog_fixed_width_minor = 2131165669
        const val mr_dynamic_dialog_header_text_size = 2131165670
        const val mr_dynamic_dialog_route_text_size = 2131165671
        const val mr_dynamic_dialog_row_height = 2131165672
        const val mr_dynamic_volume_group_list_item_height = 2131165673
        const val mtrl_alert_dialog_background_inset_bottom = 2131165674
        const val mtrl_alert_dialog_background_inset_end = 2131165675
        const val mtrl_alert_dialog_background_inset_start = 2131165676
        const val mtrl_alert_dialog_background_inset_top = 2131165677
        const val mtrl_alert_dialog_picker_background_inset = 2131165678
        const val mtrl_badge_horizontal_edge_offset = 2131165679
        const val mtrl_badge_long_text_horizontal_padding = 2131165680
        const val mtrl_badge_radius = 2131165681
        const val mtrl_badge_text_horizontal_edge_offset = 2131165682
        const val mtrl_badge_text_size = 2131165683
        const val mtrl_badge_toolbar_action_menu_item_horizontal_offset = 2131165684
        const val mtrl_badge_toolbar_action_menu_item_vertical_offset = 2131165685
        const val mtrl_badge_with_text_radius = 2131165686
        const val mtrl_bottomappbar_fabOffsetEndMode = 2131165687
        const val mtrl_bottomappbar_fab_bottom_margin = 2131165688
        const val mtrl_bottomappbar_fab_cradle_margin = 2131165689
        const val mtrl_bottomappbar_fab_cradle_rounded_corner_radius = 2131165690
        const val mtrl_bottomappbar_fab_cradle_vertical_offset = 2131165691
        const val mtrl_bottomappbar_height = 2131165692
        const val mtrl_btn_corner_radius = 2131165693
        const val mtrl_btn_dialog_btn_min_width = 2131165694
        const val mtrl_btn_disabled_elevation = 2131165695
        const val mtrl_btn_disabled_z = 2131165696
        const val mtrl_btn_elevation = 2131165697
        const val mtrl_btn_focused_z = 2131165698
        const val mtrl_btn_hovered_z = 2131165699
        const val mtrl_btn_icon_btn_padding_left = 2131165700
        const val mtrl_btn_icon_padding = 2131165701
        const val mtrl_btn_inset = 2131165702
        const val mtrl_btn_letter_spacing = 2131165703
        const val mtrl_btn_max_width = 2131165704
        const val mtrl_btn_padding_bottom = 2131165705
        const val mtrl_btn_padding_left = 2131165706
        const val mtrl_btn_padding_right = 2131165707
        const val mtrl_btn_padding_top = 2131165708
        const val mtrl_btn_pressed_z = 2131165709
        const val mtrl_btn_snackbar_margin_horizontal = 2131165710
        const val mtrl_btn_stroke_size = 2131165711
        const val mtrl_btn_text_btn_icon_padding = 2131165712
        const val mtrl_btn_text_btn_padding_left = 2131165713
        const val mtrl_btn_text_btn_padding_right = 2131165714
        const val mtrl_btn_text_size = 2131165715
        const val mtrl_btn_z = 2131165716
        const val mtrl_calendar_action_confirm_button_min_width = 2131165717
        const val mtrl_calendar_action_height = 2131165718
        const val mtrl_calendar_action_padding = 2131165719
        const val mtrl_calendar_bottom_padding = 2131165720
        const val mtrl_calendar_content_padding = 2131165721
        const val mtrl_calendar_day_corner = 2131165722
        const val mtrl_calendar_day_height = 2131165723
        const val mtrl_calendar_day_horizontal_padding = 2131165724
        const val mtrl_calendar_day_today_stroke = 2131165725
        const val mtrl_calendar_day_vertical_padding = 2131165726
        const val mtrl_calendar_day_width = 2131165727
        const val mtrl_calendar_days_of_week_height = 2131165728
        const val mtrl_calendar_dialog_background_inset = 2131165729
        const val mtrl_calendar_header_content_padding = 2131165730
        const val mtrl_calendar_header_content_padding_fullscreen = 2131165731
        const val mtrl_calendar_header_divider_thickness = 2131165732
        const val mtrl_calendar_header_height = 2131165733
        const val mtrl_calendar_header_height_fullscreen = 2131165734
        const val mtrl_calendar_header_selection_line_height = 2131165735
        const val mtrl_calendar_header_text_padding = 2131165736
        const val mtrl_calendar_header_toggle_margin_bottom = 2131165737
        const val mtrl_calendar_header_toggle_margin_top = 2131165738
        const val mtrl_calendar_landscape_header_width = 2131165739
        const val mtrl_calendar_maximum_default_fullscreen_minor_axis = 2131165740
        const val mtrl_calendar_month_horizontal_padding = 2131165741
        const val mtrl_calendar_month_vertical_padding = 2131165742
        const val mtrl_calendar_navigation_bottom_padding = 2131165743
        const val mtrl_calendar_navigation_height = 2131165744
        const val mtrl_calendar_navigation_top_padding = 2131165745
        const val mtrl_calendar_pre_l_text_clip_padding = 2131165746
        const val mtrl_calendar_selection_baseline_to_top_fullscreen = 2131165747
        const val mtrl_calendar_selection_text_baseline_to_bottom = 2131165748
        const val mtrl_calendar_selection_text_baseline_to_bottom_fullscreen = 2131165749
        const val mtrl_calendar_selection_text_baseline_to_top = 2131165750
        const val mtrl_calendar_text_input_padding_top = 2131165751
        const val mtrl_calendar_title_baseline_to_top = 2131165752
        const val mtrl_calendar_title_baseline_to_top_fullscreen = 2131165753
        const val mtrl_calendar_year_corner = 2131165754
        const val mtrl_calendar_year_height = 2131165755
        const val mtrl_calendar_year_horizontal_padding = 2131165756
        const val mtrl_calendar_year_vertical_padding = 2131165757
        const val mtrl_calendar_year_width = 2131165758
        const val mtrl_card_checked_icon_margin = 2131165759
        const val mtrl_card_checked_icon_size = 2131165760
        const val mtrl_card_corner_radius = 2131165761
        const val mtrl_card_dragged_z = 2131165762
        const val mtrl_card_elevation = 2131165763
        const val mtrl_card_spacing = 2131165764
        const val mtrl_chip_pressed_translation_z = 2131165765
        const val mtrl_chip_text_size = 2131165766
        const val mtrl_edittext_rectangle_top_offset = 2131165767
        const val mtrl_exposed_dropdown_menu_popup_elevation = 2131165768
        const val mtrl_exposed_dropdown_menu_popup_vertical_offset = 2131165769
        const val mtrl_exposed_dropdown_menu_popup_vertical_padding = 2131165770
        const val mtrl_extended_fab_bottom_padding = 2131165771
        const val mtrl_extended_fab_corner_radius = 2131165772
        const val mtrl_extended_fab_disabled_elevation = 2131165773
        const val mtrl_extended_fab_disabled_translation_z = 2131165774
        const val mtrl_extended_fab_elevation = 2131165775
        const val mtrl_extended_fab_end_padding = 2131165776
        const val mtrl_extended_fab_end_padding_icon = 2131165777
        const val mtrl_extended_fab_icon_size = 2131165778
        const val mtrl_extended_fab_icon_text_spacing = 2131165779
        const val mtrl_extended_fab_min_height = 2131165780
        const val mtrl_extended_fab_min_width = 2131165781
        const val mtrl_extended_fab_start_padding = 2131165782
        const val mtrl_extended_fab_start_padding_icon = 2131165783
        const val mtrl_extended_fab_top_padding = 2131165784
        const val mtrl_extended_fab_translation_z_base = 2131165785
        const val mtrl_extended_fab_translation_z_hovered_focused = 2131165786
        const val mtrl_extended_fab_translation_z_pressed = 2131165787
        const val mtrl_fab_elevation = 2131165788
        const val mtrl_fab_min_touch_target = 2131165789
        const val mtrl_fab_translation_z_hovered_focused = 2131165790
        const val mtrl_fab_translation_z_pressed = 2131165791
        const val mtrl_high_ripple_default_alpha = 2131165792
        const val mtrl_high_ripple_focused_alpha = 2131165793
        const val mtrl_high_ripple_hovered_alpha = 2131165794
        const val mtrl_high_ripple_pressed_alpha = 2131165795
        const val mtrl_large_touch_target = 2131165796
        const val mtrl_low_ripple_default_alpha = 2131165797
        const val mtrl_low_ripple_focused_alpha = 2131165798
        const val mtrl_low_ripple_hovered_alpha = 2131165799
        const val mtrl_low_ripple_pressed_alpha = 2131165800
        const val mtrl_min_touch_target_size = 2131165801
        const val mtrl_navigation_bar_item_default_icon_size = 2131165802
        const val mtrl_navigation_bar_item_default_margin = 2131165803
        const val mtrl_navigation_elevation = 2131165804
        const val mtrl_navigation_item_horizontal_padding = 2131165805
        const val mtrl_navigation_item_icon_padding = 2131165806
        const val mtrl_navigation_item_icon_size = 2131165807
        const val mtrl_navigation_item_shape_horizontal_margin = 2131165808
        const val mtrl_navigation_item_shape_vertical_margin = 2131165809
        const val mtrl_navigation_rail_active_text_size = 2131165810
        const val mtrl_navigation_rail_compact_width = 2131165811
        const val mtrl_navigation_rail_default_width = 2131165812
        const val mtrl_navigation_rail_elevation = 2131165813
        const val mtrl_navigation_rail_icon_margin = 2131165814
        const val mtrl_navigation_rail_icon_size = 2131165815
        const val mtrl_navigation_rail_margin = 2131165816
        const val mtrl_navigation_rail_text_bottom_margin = 2131165817
        const val mtrl_navigation_rail_text_size = 2131165818
        const val mtrl_progress_circular_inset = 2131165819
        const val mtrl_progress_circular_inset_extra_small = 2131165820
        const val mtrl_progress_circular_inset_medium = 2131165821
        const val mtrl_progress_circular_inset_small = 2131165822
        const val mtrl_progress_circular_radius = 2131165823
        const val mtrl_progress_circular_size = 2131165824
        const val mtrl_progress_circular_size_extra_small = 2131165825
        const val mtrl_progress_circular_size_medium = 2131165826
        const val mtrl_progress_circular_size_small = 2131165827
        const val mtrl_progress_circular_track_thickness_extra_small = 2131165828
        const val mtrl_progress_circular_track_thickness_medium = 2131165829
        const val mtrl_progress_circular_track_thickness_small = 2131165830
        const val mtrl_progress_indicator_full_rounded_corner_radius = 2131165831
        const val mtrl_progress_track_thickness = 2131165832
        const val mtrl_shape_corner_size_large_component = 2131165833
        const val mtrl_shape_corner_size_medium_component = 2131165834
        const val mtrl_shape_corner_size_small_component = 2131165835
        const val mtrl_slider_halo_radius = 2131165836
        const val mtrl_slider_label_padding = 2131165837
        const val mtrl_slider_label_radius = 2131165838
        const val mtrl_slider_label_square_side = 2131165839
        const val mtrl_slider_thumb_elevation = 2131165840
        const val mtrl_slider_thumb_radius = 2131165841
        const val mtrl_slider_track_height = 2131165842
        const val mtrl_slider_track_side_padding = 2131165843
        const val mtrl_slider_track_top = 2131165844
        const val mtrl_slider_widget_height = 2131165845
        const val mtrl_snackbar_action_text_color_alpha = 2131165846
        const val mtrl_snackbar_background_corner_radius = 2131165847
        const val mtrl_snackbar_background_overlay_color_alpha = 2131165848
        const val mtrl_snackbar_margin = 2131165849
        const val mtrl_snackbar_message_margin_horizontal = 2131165850
        const val mtrl_snackbar_padding_horizontal = 2131165851
        const val mtrl_switch_thumb_elevation = 2131165852
        const val mtrl_textinput_box_corner_radius_medium = 2131165853
        const val mtrl_textinput_box_corner_radius_small = 2131165854
        const val mtrl_textinput_box_label_cutout_padding = 2131165855
        const val mtrl_textinput_box_stroke_width_default = 2131165856
        const val mtrl_textinput_box_stroke_width_focused = 2131165857
        const val mtrl_textinput_counter_margin_start = 2131165858
        const val mtrl_textinput_end_icon_margin_start = 2131165859
        const val mtrl_textinput_outline_box_expanded_padding = 2131165860
        const val mtrl_textinput_start_icon_margin_end = 2131165861
        const val mtrl_toolbar_default_height = 2131165862
        const val mtrl_tooltip_arrowSize = 2131165863
        const val mtrl_tooltip_cornerSize = 2131165864
        const val mtrl_tooltip_minHeight = 2131165865
        const val mtrl_tooltip_minWidth = 2131165866
        const val mtrl_tooltip_padding = 2131165867
        const val mtrl_transition_shared_axis_slide_distance = 2131165868
        const val navbar_height = 2131165869
        const val notification_action_icon_size = 2131165870
        const val notification_action_text_size = 2131165871
        const val notification_big_circle_margin = 2131165872
        const val notification_content_margin_start = 2131165873
        const val notification_large_icon_height = 2131165874
        const val notification_large_icon_width = 2131165875
        const val notification_main_column_padding_top = 2131165876
        const val notification_media_narrow_margin = 2131165877
        const val notification_right_icon_size = 2131165878
        const val notification_right_side_padding_top = 2131165879
        const val notification_small_icon_background_padding = 2131165880
        const val notification_small_icon_size_as_large = 2131165881
        const val notification_subtext_size = 2131165882
        const val notification_top_pad = 2131165883
        const val notification_top_pad_large_text = 2131165884
        const val overlapping_panels_center_panel_non_resting_elevation = 2131165885
        const val overlapping_panels_closed_center_panel_visible_width = 2131165886
        const val overlapping_panels_home_gesture_from_bottom_threshold = 2131165887
        const val overlapping_panels_margin_between_panels = 2131165888
        const val overlapping_panels_min_fling_dp_per_second = 2131165889
        const val overlapping_panels_scroll_slop = 2131165890
        const val preference_dropdown_padding_start = 2131165891
        const val preference_icon_minWidth = 2131165892
        const val preference_seekbar_padding_horizontal = 2131165893
        const val preference_seekbar_padding_vertical = 2131165894
        const val preference_seekbar_value_minWidth = 2131165895
        const val result_padding = 2131165896
        const val rounded_image_radius = 2131165897
        const val size_header = 2131165898
        const val size_header_shadow = 2131165899
        const val size_header_shadow_result = 2131165900
        const val size_poster_result = 2131165901
        const val size_watch_movie_w = 2131165902
        const val sliding_pane_detail_pane_width = 2131165903
        const val test_dimen = 2131165904
        const val test_mtrl_calendar_day_cornerSize = 2131165905
        const val test_navigation_bar_active_item_max_width = 2131165906
        const val test_navigation_bar_active_item_min_width = 2131165907
        const val test_navigation_bar_active_text_size = 2131165908
        const val test_navigation_bar_elevation = 2131165909
        const val test_navigation_bar_height = 2131165910
        const val test_navigation_bar_icon_size = 2131165911
        const val test_navigation_bar_item_max_width = 2131165912
        const val test_navigation_bar_item_min_width = 2131165913
        const val test_navigation_bar_label_padding = 2131165914
        const val test_navigation_bar_shadow_height = 2131165915
        const val test_navigation_bar_text_size = 2131165916
        const val textandiconmargin = 2131165917
        const val tooltip_corner_radius = 2131165918
        const val tooltip_horizontal_padding = 2131165919
        const val tooltip_margin = 2131165920
        const val tooltip_precise_anchor_extra_offset = 2131165921
        const val tooltip_precise_anchor_threshold = 2131165922
        const val tooltip_vertical_padding = 2131165923
        const val tooltip_y_offset_non_touch = 2131165924
        const val tooltip_y_offset_touch = 2131165925
    }

    /* renamed from: com.lagradost.cloudstream3.R$drawable */ /* loaded from: classes3.dex */
    object C4763drawable {
        const val abc_ab_share_pack_mtrl_alpha = 2131230899
        const val abc_action_bar_item_background_material = 2131230900
        const val abc_btn_borderless_material = 2131230901
        const val abc_btn_check_material = 2131230902
        const val abc_btn_check_material_anim = 2131230903
        const val abc_btn_check_to_on_mtrl_000 = 2131230904
        const val abc_btn_check_to_on_mtrl_015 = 2131230905
        const val abc_btn_colored_material = 2131230906
        const val abc_btn_default_mtrl_shape = 2131230907
        const val abc_btn_radio_material = 2131230908
        const val abc_btn_radio_material_anim = 2131230909
        const val abc_btn_radio_to_on_mtrl_000 = 2131230910
        const val abc_btn_radio_to_on_mtrl_015 = 2131230911
        const val abc_btn_switch_to_on_mtrl_00001 = 2131230912
        const val abc_btn_switch_to_on_mtrl_00012 = 2131230913
        const val abc_cab_background_internal_bg = 2131230914
        const val abc_cab_background_top_material = 2131230915
        const val abc_cab_background_top_mtrl_alpha = 2131230916
        const val abc_control_background_material = 2131230917
        const val abc_dialog_material_background = 2131230918
        const val abc_edit_text_material = 2131230919
        const val abc_ic_ab_back_material = 2131230920
        const val abc_ic_arrow_drop_right_black_24dp = 2131230921
        const val abc_ic_clear_material = 2131230922
        const val abc_ic_commit_search_api_mtrl_alpha = 2131230923
        const val abc_ic_go_search_api_material = 2131230924
        const val abc_ic_menu_copy_mtrl_am_alpha = 2131230925
        const val abc_ic_menu_cut_mtrl_alpha = 2131230926
        const val abc_ic_menu_overflow_material = 2131230927
        const val abc_ic_menu_paste_mtrl_am_alpha = 2131230928
        const val abc_ic_menu_selectall_mtrl_alpha = 2131230929
        const val abc_ic_menu_share_mtrl_alpha = 2131230930
        const val abc_ic_search_api_material = 2131230931
        const val abc_ic_voice_search_api_material = 2131230932
        const val abc_item_background_holo_dark = 2131230933
        const val abc_item_background_holo_light = 2131230934
        const val abc_list_divider_material = 2131230935
        const val abc_list_divider_mtrl_alpha = 2131230936
        const val abc_list_focused_holo = 2131230937
        const val abc_list_longpressed_holo = 2131230938
        const val abc_list_pressed_holo_dark = 2131230939
        const val abc_list_pressed_holo_light = 2131230940
        const val abc_list_selector_background_transition_holo_dark = 2131230941
        const val abc_list_selector_background_transition_holo_light = 2131230942
        const val abc_list_selector_disabled_holo_dark = 2131230943
        const val abc_list_selector_disabled_holo_light = 2131230944
        const val abc_list_selector_holo_dark = 2131230945
        const val abc_list_selector_holo_light = 2131230946
        const val abc_menu_hardkey_panel_mtrl_mult = 2131230947
        const val abc_popup_background_mtrl_mult = 2131230948
        const val abc_ratingbar_indicator_material = 2131230949
        const val abc_ratingbar_material = 2131230950
        const val abc_ratingbar_small_material = 2131230951
        const val abc_scrubber_control_off_mtrl_alpha = 2131230952
        const val abc_scrubber_control_to_pressed_mtrl_000 = 2131230953
        const val abc_scrubber_control_to_pressed_mtrl_005 = 2131230954
        const val abc_scrubber_primary_mtrl_alpha = 2131230955
        const val abc_scrubber_track_mtrl_alpha = 2131230956
        const val abc_seekbar_thumb_material = 2131230957
        const val abc_seekbar_tick_mark_material = 2131230958
        const val abc_seekbar_track_material = 2131230959
        const val abc_spinner_mtrl_am_alpha = 2131230960
        const val abc_spinner_textfield_background_material = 2131230961
        const val abc_star_black_48dp = 2131230962
        const val abc_star_half_black_48dp = 2131230963
        const val abc_switch_thumb_material = 2131230964
        const val abc_switch_track_mtrl_alpha = 2131230965
        const val abc_tab_indicator_material = 2131230966
        const val abc_tab_indicator_mtrl_alpha = 2131230967
        const val abc_text_cursor_material = 2131230968
        const val abc_text_select_handle_left_mtrl = 2131230969
        const val abc_text_select_handle_middle_mtrl = 2131230970
        const val abc_text_select_handle_right_mtrl = 2131230971
        const val abc_textfield_activated_mtrl_alpha = 2131230972
        const val abc_textfield_default_mtrl_alpha = 2131230973
        const val abc_textfield_search_activated_mtrl_alpha = 2131230974
        const val abc_textfield_search_default_mtrl_alpha = 2131230975
        const val abc_textfield_search_material = 2131230976
        const val abc_vector_test = 2131230977
        const val ads = 2131230978
        const val applovin_ic_check_mark_bordered = 2131230979
        const val applovin_ic_check_mark_borderless = 2131230980
        const val applovin_ic_disclosure_arrow = 2131230981
        const val applovin_ic_mediation_adcolony = 2131230982
        const val applovin_ic_mediation_admob = 2131230983
        const val applovin_ic_mediation_amazon = 2131230984
        const val applovin_ic_mediation_applovin = 2131230985
        const val applovin_ic_mediation_chartboost = 2131230986
        const val applovin_ic_mediation_facebook = 2131230987
        const val applovin_ic_mediation_fyber = 2131230988
        const val applovin_ic_mediation_google_ad_manager = 2131230989
        const val applovin_ic_mediation_hyprmx = 2131230990
        const val applovin_ic_mediation_inmobi = 2131230991
        const val applovin_ic_mediation_ironsource = 2131230992
        const val applovin_ic_mediation_line = 2131230993
        const val applovin_ic_mediation_maio = 2131230994
        const val applovin_ic_mediation_mintegral = 2131230995
        const val applovin_ic_mediation_mopub = 2131230996
        const val applovin_ic_mediation_mytarget = 2131230997
        const val applovin_ic_mediation_nend = 2131230998
        const val applovin_ic_mediation_ogury_presage = 2131230999
        const val applovin_ic_mediation_pangle = 2131231000
        const val applovin_ic_mediation_placeholder = 2131231001
        const val applovin_ic_mediation_smaato = 2131231002
        const val applovin_ic_mediation_snap = 2131231003
        const val applovin_ic_mediation_tapjoy = 2131231004
        const val applovin_ic_mediation_tiktok = 2131231005
        const val applovin_ic_mediation_unity = 2131231006
        const val applovin_ic_mediation_verizon = 2131231007
        const val applovin_ic_mediation_vungle = 2131231008
        const val applovin_ic_mediation_yandex = 2131231009
        const val applovin_ic_share = 2131231010
        const val applovin_ic_white_small = 2131231011
        const val applovin_ic_x_mark = 2131231012
        const val avd_hide_password = 2131231013
        const val avd_show_password = 2131231014
        const val background_shadow = 2131231015
        const val baseline_description_24 = 2131231016
        const val baseline_fullscreen_24 = 2131231017
        const val baseline_fullscreen_exit_24 = 2131231018
        const val baseline_grid_view_24 = 2131231019
        const val baseline_list_alt_24 = 2131231020
        const val baseline_remove_24 = 2131231021
        const val baseline_restore_page_24 = 2131231022
        const val baseline_save_as_24 = 2131231023
        const val baseline_sync_24 = 2131231024
        const val baseline_theaters_24 = 2131231025
        const val benene = 2131231026
        const val bg_ad_text = 2131231027
        const val bg_btn_upgrade = 2131231028
        const val bg_btn_upgrade_plan = 2131231029
        const val bg_dialog_bottom_sheet = 2131231030
        const val bg_edt = 2131231031
        const val bg_notify = 2131231032
        const val bg_premium = 2131231033
        const val bg_premium_50 = 2131231034
        const val bg_premium_grid = 2131231035
        const val bg_profile = 2131231036
        const val bg_standart = 2131231037
        const val bg_unlimited = 2131231038
        const val bg_upgrade_btn = 2131231039
        const val bg_white = 2131231040
        const val btn_checkbox_checked_mtrl = 2131231041
        const val btn_checkbox_checked_to_unchecked_mtrl_animation = 2131231042
        const val btn_checkbox_unchecked_mtrl = 2131231043
        const val btn_checkbox_unchecked_to_checked_mtrl_animation = 2131231044
        const val btn_radio_off_mtrl = 2131231045
        const val btn_radio_off_to_on_mtrl_animation = 2131231046
        const val btn_radio_on_mtrl = 2131231047
        const val btn_radio_on_to_off_mtrl_animation = 2131231048
        const val cast_abc_scrubber_control_off_mtrl_alpha = 2131231049
        const val cast_abc_scrubber_control_to_pressed_mtrl_000 = 2131231050
        const val cast_abc_scrubber_control_to_pressed_mtrl_005 = 2131231051
        const val cast_abc_scrubber_primary_mtrl_alpha = 2131231052
        const val cast_album_art_placeholder = 2131231053
        const val cast_album_art_placeholder_large = 2131231054
        const val cast_expanded_controller_actionbar_bg_gradient_light = 2131231055
        const val cast_expanded_controller_bg_gradient_light = 2131231056
        const val cast_expanded_controller_live_indicator_drawable = 2131231057
        const val cast_expanded_controller_seekbar_thumb = 2131231058
        const val cast_expanded_controller_seekbar_track = 2131231059
        const val cast_ic_expanded_controller_closed_caption = 2131231060
        const val cast_ic_expanded_controller_forward30 = 2131231061
        const val cast_ic_expanded_controller_mute = 2131231062
        const val cast_ic_expanded_controller_pause = 2131231063
        const val cast_ic_expanded_controller_play = 2131231064
        const val cast_ic_expanded_controller_rewind30 = 2131231065
        const val cast_ic_expanded_controller_skip_next = 2131231066
        const val cast_ic_expanded_controller_skip_previous = 2131231067
        const val cast_ic_expanded_controller_stop = 2131231068
        const val cast_ic_mini_controller_closed_caption = 2131231069
        const val cast_ic_mini_controller_forward30 = 2131231070
        const val cast_ic_mini_controller_mute = 2131231071
        const val cast_ic_mini_controller_pause = 2131231072
        const val cast_ic_mini_controller_pause_large = 2131231073
        const val cast_ic_mini_controller_play = 2131231074
        const val cast_ic_mini_controller_play_large = 2131231075
        const val cast_ic_mini_controller_rewind30 = 2131231076
        const val cast_ic_mini_controller_skip_next = 2131231077
        const val cast_ic_mini_controller_skip_prev = 2131231078
        const val cast_ic_mini_controller_stop = 2131231079
        const val cast_ic_mini_controller_stop_large = 2131231080
        const val cast_ic_notification_0 = 2131231081
        const val cast_ic_notification_1 = 2131231082
        const val cast_ic_notification_2 = 2131231083
        const val cast_ic_notification_connecting = 2131231084
        const val cast_ic_notification_disconnect = 2131231085
        const val cast_ic_notification_forward = 2131231086
        const val cast_ic_notification_forward10 = 2131231087
        const val cast_ic_notification_forward30 = 2131231088
        const val cast_ic_notification_on = 2131231089
        const val cast_ic_notification_pause = 2131231090
        const val cast_ic_notification_play = 2131231091
        const val cast_ic_notification_rewind = 2131231092
        const val cast_ic_notification_rewind10 = 2131231093
        const val cast_ic_notification_rewind30 = 2131231094
        const val cast_ic_notification_skip_next = 2131231095
        const val cast_ic_notification_skip_prev = 2131231096
        const val cast_ic_notification_small_icon = 2131231097
        const val cast_ic_notification_stop_live_stream = 2131231098
        const val cast_ic_stop_circle_filled_grey600 = 2131231099
        const val cast_ic_stop_circle_filled_white = 2131231100
        const val cast_mini_controller_gradient_light = 2131231101
        const val cast_mini_controller_progress_drawable = 2131231102
        const val cast_skip_ad_label_border = 2131231103
        const val cast_tooltip_background = 2131231104
        const val circle_dot = 2131231105
        const val circle_shape = 2131231106
        const val circular_progress_bar = 2131231107
        const val circular_progress_bar_filled = 2131231108
        const val cloud_2 = 2131231109
        const val cloud_2_gradient = 2131231110
        const val cloud_2_gradient_beta = 2131231111
        const val cloud_2_gradient_beta_old = 2131231112
        const val cloud_2_gradient_debug = 2131231113
        const val com_facebook_auth_dialog_background = 2131231114
        const val com_facebook_auth_dialog_cancel_background = 2131231115
        const val com_facebook_auth_dialog_header_background = 2131231116
        const val com_facebook_button_background = 2131231117
        const val com_facebook_button_icon = 2131231118
        const val com_facebook_button_like_background = 2131231119
        const val com_facebook_button_like_icon_selected = 2131231120
        const val com_facebook_button_send_background = 2131231121
        const val com_facebook_button_send_icon_blue = 2131231122
        const val com_facebook_button_send_icon_white = 2131231123
        const val com_facebook_close = 2131231124
        const val com_facebook_favicon_blue = 2131231125
        const val com_facebook_profile_picture_blank_portrait = 2131231126
        const val com_facebook_profile_picture_blank_square = 2131231127
        const val com_facebook_send_button_icon = 2131231128
        const val com_facebook_tooltip_black_background = 2131231129
        const val com_facebook_tooltip_black_bottomnub = 2131231130
        const val com_facebook_tooltip_black_topnub = 2131231131
        const val com_facebook_tooltip_black_xout = 2131231132
        const val com_facebook_tooltip_blue_background = 2131231133
        const val com_facebook_tooltip_blue_bottomnub = 2131231134
        const val com_facebook_tooltip_blue_topnub = 2131231135
        const val com_facebook_tooltip_blue_xout = 2131231136
        const val common_full_open_on_phone = 2131231137
        const val common_google_signin_btn_icon_dark = 2131231138
        const val common_google_signin_btn_icon_dark_focused = 2131231139
        const val common_google_signin_btn_icon_dark_normal = 2131231140
        const val common_google_signin_btn_icon_dark_normal_background = 2131231141
        const val common_google_signin_btn_icon_disabled = 2131231142
        const val common_google_signin_btn_icon_light = 2131231143
        const val common_google_signin_btn_icon_light_focused = 2131231144
        const val common_google_signin_btn_icon_light_normal = 2131231145
        const val common_google_signin_btn_icon_light_normal_background = 2131231146
        const val common_google_signin_btn_text_dark = 2131231147
        const val common_google_signin_btn_text_dark_focused = 2131231148
        const val common_google_signin_btn_text_dark_normal = 2131231149
        const val common_google_signin_btn_text_dark_normal_background = 2131231150
        const val common_google_signin_btn_text_disabled = 2131231151
        const val common_google_signin_btn_text_light = 2131231152
        const val common_google_signin_btn_text_light_focused = 2131231153
        const val common_google_signin_btn_text_light_normal = 2131231154
        const val common_google_signin_btn_text_light_normal_background = 2131231155
        const val cpv_alpha = 2131231156
        const val cpv_btn_background = 2131231157
        const val cpv_btn_background_pressed = 2131231158
        const val cpv_ic_arrow_right_black_24dp = 2131231159
        const val cpv_preset_checked = 2131231160
        const val cs3_cloud = 2131231161
        const val custom_rating_bar = 2131231162
        const val default_cover = 2131231163
        const val design_fab_background = 2131231164
        const val design_ic_visibility = 2131231165
        const val design_ic_visibility_off = 2131231166
        const val design_password_eye = 2131231167
        const val design_snackbar_background = 2131231168
        const val dialog__window_background = 2131231169
        const val dub_bg_color = 2131231170
        const val example_poster = 2131231171
        const val exo_controls_fastforward = 2131231172
        const val exo_controls_fullscreen_enter = 2131231173
        const val exo_controls_fullscreen_exit = 2131231174
        const val exo_controls_next = 2131231175
        const val exo_controls_pause = 2131231176
        const val exo_controls_play = 2131231177
        const val exo_controls_previous = 2131231178
        const val exo_controls_repeat_all = 2131231179
        const val exo_controls_repeat_off = 2131231180
        const val exo_controls_repeat_one = 2131231181
        const val exo_controls_rewind = 2131231182
        const val exo_controls_shuffle_off = 2131231183
        const val exo_controls_shuffle_on = 2131231184
        const val exo_controls_vr = 2131231185
        const val exo_edit_mode_logo = 2131231186
        const val exo_ic_audiotrack = 2131231187
        const val exo_ic_check = 2131231188
        const val exo_ic_chevron_left = 2131231189
        const val exo_ic_chevron_right = 2131231190
        const val exo_ic_default_album_image = 2131231191
        const val exo_ic_forward = 2131231192
        const val exo_ic_fullscreen_enter = 2131231193
        const val exo_ic_fullscreen_exit = 2131231194
        const val exo_ic_pause_circle_filled = 2131231195
        const val exo_ic_play_circle_filled = 2131231196
        const val exo_ic_rewind = 2131231197
        const val exo_ic_settings = 2131231198
        const val exo_ic_skip_next = 2131231199
        const val exo_ic_skip_previous = 2131231200
        const val exo_ic_speed = 2131231201
        const val exo_ic_subtitle_off = 2131231202
        const val exo_ic_subtitle_on = 2131231203
        const val exo_icon_circular_play = 2131231204
        const val exo_icon_fastforward = 2131231205
        const val exo_icon_fullscreen_enter = 2131231206
        const val exo_icon_fullscreen_exit = 2131231207
        const val exo_icon_next = 2131231208
        const val exo_icon_pause = 2131231209
        const val exo_icon_play = 2131231210
        const val exo_icon_previous = 2131231211
        const val exo_icon_repeat_all = 2131231212
        const val exo_icon_repeat_off = 2131231213
        const val exo_icon_repeat_one = 2131231214
        const val exo_icon_rewind = 2131231215
        const val exo_icon_shuffle_off = 2131231216
        const val exo_icon_shuffle_on = 2131231217
        const val exo_icon_stop = 2131231218
        const val exo_icon_vr = 2131231219
        const val exo_media_action_repeat_all = 2131231220
        const val exo_media_action_repeat_off = 2131231221
        const val exo_media_action_repeat_one = 2131231222
        const val exo_notification_fastforward = 2131231223
        const val exo_notification_next = 2131231224
        const val exo_notification_pause = 2131231225
        const val exo_notification_play = 2131231226
        const val exo_notification_previous = 2131231227
        const val exo_notification_rewind = 2131231228
        const val exo_notification_small_icon = 2131231229
        const val exo_notification_stop = 2131231230
        const val exo_rounded_rectangle = 2131231231
        const val exo_styled_controls_audiotrack = 2131231232
        const val exo_styled_controls_check = 2131231233
        const val exo_styled_controls_fastforward = 2131231234
        const val exo_styled_controls_fullscreen_enter = 2131231235
        const val exo_styled_controls_fullscreen_exit = 2131231236
        const val exo_styled_controls_next = 2131231237
        const val exo_styled_controls_overflow_hide = 2131231238
        const val exo_styled_controls_overflow_show = 2131231239
        const val exo_styled_controls_pause = 2131231240
        const val exo_styled_controls_play = 2131231241
        const val exo_styled_controls_previous = 2131231242
        const val exo_styled_controls_repeat_all = 2131231243
        const val exo_styled_controls_repeat_off = 2131231244
        const val exo_styled_controls_repeat_one = 2131231245
        const val exo_styled_controls_rewind = 2131231246
        const val exo_styled_controls_settings = 2131231247
        const val exo_styled_controls_shuffle_off = 2131231248
        const val exo_styled_controls_shuffle_on = 2131231249
        const val exo_styled_controls_speed = 2131231250
        const val exo_styled_controls_subtitle_off = 2131231251
        const val exo_styled_controls_subtitle_on = 2131231252
        const val exo_styled_controls_vr = 2131231253
        const val go_back_30 = 2131231254
        const val go_forward_30 = 2131231255
        const val googleg_disabled_color_18 = 2131231256
        const val googleg_standard_color_18 = 2131231257
        const val home = 2131231258
        const val ic_1 = 2131231259
        const val ic_2 = 2131231260
        const val ic_3 = 2131231261
        const val ic_4 = 2131231262
        const val ic_5 = 2131231263
        const val ic_6 = 2131231264
        const val ic_7 = 2131231265
        const val ic_8 = 2131231266
        const val ic_9 = 2131231267
        const val ic_ad_block__1_ = 2131231268
        const val ic_anilist_icon = 2131231269
        const val ic_arrow_down_24dp = 2131231270
        const val ic_audiotrack_dark = 2131231271
        const val ic_audiotrack_light = 2131231272
        const val ic_banner_background = 2131231273
        const val ic_banner_foreground = 2131231274
        const val ic_baseline_add_24 = 2131231275
        const val ic_baseline_arrow_back_24 = 2131231276
        const val ic_baseline_arrow_drop_down_24 = 2131231277
        const val ic_baseline_arrow_forward_24 = 2131231278
        const val ic_baseline_aspect_ratio_24 = 2131231279
        const val ic_baseline_autorenew_24 = 2131231280
        const val ic_baseline_bookmark_24 = 2131231281
        const val ic_baseline_bookmark_border_24 = 2131231282
        const val ic_baseline_brightness_1_24 = 2131231283
        const val ic_baseline_brightness_2_24 = 2131231284
        const val ic_baseline_brightness_3_24 = 2131231285
        const val ic_baseline_brightness_4_24 = 2131231286
        const val ic_baseline_brightness_5_24 = 2131231287
        const val ic_baseline_brightness_6_24 = 2131231288
        const val ic_baseline_brightness_7_24 = 2131231289
        const val ic_baseline_bug_report_24 = 2131231290
        const val ic_baseline_check_24 = 2131231291
        const val ic_baseline_clear_24 = 2131231292
        const val ic_baseline_close_24 = 2131231293
        const val ic_baseline_cloud_24 = 2131231294
        const val ic_baseline_color_lens_24 = 2131231295
        const val ic_baseline_delete_outline_24 = 2131231296
        const val ic_baseline_developer_mode_24 = 2131231297
        const val ic_baseline_discord_24 = 2131231298
        const val ic_baseline_dns_24 = 2131231299
        const val ic_baseline_fast_forward_24 = 2131231300
        const val ic_baseline_favorite_24 = 2131231301
        const val ic_baseline_favorite_border_24 = 2131231302
        const val ic_baseline_filter_list_24 = 2131231303
        const val ic_baseline_folder_open_24 = 2131231304
        const val ic_baseline_hd_24 = 2131231305
        const val ic_baseline_keyboard_arrow_down_24 = 2131231306
        const val ic_baseline_keyboard_arrow_right_24 = 2131231307
        const val ic_baseline_language_24 = 2131231308
        const val ic_baseline_more_vert_24 = 2131231309
        const val ic_baseline_notifications_active_24 = 2131231310
        const val ic_baseline_ondemand_video_24 = 2131231311
        const val ic_baseline_pause_24 = 2131231312
        const val ic_baseline_picture_in_picture_alt_24 = 2131231313
        const val ic_baseline_play_arrow_24 = 2131231314
        const val ic_baseline_playlist_play_24 = 2131231315
        const val ic_baseline_public_24 = 2131231316
        const val ic_baseline_remove_red_eye_24 = 2131231317
        const val ic_baseline_skip_next_24 = 2131231318
        const val ic_baseline_speed_24 = 2131231319
        const val ic_baseline_star_24 = 2131231320
        const val ic_baseline_star_border_24 = 2131231321
        const val ic_baseline_storage_24 = 2131231322
        const val ic_baseline_subtitles_24 = 2131231323
        const val ic_baseline_system_update_24 = 2131231324
        const val ic_baseline_text_format_24 = 2131231325
        const val ic_baseline_touch_app_24 = 2131231326
        const val ic_baseline_tune_24 = 2131231327
        const val ic_baseline_tv_24 = 2131231328
        const val ic_baseline_visibility_off_24 = 2131231329
        const val ic_baseline_volume_down_24 = 2131231330
        const val ic_baseline_volume_mute_24 = 2131231331
        const val ic_baseline_volume_up_24 = 2131231332
        const val ic_baseline_warning_24 = 2131231333
        const val ic_chat = 2131231334
        const val ic_checked_checkbox = 2131231335
        const val ic_clock_black_24dp = 2131231336
        const val ic_cloudstreamlogotv = 2131231337
        const val ic_cloudstreamlogotv_2 = 2131231338
        const val ic_cloudstreamlogotv_pre = 2131231339
        const val ic_cloudstreamlogotv_pre_2 = 2131231340
        const val ic_dashboard_black_24dp = 2131231341
        const val ic_dialog_close_dark = 2131231342
        const val ic_dialog_close_light = 2131231343
        const val ic_discovery = 2131231344
        const val ic_download = 2131231345
        const val ic_edit_square = 2131231346
        const val ic_github_logo = 2131231347
        const val ic_graph = 2131231348
        const val ic_group_collapse_00 = 2131231349
        const val ic_group_collapse_01 = 2131231350
        const val ic_group_collapse_02 = 2131231351
        const val ic_group_collapse_03 = 2131231352
        const val ic_group_collapse_04 = 2131231353
        const val ic_group_collapse_05 = 2131231354
        const val ic_group_collapse_06 = 2131231355
        const val ic_group_collapse_07 = 2131231356
        const val ic_group_collapse_08 = 2131231357
        const val ic_group_collapse_09 = 2131231358
        const val ic_group_collapse_10 = 2131231359
        const val ic_group_collapse_11 = 2131231360
        const val ic_group_collapse_12 = 2131231361
        const val ic_group_collapse_13 = 2131231362
        const val ic_group_collapse_14 = 2131231363
        const val ic_group_collapse_15 = 2131231364
        const val ic_group_expand_00 = 2131231365
        const val ic_group_expand_01 = 2131231366
        const val ic_group_expand_02 = 2131231367
        const val ic_group_expand_03 = 2131231368
        const val ic_group_expand_04 = 2131231369
        const val ic_group_expand_05 = 2131231370
        const val ic_group_expand_06 = 2131231371
        const val ic_group_expand_07 = 2131231372
        const val ic_group_expand_08 = 2131231373
        const val ic_group_expand_09 = 2131231374
        const val ic_group_expand_10 = 2131231375
        const val ic_group_expand_11 = 2131231376
        const val ic_group_expand_12 = 2131231377
        const val ic_group_expand_13 = 2131231378
        const val ic_group_expand_14 = 2131231379
        const val ic_group_expand_15 = 2131231380
        const val ic_home_black_24dp = 2131231381
        const val ic_keyboard_black_24dp = 2131231382
        const val ic_launcher_background = 2131231383
        const val ic_launcher_foreground = 2131231384
        const val ic_loading_rotate = 2131231385
        const val ic_m3_chip_check = 2131231386
        const val ic_m3_chip_checked_circle = 2131231387
        const val ic_m3_chip_close = 2131231388
        const val ic_media_pause_dark = 2131231389
        const val ic_media_pause_light = 2131231390
        const val ic_media_play_dark = 2131231391
        const val ic_media_play_light = 2131231392
        const val ic_media_stop_dark = 2131231393
        const val ic_media_stop_light = 2131231394
        const val ic_mr_button_connected_00_dark = 2131231395
        const val ic_mr_button_connected_00_light = 2131231396
        const val ic_mr_button_connected_01_dark = 2131231397
        const val ic_mr_button_connected_01_light = 2131231398
        const val ic_mr_button_connected_02_dark = 2131231399
        const val ic_mr_button_connected_02_light = 2131231400
        const val ic_mr_button_connected_03_dark = 2131231401
        const val ic_mr_button_connected_03_light = 2131231402
        const val ic_mr_button_connected_04_dark = 2131231403
        const val ic_mr_button_connected_04_light = 2131231404
        const val ic_mr_button_connected_05_dark = 2131231405
        const val ic_mr_button_connected_05_light = 2131231406
        const val ic_mr_button_connected_06_dark = 2131231407
        const val ic_mr_button_connected_06_light = 2131231408
        const val ic_mr_button_connected_07_dark = 2131231409
        const val ic_mr_button_connected_07_light = 2131231410
        const val ic_mr_button_connected_08_dark = 2131231411
        const val ic_mr_button_connected_08_light = 2131231412
        const val ic_mr_button_connected_09_dark = 2131231413
        const val ic_mr_button_connected_09_light = 2131231414
        const val ic_mr_button_connected_10_dark = 2131231415
        const val ic_mr_button_connected_10_light = 2131231416
        const val ic_mr_button_connected_11_dark = 2131231417
        const val ic_mr_button_connected_11_light = 2131231418
        const val ic_mr_button_connected_12_dark = 2131231419
        const val ic_mr_button_connected_12_light = 2131231420
        const val ic_mr_button_connected_13_dark = 2131231421
        const val ic_mr_button_connected_13_light = 2131231422
        const val ic_mr_button_connected_14_dark = 2131231423
        const val ic_mr_button_connected_14_light = 2131231424
        const val ic_mr_button_connected_15_dark = 2131231425
        const val ic_mr_button_connected_15_light = 2131231426
        const val ic_mr_button_connected_16_dark = 2131231427
        const val ic_mr_button_connected_16_light = 2131231428
        const val ic_mr_button_connected_17_dark = 2131231429
        const val ic_mr_button_connected_17_light = 2131231430
        const val ic_mr_button_connected_18_dark = 2131231431
        const val ic_mr_button_connected_18_light = 2131231432
        const val ic_mr_button_connected_19_dark = 2131231433
        const val ic_mr_button_connected_19_light = 2131231434
        const val ic_mr_button_connected_20_dark = 2131231435
        const val ic_mr_button_connected_20_light = 2131231436
        const val ic_mr_button_connected_21_dark = 2131231437
        const val ic_mr_button_connected_21_light = 2131231438
        const val ic_mr_button_connected_22_dark = 2131231439
        const val ic_mr_button_connected_22_light = 2131231440
        const val ic_mr_button_connected_23_dark = 2131231441
        const val ic_mr_button_connected_23_light = 2131231442
        const val ic_mr_button_connected_24_dark = 2131231443
        const val ic_mr_button_connected_24_light = 2131231444
        const val ic_mr_button_connected_25_dark = 2131231445
        const val ic_mr_button_connected_25_light = 2131231446
        const val ic_mr_button_connected_26_dark = 2131231447
        const val ic_mr_button_connected_26_light = 2131231448
        const val ic_mr_button_connected_27_dark = 2131231449
        const val ic_mr_button_connected_27_light = 2131231450
        const val ic_mr_button_connected_28_dark = 2131231451
        const val ic_mr_button_connected_28_light = 2131231452
        const val ic_mr_button_connected_29_dark = 2131231453
        const val ic_mr_button_connected_29_light = 2131231454
        const val ic_mr_button_connected_30_dark = 2131231455
        const val ic_mr_button_connected_30_light = 2131231456
        const val ic_mr_button_connecting_00_dark = 2131231457
        const val ic_mr_button_connecting_00_light = 2131231458
        const val ic_mr_button_connecting_01_dark = 2131231459
        const val ic_mr_button_connecting_01_light = 2131231460
        const val ic_mr_button_connecting_02_dark = 2131231461
        const val ic_mr_button_connecting_02_light = 2131231462
        const val ic_mr_button_connecting_03_dark = 2131231463
        const val ic_mr_button_connecting_03_light = 2131231464
        const val ic_mr_button_connecting_04_dark = 2131231465
        const val ic_mr_button_connecting_04_light = 2131231466
        const val ic_mr_button_connecting_05_dark = 2131231467
        const val ic_mr_button_connecting_05_light = 2131231468
        const val ic_mr_button_connecting_06_dark = 2131231469
        const val ic_mr_button_connecting_06_light = 2131231470
        const val ic_mr_button_connecting_07_dark = 2131231471
        const val ic_mr_button_connecting_07_light = 2131231472
        const val ic_mr_button_connecting_08_dark = 2131231473
        const val ic_mr_button_connecting_08_light = 2131231474
        const val ic_mr_button_connecting_09_dark = 2131231475
        const val ic_mr_button_connecting_09_light = 2131231476
        const val ic_mr_button_connecting_10_dark = 2131231477
        const val ic_mr_button_connecting_10_light = 2131231478
        const val ic_mr_button_connecting_11_dark = 2131231479
        const val ic_mr_button_connecting_11_light = 2131231480
        const val ic_mr_button_connecting_12_dark = 2131231481
        const val ic_mr_button_connecting_12_light = 2131231482
        const val ic_mr_button_connecting_13_dark = 2131231483
        const val ic_mr_button_connecting_13_light = 2131231484
        const val ic_mr_button_connecting_14_dark = 2131231485
        const val ic_mr_button_connecting_14_light = 2131231486
        const val ic_mr_button_connecting_15_dark = 2131231487
        const val ic_mr_button_connecting_15_light = 2131231488
        const val ic_mr_button_connecting_16_dark = 2131231489
        const val ic_mr_button_connecting_16_light = 2131231490
        const val ic_mr_button_connecting_17_dark = 2131231491
        const val ic_mr_button_connecting_17_light = 2131231492
        const val ic_mr_button_connecting_18_dark = 2131231493
        const val ic_mr_button_connecting_18_light = 2131231494
        const val ic_mr_button_connecting_19_dark = 2131231495
        const val ic_mr_button_connecting_19_light = 2131231496
        const val ic_mr_button_connecting_20_dark = 2131231497
        const val ic_mr_button_connecting_20_light = 2131231498
        const val ic_mr_button_connecting_21_dark = 2131231499
        const val ic_mr_button_connecting_21_light = 2131231500
        const val ic_mr_button_connecting_22_dark = 2131231501
        const val ic_mr_button_connecting_22_light = 2131231502
        const val ic_mr_button_connecting_23_dark = 2131231503
        const val ic_mr_button_connecting_23_light = 2131231504
        const val ic_mr_button_connecting_24_dark = 2131231505
        const val ic_mr_button_connecting_24_light = 2131231506
        const val ic_mr_button_connecting_25_dark = 2131231507
        const val ic_mr_button_connecting_25_light = 2131231508
        const val ic_mr_button_connecting_26_dark = 2131231509
        const val ic_mr_button_connecting_26_light = 2131231510
        const val ic_mr_button_connecting_27_dark = 2131231511
        const val ic_mr_button_connecting_27_light = 2131231512
        const val ic_mr_button_connecting_28_dark = 2131231513
        const val ic_mr_button_connecting_28_light = 2131231514
        const val ic_mr_button_connecting_29_dark = 2131231515
        const val ic_mr_button_connecting_29_light = 2131231516
        const val ic_mr_button_connecting_30_dark = 2131231517
        const val ic_mr_button_connecting_30_light = 2131231518
        const val ic_mr_button_disabled_dark = 2131231519
        const val ic_mr_button_disabled_light = 2131231520
        const val ic_mr_button_disconnected_dark = 2131231521
        const val ic_mr_button_disconnected_light = 2131231522
        const val ic_mr_button_grey = 2131231523
        const val ic_mtrl_checked_circle = 2131231524
        const val ic_mtrl_chip_checked_black = 2131231525
        const val ic_mtrl_chip_checked_circle = 2131231526
        const val ic_mtrl_chip_close_circle = 2131231527
        const val ic_notifications_black_24dp = 2131231528
        const val ic_outline_home_24 = 2131231529
        const val ic_outline_info_24 = 2131231530
        const val ic_outline_remove_red_eye_24 = 2131231531
        const val ic_outline_settings_24 = 2131231532
        const val ic_outline_share_24 = 2131231533
        const val ic_outline_subtitles_24 = 2131231534
        const val ic_outline_voice_over_off_24 = 2131231535
        const val ic_paper_download = 2131231536
        const val ic_popcorn = 2131231537
        const val ic_popcorn_24 = 2131231538
        const val ic_popcorn_white = 2131231539
        const val ic_pulltorefresh_arrow = 2131231540
        const val ic_setting = 2131231541
        const val ic_shield_done = 2131231542
        const val ic_unchecked_checkbox = 2131231543
        const val ic_upload = 2131231544
        const val ic_user = 2131231545
        const val ic_vip = 2131231546
        const val ic_vol_mute = 2131231547
        const val ic_vol_type_speaker_dark = 2131231548
        const val ic_vol_type_speaker_group_dark = 2131231549
        const val ic_vol_type_speaker_group_light = 2131231550
        const val ic_vol_type_speaker_light = 2131231551
        const val ic_vol_type_tv_dark = 2131231552
        const val ic_vol_type_tv_light = 2131231553
        const val ic_vol_unmute = 2131231554
        const val line = 2131231555
        const val loading_01 = 2131231556
        const val loading_02 = 2131231557
        const val loading_03 = 2131231558
        const val loading_04 = 2131231559
        const val loading_05 = 2131231560
        const val loading_06 = 2131231561
        const val loading_07 = 2131231562
        const val loading_08 = 2131231563
        const val loading_09 = 2131231564
        const val loading_10 = 2131231565
        const val loading_11 = 2131231566
        const val loading_12 = 2131231567
        const val m3_appbar_background = 2131231568
        const val m3_popupmenu_background_overlay = 2131231569
        const val m3_radiobutton_ripple = 2131231570
        const val m3_selection_control_ripple = 2131231571
        const val m3_tabs_background = 2131231572
        const val m3_tabs_line_indicator = 2131231573
        const val m3_tabs_rounded_line_indicator = 2131231574
        const val m3_tabs_transparent_background = 2131231575
        const val mal_logo = 2131231576
        const val material_cursor_drawable = 2131231577
        const val material_ic_calendar_black_24dp = 2131231578
        const val material_ic_clear_black_24dp = 2131231579
        const val material_ic_edit_black_24dp = 2131231580
        const val material_ic_keyboard_arrow_left_black_24dp = 2131231581
        const val material_ic_keyboard_arrow_next_black_24dp = 2131231582
        const val material_ic_keyboard_arrow_previous_black_24dp = 2131231583
        const val material_ic_keyboard_arrow_right_black_24dp = 2131231584
        const val material_ic_menu_arrow_down_black_24dp = 2131231585
        const val material_ic_menu_arrow_up_black_24dp = 2131231586
        const val material_outline_background = 2131231587
        const val messenger_bubble_large_blue = 2131231588
        const val messenger_bubble_large_white = 2131231589
        const val messenger_bubble_small_blue = 2131231590
        const val messenger_bubble_small_white = 2131231591
        const val messenger_button_blue_bg_round = 2131231592
        const val messenger_button_blue_bg_selector = 2131231593
        const val messenger_button_send_round_shadow = 2131231594
        const val messenger_button_white_bg_round = 2131231595
        const val messenger_button_white_bg_selector = 2131231596
        const val monke_benene = 2131231597
        const val monke_burrito = 2131231598
        const val monke_coco = 2131231599
        const val monke_cookie = 2131231600
        const val monke_drink = 2131231601
        const val monke_flusdered = 2131231602
        const val monke_funny = 2131231603
        const val monke_like = 2131231604
        const val monke_party = 2131231605
        const val monke_sob = 2131231606
        const val mr_button_connected_dark = 2131231607
        const val mr_button_connected_light = 2131231608
        const val mr_button_connecting_dark = 2131231609
        const val mr_button_connecting_light = 2131231610
        const val mr_button_dark = 2131231611
        const val mr_button_dark_static = 2131231612
        const val mr_button_light = 2131231613
        const val mr_button_light_static = 2131231614
        const val mr_cast_checkbox = 2131231615
        const val mr_cast_group_seekbar_track = 2131231616
        const val mr_cast_mute_button = 2131231617
        const val mr_cast_route_seekbar_track = 2131231618
        const val mr_cast_stop = 2131231619
        const val mr_cast_thumb = 2131231620
        const val mr_dialog_close_dark = 2131231621
        const val mr_dialog_close_light = 2131231622
        const val mr_dialog_material_background_dark = 2131231623
        const val mr_dialog_material_background_light = 2131231624
        const val mr_group_collapse = 2131231625
        const val mr_group_expand = 2131231626
        const val mr_media_pause_dark = 2131231627
        const val mr_media_pause_light = 2131231628
        const val mr_media_play_dark = 2131231629
        const val mr_media_play_light = 2131231630
        const val mr_media_stop_dark = 2131231631
        const val mr_media_stop_light = 2131231632
        const val mr_vol_type_audiotrack_dark = 2131231633
        const val mr_vol_type_audiotrack_light = 2131231634
        const val mtrl_dialog_background = 2131231635
        const val mtrl_dropdown_arrow = 2131231636
        const val mtrl_ic_arrow_drop_down = 2131231637
        const val mtrl_ic_arrow_drop_up = 2131231638
        const val mtrl_ic_cancel = 2131231639
        const val mtrl_ic_error = 2131231640
        const val mtrl_navigation_bar_item_background = 2131231641
        const val mtrl_popupmenu_background = 2131231642
        const val mtrl_popupmenu_background_overlay = 2131231643
        const val mtrl_tabs_default_indicator = 2131231644
        const val mute_to_unmute = 2131231645
        const val navigation_empty_icon = 2131231646
        const val netflix_download = 2131231647
        const val netflix_pause = 2131231648
        const val netflix_play = 2131231649
        const val netflix_skip_back = 2131231650
        const val netflix_skip_forward = 2131231651
        const val nginx = 2131231652
        const val nginx_question = 2131231653
        const val notification_action_background = 2131231654
        const val notification_bg = 2131231655
        const val notification_bg_low = 2131231656
        const val notification_bg_low_normal = 2131231657
        const val notification_bg_low_pressed = 2131231658
        const val notification_bg_normal = 2131231659
        const val notification_bg_normal_pressed = 2131231660
        const val notification_icon_background = 2131231661
        const val notification_template_icon_bg = 2131231662
        const val notification_template_icon_low_bg = 2131231663
        const val notification_tile_bg = 2131231664
        const val notify_panel_notification_icon_bg = 2131231665
        const val open_subtitles_icon = 2131231666
        const val outline = 2131231667
        const val outline_card = 2131231668
        const val outline_drawable = 2131231669
        const val pause_to_play = 2131231670
        const val play_button = 2131231671
        const val play_to_pause = 2131231672
        const val player_button_tv = 2131231673
        const val player_gradient_tv = 2131231674
        const val preference_list_divider_material = 2131231675
        const val progress_drawable_vertical = 2131231676
        const val progressbar = 2131231677
        const val progressloading = 2131231678
        const val quantum_ic_art_track_grey600_48 = 2131231679
        const val quantum_ic_bigtop_updates_white_24 = 2131231680
        const val quantum_ic_cast_connected_white_24 = 2131231681
        const val quantum_ic_cast_white_36 = 2131231682
        const val quantum_ic_clear_white_24 = 2131231683
        const val quantum_ic_closed_caption_grey600_36 = 2131231684
        const val quantum_ic_closed_caption_white_36 = 2131231685
        const val quantum_ic_forward_10_white_24 = 2131231686
        const val quantum_ic_forward_30_grey600_36 = 2131231687
        const val quantum_ic_forward_30_white_24 = 2131231688
        const val quantum_ic_forward_30_white_36 = 2131231689
        const val quantum_ic_keyboard_arrow_down_white_36 = 2131231690
        const val quantum_ic_pause_circle_filled_grey600_36 = 2131231691
        const val quantum_ic_pause_circle_filled_white_36 = 2131231692
        const val quantum_ic_pause_grey600_36 = 2131231693
        const val quantum_ic_pause_grey600_48 = 2131231694
        const val quantum_ic_pause_white_24 = 2131231695
        const val quantum_ic_play_arrow_grey600_36 = 2131231696
        const val quantum_ic_play_arrow_grey600_48 = 2131231697
        const val quantum_ic_play_arrow_white_24 = 2131231698
        const val quantum_ic_play_circle_filled_grey600_36 = 2131231699
        const val quantum_ic_play_circle_filled_white_36 = 2131231700
        const val quantum_ic_refresh_white_24 = 2131231701
        const val quantum_ic_replay_10_white_24 = 2131231702
        const val quantum_ic_replay_30_grey600_36 = 2131231703
        const val quantum_ic_replay_30_white_24 = 2131231704
        const val quantum_ic_replay_30_white_36 = 2131231705
        const val quantum_ic_replay_white_24 = 2131231706
        const val quantum_ic_skip_next_grey600_36 = 2131231707
        const val quantum_ic_skip_next_white_24 = 2131231708
        const val quantum_ic_skip_next_white_36 = 2131231709
        const val quantum_ic_skip_previous_grey600_36 = 2131231710
        const val quantum_ic_skip_previous_white_24 = 2131231711
        const val quantum_ic_skip_previous_white_36 = 2131231712
        const val quantum_ic_stop_grey600_36 = 2131231713
        const val quantum_ic_stop_grey600_48 = 2131231714
        const val quantum_ic_stop_white_24 = 2131231715
        const val quantum_ic_volume_off_grey600_36 = 2131231716
        const val quantum_ic_volume_off_white_36 = 2131231717
        const val quantum_ic_volume_up_grey600_36 = 2131231718
        const val quantum_ic_volume_up_white_36 = 2131231719
        const val question_mark_24 = 2131231720
        const val quick_novel_icon = 2131231721
        const val random = 2131231722
        const val rating_empty = 2131231723
        const val rating_fill = 2131231724
        const val rddone = 2131231725
        const val rderror = 2131231726
        const val rdload = 2131231727
        const val rdpause = 2131231728
        const val rounded_button = 2131231729
        const val rounded_dialog = 2131231730
        const val rounded_progress = 2131231731
        const val rounded_text_view_border = 2131231732
        const val search = 2131231733
        const val search_background = 2131231734
        const val search_background_alpha = 2131231735
        const val search_icon = 2131231736
        const val setting = 2131231737
        const val shape_fab = 2131231738
        const val solid_primary = 2131231739
        const val splash_background = 2131231740
        const val sub_bg_color = 2131231741
        const val subtitle_browser_download_popup_bg = 2131231742
        const val subtitle_browser_title_bg = 2131231743
        const val subtitles_background_gradient = 2131231744
        const val subtitles_preview_background = 2131231745
        const val sun_1 = 2131231746
        const val sun_2 = 2131231747
        const val sun_3 = 2131231748
        const val sun_4 = 2131231749
        const val sun_5 = 2131231750
        const val sun_6 = 2131231751
        const val sun_7 = 2131231752
        const val tab_selector = 2131231753
        const val test_custom_background = 2131231754
        const val test_level_drawable = 2131231755
        const val title_shadow = 2131231756
        const val title_shadow_top = 2131231757
        const val tooltip_frame_dark = 2131231758
        const val tooltip_frame_light = 2131231759
        const val type_bg_color = 2131231760
        const val unicorn_ic_arrow_right = 2131231761
        const val unicorn_ic_arrow_solid_right = 2131231762
        const val unicorn_ic_done = 2131231763
        const val unicorn_ic_file = 2131231764
        const val unicorn_ic_folder = 2131231765
        const val unicorn_ic_images = 2131231766
        const val unicorn_ic_pdf = 2131231767
        const val unicorn_ic_search = 2131231768
        const val unicorn_item_layout_divider = 2131231769
        const val unmute_to_mute = 2131231770
        const val video_bottom_button = 2131231771
        const val video_locked = 2131231772
        const val video_pause = 2131231773
        const val video_play = 2131231774
        const val video_tap_button = 2131231775
        const val video_tap_button_always_white = 2131231776
        const val video_tap_button_skip = 2131231777
        const val video_unlocked = 2131231778
    }

    /* renamed from: com.lagradost.cloudstream3.R$font */ /* loaded from: classes3.dex */
    object font {
        const val comic_sans = 2131296256
        const val consola = 2131296257
        const val futura = 2131296258
        const val google_sans = 2131296259
        const val gotham = 2131296260
        const val lucida_grande = 2131296261
        const val netflix_sans = 2131296262
        const val open_sans = 2131296263
        const val poppins_regular = 2131296264
        const val productsans_black = 2131296265
        const val productsans_blackitalic = 2131296266
        const val productsans_bold = 2131296267
        const val productsans_bolditalic = 2131296268
        const val productsans_italic = 2131296269
        const val productsans_light = 2131296270
        const val productsans_lightitalic = 2131296271
        const val productsans_medium = 2131296272
        const val productsans_mediumitalic = 2131296273
        const val productsans_regular = 2131296274
        const val productsans_thin = 2131296275
        const val productsans_thinitalic = 2131296276
        const val roboto_medium_numbers = 2131296277
        const val stix_general = 2131296278
        const val times_new_roman = 2131296279
        const val trebuchet_ms = 2131296280
        const val ubuntu_regular = 2131296281
        const val verdana = 2131296282
    }

    /* renamed from: com.lagradost.cloudstream3.R$id */ /* loaded from: classes3.dex */
    object C4764id {
        const val ALT = 2131361792
        const val BOTTOM_END = 2131361793
        const val BOTTOM_LEFT = 2131361794
        const val BOTTOM_RIGHT = 2131361795
        const val BOTTOM_START = 2131361796
        const val BallBeat = 2131361797
        const val BallClipRotate = 2131361798
        const val BallClipRotateMultiple = 2131361799
        const val BallClipRotatePulse = 2131361800
        const val BallGridBeat = 2131361801
        const val BallGridPulse = 2131361802
        const val BallPulse = 2131361803
        const val BallPulseRise = 2131361804
        const val BallPulseSync = 2131361805
        const val BallRotate = 2131361806
        const val BallScale = 2131361807
        const val BallScaleMultiple = 2131361808
        const val BallScaleRipple = 2131361809
        const val BallScaleRippleMultiple = 2131361810
        const val BallSpinFadeLoader = 2131361811
        const val BallTrianglePath = 2131361812
        const val BallZigZag = 2131361813
        const val BallZigZagDeflect = 2131361814
        const val CTRL = 2131361815
        const val CubeTransition = 2131361816
        const val FUNCTION = 2131361817
        const val LineScale = 2131361818
        const val LineScaleParty = 2131361819
        const val LineScalePulseOut = 2131361820
        const val LineScalePulseOutRapid = 2131361821
        const val LineSpinFadeLoader = 2131361822
        const val META = 2131361823
        const val NO_DEBUG = 2131361824
        const val Pacman = 2131361825
        const val SHIFT = 2131361826
        const val SHOW_ALL = 2131361827
        const val SHOW_PATH = 2131361828
        const val SHOW_PROGRESS = 2131361829
        const val SYM = 2131361830
        const val SemiCircleSpin = 2131361831
        const val SquareSpin = 2131361832
        const val TOP_END = 2131361833
        const val TOP_LEFT = 2131361834
        const val TOP_RIGHT = 2131361835
        const val TOP_START = 2131361836
        const val TriangleSkewSpin = 2131361837
        const val accelerate = 2131361838
        const val accessibility_action_clickable_span = 2131361839
        const val accessibility_custom_action_0 = 2131361840
        const val accessibility_custom_action_1 = 2131361841
        const val accessibility_custom_action_10 = 2131361842
        const val accessibility_custom_action_11 = 2131361843
        const val accessibility_custom_action_12 = 2131361844
        const val accessibility_custom_action_13 = 2131361845
        const val accessibility_custom_action_14 = 2131361846
        const val accessibility_custom_action_15 = 2131361847
        const val accessibility_custom_action_16 = 2131361848
        const val accessibility_custom_action_17 = 2131361849
        const val accessibility_custom_action_18 = 2131361850
        const val accessibility_custom_action_19 = 2131361851
        const val accessibility_custom_action_2 = 2131361852
        const val accessibility_custom_action_20 = 2131361853
        const val accessibility_custom_action_21 = 2131361854
        const val accessibility_custom_action_22 = 2131361855
        const val accessibility_custom_action_23 = 2131361856
        const val accessibility_custom_action_24 = 2131361857
        const val accessibility_custom_action_25 = 2131361858
        const val accessibility_custom_action_26 = 2131361859
        const val accessibility_custom_action_27 = 2131361860
        const val accessibility_custom_action_28 = 2131361861
        const val accessibility_custom_action_29 = 2131361862
        const val accessibility_custom_action_3 = 2131361863
        const val accessibility_custom_action_30 = 2131361864
        const val accessibility_custom_action_31 = 2131361865
        const val accessibility_custom_action_4 = 2131361866
        const val accessibility_custom_action_5 = 2131361867
        const val accessibility_custom_action_6 = 2131361868
        const val accessibility_custom_action_7 = 2131361869
        const val accessibility_custom_action_8 = 2131361870
        const val accessibility_custom_action_9 = 2131361871
        const val account_add = 2131361872
        const val account_list = 2131361873
        const val account_logout = 2131361874
        const val account_main_profile_picture = 2131361875
        const val account_main_profile_picture_holder = 2131361876
        const val account_name = 2131361877
        const val account_profile_picture = 2131361878
        const val account_profile_picture_holder = 2131361879
        const val account_site = 2131361880
        const val account_switch_account = 2131361881
        const val action0 = 2131361882
        const val actionDown = 2131361883
        const val actionDownUp = 2131361884
        const val actionUp = 2131361885
        const val action_bar = 2131361886
        const val action_bar_activity_content = 2131361887
        const val action_bar_container = 2131361888
        const val action_bar_root = 2131361889
        const val action_bar_spinner = 2131361890
        const val action_bar_subtitle = 2131361891
        const val action_bar_title = 2131361892
        const val action_container = 2131361893
        const val action_context_bar = 2131361894
        const val action_divider = 2131361895
        const val action_image = 2131361896
        const val action_menu_divider = 2131361897
        const val action_menu_presenter = 2131361898
        const val action_mode_bar = 2131361899
        const val action_mode_bar_stub = 2131361900
        const val action_mode_close_button = 2131361901
        const val action_navigation_download_child_to_navigation_player = 2131361902
        const val action_navigation_downloads_to_navigation_download_child = 2131361903
        const val action_navigation_downloads_to_navigation_player = 2131361904
        const val action_navigation_downloads_to_navigation_results = 2131361905
        const val action_navigation_home_to_navigation_quick_search = 2131361906
        const val action_navigation_home_to_navigation_results = 2131361907
        const val action_navigation_results_to_navigation_player = 2131361908
        const val action_navigation_results_to_navigation_quick_search = 2131361909
        const val action_navigation_search_to_navigation_results = 2131361910
        const val action_navigation_settings_player_to_navigation_chrome_subtitles = 2131361911
        const val action_navigation_settings_player_to_navigation_subtitles = 2131361912
        const val action_navigation_settings_to_navigation_settings_account = 2131361913
        const val action_navigation_settings_to_navigation_settings_general = 2131361914
        const val action_navigation_settings_to_navigation_settings_lang = 2131361915
        const val action_navigation_settings_to_navigation_settings_player = 2131361916
        const val action_navigation_settings_to_navigation_settings_ui = 2131361917
        const val action_navigation_settings_to_navigation_settings_updates = 2131361918
        const val action_search = 2131361919
        const val action_share = 2131361920
        const val action_text = 2131361921
        const val actions = 2131361922
        const val activity_chooser_view_content = 2131361923
        const val actor_extra = 2131361924
        const val actor_image = 2131361925
        const val actor_name = 2131361926
        const val adMerc = 2131361927
        const val adView = 2131361928
        const val ad_background_image_view = 2131361929
        const val ad_container = 2131361930
        const val ad_control_button = 2131361931
        const val ad_controls_view = 2131361932
        const val ad_image_view = 2131361933
        const val ad_in_progress_label = 2131361934
        const val ad_label = 2131361935
        const val ad_presenter_view = 2131361936
        const val ad_skip_button = 2131361937
        const val ad_skip_text = 2131361938
        const val add = 2131361939
        const val add_site = 2131361940
        const val adjust_height = 2131361941
        const val adjust_width = 2131361942
        const val alertTitle = 2131361943
        const val aligned = 2131361944
        const val all = 2131361945
        const val allStates = 2131361946
        const val always = 2131361947
        const val androidx_window_activity_scope = 2131361948
        const val animateToEnd = 2131361949
        const val animateToStart = 2131361950
        const val animation = 2131361951
        const val animationView = 2131361952
        const val antiClockwise = 2131361953
        const val anticipate = 2131361954
        const val appBar = 2131361955
        const val apply_btt = 2131361956
        const val apply_btt_holder = 2131361957
        const val arc = 2131361958
        const val asConfigured = 2131361959
        const val async = 2131361960
        const val audio_list_view = 2131361961
        const val auto = 2131361962
        const val autoComplete = 2131361963
        const val autoCompleteToEnd = 2131361964
        const val autoCompleteToStart = 2131361965
        const val automatic = 2131361966
        const val avi = 2131361967
        const val backgroundCard = 2131361968
        const val background_card = 2131361969
        const val background_image_view = 2131361970
        const val background_place_holder_image_view = 2131361971
        const val badgeUpdate = 2131361972
        const val banner_ad_view_container = 2131361973
        const val banner_control_button = 2131361974
        const val banner_control_view = 2131361975
        const val banner_label = 2131361976
        const val barrier = 2131361977
        const val baseline = 2131361978
        const val beginOnFirstDraw = 2131361979
        const val beginning = 2131361980
        const val bestChoice = 2131361981
        const val bgHeader = 2131361982
        const val blocking = 2131361983
        const val blurView = 2131361984
        const val blurViewDialog = 2131361985
        const val blurred_background_image_view = 2131361986
        const val bottom = 2131361987
        const val bottom_player_bar = 2131361988
        const val bottom_to_top = 2131361989
        const val bounce = 2131361990
        const val bounceBoth = 2131361991
        const val bounceEnd = 2131361992
        const val bounceStart = 2131361993
        const val box_count = 2131361994
        const val browser_actions_header_text = 2131361995
        const val browser_actions_menu_item_icon = 2131361996
        const val browser_actions_menu_item_text = 2131361997
        const val browser_actions_menu_items = 2131361998
        const val browser_actions_menu_view = 2131361999
        const val btnBack = 2131362000
        const val btnCloseDialogBlur = 2131362001
        const val btnMore = 2131362002
        const val button = 2131362003
        const val buttonPanel = 2131362004
        const val button_0 = 2131362005
        const val button_1 = 2131362006
        const val button_2 = 2131362007
        const val button_3 = 2131362008
        const val button_play_pause_toggle = 2131362009
        const val cache_measures = 2131362010
        const val callMeasure = 2131362011
        const val cancel_action = 2131362012
        const val cancel_btt = 2131362013
        const val cancel_button = 2131362014
        const val carryVelocity = 2131362015
        const val cast_button_type_closed_caption = 2131362016
        const val cast_button_type_custom = 2131362017
        const val cast_button_type_empty = 2131362018
        const val cast_button_type_forward_30_seconds = 2131362019
        const val cast_button_type_mute_toggle = 2131362020
        const val cast_button_type_play_pause_toggle = 2131362021
        const val cast_button_type_rewind_30_seconds = 2131362022
        const val cast_button_type_skip_next = 2131362023
        const val cast_button_type_skip_previous = 2131362024
        const val cast_featurehighlight_help_text_body_view = 2131362025
        const val cast_featurehighlight_help_text_header_view = 2131362026
        const val cast_featurehighlight_view = 2131362027
        const val cast_mini_controller = 2131362028
        const val cast_mini_controller_holder = 2131362029
        const val cast_notification_id = 2131362030
        const val cast_seek_bar = 2131362031
        const val center = 2131362032
        const val centerMenuView = 2131362033
        const val center_horizontal = 2131362034
        const val center_panel = 2131362035
        const val center_vertical = 2131362036
        const val chain = 2131362037
        const val chain2 = 2131362038
        const val chains = 2131362039
        const val checkbox = 2131362040
        const val checked = 2131362041
        const val chip = 2131362042
        const val chip1 = 2131362043
        const val chip2 = 2131362044
        const val chip3 = 2131362045
        const val chip_group = 2131362046
        const val chronometer = 2131362047
        const val circle = 2131362048
        const val circleImageView = 2131362049
        const val circle_center = 2131362050
        const val clear_btt = 2131362051
        const val clear_text = 2131362052
        const val clip_horizontal = 2131362053
        const val clip_vertical = 2131362054
        const val clockwise = 2131362055
        const val close_btt = 2131362056
        const val closest = 2131362057
        const val collapseActionView = 2131362058
        const val com_facebook_body_frame = 2131362059
        const val com_facebook_button_xout = 2131362060
        const val com_facebook_device_auth_instructions = 2131362061
        const val com_facebook_fragment_container = 2131362062
        const val com_facebook_login_fragment_progress_bar = 2131362063
        const val com_facebook_smart_instructions_0 = 2131362064
        const val com_facebook_smart_instructions_or = 2131362065
        const val com_facebook_tooltip_bubble_view_bottom_pointer = 2131362066
        const val com_facebook_tooltip_bubble_view_text_body = 2131362067
        const val com_facebook_tooltip_bubble_view_top_pointer = 2131362068
        const val compress = 2131362069
        const val confirm_button = 2131362070
        const val confirmation_code = 2131362071
        const val constraint = 2131362072
        const val constraintLayout2 = 2131362073
        const val container = 2131362074
        const val container_all = 2131362075
        const val container_current = 2131362076
        const val content = 2131362077
        const val contentPanel = 2131362078
        const val contiguous = 2131362079
        const val continuousVelocity = 2131362080
        const val controllers = 2131362081
        const val coordinator = 2131362082
        const val copy_btt = 2131362083
        const val cos = 2131362084
        const val counterclockwise = 2131362085
        const val cpv_arrow_right = 2131362086
        const val cpv_color_image_view = 2131362087
        const val cpv_color_panel_new = 2131362088
        const val cpv_color_panel_old = 2131362089
        const val cpv_color_panel_view = 2131362090
        const val cpv_color_picker_view = 2131362091
        const val cpv_hex = 2131362092
        const val cpv_preference_preview_color_panel = 2131362093
        const val create_account = 2131362094
        const val currentState = 2131362095
        const val custom = 2131362096
        const val customPanel = 2131362097
        const val cut = 2131362098
        const val dark = 2131362099
        const val date_picker_actions = 2131362100
        const val decelerate = 2131362101
        const val decelerateAndComplete = 2131362102
        const val decor_content_parent = 2131362103
        const val default_activity_button = 2131362104
        const val deltaRelative = 2131362105
        const val dependency_ordering = 2131362106
        const val design_bottom_sheet = 2131362107
        const val design_menu_item_action_area = 2131362108
        const val design_menu_item_action_area_stub = 2131362109
        const val design_menu_item_text = 2131362110
        const val design_navigation_view = 2131362111
        const val detailImageView = 2131362112
        const val dialog_button = 2131362113
        const val dimensions = 2131362114
        const val direct = 2131362115
        const val disableHome = 2131362116
        const val disableIntraAutoTransition = 2131362117
        const val disablePostScroll = 2131362118
        const val disableScroll = 2131362119
        const val disjoint = 2131362120
        const val display_always = 2131362121
        const val download_app = 2131362122
        const val download_app_txt = 2131362123
        const val download_child_episode_download = 2131362124
        const val download_child_episode_holder = 2131362125
        const val download_child_episode_play = 2131362126
        const val download_child_episode_progress = 2131362127
        const val download_child_episode_progress_downloaded = 2131362128
        const val download_child_episode_text = 2131362129
        const val download_child_episode_text_extra = 2131362130
        const val download_child_list = 2131362131
        const val download_child_root = 2131362132
        const val download_child_toolbar = 2131362133
        const val download_free = 2131362134
        const val download_free_txt = 2131362135
        const val download_header_episode_download = 2131362136
        const val download_header_goto_child = 2131362137
        const val download_header_info = 2131362138
        const val download_header_poster = 2131362139
        const val download_header_progress_downloaded = 2131362140
        const val download_header_title = 2131362141
        const val download_list = 2131362142
        const val download_loading = 2131362143
        const val download_root = 2131362144
        const val download_storage_appbar = 2131362145
        const val download_used = 2131362146
        const val download_used_txt = 2131362147
        const val dragAnticlockwise = 2131362148
        const val dragClockwise = 2131362149
        const val dragDown = 2131362150
        const val dragEnd = 2131362151
        const val dragLeft = 2131362152
        const val dragRight = 2131362153
        const val dragStart = 2131362154
        const val dragUp = 2131362155
        const val dropdown_menu = 2131362156
        const val easeIn = 2131362157
        const val easeInOut = 2131362158
        const val easeOut = 2131362159
        const val east = 2131362160
        const val editTextTextEmailAddress = 2131362161
        const val edit_query = 2131362162
        const val elastic = 2131362163
        const val end = 2131362164
        const val endToStart = 2131362165
        const val end_padder = 2131362166
        const val end_panel = 2131362167
        const val end_text = 2131362168
        const val end_text_container = 2131362169
        const val enterAlways = 2131362170
        const val enterAlwaysCollapsed = 2131362171
        const val episode_descript = 2131362172
        const val episode_filler = 2131362173
        const val episode_holder = 2131362174
        const val episode_play = 2131362175
        const val episode_poster = 2131362176
        const val episode_progress = 2131362177
        const val episode_rating = 2131362178
        const val episode_text = 2131362179
        const val exitUntilCollapsed = 2131362180
        const val exo_ad_overlay = 2131362181
        const val exo_artwork = 2131362182
        const val exo_audio_track = 2131362183
        const val exo_basic_controls = 2131362184
        const val exo_bottom_bar = 2131362185
        const val exo_buffering = 2131362186
        const val exo_center_controls = 2131362187
        const val exo_check = 2131362188
        const val exo_content_frame = 2131362189
        const val exo_controller = 2131362190
        const val exo_controller_placeholder = 2131362191
        const val exo_controls_background = 2131362192
        const val exo_duration = 2131362193
        const val exo_error_message = 2131362194
        const val exo_extra_controls = 2131362195
        const val exo_extra_controls_scroll_view = 2131362196
        const val exo_ffwd = 2131362197
        const val exo_ffwd_text = 2131362198
        const val exo_ffwd_with_amount = 2131362199
        const val exo_fullscreen = 2131362200
        const val exo_icon = 2131362201
        const val exo_main_text = 2131362202
        const val exo_minimal_controls = 2131362203
        const val exo_minimal_fullscreen = 2131362204
        const val exo_next = 2131362205
        const val exo_overflow_hide = 2131362206
        const val exo_overflow_show = 2131362207
        const val exo_overlay = 2131362208
        const val exo_pause = 2131362209
        const val exo_play = 2131362210
        const val exo_play_pause = 2131362211
        const val exo_playback_speed = 2131362212
        const val exo_position = 2131362213
        const val exo_prev = 2131362214
        const val exo_progress = 2131362215
        const val exo_progress_placeholder = 2131362216
        const val exo_repeat_toggle = 2131362217
        const val exo_rew = 2131362218
        const val exo_rew_text = 2131362219
        const val exo_rew_with_amount = 2131362220
        const val exo_settings = 2131362221
        const val exo_settings_listview = 2131362222
        const val exo_shuffle = 2131362223
        const val exo_shutter = 2131362224
        const val exo_sub_text = 2131362225
        const val exo_subtitle = 2131362226
        const val exo_subtitles = 2131362227
        const val exo_text = 2131362228
        const val exo_time = 2131362229
        const val exo_track_selection_view = 2131362230
        const val exo_vr = 2131362231
        const val expand_activities_button = 2131362232
        const val expanded_controller_layout = 2131362233
        const val expanded_menu = 2131362234
        const val fab_select = 2131362235
        const val fade = 2131362236
        const val fill = 2131362237
        const val fill_horizontal = 2131362238
        const val fill_vertical = 2131362239
        const val filled = 2131362240
        const val fit = 2131362241
        const val fitToContents = 2131362242
        const val fixed = 2131362243
        const val fixed_height = 2131362244
        const val fixed_width = 2131362245
        const val flip = 2131362246
        const val floating = 2131362247
        const val forever = 2131362248
        const val fragment_container_view_tag = 2131362249
        const val frame_download = 2131362250
        const val frost = 2131362251
        const val ghost_view = 2131362252
        const val ghost_view_holder = 2131362253
        const val glide_custom_view_target_tag = 2131362254
        const val global_to_navigation_chrome_subtitles = 2131362255
        const val global_to_navigation_downloads = 2131362256
        const val global_to_navigation_home = 2131362257
        const val global_to_navigation_livetv = 2131362258
        const val global_to_navigation_page = 2131362259
        const val global_to_navigation_player = 2131362260
        const val global_to_navigation_profile = 2131362261
        const val global_to_navigation_quick_search = 2131362262
        const val global_to_navigation_results = 2131362263
        const val global_to_navigation_results_tv = 2131362264
        const val global_to_navigation_settings = 2131362265
        const val global_to_navigation_subtitle_browser = 2131362266
        const val global_to_navigation_subtitles = 2131362267
        const val gone = 2131362268
        const val graph = 2131362269
        const val graph_wrap = 2131362270
        const val gridLayout = 2131362271
        const val gridView = 2131362272
        const val groupVisible = 2131362273
        const val group_divider = 2131362274
        const val grouping = 2131362275
        const val groups = 2131362276
        const val guide = 2131362277
        const val guideline = 2131362278
        const val hardware = 2131362279
        const val head_arrowImageView = 2131362280
        const val head_contentLayout = 2131362281
        const val head_lastUpdatedTextView = 2131362282
        const val head_progressBar = 2131362283
        const val head_tipsTextView = 2131362284
        const val header_refresh_time_container = 2131362285
        const val header_title = 2131362286
        const val hideable = 2131362287
        const val home = 2131362288
        const val homeAsUp = 2131362289
        const val homeRoot = 2131362290
        const val home_api_fab = 2131362291
        const val home_blur_poster = 2131362292
        const val home_bookmarked_child_more_info = 2131362293
        const val home_bookmarked_child_recyclerview = 2131362294
        const val home_bookmarked_holder = 2131362295
        const val home_change_api = 2131362296
        const val home_change_api_loading = 2131362297
        const val home_child_more_info = 2131362298
        const val home_child_recyclerview = 2131362299
        const val home_expanded_drag_down = 2131362300
        const val home_expanded_recycler = 2131362301
        const val home_expanded_text = 2131362302
        const val home_focus_text = 2131362303
        const val home_history_remove = 2131362304
        const val home_history_tab = 2131362305
        const val home_history_title = 2131362306
        const val home_key = 2131362307
        const val home_key_btn = 2131362308
        const val home_loaded = 2131362309
        const val home_loading = 2131362310
        const val home_loading_error = 2131362311
        const val home_loading_shimmer = 2131362312
        const val home_loading_statusbar = 2131362313
        const val home_main_holder = 2131362314
        const val home_main_info = 2131362315
        const val home_main_play = 2131362316
        const val home_main_poster = 2131362317
        const val home_main_poster_recyclerview = 2131362318
        const val home_main_save = 2131362319
        const val home_main_text = 2131362320
        const val home_master_recycler = 2131362321
        const val home_parent_item_title = 2131362322
        const val home_plan_to_watch_btt = 2131362323
        const val home_profile_picture = 2131362324
        const val home_profile_picture_holder = 2131362325
        const val home_provider_meta_info = 2131362326
        const val home_provider_name = 2131362327
        const val home_random = 2131362328
        const val home_reload_connection_open_in_browser = 2131362329
        const val home_reload_connectionerror = 2131362330
        const val home_root = 2131362331
        const val home_search = 2131362332
        const val home_select_anime = 2131362333
        const val home_select_asian = 2131362334
        const val home_select_cartoons = 2131362335
        const val home_select_documentaries = 2131362336
        const val home_select_movies = 2131362337
        const val home_select_tv_series = 2131362338
        const val home_settings_bar = 2131362339
        const val home_statusbar = 2131362340
        const val home_type_completed_btt = 2131362341
        const val home_type_dropped_btt = 2131362342
        const val home_type_on_hold_btt = 2131362343
        const val home_type_watching_btt = 2131362344
        const val home_watch_child_more_info = 2131362345
        const val home_watch_child_recyclerview = 2131362346
        const val home_watch_holder = 2131362347
        const val home_watch_parent_item_title = 2131362348
        const val honorRequest = 2131362349
        const val horizontal_only = 2131362350
        const val ic_arrow = 2131362351
        const val ic_open = 2131362352
        const val icon = 2131362353
        const val icon_frame = 2131362354
        const val icon_group = 2131362355
        const val icon_only = 2131362356
        const val icon_view = 2131362357
        const val ifRoom = 2131362358
        const val ignore = 2131362359
        const val ignoreRequest = 2131362360
        const val image = 2131362361
        const val imageText = 2131362362
        const val imageTextExtra = 2131362363
        const val imageTextProvider = 2131362364
        const val imageView = 2131362365
        const val imageView10 = 2131362366
        const val imageView11 = 2131362367
        const val imageView2 = 2131362368
        const val imageView3 = 2131362369
        const val imageView7 = 2131362370
        const val imgBack = 2131362371
        const val imgBackground = 2131362372
        const val imgPoster = 2131362373
        const val imgRank = 2131362374
        const val immediateStop = 2131362375
        const val included = 2131362376
        const val info = 2131362377
        const val inline = 2131362378
        const val inner_parent_layout = 2131362379
        const val interstitial_control_button = 2131362380
        const val interstitial_control_view = 2131362381
        const val invisible = 2131362382
        const val inward = 2131362383
        const val italic = 2131362384
        const val item_icon = 2131362385
        const val item_touch_helper_previous_elevation = 2131362386
        const val jumpToEnd = 2131362387
        const val jumpToStart = 2131362388
        const val labeled = 2131362389
        const val large = 2131362390
        const val last_refresh_time = 2131362391
        const val layout = 2131362392
        const val layoutNameProvider = 2131362393
        const val layoutPage = 2131362394
        const val layoutRoot = 2131362395
        const val left = 2131362396
        const val leftToRight = 2131362397
        const val left_to_right = 2131362398
        const val legacy = 2131362399
        const val light = 2131362400
        const val line = 2131362401
        const val line1 = 2131362402
        const val line3 = 2131362403
        const val linear = 2131362404
        const val linearLayout = 2131362405
        const val linearLayout5 = 2131362406
        const val listMode = 2131362407
        const val listView = 2131362408
        const val list_item = 2131362409
        const val listview1 = 2131362410
        const val listview2 = 2131362411
        const val listview_foot_more = 2131362412
        const val listview_foot_progress = 2131362413
        const val listview_header_arrow = 2131362414
        const val listview_header_content = 2131362415
        const val listview_header_progressbar = 2131362416
        const val listview_header_text = 2131362417
        const val live_indicator_dot = 2131362418
        const val live_indicator_text = 2131362419
        const val live_indicators = 2131362420
        const val livetv_autofit_results = 2131362421
        const val livetv_back = 2131362422
        const val livetv_loading_bar = 2131362423
        const val livetv_root = 2131362424
        const val loading = 2131362425
        const val loading_indicator = 2131362426
        const val locale = 2131362427
        const val login_email_input = 2131362428
        const val login_password_input = 2131362429
        const val login_server_input = 2131362430
        const val login_username_input = 2131362431
        const val lottie_layer_name = 2131362432
        const val ltr = 2131362433
        const val main_load = 2131362434
        const val main_search = 2131362435
        const val masked = 2131362436
        const val match_constraint = 2131362437
        const val match_parent = 2131362438
        const val material_clock_display = 2131362439
        const val material_clock_face = 2131362440
        const val material_clock_hand = 2131362441
        const val material_clock_period_am_button = 2131362442
        const val material_clock_period_pm_button = 2131362443
        const val material_clock_period_toggle = 2131362444
        const val material_hour_text_input = 2131362445
        const val material_hour_tv = 2131362446
        const val material_label = 2131362447
        const val material_minute_text_input = 2131362448
        const val material_minute_tv = 2131362449
        const val material_textinput_timepicker = 2131362450
        const val material_timepicker_cancel_button = 2131362451
        const val material_timepicker_container = 2131362452
        const val material_timepicker_edit_text = 2131362453
        const val material_timepicker_mode_button = 2131362454
        const val material_timepicker_ok_button = 2131362455
        const val material_timepicker_view = 2131362456
        const val material_value_index = 2131362457
        const val media_actions = 2131362458
        const val media_controller_compat_view_tag = 2131362459
        const val media_route_button = 2131362460
        const val media_route_button_holder = 2131362461
        const val media_route_menu_item = 2131362462
        const val message = 2131362463
        const val messenger_send_button = 2131362464
        const val middle = 2131362465
        const val mini = 2131362466
        const val mobile_navigation = 2131362467
        const val month_grid = 2131362468
        const val month_navigation_bar = 2131362469
        const val month_navigation_fragment_toggle = 2131362470
        const val month_navigation_next = 2131362471
        const val month_navigation_previous = 2131362472
        const val month_title = 2131362473
        const val motion_base = 2131362474
        const val mr_art = 2131362475
        const val mr_cast_checkbox = 2131362476
        const val mr_cast_close_button = 2131362477
        const val mr_cast_divider = 2131362478
        const val mr_cast_group_icon = 2131362479
        const val mr_cast_group_name = 2131362480
        const val mr_cast_group_progress_bar = 2131362481
        const val mr_cast_header_name = 2131362482
        const val mr_cast_list = 2131362483
        const val mr_cast_meta_art = 2131362484
        const val mr_cast_meta_background = 2131362485
        const val mr_cast_meta_black_scrim = 2131362486
        const val mr_cast_meta_subtitle = 2131362487
        const val mr_cast_meta_title = 2131362488
        const val mr_cast_mute_button = 2131362489
        const val mr_cast_route_icon = 2131362490
        const val mr_cast_route_name = 2131362491
        const val mr_cast_route_progress_bar = 2131362492
        const val mr_cast_stop_button = 2131362493
        const val mr_cast_volume_layout = 2131362494
        const val mr_cast_volume_slider = 2131362495
        const val mr_chooser_list = 2131362496
        const val mr_chooser_route_desc = 2131362497
        const val mr_chooser_route_icon = 2131362498
        const val mr_chooser_route_name = 2131362499
        const val mr_chooser_title = 2131362500
        const val mr_close = 2131362501
        const val mr_control_divider = 2131362502
        const val mr_control_playback_ctrl = 2131362503
        const val mr_control_subtitle = 2131362504
        const val mr_control_title = 2131362505
        const val mr_control_title_container = 2131362506
        const val mr_custom_control = 2131362507
        const val mr_default_control = 2131362508
        const val mr_dialog_area = 2131362509
        const val mr_expandable_area = 2131362510
        const val mr_group_expand_collapse = 2131362511
        const val mr_group_volume_route_name = 2131362512
        const val mr_media_main_control = 2131362513
        const val mr_name = 2131362514
        const val mr_picker_close_button = 2131362515
        const val mr_picker_header_name = 2131362516
        const val mr_picker_list = 2131362517
        const val mr_picker_route_icon = 2131362518
        const val mr_picker_route_name = 2131362519
        const val mr_picker_route_progress_bar = 2131362520
        const val mr_playback_control = 2131362521
        const val mr_title_bar = 2131362522
        const val mr_volume_control = 2131362523
        const val mr_volume_group_list = 2131362524
        const val mr_volume_item_icon = 2131362525
        const val mr_volume_slider = 2131362526
        const val mrec_ad_view_container = 2131362527
        const val mrec_control_button = 2131362528
        const val mrec_control_view = 2131362529
        const val mtrl_anchor_parent = 2131362530
        const val mtrl_calendar_day_selector_frame = 2131362531
        const val mtrl_calendar_days_of_week = 2131362532
        const val mtrl_calendar_frame = 2131362533
        const val mtrl_calendar_main_pane = 2131362534
        const val mtrl_calendar_months = 2131362535
        const val mtrl_calendar_selection_frame = 2131362536
        const val mtrl_calendar_text_input_frame = 2131362537
        const val mtrl_calendar_year_selector_frame = 2131362538
        const val mtrl_card_checked_layer_id = 2131362539
        const val mtrl_child_content_container = 2131362540
        const val mtrl_internal_children_alpha_tag = 2131362541
        const val mtrl_motion_snapshot_view = 2131362542
        const val mtrl_picker_fullscreen = 2131362543
        const val mtrl_picker_header = 2131362544
        const val mtrl_picker_header_selection_text = 2131362545
        const val mtrl_picker_header_title_and_selection = 2131362546
        const val mtrl_picker_header_toggle = 2131362547
        const val mtrl_picker_text_input_date = 2131362548
        const val mtrl_picker_text_input_range_end = 2131362549
        const val mtrl_picker_text_input_range_start = 2131362550
        const val mtrl_picker_title_text = 2131362551
        const val mtrl_view_tag_bottom_padding = 2131362552
        const val multiply = 2131362553
        const val native_ad_content_linear_layout = 2131362554
        const val native_body_text_view = 2131362555
        const val native_cta_button = 2131362556
        const val native_icon_and_text_layout = 2131362557
        const val native_icon_image_view = 2131362558
        const val native_icon_view = 2131362559
        const val native_leader_icon_and_text_layout = 2131362560
        const val native_media_content_view = 2131362561
        const val native_title_text_view = 2131362562
        const val nav_controller_view_tag = 2131362563
        const val nav_host_fragment = 2131362564
        const val nav_host_fragment_container = 2131362565
        const val nav_rail_view = 2131362566
        const val nav_view = 2131362567
        const val navigation_bar_item_active_indicator_view = 2131362568
        const val navigation_bar_item_icon_container = 2131362569
        const val navigation_bar_item_icon_view = 2131362570
        const val navigation_bar_item_labels_group = 2131362571
        const val navigation_bar_item_large_label_view = 2131362572
        const val navigation_bar_item_small_label_view = 2131362573
        const val navigation_browser_subtitle = 2131362574
        const val navigation_chrome_subtitles = 2131362575
        const val navigation_download_child = 2131362576
        const val navigation_downloads = 2131362577
        const val navigation_header_container = 2131362578
        const val navigation_home = 2131362579
        const val navigation_live_tv = 2131362580
        const val navigation_page = 2131362581
        const val navigation_player = 2131362582
        const val navigation_profile = 2131362583
        const val navigation_quick_search = 2131362584
        const val navigation_results = 2131362585
        const val navigation_results_tv = 2131362586
        const val navigation_search = 2131362587
        const val navigation_settings = 2131362588
        const val navigation_settings_account = 2131362589
        const val navigation_settings_general = 2131362590
        const val navigation_settings_lang = 2131362591
        const val navigation_settings_player = 2131362592
        const val navigation_settings_ui = 2131362593
        const val navigation_settings_updates = 2131362594
        const val navigation_subtitles = 2131362595
        const val never = 2131362596
        const val neverCompleteToEnd = 2131362597
        const val neverCompleteToStart = 2131362598
        const val never_display = 2131362599
        const val nginx_text_input = 2131362600
        const val noScroll = 2131362601
        const val noState = 2131362602
        const val none = 2131362603
        const val normal = 2131362604
        const val north = 2131362605
        const val notification_background = 2131362606
        const val notification_main_column = 2131362607
        const val notification_main_column_container = 2131362608
        const val off = 2131362609

        /* renamed from: on */
        const val f9911on = 2131362610
        const val onInterceptTouchReturnSwipe = 2131362611
        const val one = 2131362612
        const val open_graph = 2131362613
        const val options_view = 2131362614
        const val outline = 2131362615
        const val outward = 2131362616
        const val overlay_loading_skip_button = 2131362617
        const val overshoot = 2131362618
        const val packed = 2131362619
        const val paddingViewStatusBar = 2131362620
        const val page = 2131362621
        const val parallax = 2131362622
        const val parent = 2131362623
        const val parentPanel = 2131362624
        const val parentRelative = 2131362625
        const val parent_matrix = 2131362626
        const val password_toggle = 2131362627
        const val path = 2131362628
        const val pathRelative = 2131362629
        const val peekHeight = 2131362630
        const val percent = 2131362631
        const val pin = 2131362632
        const val player_background = 2131362633
        const val player_buffering = 2131362634
        const val player_center_menu = 2131362635
        const val player_episode_filler = 2131362636
        const val player_episode_filler_holder = 2131362637
        const val player_ffwd_holder = 2131362638
        const val player_fullscreen = 2131362639
        const val player_go_back = 2131362640
        const val player_go_back_holder = 2131362641
        const val player_holder = 2131362642
        const val player_intro_play = 2131362643
        const val player_loading_go_back = 2131362644
        const val player_loading_overlay = 2131362645
        const val player_lock = 2131362646
        const val player_lock_holder = 2131362647
        const val player_open_source = 2131362648
        const val player_pause_play = 2131362649
        const val player_pause_play_holder = 2131362650
        const val player_pause_play_holder_holder = 2131362651
        const val player_progressbar_left = 2131362652
        const val player_progressbar_left_holder = 2131362653
        const val player_progressbar_left_icon = 2131362654
        const val player_progressbar_right = 2131362655
        const val player_progressbar_right_holder = 2131362656
        const val player_progressbar_right_icon = 2131362657
        const val player_resize_btt = 2131362658
        const val player_rew_holder = 2131362659
        const val player_skip_episode = 2131362660
        const val player_skip_op = 2131362661
        const val player_sources_btt = 2131362662
        const val player_speed_btt = 2131362663
        const val player_subtitle_offset_btt = 2131362664
        const val player_time_menu = 2131362665
        const val player_time_text = 2131362666
        const val player_time_text_left = 2131362667
        const val player_top_holder = 2131362668
        const val player_torrent_info = 2131362669
        const val player_video_bar = 2131362670
        const val player_video_holder = 2131362671
        const val player_video_title = 2131362672
        const val player_video_title_live = 2131362673
        const val player_video_title_rez = 2131362674
        const val player_view = 2131362675
        const val position = 2131362676
        const val postLayout = 2131362677
        const val posterBlurHeader = 2131362678
        const val preset = 2131362679
        const val progressBar = 2131362680
        const val progress_bar = 2131362681
        const val progress_circular = 2131362682
        const val progress_horizontal = 2131362683
        const val quick_search = 2131362684
        const val quick_search_autofit_results = 2131362685
        const val quick_search_back = 2131362686
        const val quick_search_loading_bar = 2131362687
        const val quick_search_master_recycler = 2131362688
        const val quick_search_root = 2131362689
        const val radial = 2131362690
        const val radio = 2131362691
        const val ratio = 2131362692
        const val rcvBlurFilter = 2131362693
        const val rectangles = 2131362694
        const val recycler_view = 2131362695
        const val refresh_status_textview = 2131362696
        const val regular = 2131362697
        const val remove_site = 2131362698
        const val restart = 2131362699
        const val result_add_sync = 2131362700
        const val result_back = 2131362701
        const val result_bookmark_button = 2131362702
        const val result_bookmark_fab = 2131362703
        const val result_cast_items = 2131362704
        const val result_cast_text = 2131362705
        const val result_coming_soon = 2131362706
        const val result_data_holder = 2131362707
        const val result_description = 2131362708
        const val result_director_text = 2131362709
        const val result_download_movie = 2131362710
        const val result_dub_select = 2131362711
        const val result_episode_download = 2131362712
        const val result_episode_loading = 2131362713
        const val result_episode_progress_downloaded = 2131362714
        const val result_episode_select = 2131362715
        const val result_episodes = 2131362716
        const val result_episodes_tab = 2131362717
        const val result_episodes_text = 2131362718
        const val result_error_text = 2131362719
        const val result_finish_loading = 2131362720
        const val result_fullscreen_holder = 2131362721
        const val result_info = 2131362722
        const val result_loading = 2131362723
        const val result_loading_error = 2131362724
        const val result_main_holder = 2131362725
        const val result_meta_duration = 2131362726
        const val result_meta_rating = 2131362727
        const val result_meta_site = 2131362728
        const val result_meta_status = 2131362729
        const val result_meta_type = 2131362730
        const val result_meta_year = 2131362731
        const val result_mini_sync = 2131362732
        const val result_movie_download_icon = 2131362733
        const val result_movie_download_text = 2131362734
        const val result_movie_download_text_precentage = 2131362735
        const val result_movie_parent = 2131362736
        const val result_movie_progress_downloaded = 2131362737
        const val result_movie_progress_downloaded_holder = 2131362738
        const val result_next_series_button = 2131362739
        const val result_open_in_browser = 2131362740
        const val result_overlapping_panels = 2131362741
        const val result_play_movie = 2131362742
        const val result_poster = 2131362743
        const val result_poster_blur = 2131362744
        const val result_poster_blur_holder = 2131362745
        const val result_poster_holder = 2131362746
        const val result_recommendations = 2131362747
        const val result_recommendations_1 = 2131362748
        const val result_recommendations_btt = 2131362749
        const val result_recommendations_filter_button = 2131362750
        const val result_reload_connection_open_in_browser = 2131362751
        const val result_reload_connectionerror = 2131362752
        const val result_resume_progress_holder = 2131362753
        const val result_resume_series_button = 2131362754
        const val result_resume_series_progress = 2131362755
        const val result_resume_series_progress_text = 2131362756
        const val result_resume_series_title = 2131362757
        const val result_root = 2131362758
        const val result_scroll = 2131362759
        const val result_search = 2131362760
        const val result_season_button = 2131362761
        const val result_series_parent = 2131362762
        const val result_share = 2131362763
        const val result_smallscreen_holder = 2131362764
        const val result_sync_add_episode = 2131362765
        const val result_sync_check = 2131362766
        const val result_sync_current_episodes = 2131362767
        const val result_sync_episodes = 2131362768
        const val result_sync_holder = 2131362769
        const val result_sync_loading_shimmer = 2131362770
        const val result_sync_max_episodes = 2131362771
        const val result_sync_names = 2131362772
        const val result_sync_rating = 2131362773
        const val result_sync_score_text = 2131362774
        const val result_sync_set_score = 2131362775
        const val result_sync_sub_episode = 2131362776
        const val result_tag = 2131362777
        const val result_tag_card = 2131362778
        const val result_tag_holder = 2131362779
        const val result_title = 2131362780
        const val result_top_bar = 2131362781
        const val result_trailer_loading = 2131362782
        const val result_vpn = 2131362783
        const val reverse = 2131362784
        const val reverseSawtooth = 2131362785
        const val rewarded_control_button = 2131362786
        const val rewarded_control_view = 2131362787
        const val rewarded_interstitial_control_button = 2131362788
        const val rewarded_interstitial_control_view = 2131362789
        const val rg_selected = 2131362790
        const val right = 2131362791
        const val rightToLeft = 2131362792
        const val right_icon = 2131362793
        const val right_side = 2131362794
        const val right_to_left = 2131362795
        const val rl_file_root = 2131362796
        const val rl_folder_details = 2131362797
        const val rl_no_files = 2131362798
        const val rl_progress = 2131362799
        const val rounded = 2131362800
        const val roundedImageView2 = 2131362801
        const val row_index_key = 2131362802
        const val rtl = 2131362803
        const val rv_dir_path = 2131362804
        const val rv_files = 2131362805
        const val save_btt = 2131362806
        const val save_non_transition_alpha = 2131362807
        const val save_overlay_view = 2131362808
        const val sawtooth = 2131362809
        const val scale = 2131362810
        const val screen = 2131362811
        const val scroll = 2131362812
        const val scrollIndicatorDown = 2131362813
        const val scrollIndicatorUp = 2131362814
        const val scrollView = 2131362815
        const val scrollable = 2131362816
        const val scrollview = 2131362817
        const val searchFrameLayout = 2131362818
        const val searchIcon = 2131362819
        const val searchRoot = 2131362820
        const val search_autofit_results = 2131362821
        const val search_badge = 2131362822
        const val search_bar = 2131362823
        const val search_button = 2131362824
        const val search_close_btn = 2131362825
        const val search_edit_frame = 2131362826
        const val search_filter = 2131362827
        const val search_go_btn = 2131362828
        const val search_history_recycler = 2131362829
        const val search_item_download_play = 2131362830
        const val search_loading_bar = 2131362831
        const val search_mag_icon = 2131362832
        const val search_master_recycler = 2131362833
        const val search_plate = 2131362834
        const val search_result_root = 2131362835
        const val search_select_anime = 2131362836
        const val search_select_asian = 2131362837
        const val search_select_cartoons = 2131362838
        const val search_select_documentaries = 2131362839
        const val search_select_movies = 2131362840
        const val search_select_tv_series = 2131362841
        const val search_src_text = 2131362842
        const val search_voice_btn = 2131362843
        const val seek_bar = 2131362844
        const val seek_bar_indicators = 2131362845
        const val seekbar = 2131362846
        const val seekbar_value = 2131362847
        const val select_dialog_listview = 2131362848
        const val selected = 2131362849
        const val selection_type = 2131362850
        const val settings_credits = 2131362851
        const val settings_general = 2131362852
        const val settings_lang = 2131362853
        const val settings_player = 2131362854
        const val settings_profile = 2131362855
        const val settings_profile_pic = 2131362856
        const val settings_profile_text = 2131362857
        const val settings_toolbar = 2131362858
        const val settings_top_root = 2131362859
        const val settings_ui = 2131362860
        const val settings_updates = 2131362861
        const val shades_divider = 2131362862
        const val shades_layout = 2131362863
        const val shadow_overlay = 2131362864
        const val sharedValueSet = 2131362865
        const val sharedValueUnset = 2131362866
        const val shortcut = 2131362867
        const val showCustom = 2131362868
        const val showHome = 2131362869
        const val showTitle = 2131362870
        const val sin = 2131362871
        const val site_lang_input = 2131362872
        const val site_name_input = 2131362873
        const val site_url_input = 2131362874
        const val skipCollapsed = 2131362875
        const val skipped = 2131362876
        const val slide = 2131362877
        const val sliding_pane_detail_container = 2131362878
        const val sliding_pane_layout = 2131362879
        const val small = 2131362880
        const val snackbar_action = 2131362881
        const val snackbar_text = 2131362882
        const val snap = 2131362883
        const val snapMargins = 2131362884
        const val software = 2131362885
        const val sort_providers = 2131362886
        const val sort_sources_holder = 2131362887
        const val sort_subtitles = 2131362888
        const val sort_subtitles_holder = 2131362889
        const val south = 2131362890
        const val spacer = 2131362891
        const val special_effects_controller_view_tag = 2131362892
        const val spherical_gl_surface_view = 2131362893
        const val spinner = 2131362894
        const val spline = 2131362895
        const val split_action_bar = 2131362896
        const val spread = 2131362897
        const val spread_inside = 2131362898
        const val spring = 2131362899
        const val square = 2131362900
        const val src_atop = 2131362901
        const val src_in = 2131362902
        const val src_over = 2131362903
        const val standard = 2131362904
        const val start = 2131362905
        const val startHorizontal = 2131362906
        const val startToEnd = 2131362907
        const val startVertical = 2131362908
        const val start_panel = 2131362909
        const val start_text = 2131362910
        const val start_text_container = 2131362911
        const val staticLayout = 2131362912
        const val staticPostLayout = 2131362913
        const val status_bar_latest_event_content = 2131362914
        const val status_text = 2131362915
        const val status_textview = 2131362916
        const val stop = 2131362917
        const val stretch = 2131362918
        const val submenuarrow = 2131362919
        const val submit_area = 2131362920
        const val subs_auto_select_language = 2131362921
        const val subs_background_color = 2131362922
        const val subs_download_languages = 2131362923
        const val subs_edge_type = 2131362924
        const val subs_font = 2131362925
        const val subs_font_size = 2131362926
        const val subs_import_text = 2131362927
        const val subs_outline_color = 2131362928
        const val subs_root = 2131362929
        const val subs_subtitle_elevation = 2131362930
        const val subs_text_color = 2131362931
        const val subs_window_color = 2131362932
        const val subtitle_adapter = 2131362933
        const val subtitle_holder = 2131362934
        const val subtitle_offset_add = 2131362935
        const val subtitle_offset_input = 2131362936
        const val subtitle_offset_sub_title = 2131362937
        const val subtitle_offset_subtract = 2131362938
        const val subtitle_text = 2131362939
        const val subtitle_view = 2131362940
        const val subtitles_click_settings = 2131362941
        const val subtitles_encoding_format = 2131362942
        const val subtitles_remove_bloat = 2131362943
        const val subtitles_remove_captions = 2131362944
        const val subtitles_search = 2131362945
        const val supportScrollUp = 2131362946
        const val surface_view = 2131362947
        const val swipe = 2131362948
        const val switchWidget = 2131362949
        const val tabLayout = 2131362950
        const val tabMode = 2131362951
        const val tab_host = 2131362952
        const val tag_accessibility_actions = 2131362953
        const val tag_accessibility_clickable_spans = 2131362954
        const val tag_accessibility_heading = 2131362955
        const val tag_accessibility_pane_title = 2131362956
        const val tag_on_apply_window_listener = 2131362957
        const val tag_on_receive_content_listener = 2131362958
        const val tag_on_receive_content_mime_types = 2131362959
        const val tag_screen_reader_focusable = 2131362960
        const val tag_state_description = 2131362961
        const val tag_transition_group = 2131362962
        const val tag_unhandled_key_event_manager = 2131362963
        const val tag_unhandled_key_listeners = 2131362964
        const val tag_window_insets_animation_callback = 2131362965
        const val test_checkbox_android_button_tint = 2131362966
        const val test_checkbox_app_button_tint = 2131362967
        const val test_radiobutton_android_button_tint = 2131362968
        const val test_radiobutton_app_button_tint = 2131362969
        const val text = 2131362970
        const val text1 = 2131362971
        const val text2 = 2131362972
        const val textEnd = 2131362973
        const val textSpacerNoButtons = 2131362974
        const val textSpacerNoTitle = 2131362975
        const val textStart = 2131362976
        const val textTitle = 2131362977
        const val textTop = 2131362978
        const val textView12 = 2131362979
        const val textView13 = 2131362980
        const val textView14 = 2131362981
        const val textView15 = 2131362982
        const val textView16 = 2131362983
        const val textView17 = 2131362984
        const val textView18 = 2131362985
        const val textView24 = 2131362986
        const val text_input_end_icon = 2131362987
        const val text_input_error_icon = 2131362988
        const val text_input_start_icon = 2131362989
        const val text_is_dub = 2131362990
        const val text_is_sub = 2131362991
        const val text_list_view = 2131362992
        const val text_no_downloads = 2131362993
        const val text_quality = 2131362994
        const val textinput_counter = 2131362995
        const val textinput_error = 2131362996
        const val textinput_helper_text = 2131362997
        const val textinput_placeholder = 2131362998
        const val textinput_prefix_text = 2131362999
        const val textinput_suffix_text = 2131363000
        const val texture_view = 2131363001
        const val time = 2131363002
        const val time_text_right = 2131363003
        const val title = 2131363004
        const val titleDividerNoCustom = 2131363005
        const val title_shadow = 2131363006
        const val title_template = 2131363007
        const val title_view = 2131363008
        const val toast_layout_root = 2131363009
        const val toggle = 2131363010
        const val toggle1 = 2131363011
        const val toolbar = 2131363012
        const val tooltip = 2131363013
        const val tooltip_container = 2131363014
        const val top = 2131363015
        const val topMenuRight = 2131363016
        const val topPanel = 2131363017
        const val top_to_bottom = 2131363018
        const val touch_outside = 2131363019
        const val transitionToEnd = 2131363020
        const val transitionToStart = 2131363021
        const val transition_current_scene = 2131363022
        const val transition_layout_save = 2131363023
        const val transition_position = 2131363024
        const val transition_scene_layoutid_cache = 2131363025
        const val transition_transform = 2131363026
        const val transparency_layout = 2131363027
        const val transparency_seekbar = 2131363028
        const val transparency_text = 2131363029
        const val transparency_title = 2131363030
        const val triangle = 2131363031
        const val tvAds = 2131363032
        const val tvAdvance = 2131363033
        const val tvChangePassword = 2131363034
        const val tvContact = 2131363035
        const val tvCountry = 2131363036
        const val tvDes = 2131363037
        const val tvDownload = 2131363038
        const val tvDuration = 2131363039
        const val tvExpire = 2131363040
        const val tvFAQ = 2131363041
        const val tvGenre = 2131363042
        const val tvGreeting = 2131363043
        const val tvGuide = 2131363044
        const val tvInfo = 2131363045
        const val tvLevel = 2131363046
        const val tvLiveTV = 2131363047
        const val tvMore = 2131363048
        const val tvName = 2131363049
        const val tvPremium = 2131363050
        const val tvPricing = 2131363051
        const val tvPrivacy = 2131363052
        const val tvProfile = 2131363053
        const val tvQuality = 2131363054
        const val tvRate = 2131363055
        const val tvShare = 2131363056
        const val tvStep1 = 2131363057
        const val tvStep2 = 2131363058
        const val tvSupport = 2131363059
        const val tvTimeAds = 2131363060
        const val tvTitle = 2131363061
        const val tvTitleMovie = 2131363062
        const val tvUnit = 2131363063
        const val tvUsername = 2131363064
        const val tvVersion = 2131363065
        const val tvWebsite = 2131363066
        const val tvYear = 2131363067
        const val tv_date = 2131363068
        const val tv_dir_name = 2131363069
        const val tv_file_name = 2131363070
        const val tv_folder_name = 2131363071
        const val tv_mess = 2131363072
        const val tv_num_files = 2131363073
        const val txtConfig = 2131363074
        const val unchecked = 2131363075
        const val uniform = 2131363076
        const val unknown = 2131363077
        const val unlabeled = 2131363078

        /* renamed from: up */
        const val f9912up = 2131363079
        const val upgradeBtn = 2131363080
        const val useLogo = 2131363081
        const val vertical_only = 2131363082
        const val video_decoder_gl_surface_view = 2131363083
        const val video_go_back_holder_holder = 2131363084
        const val video_torrent_progress = 2131363085
        const val video_torrent_seeders = 2131363086
        const val view7 = 2131363087
        const val view_offset_helper = 2131363088
        const val view_transition = 2131363089
        const val view_tree_lifecycle_owner = 2131363090
        const val view_tree_on_back_pressed_dispatcher_owner = 2131363091
        const val view_tree_saved_state_registry_owner = 2131363092
        const val view_tree_view_model_store_owner = 2131363093
        const val viewpager = 2131363094
        const val visible = 2131363095
        const val visible_removing_fragment_view_tag = 2131363096
        const val voice_actor_image = 2131363097
        const val voice_actor_image_holder = 2131363098
        const val voice_actor_name = 2131363099
        const val volume_item_container = 2131363100
        const val watchProgress = 2131363101
        const val webReview = 2131363102
        const val webview = 2131363103
        const val west = 2131363104
        const val when_playing = 2131363105
        const val wide = 2131363106
        const val withText = 2131363107
        const val withinBounds = 2131363108
        const val wrap = 2131363109
        const val wrap_content = 2131363110
        const val wrap_content_constrained = 2131363111
        const val wrapper = 2131363112
        const val wrapperHome = 2131363113
        const val x_left = 2131363114
        const val x_right = 2131363115
        const val zero_corner_chip = 2131363116
        const val zoom = 2131363117
    }

    /* renamed from: com.lagradost.cloudstream3.R$integer */ /* loaded from: classes3.dex */
    object integer {
        const val abc_config_activityDefaultDur = 2131427328
        const val abc_config_activityShortDur = 2131427329
        const val app_bar_elevation_anim_duration = 2131427330
        const val bottom_sheet_slide_duration = 2131427331
        const val cancel_button_image_alpha = 2131427332
        const val cast_libraries_material_featurehighlight_pulse_base_alpha = 2131427333
        const val config_navAnimTime = 2131427334
        const val config_tooltipAnimTime = 2131427335
        const val design_snackbar_text_max_lines = 2131427336
        const val design_tab_indicator_anim_duration_ms = 2131427337
        const val exo_media_button_opacity_percentage_disabled = 2131427338
        const val exo_media_button_opacity_percentage_enabled = 2131427339
        const val google_play_services_version = 2131427340
        const val hide_password_duration = 2131427341
        const val loading_time = 2131427342
        const val m3_btn_anim_delay_ms = 2131427343
        const val m3_btn_anim_duration_ms = 2131427344
        const val m3_card_anim_delay_ms = 2131427345
        const val m3_card_anim_duration_ms = 2131427346
        const val m3_chip_anim_duration = 2131427347
        const val m3_sys_motion_duration_long1 = 2131427348
        const val m3_sys_motion_duration_long2 = 2131427349
        const val m3_sys_motion_duration_medium1 = 2131427350
        const val m3_sys_motion_duration_medium2 = 2131427351
        const val m3_sys_motion_duration_short1 = 2131427352
        const val m3_sys_motion_duration_short2 = 2131427353
        const val m3_sys_motion_path = 2131427354
        const val m3_sys_shape_large_corner_family = 2131427355
        const val m3_sys_shape_medium_corner_family = 2131427356
        const val m3_sys_shape_small_corner_family = 2131427357
        const val material_motion_duration_long_1 = 2131427358
        const val material_motion_duration_long_2 = 2131427359
        const val material_motion_duration_medium_1 = 2131427360
        const val material_motion_duration_medium_2 = 2131427361
        const val material_motion_duration_short_1 = 2131427362
        const val material_motion_duration_short_2 = 2131427363
        const val material_motion_path = 2131427364
        const val mr_cast_volume_slider_layout_animation_duration_ms = 2131427365
        const val mr_controller_volume_group_list_animation_duration_ms = 2131427366
        const val mr_controller_volume_group_list_fade_in_duration_ms = 2131427367
        const val mr_controller_volume_group_list_fade_out_duration_ms = 2131427368
        const val mr_update_routes_delay_ms = 2131427369
        const val mtrl_badge_max_character_count = 2131427370
        const val mtrl_btn_anim_delay_ms = 2131427371
        const val mtrl_btn_anim_duration_ms = 2131427372
        const val mtrl_calendar_header_orientation = 2131427373
        const val mtrl_calendar_selection_text_lines = 2131427374
        const val mtrl_calendar_year_selector_span = 2131427375
        const val mtrl_card_anim_delay_ms = 2131427376
        const val mtrl_card_anim_duration_ms = 2131427377
        const val mtrl_chip_anim_duration = 2131427378
        const val mtrl_tab_indicator_anim_duration_ms = 2131427379
        const val mtrl_view_gone = 2131427380
        const val mtrl_view_invisible = 2131427381
        const val mtrl_view_visible = 2131427382
        const val show_password_duration = 2131427383
        const val status_bar_notification_info_maxnum = 2131427384
    }

    /* renamed from: com.lagradost.cloudstream3.R$interpolator */ /* loaded from: classes3.dex */
    object C4765interpolator {
        const val btn_checkbox_checked_mtrl_animation_interpolator_0 = 2131492864
        const val btn_checkbox_checked_mtrl_animation_interpolator_1 = 2131492865
        const val btn_checkbox_unchecked_mtrl_animation_interpolator_0 = 2131492866
        const val btn_checkbox_unchecked_mtrl_animation_interpolator_1 = 2131492867
        const val btn_radio_to_off_mtrl_animation_interpolator_0 = 2131492868
        const val btn_radio_to_on_mtrl_animation_interpolator_0 = 2131492869
        const val fast_out_slow_in = 2131492870
        const val mr_fast_out_slow_in = 2131492871
        const val mr_linear_out_slow_in = 2131492872
        const val mtrl_fast_out_linear_in = 2131492873
        const val mtrl_fast_out_slow_in = 2131492874
        const val mtrl_linear = 2131492875
        const val mtrl_linear_out_slow_in = 2131492876
    }

    /* renamed from: com.lagradost.cloudstream3.R$layout */ /* loaded from: classes3.dex */
    object C4766layout {
        const val abc_action_bar_title_item = 2131558400
        const val abc_action_bar_up_container = 2131558401
        const val abc_action_menu_item_layout = 2131558402
        const val abc_action_menu_layout = 2131558403
        const val abc_action_mode_bar = 2131558404
        const val abc_action_mode_close_item_material = 2131558405
        const val abc_activity_chooser_view = 2131558406
        const val abc_activity_chooser_view_list_item = 2131558407
        const val abc_alert_dialog_button_bar_material = 2131558408
        const val abc_alert_dialog_material = 2131558409
        const val abc_alert_dialog_title_material = 2131558410
        const val abc_cascading_menu_item_layout = 2131558411
        const val abc_dialog_title_material = 2131558412
        const val abc_expanded_menu_layout = 2131558413
        const val abc_list_menu_item_checkbox = 2131558414
        const val abc_list_menu_item_icon = 2131558415
        const val abc_list_menu_item_layout = 2131558416
        const val abc_list_menu_item_radio = 2131558417
        const val abc_popup_menu_header_item_layout = 2131558418
        const val abc_popup_menu_item_layout = 2131558419
        const val abc_screen_content_include = 2131558420
        const val abc_screen_simple = 2131558421
        const val abc_screen_simple_overlay_action_mode = 2131558422
        const val abc_screen_toolbar = 2131558423
        const val abc_search_dropdown_item_icons_2line = 2131558424
        const val abc_search_view = 2131558425
        const val abc_select_dialog_material = 2131558426
        const val abc_tooltip = 2131558427
        const val account_managment = 2131558428
        const val account_single = 2131558429
        const val account_switch = 2131558430
        const val activity_main = 2131558431
        const val activity_main_tv = 2131558432
        const val add_account_input = 2131558433
        const val add_remove_sites = 2131558434
        const val add_site_input = 2131558435
        const val bottom_input_dialog = 2131558436
        const val bottom_selection_dialog = 2131558437
        const val browser_actions_context_menu_page = 2131558438
        const val browser_actions_context_menu_row = 2131558439
        const val cast_expanded_controller_activity = 2131558440
        const val cast_help_text = 2131558441
        const val cast_intro_overlay = 2131558442
        const val cast_item = 2131558443
        const val cast_mini_controller = 2131558444
        const val cast_tracks_chooser_dialog_layout = 2131558445
        const val cast_tracks_chooser_dialog_row_layout = 2131558446
        const val chromecast_subtitle_settings = 2131558447
        const val com_facebook_activity_layout = 2131558448
        const val com_facebook_device_auth_dialog_fragment = 2131558449
        const val com_facebook_login_fragment = 2131558450
        const val com_facebook_smart_device_dialog_fragment = 2131558451
        const val com_facebook_tooltip_bubble = 2131558452
        const val cpv_color_item_circle = 2131558453
        const val cpv_color_item_square = 2131558454
        const val cpv_dialog_color_picker = 2131558455
        const val cpv_dialog_presets = 2131558456
        const val cpv_preference_circle = 2131558457
        const val cpv_preference_circle_large = 2131558458
        const val cpv_preference_square = 2131558459
        const val cpv_preference_square_large = 2131558460
        const val custom_dialog = 2131558461
        const val design_bottom_navigation_item = 2131558462
        const val design_bottom_sheet_dialog = 2131558463
        const val design_layout_snackbar = 2131558464
        const val design_layout_snackbar_include = 2131558465
        const val design_layout_tab_icon = 2131558466
        const val design_layout_tab_text = 2131558467
        const val design_menu_item_action_area = 2131558468
        const val design_navigation_item = 2131558469
        const val design_navigation_item_header = 2131558470
        const val design_navigation_item_separator = 2131558471
        const val design_navigation_item_subheader = 2131558472
        const val design_navigation_menu = 2131558473
        const val design_navigation_menu_item = 2131558474
        const val design_text_input_end_icon = 2131558475
        const val design_text_input_start_icon = 2131558476
        const val dialog_loading = 2131558477
        const val dialog_online_subtitles = 2131558478
        const val dialog_page = 2131558479
        const val dialog_upgrade_layout = 2131558480
        const val download_child_episode = 2131558481
        const val download_header_episode = 2131558482
        const val empty_layout = 2131558483
        const val exo_list_divider = 2131558484
        const val exo_player_control_view = 2131558485
        const val exo_player_view = 2131558486
        const val exo_styled_player_control_ffwd_button = 2131558487
        const val exo_styled_player_control_rewind_button = 2131558488
        const val exo_styled_player_control_view = 2131558489
        const val exo_styled_player_view = 2131558490
        const val exo_styled_settings_list = 2131558491
        const val exo_styled_settings_list_item = 2131558492
        const val exo_styled_sub_settings_list_item = 2131558493
        const val exo_track_selection_dialog = 2131558494
        const val expand_button = 2131558495
        const val filter_item_layout = 2131558496
        const val fragment_child_downloads = 2131558497
        const val fragment_downloads = 2131558498
        const val fragment_home = 2131558499
        const val fragment_home_tv = 2131558500
        const val fragment_player = 2131558501
        const val fragment_player_tv = 2131558502
        const val fragment_result = 2131558503
        const val fragment_result_swipe = 2131558504
        const val fragment_result_swipe_tv = 2131558505
        const val fragment_result_tv = 2131558506
        const val fragment_search = 2131558507
        const val fragment_subtitle_browser = 2131558508
        const val fragment_trailer = 2131558509
        const val fragment_tv = 2131558510
        const val home_episodes_expanded = 2131558511
        const val home_result_big_grid = 2131558512
        const val home_result_circle_grid = 2131558513
        const val home_result_full_width_grid = 2131558514
        const val home_result_grid = 2131558515
        const val home_result_grid_expanded = 2131558516
        const val home_result_long_width_grid = 2131558517
        const val home_result_top_grid = 2131558518
        const val home_result_tv_long_width_grid = 2131558519
        const val home_select_mainpage = 2131558520
        const val homepage_parent = 2131558521
        const val homepage_parent_tv = 2131558522
        const val image_frame = 2131558523
        const val item_selection = 2131558524
        const val layout_premium = 2131558525
        const val layout_upgrade_item = 2131558526
        const val list_item_detail = 2131558527
        const val list_item_right_detail = 2131558528
        const val list_section = 2131558529
        const val list_section_centered = 2131558530
        const val list_view = 2131558531
        const val listview_footer = 2131558532
        const val listview_header = 2131558533
        const val loading_downloads = 2131558534
        const val loading_episode = 2131558535
        const val loading_line = 2131558536
        const val loading_line_short = 2131558537
        const val loading_line_short_center = 2131558538
        const val loading_list = 2131558539
        const val loading_poster = 2131558540
        const val loadmore = 2131558541
        const val logcat = 2131558542
        const val m3_alert_dialog = 2131558543
        const val m3_alert_dialog_actions = 2131558544
        const val m3_alert_dialog_title = 2131558545
        const val main_settings = 2131558546
        const val material_chip_input_combo = 2131558547
        const val material_clock_display = 2131558548
        const val material_clock_display_divider = 2131558549
        const val material_clock_period_toggle = 2131558550
        const val material_clock_period_toggle_land = 2131558551
        const val material_clockface_textview = 2131558552
        const val material_clockface_view = 2131558553
        const val material_radial_view_group = 2131558554
        const val material_textinput_timepicker = 2131558555
        const val material_time_chip = 2131558556
        const val material_time_input = 2131558557
        const val material_timepicker = 2131558558
        const val material_timepicker_dialog = 2131558559
        const val material_timepicker_textinput_display = 2131558560
        const val max_native_ad_banner_icon_and_text_layout = 2131558561
        const val max_native_ad_banner_view = 2131558562
        const val max_native_ad_leader_view = 2131558563
        const val max_native_ad_media_banner_view = 2131558564
        const val max_native_ad_mrec_view = 2131558565
        const val max_native_ad_vertical_banner_view = 2131558566
        const val max_native_ad_vertical_leader_view = 2131558567
        const val max_native_ad_vertical_media_banner_view = 2131558568
        const val mediation_debugger_ad_unit_detail_activity = 2131558569
        const val mediation_debugger_multi_ad_activity = 2131558570
        const val messenger_button_send_blue_large = 2131558571
        const val messenger_button_send_blue_round = 2131558572
        const val messenger_button_send_blue_small = 2131558573
        const val messenger_button_send_white_large = 2131558574
        const val messenger_button_send_white_round = 2131558575
        const val messenger_button_send_white_small = 2131558576
        const val mr_cast_dialog = 2131558577
        const val mr_cast_group_item = 2131558578
        const val mr_cast_group_volume_item = 2131558579
        const val mr_cast_header_item = 2131558580
        const val mr_cast_media_metadata = 2131558581
        const val mr_cast_route_item = 2131558582
        const val mr_chooser_dialog = 2131558583
        const val mr_chooser_list_item = 2131558584
        const val mr_controller_material_dialog_b = 2131558585
        const val mr_controller_volume_item = 2131558586
        const val mr_picker_dialog = 2131558587
        const val mr_picker_header_item = 2131558588
        const val mr_picker_route_item = 2131558589
        const val mr_playback_control = 2131558590
        const val mr_volume_control = 2131558591
        const val mtrl_alert_dialog = 2131558592
        const val mtrl_alert_dialog_actions = 2131558593
        const val mtrl_alert_dialog_title = 2131558594
        const val mtrl_alert_select_dialog_item = 2131558595
        const val mtrl_alert_select_dialog_multichoice = 2131558596
        const val mtrl_alert_select_dialog_singlechoice = 2131558597
        const val mtrl_calendar_day = 2131558598
        const val mtrl_calendar_day_of_week = 2131558599
        const val mtrl_calendar_days_of_week = 2131558600
        const val mtrl_calendar_horizontal = 2131558601
        const val mtrl_calendar_month = 2131558602
        const val mtrl_calendar_month_labeled = 2131558603
        const val mtrl_calendar_month_navigation = 2131558604
        const val mtrl_calendar_months = 2131558605
        const val mtrl_calendar_vertical = 2131558606
        const val mtrl_calendar_year = 2131558607
        const val mtrl_layout_snackbar = 2131558608
        const val mtrl_layout_snackbar_include = 2131558609
        const val mtrl_navigation_rail_item = 2131558610
        const val mtrl_picker_actions = 2131558611
        const val mtrl_picker_dialog = 2131558612
        const val mtrl_picker_fullscreen = 2131558613
        const val mtrl_picker_header_dialog = 2131558614
        const val mtrl_picker_header_fullscreen = 2131558615
        const val mtrl_picker_header_selection_text = 2131558616
        const val mtrl_picker_header_title_text = 2131558617
        const val mtrl_picker_header_toggle = 2131558618
        const val mtrl_picker_text_input_date = 2131558619
        const val mtrl_picker_text_input_date_range = 2131558620
        const val notification_action = 2131558621
        const val notification_action_tombstone = 2131558622
        const val notification_media_action = 2131558623
        const val notification_media_cancel_action = 2131558624
        const val notification_template_big_media = 2131558625
        const val notification_template_big_media_custom = 2131558626
        const val notification_template_big_media_narrow = 2131558627
        const val notification_template_big_media_narrow_custom = 2131558628
        const val notification_template_custom_big = 2131558629
        const val notification_template_icon_group = 2131558630
        const val notification_template_lines_media = 2131558631
        const val notification_template_media = 2131558632
        const val notification_template_media_custom = 2131558633
        const val notification_template_part_chronometer = 2131558634
        const val notification_template_part_time = 2131558635
        const val options_popup_tv = 2131558636
        const val player_custom_layout = 2131558637
        const val player_custom_layout_tv = 2131558638
        const val player_select_source_and_subs = 2131558639
        const val preference = 2131558640
        const val preference_category = 2131558641
        const val preference_category_material = 2131558642
        const val preference_dialog_edittext = 2131558643
        const val preference_dropdown = 2131558644
        const val preference_dropdown_material = 2131558645
        const val preference_information = 2131558646
        const val preference_information_material = 2131558647
        const val preference_list_fragment = 2131558648
        const val preference_material = 2131558649
        const val preference_recyclerview = 2131558650
        const val preference_widget_checkbox = 2131558651
        const val preference_widget_seekbar = 2131558652
        const val preference_widget_seekbar_material = 2131558653
        const val preference_widget_switch = 2131558654
        const val preference_widget_switch_compat = 2131558655
        const val profile_fragment = 2131558656
        const val provider_list = 2131558657
        const val pull_to_refresh_head = 2131558658
        const val quick_search = 2131558659
        const val result_episode = 2131558660
        const val result_episode_large = 2131558661
        const val result_mini_image = 2131558662
        const val result_poster = 2131558663
        const val result_recommendations = 2131558664
        const val result_recommendations_tv = 2131558665
        const val result_sync = 2131558666
        const val result_tag = 2131558667
        const val search_history_item = 2131558668
        const val search_result_compact = 2131558669
        const val search_result_grid = 2131558670
        const val search_result_grid_expanded = 2131558671
        const val search_result_super_compact = 2131558672
        const val select_dialog_item_material = 2131558673
        const val select_dialog_multichoice_material = 2131558674
        const val select_dialog_singlechoice_material = 2131558675
        const val server_activity = 2131558676
        const val settings_title_top = 2131558677
        const val sort_bottom_footer_add_choice = 2131558678
        const val sort_bottom_sheet = 2131558679
        const val sort_bottom_single_choice = 2131558680
        const val sort_bottom_single_choice_color = 2131558681
        const val splash_activity = 2131558682
        const val subtitle_offset = 2131558683
        const val subtitle_settings = 2131558684
        const val support_simple_spinner_dropdown_item = 2131558685
        const val test_action_chip = 2131558686
        const val test_chip_zero_corner_radius = 2131558687
        const val test_design_checkbox = 2131558688
        const val test_design_radiobutton = 2131558689
        const val test_navigation_bar_item_layout = 2131558690
        const val test_reflow_chipgroup = 2131558691
        const val test_toolbar = 2131558692
        const val test_toolbar_custom_background = 2131558693
        const val test_toolbar_elevation = 2131558694
        const val test_toolbar_surface = 2131558695
        const val text_view_with_line_height_from_appearance = 2131558696
        const val text_view_with_line_height_from_layout = 2131558697
        const val text_view_with_line_height_from_style = 2131558698
        const val text_view_with_theme_line_height = 2131558699
        const val text_view_without_line_height = 2131558700
        const val toast = 2131558701
        const val trailer_custom_layout = 2131558702
        const val unicorn_activity_file_picker = 2131558703
        const val unicorn_item_layout_directory = 2131558704
        const val unicorn_item_layout_directory_stack = 2131558705
        const val unicorn_item_layout_files = 2131558706
    }

    /* renamed from: com.lagradost.cloudstream3.R$menu */ /* loaded from: classes3.dex */
    object C4767menu {
        const val bottom_nav_menu = 2131623936
        const val cast_expanded_controller_menu = 2131623937
        const val mediation_debugger_activity_menu = 2131623938
        const val unicorn_menu_file_picker = 2131623939
    }

    /* renamed from: com.lagradost.cloudstream3.R$mipmap */ /* loaded from: classes3.dex */
    object mipmap {
        const val ic_banner = 2131689472
        const val ic_launcher = 2131689473
        const val ic_launcher_adaptive_back = 2131689474
        const val ic_launcher_adaptive_fore = 2131689475
        const val ic_launcher_round = 2131689476
        const val ic_launcher_round_adaptive_back = 2131689477
        const val ic_launcher_round_adaptive_fore = 2131689478
    }

    /* renamed from: com.lagradost.cloudstream3.R$navigation */ /* loaded from: classes3.dex */
    object C4768navigation {
        const val mobile_navigation = 2131755008
    }

    /* renamed from: com.lagradost.cloudstream3.R$plurals */ /* loaded from: classes3.dex */
    object plurals {
        const val exo_controls_fastforward_by_amount_description = 2131820544
        const val exo_controls_rewind_by_amount_description = 2131820545
        const val mtrl_badge_content_description = 2131820546
    }

    /* renamed from: com.lagradost.cloudstream3.R$raw */ /* loaded from: classes3.dex */
    object raw {
        const val animation = 2131886080
        const val dot = 2131886081
        const val family = 2131886082
        const val intro = 2131886083
        const val log_animation = 2131886084
        const val logo_animation = 2131886085
        const val maintenace = 2131886086
        const val newyear2022 = 2131886087
        const val red_lantern = 2131886088
        const val server = 2131886089
        const val ss = 2131886090
    }

    /* renamed from: com.lagradost.cloudstream3.R$string */ /* loaded from: classes3.dex */
    object string {
        const val abc_action_bar_home_description = 2131951616
        const val abc_action_bar_up_description = 2131951617
        const val abc_action_menu_overflow_description = 2131951618
        const val abc_action_mode_done = 2131951619
        const val abc_activity_chooser_view_see_all = 2131951620
        const val abc_activitychooserview_choose_application = 2131951621
        const val abc_capital_off = 2131951622
        const val abc_capital_on = 2131951623
        const val abc_menu_alt_shortcut_label = 2131951624
        const val abc_menu_ctrl_shortcut_label = 2131951625
        const val abc_menu_delete_shortcut_label = 2131951626
        const val abc_menu_enter_shortcut_label = 2131951627
        const val abc_menu_function_shortcut_label = 2131951628
        const val abc_menu_meta_shortcut_label = 2131951629
        const val abc_menu_shift_shortcut_label = 2131951630
        const val abc_menu_space_shortcut_label = 2131951631
        const val abc_menu_sym_shortcut_label = 2131951632
        const val abc_prepend_shortcut_label = 2131951633
        const val abc_search_hint = 2131951634
        const val abc_searchview_description_clear = 2131951635
        const val abc_searchview_description_query = 2131951636
        const val abc_searchview_description_search = 2131951637
        const val abc_searchview_description_submit = 2131951638
        const val abc_searchview_description_voice = 2131951639
        const val abc_shareactionprovider_share_with = 2131951640
        const val abc_shareactionprovider_share_with_application = 2131951641
        const val abc_toolbar_collapse_description = 2131951642
        const val account = 2131951643
        const val acra_report_toast = 2131951644
        const val action_add_to_bookmarks = 2131951645
        const val action_open_play = 2131951646
        const val action_open_watching = 2131951647
        const val action_remove_from_bookmarks = 2131951648
        const val action_remove_watching = 2131951649
        const val active_code_btn = 2131951650
        const val active_fail = 2131951651
        const val active_success_content = 2131951652
        const val active_success_title = 2131951653
        const val actor_background = 2131951654
        const val actor_main = 2131951655
        const val actor_supporting = 2131951656
        const val ad_tag_url = 2131951657
        const val add_account = 2131951658
        const val add_site_pref = 2131951659
        const val add_site_summary = 2131951660
        const val add_sync = 2131951661
        const val added_sync_format = 2131951662
        const val ads_will_show_after = 2131951663
        const val advanced_search = 2131951664
        const val advanced_search_des = 2131951665
        const val alert_stop_video = 2131951666
        const val all = 2131951667
        const val androidx_startup = 2131951668
        const val anilist_key = 2131951669
        const val anim = 2131951670
        const val anime = 2131951671
        const val anime_singular = 2131951672
        const val app_dub_sub_episode_text_format = 2131951673
        const val app_dubbed_text = 2131951674
        const val app_language = 2131951675
        const val app_layout = 2131951676
        const val app_layout_key = 2131951677
        const val app_name = 2131951678
        const val app_name_download_path = 2131951679
        const val app_storage = 2131951680
        const val app_subbed_text = 2131951681
        const val app_theme_key = 2131951682
        const val app_theme_settings = 2131951683
        const val app_version = 2131951684
        const val appbar_scrolling_view_behavior = 2131951685
        const val applovin_list_item_image_description = 2131951686
        const val asian_drama = 2131951687
        const val asian_drama_singular = 2131951688
        const val authenticated_user = 2131951689
        const val authenticated_user_fail = 2131951690
        const val auto_update_key = 2131951691
        const val automatic = 2131951692
        const val backup_failed = 2131951693
        const val backup_failed_error_format = 2131951694
        const val backup_key = 2131951695
        const val backup_settings = 2131951696
        const val backup_success = 2131951697
        const val ben_quality = 2131951698
        const val benene = 2131951699
        const val benene_count = 2131951700
        const val benene_count_text = 2131951701
        const val benene_count_text_none = 2131951702
        const val benene_des = 2131951703
        const val bottom_sheet_behavior = 2131951704
        const val bottom_title_key = 2131951705
        const val bottom_title_settings = 2131951706
        const val bottom_title_settings_des = 2131951707
        const val bottomsheet_action_expand_halfway = 2131951708
        const val bug_report_settings_off = 2131951709
        const val bug_report_settings_on = 2131951710
        const val bug_report_txt = 2131951711
        const val cancel = 2131951712
        const val cartoons = 2131951713
        const val cartoons_singular = 2131951714
        const val cast_ad_label = 2131951715
        const val cast_casting_to_device = 2131951716
        const val cast_closed_captions = 2131951717
        const val cast_closed_captions_unavailable = 2131951718
        const val cast_connecting_to_device = 2131951719
        const val cast_disconnect = 2131951720
        const val cast_dynamic_group_name_format = 2131951721
        const val cast_expanded_controller_ad_image_description = 2131951722
        const val cast_expanded_controller_ad_in_progress = 2131951723
        const val cast_expanded_controller_background_image = 2131951724
        const val cast_expanded_controller_live_head_description = 2131951725
        const val cast_expanded_controller_live_stream_indicator = 2131951726
        const val cast_expanded_controller_loading = 2131951727
        const val cast_expanded_controller_skip_ad_label = 2131951728
        const val cast_expanded_controller_skip_ad_text = 2131951729
        const val cast_format = 2131951730
        const val cast_forward = 2131951731
        const val cast_forward_10 = 2131951732
        const val cast_forward_30 = 2131951733
        const val cast_intro_overlay_button_text = 2131951734
        const val cast_invalid_stream_duration_text = 2131951735
        const val cast_invalid_stream_position_text = 2131951736
        const val cast_live_label = 2131951737
        const val cast_mute = 2131951738
        const val cast_notification_connected_message = 2131951739
        const val cast_notification_connecting_message = 2131951740
        const val cast_notification_default_channel_name = 2131951741
        const val cast_notification_disconnect = 2131951742
        const val cast_pause = 2131951743
        const val cast_play = 2131951744
        const val cast_rewind = 2131951745
        const val cast_rewind_10 = 2131951746
        const val cast_rewind_30 = 2131951747
        const val cast_seek_bar = 2131951748
        const val cast_skip_next = 2131951749
        const val cast_skip_prev = 2131951750
        const val cast_stop = 2131951751
        const val cast_stop_live_stream = 2131951752
        const val cast_tracks_chooser_dialog_audio = 2131951753
        const val cast_tracks_chooser_dialog_cancel = 2131951754
        const val cast_tracks_chooser_dialog_closed_captions = 2131951755
        const val cast_tracks_chooser_dialog_default_track_name = 2131951756
        const val cast_tracks_chooser_dialog_none = 2131951757
        const val cast_tracks_chooser_dialog_ok = 2131951758
        const val cast_tracks_chooser_dialog_subtitles = 2131951759
        const val cast_unmute = 2131951760
        const val category_account = 2131951761
        const val category_general = 2131951763
        const val category_player = 2131951764
        const val category_preferred_media_and_lang = 2131951765
        const val category_ui = 2131951766
        const val category_updates = 2131951767
        const val change_providers_img_des = 2131951768
        const val character_counter_content_description = 2131951769
        const val character_counter_overflowed_content_description = 2131951770
        const val character_counter_pattern = 2131951771
        const val check_for_update = 2131951772
        const val chip_text = 2131951773
        const val choose_episode = 2131951774
        const val chromecast_subtitles_settings = 2131951775
        const val chromecast_subtitles_settings_des = 2131951776
        const val clear_text_end_icon_content_description = 2131951777
        const val com_crashlytics_android_build_id = 2131951778
        const val com_facebook_device_auth_instructions = 2131951779
        const val com_facebook_image_download_unknown_error = 2131951780
        const val com_facebook_internet_permission_error_message = 2131951781
        const val com_facebook_internet_permission_error_title = 2131951782
        const val com_facebook_like_button_liked = 2131951783
        const val com_facebook_like_button_not_liked = 2131951784
        const val com_facebook_loading = 2131951785
        const val com_facebook_loginview_cancel_action = 2131951786
        const val com_facebook_loginview_log_in_button = 2131951787
        const val com_facebook_loginview_log_in_button_continue = 2131951788
        const val com_facebook_loginview_log_in_button_long = 2131951789
        const val com_facebook_loginview_log_out_action = 2131951790
        const val com_facebook_loginview_log_out_button = 2131951791
        const val com_facebook_loginview_logged_in_as = 2131951792
        const val com_facebook_loginview_logged_in_using_facebook = 2131951793
        const val com_facebook_send_button_text = 2131951794
        const val com_facebook_share_button_text = 2131951795
        const val com_facebook_smart_device_instructions = 2131951796
        const val com_facebook_smart_device_instructions_or = 2131951797
        const val com_facebook_smart_login_confirmation_cancel = 2131951798
        const val com_facebook_smart_login_confirmation_continue_as = 2131951799
        const val com_facebook_smart_login_confirmation_title = 2131951800
        const val com_facebook_tooltip_default = 2131951801
        const val coming_soon = 2131951802
        const val common_google_play_services_enable_button = 2131951803
        const val common_google_play_services_enable_text = 2131951804
        const val common_google_play_services_enable_title = 2131951805
        const val common_google_play_services_install_button = 2131951806
        const val common_google_play_services_install_text = 2131951807
        const val common_google_play_services_install_title = 2131951808
        const val common_google_play_services_notification_channel_name = 2131951809
        const val common_google_play_services_notification_ticker = 2131951810
        const val common_google_play_services_unknown_issue = 2131951811
        const val common_google_play_services_unsupported_text = 2131951812
        const val common_google_play_services_update_button = 2131951813
        const val common_google_play_services_update_text = 2131951814
        const val common_google_play_services_update_title = 2131951815
        const val common_google_play_services_updating_text = 2131951816
        const val common_google_play_services_wear_update_text = 2131951817
        const val common_open_on_phone = 2131951818
        const val common_signin_button_text = 2131951819
        const val common_signin_button_text_long = 2131951820
        const val confirm = 2131951821
        const val contact_us = 2131951822
        const val contact_us_page = 2131951823
        const val continue_watching = 2131951824
        const val copy = 2131951825
        const val copy_link_toast = 2131951826
        const val copy_toast_msg = 2131951827
        const val cpv_custom = 2131951828
        const val cpv_default_title = 2131951829
        const val cpv_presets = 2131951830
        const val cpv_select = 2131951831
        const val cpv_transparency = 2131951832
        const val create_account = 2131951833
        const val default_premium_price = 2131951834
        const val default_subtitles = 2131951835
        const val default_unlimited_price = 2131951836
        const val default_web_client_id = 2131951837
        const val delete = 2131951838
        const val delete_file = 2131951839
        const val delete_files = 2131951840
        const val delete_files_content = 2131951841
        const val delete_files_content_detail = 2131951842
        const val delete_message = 2131951843
        const val director_sample = 2131951844
        const val discord = 2131951845
        const val display_sub_key = 2131951846
        const val display_subbed_dubbed_settings = 2131951847
        const val dns_key = 2131951848
        const val dns_pref = 2131951849
        const val dns_pref_summary = 2131951850
        const val documentaries = 2131951851
        const val documentaries_singular = 2131951852
        const val dont_show_again = 2131951853
        const val double_tap_enabled_key = 2131951854
        const val double_tap_pause_enabled_key = 2131951855
        const val double_tap_seek_time_key = 2131951856
        const val double_tap_to_pause_settings = 2131951857
        const val double_tap_to_pause_settings_des = 2131951858
        const val double_tap_to_seek_amount_settings = 2131951859
        const val double_tap_to_seek_settings = 2131951860
        const val double_tap_to_seek_settings_des = 2131951861
        const val download = 2131951862
        const val download_canceled = 2131951863
        const val download_done = 2131951864
        const val download_failed = 2131951865
        const val download_format = 2131951866
        const val download_path_key = 2131951867
        const val download_path_pref = 2131951868
        const val download_paused = 2131951869
        const val download_size_format = 2131951870
        const val download_started = 2131951871
        const val download_storage_text = 2131951872
        const val download_text_option = 2131951873
        const val downloaded = 2131951874
        const val downloaded_file = 2131951875
        const val downloading = 2131951876
        const val duration = 2131951877
        const val duration_format = 2131951878
        const val eigengraumode_settings = 2131951879
        const val eigengraumode_settings_des = 2131951880
        const val emulator_layout = 2131951881
        const val episode = 2131951882
        const val episode_action_auto_download = 2131951883
        const val episode_action_chromecast_episode = 2131951884
        const val episode_action_chromecast_mirror = 2131951885
        const val episode_action_copy_link = 2131951886
        const val episode_action_download_mirror = 2131951887
        const val episode_action_download_subtitle = 2131951888
        const val episode_action_play_in_app = 2131951889
        const val episode_action_play_in_browser = 2131951890
        const val episode_action_play_in_vlc = 2131951891
        const val episode_action_reload_links = 2131951892
        const val episode_more_options_des = 2131951893
        const val episode_name_format = 2131951894
        const val episode_play_img_des = 2131951895
        const val episode_poster_img_des = 2131951896
        const val episode_short = 2131951897
        const val episode_sync_enabled_key = 2131951898
        const val episode_sync_settings = 2131951899
        const val episode_sync_settings_des = 2131951900
        const val episodes = 2131951901
        const val error = 2131951902
        const val error_bookmarks_text = 2131951903
        const val error_download = 2131951904
        const val error_icon_content_description = 2131951905
        const val error_invalid_data = 2131951906
        const val error_invalid_id = 2131951907
        const val error_loading_links_toast = 2131951908
        const val example_email = 2131951909
        const val example_ip = 2131951910
        const val example_lang_name = 2131951911
        const val example_password = 2131951912
        const val example_site_name = 2131951913
        const val example_site_url = 2131951914
        const val example_username = 2131951915
        const val exo_controls_cc_disabled_description = 2131951916
        const val exo_controls_cc_enabled_description = 2131951917
        const val exo_controls_custom_playback_speed = 2131951918
        const val exo_controls_fastforward_description = 2131951919
        const val exo_controls_fullscreen_enter_description = 2131951920
        const val exo_controls_fullscreen_exit_description = 2131951921
        const val exo_controls_hide = 2131951922
        const val exo_controls_next_description = 2131951923
        const val exo_controls_overflow_hide_description = 2131951924
        const val exo_controls_overflow_show_description = 2131951925
        const val exo_controls_pause_description = 2131951926
        const val exo_controls_play_description = 2131951927
        const val exo_controls_playback_speed = 2131951928
        const val exo_controls_playback_speed_normal = 2131951929
        const val exo_controls_previous_description = 2131951930
        const val exo_controls_repeat_all_description = 2131951931
        const val exo_controls_repeat_off_description = 2131951932
        const val exo_controls_repeat_one_description = 2131951933
        const val exo_controls_rewind_description = 2131951934
        const val exo_controls_seek_bar_description = 2131951935
        const val exo_controls_settings_description = 2131951936
        const val exo_controls_show = 2131951937
        const val exo_controls_shuffle_off_description = 2131951938
        const val exo_controls_shuffle_on_description = 2131951939
        const val exo_controls_stop_description = 2131951940
        const val exo_controls_time_placeholder = 2131951941
        const val exo_controls_vr_description = 2131951942
        const val exo_download_completed = 2131951943
        const val exo_download_description = 2131951944
        const val exo_download_downloading = 2131951945
        const val exo_download_failed = 2131951946
        const val exo_download_notification_channel_name = 2131951947
        const val exo_download_paused = 2131951948
        const val exo_download_paused_for_network = 2131951949
        const val exo_download_paused_for_wifi = 2131951950
        const val exo_download_removing = 2131951951
        const val exo_item_list = 2131951952
        const val exo_media_action_repeat_all_description = 2131951953
        const val exo_media_action_repeat_off_description = 2131951954
        const val exo_media_action_repeat_one_description = 2131951955
        const val exo_track_bitrate = 2131951956
        const val exo_track_mono = 2131951957
        const val exo_track_resolution = 2131951958
        const val exo_track_role_alternate = 2131951959
        const val exo_track_role_closed_captions = 2131951960
        const val exo_track_role_commentary = 2131951961
        const val exo_track_role_supplementary = 2131951962
        const val exo_track_selection_auto = 2131951963
        const val exo_track_selection_none = 2131951964
        const val exo_track_selection_title_audio = 2131951965
        const val exo_track_selection_title_text = 2131951966
        const val exo_track_selection_title_video = 2131951967
        const val exo_track_stereo = 2131951968
        const val exo_track_surround = 2131951969
        const val exo_track_surround_5_point_1 = 2131951970
        const val exo_track_surround_7_point_1 = 2131951971
        const val exo_track_unknown = 2131951972
        const val expand_button_title = 2131951973
        const val expired_code = 2131951974
        const val exposed_dropdown_menu_content_description = 2131951975
        const val extra_info_format = 2131951976
        const val extras = 2131951977
        const val fab_transformation_scrim_behavior = 2131951978
        const val fab_transformation_sheet_behavior = 2131951979
        const val facebook_app_id = 2131951980
        const val fallback_menu_item_copy_link = 2131951981
        const val fallback_menu_item_open_in_browser = 2131951982
        const val fallback_menu_item_share_link = 2131951983
        const val fast_forward_button_time_key = 2131951984
        const val fb_login_protocol_scheme = 2131951985
        const val fcm_fallback_notification_channel_label = 2131951986
        const val ffw_text_format = 2131951987
        const val ffw_text_regular_format = 2131951988
        const val filler = 2131951989
        const val filter_bookmarks = 2131951990
        const val free_storage = 2131951991
        const val free_text = 2131951992
        const val gcm_defaultSenderId = 2131951993
        const val github = 2131951994
        const val go_back = 2131951995
        const val go_back_30 = 2131951996
        const val go_back_img_des = 2131951997
        const val go_forward_30 = 2131951998
        const val google_api_key = 2131951999
        const val google_app_id = 2131952000
        const val google_crash_reporting_api_key = 2131952001
        const val google_storage_bucket = 2131952002
        const val guide_upgrade = 2131952003
        const val hide_bottom_view_on_scroll_behavior = 2131952004
        const val home_change_provider_img_des = 2131952005
        const val home_expanded_hide = 2131952006
        const val home_info = 2131952007
        const val home_main_poster_img_des = 2131952008
        const val home_more_info = 2131952009
        const val home_next_random_img_des = 2131952010
        const val home_play = 2131952011
        const val home_random = 2131952012
        const val home_source = 2131952013
        const val icon_content_description = 2131952014
        const val item_view_role_description = 2131952015
        const val keep_playing = 2131952016
        const val killswitch_key = 2131952017
        const val killswitch_settings = 2131952018
        const val killswitch_settings_des = 2131952019
        const val legal_notice = 2131952020
        const val legal_notice_key = 2131952021
        const val legal_notice_text = 2131952022
        const val lightnovel = 2131952023
        const val limit_title = 2131952024
        const val limit_title_rez = 2131952025
        const val list_episode = 2131952026
        const val listview_header_hint_normal = 2131952027
        const val listview_header_hint_release = 2131952028
        const val listview_header_last_time = 2131952029
        const val listview_loading = 2131952030
        const val live = 2131952031
        const val live_title = 2131952032
        const val live_tv_amp_sports = 2131952033
        const val loading_chromecast = 2131952034
        const val loading_done = 2131952035
        const val loading_movie = 2131952036
        const val locale_key = 2131952037
        const val log_enabled_key = 2131952038
        const val login = 2131952039
        const val login_format = 2131952040
        const val logout = 2131952041
        const val m3_ref_typeface_brand_display_regular = 2131952042
        const val m3_ref_typeface_brand_medium = 2131952043
        const val m3_ref_typeface_brand_regular = 2131952044
        const val m3_ref_typeface_plain_medium = 2131952045
        const val m3_ref_typeface_plain_regular = 2131952046
        const val m3_sys_motion_easing_accelerated = 2131952047
        const val m3_sys_motion_easing_decelerated = 2131952048
        const val m3_sys_motion_easing_emphasized = 2131952049
        const val m3_sys_motion_easing_linear = 2131952050
        const val m3_sys_motion_easing_standard = 2131952051
        const val m3_sys_typescale_body_large_font = 2131952052
        const val m3_sys_typescale_body_medium_font = 2131952053
        const val m3_sys_typescale_body_small_font = 2131952054
        const val m3_sys_typescale_display_large_font = 2131952055
        const val m3_sys_typescale_display_medium_font = 2131952056
        const val m3_sys_typescale_display_small_font = 2131952057
        const val m3_sys_typescale_headline_large_font = 2131952058
        const val m3_sys_typescale_headline_medium_font = 2131952059
        const val m3_sys_typescale_headline_small_font = 2131952060
        const val m3_sys_typescale_label_large_font = 2131952061
        const val m3_sys_typescale_label_medium_font = 2131952062
        const val m3_sys_typescale_label_small_font = 2131952063
        const val m3_sys_typescale_title_large_font = 2131952064
        const val m3_sys_typescale_title_medium_font = 2131952065
        const val m3_sys_typescale_title_small_font = 2131952066
        const val mal_key = 2131952067
        const val manual_check_update_key = 2131952068
        const val material_clock_display_divider = 2131952069
        const val material_clock_toggle_content_description = 2131952070
        const val material_hour_selection = 2131952071
        const val material_hour_suffix = 2131952072
        const val material_minute_selection = 2131952073
        const val material_minute_suffix = 2131952074
        const val material_motion_easing_accelerated = 2131952075
        const val material_motion_easing_decelerated = 2131952076
        const val material_motion_easing_emphasized = 2131952077
        const val material_motion_easing_linear = 2131952078
        const val material_motion_easing_standard = 2131952079
        const val material_slider_range_end = 2131952080
        const val material_slider_range_start = 2131952081
        const val material_timepicker_am = 2131952082
        const val material_timepicker_clock_mode_description = 2131952083
        const val material_timepicker_hour = 2131952084
        const val material_timepicker_minute = 2131952085
        const val material_timepicker_pm = 2131952086
        const val material_timepicker_select_time = 2131952087
        const val material_timepicker_text_input_mode_description = 2131952088
        const val max = 2131952089
        const val mb_format = 2131952090
        const val menu_country = 2131952091
        const val menu_genre = 2131952092
        const val messenger_send_button_text = 2131952093
        const val min = 2131952094
        const val movies = 2131952095
        const val movies_singular = 2131952096
        const val mr_button_content_description = 2131952097
        const val mr_cast_button_connected = 2131952098
        const val mr_cast_button_connecting = 2131952099
        const val mr_cast_button_disconnected = 2131952100
        const val mr_cast_dialog_title_view_placeholder = 2131952101
        const val mr_chooser_searching = 2131952102
        const val mr_chooser_title = 2131952103
        const val mr_controller_album_art = 2131952104
        const val mr_controller_casting_screen = 2131952105
        const val mr_controller_close_description = 2131952106
        const val mr_controller_collapse_group = 2131952107
        const val mr_controller_disconnect = 2131952108
        const val mr_controller_expand_group = 2131952109
        const val mr_controller_no_info_available = 2131952110
        const val mr_controller_no_media_selected = 2131952111
        const val mr_controller_pause = 2131952112
        const val mr_controller_play = 2131952113
        const val mr_controller_stop = 2131952114
        const val mr_controller_stop_casting = 2131952115
        const val mr_controller_volume_slider = 2131952116
        const val mr_dialog_default_group_name = 2131952117
        const val mr_dialog_groupable_header = 2131952118
        const val mr_dialog_transferable_header = 2131952119
        const val mr_system_route_name = 2131952120
        const val mr_user_route_category_name = 2131952121
        const val mtrl_badge_numberless_content_description = 2131952122
        const val mtrl_chip_close_icon_content_description = 2131952123
        const val mtrl_exceed_max_badge_number_content_description = 2131952124
        const val mtrl_exceed_max_badge_number_suffix = 2131952125
        const val mtrl_picker_a11y_next_month = 2131952126
        const val mtrl_picker_a11y_prev_month = 2131952127
        const val mtrl_picker_announce_current_selection = 2131952128
        const val mtrl_picker_cancel = 2131952129
        const val mtrl_picker_confirm = 2131952130
        const val mtrl_picker_date_header_selected = 2131952131
        const val mtrl_picker_date_header_title = 2131952132
        const val mtrl_picker_date_header_unselected = 2131952133
        const val mtrl_picker_day_of_week_column_header = 2131952134
        const val mtrl_picker_invalid_format = 2131952135
        const val mtrl_picker_invalid_format_example = 2131952136
        const val mtrl_picker_invalid_format_use = 2131952137
        const val mtrl_picker_invalid_range = 2131952138
        const val mtrl_picker_navigate_to_year_description = 2131952139
        const val mtrl_picker_out_of_range = 2131952140
        const val mtrl_picker_range_header_only_end_selected = 2131952141
        const val mtrl_picker_range_header_only_start_selected = 2131952142
        const val mtrl_picker_range_header_selected = 2131952143
        const val mtrl_picker_range_header_title = 2131952144
        const val mtrl_picker_range_header_unselected = 2131952145
        const val mtrl_picker_save = 2131952146
        const val mtrl_picker_text_input_date_hint = 2131952147
        const val mtrl_picker_text_input_date_range_end_hint = 2131952148
        const val mtrl_picker_text_input_date_range_start_hint = 2131952149
        const val mtrl_picker_text_input_day_abbr = 2131952150
        const val mtrl_picker_text_input_month_abbr = 2131952151
        const val mtrl_picker_text_input_year_abbr = 2131952152
        const val mtrl_picker_toggle_to_calendar_input_mode = 2131952153
        const val mtrl_picker_toggle_to_day_selection = 2131952154
        const val mtrl_picker_toggle_to_text_input_mode = 2131952155
        const val mtrl_picker_toggle_to_year_selection = 2131952156
        const val mtrl_timepicker_confirm = 2131952157
        const val n_i_dung_t_ng_t = 2131952158
        const val nav_app_bar_navigate_up_description = 2131952159
        const val nav_app_bar_open_drawer_description = 2131952160
        const val new_update_format = 2131952161
        const val next_episode = 2131952162
        const val nginx_info_summary = 2131952163
        const val nginx_info_title = 2131952164
        const val nginx_key = 2131952165
        const val nginx_url_pref = 2131952166
        const val no_ads = 2131952167
        const val no_chromecast_support_toast = 2131952168
        const val no_data = 2131952169
        const val no_episodes_found = 2131952170
        const val no_links_found_toast = 2131952171
        const val no_season = 2131952172
        const val no_subtitles = 2131952173
        const val no_update_found = 2131952174
        const val nomore_loading = 2131952175
        const val none = 2131952176
        const val normal = 2131952177
        const val normal_no_plot = 2131952178
        const val not_set = 2131952179
        const val ok = 2131952180
        const val open_browser_load_subtitle = 2131952181
        const val open_in_browser = 2131952182
        const val opensubtitles_key = 2131952183
        const val ova = 2131952184
        const val ova_singular = 2131952185
        const val override_site_key = 2131952186
        const val password_toggle_content_description = 2131952187
        const val path_password_eye = 2131952188
        const val path_password_eye_mask_strike_through = 2131952189
        const val path_password_eye_mask_visible = 2131952190
        const val path_password_strike_through = 2131952191
        const val pause = 2131952192
        const val pay_with_momo = 2131952193
        const val pay_with_paypal = 2131952194
        const val peryear = 2131952195
        const val phone_layout = 2131952196
        const val pick_source = 2131952197
        const val pick_subtitle = 2131952198
        const val picture_in_picture = 2131952199
        const val picture_in_picture_des = 2131952200
        const val pip_enabled_key = 2131952201
        const val play_episode = 2131952202
        const val play_episode_toast = 2131952203
        const val play_movie_button = 2131952204
        const val play_torrent_button = 2131952205
        const val playback_speed_enabled_key = 2131952206
        const val player_load_subtitles = 2131952207
        const val player_load_subtitles_online = 2131952208
        const val player_loaded_subtitles = 2131952209
        const val player_resize_enabled_key = 2131952210
        const val player_size_settings = 2131952211
        const val player_size_settings_des = 2131952212
        const val player_speed = 2131952213
        const val player_speed_text_format = 2131952214
        const val player_subtitles_settings = 2131952215
        const val player_subtitles_settings_des = 2131952216
        const val please_fill_key = 2131952217
        const val popup_delete_file = 2131952218
        const val popup_pause_download = 2131952219
        const val popup_play_file = 2131952220
        const val popup_resume_download = 2131952221
        const val poster_image = 2131952222
        const val poster_ui_key = 2131952223
        const val poster_ui_settings = 2131952224
        const val pref_disable_acra = 2131952225
        const val prefer_limit_title_key = 2131952226
        const val prefer_limit_title_rez_key = 2131952227
        const val prefer_media_type_key = 2131952228
        const val preference_copied = 2131952229
        const val preferred_media_settings = 2131952230
        const val premium_plan = 2131952231
        const val prerelease_commit_hash = 2131952232
        const val prerelease_update_key = 2131952233
        const val preview_background_img_des = 2131952234
        const val primary_color_key = 2131952235
        const val primary_color_settings = 2131952236
        const val project_id = 2131952237
        const val provider_info_meta = 2131952238
        const val provider_lang_key = 2131952239
        const val provider_lang_settings = 2131952240
        const val quality_4k = 2131952241
        const val quality_blueray = 2131952242
        const val quality_cam = 2131952243
        const val quality_cam_hd = 2131952244
        const val quality_cam_rip = 2131952245
        const val quality_dvd = 2131952246
        const val quality_hd = 2131952247
        const val quality_hdr = 2131952248
        const val quality_hq = 2131952249
        const val quality_pref_key = 2131952250
        const val quality_sd = 2131952251
        const val quality_sdr = 2131952252
        const val quality_tc = 2131952253
        const val quality_ts = 2131952254
        const val quality_uhd = 2131952255
        const val quality_webrip = 2131952256
        const val quality_workprint = 2131952257
        const val queued = 2131952258
        const val random_button_key = 2131952259
        const val random_button_settings = 2131952260
        const val random_button_settings_desc = 2131952261
        const val rated_format = 2131952262
        const val rating = 2131952263
        const val rating_format = 2131952264
        const val recommended = 2131952265
        const val refresh_done = 2131952266
        const val refreshing = 2131952267
        const val reload_error = 2131952268
        const val remote_error = 2131952269
        const val remove_site_pref = 2131952270
        const val render_error = 2131952271
        const val resize_fill = 2131952272
        const val resize_fit = 2131952273
        const val resize_zoom = 2131952274
        const val resolution = 2131952275
        const val resolution_and_title = 2131952276
        const val restore_failed_format = 2131952277
        const val restore_key = 2131952278
        const val restore_settings = 2131952279
        const val restore_success = 2131952280
        const val result_open_in_browser = 2131952281
        const val result_plot = 2131952282
        const val result_poster_img_des = 2131952283
        const val result_share = 2131952284
        const val result_tags = 2131952285
        const val resume = 2131952286
        const val resume_time_left = 2131952287
        const val reviews = 2131952288
        const val rew_text_format = 2131952289
        const val rew_text_regular_format = 2131952290
        const val search = 2131952291
        const val search_hint = 2131952292
        const val search_hint_site = 2131952293
        const val search_menu_title = 2131952294
        const val search_poster_img_des = 2131952295
        const val search_provider_text_providers = 2131952296
        const val search_provider_text_types = 2131952297
        const val search_providers_list_key = 2131952298
        const val search_subtitle = 2131952299
        const val search_types_list_key = 2131952300
        const val season = 2131952301
        const val season_short = 2131952302
        const val see_more = 2131952303
        const val select_payment_method = 2131952304
        const val server_maintance_text = 2131952305
        const val settings_info = 2131952306
        const val show_dub = 2131952307
        const val show_dub_key = 2131952308
        const val show_fillers_key = 2131952309
        const val show_fillers_settings = 2131952310
        const val show_hd = 2131952311
        const val show_hd_key = 2131952312
        const val show_log_cat = 2131952313
        const val show_logcat_key = 2131952314
        const val show_sub = 2131952315
        const val show_sub_key = 2131952316
        const val show_title = 2131952317
        const val show_title_key = 2131952318
        const val show_trailers_key = 2131952319
        const val show_trailers_settings = 2131952320
        const val site = 2131952321
        const val skip_loading = 2131952322
        const val skip_update = 2131952323
        const val skip_update_key = 2131952324
        const val sort_apply = 2131952325
        const val sort_cancel = 2131952326
        const val sort_clear = 2131952327
        const val sort_close = 2131952328
        const val sort_copy = 2131952329
        const val sort_save = 2131952330
        const val source_error = 2131952331
        const val ss_missing_saf_activity_handler = 2131952332
        const val ss_please_grant_storage_permission = 2131952333
        const val ss_please_select_root_storage_primary = 2131952334
        const val ss_please_select_root_storage_sdcard = 2131952335
        const val ss_selecting_root_path_success_with_open_folder_picker = 2131952336
        const val ss_selecting_root_path_success_without_open_folder_picker = 2131952337
        const val ss_storage_access_denied_confirm = 2131952338
        const val ss_storage_permission_permanently_disabled = 2131952339
        const val standard_plan = 2131952340
        const val status = 2131952341
        const val status_bar_notification_info_overflow = 2131952342
        const val status_completed = 2131952343
        const val status_ongoing = 2131952344
        const val step_1 = 2131952345
        const val step_2 = 2131952346
        const val step_3 = 2131952347
        const val stop_playing = 2131952348
        const val storage_error = 2131952349
        const val storage_size_format = 2131952350
        const val subs_auto_select_language = 2131952351
        const val subs_background_color = 2131952352
        const val subs_default_reset_toast = 2131952353
        const val subs_download_languages = 2131952354
        const val subs_edge_type = 2131952355
        const val subs_font = 2131952356
        const val subs_font_size = 2131952357
        const val subs_hold_to_reset_to_default = 2131952358
        const val subs_import_text = 2131952359
        const val subs_outline_color = 2131952360
        const val subs_subtitle_elevation = 2131952361
        const val subs_subtitle_languages = 2131952362
        const val subs_text_color = 2131952363
        const val subs_window_color = 2131952364
        const val subtitle_offset = 2131952365
        const val subtitle_offset_extra_hint_before_format = 2131952366
        const val subtitle_offset_extra_hint_later_format = 2131952367
        const val subtitle_offset_extra_hint_none_format = 2131952368
        const val subtitle_offset_hint = 2131952369
        const val subtitle_offset_title = 2131952370
        const val subtitle_pick_a_file_from_sdcard = 2131952371
        const val subtitle_select_downloaded_file = 2131952372
        const val subtitle_settings_chromecast_key = 2131952373
        const val subtitle_settings_key = 2131952374
        const val subtitles_depressed = 2131952375
        const val subtitles_encoding = 2131952376
        const val subtitles_encoding_key = 2131952377
        const val subtitles_example_text = 2131952378
        const val subtitles_none = 2131952379
        const val subtitles_outline = 2131952380
        const val subtitles_raised = 2131952381
        const val subtitles_remove_bloat = 2131952382
        const val subtitles_remove_captions = 2131952383
        const val subtitles_settings = 2131952384
        const val subtitles_shadow = 2131952385
        const val summary_collapsed_preference_list = 2131952386
        const val swipe_enabled_key = 2131952387
        const val swipe_to_change_settings = 2131952388
        const val swipe_to_change_settings_des = 2131952389
        const val swipe_to_seek_settings = 2131952390
        const val swipe_to_seek_settings_des = 2131952391
        const val swipe_vertical_enabled_key = 2131952392
        const val switch_account = 2131952393
        const val switch_provider = 2131952394
        const val sync_score = 2131952395
        const val sync_score_format = 2131952396
        const val sync_total_episodes_none = 2131952397
        const val sync_total_episodes_some = 2131952398
        const val synopsis = 2131952399
        const val title = 2131952400
        const val title_download_subtitle_from_this_page = 2131952401
        const val title_downloads = 2131952402
        const val title_home = 2131952403
        const val title_search = 2131952404
        const val title_settings = 2131952405
        const val torrent = 2131952406
        const val torrent_no_plot = 2131952407
        const val torrent_plot = 2131952408
        const val torrent_singular = 2131952409
        const val trailer = 2131952410
        const val tv_layout = 2131952411
        const val tv_series = 2131952412
        const val tv_series_singular = 2131952413
        const val type_activation_code = 2131952414
        const val type_completed = 2131952415
        const val type_dropped = 2131952416
        const val type_none = 2131952417
        const val type_on_hold = 2131952418
        const val type_plan_to_watch = 2131952419
        const val type_re_watching = 2131952420
        const val type_watching = 2131952421
        const val unexpected_error = 2131952422
        const val unicorn_no_files = 2131952423
        const val unicorn_search = 2131952424
        const val unit = 2131952425
        const val unlimited = 2131952426
        const val unlimited_plan = 2131952427
        const val unlimited_text = 2131952428
        const val update = 2131952429
        const val update_news = 2131952430
        const val updates_settings = 2131952431
        const val updates_settings_des = 2131952432
        const val updating = 2131952433
        const val upgrade_btn = 2131952434
        const val upgrade_now = 2131952435
        const val upgrade_plan = 2131952436
        const val upload_subtitle = 2131952437
        const val upload_sync = 2131952438
        const val uprereleases_settings = 2131952439
        const val uprereleases_settings_des = 2131952440
        const val use_devices = 2131952441
        const val use_system_brightness_key = 2131952442
        const val use_system_brightness_settings = 2131952443
        const val use_system_brightness_settings_des = 2131952444
        const val used_storage = 2131952445
        const val v7_preference_off = 2131952446
        const val v7_preference_on = 2131952447
        const val version = 2131952448
        const val video_aspect_ratio_resize = 2131952449
        const val video_buffer_clear_key = 2131952450
        const val video_buffer_clear_settings = 2131952451
        const val video_buffer_disk_key = 2131952452
        const val video_buffer_disk_settings = 2131952453
        const val video_buffer_length_key = 2131952454
        const val video_buffer_length_settings = 2131952455
        const val video_buffer_size_key = 2131952456
        const val video_buffer_size_settings = 2131952457
        const val video_disk_description = 2131952458
        const val video_lock = 2131952459
        const val video_ram_description = 2131952460
        const val video_skip_op = 2131952461
        const val video_source = 2131952462
        const val vpn_might_be_needed = 2131952463
        const val vpn_torrent = 2131952464
        const val watch_quality_pref = 2131952465
        const val year = 2131952466
        const val year_format = 2131952467
    }

    /* renamed from: com.lagradost.cloudstream3.R$style */ /* loaded from: classes3.dex */
    object style {
        const val AlertDialogCustom = 2132017154
        const val AlertDialogCustomBlack = 2132017155
        const val AlertDialogCustomTransparent = 2132017156
        const val AlertDialog_AppCompat = 2132017152
        const val AlertDialog_AppCompat_Light = 2132017153
        const val AmoledMode = 2132017157
        const val AmoledModeLight = 2132017158
        const val AndroidThemeColorAccentYellow = 2132017159
        const val Animation_AppCompat_Dialog = 2132017160
        const val Animation_AppCompat_DropDownUp = 2132017161
        const val Animation_AppCompat_Tooltip = 2132017162
        const val Animation_Design_BottomSheetDialog = 2132017163
        const val Animation_MaterialComponents_BottomSheetDialog = 2132017164
        const val AppBottomSheetDialogTheme = 2132017165
        const val AppButtonStyle = 2132017166
        const val AppEditStyle = 2132017167
        const val AppMaterialButtonStyle = 2132017168
        const val AppModalStyle = 2132017169
        const val AppSearchView = 2132017170
        const val AppSearchViewStyle = 2132017171
        const val AppTextViewStyle = 2132017172
        const val AppTheme = 2132017173
        const val Base_AlertDialog_AppCompat = 2132017174
        const val Base_AlertDialog_AppCompat_Light = 2132017175
        const val Base_Animation_AppCompat_Dialog = 2132017176
        const val Base_Animation_AppCompat_DropDownUp = 2132017177
        const val Base_Animation_AppCompat_Tooltip = 2132017178
        const val Base_CardView = 2132017179
        const val Base_DialogWindowTitleBackground_AppCompat = 2132017181
        const val Base_DialogWindowTitle_AppCompat = 2132017180
        const val Base_MaterialAlertDialog_MaterialComponents_Title_Icon = 2132017182
        const val Base_MaterialAlertDialog_MaterialComponents_Title_Panel = 2132017183
        const val Base_MaterialAlertDialog_MaterialComponents_Title_Text = 2132017184
        const val Base_TextAppearance_AppCompat = 2132017185
        const val Base_TextAppearance_AppCompat_Body1 = 2132017186
        const val Base_TextAppearance_AppCompat_Body2 = 2132017187
        const val Base_TextAppearance_AppCompat_Button = 2132017188
        const val Base_TextAppearance_AppCompat_Caption = 2132017189
        const val Base_TextAppearance_AppCompat_Display1 = 2132017190
        const val Base_TextAppearance_AppCompat_Display2 = 2132017191
        const val Base_TextAppearance_AppCompat_Display3 = 2132017192
        const val Base_TextAppearance_AppCompat_Display4 = 2132017193
        const val Base_TextAppearance_AppCompat_Headline = 2132017194
        const val Base_TextAppearance_AppCompat_Inverse = 2132017195
        const val Base_TextAppearance_AppCompat_Large = 2132017196
        const val Base_TextAppearance_AppCompat_Large_Inverse = 2132017197
        const val Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2132017198
        const val Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2132017199
        const val Base_TextAppearance_AppCompat_Medium = 2132017200
        const val Base_TextAppearance_AppCompat_Medium_Inverse = 2132017201
        const val Base_TextAppearance_AppCompat_Menu = 2132017202
        const val Base_TextAppearance_AppCompat_SearchResult = 2132017203
        const val Base_TextAppearance_AppCompat_SearchResult_Subtitle = 2132017204
        const val Base_TextAppearance_AppCompat_SearchResult_Title = 2132017205
        const val Base_TextAppearance_AppCompat_Small = 2132017206
        const val Base_TextAppearance_AppCompat_Small_Inverse = 2132017207
        const val Base_TextAppearance_AppCompat_Subhead = 2132017208
        const val Base_TextAppearance_AppCompat_Subhead_Inverse = 2132017209
        const val Base_TextAppearance_AppCompat_Title = 2132017210
        const val Base_TextAppearance_AppCompat_Title_Inverse = 2132017211
        const val Base_TextAppearance_AppCompat_Tooltip = 2132017212
        const val Base_TextAppearance_AppCompat_Widget_ActionBar_Menu = 2132017213
        const val Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2132017214
        const val Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2132017215
        const val Base_TextAppearance_AppCompat_Widget_ActionBar_Title = 2132017216
        const val Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2132017217
        const val Base_TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2132017218
        const val Base_TextAppearance_AppCompat_Widget_ActionMode_Title = 2132017219
        const val Base_TextAppearance_AppCompat_Widget_Button = 2132017220
        const val Base_TextAppearance_AppCompat_Widget_Button_Borderless_Colored = 2132017221
        const val Base_TextAppearance_AppCompat_Widget_Button_Colored = 2132017222
        const val Base_TextAppearance_AppCompat_Widget_Button_Inverse = 2132017223
        const val Base_TextAppearance_AppCompat_Widget_DropDownItem = 2132017224
        const val Base_TextAppearance_AppCompat_Widget_PopupMenu_Header = 2132017225
        const val Base_TextAppearance_AppCompat_Widget_PopupMenu_Large = 2132017226
        const val Base_TextAppearance_AppCompat_Widget_PopupMenu_Small = 2132017227
        const val Base_TextAppearance_AppCompat_Widget_Switch = 2132017228
        const val Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2132017229
        const val Base_TextAppearance_Material3_LabelLarge = 2132017230
        const val Base_TextAppearance_Material3_LabelMedium = 2132017231
        const val Base_TextAppearance_Material3_LabelSmall = 2132017232
        const val Base_TextAppearance_Material3_TitleMedium = 2132017233
        const val Base_TextAppearance_Material3_TitleSmall = 2132017234
        const val Base_TextAppearance_MaterialComponents_Badge = 2132017235
        const val Base_TextAppearance_MaterialComponents_Button = 2132017236
        const val Base_TextAppearance_MaterialComponents_Headline6 = 2132017237
        const val Base_TextAppearance_MaterialComponents_Subtitle2 = 2132017238
        const val Base_TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2132017239
        const val Base_TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2132017240
        const val Base_TextAppearance_Widget_AppCompat_Toolbar_Title = 2132017241
        const val Base_ThemeOverlay_AppCompat = 2132017281
        const val Base_ThemeOverlay_AppCompat_ActionBar = 2132017282
        const val Base_ThemeOverlay_AppCompat_Dark = 2132017283
        const val Base_ThemeOverlay_AppCompat_Dark_ActionBar = 2132017284
        const val Base_ThemeOverlay_AppCompat_Dialog = 2132017285
        const val Base_ThemeOverlay_AppCompat_Dialog_Alert = 2132017286
        const val Base_ThemeOverlay_AppCompat_Light = 2132017287
        const val Base_ThemeOverlay_Material3_AutoCompleteTextView = 2132017288
        const val Base_ThemeOverlay_Material3_BottomSheetDialog = 2132017289
        const val Base_ThemeOverlay_Material3_Dialog = 2132017290
        const val Base_ThemeOverlay_Material3_TextInputEditText = 2132017291
        const val Base_ThemeOverlay_MaterialComponents_Dialog = 2132017292
        const val Base_ThemeOverlay_MaterialComponents_Dialog_Alert = 2132017293
        const val Base_ThemeOverlay_MaterialComponents_Dialog_Alert_Framework = 2132017294

        /* renamed from: Base_ThemeOverlay_MaterialComponents_Light_Dialog_Alert_Framework */
        const val f9913x519bcd25 = 2132017295
        const val Base_ThemeOverlay_MaterialComponents_MaterialAlertDialog = 2132017296
        const val Base_Theme_AppCompat = 2132017242
        const val Base_Theme_AppCompat_CompactMenu = 2132017243
        const val Base_Theme_AppCompat_Dialog = 2132017244
        const val Base_Theme_AppCompat_DialogWhenLarge = 2132017248
        const val Base_Theme_AppCompat_Dialog_Alert = 2132017245
        const val Base_Theme_AppCompat_Dialog_FixedSize = 2132017246
        const val Base_Theme_AppCompat_Dialog_MinWidth = 2132017247
        const val Base_Theme_AppCompat_Light = 2132017249
        const val Base_Theme_AppCompat_Light_DarkActionBar = 2132017250
        const val Base_Theme_AppCompat_Light_Dialog = 2132017251
        const val Base_Theme_AppCompat_Light_DialogWhenLarge = 2132017255
        const val Base_Theme_AppCompat_Light_Dialog_Alert = 2132017252
        const val Base_Theme_AppCompat_Light_Dialog_FixedSize = 2132017253
        const val Base_Theme_AppCompat_Light_Dialog_MinWidth = 2132017254
        const val Base_Theme_Material3_Dark = 2132017256
        const val Base_Theme_Material3_Dark_BottomSheetDialog = 2132017257
        const val Base_Theme_Material3_Dark_Dialog = 2132017258
        const val Base_Theme_Material3_Light = 2132017259
        const val Base_Theme_Material3_Light_BottomSheetDialog = 2132017260
        const val Base_Theme_Material3_Light_Dialog = 2132017261
        const val Base_Theme_MaterialComponents = 2132017262
        const val Base_Theme_MaterialComponents_Bridge = 2132017263
        const val Base_Theme_MaterialComponents_CompactMenu = 2132017264
        const val Base_Theme_MaterialComponents_Dialog = 2132017265
        const val Base_Theme_MaterialComponents_DialogWhenLarge = 2132017270
        const val Base_Theme_MaterialComponents_Dialog_Alert = 2132017266
        const val Base_Theme_MaterialComponents_Dialog_Bridge = 2132017267
        const val Base_Theme_MaterialComponents_Dialog_FixedSize = 2132017268
        const val Base_Theme_MaterialComponents_Dialog_MinWidth = 2132017269
        const val Base_Theme_MaterialComponents_Light = 2132017271
        const val Base_Theme_MaterialComponents_Light_Bridge = 2132017272
        const val Base_Theme_MaterialComponents_Light_DarkActionBar = 2132017273
        const val Base_Theme_MaterialComponents_Light_DarkActionBar_Bridge = 2132017274
        const val Base_Theme_MaterialComponents_Light_Dialog = 2132017275
        const val Base_Theme_MaterialComponents_Light_DialogWhenLarge = 2132017280
        const val Base_Theme_MaterialComponents_Light_Dialog_Alert = 2132017276
        const val Base_Theme_MaterialComponents_Light_Dialog_Bridge = 2132017277
        const val Base_Theme_MaterialComponents_Light_Dialog_FixedSize = 2132017278
        const val Base_Theme_MaterialComponents_Light_Dialog_MinWidth = 2132017279
        const val Base_V14_ThemeOverlay_Material3_BottomSheetDialog = 2132017312
        const val Base_V14_ThemeOverlay_MaterialComponents_BottomSheetDialog = 2132017313
        const val Base_V14_ThemeOverlay_MaterialComponents_Dialog = 2132017314
        const val Base_V14_ThemeOverlay_MaterialComponents_Dialog_Alert = 2132017315
        const val Base_V14_ThemeOverlay_MaterialComponents_MaterialAlertDialog = 2132017316
        const val Base_V14_Theme_Material3_Dark = 2132017297
        const val Base_V14_Theme_Material3_Dark_BottomSheetDialog = 2132017298
        const val Base_V14_Theme_Material3_Dark_Dialog = 2132017299
        const val Base_V14_Theme_Material3_Light = 2132017300
        const val Base_V14_Theme_Material3_Light_BottomSheetDialog = 2132017301
        const val Base_V14_Theme_Material3_Light_Dialog = 2132017302
        const val Base_V14_Theme_MaterialComponents = 2132017303
        const val Base_V14_Theme_MaterialComponents_Bridge = 2132017304
        const val Base_V14_Theme_MaterialComponents_Dialog = 2132017305
        const val Base_V14_Theme_MaterialComponents_Dialog_Bridge = 2132017306
        const val Base_V14_Theme_MaterialComponents_Light = 2132017307
        const val Base_V14_Theme_MaterialComponents_Light_Bridge = 2132017308
        const val Base_V14_Theme_MaterialComponents_Light_DarkActionBar_Bridge = 2132017309
        const val Base_V14_Theme_MaterialComponents_Light_Dialog = 2132017310
        const val Base_V14_Theme_MaterialComponents_Light_Dialog_Bridge = 2132017311
        const val Base_V21_ThemeOverlay_AppCompat_Dialog = 2132017325
        const val Base_V21_ThemeOverlay_Material3_BottomSheetDialog = 2132017326
        const val Base_V21_ThemeOverlay_MaterialComponents_BottomSheetDialog = 2132017327
        const val Base_V21_Theme_AppCompat = 2132017317
        const val Base_V21_Theme_AppCompat_Dialog = 2132017318
        const val Base_V21_Theme_AppCompat_Light = 2132017319
        const val Base_V21_Theme_AppCompat_Light_Dialog = 2132017320
        const val Base_V21_Theme_MaterialComponents = 2132017321
        const val Base_V21_Theme_MaterialComponents_Dialog = 2132017322
        const val Base_V21_Theme_MaterialComponents_Light = 2132017323
        const val Base_V21_Theme_MaterialComponents_Light_Dialog = 2132017324
        const val Base_V22_Theme_AppCompat = 2132017328
        const val Base_V22_Theme_AppCompat_Light = 2132017329
        const val Base_V23_Theme_AppCompat = 2132017330
        const val Base_V23_Theme_AppCompat_Light = 2132017331
        const val Base_V24_Theme_Material3_Dark = 2132017332
        const val Base_V24_Theme_Material3_Dark_Dialog = 2132017333
        const val Base_V24_Theme_Material3_Light = 2132017334
        const val Base_V24_Theme_Material3_Light_Dialog = 2132017335
        const val Base_V26_Theme_AppCompat = 2132017336
        const val Base_V26_Theme_AppCompat_Light = 2132017337
        const val Base_V26_Widget_AppCompat_Toolbar = 2132017338
        const val Base_V28_Theme_AppCompat = 2132017339
        const val Base_V28_Theme_AppCompat_Light = 2132017340
        const val Base_V7_ThemeOverlay_AppCompat_Dialog = 2132017345
        const val Base_V7_Theme_AppCompat = 2132017341
        const val Base_V7_Theme_AppCompat_Dialog = 2132017342
        const val Base_V7_Theme_AppCompat_Light = 2132017343
        const val Base_V7_Theme_AppCompat_Light_Dialog = 2132017344
        const val Base_V7_Widget_AppCompat_AutoCompleteTextView = 2132017346
        const val Base_V7_Widget_AppCompat_EditText = 2132017347
        const val Base_V7_Widget_AppCompat_Toolbar = 2132017348
        const val Base_Widget_AppCompat_ActionBar = 2132017349
        const val Base_Widget_AppCompat_ActionBar_Solid = 2132017350
        const val Base_Widget_AppCompat_ActionBar_TabBar = 2132017351
        const val Base_Widget_AppCompat_ActionBar_TabText = 2132017352
        const val Base_Widget_AppCompat_ActionBar_TabView = 2132017353
        const val Base_Widget_AppCompat_ActionButton = 2132017354
        const val Base_Widget_AppCompat_ActionButton_CloseMode = 2132017355
        const val Base_Widget_AppCompat_ActionButton_Overflow = 2132017356
        const val Base_Widget_AppCompat_ActionMode = 2132017357
        const val Base_Widget_AppCompat_ActivityChooserView = 2132017358
        const val Base_Widget_AppCompat_AutoCompleteTextView = 2132017359
        const val Base_Widget_AppCompat_Button = 2132017360
        const val Base_Widget_AppCompat_ButtonBar = 2132017366
        const val Base_Widget_AppCompat_ButtonBar_AlertDialog = 2132017367
        const val Base_Widget_AppCompat_Button_Borderless = 2132017361
        const val Base_Widget_AppCompat_Button_Borderless_Colored = 2132017362
        const val Base_Widget_AppCompat_Button_ButtonBar_AlertDialog = 2132017363
        const val Base_Widget_AppCompat_Button_Colored = 2132017364
        const val Base_Widget_AppCompat_Button_Small = 2132017365
        const val Base_Widget_AppCompat_CompoundButton_CheckBox = 2132017368
        const val Base_Widget_AppCompat_CompoundButton_RadioButton = 2132017369
        const val Base_Widget_AppCompat_CompoundButton_Switch = 2132017370
        const val Base_Widget_AppCompat_DrawerArrowToggle = 2132017371
        const val Base_Widget_AppCompat_DrawerArrowToggle_Common = 2132017372
        const val Base_Widget_AppCompat_DropDownItem_Spinner = 2132017373
        const val Base_Widget_AppCompat_EditText = 2132017374
        const val Base_Widget_AppCompat_ImageButton = 2132017375
        const val Base_Widget_AppCompat_Light_ActionBar = 2132017376
        const val Base_Widget_AppCompat_Light_ActionBar_Solid = 2132017377
        const val Base_Widget_AppCompat_Light_ActionBar_TabBar = 2132017378
        const val Base_Widget_AppCompat_Light_ActionBar_TabText = 2132017379
        const val Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2132017380
        const val Base_Widget_AppCompat_Light_ActionBar_TabView = 2132017381
        const val Base_Widget_AppCompat_Light_PopupMenu = 2132017382
        const val Base_Widget_AppCompat_Light_PopupMenu_Overflow = 2132017383
        const val Base_Widget_AppCompat_ListMenuView = 2132017384
        const val Base_Widget_AppCompat_ListPopupWindow = 2132017385
        const val Base_Widget_AppCompat_ListView = 2132017386
        const val Base_Widget_AppCompat_ListView_DropDown = 2132017387
        const val Base_Widget_AppCompat_ListView_Menu = 2132017388
        const val Base_Widget_AppCompat_PopupMenu = 2132017389
        const val Base_Widget_AppCompat_PopupMenu_Overflow = 2132017390
        const val Base_Widget_AppCompat_PopupWindow = 2132017391
        const val Base_Widget_AppCompat_ProgressBar = 2132017392
        const val Base_Widget_AppCompat_ProgressBar_Horizontal = 2132017393
        const val Base_Widget_AppCompat_RatingBar = 2132017394
        const val Base_Widget_AppCompat_RatingBar_Indicator = 2132017395
        const val Base_Widget_AppCompat_RatingBar_Small = 2132017396
        const val Base_Widget_AppCompat_SearchView = 2132017397
        const val Base_Widget_AppCompat_SearchView_ActionBar = 2132017398
        const val Base_Widget_AppCompat_SeekBar = 2132017399
        const val Base_Widget_AppCompat_SeekBar_Discrete = 2132017400
        const val Base_Widget_AppCompat_Spinner = 2132017401
        const val Base_Widget_AppCompat_Spinner_Underlined = 2132017402
        const val Base_Widget_AppCompat_TextView = 2132017403
        const val Base_Widget_AppCompat_TextView_SpinnerItem = 2132017404
        const val Base_Widget_AppCompat_Toolbar = 2132017405
        const val Base_Widget_AppCompat_Toolbar_Button_Navigation = 2132017406
        const val Base_Widget_Design_TabLayout = 2132017407
        const val Base_Widget_Material3_ActionBar_Solid = 2132017408
        const val Base_Widget_Material3_ActionMode = 2132017409
        const val Base_Widget_Material3_CardView = 2132017410
        const val Base_Widget_Material3_Chip = 2132017411
        const val Base_Widget_Material3_CollapsingToolbar = 2132017412
        const val Base_Widget_Material3_CompoundButton_CheckBox = 2132017413
        const val Base_Widget_Material3_CompoundButton_RadioButton = 2132017414
        const val Base_Widget_Material3_CompoundButton_Switch = 2132017415
        const val Base_Widget_Material3_ExtendedFloatingActionButton = 2132017416
        const val Base_Widget_Material3_ExtendedFloatingActionButton_Icon = 2132017417
        const val Base_Widget_Material3_FloatingActionButton = 2132017418
        const val Base_Widget_Material3_FloatingActionButton_Large = 2132017419
        const val Base_Widget_Material3_Light_ActionBar_Solid = 2132017420
        const val Base_Widget_Material3_MaterialCalendar_NavigationButton = 2132017421
        const val Base_Widget_Material3_Snackbar = 2132017422
        const val Base_Widget_Material3_TabLayout = 2132017423
        const val Base_Widget_Material3_TabLayout_OnSurface = 2132017424
        const val Base_Widget_Material3_TabLayout_Secondary = 2132017425
        const val Base_Widget_MaterialComponents_AutoCompleteTextView = 2132017426
        const val Base_Widget_MaterialComponents_CheckedTextView = 2132017427
        const val Base_Widget_MaterialComponents_Chip = 2132017428
        const val Base_Widget_MaterialComponents_MaterialCalendar_NavigationButton = 2132017429
        const val Base_Widget_MaterialComponents_PopupMenu = 2132017430
        const val Base_Widget_MaterialComponents_PopupMenu_ContextMenu = 2132017431
        const val Base_Widget_MaterialComponents_PopupMenu_ListPopupWindow = 2132017432
        const val Base_Widget_MaterialComponents_PopupMenu_Overflow = 2132017433
        const val Base_Widget_MaterialComponents_Slider = 2132017434
        const val Base_Widget_MaterialComponents_Snackbar = 2132017435
        const val Base_Widget_MaterialComponents_TextInputEditText = 2132017436
        const val Base_Widget_MaterialComponents_TextInputLayout = 2132017437
        const val Base_Widget_MaterialComponents_TextView = 2132017438
        const val BlackButton = 2132017439
        const val BlackLabel = 2132017440
        const val CardView = 2132017441
        const val CardView_Dark = 2132017442
        const val CardView_Light = 2132017443
        const val CastExpandedController = 2132017444
        const val CastIntroOverlay = 2132017445
        const val CastMiniController = 2132017446
        const val CheckLabel = 2132017447
        const val CustomCastExpandedController = 2132017448
        const val CustomCastMiniController = 2132017449
        const val CustomCastTheme = 2132017450
        const val CustomPreferenceThemeOverlay = 2132017451
        const val EmptyTheme = 2132017452
        const val ExoMediaButton = 2132017453
        const val ExoMediaButton_FastForward = 2132017454
        const val ExoMediaButton_Next = 2132017455
        const val ExoMediaButton_Pause = 2132017456
        const val ExoMediaButton_Play = 2132017457
        const val ExoMediaButton_Previous = 2132017458
        const val ExoMediaButton_Rewind = 2132017459
        const val ExoMediaButton_VR = 2132017460
        const val ExoStyledControls = 2132017461
        const val ExoStyledControls_Button = 2132017462
        const val ExoStyledControls_ButtonText = 2132017480
        const val ExoStyledControls_Button_Bottom = 2132017463
        const val ExoStyledControls_Button_Bottom_AudioTrack = 2132017464
        const val ExoStyledControls_Button_Bottom_CC = 2132017465
        const val ExoStyledControls_Button_Bottom_FullScreen = 2132017466
        const val ExoStyledControls_Button_Bottom_OverflowHide = 2132017467
        const val ExoStyledControls_Button_Bottom_OverflowShow = 2132017468
        const val ExoStyledControls_Button_Bottom_PlaybackSpeed = 2132017469
        const val ExoStyledControls_Button_Bottom_RepeatToggle = 2132017470
        const val ExoStyledControls_Button_Bottom_Settings = 2132017471
        const val ExoStyledControls_Button_Bottom_Shuffle = 2132017472
        const val ExoStyledControls_Button_Bottom_VR = 2132017473
        const val ExoStyledControls_Button_Center = 2132017474
        const val ExoStyledControls_Button_Center_FfwdWithAmount = 2132017475
        const val ExoStyledControls_Button_Center_Next = 2132017476
        const val ExoStyledControls_Button_Center_PlayPause = 2132017477
        const val ExoStyledControls_Button_Center_Previous = 2132017478
        const val ExoStyledControls_Button_Center_RewWithAmount = 2132017479
        const val ExoStyledControls_TimeBar = 2132017481
        const val ExoStyledControls_TimeText = 2132017482
        const val ExoStyledControls_TimeText_Duration = 2132017483
        const val ExoStyledControls_TimeText_Position = 2132017484
        const val ExoStyledControls_TimeText_Separator = 2132017485
        const val ExtendedFloatingActionButton = 2132017486
        const val GridItemButton = 2132017487
        const val LargeIconView = 2132017488
        const val LightMode = 2132017489
        const val ListViewStyle = 2132017490
        const val LoadedStyle = 2132017491
        const val MaterialAlertDialog_Material3 = 2132017492
        const val MaterialAlertDialog_Material3_Body_Text = 2132017493
        const val MaterialAlertDialog_Material3_Body_Text_CenterStacked = 2132017494
        const val MaterialAlertDialog_Material3_Title_Icon = 2132017495
        const val MaterialAlertDialog_Material3_Title_Icon_CenterStacked = 2132017496
        const val MaterialAlertDialog_Material3_Title_Panel = 2132017497
        const val MaterialAlertDialog_Material3_Title_Panel_CenterStacked = 2132017498
        const val MaterialAlertDialog_Material3_Title_Text = 2132017499
        const val MaterialAlertDialog_Material3_Title_Text_CenterStacked = 2132017500
        const val MaterialAlertDialog_MaterialComponents = 2132017501
        const val MaterialAlertDialog_MaterialComponents_Body_Text = 2132017502
        const val MaterialAlertDialog_MaterialComponents_Picker_Date_Calendar = 2132017503
        const val MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner = 2132017504
        const val MaterialAlertDialog_MaterialComponents_Title_Icon = 2132017505
        const val MaterialAlertDialog_MaterialComponents_Title_Icon_CenterStacked = 2132017506
        const val MaterialAlertDialog_MaterialComponents_Title_Panel = 2132017507
        const val MaterialAlertDialog_MaterialComponents_Title_Panel_CenterStacked = 2132017508
        const val MaterialAlertDialog_MaterialComponents_Title_Text = 2132017509
        const val MaterialAlertDialog_MaterialComponents_Title_Text_CenterStacked = 2132017510
        const val MessengerButton = 2132017511
        const val MessengerButtonText = 2132017518
        const val MessengerButtonText_Blue = 2132017519
        const val MessengerButtonText_Blue_Large = 2132017520
        const val MessengerButtonText_Blue_Small = 2132017521
        const val MessengerButtonText_White = 2132017522
        const val MessengerButtonText_White_Large = 2132017523
        const val MessengerButtonText_White_Small = 2132017524
        const val MessengerButton_Blue = 2132017512
        const val MessengerButton_Blue_Large = 2132017513
        const val MessengerButton_Blue_Small = 2132017514
        const val MessengerButton_White = 2132017515
        const val MessengerButton_White_Large = 2132017516
        const val MessengerButton_White_Small = 2132017517
        const val MultiSelectButton = 2132017525
        const val MyCustomTabLayout = 2132017526
        const val MyCustomTextAppearance = 2132017527
        const val NiceButton = 2132017528
        const val OverlayPrimaryColorBanana = 2132017529
        const val OverlayPrimaryColorBlue = 2132017530
        const val OverlayPrimaryColorBrown = 2132017531
        const val OverlayPrimaryColorCarnationPink = 2132017532
        const val OverlayPrimaryColorDarkGreen = 2132017533
        const val OverlayPrimaryColorGreen = 2132017534
        const val OverlayPrimaryColorGreenApple = 2132017535
        const val OverlayPrimaryColorGrey = 2132017536
        const val OverlayPrimaryColorMaroon = 2132017537
        const val OverlayPrimaryColorNavyBlue = 2132017538
        const val OverlayPrimaryColorNormal = 2132017539
        const val OverlayPrimaryColorParty = 2132017540
        const val OverlayPrimaryColorPink = 2132017541
        const val OverlayPrimaryColorPurple = 2132017542
        const val OverlayPrimaryColorRed = 2132017543
        const val OverlayPrimaryColorWhite = 2132017544
        const val Platform_AppCompat = 2132017545
        const val Platform_AppCompat_Light = 2132017546
        const val Platform_MaterialComponents = 2132017547
        const val Platform_MaterialComponents_Dialog = 2132017548
        const val Platform_MaterialComponents_Light = 2132017549
        const val Platform_MaterialComponents_Light_Dialog = 2132017550
        const val Platform_ThemeOverlay_AppCompat = 2132017551
        const val Platform_ThemeOverlay_AppCompat_Dark = 2132017552
        const val Platform_ThemeOverlay_AppCompat_Light = 2132017553
        const val Platform_V21_AppCompat = 2132017554
        const val Platform_V21_AppCompat_Light = 2132017555
        const val Platform_V25_AppCompat = 2132017556
        const val Platform_V25_AppCompat_Light = 2132017557
        const val Platform_Widget_AppCompat_Spinner = 2132017558
        const val PopupMenu = 2132017559
        const val Preference = 2132017560
        const val PreferenceCategoryTitleTextStyle = 2132017582
        const val PreferenceFragment = 2132017583
        const val PreferenceFragmentList = 2132017585
        const val PreferenceFragmentList_Material = 2132017586
        const val PreferenceFragment_Material = 2132017584
        const val PreferenceSummaryTextStyle = 2132017587
        const val PreferenceTheme = 2132017588
        const val PreferenceThemeOverlay = 2132017589
        const val PreferenceThemeOverlay_v14 = 2132017590
        const val PreferenceThemeOverlay_v14_Material = 2132017591
        const val Preference_Category = 2132017561
        const val Preference_Category_Material = 2132017562
        const val Preference_CheckBoxPreference = 2132017563
        const val Preference_CheckBoxPreference_Material = 2132017564
        const val Preference_DialogPreference = 2132017565
        const val Preference_DialogPreference_EditTextPreference = 2132017566
        const val Preference_DialogPreference_EditTextPreference_Material = 2132017567
        const val Preference_DialogPreference_Material = 2132017568
        const val Preference_DropDown = 2132017569
        const val Preference_DropDown_Material = 2132017570
        const val Preference_Information = 2132017571
        const val Preference_Information_Material = 2132017572
        const val Preference_Material = 2132017573
        const val Preference_PreferenceScreen = 2132017574
        const val Preference_PreferenceScreen_Material = 2132017575
        const val Preference_SeekBarPreference = 2132017576
        const val Preference_SeekBarPreference_Material = 2132017577
        const val Preference_SwitchPreference = 2132017578
        const val Preference_SwitchPreferenceCompat = 2132017580
        const val Preference_SwitchPreferenceCompat_Material = 2132017581
        const val Preference_SwitchPreference_Material = 2132017579
        const val ResultInfoText = 2132017592
        const val RoundedSelectableButton = 2132017593
        const val RoundedSelectableButtonIcon = 2132017594
        const val RtlOverlay_DialogWindowTitle_AppCompat = 2132017595
        const val RtlOverlay_Widget_AppCompat_ActionBar_TitleItem = 2132017596
        const val RtlOverlay_Widget_AppCompat_DialogTitle_Icon = 2132017597
        const val RtlOverlay_Widget_AppCompat_PopupMenuItem = 2132017598
        const val RtlOverlay_Widget_AppCompat_PopupMenuItem_InternalGroup = 2132017599
        const val RtlOverlay_Widget_AppCompat_PopupMenuItem_Shortcut = 2132017600
        const val RtlOverlay_Widget_AppCompat_PopupMenuItem_SubmenuArrow = 2132017601
        const val RtlOverlay_Widget_AppCompat_PopupMenuItem_Text = 2132017602
        const val RtlOverlay_Widget_AppCompat_PopupMenuItem_Title = 2132017603
        const val RtlOverlay_Widget_AppCompat_SearchView_MagIcon = 2132017609
        const val RtlOverlay_Widget_AppCompat_Search_DropDown = 2132017604
        const val RtlOverlay_Widget_AppCompat_Search_DropDown_Icon1 = 2132017605
        const val RtlOverlay_Widget_AppCompat_Search_DropDown_Icon2 = 2132017606
        const val RtlOverlay_Widget_AppCompat_Search_DropDown_Query = 2132017607
        const val RtlOverlay_Widget_AppCompat_Search_DropDown_Text = 2132017608
        const val RtlUnderlay_Widget_AppCompat_ActionButton = 2132017610
        const val RtlUnderlay_Widget_AppCompat_ActionButton_Overflow = 2132017611
        const val SearchBox = 2132017612
        const val SettingsItem = 2132017613
        const val ShapeAppearanceOverlay = 2132017625
        const val ShapeAppearanceOverlayExtended = 2132017646
        const val ShapeAppearanceOverlay_BottomLeftDifferentCornerSize = 2132017626
        const val ShapeAppearanceOverlay_BottomRightCut = 2132017627
        const val ShapeAppearanceOverlay_Cut = 2132017628
        const val ShapeAppearanceOverlay_DifferentCornerSize = 2132017629
        const val ShapeAppearanceOverlay_Material3_Button = 2132017630
        const val ShapeAppearanceOverlay_Material3_Chip = 2132017631
        const val ShapeAppearanceOverlay_Material3_FloatingActionButton = 2132017632
        const val ShapeAppearanceOverlay_Material3_NavigationView_Item = 2132017633
        const val ShapeAppearanceOverlay_Material3_TextField_Filled = 2132017634
        const val ShapeAppearanceOverlay_MaterialAlertDialog_Material3 = 2132017635
        const val ShapeAppearanceOverlay_MaterialComponents_BottomSheet = 2132017636
        const val ShapeAppearanceOverlay_MaterialComponents_Chip = 2132017637

        /* renamed from: ShapeAppearanceOverlay_MaterialComponents_ExtendedFloatingActionButton */
        const val f9914x7c26e1f5 = 2132017638
        const val ShapeAppearanceOverlay_MaterialComponents_FloatingActionButton = 2132017639
        const val ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Day = 2132017640

        /* renamed from: ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Window_Fullscreen */
        const val f9915x121af39e = 2132017641
        const val ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Year = 2132017642

        /* renamed from: ShapeAppearanceOverlay_MaterialComponents_TextInputLayout_FilledBox */
        const val f9916xaf44c2a3 = 2132017643
        const val ShapeAppearanceOverlay_TopLeftCut = 2132017644
        const val ShapeAppearanceOverlay_TopRightDifferentCornerSize = 2132017645
        const val ShapeAppearance_Material3_LargeComponent = 2132017614
        const val ShapeAppearance_Material3_MediumComponent = 2132017615
        const val ShapeAppearance_Material3_NavigationBarView_ActiveIndicator = 2132017616
        const val ShapeAppearance_Material3_SmallComponent = 2132017617
        const val ShapeAppearance_Material3_Tooltip = 2132017618
        const val ShapeAppearance_MaterialComponents = 2132017619
        const val ShapeAppearance_MaterialComponents_LargeComponent = 2132017620
        const val ShapeAppearance_MaterialComponents_MediumComponent = 2132017621
        const val ShapeAppearance_MaterialComponents_SmallComponent = 2132017622
        const val ShapeAppearance_MaterialComponents_Test = 2132017623
        const val ShapeAppearance_MaterialComponents_Tooltip = 2132017624
        const val SmallBlackButton = 2132017647
        const val SmallIconView = 2132017648
        const val StyleForTV = 2132017649
        const val SyncButton = 2132017650
        const val Tag = 2132017651
        const val TestStyleWithLineHeight = 2132017657
        const val TestStyleWithLineHeightAppearance = 2132017658
        const val TestStyleWithThemeLineHeightAttribute = 2132017659
        const val TestStyleWithoutLineHeight = 2132017660
        const val TestThemeWithLineHeight = 2132017661
        const val TestThemeWithLineHeightDisabled = 2132017662

        /* renamed from: Test_ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Day */
        const val f9917x774f7bdd = 2132017652
        const val Test_Theme_MaterialComponents_MaterialCalendar = 2132017653
        const val Test_Widget_MaterialComponents_MaterialCalendar = 2132017654
        const val Test_Widget_MaterialComponents_MaterialCalendar_Day = 2132017655
        const val Test_Widget_MaterialComponents_MaterialCalendar_Day_Selected = 2132017656
        const val TextAppearance_AppCompat = 2132017663
        const val TextAppearance_AppCompat_Body1 = 2132017664
        const val TextAppearance_AppCompat_Body2 = 2132017665
        const val TextAppearance_AppCompat_Button = 2132017666
        const val TextAppearance_AppCompat_Caption = 2132017667
        const val TextAppearance_AppCompat_Display1 = 2132017668
        const val TextAppearance_AppCompat_Display2 = 2132017669
        const val TextAppearance_AppCompat_Display3 = 2132017670
        const val TextAppearance_AppCompat_Display4 = 2132017671
        const val TextAppearance_AppCompat_Headline = 2132017672
        const val TextAppearance_AppCompat_Inverse = 2132017673
        const val TextAppearance_AppCompat_Large = 2132017674
        const val TextAppearance_AppCompat_Large_Inverse = 2132017675
        const val TextAppearance_AppCompat_Light_SearchResult_Subtitle = 2132017676
        const val TextAppearance_AppCompat_Light_SearchResult_Title = 2132017677
        const val TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2132017678
        const val TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2132017679
        const val TextAppearance_AppCompat_Medium = 2132017680
        const val TextAppearance_AppCompat_Medium_Inverse = 2132017681
        const val TextAppearance_AppCompat_Menu = 2132017682
        const val TextAppearance_AppCompat_SearchResult_Subtitle = 2132017683
        const val TextAppearance_AppCompat_SearchResult_Title = 2132017684
        const val TextAppearance_AppCompat_Small = 2132017685
        const val TextAppearance_AppCompat_Small_Inverse = 2132017686
        const val TextAppearance_AppCompat_Subhead = 2132017687
        const val TextAppearance_AppCompat_Subhead_Inverse = 2132017688
        const val TextAppearance_AppCompat_Title = 2132017689
        const val TextAppearance_AppCompat_Title_Inverse = 2132017690
        const val TextAppearance_AppCompat_Tooltip = 2132017691
        const val TextAppearance_AppCompat_Widget_ActionBar_Menu = 2132017692
        const val TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2132017693
        const val TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2132017694
        const val TextAppearance_AppCompat_Widget_ActionBar_Title = 2132017695
        const val TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2132017696
        const val TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2132017697
        const val TextAppearance_AppCompat_Widget_ActionMode_Subtitle_Inverse = 2132017698
        const val TextAppearance_AppCompat_Widget_ActionMode_Title = 2132017699
        const val TextAppearance_AppCompat_Widget_ActionMode_Title_Inverse = 2132017700
        const val TextAppearance_AppCompat_Widget_Button = 2132017701
        const val TextAppearance_AppCompat_Widget_Button_Borderless_Colored = 2132017702
        const val TextAppearance_AppCompat_Widget_Button_Colored = 2132017703
        const val TextAppearance_AppCompat_Widget_Button_Inverse = 2132017704
        const val TextAppearance_AppCompat_Widget_DropDownItem = 2132017705
        const val TextAppearance_AppCompat_Widget_PopupMenu_Header = 2132017706
        const val TextAppearance_AppCompat_Widget_PopupMenu_Large = 2132017707
        const val TextAppearance_AppCompat_Widget_PopupMenu_Small = 2132017708
        const val TextAppearance_AppCompat_Widget_Switch = 2132017709
        const val TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2132017710
        const val TextAppearance_CastExpandedController_AdInProgressLabel = 2132017711
        const val TextAppearance_CastExpandedController_AdLabel = 2132017712
        const val TextAppearance_CastIntroOverlay_Button = 2132017713
        const val TextAppearance_CastIntroOverlay_Title = 2132017714
        const val TextAppearance_CastMiniController_Subtitle = 2132017715
        const val TextAppearance_CastMiniController_Title = 2132017716
        const val TextAppearance_Compat_Notification = 2132017717
        const val TextAppearance_Compat_Notification_Info = 2132017718
        const val TextAppearance_Compat_Notification_Info_Media = 2132017719
        const val TextAppearance_Compat_Notification_Line2 = 2132017720
        const val TextAppearance_Compat_Notification_Line2_Media = 2132017721
        const val TextAppearance_Compat_Notification_Media = 2132017722
        const val TextAppearance_Compat_Notification_Time = 2132017723
        const val TextAppearance_Compat_Notification_Time_Media = 2132017724
        const val TextAppearance_Compat_Notification_Title = 2132017725
        const val TextAppearance_Compat_Notification_Title_Media = 2132017726
        const val TextAppearance_Design_CollapsingToolbar_Expanded = 2132017727
        const val TextAppearance_Design_Counter = 2132017728
        const val TextAppearance_Design_Counter_Overflow = 2132017729
        const val TextAppearance_Design_Error = 2132017730
        const val TextAppearance_Design_HelperText = 2132017731
        const val TextAppearance_Design_Hint = 2132017732
        const val TextAppearance_Design_Placeholder = 2132017733
        const val TextAppearance_Design_Prefix = 2132017734
        const val TextAppearance_Design_Snackbar_Message = 2132017735
        const val TextAppearance_Design_Suffix = 2132017736
        const val TextAppearance_Design_Tab = 2132017737
        const val TextAppearance_Material3_ActionBar_Subtitle = 2132017738
        const val TextAppearance_Material3_ActionBar_Title = 2132017739
        const val TextAppearance_Material3_BodyLarge = 2132017740
        const val TextAppearance_Material3_BodyMedium = 2132017741
        const val TextAppearance_Material3_BodySmall = 2132017742
        const val TextAppearance_Material3_DisplayLarge = 2132017743
        const val TextAppearance_Material3_DisplayMedium = 2132017744
        const val TextAppearance_Material3_DisplaySmall = 2132017745
        const val TextAppearance_Material3_HeadlineLarge = 2132017746
        const val TextAppearance_Material3_HeadlineMedium = 2132017747
        const val TextAppearance_Material3_HeadlineSmall = 2132017748
        const val TextAppearance_Material3_LabelLarge = 2132017749
        const val TextAppearance_Material3_LabelMedium = 2132017750
        const val TextAppearance_Material3_LabelSmall = 2132017751
        const val TextAppearance_Material3_MaterialTimePicker_Title = 2132017752
        const val TextAppearance_Material3_TitleLarge = 2132017753
        const val TextAppearance_Material3_TitleMedium = 2132017754
        const val TextAppearance_Material3_TitleSmall = 2132017755
        const val TextAppearance_MaterialComponents_Badge = 2132017756
        const val TextAppearance_MaterialComponents_Body1 = 2132017757
        const val TextAppearance_MaterialComponents_Body2 = 2132017758
        const val TextAppearance_MaterialComponents_Button = 2132017759
        const val TextAppearance_MaterialComponents_Caption = 2132017760
        const val TextAppearance_MaterialComponents_Chip = 2132017761
        const val TextAppearance_MaterialComponents_Headline1 = 2132017762
        const val TextAppearance_MaterialComponents_Headline2 = 2132017763
        const val TextAppearance_MaterialComponents_Headline3 = 2132017764
        const val TextAppearance_MaterialComponents_Headline4 = 2132017765
        const val TextAppearance_MaterialComponents_Headline5 = 2132017766
        const val TextAppearance_MaterialComponents_Headline6 = 2132017767
        const val TextAppearance_MaterialComponents_Overline = 2132017768
        const val TextAppearance_MaterialComponents_Subtitle1 = 2132017769
        const val TextAppearance_MaterialComponents_Subtitle2 = 2132017770
        const val TextAppearance_MaterialComponents_TimePicker_Title = 2132017771
        const val TextAppearance_MaterialComponents_Tooltip = 2132017772
        const val TextAppearance_MediaRouter_Dynamic_Body = 2132017773
        const val TextAppearance_MediaRouter_Dynamic_Body_Light = 2132017774
        const val TextAppearance_MediaRouter_Dynamic_Header = 2132017775
        const val TextAppearance_MediaRouter_Dynamic_Header_Light = 2132017776
        const val TextAppearance_MediaRouter_Dynamic_Metadata_PrimaryText = 2132017777
        const val TextAppearance_MediaRouter_Dynamic_Metadata_SecondaryText = 2132017778
        const val TextAppearance_MediaRouter_PrimaryText = 2132017779
        const val TextAppearance_MediaRouter_SecondaryText = 2132017780
        const val TextAppearance_MediaRouter_Title = 2132017781
        const val TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2132017782
        const val TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2132017783
        const val TextAppearance_Widget_AppCompat_Toolbar_Title = 2132017784
        const val ThemeOverlayColorAccentRed = 2132017991
        const val ThemeOverlay_AppCompat = 2132017892
        const val ThemeOverlay_AppCompat_ActionBar = 2132017893
        const val ThemeOverlay_AppCompat_Dark = 2132017894
        const val ThemeOverlay_AppCompat_Dark_ActionBar = 2132017895
        const val ThemeOverlay_AppCompat_DayNight = 2132017896
        const val ThemeOverlay_AppCompat_DayNight_ActionBar = 2132017897
        const val ThemeOverlay_AppCompat_Dialog = 2132017898
        const val ThemeOverlay_AppCompat_Dialog_Alert = 2132017899
        const val ThemeOverlay_AppCompat_Light = 2132017900
        const val ThemeOverlay_Design_TextInputEditText = 2132017901
        const val ThemeOverlay_Material3 = 2132017902
        const val ThemeOverlay_Material3_ActionBar = 2132017903
        const val ThemeOverlay_Material3_AutoCompleteTextView = 2132017904
        const val ThemeOverlay_Material3_AutoCompleteTextView_FilledBox = 2132017905
        const val ThemeOverlay_Material3_AutoCompleteTextView_FilledBox_Dense = 2132017906
        const val ThemeOverlay_Material3_AutoCompleteTextView_OutlinedBox = 2132017907
        const val ThemeOverlay_Material3_AutoCompleteTextView_OutlinedBox_Dense = 2132017908
        const val ThemeOverlay_Material3_BottomAppBar = 2132017909
        const val ThemeOverlay_Material3_BottomSheetDialog = 2132017910
        const val ThemeOverlay_Material3_Button = 2132017911
        const val ThemeOverlay_Material3_Button_ElevatedButton = 2132017912
        const val ThemeOverlay_Material3_Button_TextButton = 2132017913
        const val ThemeOverlay_Material3_Button_TextButton_Snackbar = 2132017914
        const val ThemeOverlay_Material3_Button_TonalButton = 2132017915
        const val ThemeOverlay_Material3_Chip = 2132017916
        const val ThemeOverlay_Material3_Chip_Assist = 2132017917
        const val ThemeOverlay_Material3_Dark = 2132017918
        const val ThemeOverlay_Material3_Dark_ActionBar = 2132017919
        const val ThemeOverlay_Material3_DayNight_BottomSheetDialog = 2132017920
        const val ThemeOverlay_Material3_Dialog = 2132017921
        const val ThemeOverlay_Material3_Dialog_Alert = 2132017922
        const val ThemeOverlay_Material3_Dialog_Alert_Framework = 2132017923
        const val ThemeOverlay_Material3_DynamicColors_Dark = 2132017924
        const val ThemeOverlay_Material3_DynamicColors_DayNight = 2132017925
        const val ThemeOverlay_Material3_DynamicColors_Light = 2132017926
        const val ThemeOverlay_Material3_FloatingActionButton_Primary = 2132017927
        const val ThemeOverlay_Material3_FloatingActionButton_Secondary = 2132017928
        const val ThemeOverlay_Material3_FloatingActionButton_Surface = 2132017929
        const val ThemeOverlay_Material3_FloatingActionButton_Tertiary = 2132017930
        const val ThemeOverlay_Material3_Light = 2132017931
        const val ThemeOverlay_Material3_Light_Dialog_Alert_Framework = 2132017932
        const val ThemeOverlay_Material3_MaterialAlertDialog = 2132017933
        const val ThemeOverlay_Material3_MaterialAlertDialog_Centered = 2132017934
        const val ThemeOverlay_Material3_MaterialCalendar = 2132017935
        const val ThemeOverlay_Material3_MaterialCalendar_Fullscreen = 2132017936
        const val ThemeOverlay_Material3_MaterialCalendar_HeaderCancelButton = 2132017937
        const val ThemeOverlay_Material3_MaterialTimePicker = 2132017938

        /* renamed from: ThemeOverlay_Material3_MaterialTimePicker_Display_TextInputEditText */
        const val f9918xcb07865 = 2132017939
        const val ThemeOverlay_Material3_NavigationView = 2132017940
        const val ThemeOverlay_Material3_Snackbar = 2132017941
        const val ThemeOverlay_Material3_TextInputEditText = 2132017942
        const val ThemeOverlay_Material3_TextInputEditText_FilledBox = 2132017943
        const val ThemeOverlay_Material3_TextInputEditText_FilledBox_Dense = 2132017944
        const val ThemeOverlay_Material3_TextInputEditText_OutlinedBox = 2132017945
        const val ThemeOverlay_Material3_TextInputEditText_OutlinedBox_Dense = 2132017946
        const val ThemeOverlay_Material3_Toolbar_Surface = 2132017947
        const val ThemeOverlay_MaterialAlertDialog_Material3_Title_Icon = 2132017948
        const val ThemeOverlay_MaterialComponents = 2132017949
        const val ThemeOverlay_MaterialComponents_ActionBar = 2132017950
        const val ThemeOverlay_MaterialComponents_ActionBar_Primary = 2132017951
        const val ThemeOverlay_MaterialComponents_ActionBar_Surface = 2132017952
        const val ThemeOverlay_MaterialComponents_AutoCompleteTextView = 2132017953
        const val ThemeOverlay_MaterialComponents_AutoCompleteTextView_FilledBox = 2132017954

        /* renamed from: ThemeOverlay_MaterialComponents_AutoCompleteTextView_FilledBox_Dense */
        const val f9919x3194dd0e = 2132017955
        const val ThemeOverlay_MaterialComponents_AutoCompleteTextView_OutlinedBox = 2132017956

        /* renamed from: ThemeOverlay_MaterialComponents_AutoCompleteTextView_OutlinedBox_Dense */
        const val f9920x2469ccce = 2132017957
        const val ThemeOverlay_MaterialComponents_BottomAppBar_Primary = 2132017958
        const val ThemeOverlay_MaterialComponents_BottomAppBar_Surface = 2132017959
        const val ThemeOverlay_MaterialComponents_BottomSheetDialog = 2132017960
        const val ThemeOverlay_MaterialComponents_Dark = 2132017961
        const val ThemeOverlay_MaterialComponents_Dark_ActionBar = 2132017962
        const val ThemeOverlay_MaterialComponents_DayNight_BottomSheetDialog = 2132017963
        const val ThemeOverlay_MaterialComponents_Dialog = 2132017964
        const val ThemeOverlay_MaterialComponents_Dialog_Alert = 2132017965
        const val ThemeOverlay_MaterialComponents_Dialog_Alert_Framework = 2132017966
        const val ThemeOverlay_MaterialComponents_Light = 2132017967
        const val ThemeOverlay_MaterialComponents_Light_Dialog_Alert_Framework = 2132017968
        const val ThemeOverlay_MaterialComponents_MaterialAlertDialog = 2132017969
        const val ThemeOverlay_MaterialComponents_MaterialAlertDialog_Centered = 2132017970
        const val ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date = 2132017971

        /* renamed from: ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Calendar */
        const val f9921x8886184a = 2132017972

        /* renamed from: ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Header_Text */
        const val f9922x9b335733 = 2132017973

        /* renamed from: ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Header_Text_Day */
        const val f9923x96aac070 = 2132017974

        /* renamed from: ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Spinner */
        const val f9924x7cc1c38d = 2132017975
        const val ThemeOverlay_MaterialComponents_MaterialCalendar = 2132017976
        const val ThemeOverlay_MaterialComponents_MaterialCalendar_Fullscreen = 2132017977
        const val ThemeOverlay_MaterialComponents_TextInputEditText = 2132017978
        const val ThemeOverlay_MaterialComponents_TextInputEditText_FilledBox = 2132017979

        /* renamed from: ThemeOverlay_MaterialComponents_TextInputEditText_FilledBox_Dense */
        const val f9925xb44864b4 = 2132017980
        const val ThemeOverlay_MaterialComponents_TextInputEditText_OutlinedBox = 2132017981

        /* renamed from: ThemeOverlay_MaterialComponents_TextInputEditText_OutlinedBox_Dense */
        const val f9926xc85a02f4 = 2132017982
        const val ThemeOverlay_MaterialComponents_TimePicker = 2132017983
        const val ThemeOverlay_MaterialComponents_TimePicker_Display = 2132017984

        /* renamed from: ThemeOverlay_MaterialComponents_TimePicker_Display_TextInputEditText */
        const val f9927xeac9d19d = 2132017985
        const val ThemeOverlay_MaterialComponents_Toolbar_Popup_Primary = 2132017986
        const val ThemeOverlay_MaterialComponents_Toolbar_Primary = 2132017987
        const val ThemeOverlay_MaterialComponents_Toolbar_Surface = 2132017988
        const val ThemeOverlay_MediaRouter_Dark = 2132017989
        const val ThemeOverlay_MediaRouter_Light = 2132017990
        const val Theme_AlertDialog = 2132017785
        const val Theme_AppCompat = 2132017786
        const val Theme_AppCompat_CompactMenu = 2132017787
        const val Theme_AppCompat_DayNight = 2132017788
        const val Theme_AppCompat_DayNight_DarkActionBar = 2132017789
        const val Theme_AppCompat_DayNight_Dialog = 2132017790
        const val Theme_AppCompat_DayNight_DialogWhenLarge = 2132017793
        const val Theme_AppCompat_DayNight_Dialog_Alert = 2132017791
        const val Theme_AppCompat_DayNight_Dialog_MinWidth = 2132017792
        const val Theme_AppCompat_DayNight_NoActionBar = 2132017794
        const val Theme_AppCompat_Dialog = 2132017795
        const val Theme_AppCompat_DialogWhenLarge = 2132017798
        const val Theme_AppCompat_Dialog_Alert = 2132017796
        const val Theme_AppCompat_Dialog_MinWidth = 2132017797
        const val Theme_AppCompat_Empty = 2132017799
        const val Theme_AppCompat_Light = 2132017800
        const val Theme_AppCompat_Light_DarkActionBar = 2132017801
        const val Theme_AppCompat_Light_Dialog = 2132017802
        const val Theme_AppCompat_Light_DialogWhenLarge = 2132017805
        const val Theme_AppCompat_Light_Dialog_Alert = 2132017803
        const val Theme_AppCompat_Light_Dialog_MinWidth = 2132017804
        const val Theme_AppCompat_Light_NoActionBar = 2132017806
        const val Theme_AppCompat_NoActionBar = 2132017807
        const val Theme_Design = 2132017808
        const val Theme_Design_BottomSheetDialog = 2132017809
        const val Theme_Design_Light = 2132017810
        const val Theme_Design_Light_BottomSheetDialog = 2132017811
        const val Theme_Design_Light_NoActionBar = 2132017812
        const val Theme_Design_NoActionBar = 2132017813
        const val Theme_Material3_Dark = 2132017814
        const val Theme_Material3_Dark_BottomSheetDialog = 2132017815
        const val Theme_Material3_Dark_Dialog = 2132017816
        const val Theme_Material3_Dark_DialogWhenLarge = 2132017819
        const val Theme_Material3_Dark_Dialog_Alert = 2132017817
        const val Theme_Material3_Dark_Dialog_MinWidth = 2132017818
        const val Theme_Material3_Dark_NoActionBar = 2132017820
        const val Theme_Material3_DayNight = 2132017821
        const val Theme_Material3_DayNight_BottomSheetDialog = 2132017822
        const val Theme_Material3_DayNight_Dialog = 2132017823
        const val Theme_Material3_DayNight_DialogWhenLarge = 2132017826
        const val Theme_Material3_DayNight_Dialog_Alert = 2132017824
        const val Theme_Material3_DayNight_Dialog_MinWidth = 2132017825
        const val Theme_Material3_DayNight_NoActionBar = 2132017827
        const val Theme_Material3_DynamicColors_Dark = 2132017828
        const val Theme_Material3_DynamicColors_DayNight = 2132017829
        const val Theme_Material3_DynamicColors_Light = 2132017830
        const val Theme_Material3_Light = 2132017831
        const val Theme_Material3_Light_BottomSheetDialog = 2132017832
        const val Theme_Material3_Light_Dialog = 2132017833
        const val Theme_Material3_Light_DialogWhenLarge = 2132017836
        const val Theme_Material3_Light_Dialog_Alert = 2132017834
        const val Theme_Material3_Light_Dialog_MinWidth = 2132017835
        const val Theme_Material3_Light_NoActionBar = 2132017837
        const val Theme_MaterialComponents = 2132017838
        const val Theme_MaterialComponents_BottomSheetDialog = 2132017839
        const val Theme_MaterialComponents_Bridge = 2132017840
        const val Theme_MaterialComponents_CompactMenu = 2132017841
        const val Theme_MaterialComponents_DayNight = 2132017842
        const val Theme_MaterialComponents_DayNight_BottomSheetDialog = 2132017843
        const val Theme_MaterialComponents_DayNight_Bridge = 2132017844
        const val Theme_MaterialComponents_DayNight_DarkActionBar = 2132017845
        const val Theme_MaterialComponents_DayNight_DarkActionBar_Bridge = 2132017846
        const val Theme_MaterialComponents_DayNight_Dialog = 2132017847
        const val Theme_MaterialComponents_DayNight_DialogWhenLarge = 2132017855
        const val Theme_MaterialComponents_DayNight_Dialog_Alert = 2132017848
        const val Theme_MaterialComponents_DayNight_Dialog_Alert_Bridge = 2132017849
        const val Theme_MaterialComponents_DayNight_Dialog_Bridge = 2132017850
        const val Theme_MaterialComponents_DayNight_Dialog_FixedSize = 2132017851
        const val Theme_MaterialComponents_DayNight_Dialog_FixedSize_Bridge = 2132017852
        const val Theme_MaterialComponents_DayNight_Dialog_MinWidth = 2132017853
        const val Theme_MaterialComponents_DayNight_Dialog_MinWidth_Bridge = 2132017854
        const val Theme_MaterialComponents_DayNight_NoActionBar = 2132017856
        const val Theme_MaterialComponents_DayNight_NoActionBar_Bridge = 2132017857
        const val Theme_MaterialComponents_Dialog = 2132017858
        const val Theme_MaterialComponents_DialogWhenLarge = 2132017866
        const val Theme_MaterialComponents_Dialog_Alert = 2132017859
        const val Theme_MaterialComponents_Dialog_Alert_Bridge = 2132017860
        const val Theme_MaterialComponents_Dialog_Bridge = 2132017861
        const val Theme_MaterialComponents_Dialog_FixedSize = 2132017862
        const val Theme_MaterialComponents_Dialog_FixedSize_Bridge = 2132017863
        const val Theme_MaterialComponents_Dialog_MinWidth = 2132017864
        const val Theme_MaterialComponents_Dialog_MinWidth_Bridge = 2132017865
        const val Theme_MaterialComponents_Light = 2132017867
        const val Theme_MaterialComponents_Light_BarSize = 2132017868
        const val Theme_MaterialComponents_Light_BottomSheetDialog = 2132017869
        const val Theme_MaterialComponents_Light_Bridge = 2132017870
        const val Theme_MaterialComponents_Light_DarkActionBar = 2132017871
        const val Theme_MaterialComponents_Light_DarkActionBar_Bridge = 2132017872
        const val Theme_MaterialComponents_Light_Dialog = 2132017873
        const val Theme_MaterialComponents_Light_DialogWhenLarge = 2132017881
        const val Theme_MaterialComponents_Light_Dialog_Alert = 2132017874
        const val Theme_MaterialComponents_Light_Dialog_Alert_Bridge = 2132017875
        const val Theme_MaterialComponents_Light_Dialog_Bridge = 2132017876
        const val Theme_MaterialComponents_Light_Dialog_FixedSize = 2132017877
        const val Theme_MaterialComponents_Light_Dialog_FixedSize_Bridge = 2132017878
        const val Theme_MaterialComponents_Light_Dialog_MinWidth = 2132017879
        const val Theme_MaterialComponents_Light_Dialog_MinWidth_Bridge = 2132017880
        const val Theme_MaterialComponents_Light_LargeTouch = 2132017882
        const val Theme_MaterialComponents_Light_NoActionBar = 2132017883
        const val Theme_MaterialComponents_Light_NoActionBar_Bridge = 2132017884
        const val Theme_MaterialComponents_NoActionBar = 2132017885
        const val Theme_MaterialComponents_NoActionBar_Bridge = 2132017886
        const val Theme_MediaRouter = 2132017887
        const val Theme_MediaRouter_Light = 2132017888
        const val Theme_MediaRouter_LightControlPanel = 2132017890
        const val Theme_MediaRouter_Light_DarkControlPanel = 2132017889
        const val Theme_Widget_Tabs = 2132017891
        const val UnicornFilePicker_Default = 2132017992
        const val UnicornFilePicker_Dracula = 2132017993
        const val VideoButton = 2132017994
        const val VideoButtonTV = 2132017995
        const val WatchHeaderText = 2132017996
        const val WhiteButton = 2132017997
        const val Widget_AppCompat_ActionBar = 2132017998
        const val Widget_AppCompat_ActionBar_Solid = 2132017999
        const val Widget_AppCompat_ActionBar_TabBar = 2132018000
        const val Widget_AppCompat_ActionBar_TabText = 2132018001
        const val Widget_AppCompat_ActionBar_TabView = 2132018002
        const val Widget_AppCompat_ActionButton = 2132018003
        const val Widget_AppCompat_ActionButton_CloseMode = 2132018004
        const val Widget_AppCompat_ActionButton_Overflow = 2132018005
        const val Widget_AppCompat_ActionMode = 2132018006
        const val Widget_AppCompat_ActivityChooserView = 2132018007
        const val Widget_AppCompat_AutoCompleteTextView = 2132018008
        const val Widget_AppCompat_Button = 2132018009
        const val Widget_AppCompat_ButtonBar = 2132018015
        const val Widget_AppCompat_ButtonBar_AlertDialog = 2132018016
        const val Widget_AppCompat_Button_Borderless = 2132018010
        const val Widget_AppCompat_Button_Borderless_Colored = 2132018011
        const val Widget_AppCompat_Button_ButtonBar_AlertDialog = 2132018012
        const val Widget_AppCompat_Button_Colored = 2132018013
        const val Widget_AppCompat_Button_Small = 2132018014
        const val Widget_AppCompat_CompoundButton_CheckBox = 2132018017
        const val Widget_AppCompat_CompoundButton_RadioButton = 2132018018
        const val Widget_AppCompat_CompoundButton_Switch = 2132018019
        const val Widget_AppCompat_DrawerArrowToggle = 2132018020
        const val Widget_AppCompat_DropDownItem_Spinner = 2132018021
        const val Widget_AppCompat_EditText = 2132018022
        const val Widget_AppCompat_ImageButton = 2132018023
        const val Widget_AppCompat_Light_ActionBar = 2132018024
        const val Widget_AppCompat_Light_ActionBar_Solid = 2132018025
        const val Widget_AppCompat_Light_ActionBar_Solid_Inverse = 2132018026
        const val Widget_AppCompat_Light_ActionBar_TabBar = 2132018027
        const val Widget_AppCompat_Light_ActionBar_TabBar_Inverse = 2132018028
        const val Widget_AppCompat_Light_ActionBar_TabText = 2132018029
        const val Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2132018030
        const val Widget_AppCompat_Light_ActionBar_TabView = 2132018031
        const val Widget_AppCompat_Light_ActionBar_TabView_Inverse = 2132018032
        const val Widget_AppCompat_Light_ActionButton = 2132018033
        const val Widget_AppCompat_Light_ActionButton_CloseMode = 2132018034
        const val Widget_AppCompat_Light_ActionButton_Overflow = 2132018035
        const val Widget_AppCompat_Light_ActionMode_Inverse = 2132018036
        const val Widget_AppCompat_Light_ActivityChooserView = 2132018037
        const val Widget_AppCompat_Light_AutoCompleteTextView = 2132018038
        const val Widget_AppCompat_Light_DropDownItem_Spinner = 2132018039
        const val Widget_AppCompat_Light_ListPopupWindow = 2132018040
        const val Widget_AppCompat_Light_ListView_DropDown = 2132018041
        const val Widget_AppCompat_Light_PopupMenu = 2132018042
        const val Widget_AppCompat_Light_PopupMenu_Overflow = 2132018043
        const val Widget_AppCompat_Light_SearchView = 2132018044
        const val Widget_AppCompat_Light_Spinner_DropDown_ActionBar = 2132018045
        const val Widget_AppCompat_ListMenuView = 2132018046
        const val Widget_AppCompat_ListPopupWindow = 2132018047
        const val Widget_AppCompat_ListView = 2132018048
        const val Widget_AppCompat_ListView_DropDown = 2132018049
        const val Widget_AppCompat_ListView_Menu = 2132018050
        const val Widget_AppCompat_PopupMenu = 2132018051
        const val Widget_AppCompat_PopupMenu_Overflow = 2132018052
        const val Widget_AppCompat_PopupWindow = 2132018053
        const val Widget_AppCompat_ProgressBar = 2132018054
        const val Widget_AppCompat_ProgressBar_Horizontal = 2132018055
        const val Widget_AppCompat_RatingBar = 2132018056
        const val Widget_AppCompat_RatingBar_Indicator = 2132018057
        const val Widget_AppCompat_RatingBar_Small = 2132018058
        const val Widget_AppCompat_SearchView = 2132018059
        const val Widget_AppCompat_SearchView_ActionBar = 2132018060
        const val Widget_AppCompat_SeekBar = 2132018061
        const val Widget_AppCompat_SeekBar_Discrete = 2132018062
        const val Widget_AppCompat_Spinner = 2132018063
        const val Widget_AppCompat_Spinner_DropDown = 2132018064
        const val Widget_AppCompat_Spinner_DropDown_ActionBar = 2132018065
        const val Widget_AppCompat_Spinner_Underlined = 2132018066
        const val Widget_AppCompat_TextView = 2132018067
        const val Widget_AppCompat_TextView_SpinnerItem = 2132018068
        const val Widget_AppCompat_Toolbar = 2132018069
        const val Widget_AppCompat_Toolbar_Button_Navigation = 2132018070
        const val Widget_Compat_NotificationActionContainer = 2132018071
        const val Widget_Compat_NotificationActionText = 2132018072
        const val Widget_Design_AppBarLayout = 2132018073
        const val Widget_Design_BottomNavigationView = 2132018074
        const val Widget_Design_BottomSheet_Modal = 2132018075
        const val Widget_Design_CollapsingToolbar = 2132018076
        const val Widget_Design_FloatingActionButton = 2132018077
        const val Widget_Design_NavigationView = 2132018078
        const val Widget_Design_ScrimInsetsFrameLayout = 2132018079
        const val Widget_Design_Snackbar = 2132018080
        const val Widget_Design_TabLayout = 2132018081
        const val Widget_Design_TextInputEditText = 2132018082
        const val Widget_Design_TextInputLayout = 2132018083
        const val Widget_Material3_ActionBar_Solid = 2132018084
        const val Widget_Material3_ActionMode = 2132018085
        const val Widget_Material3_AppBarLayout = 2132018086
        const val Widget_Material3_AutoCompleteTextView_FilledBox = 2132018087
        const val Widget_Material3_AutoCompleteTextView_FilledBox_Dense = 2132018088
        const val Widget_Material3_AutoCompleteTextView_OutlinedBox = 2132018089
        const val Widget_Material3_AutoCompleteTextView_OutlinedBox_Dense = 2132018090
        const val Widget_Material3_Badge = 2132018091
        const val Widget_Material3_BottomAppBar = 2132018092
        const val Widget_Material3_BottomNavigationView = 2132018093
        const val Widget_Material3_BottomNavigationView_ActiveIndicator = 2132018094
        const val Widget_Material3_BottomSheet = 2132018095
        const val Widget_Material3_BottomSheet_Modal = 2132018096
        const val Widget_Material3_Button = 2132018097
        const val Widget_Material3_Button_ElevatedButton = 2132018098
        const val Widget_Material3_Button_ElevatedButton_Icon = 2132018099
        const val Widget_Material3_Button_Icon = 2132018100
        const val Widget_Material3_Button_IconButton = 2132018101
        const val Widget_Material3_Button_OutlinedButton = 2132018102
        const val Widget_Material3_Button_OutlinedButton_Icon = 2132018103
        const val Widget_Material3_Button_TextButton = 2132018104
        const val Widget_Material3_Button_TextButton_Dialog = 2132018105
        const val Widget_Material3_Button_TextButton_Dialog_Flush = 2132018106
        const val Widget_Material3_Button_TextButton_Dialog_Icon = 2132018107
        const val Widget_Material3_Button_TextButton_Icon = 2132018108
        const val Widget_Material3_Button_TextButton_Snackbar = 2132018109
        const val Widget_Material3_Button_TonalButton = 2132018110
        const val Widget_Material3_Button_TonalButton_Icon = 2132018111
        const val Widget_Material3_Button_UnelevatedButton = 2132018112
        const val Widget_Material3_CardView_Elevated = 2132018113
        const val Widget_Material3_CardView_Filled = 2132018114
        const val Widget_Material3_CardView_Outlined = 2132018115
        const val Widget_Material3_CheckedTextView = 2132018116
        const val Widget_Material3_ChipGroup = 2132018127
        const val Widget_Material3_Chip_Assist = 2132018117
        const val Widget_Material3_Chip_Assist_Elevated = 2132018118
        const val Widget_Material3_Chip_Filter = 2132018119
        const val Widget_Material3_Chip_Filter_Elevated = 2132018120
        const val Widget_Material3_Chip_Input = 2132018121
        const val Widget_Material3_Chip_Input_Elevated = 2132018122
        const val Widget_Material3_Chip_Input_Icon = 2132018123
        const val Widget_Material3_Chip_Input_Icon_Elevated = 2132018124
        const val Widget_Material3_Chip_Suggestion = 2132018125
        const val Widget_Material3_Chip_Suggestion_Elevated = 2132018126
        const val Widget_Material3_CircularProgressIndicator = 2132018128
        const val Widget_Material3_CircularProgressIndicator_ExtraSmall = 2132018129
        const val Widget_Material3_CircularProgressIndicator_Medium = 2132018130
        const val Widget_Material3_CircularProgressIndicator_Small = 2132018131
        const val Widget_Material3_CollapsingToolbar = 2132018132
        const val Widget_Material3_CollapsingToolbar_Large = 2132018133
        const val Widget_Material3_CollapsingToolbar_Medium = 2132018134
        const val Widget_Material3_CompoundButton_CheckBox = 2132018135
        const val Widget_Material3_CompoundButton_RadioButton = 2132018136
        const val Widget_Material3_CompoundButton_Switch = 2132018137
        const val Widget_Material3_DrawerLayout = 2132018138
        const val Widget_Material3_ExtendedFloatingActionButton_Icon_Primary = 2132018139
        const val Widget_Material3_ExtendedFloatingActionButton_Icon_Secondary = 2132018140
        const val Widget_Material3_ExtendedFloatingActionButton_Icon_Surface = 2132018141
        const val Widget_Material3_ExtendedFloatingActionButton_Icon_Tertiary = 2132018142
        const val Widget_Material3_ExtendedFloatingActionButton_Primary = 2132018143
        const val Widget_Material3_ExtendedFloatingActionButton_Secondary = 2132018144
        const val Widget_Material3_ExtendedFloatingActionButton_Surface = 2132018145
        const val Widget_Material3_ExtendedFloatingActionButton_Tertiary = 2132018146
        const val Widget_Material3_FloatingActionButton_Large_Primary = 2132018147
        const val Widget_Material3_FloatingActionButton_Large_Secondary = 2132018148
        const val Widget_Material3_FloatingActionButton_Large_Surface = 2132018149
        const val Widget_Material3_FloatingActionButton_Large_Tertiary = 2132018150
        const val Widget_Material3_FloatingActionButton_Primary = 2132018151
        const val Widget_Material3_FloatingActionButton_Secondary = 2132018152
        const val Widget_Material3_FloatingActionButton_Surface = 2132018153
        const val Widget_Material3_FloatingActionButton_Tertiary = 2132018154
        const val Widget_Material3_Light_ActionBar_Solid = 2132018155
        const val Widget_Material3_LinearProgressIndicator = 2132018156
        const val Widget_Material3_MaterialCalendar = 2132018157
        const val Widget_Material3_MaterialCalendar_Day = 2132018158
        const val Widget_Material3_MaterialCalendar_DayOfWeekLabel = 2132018162
        const val Widget_Material3_MaterialCalendar_DayTextView = 2132018163
        const val Widget_Material3_MaterialCalendar_Day_Invalid = 2132018159
        const val Widget_Material3_MaterialCalendar_Day_Selected = 2132018160
        const val Widget_Material3_MaterialCalendar_Day_Today = 2132018161
        const val Widget_Material3_MaterialCalendar_Fullscreen = 2132018164
        const val Widget_Material3_MaterialCalendar_HeaderCancelButton = 2132018165
        const val Widget_Material3_MaterialCalendar_HeaderDivider = 2132018166
        const val Widget_Material3_MaterialCalendar_HeaderLayout = 2132018167
        const val Widget_Material3_MaterialCalendar_HeaderSelection = 2132018168
        const val Widget_Material3_MaterialCalendar_HeaderSelection_Fullscreen = 2132018169
        const val Widget_Material3_MaterialCalendar_HeaderTitle = 2132018170
        const val Widget_Material3_MaterialCalendar_HeaderToggleButton = 2132018171
        const val Widget_Material3_MaterialCalendar_Item = 2132018172
        const val Widget_Material3_MaterialCalendar_MonthNavigationButton = 2132018173
        const val Widget_Material3_MaterialCalendar_MonthTextView = 2132018174
        const val Widget_Material3_MaterialCalendar_Year = 2132018175
        const val Widget_Material3_MaterialCalendar_YearNavigationButton = 2132018178
        const val Widget_Material3_MaterialCalendar_Year_Selected = 2132018176
        const val Widget_Material3_MaterialCalendar_Year_Today = 2132018177
        const val Widget_Material3_MaterialDivider = 2132018179
        const val Widget_Material3_MaterialDivider_Heavy = 2132018180
        const val Widget_Material3_MaterialTimePicker = 2132018181
        const val Widget_Material3_MaterialTimePicker_Button = 2132018182
        const val Widget_Material3_MaterialTimePicker_Clock = 2132018183
        const val Widget_Material3_MaterialTimePicker_Display = 2132018184
        const val Widget_Material3_MaterialTimePicker_Display_Divider = 2132018185
        const val Widget_Material3_MaterialTimePicker_Display_HelperText = 2132018186
        const val Widget_Material3_MaterialTimePicker_Display_TextInputEditText = 2132018187
        const val Widget_Material3_MaterialTimePicker_Display_TextInputLayout = 2132018188
        const val Widget_Material3_MaterialTimePicker_ImageButton = 2132018189
        const val Widget_Material3_NavigationRailView = 2132018190
        const val Widget_Material3_NavigationRailView_ActiveIndicator = 2132018191
        const val Widget_Material3_NavigationView = 2132018192
        const val Widget_Material3_PopupMenu = 2132018193
        const val Widget_Material3_PopupMenu_ContextMenu = 2132018194
        const val Widget_Material3_PopupMenu_ListPopupWindow = 2132018195
        const val Widget_Material3_PopupMenu_Overflow = 2132018196
        const val Widget_Material3_Slider = 2132018197
        const val Widget_Material3_Snackbar = 2132018198
        const val Widget_Material3_Snackbar_FullWidth = 2132018199
        const val Widget_Material3_Snackbar_TextView = 2132018200
        const val Widget_Material3_TabLayout = 2132018201
        const val Widget_Material3_TabLayout_OnSurface = 2132018202
        const val Widget_Material3_TabLayout_Secondary = 2132018203
        const val Widget_Material3_TextInputEditText_FilledBox = 2132018204
        const val Widget_Material3_TextInputEditText_FilledBox_Dense = 2132018205
        const val Widget_Material3_TextInputEditText_OutlinedBox = 2132018206
        const val Widget_Material3_TextInputEditText_OutlinedBox_Dense = 2132018207
        const val Widget_Material3_TextInputLayout_FilledBox = 2132018208
        const val Widget_Material3_TextInputLayout_FilledBox_Dense = 2132018209

        /* renamed from: Widget_Material3_TextInputLayout_FilledBox_Dense_ExposedDropdownMenu */
        const val f9928xee200b54 = 2132018210
        const val Widget_Material3_TextInputLayout_FilledBox_ExposedDropdownMenu = 2132018211
        const val Widget_Material3_TextInputLayout_OutlinedBox = 2132018212
        const val Widget_Material3_TextInputLayout_OutlinedBox_Dense = 2132018213

        /* renamed from: Widget_Material3_TextInputLayout_OutlinedBox_Dense_ExposedDropdownMenu */
        const val f9929x33d579d4 = 2132018214
        const val Widget_Material3_TextInputLayout_OutlinedBox_ExposedDropdownMenu = 2132018215
        const val Widget_Material3_Toolbar = 2132018216
        const val Widget_Material3_Toolbar_OnSurface = 2132018217
        const val Widget_Material3_Toolbar_Surface = 2132018218
        const val Widget_Material3_Tooltip = 2132018219
        const val Widget_MaterialComponents_ActionBar_Primary = 2132018220
        const val Widget_MaterialComponents_ActionBar_PrimarySurface = 2132018221
        const val Widget_MaterialComponents_ActionBar_Solid = 2132018222
        const val Widget_MaterialComponents_ActionBar_Surface = 2132018223
        const val Widget_MaterialComponents_AppBarLayout_Primary = 2132018224
        const val Widget_MaterialComponents_AppBarLayout_PrimarySurface = 2132018225
        const val Widget_MaterialComponents_AppBarLayout_Surface = 2132018226
        const val Widget_MaterialComponents_AutoCompleteTextView_FilledBox = 2132018227
        const val Widget_MaterialComponents_AutoCompleteTextView_FilledBox_Dense = 2132018228
        const val Widget_MaterialComponents_AutoCompleteTextView_OutlinedBox = 2132018229
        const val Widget_MaterialComponents_AutoCompleteTextView_OutlinedBox_Dense = 2132018230
        const val Widget_MaterialComponents_Badge = 2132018231
        const val Widget_MaterialComponents_BottomAppBar = 2132018232
        const val Widget_MaterialComponents_BottomAppBar_Colored = 2132018233
        const val Widget_MaterialComponents_BottomAppBar_PrimarySurface = 2132018234
        const val Widget_MaterialComponents_BottomNavigationView = 2132018235
        const val Widget_MaterialComponents_BottomNavigationView_Colored = 2132018236
        const val Widget_MaterialComponents_BottomNavigationView_PrimarySurface = 2132018237
        const val Widget_MaterialComponents_BottomSheet = 2132018238
        const val Widget_MaterialComponents_BottomSheet_Modal = 2132018239
        const val Widget_MaterialComponents_Button = 2132018240
        const val Widget_MaterialComponents_Button_Icon = 2132018241
        const val Widget_MaterialComponents_Button_OutlinedButton = 2132018242
        const val Widget_MaterialComponents_Button_OutlinedButton_Icon = 2132018243
        const val Widget_MaterialComponents_Button_TextButton = 2132018244
        const val Widget_MaterialComponents_Button_TextButton_Dialog = 2132018245
        const val Widget_MaterialComponents_Button_TextButton_Dialog_Flush = 2132018246
        const val Widget_MaterialComponents_Button_TextButton_Dialog_Icon = 2132018247
        const val Widget_MaterialComponents_Button_TextButton_Icon = 2132018248
        const val Widget_MaterialComponents_Button_TextButton_Snackbar = 2132018249
        const val Widget_MaterialComponents_Button_UnelevatedButton = 2132018250
        const val Widget_MaterialComponents_Button_UnelevatedButton_Icon = 2132018251
        const val Widget_MaterialComponents_CardView = 2132018252
        const val Widget_MaterialComponents_CheckedTextView = 2132018253
        const val Widget_MaterialComponents_ChipGroup = 2132018258
        const val Widget_MaterialComponents_Chip_Action = 2132018254
        const val Widget_MaterialComponents_Chip_Choice = 2132018255
        const val Widget_MaterialComponents_Chip_Entry = 2132018256
        const val Widget_MaterialComponents_Chip_Filter = 2132018257
        const val Widget_MaterialComponents_CircularProgressIndicator = 2132018259
        const val Widget_MaterialComponents_CircularProgressIndicator_ExtraSmall = 2132018260
        const val Widget_MaterialComponents_CircularProgressIndicator_Medium = 2132018261
        const val Widget_MaterialComponents_CircularProgressIndicator_Small = 2132018262
        const val Widget_MaterialComponents_CollapsingToolbar = 2132018263
        const val Widget_MaterialComponents_CompoundButton_CheckBox = 2132018264
        const val Widget_MaterialComponents_CompoundButton_RadioButton = 2132018265
        const val Widget_MaterialComponents_CompoundButton_Switch = 2132018266
        const val Widget_MaterialComponents_ExtendedFloatingActionButton = 2132018267
        const val Widget_MaterialComponents_ExtendedFloatingActionButton_Icon = 2132018268
        const val Widget_MaterialComponents_FloatingActionButton = 2132018269
        const val Widget_MaterialComponents_Light_ActionBar_Solid = 2132018270
        const val Widget_MaterialComponents_LinearProgressIndicator = 2132018271
        const val Widget_MaterialComponents_MaterialButtonToggleGroup = 2132018272
        const val Widget_MaterialComponents_MaterialCalendar = 2132018273
        const val Widget_MaterialComponents_MaterialCalendar_Day = 2132018274
        const val Widget_MaterialComponents_MaterialCalendar_DayOfWeekLabel = 2132018278
        const val Widget_MaterialComponents_MaterialCalendar_DayTextView = 2132018279
        const val Widget_MaterialComponents_MaterialCalendar_Day_Invalid = 2132018275
        const val Widget_MaterialComponents_MaterialCalendar_Day_Selected = 2132018276
        const val Widget_MaterialComponents_MaterialCalendar_Day_Today = 2132018277
        const val Widget_MaterialComponents_MaterialCalendar_Fullscreen = 2132018280
        const val Widget_MaterialComponents_MaterialCalendar_HeaderCancelButton = 2132018281
        const val Widget_MaterialComponents_MaterialCalendar_HeaderConfirmButton = 2132018282
        const val Widget_MaterialComponents_MaterialCalendar_HeaderDivider = 2132018283
        const val Widget_MaterialComponents_MaterialCalendar_HeaderLayout = 2132018284
        const val Widget_MaterialComponents_MaterialCalendar_HeaderSelection = 2132018285

        /* renamed from: Widget_MaterialComponents_MaterialCalendar_HeaderSelection_Fullscreen */
        const val f9930x77b19d4e = 2132018286
        const val Widget_MaterialComponents_MaterialCalendar_HeaderTitle = 2132018287
        const val Widget_MaterialComponents_MaterialCalendar_HeaderToggleButton = 2132018288
        const val Widget_MaterialComponents_MaterialCalendar_Item = 2132018289
        const val Widget_MaterialComponents_MaterialCalendar_MonthNavigationButton = 2132018290
        const val Widget_MaterialComponents_MaterialCalendar_MonthTextView = 2132018291
        const val Widget_MaterialComponents_MaterialCalendar_Year = 2132018292
        const val Widget_MaterialComponents_MaterialCalendar_YearNavigationButton = 2132018295
        const val Widget_MaterialComponents_MaterialCalendar_Year_Selected = 2132018293
        const val Widget_MaterialComponents_MaterialCalendar_Year_Today = 2132018294
        const val Widget_MaterialComponents_MaterialDivider = 2132018296
        const val Widget_MaterialComponents_NavigationRailView = 2132018297
        const val Widget_MaterialComponents_NavigationRailView_Colored = 2132018298
        const val Widget_MaterialComponents_NavigationRailView_Colored_Compact = 2132018299
        const val Widget_MaterialComponents_NavigationRailView_Compact = 2132018300
        const val Widget_MaterialComponents_NavigationRailView_PrimarySurface = 2132018301
        const val Widget_MaterialComponents_NavigationView = 2132018302
        const val Widget_MaterialComponents_PopupMenu = 2132018303
        const val Widget_MaterialComponents_PopupMenu_ContextMenu = 2132018304
        const val Widget_MaterialComponents_PopupMenu_ListPopupWindow = 2132018305
        const val Widget_MaterialComponents_PopupMenu_Overflow = 2132018306
        const val Widget_MaterialComponents_ProgressIndicator = 2132018307
        const val Widget_MaterialComponents_ShapeableImageView = 2132018308
        const val Widget_MaterialComponents_Slider = 2132018309
        const val Widget_MaterialComponents_Snackbar = 2132018310
        const val Widget_MaterialComponents_Snackbar_FullWidth = 2132018311
        const val Widget_MaterialComponents_Snackbar_TextView = 2132018312
        const val Widget_MaterialComponents_TabLayout = 2132018313
        const val Widget_MaterialComponents_TabLayout_Colored = 2132018314
        const val Widget_MaterialComponents_TabLayout_PrimarySurface = 2132018315
        const val Widget_MaterialComponents_TextInputEditText_FilledBox = 2132018316
        const val Widget_MaterialComponents_TextInputEditText_FilledBox_Dense = 2132018317
        const val Widget_MaterialComponents_TextInputEditText_OutlinedBox = 2132018318
        const val Widget_MaterialComponents_TextInputEditText_OutlinedBox_Dense = 2132018319
        const val Widget_MaterialComponents_TextInputLayout_FilledBox = 2132018320
        const val Widget_MaterialComponents_TextInputLayout_FilledBox_Dense = 2132018321

        /* renamed from: Widget_MaterialComponents_TextInputLayout_FilledBox_Dense_ExposedDropdownMenu */
        const val f9931x5c070b9b = 2132018322

        /* renamed from: Widget_MaterialComponents_TextInputLayout_FilledBox_ExposedDropdownMenu */
        const val f9932x22b53d1b = 2132018323
        const val Widget_MaterialComponents_TextInputLayout_OutlinedBox = 2132018324
        const val Widget_MaterialComponents_TextInputLayout_OutlinedBox_Dense = 2132018325

        /* renamed from: Widget_MaterialComponents_TextInputLayout_OutlinedBox_Dense_ExposedDropdownMenu */
        const val f9933xc3fd845b = 2132018326

        /* renamed from: Widget_MaterialComponents_TextInputLayout_OutlinedBox_ExposedDropdownMenu */
        const val f9934x802545db = 2132018327
        const val Widget_MaterialComponents_TextView = 2132018328
        const val Widget_MaterialComponents_TimePicker = 2132018329
        const val Widget_MaterialComponents_TimePicker_Button = 2132018330
        const val Widget_MaterialComponents_TimePicker_Clock = 2132018331
        const val Widget_MaterialComponents_TimePicker_Display = 2132018332
        const val Widget_MaterialComponents_TimePicker_Display_Divider = 2132018333
        const val Widget_MaterialComponents_TimePicker_Display_HelperText = 2132018334
        const val Widget_MaterialComponents_TimePicker_Display_TextInputEditText = 2132018335
        const val Widget_MaterialComponents_TimePicker_Display_TextInputLayout = 2132018336
        const val Widget_MaterialComponents_TimePicker_ImageButton = 2132018337
        const val Widget_MaterialComponents_TimePicker_ImageButton_ShapeAppearance = 2132018338
        const val Widget_MaterialComponents_Toolbar = 2132018339
        const val Widget_MaterialComponents_Toolbar_Primary = 2132018340
        const val Widget_MaterialComponents_Toolbar_PrimarySurface = 2132018341
        const val Widget_MaterialComponents_Toolbar_Surface = 2132018342
        const val Widget_MaterialComponents_Tooltip = 2132018343
        const val Widget_MediaRouter_Light_MediaRouteButton = 2132018344
        const val Widget_MediaRouter_MediaRouteButton = 2132018345
        const val Widget_Support_CoordinatorLayout = 2132018346
        const val circle = 2132018347
        const val com_applovin_mediation_MaxDebuggerActivity_ActionBar = 2132018348
        const val com_applovin_mediation_MaxDebuggerActivity_ActionBar_Live = 2132018349

        /* renamed from: com_applovin_mediation_MaxDebuggerActivity_ActionBar_TitleTextStyle */
        const val f9935x6f9fc22a = 2132018350
        const val com_applovin_mediation_MaxDebuggerActivity_Theme = 2132018351
        const val com_applovin_mediation_MaxDebuggerActivity_Theme_Live = 2132018352
        const val com_applovin_mediation_nativeAds_MaxNativeAdView_AdBadgeTextView = 2132018353

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_AutoScrollingTextView */
        const val f9936xd6283485 = 2132018354
        const val com_applovin_mediation_nativeAds_MaxNativeAdView_CTAButton = 2132018355

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_LargeAdBadgeTextView */
        const val f9937x1a37bc8a = 2132018356

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_LargeScrollingBodyTextView */
        const val f9938xa74cbb81 = 2132018357

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_LargeScrollingTitleTextView */
        const val f9939xcdda433d = 2132018358

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_LargeVerticalBodyTextSize */
        const val f9940x2014de6e = 2132018359

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_LargeVerticalTitleTextSize */
        const val f9941x6e3f1d28 = 2132018360

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_ScrollingTitleTextView */
        const val f9942xfd9c9da8 = 2132018361

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_SmallAdBadgeTextView */
        const val f9943xc43f913e = 2132018362

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_SmallScrollingBodyTextView */
        const val f9944x4b073935 = 2132018363

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_SmallScrollingTitleTextView */
        const val f9945xa16f7c09 = 2132018364

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_SmallVerticalBodyTextSize */
        const val f9946x98f9da3a = 2132018365

        /* renamed from: com_applovin_mediation_nativeAds_MaxNativeAdView_SmallVerticalTitleTextSize */
        const val f9947x11f99adc = 2132018366
        const val com_applovin_mediation_nativeAds_MaxNativeAdView_TitleTextStyle = 2132018367
        const val com_facebook_activity_theme = 2132018368
        const val com_facebook_auth_dialog = 2132018369
        const val com_facebook_auth_dialog_instructions_textview = 2132018370
        const val com_facebook_button = 2132018371
        const val com_facebook_button_like = 2132018372
        const val com_facebook_button_send = 2132018373
        const val com_facebook_button_share = 2132018374
        const val com_facebook_loginview_default_style = 2132018375
        const val cpv_ColorPickerViewStyle = 2132018376
        const val customCastDefColor = 2132018377
        const val customRatingBar = 2132018378
        const val style_item_menu_profile = 2132018379
        const val style_item_upgrade = 2132018380
        const val style_item_upgrade_guidline = 2132018381
        const val tooltip_bubble_text = 2132018382
    }

    /* renamed from: com.lagradost.cloudstream3.R$styleable */ /* loaded from: classes3.dex */
    object styleable {
        const val AVLoadingIndicatorView_indicator = 0
        const val AVLoadingIndicatorView_indicator_color = 1
        const val ActionBarLayout_android_layout_gravity = 0
        const val ActionBar_background = 0
        const val ActionBar_backgroundSplit = 1
        const val ActionBar_backgroundStacked = 2
        const val ActionBar_contentInsetEnd = 3
        const val ActionBar_contentInsetEndWithActions = 4
        const val ActionBar_contentInsetLeft = 5
        const val ActionBar_contentInsetRight = 6
        const val ActionBar_contentInsetStart = 7
        const val ActionBar_contentInsetStartWithNavigation = 8
        const val ActionBar_customNavigationLayout = 9
        const val ActionBar_displayOptions = 10
        const val ActionBar_divider = 11
        const val ActionBar_elevation = 12
        const val ActionBar_height = 13
        const val ActionBar_hideOnContentScroll = 14
        const val ActionBar_homeAsUpIndicator = 15
        const val ActionBar_homeLayout = 16
        const val ActionBar_icon = 17
        const val ActionBar_indeterminateProgressStyle = 18
        const val ActionBar_itemPadding = 19
        const val ActionBar_logo = 20
        const val ActionBar_navigationMode = 21
        const val ActionBar_popupTheme = 22
        const val ActionBar_progressBarPadding = 23
        const val ActionBar_progressBarStyle = 24
        const val ActionBar_subtitle = 25
        const val ActionBar_subtitleTextStyle = 26
        const val ActionBar_title = 27
        const val ActionBar_titleTextStyle = 28
        const val ActionMenuItemView_android_minWidth = 0
        const val ActionMode_background = 0
        const val ActionMode_backgroundSplit = 1
        const val ActionMode_closeItemLayout = 2
        const val ActionMode_height = 3
        const val ActionMode_subtitleTextStyle = 4
        const val ActionMode_titleTextStyle = 5
        const val ActivityChooserView_expandActivityOverflowButtonDrawable = 0
        const val ActivityChooserView_initialActivityCount = 1
        const val ActivityFilter_activityAction = 0
        const val ActivityFilter_activityName = 1
        const val ActivityNavigator_action = 1
        const val ActivityNavigator_android_name = 0
        const val ActivityNavigator_data = 2
        const val ActivityNavigator_dataPattern = 3
        const val ActivityNavigator_targetPackage = 4
        const val ActivityRule_alwaysExpand = 0
        const val AlertDialog_android_layout = 0
        const val AlertDialog_buttonIconDimen = 1
        const val AlertDialog_buttonPanelSideLayout = 2
        const val AlertDialog_listItemLayout = 3
        const val AlertDialog_listLayout = 4
        const val AlertDialog_multiChoiceItemLayout = 5
        const val AlertDialog_showTitle = 6
        const val AlertDialog_singleChoiceItemLayout = 7
        const val AnimatedStateListDrawableCompat_android_constantSize = 3
        const val AnimatedStateListDrawableCompat_android_dither = 0
        const val AnimatedStateListDrawableCompat_android_enterFadeDuration = 4
        const val AnimatedStateListDrawableCompat_android_exitFadeDuration = 5
        const val AnimatedStateListDrawableCompat_android_variablePadding = 2
        const val AnimatedStateListDrawableCompat_android_visible = 1
        const val AnimatedStateListDrawableItem_android_drawable = 1
        const val AnimatedStateListDrawableItem_android_id = 0
        const val AnimatedStateListDrawableTransition_android_drawable = 0
        const val AnimatedStateListDrawableTransition_android_fromId = 2
        const val AnimatedStateListDrawableTransition_android_reversible = 3
        const val AnimatedStateListDrawableTransition_android_toId = 1
        const val AppBarLayoutStates_state_collapsed = 0
        const val AppBarLayoutStates_state_collapsible = 1
        const val AppBarLayoutStates_state_liftable = 2
        const val AppBarLayoutStates_state_lifted = 3
        const val AppBarLayout_Layout_layout_scrollEffect = 0
        const val AppBarLayout_Layout_layout_scrollFlags = 1
        const val AppBarLayout_Layout_layout_scrollInterpolator = 2
        const val AppBarLayout_android_background = 0
        const val AppBarLayout_android_keyboardNavigationCluster = 2
        const val AppBarLayout_android_touchscreenBlocksFocus = 1
        const val AppBarLayout_elevation = 3
        const val AppBarLayout_expanded = 4
        const val AppBarLayout_liftOnScroll = 5
        const val AppBarLayout_liftOnScrollTargetViewId = 6
        const val AppBarLayout_statusBarForeground = 7
        const val AppCompatImageView_android_src = 0
        const val AppCompatImageView_srcCompat = 1
        const val AppCompatImageView_tint = 2
        const val AppCompatImageView_tintMode = 3
        const val AppCompatSeekBar_android_thumb = 0
        const val AppCompatSeekBar_tickMark = 1
        const val AppCompatSeekBar_tickMarkTint = 2
        const val AppCompatSeekBar_tickMarkTintMode = 3
        const val AppCompatTextHelper_android_drawableBottom = 2
        const val AppCompatTextHelper_android_drawableEnd = 6
        const val AppCompatTextHelper_android_drawableLeft = 3
        const val AppCompatTextHelper_android_drawableRight = 4
        const val AppCompatTextHelper_android_drawableStart = 5
        const val AppCompatTextHelper_android_drawableTop = 1
        const val AppCompatTextHelper_android_textAppearance = 0
        const val AppCompatTextView_android_textAppearance = 0
        const val AppCompatTextView_autoSizeMaxTextSize = 1
        const val AppCompatTextView_autoSizeMinTextSize = 2
        const val AppCompatTextView_autoSizePresetSizes = 3
        const val AppCompatTextView_autoSizeStepGranularity = 4
        const val AppCompatTextView_autoSizeTextType = 5
        const val AppCompatTextView_drawableBottomCompat = 6
        const val AppCompatTextView_drawableEndCompat = 7
        const val AppCompatTextView_drawableLeftCompat = 8
        const val AppCompatTextView_drawableRightCompat = 9
        const val AppCompatTextView_drawableStartCompat = 10
        const val AppCompatTextView_drawableTint = 11
        const val AppCompatTextView_drawableTintMode = 12
        const val AppCompatTextView_drawableTopCompat = 13
        const val AppCompatTextView_emojiCompatEnabled = 14
        const val AppCompatTextView_firstBaselineToTopHeight = 15
        const val AppCompatTextView_fontFamily = 16
        const val AppCompatTextView_fontVariationSettings = 17
        const val AppCompatTextView_lastBaselineToBottomHeight = 18
        const val AppCompatTextView_lineHeight = 19
        const val AppCompatTextView_textAllCaps = 20
        const val AppCompatTextView_textLocale = 21
        const val AppCompatTheme_actionBarDivider = 2
        const val AppCompatTheme_actionBarItemBackground = 3
        const val AppCompatTheme_actionBarPopupTheme = 4
        const val AppCompatTheme_actionBarSize = 5
        const val AppCompatTheme_actionBarSplitStyle = 6
        const val AppCompatTheme_actionBarStyle = 7
        const val AppCompatTheme_actionBarTabBarStyle = 8
        const val AppCompatTheme_actionBarTabStyle = 9
        const val AppCompatTheme_actionBarTabTextStyle = 10
        const val AppCompatTheme_actionBarTheme = 11
        const val AppCompatTheme_actionBarWidgetTheme = 12
        const val AppCompatTheme_actionButtonStyle = 13
        const val AppCompatTheme_actionDropDownStyle = 14
        const val AppCompatTheme_actionMenuTextAppearance = 15
        const val AppCompatTheme_actionMenuTextColor = 16
        const val AppCompatTheme_actionModeBackground = 17
        const val AppCompatTheme_actionModeCloseButtonStyle = 18
        const val AppCompatTheme_actionModeCloseContentDescription = 19
        const val AppCompatTheme_actionModeCloseDrawable = 20
        const val AppCompatTheme_actionModeCopyDrawable = 21
        const val AppCompatTheme_actionModeCutDrawable = 22
        const val AppCompatTheme_actionModeFindDrawable = 23
        const val AppCompatTheme_actionModePasteDrawable = 24
        const val AppCompatTheme_actionModePopupWindowStyle = 25
        const val AppCompatTheme_actionModeSelectAllDrawable = 26
        const val AppCompatTheme_actionModeShareDrawable = 27
        const val AppCompatTheme_actionModeSplitBackground = 28
        const val AppCompatTheme_actionModeStyle = 29
        const val AppCompatTheme_actionModeTheme = 30
        const val AppCompatTheme_actionModeWebSearchDrawable = 31
        const val AppCompatTheme_actionOverflowButtonStyle = 32
        const val AppCompatTheme_actionOverflowMenuStyle = 33
        const val AppCompatTheme_activityChooserViewStyle = 34
        const val AppCompatTheme_alertDialogButtonGroupStyle = 35
        const val AppCompatTheme_alertDialogCenterButtons = 36
        const val AppCompatTheme_alertDialogStyle = 37
        const val AppCompatTheme_alertDialogTheme = 38
        const val AppCompatTheme_android_windowAnimationStyle = 1
        const val AppCompatTheme_android_windowIsFloating = 0
        const val AppCompatTheme_autoCompleteTextViewStyle = 39
        const val AppCompatTheme_borderlessButtonStyle = 40
        const val AppCompatTheme_buttonBarButtonStyle = 41
        const val AppCompatTheme_buttonBarNegativeButtonStyle = 42
        const val AppCompatTheme_buttonBarNeutralButtonStyle = 43
        const val AppCompatTheme_buttonBarPositiveButtonStyle = 44
        const val AppCompatTheme_buttonBarStyle = 45
        const val AppCompatTheme_buttonStyle = 46
        const val AppCompatTheme_buttonStyleSmall = 47
        const val AppCompatTheme_checkboxStyle = 48
        const val AppCompatTheme_checkedTextViewStyle = 49
        const val AppCompatTheme_colorAccent = 50
        const val AppCompatTheme_colorBackgroundFloating = 51
        const val AppCompatTheme_colorButtonNormal = 52
        const val AppCompatTheme_colorControlActivated = 53
        const val AppCompatTheme_colorControlHighlight = 54
        const val AppCompatTheme_colorControlNormal = 55
        const val AppCompatTheme_colorError = 56
        const val AppCompatTheme_colorPrimary = 57
        const val AppCompatTheme_colorPrimaryDark = 58
        const val AppCompatTheme_colorSwitchThumbNormal = 59
        const val AppCompatTheme_controlBackground = 60
        const val AppCompatTheme_dialogCornerRadius = 61
        const val AppCompatTheme_dialogPreferredPadding = 62
        const val AppCompatTheme_dialogTheme = 63
        const val AppCompatTheme_dividerHorizontal = 64
        const val AppCompatTheme_dividerVertical = 65
        const val AppCompatTheme_dropDownListViewStyle = 66
        const val AppCompatTheme_dropdownListPreferredItemHeight = 67
        const val AppCompatTheme_editTextBackground = 68
        const val AppCompatTheme_editTextColor = 69
        const val AppCompatTheme_editTextStyle = 70
        const val AppCompatTheme_homeAsUpIndicator = 71
        const val AppCompatTheme_imageButtonStyle = 72
        const val AppCompatTheme_listChoiceBackgroundIndicator = 73
        const val AppCompatTheme_listChoiceIndicatorMultipleAnimated = 74
        const val AppCompatTheme_listChoiceIndicatorSingleAnimated = 75
        const val AppCompatTheme_listDividerAlertDialog = 76
        const val AppCompatTheme_listMenuViewStyle = 77
        const val AppCompatTheme_listPopupWindowStyle = 78
        const val AppCompatTheme_listPreferredItemHeight = 79
        const val AppCompatTheme_listPreferredItemHeightLarge = 80
        const val AppCompatTheme_listPreferredItemHeightSmall = 81
        const val AppCompatTheme_listPreferredItemPaddingEnd = 82
        const val AppCompatTheme_listPreferredItemPaddingLeft = 83
        const val AppCompatTheme_listPreferredItemPaddingRight = 84
        const val AppCompatTheme_listPreferredItemPaddingStart = 85
        const val AppCompatTheme_panelBackground = 86
        const val AppCompatTheme_panelMenuListTheme = 87
        const val AppCompatTheme_panelMenuListWidth = 88
        const val AppCompatTheme_popupMenuStyle = 89
        const val AppCompatTheme_popupWindowStyle = 90
        const val AppCompatTheme_radioButtonStyle = 91
        const val AppCompatTheme_ratingBarStyle = 92
        const val AppCompatTheme_ratingBarStyleIndicator = 93
        const val AppCompatTheme_ratingBarStyleSmall = 94
        const val AppCompatTheme_searchViewStyle = 95
        const val AppCompatTheme_seekBarStyle = 96
        const val AppCompatTheme_selectableItemBackground = 97
        const val AppCompatTheme_selectableItemBackgroundBorderless = 98
        const val AppCompatTheme_spinnerDropDownItemStyle = 99
        const val AppCompatTheme_spinnerStyle = 100
        const val AppCompatTheme_switchStyle = 101
        const val AppCompatTheme_textAppearanceLargePopupMenu = 102
        const val AppCompatTheme_textAppearanceListItem = 103
        const val AppCompatTheme_textAppearanceListItemSecondary = 104
        const val AppCompatTheme_textAppearanceListItemSmall = 105
        const val AppCompatTheme_textAppearancePopupMenuHeader = 106
        const val AppCompatTheme_textAppearanceSearchResultSubtitle = 107
        const val AppCompatTheme_textAppearanceSearchResultTitle = 108
        const val AppCompatTheme_textAppearanceSmallPopupMenu = 109
        const val AppCompatTheme_textColorAlertDialogListItem = 110
        const val AppCompatTheme_textColorSearchUrl = 111
        const val AppCompatTheme_toolbarNavigationButtonStyle = 112
        const val AppCompatTheme_toolbarStyle = 113
        const val AppCompatTheme_tooltipForegroundColor = 114
        const val AppCompatTheme_tooltipFrameBackground = 115
        const val AppCompatTheme_viewInflaterClass = 116
        const val AppCompatTheme_windowActionBar = 117
        const val AppCompatTheme_windowActionBarOverlay = 118
        const val AppCompatTheme_windowActionModeOverlay = 119
        const val AppCompatTheme_windowFixedHeightMajor = 120
        const val AppCompatTheme_windowFixedHeightMinor = 121
        const val AppCompatTheme_windowFixedWidthMajor = 122
        const val AppCompatTheme_windowFixedWidthMinor = 123
        const val AppCompatTheme_windowMinWidthMajor = 124
        const val AppCompatTheme_windowMinWidthMinor = 125
        const val AppCompatTheme_windowNoTitle = 126
        const val AspectRatioFrameLayout_resize_mode = 0
        const val AvatarView_avvy_badge_color = 0
        const val AvatarView_avvy_badge_position = 1
        const val AvatarView_avvy_badge_radius = 2
        const val AvatarView_avvy_badge_stroke_color = 3
        const val AvatarView_avvy_badge_stroke_width = 4
        const val AvatarView_avvy_border_color = 5
        const val AvatarView_avvy_border_color_end = 6
        const val AvatarView_avvy_border_highlight_color = 7
        const val AvatarView_avvy_border_highlight_color_end = 8
        const val AvatarView_avvy_border_thickness = 9
        const val AvatarView_avvy_border_thickness_highlight = 10
        const val AvatarView_avvy_circle_background_color = 11
        const val AvatarView_avvy_distance_to_border = 12
        const val AvatarView_avvy_highlighted = 13
        const val AvatarView_avvy_loading_arc_degree_length = 14
        const val AvatarView_avvy_loading_arches = 15
        const val AvatarView_avvy_loading_arches_degree_area = 16
        const val AvatarView_avvy_middle_color = 17
        const val AvatarView_avvy_show_badge = 18
        const val AvatarView_avvy_text = 19
        const val AvatarView_avvy_text_color = 20
        const val AvatarView_avvy_text_size = 21
        const val BackgroundStyle_android_selectableItemBackground = 0
        const val BackgroundStyle_selectableItemBackground = 1
        const val Badge_backgroundColor = 0
        const val Badge_badgeGravity = 1
        const val Badge_badgeRadius = 2
        const val Badge_badgeTextColor = 3
        const val Badge_badgeWidePadding = 4
        const val Badge_badgeWithTextRadius = 5
        const val Badge_horizontalOffset = 6
        const val Badge_horizontalOffsetWithText = 7
        const val Badge_maxCharacterCount = 8
        const val Badge_number = 9
        const val Badge_verticalOffset = 10
        const val Badge_verticalOffsetWithText = 11
        const val BaseProgressIndicator_android_indeterminate = 0
        const val BaseProgressIndicator_hideAnimationBehavior = 1
        const val BaseProgressIndicator_indicatorColor = 2
        const val BaseProgressIndicator_minHideDelay = 3
        const val BaseProgressIndicator_showAnimationBehavior = 4
        const val BaseProgressIndicator_showDelay = 5
        const val BaseProgressIndicator_trackColor = 6
        const val BaseProgressIndicator_trackCornerRadius = 7
        const val BaseProgressIndicator_trackThickness = 8
        const val BlurView_blurOverlayColor = 0
        const val BottomAppBar_backgroundTint = 0
        const val BottomAppBar_elevation = 1
        const val BottomAppBar_fabAlignmentMode = 2
        const val BottomAppBar_fabAnimationMode = 3
        const val BottomAppBar_fabCradleMargin = 4
        const val BottomAppBar_fabCradleRoundedCornerRadius = 5
        const val BottomAppBar_fabCradleVerticalOffset = 6
        const val BottomAppBar_hideOnScroll = 7
        const val BottomAppBar_navigationIconTint = 8
        const val BottomAppBar_paddingBottomSystemWindowInsets = 9
        const val BottomAppBar_paddingLeftSystemWindowInsets = 10
        const val BottomAppBar_paddingRightSystemWindowInsets = 11
        const val BottomNavigationView_android_minHeight = 0
        const val BottomNavigationView_itemHorizontalTranslationEnabled = 1
        const val BottomSheetBehavior_Layout_android_elevation = 2
        const val BottomSheetBehavior_Layout_android_maxHeight = 1
        const val BottomSheetBehavior_Layout_android_maxWidth = 0
        const val BottomSheetBehavior_Layout_backgroundTint = 3
        const val BottomSheetBehavior_Layout_behavior_draggable = 4
        const val BottomSheetBehavior_Layout_behavior_expandedOffset = 5
        const val BottomSheetBehavior_Layout_behavior_fitToContents = 6
        const val BottomSheetBehavior_Layout_behavior_halfExpandedRatio = 7
        const val BottomSheetBehavior_Layout_behavior_hideable = 8
        const val BottomSheetBehavior_Layout_behavior_peekHeight = 9
        const val BottomSheetBehavior_Layout_behavior_saveFlags = 10
        const val BottomSheetBehavior_Layout_behavior_skipCollapsed = 11
        const val BottomSheetBehavior_Layout_gestureInsetBottomIgnored = 12
        const val BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets = 13
        const val BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets = 14
        const val BottomSheetBehavior_Layout_paddingRightSystemWindowInsets = 15
        const val BottomSheetBehavior_Layout_paddingTopSystemWindowInsets = 16
        const val BottomSheetBehavior_Layout_shapeAppearance = 17
        const val BottomSheetBehavior_Layout_shapeAppearanceOverlay = 18
        const val ButtonBarLayout_allowStacking = 0
        const val Capability_queryPatterns = 0
        const val Capability_shortcutMatchRequired = 1
        const val CardView_android_minHeight = 1
        const val CardView_android_minWidth = 0
        const val CardView_cardBackgroundColor = 2
        const val CardView_cardCornerRadius = 3
        const val CardView_cardElevation = 4
        const val CardView_cardMaxElevation = 5
        const val CardView_cardPreventCornerOverlap = 6
        const val CardView_cardUseCompatPadding = 7
        const val CardView_contentPadding = 8
        const val CardView_contentPaddingBottom = 9
        const val CardView_contentPaddingLeft = 10
        const val CardView_contentPaddingRight = 11
        const val CardView_contentPaddingTop = 12
        const val Carousel_carousel_backwardTransition = 0
        const val Carousel_carousel_emptyViewsBehavior = 1
        const val Carousel_carousel_firstView = 2
        const val Carousel_carousel_forwardTransition = 3
        const val Carousel_carousel_infinite = 4
        const val Carousel_carousel_nextState = 5
        const val Carousel_carousel_previousState = 6
        const val Carousel_carousel_touchUpMode = 7
        const val Carousel_carousel_touchUp_dampeningFactor = 8
        const val Carousel_carousel_touchUp_velocityThreshold = 9
        const val CastExpandedController_castAdBreakMarkerColor = 0
        const val CastExpandedController_castAdInProgressLabelTextAppearance = 1
        const val CastExpandedController_castAdInProgressText = 2
        const val CastExpandedController_castAdInProgressTextColor = 3
        const val CastExpandedController_castAdLabelColor = 4
        const val CastExpandedController_castAdLabelTextAppearance = 5
        const val CastExpandedController_castAdLabelTextColor = 6
        const val CastExpandedController_castButtonColor = 7
        const val CastExpandedController_castClosedCaptionsButtonDrawable = 8
        const val CastExpandedController_castControlButtons = 9
        const val CastExpandedController_castDefaultAdPosterUrl = 10

        /* renamed from: CastExpandedController_castExpandedControllerLoadingIndicatorColor */
        const val f9948xcb1f8bb1 = 11
        const val CastExpandedController_castForward30ButtonDrawable = 12
        const val CastExpandedController_castLiveIndicatorColor = 13
        const val CastExpandedController_castMuteToggleButtonDrawable = 14
        const val CastExpandedController_castPauseButtonDrawable = 15
        const val CastExpandedController_castPlayButtonDrawable = 16
        const val CastExpandedController_castRewind30ButtonDrawable = 17
        const val CastExpandedController_castSeekBarProgressAndThumbColor = 18
        const val CastExpandedController_castSeekBarProgressDrawable = 19
        const val CastExpandedController_castSeekBarSecondaryProgressColor = 20
        const val CastExpandedController_castSeekBarThumbDrawable = 21
        const val CastExpandedController_castSeekBarTooltipBackgroundColor = 22
        const val CastExpandedController_castSeekBarUnseekableProgressColor = 23
        const val CastExpandedController_castSkipNextButtonDrawable = 24
        const val CastExpandedController_castSkipPreviousButtonDrawable = 25
        const val CastExpandedController_castStopButtonDrawable = 26
        const val CastIntroOverlay_castBackgroundColor = 0
        const val CastIntroOverlay_castButtonBackgroundColor = 1
        const val CastIntroOverlay_castButtonText = 2
        const val CastIntroOverlay_castButtonTextAppearance = 3
        const val CastIntroOverlay_castFocusRadius = 4
        const val CastIntroOverlay_castTitleTextAppearance = 5
        const val CastMiniController_castBackground = 0
        const val CastMiniController_castButtonColor = 1
        const val CastMiniController_castClosedCaptionsButtonDrawable = 2
        const val CastMiniController_castControlButtons = 3
        const val CastMiniController_castForward30ButtonDrawable = 4
        const val CastMiniController_castLargePauseButtonDrawable = 5
        const val CastMiniController_castLargePlayButtonDrawable = 6
        const val CastMiniController_castLargeStopButtonDrawable = 7
        const val CastMiniController_castMiniControllerLoadingIndicatorColor = 8
        const val CastMiniController_castMuteToggleButtonDrawable = 9
        const val CastMiniController_castPauseButtonDrawable = 10
        const val CastMiniController_castPlayButtonDrawable = 11
        const val CastMiniController_castProgressBarColor = 12
        const val CastMiniController_castRewind30ButtonDrawable = 13
        const val CastMiniController_castShowImageThumbnail = 14
        const val CastMiniController_castSkipNextButtonDrawable = 15
        const val CastMiniController_castSkipPreviousButtonDrawable = 16
        const val CastMiniController_castStopButtonDrawable = 17
        const val CastMiniController_castSubtitleTextAppearance = 18
        const val CastMiniController_castTitleTextAppearance = 19
        const val CheckBoxPreference_android_disableDependentsState = 2
        const val CheckBoxPreference_android_summaryOff = 1
        const val CheckBoxPreference_android_summaryOn = 0
        const val CheckBoxPreference_disableDependentsState = 3
        const val CheckBoxPreference_summaryOff = 4
        const val CheckBoxPreference_summaryOn = 5
        const val CheckedTextView_android_checkMark = 0
        const val CheckedTextView_checkMarkCompat = 1
        const val CheckedTextView_checkMarkTint = 2
        const val CheckedTextView_checkMarkTintMode = 3
        const val ChipGroup_checkedChip = 0
        const val ChipGroup_chipSpacing = 1
        const val ChipGroup_chipSpacingHorizontal = 2
        const val ChipGroup_chipSpacingVertical = 3
        const val ChipGroup_selectionRequired = 4
        const val ChipGroup_singleLine = 5
        const val ChipGroup_singleSelection = 6
        const val Chip_android_checkable = 6
        const val Chip_android_ellipsize = 3
        const val Chip_android_maxWidth = 4
        const val Chip_android_text = 5
        const val Chip_android_textAppearance = 0
        const val Chip_android_textColor = 2
        const val Chip_android_textSize = 1
        const val Chip_checkedIcon = 7
        const val Chip_checkedIconEnabled = 8
        const val Chip_checkedIconTint = 9
        const val Chip_checkedIconVisible = 10
        const val Chip_chipBackgroundColor = 11
        const val Chip_chipCornerRadius = 12
        const val Chip_chipEndPadding = 13
        const val Chip_chipIcon = 14
        const val Chip_chipIconEnabled = 15
        const val Chip_chipIconSize = 16
        const val Chip_chipIconTint = 17
        const val Chip_chipIconVisible = 18
        const val Chip_chipMinHeight = 19
        const val Chip_chipMinTouchTargetSize = 20
        const val Chip_chipStartPadding = 21
        const val Chip_chipStrokeColor = 22
        const val Chip_chipStrokeWidth = 23
        const val Chip_chipSurfaceColor = 24
        const val Chip_closeIcon = 25
        const val Chip_closeIconEnabled = 26
        const val Chip_closeIconEndPadding = 27
        const val Chip_closeIconSize = 28
        const val Chip_closeIconStartPadding = 29
        const val Chip_closeIconTint = 30
        const val Chip_closeIconVisible = 31
        const val Chip_ensureMinTouchTargetSize = 32
        const val Chip_hideMotionSpec = 33
        const val Chip_iconEndPadding = 34
        const val Chip_iconStartPadding = 35
        const val Chip_rippleColor = 36
        const val Chip_shapeAppearance = 37
        const val Chip_shapeAppearanceOverlay = 38
        const val Chip_showMotionSpec = 39
        const val Chip_textEndPadding = 40
        const val Chip_textStartPadding = 41
        const val CircularProgressIndicator_indicatorDirectionCircular = 0
        const val CircularProgressIndicator_indicatorInset = 1
        const val CircularProgressIndicator_indicatorSize = 2
        const val ClockFaceView_clockFaceBackgroundColor = 0
        const val ClockFaceView_clockNumberTextColor = 1
        const val ClockHandView_clockHandColor = 0
        const val ClockHandView_materialCircleRadius = 1
        const val ClockHandView_selectorSize = 2
        const val CollapsingToolbarLayout_Layout_layout_collapseMode = 0
        const val CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier = 1
        const val CollapsingToolbarLayout_collapsedTitleGravity = 0
        const val CollapsingToolbarLayout_collapsedTitleTextAppearance = 1
        const val CollapsingToolbarLayout_collapsedTitleTextColor = 2
        const val CollapsingToolbarLayout_contentScrim = 3
        const val CollapsingToolbarLayout_expandedTitleGravity = 4
        const val CollapsingToolbarLayout_expandedTitleMargin = 5
        const val CollapsingToolbarLayout_expandedTitleMarginBottom = 6
        const val CollapsingToolbarLayout_expandedTitleMarginEnd = 7
        const val CollapsingToolbarLayout_expandedTitleMarginStart = 8
        const val CollapsingToolbarLayout_expandedTitleMarginTop = 9
        const val CollapsingToolbarLayout_expandedTitleTextAppearance = 10
        const val CollapsingToolbarLayout_expandedTitleTextColor = 11
        const val CollapsingToolbarLayout_extraMultilineHeightEnabled = 12
        const val CollapsingToolbarLayout_forceApplySystemWindowInsetTop = 13
        const val CollapsingToolbarLayout_maxLines = 14
        const val CollapsingToolbarLayout_scrimAnimationDuration = 15
        const val CollapsingToolbarLayout_scrimVisibleHeightTrigger = 16
        const val CollapsingToolbarLayout_statusBarScrim = 17
        const val CollapsingToolbarLayout_title = 18
        const val CollapsingToolbarLayout_titleCollapseMode = 19
        const val CollapsingToolbarLayout_titleEnabled = 20
        const val CollapsingToolbarLayout_titlePositionInterpolator = 21
        const val CollapsingToolbarLayout_toolbarId = 22
        const val ColorPanelView_cpv_borderColor = 0
        const val ColorPanelView_cpv_colorShape = 1
        const val ColorPanelView_cpv_showOldColor = 2
        const val ColorPickerView_cpv_alphaChannelText = 0
        const val ColorPickerView_cpv_alphaChannelVisible = 1
        const val ColorPickerView_cpv_borderColor = 2
        const val ColorPickerView_cpv_sliderColor = 3
        const val ColorPreference_cpv_allowCustom = 0
        const val ColorPreference_cpv_allowPresets = 1
        const val ColorPreference_cpv_colorPresets = 2
        const val ColorPreference_cpv_colorShape = 3
        const val ColorPreference_cpv_dialogTitle = 4
        const val ColorPreference_cpv_dialogType = 5
        const val ColorPreference_cpv_previewSize = 6
        const val ColorPreference_cpv_showAlphaSlider = 7
        const val ColorPreference_cpv_showColorShades = 8
        const val ColorPreference_cpv_showDialog = 9
        const val ColorStateListItem_alpha = 3
        const val ColorStateListItem_android_alpha = 1
        const val ColorStateListItem_android_color = 0
        const val ColorStateListItem_android_lStar = 2
        const val ColorStateListItem_lStar = 4
        const val CompoundButton_android_button = 0
        const val CompoundButton_buttonCompat = 1
        const val CompoundButton_buttonTint = 2
        const val CompoundButton_buttonTintMode = 3
        const val ConstraintLayout_Layout_android_elevation = 22
        const val ConstraintLayout_Layout_android_layout_height = 8
        const val ConstraintLayout_Layout_android_layout_margin = 9
        const val ConstraintLayout_Layout_android_layout_marginBottom = 13
        const val ConstraintLayout_Layout_android_layout_marginEnd = 21
        const val ConstraintLayout_Layout_android_layout_marginHorizontal = 23
        const val ConstraintLayout_Layout_android_layout_marginLeft = 10
        const val ConstraintLayout_Layout_android_layout_marginRight = 12
        const val ConstraintLayout_Layout_android_layout_marginStart = 20
        const val ConstraintLayout_Layout_android_layout_marginTop = 11
        const val ConstraintLayout_Layout_android_layout_marginVertical = 24
        const val ConstraintLayout_Layout_android_layout_width = 7
        const val ConstraintLayout_Layout_android_maxHeight = 15
        const val ConstraintLayout_Layout_android_maxWidth = 14
        const val ConstraintLayout_Layout_android_minHeight = 17
        const val ConstraintLayout_Layout_android_minWidth = 16
        const val ConstraintLayout_Layout_android_orientation = 0
        const val ConstraintLayout_Layout_android_padding = 1
        const val ConstraintLayout_Layout_android_paddingBottom = 5
        const val ConstraintLayout_Layout_android_paddingEnd = 19
        const val ConstraintLayout_Layout_android_paddingLeft = 2
        const val ConstraintLayout_Layout_android_paddingRight = 4
        const val ConstraintLayout_Layout_android_paddingStart = 18
        const val ConstraintLayout_Layout_android_paddingTop = 3
        const val ConstraintLayout_Layout_android_visibility = 6
        const val ConstraintLayout_Layout_barrierAllowsGoneWidgets = 25
        const val ConstraintLayout_Layout_barrierDirection = 26
        const val ConstraintLayout_Layout_barrierMargin = 27
        const val ConstraintLayout_Layout_chainUseRtl = 28
        const val ConstraintLayout_Layout_circularflow_angles = 29
        const val ConstraintLayout_Layout_circularflow_defaultAngle = 30
        const val ConstraintLayout_Layout_circularflow_defaultRadius = 31
        const val ConstraintLayout_Layout_circularflow_radiusInDP = 32
        const val ConstraintLayout_Layout_circularflow_viewCenter = 33
        const val ConstraintLayout_Layout_constraintSet = 34
        const val ConstraintLayout_Layout_constraint_referenced_ids = 35
        const val ConstraintLayout_Layout_constraint_referenced_tags = 36
        const val ConstraintLayout_Layout_flow_firstHorizontalBias = 37
        const val ConstraintLayout_Layout_flow_firstHorizontalStyle = 38
        const val ConstraintLayout_Layout_flow_firstVerticalBias = 39
        const val ConstraintLayout_Layout_flow_firstVerticalStyle = 40
        const val ConstraintLayout_Layout_flow_horizontalAlign = 41
        const val ConstraintLayout_Layout_flow_horizontalBias = 42
        const val ConstraintLayout_Layout_flow_horizontalGap = 43
        const val ConstraintLayout_Layout_flow_horizontalStyle = 44
        const val ConstraintLayout_Layout_flow_lastHorizontalBias = 45
        const val ConstraintLayout_Layout_flow_lastHorizontalStyle = 46
        const val ConstraintLayout_Layout_flow_lastVerticalBias = 47
        const val ConstraintLayout_Layout_flow_lastVerticalStyle = 48
        const val ConstraintLayout_Layout_flow_maxElementsWrap = 49
        const val ConstraintLayout_Layout_flow_verticalAlign = 50
        const val ConstraintLayout_Layout_flow_verticalBias = 51
        const val ConstraintLayout_Layout_flow_verticalGap = 52
        const val ConstraintLayout_Layout_flow_verticalStyle = 53
        const val ConstraintLayout_Layout_flow_wrapMode = 54
        const val ConstraintLayout_Layout_guidelineUseRtl = 55
        const val ConstraintLayout_Layout_layoutDescription = 56
        const val ConstraintLayout_Layout_layout_constrainedHeight = 57
        const val ConstraintLayout_Layout_layout_constrainedWidth = 58
        const val ConstraintLayout_Layout_layout_constraintBaseline_creator = 59
        const val ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf = 60
        const val ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf = 61
        const val ConstraintLayout_Layout_layout_constraintBaseline_toTopOf = 62
        const val ConstraintLayout_Layout_layout_constraintBottom_creator = 63
        const val ConstraintLayout_Layout_layout_constraintBottom_toBottomOf = 64
        const val ConstraintLayout_Layout_layout_constraintBottom_toTopOf = 65
        const val ConstraintLayout_Layout_layout_constraintCircle = 66
        const val ConstraintLayout_Layout_layout_constraintCircleAngle = 67
        const val ConstraintLayout_Layout_layout_constraintCircleRadius = 68
        const val ConstraintLayout_Layout_layout_constraintDimensionRatio = 69
        const val ConstraintLayout_Layout_layout_constraintEnd_toEndOf = 70
        const val ConstraintLayout_Layout_layout_constraintEnd_toStartOf = 71
        const val ConstraintLayout_Layout_layout_constraintGuide_begin = 72
        const val ConstraintLayout_Layout_layout_constraintGuide_end = 73
        const val ConstraintLayout_Layout_layout_constraintGuide_percent = 74
        const val ConstraintLayout_Layout_layout_constraintHeight = 75
        const val ConstraintLayout_Layout_layout_constraintHeight_default = 76
        const val ConstraintLayout_Layout_layout_constraintHeight_max = 77
        const val ConstraintLayout_Layout_layout_constraintHeight_min = 78
        const val ConstraintLayout_Layout_layout_constraintHeight_percent = 79
        const val ConstraintLayout_Layout_layout_constraintHorizontal_bias = 80
        const val ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle = 81
        const val ConstraintLayout_Layout_layout_constraintHorizontal_weight = 82
        const val ConstraintLayout_Layout_layout_constraintLeft_creator = 83
        const val ConstraintLayout_Layout_layout_constraintLeft_toLeftOf = 84
        const val ConstraintLayout_Layout_layout_constraintLeft_toRightOf = 85
        const val ConstraintLayout_Layout_layout_constraintRight_creator = 86
        const val ConstraintLayout_Layout_layout_constraintRight_toLeftOf = 87
        const val ConstraintLayout_Layout_layout_constraintRight_toRightOf = 88
        const val ConstraintLayout_Layout_layout_constraintStart_toEndOf = 89
        const val ConstraintLayout_Layout_layout_constraintStart_toStartOf = 90
        const val ConstraintLayout_Layout_layout_constraintTag = 91
        const val ConstraintLayout_Layout_layout_constraintTop_creator = 92
        const val ConstraintLayout_Layout_layout_constraintTop_toBottomOf = 93
        const val ConstraintLayout_Layout_layout_constraintTop_toTopOf = 94
        const val ConstraintLayout_Layout_layout_constraintVertical_bias = 95
        const val ConstraintLayout_Layout_layout_constraintVertical_chainStyle = 96
        const val ConstraintLayout_Layout_layout_constraintVertical_weight = 97
        const val ConstraintLayout_Layout_layout_constraintWidth = 98
        const val ConstraintLayout_Layout_layout_constraintWidth_default = 99
        const val ConstraintLayout_Layout_layout_constraintWidth_max = 100
        const val ConstraintLayout_Layout_layout_constraintWidth_min = 101
        const val ConstraintLayout_Layout_layout_constraintWidth_percent = 102
        const val ConstraintLayout_Layout_layout_editor_absoluteX = 103
        const val ConstraintLayout_Layout_layout_editor_absoluteY = 104
        const val ConstraintLayout_Layout_layout_goneMarginBaseline = 105
        const val ConstraintLayout_Layout_layout_goneMarginBottom = 106
        const val ConstraintLayout_Layout_layout_goneMarginEnd = 107
        const val ConstraintLayout_Layout_layout_goneMarginLeft = 108
        const val ConstraintLayout_Layout_layout_goneMarginRight = 109
        const val ConstraintLayout_Layout_layout_goneMarginStart = 110
        const val ConstraintLayout_Layout_layout_goneMarginTop = 111
        const val ConstraintLayout_Layout_layout_marginBaseline = 112
        const val ConstraintLayout_Layout_layout_optimizationLevel = 113
        const val ConstraintLayout_Layout_layout_wrapBehaviorInParent = 114
        const val ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange = 0

        /* renamed from: ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets */
        const val f9949xfdeff96 = 1

        /* renamed from: ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet */
        const val f9950x2694048c = 2
        const val ConstraintLayout_ReactiveGuide_reactiveGuide_valueId = 3
        const val ConstraintLayout_placeholder_content = 0
        const val ConstraintLayout_placeholder_placeholder_emptyVisibility = 1
        const val ConstraintOverride_android_alpha = 13
        const val ConstraintOverride_android_elevation = 26
        const val ConstraintOverride_android_id = 1
        const val ConstraintOverride_android_layout_height = 4
        const val ConstraintOverride_android_layout_marginBottom = 8
        const val ConstraintOverride_android_layout_marginEnd = 24
        const val ConstraintOverride_android_layout_marginLeft = 5
        const val ConstraintOverride_android_layout_marginRight = 7
        const val ConstraintOverride_android_layout_marginStart = 23
        const val ConstraintOverride_android_layout_marginTop = 6
        const val ConstraintOverride_android_layout_width = 3
        const val ConstraintOverride_android_maxHeight = 10
        const val ConstraintOverride_android_maxWidth = 9
        const val ConstraintOverride_android_minHeight = 12
        const val ConstraintOverride_android_minWidth = 11
        const val ConstraintOverride_android_orientation = 0
        const val ConstraintOverride_android_rotation = 20
        const val ConstraintOverride_android_rotationX = 21
        const val ConstraintOverride_android_rotationY = 22
        const val ConstraintOverride_android_scaleX = 18
        const val ConstraintOverride_android_scaleY = 19
        const val ConstraintOverride_android_transformPivotX = 14
        const val ConstraintOverride_android_transformPivotY = 15
        const val ConstraintOverride_android_translationX = 16
        const val ConstraintOverride_android_translationY = 17
        const val ConstraintOverride_android_translationZ = 25
        const val ConstraintOverride_android_visibility = 2
        const val ConstraintOverride_animateCircleAngleTo = 27
        const val ConstraintOverride_animateRelativeTo = 28
        const val ConstraintOverride_barrierAllowsGoneWidgets = 29
        const val ConstraintOverride_barrierDirection = 30
        const val ConstraintOverride_barrierMargin = 31
        const val ConstraintOverride_chainUseRtl = 32
        const val ConstraintOverride_constraint_referenced_ids = 33
        const val ConstraintOverride_drawPath = 34
        const val ConstraintOverride_flow_firstHorizontalBias = 35
        const val ConstraintOverride_flow_firstHorizontalStyle = 36
        const val ConstraintOverride_flow_firstVerticalBias = 37
        const val ConstraintOverride_flow_firstVerticalStyle = 38
        const val ConstraintOverride_flow_horizontalAlign = 39
        const val ConstraintOverride_flow_horizontalBias = 40
        const val ConstraintOverride_flow_horizontalGap = 41
        const val ConstraintOverride_flow_horizontalStyle = 42
        const val ConstraintOverride_flow_lastHorizontalBias = 43
        const val ConstraintOverride_flow_lastHorizontalStyle = 44
        const val ConstraintOverride_flow_lastVerticalBias = 45
        const val ConstraintOverride_flow_lastVerticalStyle = 46
        const val ConstraintOverride_flow_maxElementsWrap = 47
        const val ConstraintOverride_flow_verticalAlign = 48
        const val ConstraintOverride_flow_verticalBias = 49
        const val ConstraintOverride_flow_verticalGap = 50
        const val ConstraintOverride_flow_verticalStyle = 51
        const val ConstraintOverride_flow_wrapMode = 52
        const val ConstraintOverride_guidelineUseRtl = 53
        const val ConstraintOverride_layout_constrainedHeight = 54
        const val ConstraintOverride_layout_constrainedWidth = 55
        const val ConstraintOverride_layout_constraintBaseline_creator = 56
        const val ConstraintOverride_layout_constraintBottom_creator = 57
        const val ConstraintOverride_layout_constraintCircleAngle = 58
        const val ConstraintOverride_layout_constraintCircleRadius = 59
        const val ConstraintOverride_layout_constraintDimensionRatio = 60
        const val ConstraintOverride_layout_constraintGuide_begin = 61
        const val ConstraintOverride_layout_constraintGuide_end = 62
        const val ConstraintOverride_layout_constraintGuide_percent = 63
        const val ConstraintOverride_layout_constraintHeight = 64
        const val ConstraintOverride_layout_constraintHeight_default = 65
        const val ConstraintOverride_layout_constraintHeight_max = 66
        const val ConstraintOverride_layout_constraintHeight_min = 67
        const val ConstraintOverride_layout_constraintHeight_percent = 68
        const val ConstraintOverride_layout_constraintHorizontal_bias = 69
        const val ConstraintOverride_layout_constraintHorizontal_chainStyle = 70
        const val ConstraintOverride_layout_constraintHorizontal_weight = 71
        const val ConstraintOverride_layout_constraintLeft_creator = 72
        const val ConstraintOverride_layout_constraintRight_creator = 73
        const val ConstraintOverride_layout_constraintTag = 74
        const val ConstraintOverride_layout_constraintTop_creator = 75
        const val ConstraintOverride_layout_constraintVertical_bias = 76
        const val ConstraintOverride_layout_constraintVertical_chainStyle = 77
        const val ConstraintOverride_layout_constraintVertical_weight = 78
        const val ConstraintOverride_layout_constraintWidth = 79
        const val ConstraintOverride_layout_constraintWidth_default = 80
        const val ConstraintOverride_layout_constraintWidth_max = 81
        const val ConstraintOverride_layout_constraintWidth_min = 82
        const val ConstraintOverride_layout_constraintWidth_percent = 83
        const val ConstraintOverride_layout_editor_absoluteX = 84
        const val ConstraintOverride_layout_editor_absoluteY = 85
        const val ConstraintOverride_layout_goneMarginBaseline = 86
        const val ConstraintOverride_layout_goneMarginBottom = 87
        const val ConstraintOverride_layout_goneMarginEnd = 88
        const val ConstraintOverride_layout_goneMarginLeft = 89
        const val ConstraintOverride_layout_goneMarginRight = 90
        const val ConstraintOverride_layout_goneMarginStart = 91
        const val ConstraintOverride_layout_goneMarginTop = 92
        const val ConstraintOverride_layout_marginBaseline = 93
        const val ConstraintOverride_layout_wrapBehaviorInParent = 94
        const val ConstraintOverride_motionProgress = 95
        const val ConstraintOverride_motionStagger = 96
        const val ConstraintOverride_motionTarget = 97
        const val ConstraintOverride_pathMotionArc = 98
        const val ConstraintOverride_pivotAnchor = 99
        const val ConstraintOverride_polarRelativeTo = 100
        const val ConstraintOverride_quantizeMotionInterpolator = 101
        const val ConstraintOverride_quantizeMotionPhase = 102
        const val ConstraintOverride_quantizeMotionSteps = 103
        const val ConstraintOverride_transformPivotTarget = 104
        const val ConstraintOverride_transitionEasing = 105
        const val ConstraintOverride_transitionPathRotate = 106
        const val ConstraintOverride_visibilityMode = 107
        const val ConstraintSet_android_alpha = 15
        const val ConstraintSet_android_elevation = 28
        const val ConstraintSet_android_id = 1
        const val ConstraintSet_android_layout_height = 4
        const val ConstraintSet_android_layout_marginBottom = 8
        const val ConstraintSet_android_layout_marginEnd = 26
        const val ConstraintSet_android_layout_marginLeft = 5
        const val ConstraintSet_android_layout_marginRight = 7
        const val ConstraintSet_android_layout_marginStart = 25
        const val ConstraintSet_android_layout_marginTop = 6
        const val ConstraintSet_android_layout_width = 3
        const val ConstraintSet_android_maxHeight = 10
        const val ConstraintSet_android_maxWidth = 9
        const val ConstraintSet_android_minHeight = 12
        const val ConstraintSet_android_minWidth = 11
        const val ConstraintSet_android_orientation = 0
        const val ConstraintSet_android_pivotX = 13
        const val ConstraintSet_android_pivotY = 14
        const val ConstraintSet_android_rotation = 22
        const val ConstraintSet_android_rotationX = 23
        const val ConstraintSet_android_rotationY = 24
        const val ConstraintSet_android_scaleX = 20
        const val ConstraintSet_android_scaleY = 21
        const val ConstraintSet_android_transformPivotX = 16
        const val ConstraintSet_android_transformPivotY = 17
        const val ConstraintSet_android_translationX = 18
        const val ConstraintSet_android_translationY = 19
        const val ConstraintSet_android_translationZ = 27
        const val ConstraintSet_android_visibility = 2
        const val ConstraintSet_animateCircleAngleTo = 29
        const val ConstraintSet_animateRelativeTo = 30
        const val ConstraintSet_barrierAllowsGoneWidgets = 31
        const val ConstraintSet_barrierDirection = 32
        const val ConstraintSet_barrierMargin = 33
        const val ConstraintSet_chainUseRtl = 34
        const val ConstraintSet_constraintRotate = 35
        const val ConstraintSet_constraint_referenced_ids = 36
        const val ConstraintSet_constraint_referenced_tags = 37
        const val ConstraintSet_deriveConstraintsFrom = 38
        const val ConstraintSet_drawPath = 39
        const val ConstraintSet_flow_firstHorizontalBias = 40
        const val ConstraintSet_flow_firstHorizontalStyle = 41
        const val ConstraintSet_flow_firstVerticalBias = 42
        const val ConstraintSet_flow_firstVerticalStyle = 43
        const val ConstraintSet_flow_horizontalAlign = 44
        const val ConstraintSet_flow_horizontalBias = 45
        const val ConstraintSet_flow_horizontalGap = 46
        const val ConstraintSet_flow_horizontalStyle = 47
        const val ConstraintSet_flow_lastHorizontalBias = 48
        const val ConstraintSet_flow_lastHorizontalStyle = 49
        const val ConstraintSet_flow_lastVerticalBias = 50
        const val ConstraintSet_flow_lastVerticalStyle = 51
        const val ConstraintSet_flow_maxElementsWrap = 52
        const val ConstraintSet_flow_verticalAlign = 53
        const val ConstraintSet_flow_verticalBias = 54
        const val ConstraintSet_flow_verticalGap = 55
        const val ConstraintSet_flow_verticalStyle = 56
        const val ConstraintSet_flow_wrapMode = 57
        const val ConstraintSet_guidelineUseRtl = 58
        const val ConstraintSet_layout_constrainedHeight = 59
        const val ConstraintSet_layout_constrainedWidth = 60
        const val ConstraintSet_layout_constraintBaseline_creator = 61
        const val ConstraintSet_layout_constraintBaseline_toBaselineOf = 62
        const val ConstraintSet_layout_constraintBaseline_toBottomOf = 63
        const val ConstraintSet_layout_constraintBaseline_toTopOf = 64
        const val ConstraintSet_layout_constraintBottom_creator = 65
        const val ConstraintSet_layout_constraintBottom_toBottomOf = 66
        const val ConstraintSet_layout_constraintBottom_toTopOf = 67
        const val ConstraintSet_layout_constraintCircle = 68
        const val ConstraintSet_layout_constraintCircleAngle = 69
        const val ConstraintSet_layout_constraintCircleRadius = 70
        const val ConstraintSet_layout_constraintDimensionRatio = 71
        const val ConstraintSet_layout_constraintEnd_toEndOf = 72
        const val ConstraintSet_layout_constraintEnd_toStartOf = 73
        const val ConstraintSet_layout_constraintGuide_begin = 74
        const val ConstraintSet_layout_constraintGuide_end = 75
        const val ConstraintSet_layout_constraintGuide_percent = 76
        const val ConstraintSet_layout_constraintHeight_default = 77
        const val ConstraintSet_layout_constraintHeight_max = 78
        const val ConstraintSet_layout_constraintHeight_min = 79
        const val ConstraintSet_layout_constraintHeight_percent = 80
        const val ConstraintSet_layout_constraintHorizontal_bias = 81
        const val ConstraintSet_layout_constraintHorizontal_chainStyle = 82
        const val ConstraintSet_layout_constraintHorizontal_weight = 83
        const val ConstraintSet_layout_constraintLeft_creator = 84
        const val ConstraintSet_layout_constraintLeft_toLeftOf = 85
        const val ConstraintSet_layout_constraintLeft_toRightOf = 86
        const val ConstraintSet_layout_constraintRight_creator = 87
        const val ConstraintSet_layout_constraintRight_toLeftOf = 88
        const val ConstraintSet_layout_constraintRight_toRightOf = 89
        const val ConstraintSet_layout_constraintStart_toEndOf = 90
        const val ConstraintSet_layout_constraintStart_toStartOf = 91
        const val ConstraintSet_layout_constraintTag = 92
        const val ConstraintSet_layout_constraintTop_creator = 93
        const val ConstraintSet_layout_constraintTop_toBottomOf = 94
        const val ConstraintSet_layout_constraintTop_toTopOf = 95
        const val ConstraintSet_layout_constraintVertical_bias = 96
        const val ConstraintSet_layout_constraintVertical_chainStyle = 97
        const val ConstraintSet_layout_constraintVertical_weight = 98
        const val ConstraintSet_layout_constraintWidth_default = 99
        const val ConstraintSet_layout_constraintWidth_max = 100
        const val ConstraintSet_layout_constraintWidth_min = 101
        const val ConstraintSet_layout_constraintWidth_percent = 102
        const val ConstraintSet_layout_editor_absoluteX = 103
        const val ConstraintSet_layout_editor_absoluteY = 104
        const val ConstraintSet_layout_goneMarginBaseline = 105
        const val ConstraintSet_layout_goneMarginBottom = 106
        const val ConstraintSet_layout_goneMarginEnd = 107
        const val ConstraintSet_layout_goneMarginLeft = 108
        const val ConstraintSet_layout_goneMarginRight = 109
        const val ConstraintSet_layout_goneMarginStart = 110
        const val ConstraintSet_layout_goneMarginTop = 111
        const val ConstraintSet_layout_marginBaseline = 112
        const val ConstraintSet_layout_wrapBehaviorInParent = 113
        const val ConstraintSet_motionProgress = 114
        const val ConstraintSet_motionStagger = 115
        const val ConstraintSet_pathMotionArc = 116
        const val ConstraintSet_pivotAnchor = 117
        const val ConstraintSet_polarRelativeTo = 118
        const val ConstraintSet_quantizeMotionSteps = 119
        const val ConstraintSet_transitionEasing = 120
        const val ConstraintSet_transitionPathRotate = 121
        const val Constraint_android_alpha = 13
        const val Constraint_android_elevation = 26
        const val Constraint_android_id = 1
        const val Constraint_android_layout_height = 4
        const val Constraint_android_layout_marginBottom = 8
        const val Constraint_android_layout_marginEnd = 24
        const val Constraint_android_layout_marginLeft = 5
        const val Constraint_android_layout_marginRight = 7
        const val Constraint_android_layout_marginStart = 23
        const val Constraint_android_layout_marginTop = 6
        const val Constraint_android_layout_width = 3
        const val Constraint_android_maxHeight = 10
        const val Constraint_android_maxWidth = 9
        const val Constraint_android_minHeight = 12
        const val Constraint_android_minWidth = 11
        const val Constraint_android_orientation = 0
        const val Constraint_android_rotation = 20
        const val Constraint_android_rotationX = 21
        const val Constraint_android_rotationY = 22
        const val Constraint_android_scaleX = 18
        const val Constraint_android_scaleY = 19
        const val Constraint_android_transformPivotX = 14
        const val Constraint_android_transformPivotY = 15
        const val Constraint_android_translationX = 16
        const val Constraint_android_translationY = 17
        const val Constraint_android_translationZ = 25
        const val Constraint_android_visibility = 2
        const val Constraint_animateCircleAngleTo = 27
        const val Constraint_animateRelativeTo = 28
        const val Constraint_barrierAllowsGoneWidgets = 29
        const val Constraint_barrierDirection = 30
        const val Constraint_barrierMargin = 31
        const val Constraint_chainUseRtl = 32
        const val Constraint_constraint_referenced_ids = 33
        const val Constraint_constraint_referenced_tags = 34
        const val Constraint_drawPath = 35
        const val Constraint_flow_firstHorizontalBias = 36
        const val Constraint_flow_firstHorizontalStyle = 37
        const val Constraint_flow_firstVerticalBias = 38
        const val Constraint_flow_firstVerticalStyle = 39
        const val Constraint_flow_horizontalAlign = 40
        const val Constraint_flow_horizontalBias = 41
        const val Constraint_flow_horizontalGap = 42
        const val Constraint_flow_horizontalStyle = 43
        const val Constraint_flow_lastHorizontalBias = 44
        const val Constraint_flow_lastHorizontalStyle = 45
        const val Constraint_flow_lastVerticalBias = 46
        const val Constraint_flow_lastVerticalStyle = 47
        const val Constraint_flow_maxElementsWrap = 48
        const val Constraint_flow_verticalAlign = 49
        const val Constraint_flow_verticalBias = 50
        const val Constraint_flow_verticalGap = 51
        const val Constraint_flow_verticalStyle = 52
        const val Constraint_flow_wrapMode = 53
        const val Constraint_guidelineUseRtl = 54
        const val Constraint_layout_constrainedHeight = 55
        const val Constraint_layout_constrainedWidth = 56
        const val Constraint_layout_constraintBaseline_creator = 57
        const val Constraint_layout_constraintBaseline_toBaselineOf = 58
        const val Constraint_layout_constraintBaseline_toBottomOf = 59
        const val Constraint_layout_constraintBaseline_toTopOf = 60
        const val Constraint_layout_constraintBottom_creator = 61
        const val Constraint_layout_constraintBottom_toBottomOf = 62
        const val Constraint_layout_constraintBottom_toTopOf = 63
        const val Constraint_layout_constraintCircle = 64
        const val Constraint_layout_constraintCircleAngle = 65
        const val Constraint_layout_constraintCircleRadius = 66
        const val Constraint_layout_constraintDimensionRatio = 67
        const val Constraint_layout_constraintEnd_toEndOf = 68
        const val Constraint_layout_constraintEnd_toStartOf = 69
        const val Constraint_layout_constraintGuide_begin = 70
        const val Constraint_layout_constraintGuide_end = 71
        const val Constraint_layout_constraintGuide_percent = 72
        const val Constraint_layout_constraintHeight = 73
        const val Constraint_layout_constraintHeight_default = 74
        const val Constraint_layout_constraintHeight_max = 75
        const val Constraint_layout_constraintHeight_min = 76
        const val Constraint_layout_constraintHeight_percent = 77
        const val Constraint_layout_constraintHorizontal_bias = 78
        const val Constraint_layout_constraintHorizontal_chainStyle = 79
        const val Constraint_layout_constraintHorizontal_weight = 80
        const val Constraint_layout_constraintLeft_creator = 81
        const val Constraint_layout_constraintLeft_toLeftOf = 82
        const val Constraint_layout_constraintLeft_toRightOf = 83
        const val Constraint_layout_constraintRight_creator = 84
        const val Constraint_layout_constraintRight_toLeftOf = 85
        const val Constraint_layout_constraintRight_toRightOf = 86
        const val Constraint_layout_constraintStart_toEndOf = 87
        const val Constraint_layout_constraintStart_toStartOf = 88
        const val Constraint_layout_constraintTag = 89
        const val Constraint_layout_constraintTop_creator = 90
        const val Constraint_layout_constraintTop_toBottomOf = 91
        const val Constraint_layout_constraintTop_toTopOf = 92
        const val Constraint_layout_constraintVertical_bias = 93
        const val Constraint_layout_constraintVertical_chainStyle = 94
        const val Constraint_layout_constraintVertical_weight = 95
        const val Constraint_layout_constraintWidth = 96
        const val Constraint_layout_constraintWidth_default = 97
        const val Constraint_layout_constraintWidth_max = 98
        const val Constraint_layout_constraintWidth_min = 99
        const val Constraint_layout_constraintWidth_percent = 100
        const val Constraint_layout_editor_absoluteX = 101
        const val Constraint_layout_editor_absoluteY = 102
        const val Constraint_layout_goneMarginBaseline = 103
        const val Constraint_layout_goneMarginBottom = 104
        const val Constraint_layout_goneMarginEnd = 105
        const val Constraint_layout_goneMarginLeft = 106
        const val Constraint_layout_goneMarginRight = 107
        const val Constraint_layout_goneMarginStart = 108
        const val Constraint_layout_goneMarginTop = 109
        const val Constraint_layout_marginBaseline = 110
        const val Constraint_layout_wrapBehaviorInParent = 111
        const val Constraint_motionProgress = 112
        const val Constraint_motionStagger = 113
        const val Constraint_pathMotionArc = 114
        const val Constraint_pivotAnchor = 115
        const val Constraint_polarRelativeTo = 116
        const val Constraint_quantizeMotionInterpolator = 117
        const val Constraint_quantizeMotionPhase = 118
        const val Constraint_quantizeMotionSteps = 119
        const val Constraint_transformPivotTarget = 120
        const val Constraint_transitionEasing = 121
        const val Constraint_transitionPathRotate = 122
        const val Constraint_visibilityMode = 123
        const val CoordinatorLayout_Layout_android_layout_gravity = 0
        const val CoordinatorLayout_Layout_layout_anchor = 1
        const val CoordinatorLayout_Layout_layout_anchorGravity = 2
        const val CoordinatorLayout_Layout_layout_behavior = 3
        const val CoordinatorLayout_Layout_layout_dodgeInsetEdges = 4
        const val CoordinatorLayout_Layout_layout_insetEdge = 5
        const val CoordinatorLayout_Layout_layout_keyline = 6
        const val CoordinatorLayout_keylines = 0
        const val CoordinatorLayout_statusBarBackground = 1
        const val CustomAttribute_attributeName = 0
        const val CustomAttribute_customBoolean = 1
        const val CustomAttribute_customColorDrawableValue = 2
        const val CustomAttribute_customColorValue = 3
        const val CustomAttribute_customDimension = 4
        const val CustomAttribute_customFloatValue = 5
        const val CustomAttribute_customIntegerValue = 6
        const val CustomAttribute_customPixelDimension = 7
        const val CustomAttribute_customReference = 8
        const val CustomAttribute_customStringValue = 9
        const val CustomAttribute_methodName = 10
        const val CustomCastTheme_castExpandedControllerStyle = 0
        const val CustomCastTheme_castIntroOverlayStyle = 1
        const val CustomCastTheme_castMiniControllerStyle = 2
        const val CustomCast_customCastBackgroundColor = 0
        const val DefaultTimeBar_ad_marker_color = 0
        const val DefaultTimeBar_ad_marker_width = 1
        const val DefaultTimeBar_bar_gravity = 2
        const val DefaultTimeBar_bar_height = 3
        const val DefaultTimeBar_buffered_color = 4
        const val DefaultTimeBar_played_ad_marker_color = 5
        const val DefaultTimeBar_played_color = 6
        const val DefaultTimeBar_scrubber_color = 7
        const val DefaultTimeBar_scrubber_disabled_size = 8
        const val DefaultTimeBar_scrubber_dragged_size = 9
        const val DefaultTimeBar_scrubber_drawable = 10
        const val DefaultTimeBar_scrubber_enabled_size = 11
        const val DefaultTimeBar_touch_target_height = 12
        const val DefaultTimeBar_unplayed_color = 13
        const val DialogFragmentNavigator_android_name = 0
        const val DialogPreference_android_dialogIcon = 2
        const val DialogPreference_android_dialogLayout = 5
        const val DialogPreference_android_dialogMessage = 1
        const val DialogPreference_android_dialogTitle = 0
        const val DialogPreference_android_negativeButtonText = 4
        const val DialogPreference_android_positiveButtonText = 3
        const val DialogPreference_dialogIcon = 6
        const val DialogPreference_dialogLayout = 7
        const val DialogPreference_dialogMessage = 8
        const val DialogPreference_dialogTitle = 9
        const val DialogPreference_negativeButtonText = 10
        const val DialogPreference_positiveButtonText = 11
        const val DrawerArrowToggle_arrowHeadLength = 0
        const val DrawerArrowToggle_arrowShaftLength = 1
        const val DrawerArrowToggle_barLength = 2
        const val DrawerArrowToggle_color = 3
        const val DrawerArrowToggle_drawableSize = 4
        const val DrawerArrowToggle_gapBetweenBars = 5
        const val DrawerArrowToggle_spinBars = 6
        const val DrawerArrowToggle_thickness = 7
        const val DrawerLayout_elevation = 0
        const val EditTextPreference_useSimpleSummaryProvider = 0
        const val ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide = 0
        const val ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink = 1
        const val ExtendedFloatingActionButton_collapsedSize = 0
        const val ExtendedFloatingActionButton_elevation = 1
        const val ExtendedFloatingActionButton_extendMotionSpec = 2
        const val ExtendedFloatingActionButton_hideMotionSpec = 3
        const val ExtendedFloatingActionButton_showMotionSpec = 4
        const val ExtendedFloatingActionButton_shrinkMotionSpec = 5
        const val FloatingActionButton_Behavior_Layout_behavior_autoHide = 0
        const val FloatingActionButton_android_enabled = 0
        const val FloatingActionButton_backgroundTint = 1
        const val FloatingActionButton_backgroundTintMode = 2
        const val FloatingActionButton_borderWidth = 3
        const val FloatingActionButton_elevation = 4
        const val FloatingActionButton_ensureMinTouchTargetSize = 5
        const val FloatingActionButton_fabCustomSize = 6
        const val FloatingActionButton_fabSize = 7
        const val FloatingActionButton_hideMotionSpec = 8
        const val FloatingActionButton_hoveredFocusedTranslationZ = 9
        const val FloatingActionButton_maxImageSize = 10
        const val FloatingActionButton_pressedTranslationZ = 11
        const val FloatingActionButton_rippleColor = 12
        const val FloatingActionButton_shapeAppearance = 13
        const val FloatingActionButton_shapeAppearanceOverlay = 14
        const val FloatingActionButton_showMotionSpec = 15
        const val FloatingActionButton_useCompatPadding = 16
        const val FlowLayout_Layout_itemSpacing = 0
        const val FlowLayout_itemSpacing = 0
        const val FlowLayout_lineSpacing = 1
        const val FontFamilyFont_android_font = 0
        const val FontFamilyFont_android_fontStyle = 2
        const val FontFamilyFont_android_fontVariationSettings = 4
        const val FontFamilyFont_android_fontWeight = 1
        const val FontFamilyFont_android_ttcIndex = 3
        const val FontFamilyFont_font = 5
        const val FontFamilyFont_fontStyle = 6
        const val FontFamilyFont_fontVariationSettings = 7
        const val FontFamilyFont_fontWeight = 8
        const val FontFamilyFont_ttcIndex = 9
        const val FontFamily_fontProviderAuthority = 0
        const val FontFamily_fontProviderCerts = 1
        const val FontFamily_fontProviderFetchStrategy = 2
        const val FontFamily_fontProviderFetchTimeout = 3
        const val FontFamily_fontProviderPackage = 4
        const val FontFamily_fontProviderQuery = 5
        const val FontFamily_fontProviderSystemFontFamily = 6
        const val ForegroundLinearLayout_android_foreground = 0
        const val ForegroundLinearLayout_android_foregroundGravity = 1
        const val ForegroundLinearLayout_foregroundInsidePadding = 2
        const val FragmentContainerView_android_name = 0
        const val FragmentContainerView_android_tag = 1
        const val FragmentNavigator_android_name = 0
        const val Fragment_android_id = 1
        const val Fragment_android_name = 0
        const val Fragment_android_tag = 2
        const val GradientColorItem_android_color = 0
        const val GradientColorItem_android_offset = 1
        const val GradientColor_android_centerColor = 7
        const val GradientColor_android_centerX = 3
        const val GradientColor_android_centerY = 4
        const val GradientColor_android_endColor = 1
        const val GradientColor_android_endX = 10
        const val GradientColor_android_endY = 11
        const val GradientColor_android_gradientRadius = 5
        const val GradientColor_android_startColor = 0
        const val GradientColor_android_startX = 8
        const val GradientColor_android_startY = 9
        const val GradientColor_android_tileMode = 6
        const val GradientColor_android_type = 2
        const val ImageFilterView_altSrc = 0
        const val ImageFilterView_blendSrc = 1
        const val ImageFilterView_brightness = 2
        const val ImageFilterView_contrast = 3
        const val ImageFilterView_crossfade = 4
        const val ImageFilterView_imagePanX = 5
        const val ImageFilterView_imagePanY = 6
        const val ImageFilterView_imageRotate = 7
        const val ImageFilterView_imageZoom = 8
        const val ImageFilterView_overlay = 9
        const val ImageFilterView_round = 10
        const val ImageFilterView_roundPercent = 11
        const val ImageFilterView_saturation = 12
        const val ImageFilterView_warmth = 13
        const val Insets_paddingBottomSystemWindowInsets = 0
        const val Insets_paddingLeftSystemWindowInsets = 1
        const val Insets_paddingRightSystemWindowInsets = 2
        const val Insets_paddingTopSystemWindowInsets = 3
        const val KeyAttribute_android_alpha = 0
        const val KeyAttribute_android_elevation = 11
        const val KeyAttribute_android_rotation = 7
        const val KeyAttribute_android_rotationX = 8
        const val KeyAttribute_android_rotationY = 9
        const val KeyAttribute_android_scaleX = 5
        const val KeyAttribute_android_scaleY = 6
        const val KeyAttribute_android_transformPivotX = 1
        const val KeyAttribute_android_transformPivotY = 2
        const val KeyAttribute_android_translationX = 3
        const val KeyAttribute_android_translationY = 4
        const val KeyAttribute_android_translationZ = 10
        const val KeyAttribute_curveFit = 12
        const val KeyAttribute_framePosition = 13
        const val KeyAttribute_motionProgress = 14
        const val KeyAttribute_motionTarget = 15
        const val KeyAttribute_transformPivotTarget = 16
        const val KeyAttribute_transitionEasing = 17
        const val KeyAttribute_transitionPathRotate = 18
        const val KeyCycle_android_alpha = 0
        const val KeyCycle_android_elevation = 9
        const val KeyCycle_android_rotation = 5
        const val KeyCycle_android_rotationX = 6
        const val KeyCycle_android_rotationY = 7
        const val KeyCycle_android_scaleX = 3
        const val KeyCycle_android_scaleY = 4
        const val KeyCycle_android_translationX = 1
        const val KeyCycle_android_translationY = 2
        const val KeyCycle_android_translationZ = 8
        const val KeyCycle_curveFit = 10
        const val KeyCycle_framePosition = 11
        const val KeyCycle_motionProgress = 12
        const val KeyCycle_motionTarget = 13
        const val KeyCycle_transitionEasing = 14
        const val KeyCycle_transitionPathRotate = 15
        const val KeyCycle_waveOffset = 16
        const val KeyCycle_wavePeriod = 17
        const val KeyCycle_wavePhase = 18
        const val KeyCycle_waveShape = 19
        const val KeyCycle_waveVariesBy = 20
        const val KeyPosition_curveFit = 0
        const val KeyPosition_drawPath = 1
        const val KeyPosition_framePosition = 2
        const val KeyPosition_keyPositionType = 3
        const val KeyPosition_motionTarget = 4
        const val KeyPosition_pathMotionArc = 5
        const val KeyPosition_percentHeight = 6
        const val KeyPosition_percentWidth = 7
        const val KeyPosition_percentX = 8
        const val KeyPosition_percentY = 9
        const val KeyPosition_sizePercent = 10
        const val KeyPosition_transitionEasing = 11
        const val KeyTimeCycle_android_alpha = 0
        const val KeyTimeCycle_android_elevation = 9
        const val KeyTimeCycle_android_rotation = 5
        const val KeyTimeCycle_android_rotationX = 6
        const val KeyTimeCycle_android_rotationY = 7
        const val KeyTimeCycle_android_scaleX = 3
        const val KeyTimeCycle_android_scaleY = 4
        const val KeyTimeCycle_android_translationX = 1
        const val KeyTimeCycle_android_translationY = 2
        const val KeyTimeCycle_android_translationZ = 8
        const val KeyTimeCycle_curveFit = 10
        const val KeyTimeCycle_framePosition = 11
        const val KeyTimeCycle_motionProgress = 12
        const val KeyTimeCycle_motionTarget = 13
        const val KeyTimeCycle_transitionEasing = 14
        const val KeyTimeCycle_transitionPathRotate = 15
        const val KeyTimeCycle_waveDecay = 16
        const val KeyTimeCycle_waveOffset = 17
        const val KeyTimeCycle_wavePeriod = 18
        const val KeyTimeCycle_wavePhase = 19
        const val KeyTimeCycle_waveShape = 20
        const val KeyTrigger_framePosition = 0
        const val KeyTrigger_motionTarget = 1
        const val KeyTrigger_motion_postLayoutCollision = 2
        const val KeyTrigger_motion_triggerOnCollision = 3
        const val KeyTrigger_onCross = 4
        const val KeyTrigger_onNegativeCross = 5
        const val KeyTrigger_onPositiveCross = 6
        const val KeyTrigger_triggerId = 7
        const val KeyTrigger_triggerReceiver = 8
        const val KeyTrigger_triggerSlack = 9
        const val KeyTrigger_viewTransitionOnCross = 10
        const val KeyTrigger_viewTransitionOnNegativeCross = 11
        const val KeyTrigger_viewTransitionOnPositiveCross = 12
        const val Layout_android_layout_height = 2
        const val Layout_android_layout_marginBottom = 6
        const val Layout_android_layout_marginEnd = 8
        const val Layout_android_layout_marginLeft = 3
        const val Layout_android_layout_marginRight = 5
        const val Layout_android_layout_marginStart = 7
        const val Layout_android_layout_marginTop = 4
        const val Layout_android_layout_width = 1
        const val Layout_android_orientation = 0
        const val Layout_barrierAllowsGoneWidgets = 9
        const val Layout_barrierDirection = 10
        const val Layout_barrierMargin = 11
        const val Layout_chainUseRtl = 12
        const val Layout_constraint_referenced_ids = 13
        const val Layout_constraint_referenced_tags = 14
        const val Layout_guidelineUseRtl = 15
        const val Layout_layout_constrainedHeight = 16
        const val Layout_layout_constrainedWidth = 17
        const val Layout_layout_constraintBaseline_creator = 18
        const val Layout_layout_constraintBaseline_toBaselineOf = 19
        const val Layout_layout_constraintBaseline_toBottomOf = 20
        const val Layout_layout_constraintBaseline_toTopOf = 21
        const val Layout_layout_constraintBottom_creator = 22
        const val Layout_layout_constraintBottom_toBottomOf = 23
        const val Layout_layout_constraintBottom_toTopOf = 24
        const val Layout_layout_constraintCircle = 25
        const val Layout_layout_constraintCircleAngle = 26
        const val Layout_layout_constraintCircleRadius = 27
        const val Layout_layout_constraintDimensionRatio = 28
        const val Layout_layout_constraintEnd_toEndOf = 29
        const val Layout_layout_constraintEnd_toStartOf = 30
        const val Layout_layout_constraintGuide_begin = 31
        const val Layout_layout_constraintGuide_end = 32
        const val Layout_layout_constraintGuide_percent = 33
        const val Layout_layout_constraintHeight = 34
        const val Layout_layout_constraintHeight_default = 35
        const val Layout_layout_constraintHeight_max = 36
        const val Layout_layout_constraintHeight_min = 37
        const val Layout_layout_constraintHeight_percent = 38
        const val Layout_layout_constraintHorizontal_bias = 39
        const val Layout_layout_constraintHorizontal_chainStyle = 40
        const val Layout_layout_constraintHorizontal_weight = 41
        const val Layout_layout_constraintLeft_creator = 42
        const val Layout_layout_constraintLeft_toLeftOf = 43
        const val Layout_layout_constraintLeft_toRightOf = 44
        const val Layout_layout_constraintRight_creator = 45
        const val Layout_layout_constraintRight_toLeftOf = 46
        const val Layout_layout_constraintRight_toRightOf = 47
        const val Layout_layout_constraintStart_toEndOf = 48
        const val Layout_layout_constraintStart_toStartOf = 49
        const val Layout_layout_constraintTop_creator = 50
        const val Layout_layout_constraintTop_toBottomOf = 51
        const val Layout_layout_constraintTop_toTopOf = 52
        const val Layout_layout_constraintVertical_bias = 53
        const val Layout_layout_constraintVertical_chainStyle = 54
        const val Layout_layout_constraintVertical_weight = 55
        const val Layout_layout_constraintWidth = 56
        const val Layout_layout_constraintWidth_default = 57
        const val Layout_layout_constraintWidth_max = 58
        const val Layout_layout_constraintWidth_min = 59
        const val Layout_layout_constraintWidth_percent = 60
        const val Layout_layout_editor_absoluteX = 61
        const val Layout_layout_editor_absoluteY = 62
        const val Layout_layout_goneMarginBaseline = 63
        const val Layout_layout_goneMarginBottom = 64
        const val Layout_layout_goneMarginEnd = 65
        const val Layout_layout_goneMarginLeft = 66
        const val Layout_layout_goneMarginRight = 67
        const val Layout_layout_goneMarginStart = 68
        const val Layout_layout_goneMarginTop = 69
        const val Layout_layout_marginBaseline = 70
        const val Layout_layout_wrapBehaviorInParent = 71
        const val Layout_maxHeight = 72
        const val Layout_maxWidth = 73
        const val Layout_minHeight = 74
        const val Layout_minWidth = 75
        const val LinearLayoutCompat_Layout_android_layout_gravity = 0
        const val LinearLayoutCompat_Layout_android_layout_height = 2
        const val LinearLayoutCompat_Layout_android_layout_weight = 3
        const val LinearLayoutCompat_Layout_android_layout_width = 1
        const val LinearLayoutCompat_android_baselineAligned = 2
        const val LinearLayoutCompat_android_baselineAlignedChildIndex = 3
        const val LinearLayoutCompat_android_gravity = 0
        const val LinearLayoutCompat_android_orientation = 1
        const val LinearLayoutCompat_android_weightSum = 4
        const val LinearLayoutCompat_divider = 5
        const val LinearLayoutCompat_dividerPadding = 6
        const val LinearLayoutCompat_measureWithLargestChild = 7
        const val LinearLayoutCompat_showDividers = 8
        const val LinearProgressIndicator_indeterminateAnimationType = 0
        const val LinearProgressIndicator_indicatorDirectionLinear = 1
        const val ListPopupWindow_android_dropDownHorizontalOffset = 0
        const val ListPopupWindow_android_dropDownVerticalOffset = 1
        const val ListPreference_android_entries = 0
        const val ListPreference_android_entryValues = 1
        const val ListPreference_entries = 2
        const val ListPreference_entryValues = 3
        const val ListPreference_useSimpleSummaryProvider = 4
        const val LoadingImageView_circleCrop = 0
        const val LoadingImageView_imageAspectRatio = 1
        const val LoadingImageView_imageAspectRatioAdjust = 2
        const val LottieAnimationView_lottie_autoPlay = 0
        const val LottieAnimationView_lottie_cacheComposition = 1
        const val LottieAnimationView_lottie_colorFilter = 2
        const val LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove = 3
        const val LottieAnimationView_lottie_fallbackRes = 4
        const val LottieAnimationView_lottie_fileName = 5
        const val LottieAnimationView_lottie_imageAssetsFolder = 6
        const val LottieAnimationView_lottie_loop = 7
        const val LottieAnimationView_lottie_progress = 8
        const val LottieAnimationView_lottie_rawRes = 9
        const val LottieAnimationView_lottie_renderMode = 10
        const val LottieAnimationView_lottie_repeatCount = 11
        const val LottieAnimationView_lottie_repeatMode = 12
        const val LottieAnimationView_lottie_scale = 13
        const val LottieAnimationView_lottie_speed = 14
        const val LottieAnimationView_lottie_url = 15
        const val MainColors_boxItemBackground = 0
        const val MainColors_colorOngoing = 1
        const val MainColors_colorPrimary = 2
        const val MainColors_colorPrimaryDark = 3
        const val MainColors_colorSearch = 4
        const val MainColors_grayTextColor = 5
        const val MainColors_iconColor = 6
        const val MainColors_iconGrayBackground = 7
        const val MainColors_primaryBlackBackground = 8
        const val MainColors_primaryGrayBackground = 9
        const val MainColors_textColor = 10
        const val MainColors_white = 11
        const val MaterialAlertDialogTheme_materialAlertDialogBodyTextStyle = 0

        /* renamed from: MaterialAlertDialogTheme_materialAlertDialogButtonSpacerVisibility */
        const val f9951x374ba37a = 1
        const val MaterialAlertDialogTheme_materialAlertDialogTheme = 2
        const val MaterialAlertDialogTheme_materialAlertDialogTitleIconStyle = 3
        const val MaterialAlertDialogTheme_materialAlertDialogTitlePanelStyle = 4
        const val MaterialAlertDialogTheme_materialAlertDialogTitleTextStyle = 5
        const val MaterialAlertDialog_backgroundInsetBottom = 0
        const val MaterialAlertDialog_backgroundInsetEnd = 1
        const val MaterialAlertDialog_backgroundInsetStart = 2
        const val MaterialAlertDialog_backgroundInsetTop = 3
        const val MaterialAutoCompleteTextView_android_inputType = 0
        const val MaterialButtonToggleGroup_checkedButton = 0
        const val MaterialButtonToggleGroup_selectionRequired = 1
        const val MaterialButtonToggleGroup_singleSelection = 2
        const val MaterialButton_android_background = 0
        const val MaterialButton_android_checkable = 5
        const val MaterialButton_android_insetBottom = 4
        const val MaterialButton_android_insetLeft = 1
        const val MaterialButton_android_insetRight = 2
        const val MaterialButton_android_insetTop = 3
        const val MaterialButton_backgroundTint = 6
        const val MaterialButton_backgroundTintMode = 7
        const val MaterialButton_cornerRadius = 8
        const val MaterialButton_elevation = 9
        const val MaterialButton_icon = 10
        const val MaterialButton_iconGravity = 11
        const val MaterialButton_iconPadding = 12
        const val MaterialButton_iconSize = 13
        const val MaterialButton_iconTint = 14
        const val MaterialButton_iconTintMode = 15
        const val MaterialButton_rippleColor = 16
        const val MaterialButton_shapeAppearance = 17
        const val MaterialButton_shapeAppearanceOverlay = 18
        const val MaterialButton_strokeColor = 19
        const val MaterialButton_strokeWidth = 20
        const val MaterialCalendarItem_android_insetBottom = 3
        const val MaterialCalendarItem_android_insetLeft = 0
        const val MaterialCalendarItem_android_insetRight = 1
        const val MaterialCalendarItem_android_insetTop = 2
        const val MaterialCalendarItem_itemFillColor = 4
        const val MaterialCalendarItem_itemShapeAppearance = 5
        const val MaterialCalendarItem_itemShapeAppearanceOverlay = 6
        const val MaterialCalendarItem_itemStrokeColor = 7
        const val MaterialCalendarItem_itemStrokeWidth = 8
        const val MaterialCalendarItem_itemTextColor = 9
        const val MaterialCalendar_android_windowFullscreen = 0
        const val MaterialCalendar_dayInvalidStyle = 1
        const val MaterialCalendar_daySelectedStyle = 2
        const val MaterialCalendar_dayStyle = 3
        const val MaterialCalendar_dayTodayStyle = 4
        const val MaterialCalendar_nestedScrollable = 5
        const val MaterialCalendar_rangeFillColor = 6
        const val MaterialCalendar_yearSelectedStyle = 7
        const val MaterialCalendar_yearStyle = 8
        const val MaterialCalendar_yearTodayStyle = 9
        const val MaterialCardView_android_checkable = 0
        const val MaterialCardView_cardForegroundColor = 1
        const val MaterialCardView_checkedIcon = 2
        const val MaterialCardView_checkedIconMargin = 3
        const val MaterialCardView_checkedIconSize = 4
        const val MaterialCardView_checkedIconTint = 5
        const val MaterialCardView_rippleColor = 6
        const val MaterialCardView_shapeAppearance = 7
        const val MaterialCardView_shapeAppearanceOverlay = 8
        const val MaterialCardView_state_dragged = 9
        const val MaterialCardView_strokeColor = 10
        const val MaterialCardView_strokeWidth = 11
        const val MaterialCheckBox_buttonTint = 0
        const val MaterialCheckBox_useMaterialThemeColors = 1
        const val MaterialDivider_dividerColor = 0
        const val MaterialDivider_dividerInsetEnd = 1
        const val MaterialDivider_dividerInsetStart = 2
        const val MaterialDivider_dividerThickness = 3
        const val MaterialRadioButton_buttonTint = 0
        const val MaterialRadioButton_useMaterialThemeColors = 1
        const val MaterialShape_shapeAppearance = 0
        const val MaterialShape_shapeAppearanceOverlay = 1
        const val MaterialTextAppearance_android_letterSpacing = 0
        const val MaterialTextAppearance_android_lineHeight = 1
        const val MaterialTextAppearance_lineHeight = 2
        const val MaterialTextView_android_lineHeight = 1
        const val MaterialTextView_android_textAppearance = 0
        const val MaterialTextView_lineHeight = 2
        const val MaterialTimePicker_clockIcon = 0
        const val MaterialTimePicker_keyboardIcon = 1
        const val MaterialToolbar_navigationIconTint = 0
        const val MaterialToolbar_subtitleCentered = 1
        const val MaterialToolbar_titleCentered = 2
        const val MediaRouteButton_android_minHeight = 1
        const val MediaRouteButton_android_minWidth = 0
        const val MediaRouteButton_externalRouteEnabledDrawable = 2
        const val MediaRouteButton_externalRouteEnabledDrawableStatic = 3
        const val MediaRouteButton_mediaRouteButtonTint = 4
        const val MenuGroup_android_checkableBehavior = 5
        const val MenuGroup_android_enabled = 0
        const val MenuGroup_android_id = 1
        const val MenuGroup_android_menuCategory = 3
        const val MenuGroup_android_orderInCategory = 4
        const val MenuGroup_android_visible = 2
        const val MenuItem_actionLayout = 13
        const val MenuItem_actionProviderClass = 14
        const val MenuItem_actionViewClass = 15
        const val MenuItem_alphabeticModifiers = 16
        const val MenuItem_android_alphabeticShortcut = 9
        const val MenuItem_android_checkable = 11
        const val MenuItem_android_checked = 3
        const val MenuItem_android_enabled = 1
        const val MenuItem_android_icon = 0
        const val MenuItem_android_id = 2
        const val MenuItem_android_menuCategory = 5
        const val MenuItem_android_numericShortcut = 10
        const val MenuItem_android_onClick = 12
        const val MenuItem_android_orderInCategory = 6
        const val MenuItem_android_title = 7
        const val MenuItem_android_titleCondensed = 8
        const val MenuItem_android_visible = 4
        const val MenuItem_contentDescription = 17
        const val MenuItem_iconTint = 18
        const val MenuItem_iconTintMode = 19
        const val MenuItem_numericModifiers = 20
        const val MenuItem_showAsAction = 21
        const val MenuItem_tooltipText = 22
        const val MenuView_android_headerBackground = 4
        const val MenuView_android_horizontalDivider = 2
        const val MenuView_android_itemBackground = 5
        const val MenuView_android_itemIconDisabledAlpha = 6
        const val MenuView_android_itemTextAppearance = 1
        const val MenuView_android_verticalDivider = 3
        const val MenuView_android_windowAnimationStyle = 0
        const val MenuView_preserveIconSpacing = 7
        const val MenuView_subMenuArrow = 8
        const val MockView_mock_diagonalsColor = 0
        const val MockView_mock_label = 1
        const val MockView_mock_labelBackgroundColor = 2
        const val MockView_mock_labelColor = 3
        const val MockView_mock_showDiagonals = 4
        const val MockView_mock_showLabel = 5
        const val MotionEffect_motionEffect_alpha = 0
        const val MotionEffect_motionEffect_end = 1
        const val MotionEffect_motionEffect_move = 2
        const val MotionEffect_motionEffect_start = 3
        const val MotionEffect_motionEffect_strict = 4
        const val MotionEffect_motionEffect_translationX = 5
        const val MotionEffect_motionEffect_translationY = 6
        const val MotionEffect_motionEffect_viewTransition = 7
        const val MotionHelper_onHide = 0
        const val MotionHelper_onShow = 1
        const val MotionLabel_android_autoSizeTextType = 8
        const val MotionLabel_android_fontFamily = 7
        const val MotionLabel_android_gravity = 4
        const val MotionLabel_android_shadowRadius = 6
        const val MotionLabel_android_text = 5
        const val MotionLabel_android_textColor = 3
        const val MotionLabel_android_textSize = 0
        const val MotionLabel_android_textStyle = 2
        const val MotionLabel_android_typeface = 1
        const val MotionLabel_borderRound = 9
        const val MotionLabel_borderRoundPercent = 10
        const val MotionLabel_scaleFromTextSize = 11
        const val MotionLabel_textBackground = 12
        const val MotionLabel_textBackgroundPanX = 13
        const val MotionLabel_textBackgroundPanY = 14
        const val MotionLabel_textBackgroundRotate = 15
        const val MotionLabel_textBackgroundZoom = 16
        const val MotionLabel_textOutlineColor = 17
        const val MotionLabel_textOutlineThickness = 18
        const val MotionLabel_textPanX = 19
        const val MotionLabel_textPanY = 20
        const val MotionLabel_textureBlurFactor = 21
        const val MotionLabel_textureEffect = 22
        const val MotionLabel_textureHeight = 23
        const val MotionLabel_textureWidth = 24
        const val MotionLayout_applyMotionScene = 0
        const val MotionLayout_currentState = 1
        const val MotionLayout_layoutDescription = 2
        const val MotionLayout_motionDebug = 3
        const val MotionLayout_motionProgress = 4
        const val MotionLayout_showPaths = 5
        const val MotionScene_defaultDuration = 0
        const val MotionScene_layoutDuringTransition = 1
        const val MotionTelltales_telltales_tailColor = 0
        const val MotionTelltales_telltales_tailScale = 1
        const val MotionTelltales_telltales_velocityMode = 2
        const val Motion_animateCircleAngleTo = 0
        const val Motion_animateRelativeTo = 1
        const val Motion_drawPath = 2
        const val Motion_motionPathRotate = 3
        const val Motion_motionStagger = 4
        const val Motion_pathMotionArc = 5
        const val Motion_quantizeMotionInterpolator = 6
        const val Motion_quantizeMotionPhase = 7
        const val Motion_quantizeMotionSteps = 8
        const val Motion_transitionEasing = 9
        const val MultiSelectListPreference_android_entries = 0
        const val MultiSelectListPreference_android_entryValues = 1
        const val MultiSelectListPreference_entries = 2
        const val MultiSelectListPreference_entryValues = 3
        const val NavAction_android_id = 0
        const val NavAction_destination = 1
        const val NavAction_enterAnim = 2
        const val NavAction_exitAnim = 3
        const val NavAction_launchSingleTop = 4
        const val NavAction_popEnterAnim = 5
        const val NavAction_popExitAnim = 6
        const val NavAction_popUpTo = 7
        const val NavAction_popUpToInclusive = 8
        const val NavAction_popUpToSaveState = 9
        const val NavAction_restoreState = 10
        const val NavArgument_android_defaultValue = 1
        const val NavArgument_android_name = 0
        const val NavArgument_argType = 2
        const val NavArgument_nullable = 3
        const val NavDeepLink_action = 1
        const val NavDeepLink_android_autoVerify = 0
        const val NavDeepLink_mimeType = 2
        const val NavDeepLink_uri = 3
        const val NavGraphNavigator_startDestination = 0
        const val NavHostFragment_defaultNavHost = 0
        const val NavHost_navGraph = 0
        const val NavInclude_graph = 0
        const val NavigationBarActiveIndicator_android_color = 2
        const val NavigationBarActiveIndicator_android_height = 0
        const val NavigationBarActiveIndicator_android_width = 1
        const val NavigationBarActiveIndicator_marginHorizontal = 3
        const val NavigationBarActiveIndicator_shapeAppearance = 4
        const val NavigationBarView_backgroundTint = 0
        const val NavigationBarView_elevation = 1
        const val NavigationBarView_itemActiveIndicatorStyle = 2
        const val NavigationBarView_itemBackground = 3
        const val NavigationBarView_itemIconSize = 4
        const val NavigationBarView_itemIconTint = 5
        const val NavigationBarView_itemPaddingBottom = 6
        const val NavigationBarView_itemPaddingTop = 7
        const val NavigationBarView_itemRippleColor = 8
        const val NavigationBarView_itemTextAppearanceActive = 9
        const val NavigationBarView_itemTextAppearanceInactive = 10
        const val NavigationBarView_itemTextColor = 11
        const val NavigationBarView_labelVisibilityMode = 12
        const val NavigationBarView_menu = 13
        const val NavigationRailView_headerLayout = 0
        const val NavigationRailView_itemMinHeight = 1
        const val NavigationRailView_menuGravity = 2
        const val NavigationView_android_background = 1
        const val NavigationView_android_fitsSystemWindows = 2
        const val NavigationView_android_layout_gravity = 0
        const val NavigationView_android_maxWidth = 3
        const val NavigationView_bottomInsetScrimEnabled = 4
        const val NavigationView_dividerInsetEnd = 5
        const val NavigationView_dividerInsetStart = 6
        const val NavigationView_drawerLayoutCornerSize = 7
        const val NavigationView_elevation = 8
        const val NavigationView_headerLayout = 9
        const val NavigationView_itemBackground = 10
        const val NavigationView_itemHorizontalPadding = 11
        const val NavigationView_itemIconPadding = 12
        const val NavigationView_itemIconSize = 13
        const val NavigationView_itemIconTint = 14
        const val NavigationView_itemMaxLines = 15
        const val NavigationView_itemShapeAppearance = 16
        const val NavigationView_itemShapeAppearanceOverlay = 17
        const val NavigationView_itemShapeFillColor = 18
        const val NavigationView_itemShapeInsetBottom = 19
        const val NavigationView_itemShapeInsetEnd = 20
        const val NavigationView_itemShapeInsetStart = 21
        const val NavigationView_itemShapeInsetTop = 22
        const val NavigationView_itemTextAppearance = 23
        const val NavigationView_itemTextColor = 24
        const val NavigationView_itemVerticalPadding = 25
        const val NavigationView_menu = 26
        const val NavigationView_shapeAppearance = 27
        const val NavigationView_shapeAppearanceOverlay = 28
        const val NavigationView_subheaderColor = 29
        const val NavigationView_subheaderInsetEnd = 30
        const val NavigationView_subheaderInsetStart = 31
        const val NavigationView_subheaderTextAppearance = 32
        const val NavigationView_topInsetScrimEnabled = 33
        const val Navigator_android_id = 1
        const val Navigator_android_label = 0
        const val Navigator_route = 2
        const val OnClick_clickAction = 0
        const val OnClick_targetId = 1
        const val OnSwipe_autoCompleteMode = 0
        const val OnSwipe_dragDirection = 1
        const val OnSwipe_dragScale = 2
        const val OnSwipe_dragThreshold = 3
        const val OnSwipe_limitBoundsTo = 4
        const val OnSwipe_maxAcceleration = 5
        const val OnSwipe_maxVelocity = 6
        const val OnSwipe_moveWhenScrollAtTop = 7
        const val OnSwipe_nestedScrollFlags = 8
        const val OnSwipe_onTouchUp = 9
        const val OnSwipe_rotationCenterId = 10
        const val OnSwipe_springBoundary = 11
        const val OnSwipe_springDamping = 12
        const val OnSwipe_springMass = 13
        const val OnSwipe_springStiffness = 14
        const val OnSwipe_springStopThreshold = 15
        const val OnSwipe_touchAnchorId = 16
        const val OnSwipe_touchAnchorSide = 17
        const val OnSwipe_touchRegionId = 18
        const val OverlappingPanelsLayout_maxSidePanelNonFullScreenWidth = 0
        const val PlayerControlView_ad_marker_color = 0
        const val PlayerControlView_ad_marker_width = 1
        const val PlayerControlView_bar_gravity = 2
        const val PlayerControlView_bar_height = 3
        const val PlayerControlView_buffered_color = 4
        const val PlayerControlView_controller_layout_id = 5
        const val PlayerControlView_played_ad_marker_color = 6
        const val PlayerControlView_played_color = 7
        const val PlayerControlView_repeat_toggle_modes = 8
        const val PlayerControlView_scrubber_color = 9
        const val PlayerControlView_scrubber_disabled_size = 10
        const val PlayerControlView_scrubber_dragged_size = 11
        const val PlayerControlView_scrubber_drawable = 12
        const val PlayerControlView_scrubber_enabled_size = 13
        const val PlayerControlView_show_fastforward_button = 14
        const val PlayerControlView_show_next_button = 15
        const val PlayerControlView_show_previous_button = 16
        const val PlayerControlView_show_rewind_button = 17
        const val PlayerControlView_show_shuffle_button = 18
        const val PlayerControlView_show_timeout = 19
        const val PlayerControlView_time_bar_min_update_interval = 20
        const val PlayerControlView_touch_target_height = 21
        const val PlayerControlView_unplayed_color = 22
        const val PlayerView_ad_marker_color = 0
        const val PlayerView_ad_marker_width = 1
        const val PlayerView_auto_show = 2
        const val PlayerView_bar_height = 3
        const val PlayerView_buffered_color = 4
        const val PlayerView_controller_layout_id = 5
        const val PlayerView_default_artwork = 6
        const val PlayerView_hide_during_ads = 7
        const val PlayerView_hide_on_touch = 8
        const val PlayerView_keep_content_on_player_reset = 9
        const val PlayerView_played_ad_marker_color = 10
        const val PlayerView_played_color = 11
        const val PlayerView_player_layout_id = 12
        const val PlayerView_repeat_toggle_modes = 13
        const val PlayerView_resize_mode = 14
        const val PlayerView_scrubber_color = 15
        const val PlayerView_scrubber_disabled_size = 16
        const val PlayerView_scrubber_dragged_size = 17
        const val PlayerView_scrubber_drawable = 18
        const val PlayerView_scrubber_enabled_size = 19
        const val PlayerView_show_buffering = 20
        const val PlayerView_show_shuffle_button = 21
        const val PlayerView_show_timeout = 22
        const val PlayerView_shutter_background_color = 23
        const val PlayerView_surface_type = 24
        const val PlayerView_time_bar_min_update_interval = 25
        const val PlayerView_touch_target_height = 26
        const val PlayerView_unplayed_color = 27
        const val PlayerView_use_artwork = 28
        const val PlayerView_use_controller = 29
        const val PopupWindowBackgroundState_state_above_anchor = 0
        const val PopupWindow_android_popupAnimationStyle = 1
        const val PopupWindow_android_popupBackground = 0
        const val PopupWindow_overlapAnchor = 2
        const val PreferenceFragmentCompat_allowDividerAfterLastItem = 3
        const val PreferenceFragmentCompat_android_divider = 1
        const val PreferenceFragmentCompat_android_dividerHeight = 2
        const val PreferenceFragmentCompat_android_layout = 0
        const val PreferenceFragment_allowDividerAfterLastItem = 3
        const val PreferenceFragment_android_divider = 1
        const val PreferenceFragment_android_dividerHeight = 2
        const val PreferenceFragment_android_layout = 0
        const val PreferenceGroup_android_orderingFromXml = 0
        const val PreferenceGroup_initialExpandedChildrenCount = 1
        const val PreferenceGroup_orderingFromXml = 2
        const val PreferenceImageView_android_maxHeight = 1
        const val PreferenceImageView_android_maxWidth = 0
        const val PreferenceImageView_maxHeight = 2
        const val PreferenceImageView_maxWidth = 3
        const val PreferenceTheme_checkBoxPreferenceStyle = 0
        const val PreferenceTheme_dialogPreferenceStyle = 1
        const val PreferenceTheme_dropdownPreferenceStyle = 2
        const val PreferenceTheme_editTextPreferenceStyle = 3
        const val PreferenceTheme_preferenceCategoryStyle = 4
        const val PreferenceTheme_preferenceCategoryTitleTextAppearance = 5
        const val PreferenceTheme_preferenceFragmentCompatStyle = 6
        const val PreferenceTheme_preferenceFragmentListStyle = 7
        const val PreferenceTheme_preferenceFragmentStyle = 8
        const val PreferenceTheme_preferenceInformationStyle = 9
        const val PreferenceTheme_preferenceScreenStyle = 10
        const val PreferenceTheme_preferenceStyle = 11
        const val PreferenceTheme_preferenceTheme = 12
        const val PreferenceTheme_seekBarPreferenceStyle = 13
        const val PreferenceTheme_switchPreferenceCompatStyle = 14
        const val PreferenceTheme_switchPreferenceStyle = 15
        const val Preference_allowDividerAbove = 16
        const val Preference_allowDividerBelow = 17
        const val Preference_android_defaultValue = 11
        const val Preference_android_dependency = 10
        const val Preference_android_enabled = 2
        const val Preference_android_fragment = 13
        const val Preference_android_icon = 0
        const val Preference_android_iconSpaceReserved = 15
        const val Preference_android_key = 6
        const val Preference_android_layout = 3
        const val Preference_android_order = 8
        const val Preference_android_persistent = 1
        const val Preference_android_selectable = 5
        const val Preference_android_shouldDisableView = 12
        const val Preference_android_singleLineTitle = 14
        const val Preference_android_summary = 7
        const val Preference_android_title = 4
        const val Preference_android_widgetLayout = 9
        const val Preference_defaultValue = 18
        const val Preference_dependency = 19
        const val Preference_enableCopying = 20
        const val Preference_enabled = 21
        const val Preference_fragment = 22
        const val Preference_icon = 23
        const val Preference_iconSpaceReserved = 24
        const val Preference_isPreferenceVisible = 25
        const val Preference_key = 26
        const val Preference_layout = 27
        const val Preference_order = 28
        const val Preference_persistent = 29
        const val Preference_selectable = 30
        const val Preference_shouldDisableView = 31
        const val Preference_singleLineTitle = 32
        const val Preference_summary = 33
        const val Preference_title = 34
        const val Preference_widgetLayout = 35
        const val PropertySet_android_alpha = 1
        const val PropertySet_android_visibility = 0
        const val PropertySet_layout_constraintTag = 2
        const val PropertySet_motionProgress = 3
        const val PropertySet_visibilityMode = 4
        const val RadialViewGroup_materialCircleRadius = 0
        const val RangeSlider_minSeparation = 0
        const val RangeSlider_values = 1
        const val RecycleListView_paddingBottomNoButtons = 0
        const val RecycleListView_paddingTopNoTitle = 1
        const val RecyclerView_android_clipToPadding = 1
        const val RecyclerView_android_descendantFocusability = 2
        const val RecyclerView_android_orientation = 0
        const val RecyclerView_fastScrollEnabled = 3
        const val RecyclerView_fastScrollHorizontalThumbDrawable = 4
        const val RecyclerView_fastScrollHorizontalTrackDrawable = 5
        const val RecyclerView_fastScrollVerticalThumbDrawable = 6
        const val RecyclerView_fastScrollVerticalTrackDrawable = 7
        const val RecyclerView_layoutManager = 8
        const val RecyclerView_reverseLayout = 9
        const val RecyclerView_spanCount = 10
        const val RecyclerView_stackFromEnd = 11
        const val ScrimInsetsFrameLayout_insetForeground = 0
        const val ScrollingViewBehavior_Layout_behavior_overlapTop = 0
        const val SearchView_android_focusable = 0
        const val SearchView_android_imeOptions = 3
        const val SearchView_android_inputType = 2
        const val SearchView_android_maxWidth = 1
        const val SearchView_closeIcon = 4
        const val SearchView_commitIcon = 5
        const val SearchView_defaultQueryHint = 6
        const val SearchView_goIcon = 7
        const val SearchView_iconifiedByDefault = 8
        const val SearchView_layout = 9
        const val SearchView_queryBackground = 10
        const val SearchView_queryHint = 11
        const val SearchView_searchHintIcon = 12
        const val SearchView_searchIcon = 13
        const val SearchView_submitBackground = 14
        const val SearchView_suggestionRowLayout = 15
        const val SearchView_voiceIcon = 16
        const val SeekBarPreference_adjustable = 2
        const val SeekBarPreference_android_layout = 0
        const val SeekBarPreference_android_max = 1
        const val SeekBarPreference_min = 3
        const val SeekBarPreference_seekBarIncrement = 4
        const val SeekBarPreference_showSeekBarValue = 5
        const val SeekBarPreference_updatesContinuously = 6
        const val ShapeAppearance_cornerFamily = 0
        const val ShapeAppearance_cornerFamilyBottomLeft = 1
        const val ShapeAppearance_cornerFamilyBottomRight = 2
        const val ShapeAppearance_cornerFamilyTopLeft = 3
        const val ShapeAppearance_cornerFamilyTopRight = 4
        const val ShapeAppearance_cornerSize = 5
        const val ShapeAppearance_cornerSizeBottomLeft = 6
        const val ShapeAppearance_cornerSizeBottomRight = 7
        const val ShapeAppearance_cornerSizeTopLeft = 8
        const val ShapeAppearance_cornerSizeTopRight = 9
        const val ShapeableImageView_contentPadding = 0
        const val ShapeableImageView_contentPaddingBottom = 1
        const val ShapeableImageView_contentPaddingEnd = 2
        const val ShapeableImageView_contentPaddingLeft = 3
        const val ShapeableImageView_contentPaddingRight = 4
        const val ShapeableImageView_contentPaddingStart = 5
        const val ShapeableImageView_contentPaddingTop = 6
        const val ShapeableImageView_shapeAppearance = 7
        const val ShapeableImageView_shapeAppearanceOverlay = 8
        const val ShapeableImageView_strokeColor = 9
        const val ShapeableImageView_strokeWidth = 10
        const val ShimmerFrameLayout_shimmer_auto_start = 0
        const val ShimmerFrameLayout_shimmer_base_alpha = 1
        const val ShimmerFrameLayout_shimmer_base_color = 2
        const val ShimmerFrameLayout_shimmer_clip_to_children = 3
        const val ShimmerFrameLayout_shimmer_colored = 4
        const val ShimmerFrameLayout_shimmer_direction = 5
        const val ShimmerFrameLayout_shimmer_dropoff = 6
        const val ShimmerFrameLayout_shimmer_duration = 7
        const val ShimmerFrameLayout_shimmer_fixed_height = 8
        const val ShimmerFrameLayout_shimmer_fixed_width = 9
        const val ShimmerFrameLayout_shimmer_height_ratio = 10
        const val ShimmerFrameLayout_shimmer_highlight_alpha = 11
        const val ShimmerFrameLayout_shimmer_highlight_color = 12
        const val ShimmerFrameLayout_shimmer_intensity = 13
        const val ShimmerFrameLayout_shimmer_repeat_count = 14
        const val ShimmerFrameLayout_shimmer_repeat_delay = 15
        const val ShimmerFrameLayout_shimmer_repeat_mode = 16
        const val ShimmerFrameLayout_shimmer_shape = 17
        const val ShimmerFrameLayout_shimmer_tilt = 18
        const val ShimmerFrameLayout_shimmer_width_ratio = 19
        const val SignInButton_buttonSize = 0
        const val SignInButton_colorScheme = 1
        const val SignInButton_scopeUris = 2
        const val Slider_android_enabled = 0
        const val Slider_android_stepSize = 2
        const val Slider_android_value = 1
        const val Slider_android_valueFrom = 3
        const val Slider_android_valueTo = 4
        const val Slider_haloColor = 5
        const val Slider_haloRadius = 6
        const val Slider_labelBehavior = 7
        const val Slider_labelStyle = 8
        const val Slider_thumbColor = 9
        const val Slider_thumbElevation = 10
        const val Slider_thumbRadius = 11
        const val Slider_thumbStrokeColor = 12
        const val Slider_thumbStrokeWidth = 13
        const val Slider_tickColor = 14
        const val Slider_tickColorActive = 15
        const val Slider_tickColorInactive = 16
        const val Slider_tickVisible = 17
        const val Slider_trackColor = 18
        const val Slider_trackColorActive = 19
        const val Slider_trackColorInactive = 20
        const val Slider_trackHeight = 21
        const val SnackbarLayout_actionTextColorAlpha = 1
        const val SnackbarLayout_android_maxWidth = 0
        const val SnackbarLayout_animationMode = 2
        const val SnackbarLayout_backgroundOverlayColorAlpha = 3
        const val SnackbarLayout_backgroundTint = 4
        const val SnackbarLayout_backgroundTintMode = 5
        const val SnackbarLayout_elevation = 6
        const val SnackbarLayout_maxActionInlineWidth = 7
        const val Snackbar_snackbarButtonStyle = 0
        const val Snackbar_snackbarStyle = 1
        const val Snackbar_snackbarTextViewStyle = 2
        const val Spinner_android_dropDownWidth = 3
        const val Spinner_android_entries = 0
        const val Spinner_android_popupBackground = 1
        const val Spinner_android_prompt = 2
        const val Spinner_popupTheme = 4
        const val SplitPairFilter_primaryActivityName = 0
        const val SplitPairFilter_secondaryActivityAction = 1
        const val SplitPairFilter_secondaryActivityName = 2
        const val SplitPairRule_clearTop = 0
        const val SplitPairRule_finishPrimaryWithSecondary = 1
        const val SplitPairRule_finishSecondaryWithPrimary = 2
        const val SplitPairRule_splitLayoutDirection = 3
        const val SplitPairRule_splitMinSmallestWidth = 4
        const val SplitPairRule_splitMinWidth = 5
        const val SplitPairRule_splitRatio = 6
        const val SplitPlaceholderRule_placeholderActivityName = 0
        const val SplitPlaceholderRule_splitLayoutDirection = 1
        const val SplitPlaceholderRule_splitMinSmallestWidth = 2
        const val SplitPlaceholderRule_splitMinWidth = 3
        const val SplitPlaceholderRule_splitRatio = 4
        const val StateListDrawableItem_android_drawable = 0
        const val StateListDrawable_android_constantSize = 3
        const val StateListDrawable_android_dither = 0
        const val StateListDrawable_android_enterFadeDuration = 4
        const val StateListDrawable_android_exitFadeDuration = 5
        const val StateListDrawable_android_variablePadding = 2
        const val StateListDrawable_android_visible = 1
        const val StateSet_defaultState = 0
        const val State_android_id = 0
        const val State_constraints = 1
        const val StyledPlayerControlView_ad_marker_color = 0
        const val StyledPlayerControlView_ad_marker_width = 1
        const val StyledPlayerControlView_animation_enabled = 2
        const val StyledPlayerControlView_bar_gravity = 3
        const val StyledPlayerControlView_bar_height = 4
        const val StyledPlayerControlView_buffered_color = 5
        const val StyledPlayerControlView_controller_layout_id = 6
        const val StyledPlayerControlView_played_ad_marker_color = 7
        const val StyledPlayerControlView_played_color = 8
        const val StyledPlayerControlView_repeat_toggle_modes = 9
        const val StyledPlayerControlView_scrubber_color = 10
        const val StyledPlayerControlView_scrubber_disabled_size = 11
        const val StyledPlayerControlView_scrubber_dragged_size = 12
        const val StyledPlayerControlView_scrubber_drawable = 13
        const val StyledPlayerControlView_scrubber_enabled_size = 14
        const val StyledPlayerControlView_show_fastforward_button = 15
        const val StyledPlayerControlView_show_next_button = 16
        const val StyledPlayerControlView_show_previous_button = 17
        const val StyledPlayerControlView_show_rewind_button = 18
        const val StyledPlayerControlView_show_shuffle_button = 19
        const val StyledPlayerControlView_show_subtitle_button = 20
        const val StyledPlayerControlView_show_timeout = 21
        const val StyledPlayerControlView_show_vr_button = 22
        const val StyledPlayerControlView_time_bar_min_update_interval = 23
        const val StyledPlayerControlView_touch_target_height = 24
        const val StyledPlayerControlView_unplayed_color = 25
        const val StyledPlayerView_ad_marker_color = 0
        const val StyledPlayerView_ad_marker_width = 1
        const val StyledPlayerView_animation_enabled = 2
        const val StyledPlayerView_auto_show = 3
        const val StyledPlayerView_bar_gravity = 4
        const val StyledPlayerView_bar_height = 5
        const val StyledPlayerView_buffered_color = 6
        const val StyledPlayerView_controller_layout_id = 7
        const val StyledPlayerView_default_artwork = 8
        const val StyledPlayerView_hide_during_ads = 9
        const val StyledPlayerView_hide_on_touch = 10
        const val StyledPlayerView_keep_content_on_player_reset = 11
        const val StyledPlayerView_played_ad_marker_color = 12
        const val StyledPlayerView_played_color = 13
        const val StyledPlayerView_player_layout_id = 14
        const val StyledPlayerView_repeat_toggle_modes = 15
        const val StyledPlayerView_resize_mode = 16
        const val StyledPlayerView_scrubber_color = 17
        const val StyledPlayerView_scrubber_disabled_size = 18
        const val StyledPlayerView_scrubber_dragged_size = 19
        const val StyledPlayerView_scrubber_drawable = 20
        const val StyledPlayerView_scrubber_enabled_size = 21
        const val StyledPlayerView_show_buffering = 22
        const val StyledPlayerView_show_shuffle_button = 23
        const val StyledPlayerView_show_subtitle_button = 24
        const val StyledPlayerView_show_timeout = 25
        const val StyledPlayerView_show_vr_button = 26
        const val StyledPlayerView_shutter_background_color = 27
        const val StyledPlayerView_surface_type = 28
        const val StyledPlayerView_time_bar_min_update_interval = 29
        const val StyledPlayerView_touch_target_height = 30
        const val StyledPlayerView_unplayed_color = 31
        const val StyledPlayerView_use_artwork = 32
        const val StyledPlayerView_use_controller = 33

        /* renamed from: SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor */
        const val f9952xaa980688 = 0
        const val SwitchCompat_android_textOff = 1
        const val SwitchCompat_android_textOn = 0
        const val SwitchCompat_android_thumb = 2
        const val SwitchCompat_showText = 3
        const val SwitchCompat_splitTrack = 4
        const val SwitchCompat_switchMinWidth = 5
        const val SwitchCompat_switchPadding = 6
        const val SwitchCompat_switchTextAppearance = 7
        const val SwitchCompat_thumbTextPadding = 8
        const val SwitchCompat_thumbTint = 9
        const val SwitchCompat_thumbTintMode = 10
        const val SwitchCompat_track = 11
        const val SwitchCompat_trackTint = 12
        const val SwitchCompat_trackTintMode = 13
        const val SwitchMaterial_useMaterialThemeColors = 0
        const val SwitchPreferenceCompat_android_disableDependentsState = 2
        const val SwitchPreferenceCompat_android_summaryOff = 1
        const val SwitchPreferenceCompat_android_summaryOn = 0
        const val SwitchPreferenceCompat_android_switchTextOff = 4
        const val SwitchPreferenceCompat_android_switchTextOn = 3
        const val SwitchPreferenceCompat_disableDependentsState = 5
        const val SwitchPreferenceCompat_summaryOff = 6
        const val SwitchPreferenceCompat_summaryOn = 7
        const val SwitchPreferenceCompat_switchTextOff = 8
        const val SwitchPreferenceCompat_switchTextOn = 9
        const val SwitchPreference_android_disableDependentsState = 2
        const val SwitchPreference_android_summaryOff = 1
        const val SwitchPreference_android_summaryOn = 0
        const val SwitchPreference_android_switchTextOff = 4
        const val SwitchPreference_android_switchTextOn = 3
        const val SwitchPreference_disableDependentsState = 5
        const val SwitchPreference_summaryOff = 6
        const val SwitchPreference_summaryOn = 7
        const val SwitchPreference_switchTextOff = 8
        const val SwitchPreference_switchTextOn = 9
        const val TabItem_android_icon = 0
        const val TabItem_android_layout = 1
        const val TabItem_android_text = 2
        const val TabLayout_tabBackground = 0
        const val TabLayout_tabContentStart = 1
        const val TabLayout_tabGravity = 2
        const val TabLayout_tabIconTint = 3
        const val TabLayout_tabIconTintMode = 4
        const val TabLayout_tabIndicator = 5
        const val TabLayout_tabIndicatorAnimationDuration = 6
        const val TabLayout_tabIndicatorAnimationMode = 7
        const val TabLayout_tabIndicatorColor = 8
        const val TabLayout_tabIndicatorFullWidth = 9
        const val TabLayout_tabIndicatorGravity = 10
        const val TabLayout_tabIndicatorHeight = 11
        const val TabLayout_tabInlineLabel = 12
        const val TabLayout_tabMaxWidth = 13
        const val TabLayout_tabMinWidth = 14
        const val TabLayout_tabMode = 15
        const val TabLayout_tabPadding = 16
        const val TabLayout_tabPaddingBottom = 17
        const val TabLayout_tabPaddingEnd = 18
        const val TabLayout_tabPaddingStart = 19
        const val TabLayout_tabPaddingTop = 20
        const val TabLayout_tabRippleColor = 21
        const val TabLayout_tabSelectedTextColor = 22
        const val TabLayout_tabTextAppearance = 23
        const val TabLayout_tabTextColor = 24
        const val TabLayout_tabUnboundedRipple = 25
        const val TextAppearance_android_fontFamily = 10
        const val TextAppearance_android_shadowColor = 6
        const val TextAppearance_android_shadowDx = 7
        const val TextAppearance_android_shadowDy = 8
        const val TextAppearance_android_shadowRadius = 9
        const val TextAppearance_android_textColor = 3
        const val TextAppearance_android_textColorHint = 4
        const val TextAppearance_android_textColorLink = 5
        const val TextAppearance_android_textFontWeight = 11
        const val TextAppearance_android_textSize = 0
        const val TextAppearance_android_textStyle = 2
        const val TextAppearance_android_typeface = 1
        const val TextAppearance_fontFamily = 12
        const val TextAppearance_fontVariationSettings = 13
        const val TextAppearance_textAllCaps = 14
        const val TextAppearance_textLocale = 15
        const val TextEffects_android_fontFamily = 8
        const val TextEffects_android_shadowColor = 4
        const val TextEffects_android_shadowDx = 5
        const val TextEffects_android_shadowDy = 6
        const val TextEffects_android_shadowRadius = 7
        const val TextEffects_android_text = 3
        const val TextEffects_android_textSize = 0
        const val TextEffects_android_textStyle = 2
        const val TextEffects_android_typeface = 1
        const val TextEffects_borderRound = 9
        const val TextEffects_borderRoundPercent = 10
        const val TextEffects_textFillColor = 11
        const val TextEffects_textOutlineColor = 12
        const val TextEffects_textOutlineThickness = 13
        const val TextInputEditText_textInputLayoutFocusedRectEnabled = 0
        const val TextInputLayout_android_enabled = 0
        const val TextInputLayout_android_hint = 4
        const val TextInputLayout_android_maxWidth = 2
        const val TextInputLayout_android_minWidth = 3
        const val TextInputLayout_android_textColorHint = 1
        const val TextInputLayout_boxBackgroundColor = 5
        const val TextInputLayout_boxBackgroundMode = 6
        const val TextInputLayout_boxCollapsedPaddingTop = 7
        const val TextInputLayout_boxCornerRadiusBottomEnd = 8
        const val TextInputLayout_boxCornerRadiusBottomStart = 9
        const val TextInputLayout_boxCornerRadiusTopEnd = 10
        const val TextInputLayout_boxCornerRadiusTopStart = 11
        const val TextInputLayout_boxStrokeColor = 12
        const val TextInputLayout_boxStrokeErrorColor = 13
        const val TextInputLayout_boxStrokeWidth = 14
        const val TextInputLayout_boxStrokeWidthFocused = 15
        const val TextInputLayout_counterEnabled = 16
        const val TextInputLayout_counterMaxLength = 17
        const val TextInputLayout_counterOverflowTextAppearance = 18
        const val TextInputLayout_counterOverflowTextColor = 19
        const val TextInputLayout_counterTextAppearance = 20
        const val TextInputLayout_counterTextColor = 21
        const val TextInputLayout_endIconCheckable = 22
        const val TextInputLayout_endIconContentDescription = 23
        const val TextInputLayout_endIconDrawable = 24
        const val TextInputLayout_endIconMode = 25
        const val TextInputLayout_endIconTint = 26
        const val TextInputLayout_endIconTintMode = 27
        const val TextInputLayout_errorContentDescription = 28
        const val TextInputLayout_errorEnabled = 29
        const val TextInputLayout_errorIconDrawable = 30
        const val TextInputLayout_errorIconTint = 31
        const val TextInputLayout_errorIconTintMode = 32
        const val TextInputLayout_errorTextAppearance = 33
        const val TextInputLayout_errorTextColor = 34
        const val TextInputLayout_expandedHintEnabled = 35
        const val TextInputLayout_helperText = 36
        const val TextInputLayout_helperTextEnabled = 37
        const val TextInputLayout_helperTextTextAppearance = 38
        const val TextInputLayout_helperTextTextColor = 39
        const val TextInputLayout_hintAnimationEnabled = 40
        const val TextInputLayout_hintEnabled = 41
        const val TextInputLayout_hintTextAppearance = 42
        const val TextInputLayout_hintTextColor = 43
        const val TextInputLayout_passwordToggleContentDescription = 44
        const val TextInputLayout_passwordToggleDrawable = 45
        const val TextInputLayout_passwordToggleEnabled = 46
        const val TextInputLayout_passwordToggleTint = 47
        const val TextInputLayout_passwordToggleTintMode = 48
        const val TextInputLayout_placeholderText = 49
        const val TextInputLayout_placeholderTextAppearance = 50
        const val TextInputLayout_placeholderTextColor = 51
        const val TextInputLayout_prefixText = 52
        const val TextInputLayout_prefixTextAppearance = 53
        const val TextInputLayout_prefixTextColor = 54
        const val TextInputLayout_shapeAppearance = 55
        const val TextInputLayout_shapeAppearanceOverlay = 56
        const val TextInputLayout_startIconCheckable = 57
        const val TextInputLayout_startIconContentDescription = 58
        const val TextInputLayout_startIconDrawable = 59
        const val TextInputLayout_startIconTint = 60
        const val TextInputLayout_startIconTintMode = 61
        const val TextInputLayout_suffixText = 62
        const val TextInputLayout_suffixTextAppearance = 63
        const val TextInputLayout_suffixTextColor = 64
        const val ThemeEnforcement_android_textAppearance = 0
        const val ThemeEnforcement_enforceMaterialTheme = 1
        const val ThemeEnforcement_enforceTextAppearance = 2
        const val Toolbar_android_gravity = 0
        const val Toolbar_android_minHeight = 1
        const val Toolbar_buttonGravity = 2
        const val Toolbar_collapseContentDescription = 3
        const val Toolbar_collapseIcon = 4
        const val Toolbar_contentInsetEnd = 5
        const val Toolbar_contentInsetEndWithActions = 6
        const val Toolbar_contentInsetLeft = 7
        const val Toolbar_contentInsetRight = 8
        const val Toolbar_contentInsetStart = 9
        const val Toolbar_contentInsetStartWithNavigation = 10
        const val Toolbar_logo = 11
        const val Toolbar_logoDescription = 12
        const val Toolbar_maxButtonHeight = 13
        const val Toolbar_menu = 14
        const val Toolbar_navigationContentDescription = 15
        const val Toolbar_navigationIcon = 16
        const val Toolbar_popupTheme = 17
        const val Toolbar_subtitle = 18
        const val Toolbar_subtitleTextAppearance = 19
        const val Toolbar_subtitleTextColor = 20
        const val Toolbar_title = 21
        const val Toolbar_titleMargin = 22
        const val Toolbar_titleMarginBottom = 23
        const val Toolbar_titleMarginEnd = 24
        const val Toolbar_titleMarginStart = 25
        const val Toolbar_titleMarginTop = 26
        const val Toolbar_titleMargins = 27
        const val Toolbar_titleTextAppearance = 28
        const val Toolbar_titleTextColor = 29
        const val Tooltip_android_layout_margin = 3
        const val Tooltip_android_minHeight = 5
        const val Tooltip_android_minWidth = 4
        const val Tooltip_android_padding = 2
        const val Tooltip_android_text = 6
        const val Tooltip_android_textAppearance = 0
        const val Tooltip_android_textColor = 1
        const val Tooltip_backgroundTint = 7
        const val Transform_android_elevation = 10
        const val Transform_android_rotation = 6
        const val Transform_android_rotationX = 7
        const val Transform_android_rotationY = 8
        const val Transform_android_scaleX = 4
        const val Transform_android_scaleY = 5
        const val Transform_android_transformPivotX = 0
        const val Transform_android_transformPivotY = 1
        const val Transform_android_translationX = 2
        const val Transform_android_translationY = 3
        const val Transform_android_translationZ = 9
        const val Transform_transformPivotTarget = 11
        const val Transition_android_id = 0
        const val Transition_autoTransition = 1
        const val Transition_constraintSetEnd = 2
        const val Transition_constraintSetStart = 3
        const val Transition_duration = 4
        const val Transition_layoutDuringTransition = 5
        const val Transition_motionInterpolator = 6
        const val Transition_pathMotionArc = 7
        const val Transition_staggered = 8
        const val Transition_transitionDisable = 9
        const val Transition_transitionFlags = 10
        const val Variant_constraints = 0
        const val Variant_region_heightLessThan = 1
        const val Variant_region_heightMoreThan = 2
        const val Variant_region_widthLessThan = 3
        const val Variant_region_widthMoreThan = 4
        const val ViewBackgroundHelper_android_background = 0
        const val ViewBackgroundHelper_backgroundTint = 1
        const val ViewBackgroundHelper_backgroundTintMode = 2
        const val ViewPager2_android_orientation = 0
        const val ViewStubCompat_android_id = 0
        const val ViewStubCompat_android_inflatedId = 2
        const val ViewStubCompat_android_layout = 1
        const val ViewTransition_SharedValue = 1
        const val ViewTransition_SharedValueId = 2
        const val ViewTransition_android_id = 0
        const val ViewTransition_clearsTag = 3
        const val ViewTransition_duration = 4
        const val ViewTransition_ifTagNotSet = 5
        const val ViewTransition_ifTagSet = 6
        const val ViewTransition_motionInterpolator = 7
        const val ViewTransition_motionTarget = 8
        const val ViewTransition_onStateTransition = 9
        const val ViewTransition_pathMotionArc = 10
        const val ViewTransition_setsTag = 11
        const val ViewTransition_transitionDisable = 12
        const val ViewTransition_upDuration = 13
        const val ViewTransition_viewTransitionMode = 14
        const val View_android_focusable = 1
        const val View_android_theme = 0
        const val View_paddingEnd = 2
        const val View_paddingStart = 3
        const val View_theme = 4
        const val com_facebook_like_view_com_facebook_auxiliary_view_position = 0
        const val com_facebook_like_view_com_facebook_foreground_color = 1
        const val com_facebook_like_view_com_facebook_horizontal_alignment = 2
        const val com_facebook_like_view_com_facebook_object_id = 3
        const val com_facebook_like_view_com_facebook_object_type = 4
        const val com_facebook_like_view_com_facebook_style = 5
        const val com_facebook_login_view_com_facebook_confirm_logout = 0
        const val com_facebook_login_view_com_facebook_login_text = 1
        const val com_facebook_login_view_com_facebook_logout_text = 2
        const val com_facebook_login_view_com_facebook_tooltip_mode = 3
        const val com_facebook_profile_picture_view_com_facebook_is_cropped = 0
        const val com_facebook_profile_picture_view_com_facebook_preset_size = 1
        const val include_constraintSet = 0
        val AVLoadingIndicatorView = intArrayOf(R.attr.indicator, R.attr.indicator_color)
        val ActionBar = intArrayOf(
            R.attr.background,
            R.attr.backgroundSplit,
            R.attr.backgroundStacked,
            R.attr.contentInsetEnd,
            R.attr.contentInsetEndWithActions,
            R.attr.contentInsetLeft,
            R.attr.contentInsetRight,
            R.attr.contentInsetStart,
            R.attr.contentInsetStartWithNavigation,
            R.attr.customNavigationLayout,
            R.attr.displayOptions,
            R.attr.divider,
            R.attr.elevation,
            R.attr.height,
            R.attr.hideOnContentScroll,
            R.attr.homeAsUpIndicator,
            R.attr.homeLayout,
            R.attr.icon,
            R.attr.indeterminateProgressStyle,
            R.attr.itemPadding,
            R.attr.logo,
            R.attr.navigationMode,
            R.attr.popupTheme,
            R.attr.progressBarPadding,
            R.attr.progressBarStyle,
            R.attr.subtitle,
            R.attr.subtitleTextStyle,
            R.attr.title,
            R.attr.titleTextStyle
        )
        val ActionBarLayout = intArrayOf(16842931)
        val ActionMenuItemView = intArrayOf(16843071)
        val ActionMenuView = IntArray(0)
        val ActionMode = intArrayOf(
            R.attr.background,
            R.attr.backgroundSplit,
            R.attr.closeItemLayout,
            R.attr.height,
            R.attr.subtitleTextStyle,
            R.attr.titleTextStyle
        )
        val ActivityChooserView =
            intArrayOf(R.attr.expandActivityOverflowButtonDrawable, R.attr.initialActivityCount)
        val ActivityFilter = intArrayOf(R.attr.activityAction, R.attr.activityName)
        val ActivityNavigator = intArrayOf(
            16842755,
            R.attr.action,
            R.attr.data,
            R.attr.dataPattern,
            R.attr.targetPackage
        )
        val ActivityRule = intArrayOf(R.attr.alwaysExpand)
        val AlertDialog = intArrayOf(
            16842994,
            R.attr.buttonIconDimen,
            R.attr.buttonPanelSideLayout,
            R.attr.listItemLayout,
            R.attr.listLayout,
            R.attr.multiChoiceItemLayout,
            R.attr.showTitle,
            R.attr.singleChoiceItemLayout
        )
        val AnimatedStateListDrawableCompat =
            intArrayOf(16843036, 16843156, 16843157, 16843158, 16843532, 16843533)
        val AnimatedStateListDrawableItem = intArrayOf(16842960, 16843161)
        val AnimatedStateListDrawableTransition = intArrayOf(16843161, 16843849, 16843850, 16843851)
        val AppBarLayout = intArrayOf(
            16842964,
            16843919,
            16844096,
            R.attr.elevation,
            R.attr.expanded,
            R.attr.liftOnScroll,
            R.attr.liftOnScrollTargetViewId,
            R.attr.statusBarForeground
        )
        val AppBarLayoutStates = intArrayOf(
            R.attr.state_collapsed,
            R.attr.state_collapsible,
            R.attr.state_liftable,
            R.attr.state_lifted
        )
        val AppBarLayout_Layout = intArrayOf(
            R.attr.layout_scrollEffect,
            R.attr.layout_scrollFlags,
            R.attr.layout_scrollInterpolator
        )
        val AppCompatEmojiHelper = IntArray(0)
        val AppCompatImageView =
            intArrayOf(16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode)
        val AppCompatSeekBar =
            intArrayOf(16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode)
        val AppCompatTextHelper =
            intArrayOf(16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667)
        val AppCompatTextView = intArrayOf(
            16842804,
            R.attr.autoSizeMaxTextSize,
            R.attr.autoSizeMinTextSize,
            R.attr.autoSizePresetSizes,
            R.attr.autoSizeStepGranularity,
            R.attr.autoSizeTextType,
            R.attr.drawableBottomCompat,
            R.attr.drawableEndCompat,
            R.attr.drawableLeftCompat,
            R.attr.drawableRightCompat,
            R.attr.drawableStartCompat,
            R.attr.drawableTint,
            R.attr.drawableTintMode,
            R.attr.drawableTopCompat,
            R.attr.emojiCompatEnabled,
            R.attr.firstBaselineToTopHeight,
            R.attr.fontFamily,
            R.attr.fontVariationSettings,
            R.attr.lastBaselineToBottomHeight,
            R.attr.lineHeight,
            R.attr.textAllCaps,
            R.attr.textLocale
        )
        val AppCompatTheme = intArrayOf(
            16842839,
            16842926,
            R.attr.actionBarDivider,
            R.attr.actionBarItemBackground,
            R.attr.actionBarPopupTheme,
            R.attr.actionBarSize,
            R.attr.actionBarSplitStyle,
            R.attr.actionBarStyle,
            R.attr.actionBarTabBarStyle,
            R.attr.actionBarTabStyle,
            R.attr.actionBarTabTextStyle,
            R.attr.actionBarTheme,
            R.attr.actionBarWidgetTheme,
            R.attr.actionButtonStyle,
            R.attr.actionDropDownStyle,
            R.attr.actionMenuTextAppearance,
            R.attr.actionMenuTextColor,
            R.attr.actionModeBackground,
            R.attr.actionModeCloseButtonStyle,
            R.attr.actionModeCloseContentDescription,
            R.attr.actionModeCloseDrawable,
            R.attr.actionModeCopyDrawable,
            R.attr.actionModeCutDrawable,
            R.attr.actionModeFindDrawable,
            R.attr.actionModePasteDrawable,
            R.attr.actionModePopupWindowStyle,
            R.attr.actionModeSelectAllDrawable,
            R.attr.actionModeShareDrawable,
            R.attr.actionModeSplitBackground,
            R.attr.actionModeStyle,
            R.attr.actionModeTheme,
            R.attr.actionModeWebSearchDrawable,
            R.attr.actionOverflowButtonStyle,
            R.attr.actionOverflowMenuStyle,
            R.attr.activityChooserViewStyle,
            R.attr.alertDialogButtonGroupStyle,
            R.attr.alertDialogCenterButtons,
            R.attr.alertDialogStyle,
            R.attr.alertDialogTheme,
            R.attr.autoCompleteTextViewStyle,
            R.attr.borderlessButtonStyle,
            R.attr.buttonBarButtonStyle,
            R.attr.buttonBarNegativeButtonStyle,
            R.attr.buttonBarNeutralButtonStyle,
            R.attr.buttonBarPositiveButtonStyle,
            R.attr.buttonBarStyle,
            R.attr.buttonStyle,
            R.attr.buttonStyleSmall,
            R.attr.checkboxStyle,
            R.attr.checkedTextViewStyle,
            R.attr.colorAccent,
            R.attr.colorBackgroundFloating,
            R.attr.colorButtonNormal,
            R.attr.colorControlActivated,
            R.attr.colorControlHighlight,
            R.attr.colorControlNormal,
            R.attr.colorError,
            R.attr.colorPrimary,
            R.attr.colorPrimaryDark,
            R.attr.colorSwitchThumbNormal,
            R.attr.controlBackground,
            R.attr.dialogCornerRadius,
            R.attr.dialogPreferredPadding,
            R.attr.dialogTheme,
            R.attr.dividerHorizontal,
            R.attr.dividerVertical,
            R.attr.dropDownListViewStyle,
            R.attr.dropdownListPreferredItemHeight,
            R.attr.editTextBackground,
            R.attr.editTextColor,
            R.attr.editTextStyle,
            R.attr.homeAsUpIndicator,
            R.attr.imageButtonStyle,
            R.attr.listChoiceBackgroundIndicator,
            R.attr.listChoiceIndicatorMultipleAnimated,
            R.attr.listChoiceIndicatorSingleAnimated,
            R.attr.listDividerAlertDialog,
            R.attr.listMenuViewStyle,
            R.attr.listPopupWindowStyle,
            R.attr.listPreferredItemHeight,
            R.attr.listPreferredItemHeightLarge,
            R.attr.listPreferredItemHeightSmall,
            R.attr.listPreferredItemPaddingEnd,
            R.attr.listPreferredItemPaddingLeft,
            R.attr.listPreferredItemPaddingRight,
            R.attr.listPreferredItemPaddingStart,
            R.attr.panelBackground,
            R.attr.panelMenuListTheme,
            R.attr.panelMenuListWidth,
            R.attr.popupMenuStyle,
            R.attr.popupWindowStyle,
            R.attr.radioButtonStyle,
            R.attr.ratingBarStyle,
            R.attr.ratingBarStyleIndicator,
            R.attr.ratingBarStyleSmall,
            R.attr.searchViewStyle,
            R.attr.seekBarStyle,
            R.attr.selectableItemBackground,
            R.attr.selectableItemBackgroundBorderless,
            R.attr.spinnerDropDownItemStyle,
            R.attr.spinnerStyle,
            R.attr.switchStyle,
            R.attr.textAppearanceLargePopupMenu,
            R.attr.textAppearanceListItem,
            R.attr.textAppearanceListItemSecondary,
            R.attr.textAppearanceListItemSmall,
            R.attr.textAppearancePopupMenuHeader,
            R.attr.textAppearanceSearchResultSubtitle,
            R.attr.textAppearanceSearchResultTitle,
            R.attr.textAppearanceSmallPopupMenu,
            R.attr.textColorAlertDialogListItem,
            R.attr.textColorSearchUrl,
            R.attr.toolbarNavigationButtonStyle,
            R.attr.toolbarStyle,
            R.attr.tooltipForegroundColor,
            R.attr.tooltipFrameBackground,
            R.attr.viewInflaterClass,
            R.attr.windowActionBar,
            R.attr.windowActionBarOverlay,
            R.attr.windowActionModeOverlay,
            R.attr.windowFixedHeightMajor,
            R.attr.windowFixedHeightMinor,
            R.attr.windowFixedWidthMajor,
            R.attr.windowFixedWidthMinor,
            R.attr.windowMinWidthMajor,
            R.attr.windowMinWidthMinor,
            R.attr.windowNoTitle
        )
        val AspectRatioFrameLayout = intArrayOf(R.attr.resize_mode)
        val AvatarView = intArrayOf(
            R.attr.avvy_badge_color,
            R.attr.avvy_badge_position,
            R.attr.avvy_badge_radius,
            R.attr.avvy_badge_stroke_color,
            R.attr.avvy_badge_stroke_width,
            R.attr.avvy_border_color,
            R.attr.avvy_border_color_end,
            R.attr.avvy_border_highlight_color,
            R.attr.avvy_border_highlight_color_end,
            R.attr.avvy_border_thickness,
            R.attr.avvy_border_thickness_highlight,
            R.attr.avvy_circle_background_color,
            R.attr.avvy_distance_to_border,
            R.attr.avvy_highlighted,
            R.attr.avvy_loading_arc_degree_length,
            R.attr.avvy_loading_arches,
            R.attr.avvy_loading_arches_degree_area,
            R.attr.avvy_middle_color,
            R.attr.avvy_show_badge,
            R.attr.avvy_text,
            R.attr.avvy_text_color,
            R.attr.avvy_text_size
        )
        val BackgroundStyle = intArrayOf(16843534, R.attr.selectableItemBackground)
        val Badge = intArrayOf(
            R.attr.backgroundColor,
            R.attr.badgeGravity,
            R.attr.badgeRadius,
            R.attr.badgeTextColor,
            R.attr.badgeWidePadding,
            R.attr.badgeWithTextRadius,
            R.attr.horizontalOffset,
            R.attr.horizontalOffsetWithText,
            R.attr.maxCharacterCount,
            R.attr.number,
            R.attr.verticalOffset,
            R.attr.verticalOffsetWithText
        )
        val BaseProgressIndicator = intArrayOf(
            16843065,
            R.attr.hideAnimationBehavior,
            R.attr.indicatorColor,
            R.attr.minHideDelay,
            R.attr.showAnimationBehavior,
            R.attr.showDelay,
            R.attr.trackColor,
            R.attr.trackCornerRadius,
            R.attr.trackThickness
        )
        val BlurView = intArrayOf(R.attr.blurOverlayColor)
        val BottomAppBar = intArrayOf(
            R.attr.backgroundTint,
            R.attr.elevation,
            R.attr.fabAlignmentMode,
            R.attr.fabAnimationMode,
            R.attr.fabCradleMargin,
            R.attr.fabCradleRoundedCornerRadius,
            R.attr.fabCradleVerticalOffset,
            R.attr.hideOnScroll,
            R.attr.navigationIconTint,
            R.attr.paddingBottomSystemWindowInsets,
            R.attr.paddingLeftSystemWindowInsets,
            R.attr.paddingRightSystemWindowInsets
        )
        val BottomNavigationView = intArrayOf(16843072, R.attr.itemHorizontalTranslationEnabled)
        val BottomSheetBehavior_Layout = intArrayOf(
            16843039,
            16843040,
            16843840,
            R.attr.backgroundTint,
            R.attr.behavior_draggable,
            R.attr.behavior_expandedOffset,
            R.attr.behavior_fitToContents,
            R.attr.behavior_halfExpandedRatio,
            R.attr.behavior_hideable,
            R.attr.behavior_peekHeight,
            R.attr.behavior_saveFlags,
            R.attr.behavior_skipCollapsed,
            R.attr.gestureInsetBottomIgnored,
            R.attr.paddingBottomSystemWindowInsets,
            R.attr.paddingLeftSystemWindowInsets,
            R.attr.paddingRightSystemWindowInsets,
            R.attr.paddingTopSystemWindowInsets,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay
        )
        val ButtonBarLayout = intArrayOf(R.attr.allowStacking)
        val Capability = intArrayOf(R.attr.queryPatterns, R.attr.shortcutMatchRequired)
        val CardView = intArrayOf(
            16843071,
            16843072,
            R.attr.cardBackgroundColor,
            R.attr.cardCornerRadius,
            R.attr.cardElevation,
            R.attr.cardMaxElevation,
            R.attr.cardPreventCornerOverlap,
            R.attr.cardUseCompatPadding,
            R.attr.contentPadding,
            R.attr.contentPaddingBottom,
            R.attr.contentPaddingLeft,
            R.attr.contentPaddingRight,
            R.attr.contentPaddingTop
        )
        val Carousel = intArrayOf(
            R.attr.carousel_backwardTransition,
            R.attr.carousel_emptyViewsBehavior,
            R.attr.carousel_firstView,
            R.attr.carousel_forwardTransition,
            R.attr.carousel_infinite,
            R.attr.carousel_nextState,
            R.attr.carousel_previousState,
            R.attr.carousel_touchUpMode,
            R.attr.carousel_touchUp_dampeningFactor,
            R.attr.carousel_touchUp_velocityThreshold
        )
        val CastExpandedController = intArrayOf(
            R.attr.castAdBreakMarkerColor,
            R.attr.castAdInProgressLabelTextAppearance,
            R.attr.castAdInProgressText,
            R.attr.castAdInProgressTextColor,
            R.attr.castAdLabelColor,
            R.attr.castAdLabelTextAppearance,
            R.attr.castAdLabelTextColor,
            R.attr.castButtonColor,
            R.attr.castClosedCaptionsButtonDrawable,
            R.attr.castControlButtons,
            R.attr.castDefaultAdPosterUrl,
            R.attr.castExpandedControllerLoadingIndicatorColor,
            R.attr.castForward30ButtonDrawable,
            R.attr.castLiveIndicatorColor,
            R.attr.castMuteToggleButtonDrawable,
            R.attr.castPauseButtonDrawable,
            R.attr.castPlayButtonDrawable,
            R.attr.castRewind30ButtonDrawable,
            R.attr.castSeekBarProgressAndThumbColor,
            R.attr.castSeekBarProgressDrawable,
            R.attr.castSeekBarSecondaryProgressColor,
            R.attr.castSeekBarThumbDrawable,
            R.attr.castSeekBarTooltipBackgroundColor,
            R.attr.castSeekBarUnseekableProgressColor,
            R.attr.castSkipNextButtonDrawable,
            R.attr.castSkipPreviousButtonDrawable,
            R.attr.castStopButtonDrawable
        )
        val CastIntroOverlay = intArrayOf(
            R.attr.castBackgroundColor,
            R.attr.castButtonBackgroundColor,
            R.attr.castButtonText,
            R.attr.castButtonTextAppearance,
            R.attr.castFocusRadius,
            R.attr.castTitleTextAppearance
        )
        val CastMiniController = intArrayOf(
            R.attr.castBackground,
            R.attr.castButtonColor,
            R.attr.castClosedCaptionsButtonDrawable,
            R.attr.castControlButtons,
            R.attr.castForward30ButtonDrawable,
            R.attr.castLargePauseButtonDrawable,
            R.attr.castLargePlayButtonDrawable,
            R.attr.castLargeStopButtonDrawable,
            R.attr.castMiniControllerLoadingIndicatorColor,
            R.attr.castMuteToggleButtonDrawable,
            R.attr.castPauseButtonDrawable,
            R.attr.castPlayButtonDrawable,
            R.attr.castProgressBarColor,
            R.attr.castRewind30ButtonDrawable,
            R.attr.castShowImageThumbnail,
            R.attr.castSkipNextButtonDrawable,
            R.attr.castSkipPreviousButtonDrawable,
            R.attr.castStopButtonDrawable,
            R.attr.castSubtitleTextAppearance,
            R.attr.castTitleTextAppearance
        )
        val CheckBoxPreference = intArrayOf(
            16843247,
            16843248,
            16843249,
            R.attr.disableDependentsState,
            R.attr.summaryOff,
            R.attr.summaryOn
        )
        val CheckedTextView = intArrayOf(
            16843016,
            R.attr.checkMarkCompat,
            R.attr.checkMarkTint,
            R.attr.checkMarkTintMode
        )
        val Chip = intArrayOf(
            16842804,
            16842901,
            16842904,
            16842923,
            16843039,
            16843087,
            16843237,
            R.attr.checkedIcon,
            R.attr.checkedIconEnabled,
            R.attr.checkedIconTint,
            R.attr.checkedIconVisible,
            R.attr.chipBackgroundColor,
            R.attr.chipCornerRadius,
            R.attr.chipEndPadding,
            R.attr.chipIcon,
            R.attr.chipIconEnabled,
            R.attr.chipIconSize,
            R.attr.chipIconTint,
            R.attr.chipIconVisible,
            R.attr.chipMinHeight,
            R.attr.chipMinTouchTargetSize,
            R.attr.chipStartPadding,
            R.attr.chipStrokeColor,
            R.attr.chipStrokeWidth,
            R.attr.chipSurfaceColor,
            R.attr.closeIcon,
            R.attr.closeIconEnabled,
            R.attr.closeIconEndPadding,
            R.attr.closeIconSize,
            R.attr.closeIconStartPadding,
            R.attr.closeIconTint,
            R.attr.closeIconVisible,
            R.attr.ensureMinTouchTargetSize,
            R.attr.hideMotionSpec,
            R.attr.iconEndPadding,
            R.attr.iconStartPadding,
            R.attr.rippleColor,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.showMotionSpec,
            R.attr.textEndPadding,
            R.attr.textStartPadding
        )
        val ChipGroup = intArrayOf(
            R.attr.checkedChip,
            R.attr.chipSpacing,
            R.attr.chipSpacingHorizontal,
            R.attr.chipSpacingVertical,
            R.attr.selectionRequired,
            R.attr.singleLine,
            R.attr.singleSelection
        )
        val CircularProgressIndicator = intArrayOf(
            R.attr.indicatorDirectionCircular,
            R.attr.indicatorInset,
            R.attr.indicatorSize
        )
        val ClockFaceView = intArrayOf(R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor)
        val ClockHandView =
            intArrayOf(R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize)
        val CollapsingToolbarLayout = intArrayOf(
            R.attr.collapsedTitleGravity,
            R.attr.collapsedTitleTextAppearance,
            R.attr.collapsedTitleTextColor,
            R.attr.contentScrim,
            R.attr.expandedTitleGravity,
            R.attr.expandedTitleMargin,
            R.attr.expandedTitleMarginBottom,
            R.attr.expandedTitleMarginEnd,
            R.attr.expandedTitleMarginStart,
            R.attr.expandedTitleMarginTop,
            R.attr.expandedTitleTextAppearance,
            R.attr.expandedTitleTextColor,
            R.attr.extraMultilineHeightEnabled,
            R.attr.forceApplySystemWindowInsetTop,
            R.attr.maxLines,
            R.attr.scrimAnimationDuration,
            R.attr.scrimVisibleHeightTrigger,
            R.attr.statusBarScrim,
            R.attr.title,
            R.attr.titleCollapseMode,
            R.attr.titleEnabled,
            R.attr.titlePositionInterpolator,
            R.attr.toolbarId
        )
        val CollapsingToolbarLayout_Layout =
            intArrayOf(R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier)
        val ColorPanelView =
            intArrayOf(R.attr.cpv_borderColor, R.attr.cpv_colorShape, R.attr.cpv_showOldColor)
        val ColorPickerView = intArrayOf(
            R.attr.cpv_alphaChannelText,
            R.attr.cpv_alphaChannelVisible,
            R.attr.cpv_borderColor,
            R.attr.cpv_sliderColor
        )
        val ColorPreference = intArrayOf(
            R.attr.cpv_allowCustom,
            R.attr.cpv_allowPresets,
            R.attr.cpv_colorPresets,
            R.attr.cpv_colorShape,
            R.attr.cpv_dialogTitle,
            R.attr.cpv_dialogType,
            R.attr.cpv_previewSize,
            R.attr.cpv_showAlphaSlider,
            R.attr.cpv_showColorShades,
            R.attr.cpv_showDialog
        )
        val ColorStateListItem =
            intArrayOf(16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar)
        val CompoundButton =
            intArrayOf(16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode)
        val Constraint = intArrayOf(
            16842948,
            16842960,
            16842972,
            16842996,
            16842997,
            16842999,
            16843000,
            16843001,
            16843002,
            16843039,
            16843040,
            16843071,
            16843072,
            16843551,
            16843552,
            16843553,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843701,
            16843702,
            16843770,
            16843840,
            R.attr.animateCircleAngleTo,
            R.attr.animateRelativeTo,
            R.attr.barrierAllowsGoneWidgets,
            R.attr.barrierDirection,
            R.attr.barrierMargin,
            R.attr.chainUseRtl,
            R.attr.constraint_referenced_ids,
            R.attr.constraint_referenced_tags,
            R.attr.drawPath,
            R.attr.flow_firstHorizontalBias,
            R.attr.flow_firstHorizontalStyle,
            R.attr.flow_firstVerticalBias,
            R.attr.flow_firstVerticalStyle,
            R.attr.flow_horizontalAlign,
            R.attr.flow_horizontalBias,
            R.attr.flow_horizontalGap,
            R.attr.flow_horizontalStyle,
            R.attr.flow_lastHorizontalBias,
            R.attr.flow_lastHorizontalStyle,
            R.attr.flow_lastVerticalBias,
            R.attr.flow_lastVerticalStyle,
            R.attr.flow_maxElementsWrap,
            R.attr.flow_verticalAlign,
            R.attr.flow_verticalBias,
            R.attr.flow_verticalGap,
            R.attr.flow_verticalStyle,
            R.attr.flow_wrapMode,
            R.attr.guidelineUseRtl,
            R.attr.layout_constrainedHeight,
            R.attr.layout_constrainedWidth,
            R.attr.layout_constraintBaseline_creator,
            R.attr.layout_constraintBaseline_toBaselineOf,
            R.attr.layout_constraintBaseline_toBottomOf,
            R.attr.layout_constraintBaseline_toTopOf,
            R.attr.layout_constraintBottom_creator,
            R.attr.layout_constraintBottom_toBottomOf,
            R.attr.layout_constraintBottom_toTopOf,
            R.attr.layout_constraintCircle,
            R.attr.layout_constraintCircleAngle,
            R.attr.layout_constraintCircleRadius,
            R.attr.layout_constraintDimensionRatio,
            R.attr.layout_constraintEnd_toEndOf,
            R.attr.layout_constraintEnd_toStartOf,
            R.attr.layout_constraintGuide_begin,
            R.attr.layout_constraintGuide_end,
            R.attr.layout_constraintGuide_percent,
            R.attr.layout_constraintHeight,
            R.attr.layout_constraintHeight_default,
            R.attr.layout_constraintHeight_max,
            R.attr.layout_constraintHeight_min,
            R.attr.layout_constraintHeight_percent,
            R.attr.layout_constraintHorizontal_bias,
            R.attr.layout_constraintHorizontal_chainStyle,
            R.attr.layout_constraintHorizontal_weight,
            R.attr.layout_constraintLeft_creator,
            R.attr.layout_constraintLeft_toLeftOf,
            R.attr.layout_constraintLeft_toRightOf,
            R.attr.layout_constraintRight_creator,
            R.attr.layout_constraintRight_toLeftOf,
            R.attr.layout_constraintRight_toRightOf,
            R.attr.layout_constraintStart_toEndOf,
            R.attr.layout_constraintStart_toStartOf,
            R.attr.layout_constraintTag,
            R.attr.layout_constraintTop_creator,
            R.attr.layout_constraintTop_toBottomOf,
            R.attr.layout_constraintTop_toTopOf,
            R.attr.layout_constraintVertical_bias,
            R.attr.layout_constraintVertical_chainStyle,
            R.attr.layout_constraintVertical_weight,
            R.attr.layout_constraintWidth,
            R.attr.layout_constraintWidth_default,
            R.attr.layout_constraintWidth_max,
            R.attr.layout_constraintWidth_min,
            R.attr.layout_constraintWidth_percent,
            R.attr.layout_editor_absoluteX,
            R.attr.layout_editor_absoluteY,
            R.attr.layout_goneMarginBaseline,
            R.attr.layout_goneMarginBottom,
            R.attr.layout_goneMarginEnd,
            R.attr.layout_goneMarginLeft,
            R.attr.layout_goneMarginRight,
            R.attr.layout_goneMarginStart,
            R.attr.layout_goneMarginTop,
            R.attr.layout_marginBaseline,
            R.attr.layout_wrapBehaviorInParent,
            R.attr.motionProgress,
            R.attr.motionStagger,
            R.attr.pathMotionArc,
            R.attr.pivotAnchor,
            R.attr.polarRelativeTo,
            R.attr.quantizeMotionInterpolator,
            R.attr.quantizeMotionPhase,
            R.attr.quantizeMotionSteps,
            R.attr.transformPivotTarget,
            R.attr.transitionEasing,
            R.attr.transitionPathRotate,
            R.attr.visibilityMode
        )
        val ConstraintLayout_Layout = intArrayOf(
            16842948,
            16842965,
            16842966,
            16842967,
            16842968,
            16842969,
            16842972,
            16842996,
            16842997,
            16842998,
            16842999,
            16843000,
            16843001,
            16843002,
            16843039,
            16843040,
            16843071,
            16843072,
            16843699,
            16843700,
            16843701,
            16843702,
            16843840,
            16844091,
            16844092,
            R.attr.barrierAllowsGoneWidgets,
            R.attr.barrierDirection,
            R.attr.barrierMargin,
            R.attr.chainUseRtl,
            R.attr.circularflow_angles,
            R.attr.circularflow_defaultAngle,
            R.attr.circularflow_defaultRadius,
            R.attr.circularflow_radiusInDP,
            R.attr.circularflow_viewCenter,
            R.attr.constraintSet,
            R.attr.constraint_referenced_ids,
            R.attr.constraint_referenced_tags,
            R.attr.flow_firstHorizontalBias,
            R.attr.flow_firstHorizontalStyle,
            R.attr.flow_firstVerticalBias,
            R.attr.flow_firstVerticalStyle,
            R.attr.flow_horizontalAlign,
            R.attr.flow_horizontalBias,
            R.attr.flow_horizontalGap,
            R.attr.flow_horizontalStyle,
            R.attr.flow_lastHorizontalBias,
            R.attr.flow_lastHorizontalStyle,
            R.attr.flow_lastVerticalBias,
            R.attr.flow_lastVerticalStyle,
            R.attr.flow_maxElementsWrap,
            R.attr.flow_verticalAlign,
            R.attr.flow_verticalBias,
            R.attr.flow_verticalGap,
            R.attr.flow_verticalStyle,
            R.attr.flow_wrapMode,
            R.attr.guidelineUseRtl,
            R.attr.layoutDescription,
            R.attr.layout_constrainedHeight,
            R.attr.layout_constrainedWidth,
            R.attr.layout_constraintBaseline_creator,
            R.attr.layout_constraintBaseline_toBaselineOf,
            R.attr.layout_constraintBaseline_toBottomOf,
            R.attr.layout_constraintBaseline_toTopOf,
            R.attr.layout_constraintBottom_creator,
            R.attr.layout_constraintBottom_toBottomOf,
            R.attr.layout_constraintBottom_toTopOf,
            R.attr.layout_constraintCircle,
            R.attr.layout_constraintCircleAngle,
            R.attr.layout_constraintCircleRadius,
            R.attr.layout_constraintDimensionRatio,
            R.attr.layout_constraintEnd_toEndOf,
            R.attr.layout_constraintEnd_toStartOf,
            R.attr.layout_constraintGuide_begin,
            R.attr.layout_constraintGuide_end,
            R.attr.layout_constraintGuide_percent,
            R.attr.layout_constraintHeight,
            R.attr.layout_constraintHeight_default,
            R.attr.layout_constraintHeight_max,
            R.attr.layout_constraintHeight_min,
            R.attr.layout_constraintHeight_percent,
            R.attr.layout_constraintHorizontal_bias,
            R.attr.layout_constraintHorizontal_chainStyle,
            R.attr.layout_constraintHorizontal_weight,
            R.attr.layout_constraintLeft_creator,
            R.attr.layout_constraintLeft_toLeftOf,
            R.attr.layout_constraintLeft_toRightOf,
            R.attr.layout_constraintRight_creator,
            R.attr.layout_constraintRight_toLeftOf,
            R.attr.layout_constraintRight_toRightOf,
            R.attr.layout_constraintStart_toEndOf,
            R.attr.layout_constraintStart_toStartOf,
            R.attr.layout_constraintTag,
            R.attr.layout_constraintTop_creator,
            R.attr.layout_constraintTop_toBottomOf,
            R.attr.layout_constraintTop_toTopOf,
            R.attr.layout_constraintVertical_bias,
            R.attr.layout_constraintVertical_chainStyle,
            R.attr.layout_constraintVertical_weight,
            R.attr.layout_constraintWidth,
            R.attr.layout_constraintWidth_default,
            R.attr.layout_constraintWidth_max,
            R.attr.layout_constraintWidth_min,
            R.attr.layout_constraintWidth_percent,
            R.attr.layout_editor_absoluteX,
            R.attr.layout_editor_absoluteY,
            R.attr.layout_goneMarginBaseline,
            R.attr.layout_goneMarginBottom,
            R.attr.layout_goneMarginEnd,
            R.attr.layout_goneMarginLeft,
            R.attr.layout_goneMarginRight,
            R.attr.layout_goneMarginStart,
            R.attr.layout_goneMarginTop,
            R.attr.layout_marginBaseline,
            R.attr.layout_optimizationLevel,
            R.attr.layout_wrapBehaviorInParent
        )
        val ConstraintLayout_ReactiveGuide = intArrayOf(
            R.attr.reactiveGuide_animateChange,
            R.attr.reactiveGuide_applyToAllConstraintSets,
            R.attr.reactiveGuide_applyToConstraintSet,
            R.attr.reactiveGuide_valueId
        )
        val ConstraintLayout_placeholder =
            intArrayOf(R.attr.content, R.attr.placeholder_emptyVisibility)
        val ConstraintOverride = intArrayOf(
            16842948,
            16842960,
            16842972,
            16842996,
            16842997,
            16842999,
            16843000,
            16843001,
            16843002,
            16843039,
            16843040,
            16843071,
            16843072,
            16843551,
            16843552,
            16843553,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843701,
            16843702,
            16843770,
            16843840,
            R.attr.animateCircleAngleTo,
            R.attr.animateRelativeTo,
            R.attr.barrierAllowsGoneWidgets,
            R.attr.barrierDirection,
            R.attr.barrierMargin,
            R.attr.chainUseRtl,
            R.attr.constraint_referenced_ids,
            R.attr.drawPath,
            R.attr.flow_firstHorizontalBias,
            R.attr.flow_firstHorizontalStyle,
            R.attr.flow_firstVerticalBias,
            R.attr.flow_firstVerticalStyle,
            R.attr.flow_horizontalAlign,
            R.attr.flow_horizontalBias,
            R.attr.flow_horizontalGap,
            R.attr.flow_horizontalStyle,
            R.attr.flow_lastHorizontalBias,
            R.attr.flow_lastHorizontalStyle,
            R.attr.flow_lastVerticalBias,
            R.attr.flow_lastVerticalStyle,
            R.attr.flow_maxElementsWrap,
            R.attr.flow_verticalAlign,
            R.attr.flow_verticalBias,
            R.attr.flow_verticalGap,
            R.attr.flow_verticalStyle,
            R.attr.flow_wrapMode,
            R.attr.guidelineUseRtl,
            R.attr.layout_constrainedHeight,
            R.attr.layout_constrainedWidth,
            R.attr.layout_constraintBaseline_creator,
            R.attr.layout_constraintBottom_creator,
            R.attr.layout_constraintCircleAngle,
            R.attr.layout_constraintCircleRadius,
            R.attr.layout_constraintDimensionRatio,
            R.attr.layout_constraintGuide_begin,
            R.attr.layout_constraintGuide_end,
            R.attr.layout_constraintGuide_percent,
            R.attr.layout_constraintHeight,
            R.attr.layout_constraintHeight_default,
            R.attr.layout_constraintHeight_max,
            R.attr.layout_constraintHeight_min,
            R.attr.layout_constraintHeight_percent,
            R.attr.layout_constraintHorizontal_bias,
            R.attr.layout_constraintHorizontal_chainStyle,
            R.attr.layout_constraintHorizontal_weight,
            R.attr.layout_constraintLeft_creator,
            R.attr.layout_constraintRight_creator,
            R.attr.layout_constraintTag,
            R.attr.layout_constraintTop_creator,
            R.attr.layout_constraintVertical_bias,
            R.attr.layout_constraintVertical_chainStyle,
            R.attr.layout_constraintVertical_weight,
            R.attr.layout_constraintWidth,
            R.attr.layout_constraintWidth_default,
            R.attr.layout_constraintWidth_max,
            R.attr.layout_constraintWidth_min,
            R.attr.layout_constraintWidth_percent,
            R.attr.layout_editor_absoluteX,
            R.attr.layout_editor_absoluteY,
            R.attr.layout_goneMarginBaseline,
            R.attr.layout_goneMarginBottom,
            R.attr.layout_goneMarginEnd,
            R.attr.layout_goneMarginLeft,
            R.attr.layout_goneMarginRight,
            R.attr.layout_goneMarginStart,
            R.attr.layout_goneMarginTop,
            R.attr.layout_marginBaseline,
            R.attr.layout_wrapBehaviorInParent,
            R.attr.motionProgress,
            R.attr.motionStagger,
            R.attr.motionTarget,
            R.attr.pathMotionArc,
            R.attr.pivotAnchor,
            R.attr.polarRelativeTo,
            R.attr.quantizeMotionInterpolator,
            R.attr.quantizeMotionPhase,
            R.attr.quantizeMotionSteps,
            R.attr.transformPivotTarget,
            R.attr.transitionEasing,
            R.attr.transitionPathRotate,
            R.attr.visibilityMode
        )
        val ConstraintSet = intArrayOf(
            16842948,
            16842960,
            16842972,
            16842996,
            16842997,
            16842999,
            16843000,
            16843001,
            16843002,
            16843039,
            16843040,
            16843071,
            16843072,
            16843189,
            16843190,
            16843551,
            16843552,
            16843553,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843701,
            16843702,
            16843770,
            16843840,
            R.attr.animateCircleAngleTo,
            R.attr.animateRelativeTo,
            R.attr.barrierAllowsGoneWidgets,
            R.attr.barrierDirection,
            R.attr.barrierMargin,
            R.attr.chainUseRtl,
            R.attr.constraintRotate,
            R.attr.constraint_referenced_ids,
            R.attr.constraint_referenced_tags,
            R.attr.deriveConstraintsFrom,
            R.attr.drawPath,
            R.attr.flow_firstHorizontalBias,
            R.attr.flow_firstHorizontalStyle,
            R.attr.flow_firstVerticalBias,
            R.attr.flow_firstVerticalStyle,
            R.attr.flow_horizontalAlign,
            R.attr.flow_horizontalBias,
            R.attr.flow_horizontalGap,
            R.attr.flow_horizontalStyle,
            R.attr.flow_lastHorizontalBias,
            R.attr.flow_lastHorizontalStyle,
            R.attr.flow_lastVerticalBias,
            R.attr.flow_lastVerticalStyle,
            R.attr.flow_maxElementsWrap,
            R.attr.flow_verticalAlign,
            R.attr.flow_verticalBias,
            R.attr.flow_verticalGap,
            R.attr.flow_verticalStyle,
            R.attr.flow_wrapMode,
            R.attr.guidelineUseRtl,
            R.attr.layout_constrainedHeight,
            R.attr.layout_constrainedWidth,
            R.attr.layout_constraintBaseline_creator,
            R.attr.layout_constraintBaseline_toBaselineOf,
            R.attr.layout_constraintBaseline_toBottomOf,
            R.attr.layout_constraintBaseline_toTopOf,
            R.attr.layout_constraintBottom_creator,
            R.attr.layout_constraintBottom_toBottomOf,
            R.attr.layout_constraintBottom_toTopOf,
            R.attr.layout_constraintCircle,
            R.attr.layout_constraintCircleAngle,
            R.attr.layout_constraintCircleRadius,
            R.attr.layout_constraintDimensionRatio,
            R.attr.layout_constraintEnd_toEndOf,
            R.attr.layout_constraintEnd_toStartOf,
            R.attr.layout_constraintGuide_begin,
            R.attr.layout_constraintGuide_end,
            R.attr.layout_constraintGuide_percent,
            R.attr.layout_constraintHeight_default,
            R.attr.layout_constraintHeight_max,
            R.attr.layout_constraintHeight_min,
            R.attr.layout_constraintHeight_percent,
            R.attr.layout_constraintHorizontal_bias,
            R.attr.layout_constraintHorizontal_chainStyle,
            R.attr.layout_constraintHorizontal_weight,
            R.attr.layout_constraintLeft_creator,
            R.attr.layout_constraintLeft_toLeftOf,
            R.attr.layout_constraintLeft_toRightOf,
            R.attr.layout_constraintRight_creator,
            R.attr.layout_constraintRight_toLeftOf,
            R.attr.layout_constraintRight_toRightOf,
            R.attr.layout_constraintStart_toEndOf,
            R.attr.layout_constraintStart_toStartOf,
            R.attr.layout_constraintTag,
            R.attr.layout_constraintTop_creator,
            R.attr.layout_constraintTop_toBottomOf,
            R.attr.layout_constraintTop_toTopOf,
            R.attr.layout_constraintVertical_bias,
            R.attr.layout_constraintVertical_chainStyle,
            R.attr.layout_constraintVertical_weight,
            R.attr.layout_constraintWidth_default,
            R.attr.layout_constraintWidth_max,
            R.attr.layout_constraintWidth_min,
            R.attr.layout_constraintWidth_percent,
            R.attr.layout_editor_absoluteX,
            R.attr.layout_editor_absoluteY,
            R.attr.layout_goneMarginBaseline,
            R.attr.layout_goneMarginBottom,
            R.attr.layout_goneMarginEnd,
            R.attr.layout_goneMarginLeft,
            R.attr.layout_goneMarginRight,
            R.attr.layout_goneMarginStart,
            R.attr.layout_goneMarginTop,
            R.attr.layout_marginBaseline,
            R.attr.layout_wrapBehaviorInParent,
            R.attr.motionProgress,
            R.attr.motionStagger,
            R.attr.pathMotionArc,
            R.attr.pivotAnchor,
            R.attr.polarRelativeTo,
            R.attr.quantizeMotionSteps,
            R.attr.transitionEasing,
            R.attr.transitionPathRotate
        )
        val CoordinatorLayout = intArrayOf(R.attr.keylines, R.attr.statusBarBackground)
        val CoordinatorLayout_Layout = intArrayOf(
            16842931,
            R.attr.layout_anchor,
            R.attr.layout_anchorGravity,
            R.attr.layout_behavior,
            R.attr.layout_dodgeInsetEdges,
            R.attr.layout_insetEdge,
            R.attr.layout_keyline
        )
        val CustomAttribute = intArrayOf(
            R.attr.attributeName,
            R.attr.customBoolean,
            R.attr.customColorDrawableValue,
            R.attr.customColorValue,
            R.attr.customDimension,
            R.attr.customFloatValue,
            R.attr.customIntegerValue,
            R.attr.customPixelDimension,
            R.attr.customReference,
            R.attr.customStringValue,
            R.attr.methodName
        )
        @kotlin.jvm.JvmField
        val CustomCast = intArrayOf(R.attr.customCastBackgroundColor)
        val CustomCastTheme = intArrayOf(
            R.attr.castExpandedControllerStyle,
            R.attr.castIntroOverlayStyle,
            R.attr.castMiniControllerStyle
        )
        val DefaultTimeBar = intArrayOf(
            R.attr.ad_marker_color,
            R.attr.ad_marker_width,
            R.attr.bar_gravity,
            R.attr.bar_height,
            R.attr.buffered_color,
            R.attr.played_ad_marker_color,
            R.attr.played_color,
            R.attr.scrubber_color,
            R.attr.scrubber_disabled_size,
            R.attr.scrubber_dragged_size,
            R.attr.scrubber_drawable,
            R.attr.scrubber_enabled_size,
            R.attr.touch_target_height,
            R.attr.unplayed_color
        )
        val DialogFragmentNavigator = intArrayOf(16842755)
        val DialogPreference = intArrayOf(
            16843250,
            16843251,
            16843252,
            16843253,
            16843254,
            16843255,
            R.attr.dialogIcon,
            R.attr.dialogLayout,
            R.attr.dialogMessage,
            R.attr.dialogTitle,
            R.attr.negativeButtonText,
            R.attr.positiveButtonText
        )
        val DrawerArrowToggle = intArrayOf(
            R.attr.arrowHeadLength,
            R.attr.arrowShaftLength,
            R.attr.barLength,
            R.attr.color,
            R.attr.drawableSize,
            R.attr.gapBetweenBars,
            R.attr.spinBars,
            R.attr.thickness
        )
        val DrawerLayout = intArrayOf(R.attr.elevation)
        val EditTextPreference = intArrayOf(R.attr.useSimpleSummaryProvider)
        val ExtendedFloatingActionButton = intArrayOf(
            R.attr.collapsedSize,
            R.attr.elevation,
            R.attr.extendMotionSpec,
            R.attr.hideMotionSpec,
            R.attr.showMotionSpec,
            R.attr.shrinkMotionSpec
        )
        val ExtendedFloatingActionButton_Behavior_Layout =
            intArrayOf(R.attr.behavior_autoHide, R.attr.behavior_autoShrink)
        val FloatingActionButton = intArrayOf(
            16842766,
            R.attr.backgroundTint,
            R.attr.backgroundTintMode,
            R.attr.borderWidth,
            R.attr.elevation,
            R.attr.ensureMinTouchTargetSize,
            R.attr.fabCustomSize,
            R.attr.fabSize,
            R.attr.hideMotionSpec,
            R.attr.hoveredFocusedTranslationZ,
            R.attr.maxImageSize,
            R.attr.pressedTranslationZ,
            R.attr.rippleColor,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.showMotionSpec,
            R.attr.useCompatPadding
        )
        val FloatingActionButton_Behavior_Layout = intArrayOf(R.attr.behavior_autoHide)
        val FlowLayout = intArrayOf(R.attr.itemSpacing, R.attr.lineSpacing)
        @kotlin.jvm.JvmField
        val FlowLayout_Layout = intArrayOf(R.attr.itemSpacing)
        val FlowLayout_Layout_layout_space = IntArray(0)
        val FontFamily = intArrayOf(
            R.attr.fontProviderAuthority,
            R.attr.fontProviderCerts,
            R.attr.fontProviderFetchStrategy,
            R.attr.fontProviderFetchTimeout,
            R.attr.fontProviderPackage,
            R.attr.fontProviderQuery,
            R.attr.fontProviderSystemFontFamily
        )
        val FontFamilyFont = intArrayOf(
            16844082,
            16844083,
            16844095,
            16844143,
            16844144,
            R.attr.font,
            R.attr.fontStyle,
            R.attr.fontVariationSettings,
            R.attr.fontWeight,
            R.attr.ttcIndex
        )
        val ForegroundLinearLayout = intArrayOf(16843017, 16843264, R.attr.foregroundInsidePadding)
        val Fragment = intArrayOf(16842755, 16842960, 16842961)
        val FragmentContainerView = intArrayOf(16842755, 16842961)
        val FragmentNavigator = intArrayOf(16842755)
        val GradientColor = intArrayOf(
            16843165,
            16843166,
            16843169,
            16843170,
            16843171,
            16843172,
            16843265,
            16843275,
            16844048,
            16844049,
            16844050,
            16844051
        )
        val GradientColorItem = intArrayOf(16843173, 16844052)
        val ImageFilterView = intArrayOf(
            R.attr.altSrc,
            R.attr.blendSrc,
            R.attr.brightness,
            R.attr.contrast,
            R.attr.crossfade,
            R.attr.imagePanX,
            R.attr.imagePanY,
            R.attr.imageRotate,
            R.attr.imageZoom,
            R.attr.overlay,
            R.attr.round,
            R.attr.roundPercent,
            R.attr.saturation,
            R.attr.warmth
        )
        val Insets = intArrayOf(
            R.attr.paddingBottomSystemWindowInsets,
            R.attr.paddingLeftSystemWindowInsets,
            R.attr.paddingRightSystemWindowInsets,
            R.attr.paddingTopSystemWindowInsets
        )
        val KeyAttribute = intArrayOf(
            16843551,
            16843552,
            16843553,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843770,
            16843840,
            R.attr.curveFit,
            R.attr.framePosition,
            R.attr.motionProgress,
            R.attr.motionTarget,
            R.attr.transformPivotTarget,
            R.attr.transitionEasing,
            R.attr.transitionPathRotate
        )
        val KeyCycle = intArrayOf(
            16843551,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843770,
            16843840,
            R.attr.curveFit,
            R.attr.framePosition,
            R.attr.motionProgress,
            R.attr.motionTarget,
            R.attr.transitionEasing,
            R.attr.transitionPathRotate,
            R.attr.waveOffset,
            R.attr.wavePeriod,
            R.attr.wavePhase,
            R.attr.waveShape,
            R.attr.waveVariesBy
        )
        val KeyFrame = IntArray(0)
        val KeyFramesAcceleration = IntArray(0)
        val KeyFramesVelocity = IntArray(0)
        val KeyPosition = intArrayOf(
            R.attr.curveFit,
            R.attr.drawPath,
            R.attr.framePosition,
            R.attr.keyPositionType,
            R.attr.motionTarget,
            R.attr.pathMotionArc,
            R.attr.percentHeight,
            R.attr.percentWidth,
            R.attr.percentX,
            R.attr.percentY,
            R.attr.sizePercent,
            R.attr.transitionEasing
        )
        val KeyTimeCycle = intArrayOf(
            16843551,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843770,
            16843840,
            R.attr.curveFit,
            R.attr.framePosition,
            R.attr.motionProgress,
            R.attr.motionTarget,
            R.attr.transitionEasing,
            R.attr.transitionPathRotate,
            R.attr.waveDecay,
            R.attr.waveOffset,
            R.attr.wavePeriod,
            R.attr.wavePhase,
            R.attr.waveShape
        )
        val KeyTrigger = intArrayOf(
            R.attr.framePosition,
            R.attr.motionTarget,
            R.attr.motion_postLayoutCollision,
            R.attr.motion_triggerOnCollision,
            R.attr.onCross,
            R.attr.onNegativeCross,
            R.attr.onPositiveCross,
            R.attr.triggerId,
            R.attr.triggerReceiver,
            R.attr.triggerSlack,
            R.attr.viewTransitionOnCross,
            R.attr.viewTransitionOnNegativeCross,
            R.attr.viewTransitionOnPositiveCross
        )
        val Layout = intArrayOf(
            16842948,
            16842996,
            16842997,
            16842999,
            16843000,
            16843001,
            16843002,
            16843701,
            16843702,
            R.attr.barrierAllowsGoneWidgets,
            R.attr.barrierDirection,
            R.attr.barrierMargin,
            R.attr.chainUseRtl,
            R.attr.constraint_referenced_ids,
            R.attr.constraint_referenced_tags,
            R.attr.guidelineUseRtl,
            R.attr.layout_constrainedHeight,
            R.attr.layout_constrainedWidth,
            R.attr.layout_constraintBaseline_creator,
            R.attr.layout_constraintBaseline_toBaselineOf,
            R.attr.layout_constraintBaseline_toBottomOf,
            R.attr.layout_constraintBaseline_toTopOf,
            R.attr.layout_constraintBottom_creator,
            R.attr.layout_constraintBottom_toBottomOf,
            R.attr.layout_constraintBottom_toTopOf,
            R.attr.layout_constraintCircle,
            R.attr.layout_constraintCircleAngle,
            R.attr.layout_constraintCircleRadius,
            R.attr.layout_constraintDimensionRatio,
            R.attr.layout_constraintEnd_toEndOf,
            R.attr.layout_constraintEnd_toStartOf,
            R.attr.layout_constraintGuide_begin,
            R.attr.layout_constraintGuide_end,
            R.attr.layout_constraintGuide_percent,
            R.attr.layout_constraintHeight,
            R.attr.layout_constraintHeight_default,
            R.attr.layout_constraintHeight_max,
            R.attr.layout_constraintHeight_min,
            R.attr.layout_constraintHeight_percent,
            R.attr.layout_constraintHorizontal_bias,
            R.attr.layout_constraintHorizontal_chainStyle,
            R.attr.layout_constraintHorizontal_weight,
            R.attr.layout_constraintLeft_creator,
            R.attr.layout_constraintLeft_toLeftOf,
            R.attr.layout_constraintLeft_toRightOf,
            R.attr.layout_constraintRight_creator,
            R.attr.layout_constraintRight_toLeftOf,
            R.attr.layout_constraintRight_toRightOf,
            R.attr.layout_constraintStart_toEndOf,
            R.attr.layout_constraintStart_toStartOf,
            R.attr.layout_constraintTop_creator,
            R.attr.layout_constraintTop_toBottomOf,
            R.attr.layout_constraintTop_toTopOf,
            R.attr.layout_constraintVertical_bias,
            R.attr.layout_constraintVertical_chainStyle,
            R.attr.layout_constraintVertical_weight,
            R.attr.layout_constraintWidth,
            R.attr.layout_constraintWidth_default,
            R.attr.layout_constraintWidth_max,
            R.attr.layout_constraintWidth_min,
            R.attr.layout_constraintWidth_percent,
            R.attr.layout_editor_absoluteX,
            R.attr.layout_editor_absoluteY,
            R.attr.layout_goneMarginBaseline,
            R.attr.layout_goneMarginBottom,
            R.attr.layout_goneMarginEnd,
            R.attr.layout_goneMarginLeft,
            R.attr.layout_goneMarginRight,
            R.attr.layout_goneMarginStart,
            R.attr.layout_goneMarginTop,
            R.attr.layout_marginBaseline,
            R.attr.layout_wrapBehaviorInParent,
            R.attr.maxHeight,
            R.attr.maxWidth,
            R.attr.minHeight,
            R.attr.minWidth
        )
        val LinearLayoutCompat = intArrayOf(
            16842927,
            16842948,
            16843046,
            16843047,
            16843048,
            R.attr.divider,
            R.attr.dividerPadding,
            R.attr.measureWithLargestChild,
            R.attr.showDividers
        )
        val LinearLayoutCompat_Layout = intArrayOf(16842931, 16842996, 16842997, 16843137)
        val LinearProgressIndicator =
            intArrayOf(R.attr.indeterminateAnimationType, R.attr.indicatorDirectionLinear)
        val ListPopupWindow = intArrayOf(16843436, 16843437)
        val ListPreference = intArrayOf(
            16842930,
            16843256,
            R.attr.entries,
            R.attr.entryValues,
            R.attr.useSimpleSummaryProvider
        )
        val LoadingImageView =
            intArrayOf(R.attr.circleCrop, R.attr.imageAspectRatio, R.attr.imageAspectRatioAdjust)
        val LottieAnimationView = intArrayOf(
            R.attr.lottie_autoPlay,
            R.attr.lottie_cacheComposition,
            R.attr.lottie_colorFilter,
            R.attr.lottie_enableMergePathsForKitKatAndAbove,
            R.attr.lottie_fallbackRes,
            R.attr.lottie_fileName,
            R.attr.lottie_imageAssetsFolder,
            R.attr.lottie_loop,
            R.attr.lottie_progress,
            R.attr.lottie_rawRes,
            R.attr.lottie_renderMode,
            R.attr.lottie_repeatCount,
            R.attr.lottie_repeatMode,
            R.attr.lottie_scale,
            R.attr.lottie_speed,
            R.attr.lottie_url
        )
        val MainColors = intArrayOf(
            R.attr.boxItemBackground,
            R.attr.colorOngoing,
            R.attr.colorPrimary,
            R.attr.colorPrimaryDark,
            R.attr.colorSearch,
            R.attr.grayTextColor,
            R.attr.iconColor,
            R.attr.iconGrayBackground,
            R.attr.primaryBlackBackground,
            R.attr.primaryGrayBackground,
            R.attr.textColor,
            R.attr.white
        )
        val MaterialAlertDialog = intArrayOf(
            R.attr.backgroundInsetBottom,
            R.attr.backgroundInsetEnd,
            R.attr.backgroundInsetStart,
            R.attr.backgroundInsetTop
        )
        val MaterialAlertDialogTheme = intArrayOf(
            R.attr.materialAlertDialogBodyTextStyle,
            R.attr.materialAlertDialogButtonSpacerVisibility,
            R.attr.materialAlertDialogTheme,
            R.attr.materialAlertDialogTitleIconStyle,
            R.attr.materialAlertDialogTitlePanelStyle,
            R.attr.materialAlertDialogTitleTextStyle
        )
        val MaterialAutoCompleteTextView = intArrayOf(16843296)
        val MaterialButton = intArrayOf(
            16842964,
            16843191,
            16843192,
            16843193,
            16843194,
            16843237,
            R.attr.backgroundTint,
            R.attr.backgroundTintMode,
            R.attr.cornerRadius,
            R.attr.elevation,
            R.attr.icon,
            R.attr.iconGravity,
            R.attr.iconPadding,
            R.attr.iconSize,
            R.attr.iconTint,
            R.attr.iconTintMode,
            R.attr.rippleColor,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.strokeColor,
            R.attr.strokeWidth
        )
        val MaterialButtonToggleGroup =
            intArrayOf(R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection)
        val MaterialCalendar = intArrayOf(
            16843277,
            R.attr.dayInvalidStyle,
            R.attr.daySelectedStyle,
            R.attr.dayStyle,
            R.attr.dayTodayStyle,
            R.attr.nestedScrollable,
            R.attr.rangeFillColor,
            R.attr.yearSelectedStyle,
            R.attr.yearStyle,
            R.attr.yearTodayStyle
        )
        val MaterialCalendarItem = intArrayOf(
            16843191,
            16843192,
            16843193,
            16843194,
            R.attr.itemFillColor,
            R.attr.itemShapeAppearance,
            R.attr.itemShapeAppearanceOverlay,
            R.attr.itemStrokeColor,
            R.attr.itemStrokeWidth,
            R.attr.itemTextColor
        )
        val MaterialCardView = intArrayOf(
            16843237,
            R.attr.cardForegroundColor,
            R.attr.checkedIcon,
            R.attr.checkedIconMargin,
            R.attr.checkedIconSize,
            R.attr.checkedIconTint,
            R.attr.rippleColor,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.state_dragged,
            R.attr.strokeColor,
            R.attr.strokeWidth
        )
        val MaterialCheckBox = intArrayOf(R.attr.buttonTint, R.attr.useMaterialThemeColors)
        val MaterialDivider = intArrayOf(
            R.attr.dividerColor,
            R.attr.dividerInsetEnd,
            R.attr.dividerInsetStart,
            R.attr.dividerThickness
        )
        val MaterialRadioButton = intArrayOf(R.attr.buttonTint, R.attr.useMaterialThemeColors)
        val MaterialShape = intArrayOf(R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay)
        val MaterialTextAppearance = intArrayOf(16843958, 16844159, R.attr.lineHeight)
        val MaterialTextView = intArrayOf(16842804, 16844159, R.attr.lineHeight)
        val MaterialTimePicker = intArrayOf(R.attr.clockIcon, R.attr.keyboardIcon)
        val MaterialToolbar =
            intArrayOf(R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered)
        val MediaRouteButton = intArrayOf(
            16843071,
            16843072,
            R.attr.externalRouteEnabledDrawable,
            R.attr.externalRouteEnabledDrawableStatic,
            R.attr.mediaRouteButtonTint
        )
        val MenuGroup = intArrayOf(16842766, 16842960, 16843156, 16843230, 16843231, 16843232)
        val MenuItem = intArrayOf(
            16842754,
            16842766,
            16842960,
            16843014,
            16843156,
            16843230,
            16843231,
            16843233,
            16843234,
            16843235,
            16843236,
            16843237,
            16843375,
            R.attr.actionLayout,
            R.attr.actionProviderClass,
            R.attr.actionViewClass,
            R.attr.alphabeticModifiers,
            R.attr.contentDescription,
            R.attr.iconTint,
            R.attr.iconTintMode,
            R.attr.numericModifiers,
            R.attr.showAsAction,
            R.attr.tooltipText
        )
        val MenuView = intArrayOf(
            16842926,
            16843052,
            16843053,
            16843054,
            16843055,
            16843056,
            16843057,
            R.attr.preserveIconSpacing,
            R.attr.subMenuArrow
        )
        val MockView = intArrayOf(
            R.attr.mock_diagonalsColor,
            R.attr.mock_label,
            R.attr.mock_labelBackgroundColor,
            R.attr.mock_labelColor,
            R.attr.mock_showDiagonals,
            R.attr.mock_showLabel
        )
        val Motion = intArrayOf(
            R.attr.animateCircleAngleTo,
            R.attr.animateRelativeTo,
            R.attr.drawPath,
            R.attr.motionPathRotate,
            R.attr.motionStagger,
            R.attr.pathMotionArc,
            R.attr.quantizeMotionInterpolator,
            R.attr.quantizeMotionPhase,
            R.attr.quantizeMotionSteps,
            R.attr.transitionEasing
        )
        val MotionEffect = intArrayOf(
            R.attr.motionEffect_alpha,
            R.attr.motionEffect_end,
            R.attr.motionEffect_move,
            R.attr.motionEffect_start,
            R.attr.motionEffect_strict,
            R.attr.motionEffect_translationX,
            R.attr.motionEffect_translationY,
            R.attr.motionEffect_viewTransition
        )
        val MotionHelper = intArrayOf(R.attr.onHide, R.attr.onShow)
        val MotionLabel = intArrayOf(
            16842901,
            16842902,
            16842903,
            16842904,
            16842927,
            16843087,
            16843108,
            16843692,
            16844085,
            R.attr.borderRound,
            R.attr.borderRoundPercent,
            R.attr.scaleFromTextSize,
            R.attr.textBackground,
            R.attr.textBackgroundPanX,
            R.attr.textBackgroundPanY,
            R.attr.textBackgroundRotate,
            R.attr.textBackgroundZoom,
            R.attr.textOutlineColor,
            R.attr.textOutlineThickness,
            R.attr.textPanX,
            R.attr.textPanY,
            R.attr.textureBlurFactor,
            R.attr.textureEffect,
            R.attr.textureHeight,
            R.attr.textureWidth
        )
        val MotionLayout = intArrayOf(
            R.attr.applyMotionScene,
            R.attr.currentState,
            R.attr.layoutDescription,
            R.attr.motionDebug,
            R.attr.motionProgress,
            R.attr.showPaths
        )
        val MotionScene = intArrayOf(R.attr.defaultDuration, R.attr.layoutDuringTransition)
        val MotionTelltales = intArrayOf(
            R.attr.telltales_tailColor,
            R.attr.telltales_tailScale,
            R.attr.telltales_velocityMode
        )
        val MultiSelectListPreference =
            intArrayOf(16842930, 16843256, R.attr.entries, R.attr.entryValues)
        val NavAction = intArrayOf(
            16842960,
            R.attr.destination,
            R.attr.enterAnim,
            R.attr.exitAnim,
            R.attr.launchSingleTop,
            R.attr.popEnterAnim,
            R.attr.popExitAnim,
            R.attr.popUpTo,
            R.attr.popUpToInclusive,
            R.attr.popUpToSaveState,
            R.attr.restoreState
        )
        val NavArgument = intArrayOf(16842755, 16843245, R.attr.argType, R.attr.nullable)
        val NavDeepLink = intArrayOf(16844014, R.attr.action, R.attr.mimeType, R.attr.uri)
        val NavGraphNavigator = intArrayOf(R.attr.startDestination)
        val NavHost = intArrayOf(R.attr.navGraph)
        val NavHostFragment = intArrayOf(R.attr.defaultNavHost)
        val NavInclude = intArrayOf(R.attr.graph)
        val NavigationBarActiveIndicator = intArrayOf(
            16843093,
            16843097,
            16843173,
            R.attr.marginHorizontal,
            R.attr.shapeAppearance
        )
        val NavigationBarView = intArrayOf(
            R.attr.backgroundTint,
            R.attr.elevation,
            R.attr.itemActiveIndicatorStyle,
            R.attr.itemBackground,
            R.attr.itemIconSize,
            R.attr.itemIconTint,
            R.attr.itemPaddingBottom,
            R.attr.itemPaddingTop,
            R.attr.itemRippleColor,
            R.attr.itemTextAppearanceActive,
            R.attr.itemTextAppearanceInactive,
            R.attr.itemTextColor,
            R.attr.labelVisibilityMode,
            R.attr.menu
        )
        val NavigationRailView =
            intArrayOf(R.attr.headerLayout, R.attr.itemMinHeight, R.attr.menuGravity)
        val NavigationView = intArrayOf(
            16842931,
            16842964,
            16842973,
            16843039,
            R.attr.bottomInsetScrimEnabled,
            R.attr.dividerInsetEnd,
            R.attr.dividerInsetStart,
            R.attr.drawerLayoutCornerSize,
            R.attr.elevation,
            R.attr.headerLayout,
            R.attr.itemBackground,
            R.attr.itemHorizontalPadding,
            R.attr.itemIconPadding,
            R.attr.itemIconSize,
            R.attr.itemIconTint,
            R.attr.itemMaxLines,
            R.attr.itemShapeAppearance,
            R.attr.itemShapeAppearanceOverlay,
            R.attr.itemShapeFillColor,
            R.attr.itemShapeInsetBottom,
            R.attr.itemShapeInsetEnd,
            R.attr.itemShapeInsetStart,
            R.attr.itemShapeInsetTop,
            R.attr.itemTextAppearance,
            R.attr.itemTextColor,
            R.attr.itemVerticalPadding,
            R.attr.menu,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.subheaderColor,
            R.attr.subheaderInsetEnd,
            R.attr.subheaderInsetStart,
            R.attr.subheaderTextAppearance,
            R.attr.topInsetScrimEnabled
        )
        val Navigator = intArrayOf(16842753, 16842960, R.attr.route)
        val OnClick = intArrayOf(R.attr.clickAction, R.attr.targetId)
        val OnSwipe = intArrayOf(
            R.attr.autoCompleteMode,
            R.attr.dragDirection,
            R.attr.dragScale,
            R.attr.dragThreshold,
            R.attr.limitBoundsTo,
            R.attr.maxAcceleration,
            R.attr.maxVelocity,
            R.attr.moveWhenScrollAtTop,
            R.attr.nestedScrollFlags,
            R.attr.onTouchUp,
            R.attr.rotationCenterId,
            R.attr.springBoundary,
            R.attr.springDamping,
            R.attr.springMass,
            R.attr.springStiffness,
            R.attr.springStopThreshold,
            R.attr.touchAnchorId,
            R.attr.touchAnchorSide,
            R.attr.touchRegionId
        )
        val OverlappingPanelsLayout = intArrayOf(R.attr.maxSidePanelNonFullScreenWidth)
        val PlayerControlView = intArrayOf(
            R.attr.ad_marker_color,
            R.attr.ad_marker_width,
            R.attr.bar_gravity,
            R.attr.bar_height,
            R.attr.buffered_color,
            R.attr.controller_layout_id,
            R.attr.played_ad_marker_color,
            R.attr.played_color,
            R.attr.repeat_toggle_modes,
            R.attr.scrubber_color,
            R.attr.scrubber_disabled_size,
            R.attr.scrubber_dragged_size,
            R.attr.scrubber_drawable,
            R.attr.scrubber_enabled_size,
            R.attr.show_fastforward_button,
            R.attr.show_next_button,
            R.attr.show_previous_button,
            R.attr.show_rewind_button,
            R.attr.show_shuffle_button,
            R.attr.show_timeout,
            R.attr.time_bar_min_update_interval,
            R.attr.touch_target_height,
            R.attr.unplayed_color
        )
        val PlayerView = intArrayOf(
            R.attr.ad_marker_color,
            R.attr.ad_marker_width,
            R.attr.auto_show,
            R.attr.bar_height,
            R.attr.buffered_color,
            R.attr.controller_layout_id,
            R.attr.default_artwork,
            R.attr.hide_during_ads,
            R.attr.hide_on_touch,
            R.attr.keep_content_on_player_reset,
            R.attr.played_ad_marker_color,
            R.attr.played_color,
            R.attr.player_layout_id,
            R.attr.repeat_toggle_modes,
            R.attr.resize_mode,
            R.attr.scrubber_color,
            R.attr.scrubber_disabled_size,
            R.attr.scrubber_dragged_size,
            R.attr.scrubber_drawable,
            R.attr.scrubber_enabled_size,
            R.attr.show_buffering,
            R.attr.show_shuffle_button,
            R.attr.show_timeout,
            R.attr.shutter_background_color,
            R.attr.surface_type,
            R.attr.time_bar_min_update_interval,
            R.attr.touch_target_height,
            R.attr.unplayed_color,
            R.attr.use_artwork,
            R.attr.use_controller
        )
        val PopupWindow = intArrayOf(16843126, 16843465, R.attr.overlapAnchor)
        val PopupWindowBackgroundState = intArrayOf(R.attr.state_above_anchor)
        val Preference = intArrayOf(
            16842754,
            16842765,
            16842766,
            16842994,
            16843233,
            16843238,
            16843240,
            16843241,
            16843242,
            16843243,
            16843244,
            16843245,
            16843246,
            16843491,
            16844124,
            16844129,
            R.attr.allowDividerAbove,
            R.attr.allowDividerBelow,
            R.attr.defaultValue,
            R.attr.dependency,
            R.attr.enableCopying,
            R.attr.enabled,
            R.attr.fragment,
            R.attr.icon,
            R.attr.iconSpaceReserved,
            R.attr.isPreferenceVisible,
            R.attr.key,
            R.attr.layout,
            R.attr.order,
            R.attr.persistent,
            R.attr.selectable,
            R.attr.shouldDisableView,
            R.attr.singleLineTitle,
            R.attr.summary,
            R.attr.title,
            R.attr.widgetLayout
        )
        val PreferenceFragment =
            intArrayOf(16842994, 16843049, 16843050, R.attr.allowDividerAfterLastItem)
        val PreferenceFragmentCompat =
            intArrayOf(16842994, 16843049, 16843050, R.attr.allowDividerAfterLastItem)
        val PreferenceGroup =
            intArrayOf(16843239, R.attr.initialExpandedChildrenCount, R.attr.orderingFromXml)
        val PreferenceImageView = intArrayOf(16843039, 16843040, R.attr.maxHeight, R.attr.maxWidth)
        val PreferenceTheme = intArrayOf(
            R.attr.checkBoxPreferenceStyle,
            R.attr.dialogPreferenceStyle,
            R.attr.dropdownPreferenceStyle,
            R.attr.editTextPreferenceStyle,
            R.attr.preferenceCategoryStyle,
            R.attr.preferenceCategoryTitleTextAppearance,
            R.attr.preferenceFragmentCompatStyle,
            R.attr.preferenceFragmentListStyle,
            R.attr.preferenceFragmentStyle,
            R.attr.preferenceInformationStyle,
            R.attr.preferenceScreenStyle,
            R.attr.preferenceStyle,
            R.attr.preferenceTheme,
            R.attr.seekBarPreferenceStyle,
            R.attr.switchPreferenceCompatStyle,
            R.attr.switchPreferenceStyle
        )
        val PropertySet = intArrayOf(
            16842972,
            16843551,
            R.attr.layout_constraintTag,
            R.attr.motionProgress,
            R.attr.visibilityMode
        )
        val RadialViewGroup = intArrayOf(R.attr.materialCircleRadius)
        val RangeSlider = intArrayOf(R.attr.minSeparation, R.attr.values)
        val RecycleListView = intArrayOf(R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle)
        val RecyclerView = intArrayOf(
            16842948,
            16842987,
            16842993,
            R.attr.fastScrollEnabled,
            R.attr.fastScrollHorizontalThumbDrawable,
            R.attr.fastScrollHorizontalTrackDrawable,
            R.attr.fastScrollVerticalThumbDrawable,
            R.attr.fastScrollVerticalTrackDrawable,
            R.attr.layoutManager,
            R.attr.reverseLayout,
            R.attr.spanCount,
            R.attr.stackFromEnd
        )
        val ScrimInsetsFrameLayout = intArrayOf(R.attr.insetForeground)
        val ScrollingViewBehavior_Layout = intArrayOf(R.attr.behavior_overlapTop)
        val SearchView = intArrayOf(
            16842970,
            16843039,
            16843296,
            16843364,
            R.attr.closeIcon,
            R.attr.commitIcon,
            R.attr.defaultQueryHint,
            R.attr.goIcon,
            R.attr.iconifiedByDefault,
            R.attr.layout,
            R.attr.queryBackground,
            R.attr.queryHint,
            R.attr.searchHintIcon,
            R.attr.searchIcon,
            R.attr.submitBackground,
            R.attr.suggestionRowLayout,
            R.attr.voiceIcon
        )
        val SeekBarPreference = intArrayOf(
            16842994,
            16843062,
            R.attr.adjustable,
            R.attr.min,
            R.attr.seekBarIncrement,
            R.attr.showSeekBarValue,
            R.attr.updatesContinuously
        )
        val ShapeAppearance = intArrayOf(
            R.attr.cornerFamily,
            R.attr.cornerFamilyBottomLeft,
            R.attr.cornerFamilyBottomRight,
            R.attr.cornerFamilyTopLeft,
            R.attr.cornerFamilyTopRight,
            R.attr.cornerSize,
            R.attr.cornerSizeBottomLeft,
            R.attr.cornerSizeBottomRight,
            R.attr.cornerSizeTopLeft,
            R.attr.cornerSizeTopRight
        )
        val ShapeableImageView = intArrayOf(
            R.attr.contentPadding,
            R.attr.contentPaddingBottom,
            R.attr.contentPaddingEnd,
            R.attr.contentPaddingLeft,
            R.attr.contentPaddingRight,
            R.attr.contentPaddingStart,
            R.attr.contentPaddingTop,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.strokeColor,
            R.attr.strokeWidth
        )
        val ShimmerFrameLayout = intArrayOf(
            R.attr.shimmer_auto_start,
            R.attr.shimmer_base_alpha,
            R.attr.shimmer_base_color,
            R.attr.shimmer_clip_to_children,
            R.attr.shimmer_colored,
            R.attr.shimmer_direction,
            R.attr.shimmer_dropoff,
            R.attr.shimmer_duration,
            R.attr.shimmer_fixed_height,
            R.attr.shimmer_fixed_width,
            R.attr.shimmer_height_ratio,
            R.attr.shimmer_highlight_alpha,
            R.attr.shimmer_highlight_color,
            R.attr.shimmer_intensity,
            R.attr.shimmer_repeat_count,
            R.attr.shimmer_repeat_delay,
            R.attr.shimmer_repeat_mode,
            R.attr.shimmer_shape,
            R.attr.shimmer_tilt,
            R.attr.shimmer_width_ratio
        )
        val SignInButton = intArrayOf(R.attr.buttonSize, R.attr.colorScheme, R.attr.scopeUris)
        val Slider = intArrayOf(
            16842766,
            16842788,
            16843078,
            16843486,
            16843487,
            R.attr.haloColor,
            R.attr.haloRadius,
            R.attr.labelBehavior,
            R.attr.labelStyle,
            R.attr.thumbColor,
            R.attr.thumbElevation,
            R.attr.thumbRadius,
            R.attr.thumbStrokeColor,
            R.attr.thumbStrokeWidth,
            R.attr.tickColor,
            R.attr.tickColorActive,
            R.attr.tickColorInactive,
            R.attr.tickVisible,
            R.attr.trackColor,
            R.attr.trackColorActive,
            R.attr.trackColorInactive,
            R.attr.trackHeight
        )
        val Snackbar = intArrayOf(
            R.attr.snackbarButtonStyle,
            R.attr.snackbarStyle,
            R.attr.snackbarTextViewStyle
        )
        val SnackbarLayout = intArrayOf(
            16843039,
            R.attr.actionTextColorAlpha,
            R.attr.animationMode,
            R.attr.backgroundOverlayColorAlpha,
            R.attr.backgroundTint,
            R.attr.backgroundTintMode,
            R.attr.elevation,
            R.attr.maxActionInlineWidth
        )
        val Spinner = intArrayOf(16842930, 16843126, 16843131, 16843362, R.attr.popupTheme)
        val SplitPairFilter = intArrayOf(
            R.attr.primaryActivityName,
            R.attr.secondaryActivityAction,
            R.attr.secondaryActivityName
        )
        val SplitPairRule = intArrayOf(
            R.attr.clearTop,
            R.attr.finishPrimaryWithSecondary,
            R.attr.finishSecondaryWithPrimary,
            R.attr.splitLayoutDirection,
            R.attr.splitMinSmallestWidth,
            R.attr.splitMinWidth,
            R.attr.splitRatio
        )
        val SplitPlaceholderRule = intArrayOf(
            R.attr.placeholderActivityName,
            R.attr.splitLayoutDirection,
            R.attr.splitMinSmallestWidth,
            R.attr.splitMinWidth,
            R.attr.splitRatio
        )
        val State = intArrayOf(16842960, R.attr.constraints)
        val StateListDrawable =
            intArrayOf(16843036, 16843156, 16843157, 16843158, 16843532, 16843533)
        val StateListDrawableItem = intArrayOf(16843161)
        val StateSet = intArrayOf(R.attr.defaultState)
        val StyledPlayerControlView = intArrayOf(
            R.attr.ad_marker_color,
            R.attr.ad_marker_width,
            R.attr.animation_enabled,
            R.attr.bar_gravity,
            R.attr.bar_height,
            R.attr.buffered_color,
            R.attr.controller_layout_id,
            R.attr.played_ad_marker_color,
            R.attr.played_color,
            R.attr.repeat_toggle_modes,
            R.attr.scrubber_color,
            R.attr.scrubber_disabled_size,
            R.attr.scrubber_dragged_size,
            R.attr.scrubber_drawable,
            R.attr.scrubber_enabled_size,
            R.attr.show_fastforward_button,
            R.attr.show_next_button,
            R.attr.show_previous_button,
            R.attr.show_rewind_button,
            R.attr.show_shuffle_button,
            R.attr.show_subtitle_button,
            R.attr.show_timeout,
            R.attr.show_vr_button,
            R.attr.time_bar_min_update_interval,
            R.attr.touch_target_height,
            R.attr.unplayed_color
        )
        val StyledPlayerView = intArrayOf(
            R.attr.ad_marker_color,
            R.attr.ad_marker_width,
            R.attr.animation_enabled,
            R.attr.auto_show,
            R.attr.bar_gravity,
            R.attr.bar_height,
            R.attr.buffered_color,
            R.attr.controller_layout_id,
            R.attr.default_artwork,
            R.attr.hide_during_ads,
            R.attr.hide_on_touch,
            R.attr.keep_content_on_player_reset,
            R.attr.played_ad_marker_color,
            R.attr.played_color,
            R.attr.player_layout_id,
            R.attr.repeat_toggle_modes,
            R.attr.resize_mode,
            R.attr.scrubber_color,
            R.attr.scrubber_disabled_size,
            R.attr.scrubber_dragged_size,
            R.attr.scrubber_drawable,
            R.attr.scrubber_enabled_size,
            R.attr.show_buffering,
            R.attr.show_shuffle_button,
            R.attr.show_subtitle_button,
            R.attr.show_timeout,
            R.attr.show_vr_button,
            R.attr.shutter_background_color,
            R.attr.surface_type,
            R.attr.time_bar_min_update_interval,
            R.attr.touch_target_height,
            R.attr.unplayed_color,
            R.attr.use_artwork,
            R.attr.use_controller
        )
        val SwipeRefreshLayout = intArrayOf(R.attr.swipeRefreshLayoutProgressSpinnerBackgroundColor)
        val SwitchCompat = intArrayOf(
            16843044,
            16843045,
            16843074,
            R.attr.showText,
            R.attr.splitTrack,
            R.attr.switchMinWidth,
            R.attr.switchPadding,
            R.attr.switchTextAppearance,
            R.attr.thumbTextPadding,
            R.attr.thumbTint,
            R.attr.thumbTintMode,
            R.attr.track,
            R.attr.trackTint,
            R.attr.trackTintMode
        )
        val SwitchMaterial = intArrayOf(R.attr.useMaterialThemeColors)
        val SwitchPreference = intArrayOf(
            16843247,
            16843248,
            16843249,
            16843627,
            16843628,
            R.attr.disableDependentsState,
            R.attr.summaryOff,
            R.attr.summaryOn,
            R.attr.switchTextOff,
            R.attr.switchTextOn
        )
        val SwitchPreferenceCompat = intArrayOf(
            16843247,
            16843248,
            16843249,
            16843627,
            16843628,
            R.attr.disableDependentsState,
            R.attr.summaryOff,
            R.attr.summaryOn,
            R.attr.switchTextOff,
            R.attr.switchTextOn
        )
        val TabItem = intArrayOf(16842754, 16842994, 16843087)
        val TabLayout = intArrayOf(
            R.attr.tabBackground,
            R.attr.tabContentStart,
            R.attr.tabGravity,
            R.attr.tabIconTint,
            R.attr.tabIconTintMode,
            R.attr.tabIndicator,
            R.attr.tabIndicatorAnimationDuration,
            R.attr.tabIndicatorAnimationMode,
            R.attr.tabIndicatorColor,
            R.attr.tabIndicatorFullWidth,
            R.attr.tabIndicatorGravity,
            R.attr.tabIndicatorHeight,
            R.attr.tabInlineLabel,
            R.attr.tabMaxWidth,
            R.attr.tabMinWidth,
            R.attr.tabMode,
            R.attr.tabPadding,
            R.attr.tabPaddingBottom,
            R.attr.tabPaddingEnd,
            R.attr.tabPaddingStart,
            R.attr.tabPaddingTop,
            R.attr.tabRippleColor,
            R.attr.tabSelectedTextColor,
            R.attr.tabTextAppearance,
            R.attr.tabTextColor,
            R.attr.tabUnboundedRipple
        )
        val TextAppearance = intArrayOf(
            16842901,
            16842902,
            16842903,
            16842904,
            16842906,
            16842907,
            16843105,
            16843106,
            16843107,
            16843108,
            16843692,
            16844165,
            R.attr.fontFamily,
            R.attr.fontVariationSettings,
            R.attr.textAllCaps,
            R.attr.textLocale
        )
        val TextEffects = intArrayOf(
            16842901,
            16842902,
            16842903,
            16843087,
            16843105,
            16843106,
            16843107,
            16843108,
            16843692,
            R.attr.borderRound,
            R.attr.borderRoundPercent,
            R.attr.textFillColor,
            R.attr.textOutlineColor,
            R.attr.textOutlineThickness
        )
        val TextInputEditText = intArrayOf(R.attr.textInputLayoutFocusedRectEnabled)
        val TextInputLayout = intArrayOf(
            16842766,
            16842906,
            16843039,
            16843071,
            16843088,
            R.attr.boxBackgroundColor,
            R.attr.boxBackgroundMode,
            R.attr.boxCollapsedPaddingTop,
            R.attr.boxCornerRadiusBottomEnd,
            R.attr.boxCornerRadiusBottomStart,
            R.attr.boxCornerRadiusTopEnd,
            R.attr.boxCornerRadiusTopStart,
            R.attr.boxStrokeColor,
            R.attr.boxStrokeErrorColor,
            R.attr.boxStrokeWidth,
            R.attr.boxStrokeWidthFocused,
            R.attr.counterEnabled,
            R.attr.counterMaxLength,
            R.attr.counterOverflowTextAppearance,
            R.attr.counterOverflowTextColor,
            R.attr.counterTextAppearance,
            R.attr.counterTextColor,
            R.attr.endIconCheckable,
            R.attr.endIconContentDescription,
            R.attr.endIconDrawable,
            R.attr.endIconMode,
            R.attr.endIconTint,
            R.attr.endIconTintMode,
            R.attr.errorContentDescription,
            R.attr.errorEnabled,
            R.attr.errorIconDrawable,
            R.attr.errorIconTint,
            R.attr.errorIconTintMode,
            R.attr.errorTextAppearance,
            R.attr.errorTextColor,
            R.attr.expandedHintEnabled,
            R.attr.helperText,
            R.attr.helperTextEnabled,
            R.attr.helperTextTextAppearance,
            R.attr.helperTextTextColor,
            R.attr.hintAnimationEnabled,
            R.attr.hintEnabled,
            R.attr.hintTextAppearance,
            R.attr.hintTextColor,
            R.attr.passwordToggleContentDescription,
            R.attr.passwordToggleDrawable,
            R.attr.passwordToggleEnabled,
            R.attr.passwordToggleTint,
            R.attr.passwordToggleTintMode,
            R.attr.placeholderText,
            R.attr.placeholderTextAppearance,
            R.attr.placeholderTextColor,
            R.attr.prefixText,
            R.attr.prefixTextAppearance,
            R.attr.prefixTextColor,
            R.attr.shapeAppearance,
            R.attr.shapeAppearanceOverlay,
            R.attr.startIconCheckable,
            R.attr.startIconContentDescription,
            R.attr.startIconDrawable,
            R.attr.startIconTint,
            R.attr.startIconTintMode,
            R.attr.suffixText,
            R.attr.suffixTextAppearance,
            R.attr.suffixTextColor
        )
        val ThemeEnforcement =
            intArrayOf(16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance)
        val Toolbar = intArrayOf(
            16842927,
            16843072,
            R.attr.buttonGravity,
            R.attr.collapseContentDescription,
            R.attr.collapseIcon,
            R.attr.contentInsetEnd,
            R.attr.contentInsetEndWithActions,
            R.attr.contentInsetLeft,
            R.attr.contentInsetRight,
            R.attr.contentInsetStart,
            R.attr.contentInsetStartWithNavigation,
            R.attr.logo,
            R.attr.logoDescription,
            R.attr.maxButtonHeight,
            R.attr.menu,
            R.attr.navigationContentDescription,
            R.attr.navigationIcon,
            R.attr.popupTheme,
            R.attr.subtitle,
            R.attr.subtitleTextAppearance,
            R.attr.subtitleTextColor,
            R.attr.title,
            R.attr.titleMargin,
            R.attr.titleMarginBottom,
            R.attr.titleMarginEnd,
            R.attr.titleMarginStart,
            R.attr.titleMarginTop,
            R.attr.titleMargins,
            R.attr.titleTextAppearance,
            R.attr.titleTextColor
        )
        val Tooltip = intArrayOf(
            16842804,
            16842904,
            16842965,
            16842998,
            16843071,
            16843072,
            16843087,
            R.attr.backgroundTint
        )
        val Transform = intArrayOf(
            16843552,
            16843553,
            16843554,
            16843555,
            16843556,
            16843557,
            16843558,
            16843559,
            16843560,
            16843770,
            16843840,
            R.attr.transformPivotTarget
        )
        val Transition = intArrayOf(
            16842960,
            R.attr.autoTransition,
            R.attr.constraintSetEnd,
            R.attr.constraintSetStart,
            R.attr.duration,
            R.attr.layoutDuringTransition,
            R.attr.motionInterpolator,
            R.attr.pathMotionArc,
            R.attr.staggered,
            R.attr.transitionDisable,
            R.attr.transitionFlags
        )
        val Variant = intArrayOf(
            R.attr.constraints,
            R.attr.region_heightLessThan,
            R.attr.region_heightMoreThan,
            R.attr.region_widthLessThan,
            R.attr.region_widthMoreThan
        )
        val View =
            intArrayOf(16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme)
        val ViewBackgroundHelper =
            intArrayOf(16842964, R.attr.backgroundTint, R.attr.backgroundTintMode)
        val ViewPager2 = intArrayOf(16842948)
        val ViewStubCompat = intArrayOf(16842960, 16842994, 16842995)
        val ViewTransition = intArrayOf(
            16842960,
            R.attr.SharedValue,
            R.attr.SharedValueId,
            R.attr.clearsTag,
            R.attr.duration,
            R.attr.ifTagNotSet,
            R.attr.ifTagSet,
            R.attr.motionInterpolator,
            R.attr.motionTarget,
            R.attr.onStateTransition,
            R.attr.pathMotionArc,
            R.attr.setsTag,
            R.attr.transitionDisable,
            R.attr.upDuration,
            R.attr.viewTransitionMode
        )
        val com_facebook_like_view = intArrayOf(
            R.attr.com_facebook_auxiliary_view_position,
            R.attr.com_facebook_foreground_color,
            R.attr.com_facebook_horizontal_alignment,
            R.attr.com_facebook_object_id,
            R.attr.com_facebook_object_type,
            R.attr.com_facebook_style
        )
        val com_facebook_login_view = intArrayOf(
            R.attr.com_facebook_confirm_logout,
            R.attr.com_facebook_login_text,
            R.attr.com_facebook_logout_text,
            R.attr.com_facebook_tooltip_mode
        )
        val com_facebook_profile_picture_view =
            intArrayOf(R.attr.com_facebook_is_cropped, R.attr.com_facebook_preset_size)
        val include = intArrayOf(R.attr.constraintSet)
    }

    /* renamed from: com.lagradost.cloudstream3.R$xml */ /* loaded from: classes3.dex */
    object C4769xml {
        const val backup_descriptor = 2132148224
        const val image_share_filepaths = 2132148225
        const val provider_paths = 2132148226
        const val settings_account = 2132148227
        const val settings_media_lang = 2132148228
        const val settings_player = 2132148229
        const val settings_updates = 2132148230
        const val settins_general = 2132148231
        const val settins_ui = 2132148232
        const val standalone_badge = 2132148233
        const val standalone_badge_gravity_bottom_end = 2132148234
        const val standalone_badge_gravity_bottom_start = 2132148235
        const val standalone_badge_gravity_top_start = 2132148236
        const val standalone_badge_offset = 2132148237
    }
}