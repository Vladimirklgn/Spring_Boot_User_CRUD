package org.vladimirklgn.user_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vladimirklgn.user_crud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
