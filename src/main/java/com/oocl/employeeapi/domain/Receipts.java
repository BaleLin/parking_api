package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class Receipts {
    String receiptId;
    boolean isValid;

    public Receipts() {
    }

    public Receipts(String receiptId, boolean isValid) {
        this.receiptId = receiptId;
        this.isValid = isValid;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public Receipts(String receiptId) {
        this.receiptId = receiptId;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipts receipts = (Receipts) o;
        return receiptId == receipts.receiptId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(receiptId);
    }
}
