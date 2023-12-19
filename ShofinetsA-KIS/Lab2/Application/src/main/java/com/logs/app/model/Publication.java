package com.logs.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Publication {
    private final UUID id;
    private final String title;
    private final String author;
    private final int year;
    private final String publisher;
    private final int pageCount;

    public Publication(@JsonProperty("id") UUID id,
                       @JsonProperty("title") String title,
                       @JsonProperty("author") String author,
                       @JsonProperty("year") int year,
                       @JsonProperty("publisher") String publisher,
                       @JsonProperty("pageCount") int pageCount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

}
