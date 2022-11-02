@file:OptIn(ExperimentalFoundationApi::class)

package com.jetpackcomposebasic.textSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextSampleActivity : ComponentActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The setContent block defines the layout of the activity
        setContent {
            // row to fill the maximum size of the screen and bg color
            Row(
                Modifier
                    .background(Color.Unspecified)
                    .fillMaxSize()
            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    TextStyling(
                        "Android Text field JetpackBasic",
                        style = TextStyle(
                            // Text with Font Size
                            textAlign = TextAlign.Center,
                            // Text with Font Size
                            fontSize = 45.sp,
                            // Text with Font Weight
                            fontWeight = FontWeight.SemiBold,
                            // Text with Font Style
                            fontStyle = FontStyle.Normal,
                            // Text with color
                            color = Color.Blue,
                            // Text with font family
                            fontFamily = FontFamily.Cursive,
                            // Text with Decoration
                            textDecoration = TextDecoration.Underline,
                            // Text with Shadow
                            shadow = Shadow(
                                color = Color.Red, blurRadius = 14f,
                                offset = Offset(8f, 8f)
                            ),
                            // Text with Background Color
                            background = Color.LightGray,
                            // Text with Padding
                            textIndent = TextIndent(firstLine = 40.sp)
                        )
                    )
                    TextStyling(
                        "Strikethrough text",
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough,
                            textIndent = TextIndent(firstLine = 40.sp),
                            color = Color.Blue,
                        )
                    )
                    TextFieldComponent()
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun TextFieldComponent() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    // textField is a composable that is used to take input. It is similar to EditText.
    // onValueChange will be called when there is a change in content of text field.
    TextField(
        value = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .background(Color.White, RoundedCornerShape(22.dp)),
        onValueChange = {
            text = it
        },
        label = { Text("Enter Name") },
        )
}

@Composable
fun TextStyling(displayText: String, style: TextStyle? = null, maxLines: Int? = null) {
    // text style is used to put some styling to Compose UI elements.
    Text(
        text = displayText,
        modifier = Modifier.padding(16.dp),
        style = style ?: TextStyle.Default,
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

