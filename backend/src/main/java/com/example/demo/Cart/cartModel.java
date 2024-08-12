package com.example.demo.Cart;


import com.example.demo.Items.itemModel;
import com.example.demo.User.entity.User;
import jakarta.persistence.*;

@Entity
@Table
public class cartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;

    @OneToOne
    private itemModel product;

    @OneToOne
    private User user;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public itemModel getProduct() {
        return product;
    }

    public void setProduct(itemModel product) {
        this.product = product;
    }



}
