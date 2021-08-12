package com.github.javarushcommunity.jrtb.repository.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Telegram User entity.
 */
@Data
@Entity
@Table(name = "users")
public class TelegramUser {

    @Id
    @Column(name = "chat_id")
    private String chatId;

    @Column(name = "active")
    private boolean active;

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getChatId() {
        return chatId;
    }

}