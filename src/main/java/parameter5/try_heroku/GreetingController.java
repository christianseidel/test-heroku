package parameter5.try_heroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @GetMapping("/{name}")
    public String greet(@PathVariable String name) {
        return "Hallo " + name + "! Was geht?";
    }
}
