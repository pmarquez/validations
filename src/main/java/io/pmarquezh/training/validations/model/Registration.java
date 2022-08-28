package io.pmarquezh.training.validations.model;

//   Standard Libraries Imports
import java.time.LocalDate;

//   Third Party Libraries Imports
import lombok.extern.slf4j.Slf4j;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Registration {
    String    id;
    String    userName;
    String    firstName;
    String    lastName;
    LocalDate dateOfBirth;
    String    email;
    String    city;
    String    country;
    int       tier;
}
