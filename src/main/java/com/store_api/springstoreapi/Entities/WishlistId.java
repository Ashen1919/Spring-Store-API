package com.store_api.springstoreapi.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class WishlistId implements Serializable {
    @Serial
    private static final long serialVersionUID = 8727511747959622094L;
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "user_id")
    private Long userId;


}