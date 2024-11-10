package cat.tecnocampus.securityjwt.application;

import cat.tecnocampus.securityjwt.application.DTOs.UserLabDTO;
import cat.tecnocampus.securityjwt.domain.UserLab;
import cat.tecnocampus.securityjwt.persistence.UserLabRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Controller
public class ControllerUserService {

    public final UserLabRepository userLabRepository;

    public ControllerUserService(UserLabRepository userLabRepository) {
        this.userLabRepository = userLabRepository;
    }

    public void createUser(UserLabDTO userLabDTO){
        UserLab userLab = new UserLab();
        userLab.setEmail(userLabDTO.getEmail());
        userLab.setPassword(userLabDTO.getPassword());
        userLab.setRoles(userLabDTO.getRoles());
        userLab.setUsername(userLabDTO.getUsername());
        userLabRepository.save(userLab);
    }
}
