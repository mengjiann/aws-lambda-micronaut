package com.mj.power_of_three;

import com.mj.power_of_three.domain.RequestObject;
import com.mj.power_of_three.domain.ResponseObject;
import com.mj.power_of_three.service.PowerOfNumberService;
import io.micronaut.function.FunctionBean;

import java.util.function.Function;

@FunctionBean("powerOfThreeFunction")
public class PowerOfThreeFunction
    implements Function<RequestObject, ResponseObject> {

    public static final int POWER_EXPONENT = 3;

    private PowerOfNumberService powerOfNumberService;

    public PowerOfThreeFunction(PowerOfNumberService powerOfNumberService) {
        this.powerOfNumberService = powerOfNumberService;
    }

    @Override
    public ResponseObject apply(RequestObject requestObject) {
        return ResponseObject.builder()
                .number(powerOfNumberService.toPowerOf(requestObject.getNumber(),POWER_EXPONENT))
                .build();
    }

}
