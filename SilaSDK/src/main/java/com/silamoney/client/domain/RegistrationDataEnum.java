package com.silamoney.client.domain;

import lombok.Getter;

public enum RegistrationDataEnum {
    EMAIL("email"), PHONE("phone"), IDENTITY("identity"), ADDRESS("address"), ENTITY("entity"), DEVICE("device"), ID_DOCUMENT("id_document");

    @Getter
    private String uri;

    private RegistrationDataEnum(String uri) {
        this.uri = uri;
    }
}
