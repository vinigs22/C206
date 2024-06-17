package br.com.rubyrant.domain.community;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository <Community, Long> {
    Page<Community> findAllByActiveTrue(Pageable pageable);
}
