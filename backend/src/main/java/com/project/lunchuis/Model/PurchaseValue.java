package com.project.lunchuis.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "purchase_value")
public class PurchaseValue {
    @Id
    private Long id;

    private Integer cantidadDiaria;
    private Integer cantidadMensual;
    private Integer cantidadCena;

    public PurchaseValue() {
    }

    public PurchaseValue(Integer cantidadDiaria, Integer cantidadMensual, Integer cantidadCena, Double valorDiario, Double valorMensual, Double valorCena) {
        this.cantidadDiaria = cantidadDiaria;
        this.cantidadMensual = cantidadMensual;
        this.cantidadCena = cantidadCena;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidadDiaria() {
        return cantidadDiaria;
    }

    public void setCantidadDiaria(Integer cantidadDiaria) {
        this.cantidadDiaria = cantidadDiaria;
    }

    public Integer getCantidadMensual() {
        return cantidadMensual;
    }

    public void setCantidadMensual(Integer cantidadMensual) {
        this.cantidadMensual = cantidadMensual;
    }

    public Integer getCantidadCena() {
        return cantidadCena;
    }

    public void setCantidadCena(Integer cantidadCena) {
        this.cantidadCena = cantidadCena;
    }


}
