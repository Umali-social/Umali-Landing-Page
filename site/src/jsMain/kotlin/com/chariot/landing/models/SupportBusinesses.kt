package com.chariot.landing.models

import com.chariot.landing.util.ResObject






enum class SupportBusinesses(
    val title: String,
    val extraTitle: String,
    val description: String,
    val img: String,
) {

    Content(
        title = """
            Supports Small
            businesses like
        """.trimIndent(),
        extraTitle = """
            Mama Nkechi store
        """.trimIndent(),
        description = """
            **UMALI** considers local vendors(SME’s) giving them opportunity to grow their business and reach more customers.

            You can get your favourite dish and groceries from your local vendors on UMALI
        """.trimIndent(),
        img = ResObject.Image.img_support_busines,

    )


}