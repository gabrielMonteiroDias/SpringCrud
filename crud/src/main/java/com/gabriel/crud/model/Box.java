package com.gabriel.crud.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "box")
public class Box implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //name
    @Column(name = "name", length = 30, nullable = false)
    private String name;
    // size
    @Column(name = "size", length = 30, nullable = false)
    private String size;
    // color
    @Column(name = "color", length = 30, nullable = false)
    private String color;
    // type
    @Column(name = "type", length = 30, nullable = false)
    private String type;
    // quantity
    @Column(name = "quantity", length = 30, nullable = false)
    private String quantity;

    //adding attributes for version 2.0 ------------------------
    @Column(name = "delivery") //null or not
    private Date delivery;

    @Column(name = "brand", length = 30, nullable = true)
    private String brand;
    //-----------------------------------------------------------

    public Box() {
    }

    public Box(long id, String name, String size, String color, String type, String quantity, Date delivery,
            String brand) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.color = color;
        this.type = type;
        this.quantity = quantity;
        this.delivery = delivery;
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getDelivery() {
        return delivery;
    }

    public void setDelivery(Date delivery) {
        this.delivery = delivery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
}
