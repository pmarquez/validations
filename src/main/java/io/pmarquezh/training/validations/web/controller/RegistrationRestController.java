package io.pmarquezh.training.validations.web.controller;

//   Standard Libraries Imports
import javax.validation.Valid;

//   Third Party Libraries Imports
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//   ns Framework Imports

//   Domain Imports
import io.pmarquezh.training.validations.model.Registration;
import io.pmarquezh.training.validations.model.RegistrationDTO;
import io.pmarquezh.training.validations.service.RegistrationService;

/**
 * RegistrationRestController.java<br><br>
 * Creation Date 2022-08-26 19:19<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-08-26 19:19<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-08-26 19:19
 */
@Slf4j
@RestController
@RequestMapping( "/regAPI/1.0/registration" )
public class RegistrationRestController {

    RegistrationService registrationService;

    @Autowired
    public RegistrationRestController ( RegistrationService registrationService ) {
        this.registrationService = registrationService;
    }

    @PostMapping ({""})
    public ResponseEntity<Registration> registerNewUser ( @RequestBody @Valid RegistrationDTO regDto ) {

        Registration reg = registrationService.registerNewUser ( regDto );

        return new ResponseEntity<> ( reg, HttpStatus.CREATED );

    }

}
