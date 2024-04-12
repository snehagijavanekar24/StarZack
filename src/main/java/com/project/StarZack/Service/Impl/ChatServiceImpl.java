package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.StarZack.Entity.Chatsupport;

import com.project.StarZack.Repository.Chatrepository;
import com.project.StarZack.Service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{
		
	Chatrepository  chatrepo;

	public ChatServiceImpl(Chatrepository chatrepository) {
			
			this.chatrepo = chatrepository;
		}

	public String CreateChatDetails(Chatsupport chatsupport) {
		chatrepo.save(chatsupport);
		return "Success";
	}

	public String updateChatDetails(Chatsupport chatsupport) {
		chatrepo.save(chatsupport);
		return "Success";
	}

	public String deleteChatDetails(String queryId) {
		chatrepo.deleteById(queryId);
		return "Success";
	}

	public Chatsupport getChatDetails(String queryId) {
		return chatrepo.findById(queryId).get();
	}

	
	@Override
	public List<Chatsupport> getAllChats() {
		return chatrepo.findAll();
	}

	

	

}
