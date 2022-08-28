package io.pmarquezh.training.validations.config;

//   Standard Libraries Imports

//   Third Party Libraries Imports
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//   ns Framework Imports

//   Domain Imports


/**
 * ValidationsConfig.java<br><br>
 * Creation Date 2022-08-26 19:54<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-08-26 19:54<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-08-26 19:54
 */
@Slf4j
@Configuration
public class ValidationsConfig {

    @Bean
    public ModelMapper modelMapper ( ) {
        return new ModelMapper ( );
    }

}
