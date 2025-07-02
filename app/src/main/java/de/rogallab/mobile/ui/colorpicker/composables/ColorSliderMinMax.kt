package de.rogallab.mobile.ui.colorpicker.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ColorSliderMinMax(
    minText: String,          // State ↓
    minWeight: Float = 0.25f, // State ↓
    maxText: String,          // State ↓
    maxWeight: Float = 0.75f, // State ↓
) {
   Row(
      modifier = Modifier.fillMaxWidth()
      //.border(border = BorderStroke(1.dp, Color.Gray))
   ) {
      Text(
         text = minText,
         modifier = Modifier.weight(minWeight),
         //.border(border = BorderStroke(1.dp, Color.Gray)),
         textAlign = TextAlign.End
      )
      Text(
         text = maxText,
         modifier = Modifier.weight(maxWeight),
         //.border(border = BorderStroke(1.dp, Color.Gray)),
         textAlign = TextAlign.End
      )
   }
}