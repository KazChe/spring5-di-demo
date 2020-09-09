package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSouce;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${db.username}")
    String username;

    @Value("${db.password}")
    String password;

    @Value("${db.url}")
    String dbUrl;

    @Bean
    public FakeDataSouce fakeDataSouce() {
        FakeDataSouce fakeDataSouce = new FakeDataSouce();
        fakeDataSouce.setUser(username);
        fakeDataSouce.setPassword(password);
        fakeDataSouce.setUrl(dbUrl);

        return fakeDataSouce;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer properties =  new PropertySourcesPlaceholderConfigurer();
        return properties;
    }
}
