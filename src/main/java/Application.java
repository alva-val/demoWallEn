import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public String home() {
        return "OK";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}