package com.charlie.world.qtms.entitiy;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private T data;

    public BaseResponse(T data) {
        this.data = data;
    }
}
