package mrperfect.example.newsapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Articles {

    @SerializedName("Sourse")
    @Expose
    private String sourse;

    @SerializedName("author")
    @Expose
    private Sourse author;

    @SerializedName("title")
    @Expose
    private Sourse title;


    @SerializedName("description")
    @Expose
    private Sourse description;

    @SerializedName("urlToImage")
    @Expose
    private Sourse urlToImage;

    @SerializedName("publishedAt")
    @Expose
    private Sourse publishedAt;


    public String getSourse() {
        return sourse;
    }

    public void setSourse(String sourse) {
        this.sourse = sourse;
    }

    public Sourse getAuthor() {
        return author;
    }

    public void setAuthor(Sourse author) {
        this.author = author;
    }

    public Sourse getTitle() {
        return title;
    }

    public void setTitle(Sourse title) {
        this.title = title;
    }

    public Sourse getDescription() {
        return description;
    }

    public void setDescription(Sourse description) {
        this.description = description;
    }

    public Sourse getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(Sourse urlToImage) {
        this.urlToImage = urlToImage;
    }

    public Sourse getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Sourse publishedAt) {
        this.publishedAt = publishedAt;
    }
}
