package com.sabin.anzdemoapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sabin.anzdemoapp.data.model.SpaceXLaunchesModel
import com.sabin.anzdemoapp.data.repository.SpaceXLaunchesRepository
import com.sabin.anzdemoapp.ui.base.UiState
import com.sabin.anzdemoapp.utils.AppConstant

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val spaceXLaunchesRepository: SpaceXLaunchesRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<SpaceXLaunchesModel>>>(UiState.Loading)

    val uiState: StateFlow<UiState<List<SpaceXLaunchesModel>>> = _uiState

    init {
        fetchAllLaunches()
    }

    fun fetchAllLaunches() {
        viewModelScope.launch {
            spaceXLaunchesRepository.getLaunches(AppConstant.LIMIT)
                .catch { e ->
                    _uiState.value = UiState.Error(e.toString())
                }
                .collect {
                    _uiState.value = UiState.Success(it)
                }
        }
    }
}