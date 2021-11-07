package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitialController {
  @RequestMapping("/list")
  public String Initial(Model model) {
    return "Homepage";
  }
}
