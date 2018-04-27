package userList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import userList.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String >{
    List<User> findByUserName(String userName);
}
