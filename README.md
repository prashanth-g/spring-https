# Spring HTTPS

A Web application runs with HTTPS Certificate

To generate certificate

    keytool -genkey -alias https-example -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks
