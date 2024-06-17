package br.com.rubyrant.domain.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
    Page<User> findAllByActiveTrue(Pageable pageable);
}
