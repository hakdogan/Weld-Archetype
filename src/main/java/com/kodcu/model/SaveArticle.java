/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.model;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author hakdogan
 */

@Model
public class SaveArticle {
    
    @Inject
    private Article article;
    
    @Inject
    private ArticleLists articleLists;
            
    public Article getArticle() {
        return article;
    }
    
    public void setArticle(Article article) {
        this.article = article;
    }

    public ArticleLists getArticleLists() {
        return articleLists;
    }

    public void setArticleLists(ArticleLists articleLists) {
        this.articleLists = articleLists;
    }
    
    public void save() {
        articleLists.getArticleLists().add(article);
        article = null;
    }
    
}
