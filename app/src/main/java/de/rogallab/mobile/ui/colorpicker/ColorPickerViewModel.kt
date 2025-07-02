package de.rogallab.mobile.ui.colorpicker

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ColorPickerViewModel(): ViewModel() {

    // StateFlow for UI state
    private val _colorState = MutableStateFlow<Color>(Color.Black)
    val colorState: StateFlow<Color> = _colorState.asStateFlow()

    fun onColorChange(color: Color) {
        // Update the color state with the new color
        _colorState.value = color
    }

}