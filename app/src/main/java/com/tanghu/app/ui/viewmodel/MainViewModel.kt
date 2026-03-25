package com.tanghu.app.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class MainUiState(
    val isLoading: Boolean = false,
    val userName: String = "",
    val todayAvgGlucose: Double? = null,
    val todayRecords: List<GlucoseRecordUi> = emptyList()
)

data class GlucoseRecordUi(
    val time: String,
    val value: String,
    val type: String,
    val status: RecordStatus
)

enum class RecordStatus {
    NORMAL, HIGH, LOW
}

class MainViewModel : ViewModel() {
    
    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState
    
    init {
        loadData()
    }
    
    fun loadData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            // TODO: 调用API获取数据
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }
    
    fun addRecord(value: Double, type: String) {
        viewModelScope.launch {
            // TODO: 调用API保存记录
        }
    }
}
