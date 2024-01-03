package ma.fstt.tryjenkinsouf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TryJenkinsOufApplication {

    @GetMapping
    public String message(){
        return "welcome to my try";
    }
    public static void main(String[] args) {
        SpringApplication.run(TryJenkinsOufApplication.class, args);
    }

}
