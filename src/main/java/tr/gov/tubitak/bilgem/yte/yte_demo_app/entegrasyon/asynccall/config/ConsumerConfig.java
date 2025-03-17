package tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.gov.tubitak.bilgem.yte.infra.ytekafkaconsumer.consumer.ConsumerFactory;
import tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.processor.TestProcessor;
import tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.processor.dto.TestMessageDTO;

@Configuration
@RequiredArgsConstructor
public class ConsumerConfig {

    private final TestProcessor testProcessor;

    @Bean
    public ConsumerFactory<TestMessageDTO> testConsumer() {
        return new ConsumerFactory.ConsumerFactoryBuilder<>("testTopic", TestMessageDTO.class, testProcessor)
                .withTxTimeoutInSecondsForASingleMessage(900)
                .withMaxPollIntervalMs(900)
                .withSeparateConsumerGroup(true)
                .build();
    }

}
