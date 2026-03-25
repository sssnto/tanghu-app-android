package com.tanghu.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "个人中心",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // 用户信息卡片
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "张三",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "2型糖尿病 · 确诊5年",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // 设置选项
        ListItem(
            headlineContent = { Text("目标血糖设置") },
            supportingContent = { Text("3.9 - 7.8 mmol/L") },
            trailingContent = { Text(">") }
        )
        Divider()
        ListItem(
            headlineContent = { Text("用药提醒") },
            supportingContent = { Text("已开启") },
            trailingContent = { Text(">") }
        )
        Divider()
        ListItem(
            headlineContent = { Text("报告导出") },
            supportingContent = { Text("生成周报/月报") },
            trailingContent = { Text(">") }
        )
        Divider()
        ListItem(
            headlineContent = { Text("设置") },
            trailingContent = { Text(">") }
        )
    }
}
