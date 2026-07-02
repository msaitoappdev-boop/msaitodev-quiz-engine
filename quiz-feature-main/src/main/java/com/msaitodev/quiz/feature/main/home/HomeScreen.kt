package com.msaitodev.quiz.feature.main.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msaitodev.quiz.feature.main.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(
    uiState: HomeViewModel.HomeUiState,
    showOfferDialog: Boolean,
    onStartQuiz: () -> Unit,
    onStartWeaknessTraining: () -> Unit,
    onAnalysisClicked: () -> Unit,
    onViewHistory: () -> Unit,
    onUpgrade: () -> Unit,
    onOpenSettings: () -> Unit,
    onOfferConfirm: () -> Unit,
    onOfferDismiss: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.home_title)) },
                actions = {
                    if (!uiState.isPremium) {
                        IconButton(onClick = onUpgrade) {
                            Icon(
                                imageVector = Icons.Filled.WorkspacePremium,
                                contentDescription = stringResource(R.string.home_upgrade_to_premium),
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                    IconButton(onClick = onOpenSettings) {
                        Icon(
                            Icons.Filled.Settings,
                            contentDescription = stringResource(R.string.settings_title)
                        )
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(horizontal = 20.dp)
                .fillMaxSize()
        ) {
            // メインアクション: 通常のクイズ
            Button(
                onClick = onStartQuiz,
                modifier = Modifier.fillMaxWidth(),
                enabled = !uiState.isLoading
            ) {
                Text(stringResource(R.string.home_start_quiz))
            }

            Spacer(Modifier.height(8.dp))

            // 弱点特訓
            OutlinedButton(
                onClick = onStartWeaknessTraining,
                modifier = Modifier.fillMaxWidth(),
                enabled = !uiState.isLoading
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Psychology, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(8.dp))
                    Text(stringResource(R.string.home_weakness_training))
                    if (!uiState.isPremium) {
                        Spacer(Modifier.width(8.dp))
                        Icon(Icons.Default.Lock, contentDescription = null, modifier = Modifier.size(14.dp))
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // 学習分析
            OutlinedButton(
                onClick = onAnalysisClicked,
                modifier = Modifier.fillMaxWidth(),
                enabled = !uiState.isLoading
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Analytics, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(8.dp))
                    Text("学習分析")
                    if (!uiState.isPremium) {
                        Spacer(Modifier.width(8.dp))
                        Icon(Icons.Default.Lock, contentDescription = null, modifier = Modifier.size(14.dp))
                    }
                }
            }

            // スコア履歴 (無料ユーザーのみ)
            if (!uiState.isPremium) {
                Spacer(Modifier.height(8.dp))
                OutlinedButton(
                    onClick = onViewHistory,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.History, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(stringResource(R.string.home_view_history))
                    }
                }
            }

            // カード1: 試験日
            uiState.examDateText?.let { dateText ->
                Spacer(Modifier.height(16.dp))
                OutlinedCard(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.outlinedCardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.05f)
                    ),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Event, null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(12.dp))
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = stringResource(R.string.home_next_exam_date, dateText),
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                        
                        uiState.remainingDays?.let { days ->
                            Text(
                                text = stringResource(R.string.home_remaining_days, days),
                                style = MaterialTheme.typography.headlineSmall.copy(fontSize = 22.sp),
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.Black
                            )
                        }
                    }
                }
            }

            // カード2: 学習状況 (苦手分野のインサイトを統合)
            if (!uiState.isLoading) {
                Spacer(Modifier.height(12.dp))
                OutlinedCard(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.outlinedCardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.05f)
                    ),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                    shape = RoundedCornerShape(12.dp),
                    onClick = onAnalysisClicked
                ) {
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 10.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = stringResource(R.string.home_status_title),
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold
                            )
                            if (!uiState.isPremium) {
                                Spacer(Modifier.width(8.dp))
                                Icon(
                                    Icons.Default.Lock,
                                    contentDescription = null,
                                    modifier = Modifier.size(14.dp),
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                        
                        Spacer(Modifier.height(8.dp))

                        // 推定ランク
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Star, null, tint = MaterialTheme.colorScheme.secondary, modifier = Modifier.size(14.dp))
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = stringResource(R.string.home_predicted_score_label),
                                style = MaterialTheme.typography.bodySmall
                            )
                            Text(
                                text = when (uiState.scoreStatus) {
                                    HomeViewModel.PredictedScoreStatus.NOT_ATTEMPTED -> stringResource(R.string.home_score_not_attempted)
                                    HomeViewModel.PredictedScoreStatus.BELOW_PASSING -> stringResource(R.string.home_score_below_passing)
                                    HomeViewModel.PredictedScoreStatus.PASSING -> stringResource(R.string.home_score_passing)
                                },
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Bold,
                                color = if (uiState.scoreStatus == HomeViewModel.PredictedScoreStatus.PASSING) 
                                    MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                            )
                        }

                        // ストリーク
                        if (uiState.streakDays > 0) {
                            Spacer(Modifier.height(4.dp))
                            Text(
                                text = stringResource(R.string.home_streak_format, uiState.streakDays),
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }

                        // 統合: 苦手分野のアドバイス
                        uiState.weakestCategoryName?.let { category ->
                            Spacer(Modifier.height(8.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(horizontal = 8.dp)
                            ) {
                                Icon(
                                    Icons.Default.AutoAwesome,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.secondary,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    text = stringResource(R.string.home_weakness_pickup_message, category),
                                    style = MaterialTheme.typography.labelSmall,
                                    color = MaterialTheme.colorScheme.secondary,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }

                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = stringResource(R.string.home_score_detail_note),
                            style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }
    }

    if (showOfferDialog) {
        AlertDialog(
            onDismissRequest = onOfferDismiss,
            title = { Text(stringResource(R.string.dialog_rewarded_ad_title)) },
            text = { Text(stringResource(R.string.dialog_rewarded_ad_message)) },
            confirmButton = {
                TextButton(onClick = onOfferConfirm) { Text(stringResource(R.string.dialog_rewarded_ad_confirm)) }
            },
            dismissButton = {
                TextButton(onClick = onOfferDismiss) { Text(stringResource(R.string.dialog_rewarded_ad_dismiss)) }
            }
        )
    }
}
