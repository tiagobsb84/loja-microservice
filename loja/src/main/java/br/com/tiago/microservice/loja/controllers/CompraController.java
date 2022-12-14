package br.com.tiago.microservice.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiago.microservice.loja.dtos.CompraDTO;
import br.com.tiago.microservice.loja.services.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompra(@RequestBody CompraDTO compra) {
		compraService.realizarCompra(compra);
	}
}
