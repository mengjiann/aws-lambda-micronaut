package com.mj.power_of_three;

import com.mj.power_of_three.domain.RequestObject;
import com.mj.power_of_three.domain.ResponseObject;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeFunctionTest {

    @Test
    public void testViesVatValidatorFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        PowerOfThreeClient client = server.getApplicationContext().getBean(PowerOfThreeClient.class);

        RequestObject requestObject = new RequestObject();
        requestObject.setNumber(2);

        ResponseObject responseObject = client.apply(requestObject).blockingGet();

        assertEquals(8,responseObject.getNumber().intValue());

        server.stop();
    }
}