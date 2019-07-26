package example

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app")
class Configuration {
    lateinit var greeting: String
}
