package web.PP_3_1_2_CRUD.dao;

import org.springframework.stereotype.Component;
import web.PP_3_1_2_CRUD.models.User;


import java.util.List;

@Component
public interface UserDao {


    List<User> showAllUsers();

    User show(Long id);

    void add(User user);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
