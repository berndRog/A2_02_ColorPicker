package de.rogallab.mobile.ui.colorpicker.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.ui.colorpicker.ColorPickerViewModel

@Composable
fun SelectColorScreen2(
   viewModel: ColorPickerViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
   modifier: Modifier
) {

   val stateColor = viewModel.colorState.collectAsStateWithLifecycle()

   val red = stateColor.value.red
   val green = stateColor.value.green
   val blue = stateColor.value.blue

   logDebug("<-SliderScreen2", "Composition")

   Column(
      modifier = modifier
         //.border(border = BorderStroke(1.dp, Color.Red))
   ) {
      ColorBox(
         color = stateColor.value,  // state
      )
      ColorLabel(
         color = stateColor.value,  // state
      )

      ColorSlider(
         label = "R(ot)",
         value = stateColor.value.red,
         onValueChange = { it ->
            viewModel.onColorChange( Color(it, green, blue)) }
      )
      ColorSlider(
         label = "G(rün)",
         value = stateColor.value.green,
         onValueChange = { it ->
            viewModel.onColorChange( Color(red, it, blue)) }
      )
      ColorSlider(
         label = "B(lau)",
         value = stateColor.value.blue,
         onValueChange = { it ->
            viewModel.onColorChange( Color(red, green, it)) }
      )

      ColorSliderMinMax(
         minText= "Min",
         maxText = "Max",
      )

      /*
      Row(
         modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
         //horizontalArrangement = androidx.compose.foundation.layout.Arrangement.End
      ) {

         Text(
            text = "Das ist ein Bild eines Papageis",
            modifier = Modifier
               .padding(end = 8.dp)
               .weight(4f)
         )
         AsyncImage(
            model = R.drawable.parrot4,
            contentDescription = "Bild eines Papageis",
            modifier = Modifier
               //.weight(6f)
               .width(250.dp),
            contentScale = ContentScale.Fit
         )
      }

       */
   }
}







