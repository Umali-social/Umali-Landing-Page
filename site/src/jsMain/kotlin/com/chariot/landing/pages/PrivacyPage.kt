package com.chariot.landing.pages

import androidx.compose.runtime.*
import com.chariot.landing.models.ThemeByKizito
import com.chariot.landing.privacyComponetns.GhanaSection
import com.chariot.landing.privacyComponetns.KenyaSection
import com.chariot.landing.privacyComponetns.NigeriaSection
import com.chariot.landing.privacyComponetns.PrivacyPolicyBottomSection
import com.chariot.landing.privacyComponetns.PrivacyPolicyTopSection
import com.chariot.landing.privacyComponetns.RwandaSection
import com.chariot.landing.styles.LogoStyle
import com.chariot.landing.util.ConstantObject
import com.chariot.landing.util.ResObject
import com.chariot.landing.util.isDesktop
import com.chariot.landing.util.ObjectPrivacyPolicy
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.UserSelect
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignSelf
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.onContextMenu
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.userSelect
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.CENTER


enum class PrivacyContentType(val content: String) {
    TOP(ObjectPrivacyPolicy.PRIVACY_POLICY_Top),
    RWANDA_HEADER(ObjectPrivacyPolicy.PRIVACY_POLICY_RWANDA_HEADER),
    RWANDA_BODY(ObjectPrivacyPolicy.PRIVACY_POLICY_RWANDA_Body),
    NIGERIA_HEADER(ObjectPrivacyPolicy.PRIVACY_POLICY_NIGERIA_HEADER),
    NIGERIA_BODY(ObjectPrivacyPolicy.PRIVACY_POLICY_NIGERIA_Body),
    KENYA_HEADER(ObjectPrivacyPolicy.PRIVACY_POLICY_KENYA_HEADER),
    KENYA_BODY(ObjectPrivacyPolicy.PRIVACY_POLICY_KENYA_Body),
    GHANA_HEADER(ObjectPrivacyPolicy.PRIVACY_POLICY_GHANA_HEADER),
    GHANA_BODY(ObjectPrivacyPolicy.PRIVACY_POLICY_GHANA_Body),
    BOTTOM_1(ObjectPrivacyPolicy.PRIVACY_POLICY_Bottom1),
    BOTTOM_2(ObjectPrivacyPolicy.PRIVACY_POLICY_Bottom2),
}



@OptIn(DelicateApi::class)
@Page(routeOverride = "privacy-policy")
@Composable
fun PrivacyPage() {


    val breakPoint = rememberBreakpoint()

    println(breakPoint.name)


    Box(
        modifier = Modifier
            .minHeight(100.vh)
            .width(100.vw)
            .background(ThemeByKizito.Primary.rgb)
            .overflow(Overflow.Hidden)
    ) {


        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.white)
        )
        {


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background {
                                //ThemeByKizito.Secondary.rgb,
                                image(
                                    linearGradient(180.deg) {
                                        add(ThemeByKizito.Secondary.rgb, 0.percent)
                                        add(ThemeByKizito.Secondary.rgb, 5.percent)
                                        add(ThemeByKizito.Primary.rgb, 100.percent)
                                    }
                                )
                            }
                            .padding(left = 30.px, right = 30.px,
                                top = if (breakPoint <= Breakpoint.ZERO) {
                                    30.px
                                } else {
                                    if (breakPoint <= Breakpoint.SM) {
                                        40.px
                                    } else {
                                        if (breakPoint <= Breakpoint.MD) {
                                            50.px
                                        } else {
                                            50.px
                                        }
                                    }
                                },

                                bottom = if (breakPoint <= Breakpoint.ZERO) {
                                    40.px
                                } else {
                                    if (breakPoint <= Breakpoint.SM) {
                                        80.px
                                    } else {
                                        if (breakPoint <= Breakpoint.MD) {
                                            100.px
                                        } else {
                                            130.px
                                        }
                                    }
                                }
                            ),
                        verticalArrangement = Arrangement.Top,
                        //horizontalAlignment = Alignment.CenterHorizontally,
                    ) {


                        Image(
                            modifier = Modifier
                                .thenIf(
                                    condition = isDesktop(),
                                    other = LogoStyle.toModifier()
                                )
                                .maxWidth(if (breakPoint <= Breakpoint.ZERO){
                                    80.px
                                }else {

                                    if (breakPoint <= Breakpoint.SM) {
                                        100.px
                                    } else {
                                        if (breakPoint <= Breakpoint.MD) {
                                            130.px
                                        } else {
                                            if (breakPoint <= Breakpoint.LG) {
                                                160.px
                                            } else {
                                                180.px
                                            }
                                        }
                                    }
                                })
                                // Disable right-click / long-press
                                . onContextMenu { event ->
                                    event.preventDefault()
                                    event.stopPropagation()
                                },
                            src =  ResObject.Icon.logo_white,
                            description = "logo icon",
                        )



                        P(
                            attrs = Modifier
                                .margin(all = 0.px)
                                // .transition(Transition.Companion.of(property = "background", duration = 200.ms))
                                .color(Color.white)
                                .padding(all = 0.px)
                                .fontFamily(ConstantObject.FONT_FAMILY, ConstantObject.FALL_BACK_FONT)
                                .lineHeight( 1.2)
                                .fontSize(
                                    if (breakPoint <= Breakpoint.ZERO) {
                                        20.px
                                    } else {
                                        if (breakPoint <= Breakpoint.SM) {
                                            28.px
                                        } else {
                                            if (breakPoint <= Breakpoint.MD) {
                                                32.px
                                            } else {
                                                if (breakPoint <= Breakpoint.LG) {
                                                    45.px
                                                } else {
                                                    60.px
                                                }
                                            }
                                        }
                                    }

                                )
                                //.fontStyle(FontStyle.Normal)
                                .fontWeight(FontWeight.Bold)
                                .userSelect(UserSelect.None)
                                .alignSelf(AlignSelf.Center)
                                .toAttrs()

                        ) {
                            Text(value =  "Privacy Policy")

                        }

                    }


                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(ThemeByKizito.Primary_ALPHA1.rgb)
                            .overflow(overflowY = Overflow.Scroll, overflowX = Overflow.Auto)
                            .padding(
                                leftRight = if (breakPoint <= Breakpoint.ZERO) {
                                    20.px
                                } else {
                                    if (breakPoint <= Breakpoint.SM) {
                                        50.px
                                    } else {
                                        if (breakPoint <= Breakpoint.MD) {
                                            120.px
                                        } else {
                                            if (breakPoint <= Breakpoint.LG) {
                                                150.px
                                            } else {
                                                270.px
                                            }
                                        }
                                    }
                                }
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {


                        PrivacyPolicyTopSection(
                            topContent = PrivacyContentType.TOP,
                            breakpoint = breakPoint
                        )



                        CustomSpacer(breakpoint = breakPoint)


                        RwandaSection(
                            headerContent = PrivacyContentType.RWANDA_HEADER,
                            bodyContent = PrivacyContentType.RWANDA_BODY,
                            breakpoint = breakPoint
                        )


                        CustomSpacer(breakpoint = breakPoint)

                        NigeriaSection(
                            headerContent = PrivacyContentType.NIGERIA_HEADER,
                            bodyContent = PrivacyContentType.NIGERIA_BODY,
                            breakpoint = breakPoint
                        )


                        CustomSpacer(breakpoint = breakPoint)


                        KenyaSection(
                            headerContent = PrivacyContentType.KENYA_HEADER,
                            bodyContent = PrivacyContentType.KENYA_BODY,
                            breakpoint = breakPoint
                        )

                        CustomSpacer(breakpoint = breakPoint)

                        GhanaSection(
                            headerContent = PrivacyContentType.GHANA_HEADER,
                            bodyContent = PrivacyContentType.GHANA_BODY,
                            breakpoint = breakPoint
                        )

                        CustomSpacer(breakpoint = breakPoint)


                        PrivacyPolicyBottomSection(
                            bottom1Content = PrivacyContentType.BOTTOM_1,
                            bottom2Content = PrivacyContentType.BOTTOM_2,
                            breakpoint = breakPoint
                        )


                        CustomSpacer(breakpoint = breakPoint)
                        CustomSpacer(breakpoint = breakPoint)


                    }


                }




        }






        //////////////////

    }


}




@Composable
private fun CustomSpacer(
    breakpoint: Breakpoint
){

    Div(
        attrs = Modifier
            .styleModifier {

                property(
                    propertyName = "height",
                    value = if (breakpoint <= Breakpoint.ZERO) {
                        60.px
                    } else {
                        if (breakpoint <= Breakpoint.SM) {
                            70.px
                        } else {
                            if (breakpoint <= Breakpoint.MD) {
                                80.px
                            } else {
                                if (breakpoint <= Breakpoint.LG) {
                                    90.px
                                } else {
                                    100.px
                                }
                            }
                        }
                    }
                )

            }
            .toAttrs()
    )

}