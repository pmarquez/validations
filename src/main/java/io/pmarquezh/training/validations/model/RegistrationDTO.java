package io.pmarquezh.training.validations.model;

//   Standard Libraries Imports
import java.time.LocalDate;

//   Third Party Imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//   ns Framework Imports

//   Domain Imports


/**
 * Registration.java<br><br>
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
    String    userName;         //   cannot be null or empty and must be at least 7 chars long
    String    firstName;        //   cannot be null or empty
    String    lastName;         //   cannot be null or empty
    LocalDate dateOfBirth;      //   must be a date in the past
    String    email;            //   must be a valid email
    String    city;             //   cannot be null or empty
    String    country;          //   cannot be null or empty
    int       tier;             //   Should be a value in [1, 2, 3]
}
