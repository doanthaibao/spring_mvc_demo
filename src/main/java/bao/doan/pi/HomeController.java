package bao.doan.pi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // <<======= IMPORTANT!
public class HomeController {
  /**
   * Simply selects the home view to render by returning its name.
   */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public @ResponseBody User getDefaultUser() {
    User user = new User();
    user.setUserName("Bao Doan"); //Using com.fasterxml.jackson.core to auto return xml or json type
    return user;
  }
}

