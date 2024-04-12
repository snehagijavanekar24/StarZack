package com.project.StarZack.Service;

import java.util.List;


import com.project.StarZack.Entity.Chatsupport;

public interface ChatService {
	
	public String CreateChatDetails(Chatsupport chatsupport);
	public String updateChatDetails(Chatsupport chatsupport);
	public String deleteChatDetails(String queryId);
	public Chatsupport getChatDetails(String queryId);
	public List<Chatsupport> getAllChats();
	

}
