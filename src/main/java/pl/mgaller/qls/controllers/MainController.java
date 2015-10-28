package pl.mgaller.qls.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mariusz Galler <mariusz.galler@gmail.com>
 */

@Controller
public class MainController {
    
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index(ModelMap map) {
       map.put("msg", "Welcome User!");
       return "index";
   }
    
}