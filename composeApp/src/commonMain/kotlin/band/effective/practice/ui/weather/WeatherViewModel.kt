package band.effective.practice.ui.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import band.effective.practice.domain.model.Weather
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
