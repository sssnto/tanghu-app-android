package com.tanghu.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecordScreen() {
    var glucoseValue by remember { mutableStateOf("") }
    var selectedType by remember { mutableStateOf("空腹") }
    var showDatePicker by remember { mutableStateOf(false) }
    
    val measureTypes = listOf("空腹", "餐前", "餐后", "睡前")
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "记录血糖",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // 血糖值输入
        OutlinedTextField(
            value = glucoseValue,
            onValueChange = { glucoseValue = it },
            label = { Text("血糖值 (mmol/L)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // 测量类型选择
        Text(text = "测量类型", style = MaterialTheme.typography.labelLarge)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            measureTypes.forEach { type ->
                FilterChip(
                    selected = selectedType == type,
                    onClick = { selectedType = type },
                    label = { Text(type) }
                )
            }
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // 保存按钮
        Button(
            onClick = {
                // TODO: 保存记录
                glucoseValue = ""
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = glucoseValue.isNotBlank()
        ) {
            Text("保存记录")
        }
    }
}
