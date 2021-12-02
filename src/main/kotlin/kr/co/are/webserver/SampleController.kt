package kr.co.are.webserver

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody


private val logger = KotlinLogging.logger {}

@Controller
@PropertySource("classpath:application.yml")
class SampleController {

    @Value("\${are.text}")
    private lateinit var text:String

    @GetMapping(value = ["/"])
    @ResponseBody
    fun sampleString(): String? {


        return "Test 입니다. ${text}"
    }
}