package tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicCreationConfig {

    @Value("${spring.kafka.replicas:1}")
    private int REPLICAS;

    @Bean
    public NewTopic testTopic() {
        return TopicBuilder.name("testTopic")
                .partitions(10)
                .replicas(REPLICAS)
                .build();
    }

}
