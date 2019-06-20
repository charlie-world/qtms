package com.charlie.world.qtms.service;

import lombok.Data;

@Data
public class Hello {
    private final String msg;

    public Hello() {
        this.msg = "Hello QTMS !";
    }
}
