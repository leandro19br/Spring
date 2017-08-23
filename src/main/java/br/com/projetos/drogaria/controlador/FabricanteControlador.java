package br.com.projetos.drogaria.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.drogaria.dao.FabricanteDAO;
import br.com.projetos.drogaria.dominio.Fabricante;

@RestController
@RequestMapping("/fabricante")
public class FabricanteControlador {

	// metodo http para mostrar a lista

	@RequestMapping(method = RequestMethod.GET)
	public List<Fabricante> listar() {
		// estanciando o objeto dao
		FabricanteDAO dao = new FabricanteDAO();
		List<Fabricante> resultado = dao.listar();
		return resultado;
	}
}
