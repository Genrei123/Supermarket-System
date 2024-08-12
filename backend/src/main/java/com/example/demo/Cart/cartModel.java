package com.example.demo.Cart;


import com.example.demo.Items.itemModel;
import jakarta.persistence.*;

@Entity
@Table
public class cartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;

    @OneToOne
    private itemModel product;



}
