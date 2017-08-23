package br.com.projetos.drogaria.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*recebe a requisição e já redireciona para a visão - controller
Controller ResponseBody pode responder para qualquer tecnologia
 @Controller/@ResponseBody - encapsulado e foi substituido pelo @RestController
 age como um servidor Rest*/

@RestController
// http://localhost:8080/(Controlador)/(nome do método)
@RequestMapping("/drogaria")
public class DrogariaControlador {

	/*
	 * Para o método ser mapeados pelo navegador necessita utilizar por padrão
	 * elle faz Request
	 * 
	 * @RequestMapping("/testar")
	 */

	@RequestMapping("/testar")
	public String testar() {

		return "Programação Web Com Spring";
	}

}
