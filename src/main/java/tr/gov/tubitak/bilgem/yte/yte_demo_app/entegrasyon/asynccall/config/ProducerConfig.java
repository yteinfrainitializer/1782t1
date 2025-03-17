package tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.gov.tubitak.bilgem.yte.infra.ytekafkaproducer.service.ProducerImpl;
import tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.event.TestDomainEvent;

@Configuration
public class ProducerConfig {

    @Bean
    public ProducerImpl<TestDomainEvent> testEventProducer() {
        return new ProducerImpl<>("TestTopic", messageParameter -> 1L, true, 5);
    }
}
