package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Egg6 Egg(Needle7 needle) {
        return new Egg6(needle);
    }
    @Bean
    public static Needle7 needle(Deth8 deth) {
        return new Needle7(deth);
    }
    @Bean
    Deth8 deth() {
        return new Deth8();
    }
}