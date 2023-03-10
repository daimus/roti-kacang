package com.example.orderservice.infrastructure.data.jpa.cart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer idProduct;
    private Integer idUser;
    private Integer quantity;
    @CreatedDate
    private Date created_at;
    @LastModifiedDate
    private Date updated_at;
    private Date deleted_at;

}
