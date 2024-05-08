package com.project.StarZack.Service;

import java.util.List;

import com.project.StarZack.entity.UpdateNews;



public interface NewsService {
	public String CreateNewsDetails(UpdateNews news);
	public String updateNewsDetails(UpdateNews news);
	public String deleteNewsDetails(String NewsId);
	public UpdateNews  getNewsDetails(String NewsId);
	public List<UpdateNews> getAllNews();

}
