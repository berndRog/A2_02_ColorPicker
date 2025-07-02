package de.rogallab.mobile

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.rogallab.mobile.ui.colorpicker.composables.SelectColorScreen2
import de.rogallab.mobile.ui.theme.AppTheme

class MainActivity : BaseActivity(TAG) {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         Content()
      }
   }
   companion object {
      private const val TAG = "<-MainActivity"
      const val IS_INFO = true
      const val IS_DEBUG = true
      const val IS_VERBOSE = true
   }
}

@Composable
fun Content()  {
   AppTheme {
      Scaffold(
         modifier = Modifier
            .fillMaxSize(),
         //.border(border = BorderStroke(3.dp, Color.Green)),
         contentWindowInsets = WindowInsets.safeGestures,
      ) { innerPadding ->
         SelectColorScreen2(
            modifier = Modifier
               .padding(paddingValues = innerPadding)
               .fillMaxSize()
         )
      }
   }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
   Content()
}