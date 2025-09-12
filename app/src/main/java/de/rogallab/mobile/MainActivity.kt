package de.rogallab.mobile

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.ui.colorpicker.composables.SelectColorScreen1
import de.rogallab.mobile.ui.colorpicker.composables.SelectColorScreen2a
import de.rogallab.mobile.ui.colorpicker.composables.SelectColorScreen2b

import de.rogallab.mobile.ui.theme.AppTheme

class MainActivity : BaseActivity(TAG) {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         AppTheme {
            Scaffold(
               contentWindowInsets = WindowInsets.safeDrawing,
               modifier = Modifier.fillMaxSize()
            ) { innerPadding ->
               SelectColorScreen1(
                  modifier = Modifier
                     .padding(paddingValues = innerPadding)
                     .padding(paddingValues = innerPadding)
                     .padding(horizontal = 16.dp)
                     .padding(top = 8.dp)
                     .fillMaxSize()
               )
            }
         }
      }
   }
   companion object {
      private const val TAG = "<-MainActivity"
      const val IS_INFO = true
      const val IS_DEBUG = true
      const val IS_VERBOSE = true
   }
}


@Preview(showBackground = true)
@Composable
fun SelectColorScreen1Preview() {
   AppTheme {
      Scaffold(
         contentWindowInsets = WindowInsets.safeDrawing,
         modifier = Modifier.fillMaxSize()
      ) { innerPadding ->
         SelectColorScreen1(
            modifier = Modifier
               .padding(paddingValues = innerPadding)
               .padding(horizontal = 16.dp)
               .padding(top = 8.dp)
               .fillMaxSize()
         )
      }
   }
}

@Preview(showBackground = true)
@Composable
fun SelectColorScreen2aPreview() {
   AppTheme {
      Scaffold(
         contentWindowInsets = WindowInsets.safeDrawing,
         modifier = Modifier.fillMaxSize()
      ) { innerPadding ->
         SelectColorScreen2a(
            modifier = Modifier
               .padding(paddingValues = innerPadding)
               .padding(horizontal = 16.dp)
               .padding(top = 8.dp)
               .fillMaxSize()
         )
      }
   }
}

@Preview(showBackground = true)
@Composable
fun SelectColorScreen2bPreview() {
   AppTheme {
      Scaffold(
         contentWindowInsets = WindowInsets.safeDrawing,
         modifier = Modifier.fillMaxSize()
      ) { innerPadding ->
         SelectColorScreen2b(
            modifier = Modifier
               .padding(paddingValues = innerPadding)
               .padding(horizontal = 16.dp)
               .padding(top = 8.dp)
               .fillMaxSize()
         )
      }
   }
}