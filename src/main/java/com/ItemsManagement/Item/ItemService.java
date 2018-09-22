package com.ItemsManagement.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	public List<Item> getAllItems() {
		List<Item> items = itemRepository.findAll();
		return items;
	}
	public Item getItem(String id) {
		return (Item) itemRepository.findById(id).get();
	}
	
	public void addItem(Item item) {
		itemRepository.save(item);
	}
	
	
	public void DeleteItem(String id) {
		itemRepository.deleteById(id);
	}
	
	public void DepositItem(String id ,String amount) {
		Item temp = (Item) itemRepository.findById(id).get();
		int calc = Integer.parseInt(temp.getAmount()) + Integer.parseInt(amount);
		temp.setAmount(String.valueOf(calc));
		itemRepository.save(temp);
	}

	public void WithdrawalItem(String id ,String amount) {
		Item temp = (Item) itemRepository.findById(id).get();
		int calc = Integer.parseInt(temp.getAmount()) - Integer.parseInt(amount);
		temp.setAmount(String.valueOf(calc));
		itemRepository.save(temp);
	}
}
