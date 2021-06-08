package com.filemanager.onlinemg.repository;

import com.filemanager.onlinemg.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
