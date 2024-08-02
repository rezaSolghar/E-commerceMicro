package com.pooya.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull(message = "product is required")
        Integer productId,
        @NotNull(message = "quantity is required")
        double quantity
) {
}
