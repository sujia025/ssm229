package com.zking.ssm.model;

public class Book {
    private Integer bookId;

    private String bookName;

    private Float price;

    private String bookType;

    private String bookImage;

    public Book(Integer bookId, String bookName, Float price, String bookType, String bookImage) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.bookType = bookType;
        this.bookImage = bookImage;
    }

    public Book() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }
}