package example.pojo;
import java.util.List;
public class User{
    private Integer id;
    private  String username;
    private String password;
    private String number;
    private String mailbox;
    private List<Info> user_address;
    public User(String username,String password,String number,String mailbox){
        super();
        this.username = username;
        this.password = password;
        this.number = number;
        this.mailbox = mailbox;
    }
    public User()
    {
        super();
    }
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }

    public String getMailbox() {
        return mailbox;
    }

    public List<Info> getUser_address() {
        return user_address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public void setUser_address(List<Info> user_address) {
        this.user_address = user_address;
    }
}
