package com.project.StarZack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="news_info")
public class UpdateNews {
	
	@Id
	private String newsId;
	private String newNews;
	private String oldNews;
	private String NewsType;
	private String NewsDate;
	
	public UpdateNews() {
		
	}

	public UpdateNews(String newsId, String newNews, String oldNews, String newsType, String newsDate) {
		
		this.newsId = newsId;
		this.newNews = newNews;
		this.oldNews = oldNews;
		NewsType = newsType;
		NewsDate = newsDate;
	}

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getNewNews() {
		return newNews;
	}

	public void setNewNews(String newNews) {
		this.newNews = newNews;
	}

	public String getOldNews() {
		return oldNews;
	}

	public void setOldNews(String oldNews) {
		this.oldNews = oldNews;
	}

	public String getNewsType() {
		return NewsType;
	}

	public void setNewsType(String newsType) {
		NewsType = newsType;
	}

	public String getNewsDate() {
		return NewsDate;
	}

	public void setNewsDate(String newsDate) {
		NewsDate = newsDate;
	}
	

	
}
