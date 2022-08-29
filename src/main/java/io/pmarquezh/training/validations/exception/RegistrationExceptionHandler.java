package io.pmarquezh.training.validations.exception;

//   Standard Libraries Imports
import java.time.LocalDateTime;
import java.util.List;

//   Third Party Libraries Imports
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//   ns Framework Imports

//   Domain Imports


/**
 * RegistrationExceptionHandler.java<br><br>
 * Creation Date 2022-08-29 19:16<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-08-29 19:16<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-08-29 19:16
 */
@Slf4j
@RestControllerAdvice
public class RegistrationExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid ( MethodArgumentNotValidException ex,
                                                                    HttpHeaders                     headers,
                                                                    HttpStatus                      status,
                                                                    WebRequest                      request ) {

        List<ErrorMessage> fieldErrorDetails     = ex.getBindingResult ( )
                                                     .getFieldErrors ( )
                                                     .stream ( )
                                                     .map ( error -> new ErrorMessage ( error.getObjectName ( ),
                                                                                        error.getField ( ),
                                                                                        error.getDefaultMessage ( ),
                                                                                        ObjectUtils.nullSafeToString ( error.getRejectedValue ( ) ) ) )
                                                     .toList ( );

        ErrorResponse response = new ErrorResponse ( LocalDateTime.now ( ),
                                                     status.name ( ),
                                                     status.value ( ),
                                                     ( ( ServletWebRequest ) request ).getRequest ( ).getRequestURI ( ),
                                                     fieldErrorDetails );

        return new ResponseEntity<>( response, status );

    }
}