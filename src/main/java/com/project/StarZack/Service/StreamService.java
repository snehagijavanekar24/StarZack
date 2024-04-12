package com.project.StarZack.Service;

import java.util.List;


import com.project.StarZack.Entity.GameStreaming;

public interface StreamService {
	public String CreateStreamDetails(GameStreaming gamestreaming);
	public String updateStreamDetails(GameStreaming gamestreaming);
	public String deleteStreamDetails(String StreamId);
	public GameStreaming getStreamDetails(String StreamId);
	public List<GameStreaming> getAllStreams();

}
