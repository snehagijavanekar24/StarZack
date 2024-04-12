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

import com.project.StarZack.Entity.GameStreaming;

import com.project.StarZack.Service.StreamService;

@RestController
@RequestMapping("/GameStreaming")
public class StreamController {
	
	StreamService streamService;
	 
	

	public StreamController(StreamService streamService) {
		
		this.streamService = streamService;
	}

	@GetMapping("{StreamId}")
    public GameStreaming getStreamDetails(@PathVariable("StreamId") String streamId){
        return streamService.getStreamDetails(streamId);
    }

    @GetMapping()
    public List <GameStreaming> getAllStreamDetails(){
        return streamService.getAllStreams();
    }

    @PostMapping
    public String createStreamDetails(@RequestBody GameStreaming gamestreaming){
        streamService.CreateStreamDetails(gamestreaming);
        return "Streams Created Successfully";
    }

    @PutMapping
    public String updateStreamDetails(@RequestBody GameStreaming gamestreaming){
        streamService.updateStreamDetails(gamestreaming);
        return "Streams Updated Successully";
    }

    @DeleteMapping("{StreamId}")
    public String deleteStreamDetails(@PathVariable("StreamId") String streamId){
        streamService.deleteStreamDetails(streamId);
        return "Stream Deleted Successfully";
    }

}
