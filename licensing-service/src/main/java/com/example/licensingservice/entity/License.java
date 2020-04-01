package com.example.licensingservice.entity;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.With;

public class License {
    @With(AccessLevel.PUBLIC) @NonNull private final String id;
    @With(AccessLevel.PUBLIC) @NonNull private final String productName;
    @With(AccessLevel.PUBLIC) private final String licenseType;
    @With(AccessLevel.PUBLIC) private final String organizationId;

    public License(@NonNull String id, @NonNull String productName, String licenseType, String organizationId) {
        this.id = id;
        this.productName = productName;
        this.licenseType = licenseType;
        this.organizationId = organizationId;
    }
}
