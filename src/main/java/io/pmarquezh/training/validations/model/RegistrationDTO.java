package io.pmarquezh.training.validations.model;

//   Standard Libraries Imports
import java.time.LocalDate;
import javax.validation.constraints.*;

//   Third Party Imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//   ns Framework Imports

//   Domain Imports


/**
 * RegistrationDTO.java<br><br>
 * Creation Date 2022-08-26 19:06<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-08-26 19:06<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-08-26 19:06
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDTO {

    @NotNull ( message = "El nombre de usuario es obligatorio." )
    @Size( min = 7, message = "El nombre de usuario debe ser de al menos 7 caracteres de longitud." )
    @NotBlank ( message = "El nombre de usuario no puede contener solo caracteres vacíos." )
    String    userName;         //   no puede ser null o vacío y debe tener una longitud de al menos 7 caracteres

    @NotNull ( message = "El nombre es obligatorio." )
    @NotEmpty ( message = "El nombre no puede estar vacío." )
    @NotBlank ( message = "El nombre no puede contener solo caracteres vacíos." )
    String    firstName;        //   no puede ser null o vacío

    @NotNull ( message = "El apellido es obligatorio." )
    @NotEmpty ( message = "El apellido no puede estar vacío." )
    @NotBlank ( message = "El apellido no puede contener solo caracteres vacíos." )
    String    lastName;         //   no puede ser null o vacío

    @Past ( message = "La fecha de nacimiento tiene que ser en el pasado." )
    LocalDate dateOfBirth;      //   la fecha debe estar en el pasado

    @Email ( message = "El correo electrónico no es válido." )
    String    email;            //   debe ser un email válido

    @NotNull ( message = "La ciudad es un campo obligatorio." )
    @NotEmpty ( message = "El nombre de la ciudad no puede estar vacío." )
    @NotBlank ( message = "El nombre de la ciudad no puede contener solo caracteres vacíos." )
    String    city;             //   no puede ser null o vacío

    @NotNull ( message = "El país es un campo obligatorio." )
    @NotEmpty ( message = "El nombre del país no puede estar vacío." )
    @NotBlank ( message = "El nombre del país no puede contener solo caracteres vacíos." )
    String    country;          //   no puede ser null o vacío

    @Min( value = 1, message = "El nombre del plan seleccionado debe ser un valor soportado." )
    @Max( value = 3, message = "El nombre del plan seleccionado debe ser un valor soportado." )
    int       tier;             //   debe ser un valor en: [1, 2, 3]

}
