package com.portfolio.registry.registration;

import com.portfolio.registry.appuser.AppUser;
import com.portfolio.registry.appuser.AppUserService;
import com.portfolio.registry.appuser.AppuserRole;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    public String register(RegistrationRequest request) {
       boolean isValidEmail = emailValidator.test(request.getEmail());
       if (!isValidEmail){
           throw new IllegalStateException("email not valid");
       }
       return appUserService.signUpUser(
               new AppUser(
                       request.getFirstName(),
                       request.getLastName(),
                       request.getEmail(),
                       request.getPassword(),
                       AppuserRole.USER
               )
       );
    }
}
