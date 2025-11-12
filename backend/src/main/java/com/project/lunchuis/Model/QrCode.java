package com.project.lunchuis.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "qrcode")
public class QrCode {
    @Id
    private Long id;
    private byte[] qrImage;

    @DBRef
    private Buy buy;

    public void setBuy(Buy buy) {
        this.buy = buy;
        if (buy != null && buy.getQrcode() != this) {
            buy.setQrcode(this);
        }
    }
}
