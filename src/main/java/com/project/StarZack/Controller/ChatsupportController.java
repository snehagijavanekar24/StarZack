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


import com.project.StarZack.entity.Chatsupport;

import com.project.StarZack.Service.ChatService;

@RestController
@RequestMapping("/Chatsupport")
public class ChatsupportController {
	
	ChatService chatservice;
	 

		public ChatsupportController(ChatService chatservice) {
	
		this.chatservice = chatservice;
	}

		@GetMapping("{queryId}")
	    public Chatsupport getchatDetails(@PathVariable("queryId") String queryId){
			return chatservice.getChatDetails(queryId);
	    }

	    @GetMapping()
	    public List <Chatsupport> getAllChatDetails(){
	        return chatservice.getAllChats();
	    }

	    @PostMapping
	    public String createChatDetails(@RequestBody Chatsupport chatsupport){
	        chatservice.CreateChatDetails(chatsupport);
	        return "chats Created Successfully";
	    }

	    @PutMapping
	    public String updateChatDetails(@RequestBody Chatsupport chatsupport){
	        chatservice.updateChatDetails(chatsupport);
	        return "chats Updated Successully";
	    }

	    @DeleteMapping("{queryId}")
	    public String deleteChatDetails(@PathVariable("queryId")String queryId){
	        chatservice.deleteChatDetails(queryId);
	        return "Chats Deleted Successfully";
	    }


}
