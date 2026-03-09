package com.msaitodev.quiz.core.domain.config;

/**
 * Firebase Remote Config で使用するパラメータキーの定義。
 * 量産時に Firebase Console で設定が必要な項目を一元管理する。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/msaitodev/quiz/core/domain/config/RemoteConfigKeys;", "", "()V", "FREE_DAILY_SETS", "", "INTERSTITIAL_CAP_PER_SESSION", "INTERSTITIAL_ENABLED", "INTER_SESSION_INTERVAL_SEC", "PREMIUM_DAILY_SETS", "SET_SIZE", "quiz-core-domain_release"})
public final class RemoteConfigKeys {
    
    /**
     * 無料ユーザーの1日の最大セット数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FREE_DAILY_SETS = "free_daily_sets";
    
    /**
     * プレミアムユーザーの1日の最大セット数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREMIUM_DAILY_SETS = "premium_daily_sets";
    
    /**
     * 1セットあたりの問題数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SET_SIZE = "set_size";
    
    /**
     * インタースティシャル広告の有効/無効
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERSTITIAL_ENABLED = "interstitial_enabled";
    
    /**
     * 1セッションあたりのインタースティシャル広告の最大表示回数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERSTITIAL_CAP_PER_SESSION = "interstitial_cap_per_session";
    
    /**
     * インタースティシャル広告表示の最小間隔（秒）
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTER_SESSION_INTERVAL_SEC = "inter_session_interval_sec";
    @org.jetbrains.annotations.NotNull()
    public static final com.msaitodev.quiz.core.domain.config.RemoteConfigKeys INSTANCE = null;
    
    private RemoteConfigKeys() {
        super();
    }
}