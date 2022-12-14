package io.pmarquezh.training.validations.exception;

//   Standard Libraries Imports

//   Third Party Libraries Imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//   ns Framework Imports

//   Domain Imports


/**
 * ErrorMessage.java<br><br>
 * Creation Date 2022-08-29 19:14<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-08-29 19:14<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-08-29 19:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private String  object;
    private String  property;
    private String  message;
    private Object  rejectedValue;
}