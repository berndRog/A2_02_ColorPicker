package de.rogallab.mobile.ui.colorpicker.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import de.rogallab.mobile.domain.utilities.logDebug

@Composable
fun SelectColorScreen1(
   color: Color = Color.Black,               // value
   modifier: Modifier                        // value
) {
   // StateHolder
   val stateColor: MutableState<Color> = remember {
      mutableStateOf(color)
   }

   val red: Float = stateColor.value.red
   val green: Float = stateColor.value.green
   val blue: Float = stateColor.value.blue

   logDebug("<-SliderScreen1", "Composition")

   Column(
      modifier = modifier
         //.border(border = BorderStroke(1.dp, Color.Red))
   ) {
      ColorBox(
         color = stateColor.value,           // State ↓
      )
      ColorLabel(
         color = stateColor.value,           // State ↓
      )

      ColorSlider(
         label = "R(ot)",
         value = red,                        // State ↓
         onValueChange = { it ->             // Event ↑
            stateColor.value = Color(it, green, blue) }
      )
      ColorSlider(
         label = "G(rün)",
         value = green,                      // State ↓
         onValueChange = { it ->             // Event ↑
            stateColor.value = Color(red, it, blue) }
      )
      ColorSlider(
         label = "B(lau)",
         value = blue,                       // State ↓
         onValueChange = { it ->             // Event ↑
            stateColor.value = Color(red, green, it) }
      )

      ColorSliderMinMax(
         minText= "Min",
         maxText = "Max",
      )
   }
}







