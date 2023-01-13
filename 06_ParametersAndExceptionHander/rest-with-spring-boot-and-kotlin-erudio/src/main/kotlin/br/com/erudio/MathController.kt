package br.com.erudio

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class MathController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping(value = ["sum/{numberOne}/{numberTwo}"])
    fun greeting(
                    @RequestParam(value="numberOne") numberOne: String?,
                    @RequestParam(value="numberTwo") numberTwo: String?
    ): Double {
        return 1.0
    }
}