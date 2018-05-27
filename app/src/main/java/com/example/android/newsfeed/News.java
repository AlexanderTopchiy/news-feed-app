package com.example.android.newsfeed;


/**
 * The {@link News} class represents some data about news.
 */
public class News {

    // Information about news
    private String mSectionName;
    private String mTitle;
    private String mPublicationDate;
    private String mUrl;


    /**
     * Create the {@link News} object.
     * @param section is the news category name.
     * @param title is the news title.
     * @param publicationDate is the news publication date.
     * @param url is the news url.
     */
    public News(String section, String title, String publicationDate, String url) {
        mSectionName = section;
        mTitle = title;
        mPublicationDate = publicationDate;
        mUrl = url;
    }


    /**
     * Getter methods of {@link News} class.
     * @return the String objects.
     */
    public String getSectionName() {
        return mSectionName;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getPublicationDate() {
        return mPublicationDate;
    }


    public String getUrl() {
        return mUrl;
    }
}
