package com.dw.roo.conference.web;

import com.dw.roo.conference.domain.Talk;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "talks", formBackingObject = Talk.class)
@RequestMapping("/talks")
@Controller
public class TalkController {
}
