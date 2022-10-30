package com.jetpackcomposebasic.textSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class TextSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The setContent block defines the layout of the activity and it is used in place of
        // setContent(R.id.some_xml_file) that we use normally(without compose). This is an
        setContent {
            // Column is used to have the views one after the other vertically.,
            // pass some parameters such as modifier, verticalArrangement, horizontalAlignment, etc.
            // modifier is used to decorate or add behavior to UI elements. Here we are telling the
            // column to fill the maximum size of the screen
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SimpleText("Android Text field JetpackBasic")
            }
        }
    }}

// This is a Composable function. To write any Composable function, you need to use @Composable annotation
@Composable
fun SimpleText(displayText: String) {
    // Text composable is used to display some text
    Text(text = displayText)
}


// you need to use @Preview annotation and then write a Composable function and call your UI element.
// The UI will be refreshed on every build or you can refresh manually from the UI preview.
@Preview
@Composable
fun SimpleTextPreview() {
    SimpleText("Hi Compose")
}