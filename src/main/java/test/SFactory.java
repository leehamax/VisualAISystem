package test;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
public class SFactory {
    private static String resource = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory =null;
    static {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
