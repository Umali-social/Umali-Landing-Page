package com.chariot.landing.privacyComponetns

import androidx.compose.runtime.Composable
import com.chariot.landing.components.RenderMarkdown
import com.chariot.landing.models.ThemeByKizito
import com.chariot.landing.pages.PrivacyContentType
import com.chariot.landing.util.ConstantObject
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobwebx.markdown.MarkdownContext
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px


@Composable
fun PrivacyPolicyTopSection(
    topContent: PrivacyContentType,
    breakpoint: Breakpoint
) {


    val topContentCleanMarkdown = topContent.content
        // 1. strip indentation and whitespace-only lines, so headings start at column 0
        .lines().joinToString("\n") { it.trim() }
        // 2. big gaps (the old ${"\n"} stacks) become a <p> spacer
        .replace(Regex("\n{5,}"), "\n\n<p>\n\n")




    Column(modifier = Modifier.fillMaxWidth()) {


        RenderMarkdown(
            editText = topContentCleanMarkdown,
            textColor = Color.black,
            fontWeightValue = FontWeight.Thin ,
            // fontFamilyValue = "Inter",
            fontSize = if (breakpoint <= Breakpoint.ZERO) {
                16.px
            } else {
                if (breakpoint <= Breakpoint.SM) {
                    28.px
                } else {
                    if (breakpoint <= Breakpoint.MD) {
                        20.px
                    } else {
                        if (breakpoint <= Breakpoint.LG) {
                            22.px
                        } else {
                            24.px
                        }
                    }
                }
            }
        )

    }


}


