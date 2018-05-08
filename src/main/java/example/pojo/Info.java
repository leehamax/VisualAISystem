package example.pojo;

public class Info {
    private int user_id;
    private String user_info;
    private String video_name;
    private String video_img;
    private User user;
    public Info(){
        super();
    }
    public Info(int user_id,String user_info,String video_name,String video_img){
        this.user_id=user_id;
        this.user_info=user_info;
        this.video_name=video_name;
        this.video_img=video_img;
    }
    public int getUser_id() {
        return user_id;
    }

    public String getUser_info() {
        return user_info;
    }

    public String getVideo_name() {
        return video_name;
    }

    public String getVideo_img() {
        return video_img;
    }

    public User getUser() {
        return user;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }
    public void setVideo_img(String video_img) {
        this.video_img = video_img;
    }
}
