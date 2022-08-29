package io.pmarquezh.training.validations.mapper;

//   Standard Libraries Imports

//   Third Party Libraries Imports
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//   ns Framework Imports

//   Domain Imports
import io.pmarquezh.training.validations.model.Registration;
import io.pmarquezh.training.validations.model.RegistrationDTO;

/**
 * RegistrationMapper.java<br><br>
 * Creation Date 2022-08-29 19:11<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-08-29 19:11<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-08-29 19:11
 */
@Slf4j
@Component
public class RegistrationMapper {

    private ModelMapper modelMapper;

    @Autowired
    public RegistrationMapper ( ModelMapper modelMapper ) {
        this.modelMapper = modelMapper;
    }

    /**
     * Converts a validated DTO to an entity.
     * @param registrationDto
     * @return
     */
    public Registration convertDtoToEntity (RegistrationDTO registrationDto ) {
        return modelMapper.map ( registrationDto, Registration.class );
    }

}