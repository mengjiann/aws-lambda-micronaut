package com.mj.power_of_three;

import com.mj.power_of_three.domain.RequestObject;
import com.mj.power_of_three.domain.ResponseObject;
import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface PowerOfThreeClient {

    @Named("powerOfThreeFunction")
    Single<ResponseObject> apply(@Body RequestObject body);
}
