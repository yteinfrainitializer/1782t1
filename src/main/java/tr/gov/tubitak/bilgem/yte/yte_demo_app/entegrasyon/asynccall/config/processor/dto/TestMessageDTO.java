package tr.gov.tubitak.bilgem.yte.yte_demo_app.entegrasyon.asynccall.config.processor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestMessageDTO implements Serializable {
    private String data;

}
