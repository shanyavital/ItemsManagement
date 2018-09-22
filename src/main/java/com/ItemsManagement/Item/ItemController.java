package com.ItemsManagement.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/item/{id}")
	public Item getItem(@PathVariable String id) {
		return itemService.getItem(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/item")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/item/{id}")
	public void DeleteItem(@PathVariable String id) {
		itemService.DeleteItem(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/item/{id}/deposit")
	public void DepositItem(@PathVariable String id ,@RequestParam String amount) {
		itemService.DepositItem(id, amount);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/item/{id}/withdrawal")
	public void WithdrawalItem(@PathVariable String id ,@RequestParam String amount) {
		itemService.WithdrawalItem(id, amount);
	}
}
