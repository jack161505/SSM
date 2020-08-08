import com.jack.ssmmodules.pojo.SecUser;
import com.jack.ssmmodules.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginTest {

    @Autowired
    LoginService loginService;
    @Test
    public void testLogin()
    {
        List<SecUser> secUsers=loginService.selectAll();
        for (SecUser u:secUsers) {
            System.out.println("id:"+u.getUserId()+";name:"+u.getUserName()+";");
        }
    }
}
