/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.model;

/**
 *
 * @author hakdogan
 */

public class Article {
    
    private String title;
    private String category;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
