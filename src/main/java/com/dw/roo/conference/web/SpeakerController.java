package com.dw.roo.conference.web;

import com.dw.roo.conference.domain.Speaker;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "speakers", formBackingObject = Speaker.class)
@RequestMapping("/speakers")
@Controller
public class SpeakerController {
}
