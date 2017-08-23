package br.com.projetos.drogaria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.projetos.drogaria.dominio.Fabricante;

//Acesso aos dados ou repository
public class FabricanteDAO {

	/* atributo estaticopara que o array list seja único */
	private static List<Fabricante> fabricantes;

	// construtor que vai estanciar e popular o a Array
	public FabricanteDAO() {
		fabricantes = new ArrayList<>();
		// fabricantes = lista depois cria objeto Fabricante
		fabricantes.add(new Fabricante(1, "Fabricante A"));
		fabricantes.add(new Fabricante(2, "Fabricante B"));
		fabricantes.add(new Fabricante(3, "Fabricante C"));
		fabricantes.add(new Fabricante(4, "Fabricante D"));
		fabricantes.add(new Fabricante(5, "Fabricante E"));
	}

	/* Construindo os métodos */

	// Método para Listar os Fabricantes
	public List<Fabricante> listar() {

		// vai retornar a lista de fabricantes
		return fabricantes;
	}
}
