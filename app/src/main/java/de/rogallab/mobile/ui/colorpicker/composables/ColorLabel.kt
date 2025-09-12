package de.rogallab.mobile.ui.colorpicker.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.ui.colorpicker.colorToHex
import de.rogallab.mobile.ui.colorpicker.colorToString

@Composable
fun ColorLabel(
   color: Color,                 // State ↓
   modifier: Modifier = Modifier // State ↓
) {
   Text(
      text =
         colorToString(color)
         +" "
         +colorToHex(color),
      textAlign = TextAlign.Center,
      modifier = modifier
         .padding(top = 8.dp)
         .fillMaxWidth()
   )
}