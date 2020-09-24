package mrperfect.example.newsapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Articles {

    @SerializedName("Source")
    @Expose
    private String source;

    @SerializedName("author")
    @Expose
    private Source author;

    @SerializedName("title")
    @Expose
    private Source title;


    @SerializedName("description")
    @Expose
    private Source description;

    @SerializedName("urlToImage")
    @Expose
    private Source urlToImage;

    @SerializedName("publishedAt")
    @Expose
    private Source publishedAt;


    public String getSourse() {
        return source;
    }

    public void setSourse(String sourse) {
        this.source = sourse;
    }

    public Source getAuthor() {
        return author;
    }

    public void setAuthor(Source author) {
        this.author = author;
    }

    public Source getTitle() {
        return title;
    }

    public void setTitle(Source title) {
        this.title = title;
    }

    public Source getDescription() {
        return description;
    }

    public void setDescription(Source description) {
        this.description = description;
    }

    public Source getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(Source urlToImage) {
        this.urlToImage = urlToImage;
    }

    public Source getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Source publishedAt) {
        this.publishedAt = publishedAt;
    }
}
