package beraterkul.queryparamtask.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(@RequestParam String brand, @RequestParam(required = false,defaultValue = "--") String carModel, @RequestParam(required = false,defaultValue = "0") int year, Model model) {
        Car car = new Car(brand, carModel, year);
        model.addAttribute("car", car);
        return "view";
    }

}
