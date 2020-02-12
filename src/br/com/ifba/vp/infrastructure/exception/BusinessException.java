
/**
 *
 * @author Icaro
 */

package br.com.ifba.vp.infrastructure.exception;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6062815084191991722L;

	/**
	 * BusinessException representa uma exceção às regras de negócios do sistema.
	 * 
	 * @author jonatasfbastos
	 */
        public BusinessException() {
             super();
        }

         /**
          * Cria uma nova instância da exceção que define a mensagem.
          * 
          * @param message the error message.
          */
         public BusinessException(final String message) {
             super(message);
         }

         /**
          * Cria uma nova instância da exceção que define a causa.
          * 
          * @param cause the cause
          */
         public BusinessException(final Throwable cause) {
             super(cause);
         }

         /**
          * Cria uma nova instância da exceção que define a mensagem e a causa.
          * 
          * @param message the error message.
          * @param cause the cause
          */
         public BusinessException(final String message, final Throwable cause) {
             super(message, cause);
         }
	    
}
