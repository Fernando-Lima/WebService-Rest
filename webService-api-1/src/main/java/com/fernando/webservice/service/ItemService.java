package com.fernando.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.webservice.model.Item;
import com.fernando.webservice.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired // com injeção de dependência não é obrigatório implementar todos os metodos
	ItemRepository itemRepository;
	
	public Item salvar(Item item) {
		return itemRepository.save(item);
	}
	public List<Item> listar(){
		return itemRepository.findAll();
	}
	public void excluir(Long codigo) {
		itemRepository.delete(codigo);
	}
	public Item buscar(Long codigo) {
		Item item = itemRepository.findOne(codigo);
		if(item == null) {
			System.out.println("ITEM NÃO ENCONTRADO");
		}
		return item;
		
	}
}
