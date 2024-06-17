package br.com.rubyrant.domain.post;

import br.com.rubyrant.domain.community.Community;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Page<Post> findAllByActiveTrue(Pageable pageable);

}
