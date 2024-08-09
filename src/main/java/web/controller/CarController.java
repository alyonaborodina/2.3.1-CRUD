package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @GetMapping("/cars")
    public String getCarByCount(@RequestParam(value="count", defaultValue = "5") int k, Model model) {
        model.addAttribute("countCars", carDAO.getCarByCount(k));
        return "/cars";
    }
}
