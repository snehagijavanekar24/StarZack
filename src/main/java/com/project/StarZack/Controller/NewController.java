package com.project.StarZack.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.StarZack.entity.UpdateNews;
import com.project.StarZack.Service.NewsService;

@RestController
@RequestMapping("/UpdateNews")
public class NewController {
	 NewsService newsService;
	 
		
		public NewController(NewsService newsService) {
		
		this.newsService = newsService;
	}

		@GetMapping("{NewsId}")
	    public UpdateNews getNewsDetails(@PathVariable("NewsId") String NewsId){
	        return newsService.getNewsDetails(NewsId);
	    }

	    @GetMapping()
	    public List <UpdateNews> getAllNewsDetails(){
	        return newsService.getAllNews();
	    }

	    @PostMapping
	    public String createNewsDetails(@RequestBody UpdateNews news){
	        newsService.CreateNewsDetails(news);
	        return "news Created Successfully";
	    }

	    @PutMapping
	    public String updateNewsDetails(@RequestBody UpdateNews news){
	        newsService.updateNewsDetails(news);
	        return "News Updated Successully";
	    }

	    @DeleteMapping("{NewsId}")
	    public String deletenewsDetails(@PathVariable("NewsId")String NewsId){
	        newsService.deleteNewsDetails(NewsId);
	        return "News Deleted Successfully";
	    }

}
