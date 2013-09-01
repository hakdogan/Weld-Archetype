/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.model;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 *
 * @author hakdogan
 */

@Named
@Singleton
public class ArticleLists {
    
    private List<Article> articleLists = new ArrayList();

    public List<Article> getArticleLists() {
        return articleLists;
    }

    public void setArticleLists(List<Article> articleLists) {
        this.articleLists = articleLists;
    }
    
}
