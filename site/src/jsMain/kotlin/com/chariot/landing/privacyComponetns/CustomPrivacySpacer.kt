package com.chariot.landing.privacyComponetns

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div




@Composable
fun CustomPrivacySpacer(
    breakpoint: Breakpoint
){

    Div(
        attrs = Modifier
            .styleModifier {

                property(
                    propertyName = "height",
                    value = if (breakpoint <= Breakpoint.ZERO) {
                        30.px
                    } else {
                        if (breakpoint <= Breakpoint.SM) {
                            40.px
                        } else {
                            if (breakpoint <= Breakpoint.MD) {
                                50.px
                            } else {
                                if (breakpoint <= Breakpoint.LG) {
                                    60.px
                                } else {
                                    70.px
                                }
                            }
                        }
                    }
                )

            }
            .toAttrs()
    )

}