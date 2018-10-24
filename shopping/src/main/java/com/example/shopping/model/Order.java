package com.example.shopping.model;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "order_line")
    private Integer orderLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(Integer orderLine) {
        this.orderLine = orderLine;
    }
}
