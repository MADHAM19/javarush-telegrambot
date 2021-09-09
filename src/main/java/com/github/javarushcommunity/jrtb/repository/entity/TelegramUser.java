package com.github.javarushcommunity.jrtb.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private List<GroupSub> groupSubs;

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