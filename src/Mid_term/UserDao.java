package Mid_term;

public interface UserDao {

    public String getPwById(String id);
    public String getPwByPhNum(String phNum);
    public String getPwByEmail(String email);
    public int login(String id, String pw);

}
