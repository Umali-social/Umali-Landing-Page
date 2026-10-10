package com.chariot.landing.privacyComponetns

import androidx.compose.runtime.Composable
import com.chariot.landing.components.RenderMarkdown
import com.chariot.landing.models.ThemeByKizito
import com.chariot.landing.pages.PrivacyContentType
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px


@Composable
fun RwandaSection(
    headerContent: PrivacyContentType,
    bodyContent: PrivacyContentType,

    breakpoint: Breakpoint
) {


    val headerContentCleanMarkdown = headerContent.content
        // 1. strip indentation and whitespace-only lines, so headings start at column 0
        .lines().joinToString("\n") { it.trim() }
        // 2. big gaps (the old ${"\n"} stacks) become a <p> spacer
        .replace(Regex("\n{5,}"), "\n\n<p>\n\n")




    val bodyContentCleanMarkdown = bodyContent.content
        // 1. strip indentation and whitespace-only lines, so headings start at column 0
        .lines().joinToString("\n") { it.trim() }
        // 2. big gaps (the old ${"\n"} stacks) become a <p> spacer
        .replace(Regex("\n{5,}"), "\n\n<p>\n\n")




    Column(modifier = Modifier.fillMaxWidth()) {


        Box( modifier = Modifier.

        fillMaxWidth()
            .background(color = ThemeByKizito.Semantic_Success_ALPHA.rgb)
            .border(
                width = 0.5.px,
                color = Color.black
            )
            .padding(8.px)
        ) {


            RenderMarkdown(
                editText = headerContentCleanMarkdown,
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



        CustomPrivacySpacer(breakpoint = breakpoint)



        RenderMarkdown(
            editText = bodyContentCleanMarkdown,
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


