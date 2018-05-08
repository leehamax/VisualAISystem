package test;
import org.apache.ibatis.session.SqlSession;
import example.pojo.User;
public class UserTest {
    public static void main(String[] args) {
           SqlSession session = SFactory.getSqlSession();
            User user = session.selectOne("mapper.UserMapper.findById", 2);
            session.commit();
            System.out.println(user.getUsername());
         User user1;
         SqlSession session1 = SFactory.getSqlSession();
          user1=session1.selectOne("mapper.UserMapper.findByName","ANNA");
        session1.commit();
        System.out.println(user1.getPassword());
        session1.close();
            session.close();

    }
}
