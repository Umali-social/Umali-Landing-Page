package com.chariot.landing.util


object ObjectPrivacyPolicy {

    /*

    val PRIVACY_POLICY_Top = """
        
# Privacy Policy
  
---

## ${ConstantObject.APP_NAME}
 
Welcome to **${ConstantObject.APP_NAME}**. We are committed to protecting your personal data and being transparent about how we use it.
 
${ConstantObject.APP_NAME} operates as a marketplace platform we connect customers, vendors, and riders. We do not manufacture food, employ riders, or hold payment funds. Payments flow directly through our licensed payment gateways and are never held by ${ConstantObject.APP_NAME}.

This Privacy Policy explains what personal data we collect, how we use it, who we share it with, and what rights you have. It applies to all users of the ${ConstantObject.APP_NAME} mobile application and website **customers, vendors, and riders** in Rwanda, Nigeria, Kenya, and Ghana.
Please read this policy carefully. By using the ${ConstantObject.APP_NAME} platform, you acknowledge that you have read and understood this Privacy Policy.
 
---
 
## Contents
This policy is organised into four country-specific sections. Please read the section that applies to your country.

- **Rwanda**  ·  Law No. 058/2021  ·  Rwanda Data Protection Office
- **Nigeria**  ·  NDPA 2023 & GAID 2025  ·  Nigeria Data Protection Commission
- **Kenya**  ·  Data Protection Act 2019  ·  Office of the Data Protection Commissioner
- **Ghana**  ·  Data Protection Act 2012 (Act 843)  ·  Data Protection Commission

    """.trimIndent()

     */


    val PRIVACY_POLICY_Top = """
        
Welcome to **${ConstantObject.APP_NAME}**. We are committed to protecting your personal data and being transparent about how we use it.
 
${ConstantObject.APP_NAME} operates as a marketplace platform we connect customers, vendors, and riders. We do not manufacture food, employ riders, or hold payment funds. Payments flow directly through our licensed payment gateways and are never held by ${ConstantObject.APP_NAME}.

This Privacy Policy explains what personal data we collect, how we use it, who we share it with, and what rights you have. It applies to all users of the ${ConstantObject.APP_NAME} mobile application and website **customers, vendors, and riders** in Rwanda, Nigeria, Kenya, and Ghana.
Please read this policy carefully. By using the ${ConstantObject.APP_NAME} platform, you acknowledge that you have read and understood this Privacy Policy.
 
  <br>
 
## Contents
This policy is organised into four country-specific sections. Please read the section that applies to your country.

- **Rwanda**  ·  Law No. 058/2021  ·  Rwanda Data Protection Office
- **Nigeria**  ·  NDPA 2023 & GAID 2025  ·  Nigeria Data Protection Commission
- **Kenya**  ·  Data Protection Act 2019  ·  Office of the Data Protection Commissioner
- **Ghana**  ·  Data Protection Act 2012 (Act 843)  ·  Data Protection Commission

    """.trimIndent()








    val PRIVACY_POLICY_RWANDA_HEADER = """
        ## RWANDA
        **Governing Law: Law No. 058/2021 on the Protection of Personal Data and Privacy**
        ${"\n"}
        Regulator: Rwanda Data Protection Office (DPO)  ·  dpo.gov.rw
    """.trimIndent()





    val PRIVACY_POLICY_RWANDA_Body = """
        This section applies to users of ${ConstantObject.APP_NAME} located in Rwanda. All personal data collected from users in Rwanda is processed in accordance with Law No. 058/2021 on the Protection of Personal Data and Privacy. ${ConstantObject.APP_NAME} is registered as a data controller with the Rwanda Data Protection Office.
         
         <p>
         <p>
         
        #### Information We Collect
        When you register on ${ConstantObject.APP_NAME}, we collect your full name, mobile phone number, and optionally your email address. Depending on how you use the platform, we collect additional information as described below.
        ${"\n"}
        For customers, we collect your delivery addresses, order history, in-app chat messages with vendors, and feedback you submit after a delivery. We also collect information about your device — such as your device type, operating system, app version, and push notification identifier — to ensure the app functions correctly on your device. When you use our AI-powered food suggestions, we retain a record of your interactions with that feature to personalise your experience.
        ${"\n"}
        For vendors, we collect your business name, business location, menu details, operating hours, and bank or mobile money account information for the purpose of processing your earnings. We also retain records of your order activity and your interactions with the ${ConstantObject.APP_NAME} vendor AI business assistant.
        ${"\n"}
        For riders, we collect your full name, mobile phone number, delivery history, and device information. We also access your precise GPS location during active deliveries to coordinate order assignment and display your estimated arrival time to customers.
        ${"\n"}
        We collect your precise GPS location when you use the app, with your explicit permission, to show nearby vendors, calculate delivery fees, and assign riders. You may withdraw location permission at any time through your device settings, though this will limit your ability to use certain features. Rider location data is not retained after a delivery is completed.
        
        <p>
        <p>

         #### How We Use Your Information
         We use the information we collect to create and manage your account, verify your identity through OTP authentication, process your orders, coordinate deliveries between customers, vendors, and riders, and send you push notifications about your orders and messages.
         ${"\n"}
         We use your location data to show you relevant vendors, calculate your delivery fee based on distance, and assign the nearest available rider to your order. We use your order history and browsing behaviour to personalise the food and vendor suggestions you see on your home screen through our AI recommendation system.
         ${"\n"}
         For vendors, we use your business and order data to operate the ${ConstantObject.APP_NAME} AI business assistant, which provides you with business insights, sales summaries, and operational recommendations based on your own activity on the platform.
         ${"\n"}
         We also use data across the platform to detect and prevent fraud, investigate disputes, maintain the security of accounts, and comply with our legal obligations in each country where we operate.
         
        <p>
        <p>
          
         #### Legal Basis for Processing
         We process your personal data on the following legal bases: your consent, where it is required for the performance of a contract with you, where we have a legal obligation to do so under Rwandan law, or where we have a legitimate interest in doing so that does not override your rights and freedoms.
          
        <p>
        <p>
        
         #### Artificial Intelligence and Automated Processing
         ${ConstantObject.APP_NAME} uses artificial intelligence in three ways. First, we use an automated recommendation system that analyses your order history, browsing behaviour, location, and time of day to personalise the food and vendor suggestions displayed on your home screen. This is an automated process — no individual reviews your recommendations. It does not affect your pricing, access to the service, or account standing. You may request that your data not be used for personalised recommendations by contacting us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         ${"\n"}
         Second, vendors have access to the ${ConstantObject.APP_NAME} AI business assistant, which generates business insights and recommendations by analysing the vendor's own order data, sales trends, menu performance, and customer ratings. This assistant works exclusively with the vendor's own business data. Individual customer personal data is not surfaced to vendors through this feature.
         ${"\n"}
         Third, when a customer places an order, the platform automatically sends a standard order notification message to the vendor through the in-app chat. This is a rule-based automated trigger — not generative AI — and the message content is standardised.
         ${"\n"}
         We also use automated systems to monitor platform activity for fraud, suspicious behaviour, and security threats. These systems run in real time, but no account action is taken solely on the basis of an automated decision without human review.
         ${"\n"}
         You have the right to object to profiling and automated decision-making, to request human review of any automated decision that has affected your account, and to request an explanation of how such a decision was made. To exercise any of these rights, please contact [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         
        <p>
        <p>
          
         #### Payment Processing
         Payments on ${ConstantObject.APP_NAME} are processed through our licensed third-party payment gateways **PawaPay** in Rwanda and Kenya, and **Paystack** in Nigeria and Ghana. These gateways handle the collection of payments from customers and the disbursement of earnings to vendors. We do not store your full payment credentials. To process your payment, we share your transaction amount and payment identifier with the relevant gateway. You are encouraged to review the privacy policies of **PawaPay** [pawapay.io](https://pawapay.io) and **Paystack** [paystack.com](https://paystack.com) for information on how they handle your data.
         
        <p>
        <p>
          
         #### How We Share Your Information
         We do not sell your personal data. We share your information only to the extent necessary to deliver the service.
         ${"\n"}
         We share your order details — including your name, delivery address, and order contents — with the vendor you have ordered from, so they can prepare your order. We share your delivery address and the vendor's pickup location with your assigned rider to fulfil the delivery. We share the minimum information required for payment processing with our payment gateway.
         ${"\n"}
         We may disclose your information to legal or regulatory authorities where required by law or a lawful order in Rwanda, Nigeria, Kenya, or Ghana. In the event of a merger or acquisition, your data may transfer to the successor entity, subject to the same privacy protections, and we will notify you in advance where possible.
         
        <p>
        <p>
          
         #### Your Rights
         As a user in Rwanda, you have the following rights regarding your personal data. To exercise any of these rights, please email [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We will respond within 30 days and may verify your identity before processing your request.
         
         - The right to be informed about how your personal data is collected and used
         - The right to access the personal data we hold about you
         - The right to correct inaccurate or incomplete data
         - The right to request deletion of your personal data
         - The right to object to or restrict the processing of your data
         - The right to withdraw consent at any time, without affecting past processing
         - The right to object to automated decision-making and profiling
         - The right to lodge a complaint with the Rwanda Data Protection Office at dpo.gov.rw
          
         #### How Long We Retain Your Information
         We retain your account information for as long as your account is active, and for two years after your account is deleted. Order history is retained for five years for service, legal, and dispute resolution purposes. Payment transaction records are retained for seven years in line with financial record-keeping requirements. In-app chat messages are retained for twelve months and then deleted, unless required for an ongoing dispute. AI interaction data is retained for six months to improve accuracy and is then anonymised or deleted. Rider location data is not retained after a delivery is completed.
          
        <p>
        <p>
        
         #### Security
         We apply appropriate technical and organisational measures to protect your personal data. All data transmitted between your device and our servers is encrypted. Account access is protected by OTP-based authentication. Access to personal data is restricted to staff who require it for their role. We conduct regular security testing and monitoring to safeguard the platform.
         
        <p>
        <p>
          
         #### Data Breach Notification
         In the event of a personal data breach that poses a risk to your rights and freedoms, we will notify the National Cyber Security Authority (NCSA) within 48 hours and will notify affected users without undue delay, in accordance with Law No. 058/2021.
         
        <p>
        <p>
          
         #### Children
         ${ConstantObject.APP_NAME} is not intended for use by persons under the age of 18. We do not knowingly collect personal data from children. If you believe we have collected data from a child, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app) and we will delete it promptly.
         
        <p>
        <p>
          
         #### Changes to This Policy
         We review this Privacy Policy at least annually. When we make material changes, we will notify you through the app in advance of the changes taking effect. The Effective Date shown at the top of this policy will reflect the most recent version. Your continued use of ${ConstantObject.APP_NAME} after notification of changes constitutes acceptance of the updated policy.
         
        <p>
        <p>
          
         #### Contact Us
         If you have any questions about this Privacy Policy or wish to exercise your data protection rights, please contact us at  [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We aim to respond within five business days.
        
    """.trimIndent()


    val PRIVACY_POLICY_NIGERIA_HEADER = """
        ## NIGERIA
        **Governing Law: Nigeria Data Protection Act (NDPA) 2023 & General Application and Implementation Directive (GAID) 2025**
        ${"\n"}
        Regulator: Nigeria Data Protection Commission (NDPC)  ·  ndpc.gov.ng
    """.trimIndent()


    val PRIVACY_POLICY_NIGERIA_Body = """
        This section applies to users of ${ConstantObject.APP_NAME} located in Nigeria. All personal data is processed in accordance with the Nigeria Data Protection Act 2023 (NDPA) and the General Application and Implementation Directive (GAID), which took effect on 19 September 2025.
              
        <p>
        <p>
        
        #### Information We Collect
        When you register on ${ConstantObject.APP_NAME}, we collect your full name, mobile phone number, and optionally your email address. Depending on how you use the platform, we collect additional information as described below.
        ${"\n"}
        For customers, we collect your delivery addresses, order history, in-app chat messages with vendors, and feedback you submit after a delivery. We also collect information about your device — such as your device type, operating system, app version, and push notification identifier — to ensure the app functions correctly on your device. When you use our AI-powered food suggestions, we retain a record of your interactions with that feature to personalise your experience.
        ${"\n"}
        For vendors, we collect your business name, business location, menu details, operating hours, and bank or mobile money account information for the purpose of processing your earnings. We also retain records of your order activity and your interactions with the ${ConstantObject.APP_NAME} vendor AI business assistant.
        ${"\n"}
        For riders, we collect your full name, mobile phone number, delivery history, and device information. We also access your precise GPS location during active deliveries to coordinate order assignment and display your estimated arrival time to customers.
        ${"\n"}
        We collect your precise GPS location when you use the app, with your explicit permission, to show nearby vendors, calculate delivery fees, and assign riders. You may withdraw location permission at any time through your device settings, though this will limit your ability to use certain features. Rider location data is not retained after a delivery is completed.
        
        <p>
        <p>
        
         #### How We Use Your Information
         We use the information we collect to create and manage your account, verify your identity through OTP authentication, process your orders, coordinate deliveries between customers, vendors, and riders, and send you push notifications about your orders and messages.
         ${"\n"}
         We use your location data to show you relevant vendors, calculate your delivery fee based on distance, and assign the nearest available rider to your order. We use your order history and browsing behaviour to personalise the food and vendor suggestions you see on your home screen through our AI recommendation system.
         ${"\n"}
         For vendors, we use your business and order data to operate the ${ConstantObject.APP_NAME} AI business assistant, which provides you with business insights, sales summaries, and operational recommendations based on your own activity on the platform.
         ${"\n"}
         We also use data across the platform to detect and prevent fraud, investigate disputes, maintain the security of accounts, and comply with our legal obligations in each country where we operate.
         
        <p>
        <p>
          
         #### Legal Basis for Processing
         We process your personal data on the following legal bases: your freely given, specific, informed, and unambiguous consent; where processing is necessary for the performance of a contract with you; where we have a legal obligation under Nigerian law; or where we have a legitimate interest, assessed through a Legitimate Interest Assessment as required by the GAID 2025, that does not override your rights.
         
        <p>
        <p>
          
         #### Data Protection Officer
         In compliance with the NDPA 2023, ${ConstantObject.APP_NAME} has designated a Data Protection Officer responsible for overseeing our data protection practices. You may contact our Data Protection Officer at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         
        <p>
        <p>
          
         #### Artificial Intelligence and Automated Processing
         ${ConstantObject.APP_NAME} uses artificial intelligence in three ways. First, we use an automated recommendation system that analyses your order history, browsing behaviour, location, and time of day to personalise the food and vendor suggestions displayed on your home screen. This is an automated process — no individual reviews your recommendations. It does not affect your pricing, access to the service, or account standing. You may request that your data not be used for personalised recommendations by contacting us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         ${"\n"}
         Second, vendors have access to the ${ConstantObject.APP_NAME} AI business assistant, which generates business insights and recommendations by analysing the vendor's own order data, sales trends, menu performance, and customer ratings. This assistant works exclusively with the vendor's own business data. Individual customer personal data is not surfaced to vendors through this feature.
         ${"\n"}
         Third, when a customer places an order, the platform automatically sends a standard order notification message to the vendor through the in-app chat. This is a rule-based automated trigger — not generative AI — and the message content is standardised.
         ${"\n"}
         We also use automated systems to monitor platform activity for fraud, suspicious behaviour, and security threats. These systems run in real time, but no account action is taken solely on the basis of an automated decision without human review.
         ${"\n"}
         You have the right to object to profiling and automated decision-making, to request human review of any automated decision that has affected your account, and to request an explanation of how such a decision was made. To exercise any of these rights, please contact [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         
        <p>
        <p>
          
         #### Payment Processing
         Payments on ${ConstantObject.APP_NAME} are processed through our licensed third-party payment gateways **PawaPay** in Rwanda and Kenya, and **Paystack** in Nigeria and Ghana. These gateways handle the collection of payments from customers and the disbursement of earnings to vendors. We do not store your full payment credentials. To process your payment, we share your transaction amount and payment identifier with the relevant gateway. You are encouraged to review the privacy policies of **PawaPay** [pawapay.io](https://pawapay.io) and **Paystack** [paystack.com](https://paystack.com) for information on how they handle your data.
         
        <p>
        <p>
          
         #### How We Share Your Information
         We do not sell your personal data. We share your information only to the extent necessary to deliver the service.
         ${"\n"}
         We share your order details — including your name, delivery address, and order contents — with the vendor you have ordered from, so they can prepare your order. We share your delivery address and the vendor's pickup location with your assigned rider to fulfil the delivery. We share the minimum information required for payment processing with our payment gateway.
         ${"\n"}
         We may disclose your information to legal or regulatory authorities where required by law or a lawful order in Rwanda, Nigeria, Kenya, or Ghana. In the event of a merger or acquisition, your data may transfer to the successor entity, subject to the same privacy protections, and we will notify you in advance where possible.
         
        <p>
        <p>
          
         #### Your Rights
         As a user in Nigeria, you have the following rights regarding your personal data. To exercise any of these rights, please email [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We will respond within 30 days and may verify your identity before processing your request.
         
         - The right to be informed about the collection and processing of your personal data
         - The right to access your personal data and receive a copy
         - The right to rectification of inaccurate or incomplete data
         - The right to erasure of your personal data in certain circumstances
         - The right to restrict or object to the processing of your data, including for direct marketing
         - The right to data portability in a structured, machine-readable format
         - The right to object to automated decision-making and profiling
         - The right to withdraw consent at any time without affecting past processing
         - The right to lodge a complaint with the Nigeria Data Protection Commission at ndpc.gov.ng
         
        <p>
        <p>
          
         #### How Long We Retain Your Information
         We retain your account information for as long as your account is active, and for two years after your account is deleted. Order history is retained for five years for service, legal, and dispute resolution purposes. Payment transaction records are retained for seven years in line with financial record-keeping requirements. In-app chat messages are retained for twelve months and then deleted, unless required for an ongoing dispute. AI interaction data is retained for six months to improve accuracy and is then anonymised or deleted. Rider location data is not retained after a delivery is completed.
         
        <p>
        <p>
          
         #### Security
         We apply appropriate technical and organisational measures to protect your personal data. All data transmitted between your device and our servers is encrypted. Account access is protected by OTP-based authentication. Access to personal data is restricted to staff who require it for their role. We conduct regular security testing and monitoring to safeguard the platform.
          
        <p>
        <p>
        ${"\n"}
        
         #### Annual Compliance
         In compliance with the GAID 2025, ${ConstantObject.APP_NAME} conducts annual privacy compliance audits and files audit returns with the Nigeria Data Protection Commission.
          
        <p>
        <p>
        
         #### Data Breach Notification
         In the event of a personal data breach that poses a risk to your rights and freedoms, we will notify the Nigeria Data Protection Commission and affected users without undue delay, in accordance with the NDPA 2023.
          
        <p>
        <p>
        
         #### Children
         ${ConstantObject.APP_NAME} is not intended for use by persons under the age of 18. We do not knowingly collect personal data from children. If you believe we have collected data from a child, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app) and we will delete it promptly.
          
        <p>
        <p>
        
         #### Changes to This Policy
         We review this Privacy Policy at least annually. When we make material changes, we will notify you through the app in advance of the changes taking effect. The Effective Date shown at the top of this policy will reflect the most recent version. Your continued use of ${ConstantObject.APP_NAME} after notification of changes constitutes acceptance of the updated policy.
          
        <p>
        <p>
        
         #### Contact Us
         If you have any questions about this Privacy Policy or wish to exercise your data protection rights, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We aim to respond within five business days.
        
    """.trimIndent()



    val PRIVACY_POLICY_KENYA_HEADER = """
        ## KENYA
        **Governing Law: Data Protection Act No. 24 of 2019 & Data Protection (General) Regulations 2021**
        ${"\n"}
        Regulator: Office of the Data Protection Commissioner (ODPC)  ·  odpc.go.ke
    """.trimIndent()


    val PRIVACY_POLICY_KENYA_Body = """
        This section applies to users of ${ConstantObject.APP_NAME} located in Kenya. All personal data is processed in accordance with Kenya's Data Protection Act No. 24 of 2019 and the Data Protection (General) Regulations 2021. ${ConstantObject.APP_NAME} is registered as a data controller with the Office of the Data Protection Commissioner (ODPC) as required by law.
        
        <p>
        <p>
         
        #### Information We Collect
        When you register on ${ConstantObject.APP_NAME}, we collect your full name, mobile phone number, and optionally your email address. Depending on how you use the platform, we collect additional information as described below.
        ${"\n"}
        For customers, we collect your delivery addresses, order history, in-app chat messages with vendors, and feedback you submit after a delivery. We also collect information about your device — such as your device type, operating system, app version, and push notification identifier — to ensure the app functions correctly on your device. When you use our AI-powered food suggestions, we retain a record of your interactions with that feature to personalise your experience.
        ${"\n"}
        For vendors, we collect your business name, business location, menu details, operating hours, and bank or mobile money account information for the purpose of processing your earnings. We also retain records of your order activity and your interactions with the ${ConstantObject.APP_NAME} vendor AI business assistant.
        ${"\n"}
        For riders, we collect your full name, mobile phone number, delivery history, and device information. We also access your precise GPS location during active deliveries to coordinate order assignment and display your estimated arrival time to customers.
        ${"\n"}
        We collect your precise GPS location when you use the app, with your explicit permission, to show nearby vendors, calculate delivery fees, and assign riders. You may withdraw location permission at any time through your device settings, though this will limit your ability to use certain features. Rider location data is not retained after a delivery is completed.
         
        <p>
        <p>
        
        #### How We Use Your Information
        We use the information we collect to create and manage your account, verify your identity through OTP authentication, process your orders, coordinate deliveries between customers, vendors, and riders, and send you push notifications about your orders and messages.
        ${"\n"}
        We use your location data to show you relevant vendors, calculate your delivery fee based on distance, and assign the nearest available rider to your order. We use your order history and browsing behaviour to personalise the food and vendor suggestions you see on your home screen through our AI recommendation system.
        ${"\n"}
        For vendors, we use your business and order data to operate the ${ConstantObject.APP_NAME} AI business assistant, which provides you with business insights, sales summaries, and operational recommendations based on your own activity on the platform.
        ${"\n"}
        We also use data across the platform to detect and prevent fraud, investigate disputes, maintain the security of accounts, and comply with our legal obligations in each country where we operate.
         
        <p>
        <p>
        
        #### Legal Basis for Processing
        We process your personal data on the following legal bases: your consent; where processing is necessary for the performance of a contract with you; where we have a legal obligation under Kenyan law; to protect vital interests; or where we have a legitimate interest that does not override your rights and freedoms.
         
        <p>
        <p>
        
        #### Artificial Intelligence and Automated Processing
        ${ConstantObject.APP_NAME} uses artificial intelligence in three ways. First, we use an automated recommendation system that analyses your order history, browsing behaviour, location, and time of day to personalise the food and vendor suggestions displayed on your home screen. This is an automated process — no individual reviews your recommendations. It does not affect your pricing, access to the service, or account standing. You may request that your data not be used for personalised recommendations by contacting us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
        ${"\n"}
        Second, vendors have access to the ${ConstantObject.APP_NAME} AI business assistant, which generates business insights and recommendations by analysing the vendor's own order data, sales trends, menu performance, and customer ratings. This assistant works exclusively with the vendor's own business data. Individual customer personal data is not surfaced to vendors through this feature.
        ${"\n"}
        Third, when a customer places an order, the platform automatically sends a standard order notification message to the vendor through the in-app chat. This is a rule-based automated trigger — not generative AI — and the message content is standardised.
        ${"\n"}
        We also use automated systems to monitor platform activity for fraud, suspicious behaviour, and security threats. These systems run in real time, but no account action is taken solely on the basis of an automated decision without human review.
        ${"\n"}
        You have the right to object to profiling and automated decision-making, to request human review of any automated decision that has affected your account, and to request an explanation of how such a decision was made. To exercise any of these rights, please contact [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         
        <p>
        <p>
        
        #### Payment Processing
        Payments on ${ConstantObject.APP_NAME} are processed through our licensed third-party payment gateways **PawaPay** in Rwanda and Kenya, and **Paystack** in Nigeria and Ghana. These gateways handle the collection of payments from customers and the disbursement of earnings to vendors. We do not store your full payment credentials. To process your payment, we share your transaction amount and payment identifier with the relevant gateway. You are encouraged to review the privacy policies of **PawaPay** [pawapay.io](https://pawapay.io) and **Paystack** [paystack.com](https://paystack.com) for information on how they handle your data.
         
        <p>
        <p>
        
        #### How We Share Your Information
        We do not sell your personal data. We share your information only to the extent necessary to deliver the service.
        ${"\n"}
        We share your order details — including your name, delivery address, and order contents — with the vendor you have ordered from, so they can prepare your order. We share your delivery address and the vendor's pickup location with your assigned rider to fulfil the delivery. We share the minimum information required for payment processing with our payment gateway.
        ${"\n"}
        We may disclose your information to legal or regulatory authorities where required by law or a lawful order in Rwanda, Nigeria, Kenya, or Ghana. In the event of a merger or acquisition, your data may transfer to the successor entity, subject to the same privacy protections, and we will notify you in advance where possible.
         
        <p>
        <p>
        
        #### Your Rights
        As a user in Kenya, you have the following rights regarding your personal data. To exercise any of these rights, please email [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We will respond within 30 days and may verify your identity before processing your request.
        
        - The right to be informed of the purpose and manner of processing your personal data
        - The right to access the personal data we hold about you
        - The right to correction of false, misleading, or outdated data
        - The right to deletion of personal data that is no longer necessary
        - The right to object to or restrict the processing of your data
        - The right to data portability in a structured, machine-readable format
        - The right not to be subject to a decision based solely on automated processing that significantly affects you, and the right to request human review of any such decision
        - The right to withdraw consent at any time
        - The right to lodge a complaint with the Office of the Data Protection Commissioner at odpc.go.ke
         
        <p>
        <p>
        
        #### How Long We Retain Your Information
        We retain your account information for as long as your account is active, and for two years after your account is deleted. Order history is retained for five years for service, legal, and dispute resolution purposes. Payment transaction records are retained for seven years in line with financial record-keeping requirements. In-app chat messages are retained for twelve months and then deleted, unless required for an ongoing dispute. AI interaction data is retained for six months to improve accuracy and is then anonymised or deleted. Rider location data is not retained after a delivery is completed.
         
        <p>
        <p>
        
        #### Security
        We apply appropriate technical and organisational measures to protect your personal data. All data transmitted between your device and our servers is encrypted. Account access is protected by OTP-based authentication. Access to personal data is restricted to staff who require it for their role. We conduct regular security testing and monitoring to safeguard the platform.
         
        <p>
        <p>
        
        #### Data Breach Notification
        In the event of a personal data breach, we will notify the Office of the Data Protection Commissioner within 72 hours of becoming aware of the breach, and will notify affected users without undue delay, in accordance with the Data Protection (General) Regulations 2021.
         
        <p>
        <p>
        
        #### Children
        ${ConstantObject.APP_NAME} is not intended for use by persons under the age of 18. We do not knowingly collect personal data from children. If you believe we have collected data from a child, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app) and we will delete it promptly.
         
        <p>
        <p>
        
        #### Changes to This Policy
        We review this Privacy Policy at least annually. When we make material changes, we will notify you through the app in advance of the changes taking effect. The Effective Date shown at the top of this policy will reflect the most recent version. Your continued use of ${ConstantObject.APP_NAME} after notification of changes constitutes acceptance of the updated policy.
         
        <p>
        <p>
        
        #### Contact Us
        If you have any questions about this Privacy Policy or wish to exercise your data protection rights, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We aim to respond within five business days.
    """.trimIndent()




    val PRIVACY_POLICY_GHANA_HEADER = """
        ## GHANA
        **Governing Law: Data Protection Act, 2012 (Act 843) & Article 18(2) of the Constitution of Ghana 1992**
        ${"\n"}
        Regulator: Data Protection Commission (DPC)  ·  dataprotection.org.gh
    """.trimIndent()


    val PRIVACY_POLICY_GHANA_Body = """
        This section applies to users of ${ConstantObject.APP_NAME} located in Ghana. All personal data is processed in accordance with Ghana's Data Protection Act 2012 (Act 843) and Article 18(2) of the 1992 Constitution, which grants citizens a fundamental right to privacy. ${ConstantObject.APP_NAME} is registered as a data controller with the Ghana Data Protection Commission, and registration is renewed every two years as required by law.
         
        <p>
        <p>
        
        #### Information We Collect
        When you register on ${ConstantObject.APP_NAME}, we collect your full name, mobile phone number, and optionally your email address. Depending on how you use the platform, we collect additional information as described below.
        ${"\n"}
        For customers, we collect your delivery addresses, order history, in-app chat messages with vendors, and feedback you submit after a delivery. We also collect information about your device — such as your device type, operating system, app version, and push notification identifier — to ensure the app functions correctly on your device. When you use our AI-powered food suggestions, we retain a record of your interactions with that feature to personalise your experience.
        ${"\n"}
        For vendors, we collect your business name, business location, menu details, operating hours, and bank or mobile money account information for the purpose of processing your earnings. We also retain records of your order activity and your interactions with the ${ConstantObject.APP_NAME} vendor AI business assistant.
        ${"\n"}
        For riders, we collect your full name, mobile phone number, delivery history, and device information. We also access your precise GPS location during active deliveries to coordinate order assignment and display your estimated arrival time to customers.
        ${"\n"}
        We collect your precise GPS location when you use the app, with your explicit permission, to show nearby vendors, calculate delivery fees, and assign riders. You may withdraw location permission at any time through your device settings, though this will limit your ability to use certain features. Rider location data is not retained after a delivery is completed.
         
        <p>
        <p>
        
        #### How We Use Your Information
        We use the information we collect to create and manage your account, verify your identity through OTP authentication, process your orders, coordinate deliveries between customers, vendors, and riders, and send you push notifications about your orders and messages.
        ${"\n"}
        We use your location data to show you relevant vendors, calculate your delivery fee based on distance, and assign the nearest available rider to your order. We use your order history and browsing behaviour to personalise the food and vendor suggestions you see on your home screen through our AI recommendation system.
        ${"\n"}
        For vendors, we use your business and order data to operate the ${ConstantObject.APP_NAME} AI business assistant, which provides you with business insights, sales summaries, and operational recommendations based on your own activity on the platform.
        ${"\n"}
        We also use data across the platform to detect and prevent fraud, investigate disputes, maintain the security of accounts, and comply with our legal obligations in each country where we operate.
         
        <p>
        <p>
        
        #### Consent
        Under Ghana's Data Protection Act 2012, we obtain your explicit consent before collecting or processing your personal data. You may withdraw your consent at any time by contacting us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). Withdrawal of consent does not affect the lawfulness of any processing carried out before the withdrawal.
         
        <p>
        <p>
        
        #### Artificial Intelligence and Automated Processing
        ${ConstantObject.APP_NAME} uses artificial intelligence in three ways. First, we use an automated recommendation system that analyses your order history, browsing behaviour, location, and time of day to personalise the food and vendor suggestions displayed on your home screen. This is an automated process — no individual reviews your recommendations. It does not affect your pricing, access to the service, or account standing. You may request that your data not be used for personalised recommendations by contacting us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
        ${"\n"}
        Second, vendors have access to the ${ConstantObject.APP_NAME} AI business assistant, which generates business insights and recommendations by analysing the vendor's own order data, sales trends, menu performance, and customer ratings. This assistant works exclusively with the vendor's own business data. Individual customer personal data is not surfaced to vendors through this feature.
        ${"\n"}
        Third, when a customer places an order, the platform automatically sends a standard order notification message to the vendor through the in-app chat. This is a rule-based automated trigger — not generative AI — and the message content is standardised.
        ${"\n"}
        We also use automated systems to monitor platform activity for fraud, suspicious behaviour, and security threats. These systems run in real time, but no account action is taken solely on the basis of an automated decision without human review.
        ${"\n"}
        You have the right to object to profiling and automated decision-making, to request human review of any automated decision that has affected your account, and to request an explanation of how such a decision was made. To exercise any of these rights, please contact [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app).
         
        <p>
        <p>
        
        #### Payment Processing
        Payments on ${ConstantObject.APP_NAME} are processed through our licensed third-party payment gateways **PawaPay** in Rwanda and Kenya, and **Paystack** in Nigeria and Ghana. These gateways handle the collection of payments from customers and the disbursement of earnings to vendors. We do not store your full payment credentials. To process your payment, we share your transaction amount and payment identifier with the relevant gateway. You are encouraged to review the privacy policies of **PawaPay** [pawapay.io](https://pawapay.io) and **Paystack** [paystack.com](https://paystack.com) for information on how they handle your data.
         
        <p>
        <p>
        
        #### How We Share Your Information
        We do not sell your personal data. We share your information only to the extent necessary to deliver the service.
        ${"\n"}
        We share your order details — including your name, delivery address, and order contents — with the vendor you have ordered from, so they can prepare your order. We share your delivery address and the vendor's pickup location with your assigned rider to fulfil the delivery. We share the minimum information required for payment processing with our payment gateway.
        ${"\n"}
        We may disclose your information to legal or regulatory authorities where required by law or a lawful order in Rwanda, Nigeria, Kenya, or Ghana. In the event of a merger or acquisition, your data may transfer to the successor entity, subject to the same privacy protections, and we will notify you in advance where possible.
         
        <p>
        <p>
        
        #### Your Rights
        As a user in Ghana, you have the following rights regarding your personal data. To exercise any of these rights, please email [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We will respond within 30 days and may verify your identity before processing your request.
        
        - The right to be informed about the collection and use of your personal data
        - The right to access the personal data we hold about you
        - The right to correct inaccurate, misleading, or outdated data
        - The right to request deletion of personal data that is no longer necessary
        - The right to object to or restrict the processing of your data
        - The right to object to automated decision-making and profiling
        - The right to withdraw consent at any time without affecting past processing
        - The right to lodge a complaint with the Data Protection Commission at dataprotection.org.gh
         
        <p>
        <p>
        
        #### How Long We Retain Your Information
        We retain your account information for as long as your account is active, and for two years after your account is deleted. Order history is retained for five years for service, legal, and dispute resolution purposes. Payment transaction records are retained for seven years in line with financial record-keeping requirements. In-app chat messages are retained for twelve months and then deleted, unless required for an ongoing dispute. AI interaction data is retained for six months to improve accuracy and is then anonymised or deleted. Rider location data is not retained after a delivery is completed.
         
        <p>
        <p>
        
        #### Security
        We apply appropriate technical and organisational measures to protect your personal data. All data transmitted between your device and our servers is encrypted. Account access is protected by OTP-based authentication. Access to personal data is restricted to staff who require it for their role. We conduct regular security testing and monitoring to safeguard the platform.
         
        <p>
        <p>
        
        #### Data Breach Notification
        In the event of a personal data breach that poses a risk to your rights and freedoms, we will notify the Data Protection Commission and affected users as required under Act 843.
         
       <p>
       <p>
        
        #### Cross-Border Data Transfers
        Ghana's Data Protection Act 2012 prohibits the sale or purchase of personal data. Where your data is transferred outside Ghana, we ensure the recipient provides adequate data protection standards consistent with Act 843, the ECOWAS Supplementary Act on Personal Data Protection, and the Malabo Convention.
         
        <p>
        <p>
        
        #### Children
        ${ConstantObject.APP_NAME} is not intended for use by persons under the age of 18. We do not knowingly collect personal data from children. If you believe we have collected data from a child, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app) and we will delete it promptly.
         
       <p>
       <p>
        
        #### Changes to This Policy
        We review this Privacy Policy at least annually. When we make material changes, we will notify you through the app in advance of the changes taking effect. The Effective Date shown at the top of this policy will reflect the most recent version. Your continued use of ${ConstantObject.APP_NAME} after notification of changes constitutes acceptance of the updated policy.
         
        <p>
        <p>
        
        #### Contact Us
        If you have any questions about this Privacy Policy or wish to exercise your data protection rights, please contact us at [support@${ConstantObject.APP_NAME.lowercase()}.app](https://mail.google.com/mail/?view=cm&to=support@${ConstantObject.APP_NAME}.app). We aim to respond within five business days.
    """.trimIndent()




    val PRIVACY_POLICY_Bottom1 = """
        *This Privacy Policy applies to all users of the ${ConstantObject.APP_NAME} platform in Rwanda, Nigeria, Kenya, and Ghana. It was prepared in compliance with Law No. 058/2021, the Nigeria Data Protection Act 2023 and GAID 2025, the Kenya Data Protection Act 2019, and the Ghana Data Protection Act 2012 (Act 843). For questions, contact [support@umali.app](mailto:support@umali.app).*
    """.trimIndent()



    val PRIVACY_POLICY_Bottom2 = """
        **Effective Date:** 2026 · **Last Reviewed:** 2026 · **Version 1.0**
    """.trimIndent()


}