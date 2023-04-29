/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Islem
 */
public class Images {
    private int id;
    private Article articleId;

    public Article getArticleId() {
        return articleId;
    }

    public void setArticleId(Article articleId) {
        this.articleId = articleId;
    }
    private String name;
    private String url;

    public Images(int id, Article articleId, String name, String url) {
        this.id = id;
        this.articleId = articleId;
        this.name = name;
        this.url = url;
    }

    public Images(Article articleId, String name, String url) {
        this.articleId = articleId;
        this.name = name;
        this.url = url;
    }
    
    public Images(String name, String url) {
        this.articleId = articleId;
        this.name = name;
        this.url = url;
    }
    public Images() {
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Images{" + "id=" + id + ", articleId=" + articleId + ", name=" + name + ", url=" + url + '}';
    }
 
}
