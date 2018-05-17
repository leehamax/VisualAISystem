package example.dao;
import example.pojo.User;
import java.util.List;
public interface UserMapper {
List<User> findById(int id );
List<User> findByName(String username);
void insertUser(User user);
}
