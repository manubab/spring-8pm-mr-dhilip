package test;

import java.util.Map;
import java.util.Set;

public class OrderDetails 
{
	
	private long orderId;
	private double orderPrice;
	private Set<String> items;
	private boolean isOrderDelivered;
	private Map<String,String> itemsPrices;
	
	
	public boolean isOrderDelivered() {
		return isOrderDelivered;
	}
	public void setOrderDelivered(boolean isOrderDelivered) {
		this.isOrderDelivered = isOrderDelivered;
	}

	
	
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Set<String> getItems() {
		return items;
	}
	public void setItems(Set<String> items) {
		this.items = items;
	}
	public Map<String, String> getItemsPrices() {
		return itemsPrices;
	}
	public void setItemsPrices(Map<String, String> itemsPrices) {
		this.itemsPrices = itemsPrices;
	}
	
	

}
