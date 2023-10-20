package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCarsList(Model model, @RequestParam(value = "count", defaultValue = "5") int count){
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}