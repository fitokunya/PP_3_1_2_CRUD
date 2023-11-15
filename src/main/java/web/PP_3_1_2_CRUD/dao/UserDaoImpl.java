package web.PP_3_1_2_CRUD.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import web.PP_3_1_2_CRUD.models.User;


import javax.persistence.EntityNotFoundException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User show(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(Long id, User updatedUser) {
        if (show(updatedUser.getId()) == null) {
            throw new EntityNotFoundException("User not found");
        }
        entityManager.merge(updatedUser);
    }

    @Override
    public void delete(Long id) {
        User user = show(id);
        if (user == null) {
            throw new EntityNotFoundException("User not found");
        }
        entityManager.remove(show(id));
    }
}
