package io.github.shirohoo.realworld.domain.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);

    Optional<User> findByProfileUsername(String username);

    boolean existsByProfileUsername(String username);

    boolean existsByEmail(String email);
}
