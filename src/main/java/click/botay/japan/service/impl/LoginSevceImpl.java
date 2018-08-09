package click.botay.japan.service.impl;

import click.botay.japan.domain.LoginUpsertRequest;
import click.botay.japan.entity.LoginEntity;
import click.botay.japan.repository.LoginRepository;
import click.botay.japan.service.LoginSevice;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class LoginSevceImpl implements LoginSevice {
    private final LoginRepository loginRepository;

    public LoginSevceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public List<LoginEntity> findAll() {
        List<LoginEntity> loginEntityList = loginRepository.findAll();
        return loginEntityList;
    }
    @Transactional
    @Override
    public Object[] checkLogin(LoginUpsertRequest loginUpsertRequest) {
        LoginEntity loginEntity = loginRepository.findAllByUserNameAndPassWord(loginUpsertRequest.getName(),
                loginUpsertRequest.getPassword());
        if (loginEntity!=null){
            String sesion = UUID.randomUUID().toString();
            loginEntity.setSession(sesion);
            return new Object[] {true, loginEntity.getSession()};
        }
        return new Object[]{false, null};
    }
    @Transactional
    @Override
    public void checkOut(String session) {
        LoginEntity loginEntity = loginRepository.findAllBySession(session);
        loginEntity.setSession(null);
    }


}
