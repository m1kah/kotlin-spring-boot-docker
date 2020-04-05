package com.mika.docker.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class IndexController {
    @GetMapping("/")
    fun getIndex() = ModelAndView("index")
}
