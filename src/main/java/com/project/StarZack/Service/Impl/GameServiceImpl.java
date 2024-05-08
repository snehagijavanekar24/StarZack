package com.project.StarZack.Service.Impl;

import java.util.List;

import com.project.StarZack.entity.GameStreaming;
import org.springframework.stereotype.Service;


import com.project.StarZack.repository.Streamreposiroty;
import com.project.StarZack.Service.StreamService;

@Service
public class GameServiceImpl implements StreamService{
	
	Streamreposiroty streamrepo;
	

	

	public GameServiceImpl(Streamreposiroty streamrepo) {
		super();
		this.streamrepo = streamrepo;
	}

	@Override
	public String CreateStreamDetails(GameStreaming gamestreaming ) {
		streamrepo.save(gamestreaming);
		return "Success";
	}

	@Override
	public String updateStreamDetails(GameStreaming gamestreaming ) {
		streamrepo.save(gamestreaming);
		return "Success";
	}

	@Override
	public String deleteStreamDetails(String StreamId) {
		streamrepo.deleteById(StreamId);
		return "Success";
	}

	@Override
	public GameStreaming getStreamDetails(String StreamId) {
		return streamrepo.findById(StreamId).get();
	}

	@Override
	public List<GameStreaming> getAllStreams() {
		return streamrepo.findAll();
	}

}
