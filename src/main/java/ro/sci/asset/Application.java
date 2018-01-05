package ro.sci.asset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Tudor Radovici
 *
 * Asset Management in IT company
 *
 */
@SpringBootApplication
@ComponentScan("ro.sci.asset")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}