package xyz.b2w.converter.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/convert")
class ConverterApi {

    @GetMapping
    fun convert() = "Hello"

}