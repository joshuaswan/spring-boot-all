package com.joshua.sba

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by joshua on 2017/10/9.
 */
@RestController
class HelloController {

    @RequestMapping("/")
    def hello() {
        "Hello World"
    }

}
