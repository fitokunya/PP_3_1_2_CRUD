package web.PP_3_1_2_CRUD.service;

import org.springframework.stereotype.Service;
import web.PP_3_1_2_CRUD.models.User;

import java.util.List;

@Service
public interface UserService {
    List<User> index();

    User show(Long id);

    void add(User user);

    void delete(Long id);

    void update(Long id, User user);
}
