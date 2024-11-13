package dev.wisespirit.toco_cloud.repository;

import dev.wisespirit.toco_cloud.domains.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AuthUser,Integer> {
    Optional<AuthUser> findByUsername(String username);
}
