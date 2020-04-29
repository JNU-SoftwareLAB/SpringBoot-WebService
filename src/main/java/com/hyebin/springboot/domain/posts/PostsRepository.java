package com.hyebin.springboot.domain.posts;

import com.hyebin.springboot.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {
}
