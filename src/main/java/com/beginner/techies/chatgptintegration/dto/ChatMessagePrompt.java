package com.beginner.techies.chatgptintegration.dto;

import java.util.List;

import com.theokanning.openai.completion.chat.ChatMessage;

public class ChatMessagePrompt {

	private List<ChatMessage> chatMessage;

	public List<ChatMessage> getChatMessage() {
		return chatMessage;
	}

	public void setChatMessage(List<ChatMessage> chatMessage) {
		this.chatMessage = chatMessage;
	}
	
	
}
