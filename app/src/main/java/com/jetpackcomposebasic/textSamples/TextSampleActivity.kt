package com.jetpackcomposebasic.textSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The setContent block defines the layout of the activity
        setContent {
            // row to fill the maximum size of the screen and bg color
            Row(
                Modifier
                    .background(Color.LightGray)
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
                }
            }

            Column(
                Modifier
                    .background(
                        Color.Blue
                    )
                    .padding(10.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp).background(Color.White, RoundedCornerShape(22.dp)),
                    shape = RoundedCornerShape(22.dp),
                    value = "Name",
                    onValueChange = {},
                    textStyle = MaterialTheme.typography.caption
                )
            }
        }
    }
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

