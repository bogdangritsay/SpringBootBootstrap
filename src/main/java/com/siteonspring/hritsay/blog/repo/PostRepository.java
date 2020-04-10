package com.siteonspring.hritsay.blog.repo;

import com.siteonspring.hritsay.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
