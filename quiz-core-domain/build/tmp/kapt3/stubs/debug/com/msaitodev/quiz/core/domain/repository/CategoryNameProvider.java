package com.msaitodev.quiz.core.domain.repository;

/**
 * カテゴリ ID から表示用の名称（日本語など）を取得するためのプロバイダー。
 * ハブ層で実装することで、ドメイン層をプラットフォームや言語から独立させます。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/msaitodev/quiz/core/domain/repository/CategoryNameProvider;", "", "getDisplayName", "", "categoryId", "quiz-core-domain_debug"})
public abstract interface CategoryNameProvider {
    
    /**
     * カテゴリ ID（ディレクトリ名など）を表示名に変換します。
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId);
}