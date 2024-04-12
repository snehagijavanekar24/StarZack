package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.project.StarZack.Entity.UpdateNews;
import com.project.StarZack.Repository.Newsrepository;
import com.project.StarZack.Service.NewsService;

@Service
public class NewsServiceimpl implements NewsService {
		
	
	Newsrepository newsrepo;
	
	public NewsServiceimpl(Newsrepository newsrepo) {
			
			this.newsrepo = newsrepo;
		}

	public String CreateNewsDetails(UpdateNews news) {
		newsrepo.save(news);
		return "Success";
	}

	@Override
	public String updateNewsDetails(UpdateNews news) {
		newsrepo.save(news);
		return "Success";
	}

	@Override
	public String deleteNewsDetails(String NewsId) {
		newsrepo.deleteById(NewsId);
		return "Success";
	}

	@Override
	public UpdateNews getNewsDetails(String NewsId) {
		return newsrepo.findById(NewsId).get();
	}

	@Override
	public List<UpdateNews> getAllNews() {
		return newsrepo.findAll();
	}
}
