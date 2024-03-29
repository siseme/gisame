package me.gisa.api.repository.entity;

import me.gisa.api.repository.entity.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "NEWS")
public class News extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8295688402595799135L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    @Lob
    private String content;
    private String originalLink;    //언론사 url
    @Lob
    private String thumbnail;         //???서브 url?
    private LocalDate pubDate;

    private String regionCode;
    @Lob
    private String summary;
    private String press;   //언론사 추가

    @Enumerated(EnumType.STRING)
    private KeywordType searchKeyword;

    @Enumerated(EnumType.STRING)
    private NewsType newsType;        //NAVER, KAKAO

    @Override
    public String toString() {
        return "News{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", originalLink='" + originalLink + '\'' +
            ", thumbnail='" + thumbnail + '\'' +
            ", pubDate=" + pubDate +
            ", regionCode='" + regionCode + '\'' +
            ", searchKeyword='" + searchKeyword + '\'' +
            ", summary='" + summary + '\'' +
            ", newsType='" + newsType + '\'' +
            '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public void setOriginalLink(String originalLink) {
        this.originalLink = originalLink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public KeywordType getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(KeywordType searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }
}
