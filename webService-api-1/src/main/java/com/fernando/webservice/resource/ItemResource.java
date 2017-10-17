package com.fernando.webservice.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.webservice.model.Item;
import com.fernando.webservice.service.ItemService;

@RestController
@CrossOrigin("${origem-permitida}")
@RequestMapping("/itens")
public class ItemResource{
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> listar(){
		return itemService.listar();
	}
	@PostMapping
	public Item adicionar(@RequestBody @Valid Item item) {
		return itemService.salvar(item);
	}
	@DeleteMapping("/{codigo}")
	public void excluir(@PathVariable Long codigo) {
		itemService.excluir(codigo);
	}
	@GetMapping("{codigo}")
	public ResponseEntity<?> buscarItem(@PathVariable("codigo") Long codigo) {
		try {
			return ResponseEntity.ok(itemService.buscar(codigo)) ;
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
