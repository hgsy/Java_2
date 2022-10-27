package Mid_term;

public class UserDaoImpl implements UserDao {
    public UserUp1[] mUserList;

    public UserDaoImpl(UserUp1[] mUserList){
        this.mUserList = mUserList;
    }

    @Override
    public String getPwById(String id) {
        String temp = null;

        for(int i=0;i<mUserList.length;i++){
            String mId = mUserList[i].getId();
            if(mId==id) {
                temp = mId;
                break;
            }
        }
        return temp;
    }

    @Override
    public String getPwByPhNum(String phNum) {
        String temp = null;

        for(int i=0;i<mUserList.length;i++){
            String mPhNum = mUserList[i].getPhNum();
            if(mPhNum==phNum) {
                temp = mPhNum;
                break;
            }
        }
        return temp;
    }

    @Override
    public String getPwByEmail(String email) {
        String temp = null;

        for(int i=0;i<mUserList.length;i++){
            String mEmail = mUserList[i].getEmail();
            if(mEmail==email) {
                temp = mEmail;
                break;
            }
        }
        return temp;
    }

    @Override
    public int login(String id, String pw) {
        int temp = -1;

        for(int i=0;i<mUserList.length;i++){
            String mId = mUserList[i].getId();
            String mPw = mUserList[i].getPw();
            if(mId!=id){
                continue;
            }

            if(mPw==pw){
                temp = 1;
                break;
            }
        }

        return temp;
    }
}
