package ma.fstt.tryjenkinsouf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class TryJenkinsOufApplication {

    @GetMapping("/")
    public String displayMessage(){
        return "Jenkins demo whith Springboot";
    }
    public static void main(String[] args) {
        SpringApplication.run(TryJenkinsOufApplication.class, args);
    }

}
