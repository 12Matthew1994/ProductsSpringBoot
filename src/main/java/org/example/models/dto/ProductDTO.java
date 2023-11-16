package org.example.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.Date;

public class ProductDTO {

    @NotBlank(message = "Vyplňte název produktu")
    @NotNull(message = "Vyplňte název produktu")
    private String name;

    @NotBlank(message = "Vyplňte popis produktu")
    @NotNull(message = "Vyplňte popis produktu")
    private String description;

    @Positive(message = "Vyplňte správnou cenu produktu")
    private double price;
    @NotNull(message = "Vyplňte datum vytvoření produktu")
    private Date dateOfCreation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}

