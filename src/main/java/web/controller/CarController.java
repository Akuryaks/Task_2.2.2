package web.controller;

import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCountCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        if (count != null)
            model.addAttribute("cars", Car.cars.subList(0, count));
        else
            model.addAttribute("cars", Car.cars);

        return "cars";
    }
}
