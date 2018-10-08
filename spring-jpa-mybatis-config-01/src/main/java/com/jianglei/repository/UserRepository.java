package com.jianglei.repository;

import com.jianglei.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jianglei
 * @since 10/8/18
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
