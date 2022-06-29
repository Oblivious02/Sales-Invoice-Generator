package com.invoice.model;

import java.util.ArrayList;

public class InvoiceHeader {
    private int num;
    private String customerName;
    private String date;

    ArrayList<InvoiceLine> lines;

    public void addInvLine(InvoiceLine line){
        getLines().add(line);
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null)
            lines = new ArrayList<>();
        return lines;
    }

    public double getInvTotal() {
        double total = 0;
        for (InvoiceLine line: getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }


    public InvoiceHeader(int num, String customerName, String date) {
        this.num = num;
        this.customerName = customerName;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice num " + num +
                "\n{" +
                "\ndate='" + date + '\'' +
                ", Customer Name='" + customerName + '\'' +
                "\n" + lines +
                "\n}\n";
    }
}
