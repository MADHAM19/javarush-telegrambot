-- add PRIMARY KEY FOR users
alter table users add PRIMARY KEY (chat_id);

-- ensure that the tables with these names are removed before creating a new one.
drop table IF EXISTS group_sub;
drop table IF EXISTS group_x_user;

create TABLE group_sub (
   id INT,
   title VARCHAR(100),
   last_post_id INT,
   PRIMARY KEY (id)
);

create TABLE group_x_user (
   group_sub_id INT NOT NULL,
   user_id INT NOT NULL,
   FOREIGN KEY (user_id) REFERENCES users(chat_id),
   FOREIGN KEY (group_sub_id) REFERENCES group_sub(id),
   CONSTRAINT group_x_user_user_id_group_sub_id_key UNIQUE (user_id, group_sub_id)
);