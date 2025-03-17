package tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.processor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tr.gov.tubitak.bilgem.yte.infra.ytekafkaconsumer.consumer.MessageProcessor;
import tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.processor.dto.TestMessageDTO;

@Component
@RequiredArgsConstructor
public class TestProcessor implements MessageProcessor<TestMessageDTO> {

    @Override
    public void processMessage(TestMessageDTO dto) {
        //TODO process message
    }

}
