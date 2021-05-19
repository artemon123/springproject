package com.filemanager.onlinemg.repository;

import com.filemanager.onlinemg.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User, Integer> {

}
