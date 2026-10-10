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
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div



@Composable
fun PrivacyPolicyBottomSection(
    bottom1Content: PrivacyContentType,
    bottom2Content: PrivacyContentType,
    breakpoint: Breakpoint
) {


    val bottom1ContentCleanMarkdown = bottom1Content.content
        // 1. strip indentation and whitespace-only lines, so headings start at column 0
        .lines().joinToString("\n") { it.trim() }
        // 2. big gaps (the old ${"\n"} stacks) become a <p> spacer
        .replace(Regex("\n{5,}"), "\n\n<p>\n\n")




    val bottom2ContentCleanMarkdown = bottom2Content.content
        // 1. strip indentation and whitespace-only lines, so headings start at column 0
        .lines().joinToString("\n") { it.trim() }
        // 2. big gaps (the old ${"\n"} stacks) become a <p> spacer
        .replace(Regex("\n{5,}"), "\n\n<p>\n\n")




    Column(modifier = Modifier.fillMaxWidth()) {

            RenderMarkdown(
                editText = bottom1ContentCleanMarkdown,
                textColor = ThemeByKizito.Button_Blue_Color.rgb,
                fontWeightValue = FontWeight.Normal ,
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


        Div(
            attrs = Modifier
                .styleModifier {

                    property(
                        propertyName = "height",
                        value = if (breakpoint <= Breakpoint.ZERO) {
                            15.px
                        } else {
                            if (breakpoint <= Breakpoint.SM) {
                                20.px
                            } else {
                                if (breakpoint <= Breakpoint.MD) {
                                    30.px
                                } else {
                                    if (breakpoint <= Breakpoint.LG) {
                                        40.px
                                    } else {
                                        50.px
                                    }
                                }
                            }
                        }
                    )

                }
                .toAttrs()
        )



        RenderMarkdown(
            editText = bottom2ContentCleanMarkdown,
            textColor = Color.black,
            fontWeightValue = FontWeight.Normal ,
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



