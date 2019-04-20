package com.mj.power_of_three.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class ResponseObject {

    private Integer number;

    public ResponseObject() {
    }

    @Builder
    public ResponseObject(Integer number) {
        this.number = number;
    }
}
