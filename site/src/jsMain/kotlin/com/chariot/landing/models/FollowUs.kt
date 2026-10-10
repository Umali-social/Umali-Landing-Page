package com.chariot.landing.models

import com.chariot.landing.util.ConstantObject


enum class FollowUs(
    val title: String,
    val link: String
) {
    Instagram(
        title = "Instagram",
        link = ConstantObject.INSTAGRAM_WEB_LINK
    ),
    Tiktok(
        title = "Tiktok",
        link = ConstantObject.TIKTOK
    ),
    Twitter(
        title = "X (Twitter)",
        link = ConstantObject.X_WEB_LINK
    ),

    Linkedin(
        title = "Linkedin",
        link = ConstantObject.LINKEDIN_WEB_LINK
    )
}