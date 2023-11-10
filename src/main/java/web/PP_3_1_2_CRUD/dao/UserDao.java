package web.PP_3_1_2_CRUD.dao;

import org.springframework.stereotype.Component;
import web.PP_3_1_2_CRUD.models.User;


import java.util.List;

@Component
public interface UserDao {


    public List<User> index();

    public User show(Long id);

    public void add(User user);

    public void update(Long id, User updatedUser);

    public void delete(Long id);
}
