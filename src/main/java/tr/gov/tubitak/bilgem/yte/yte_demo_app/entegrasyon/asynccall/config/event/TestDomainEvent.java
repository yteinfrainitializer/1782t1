package tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.gov.tubitak.bilgem.yte.infra.ytekafkaproducer.service.event.DomainEvent;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestDomainEvent implements DomainEvent {
    private String data;

}
