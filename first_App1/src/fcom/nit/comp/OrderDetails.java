package fcom.nit.comp;

import java.util.List;

public class OrderDetails 
{
	private long orderId;
	private double	orderPrice;
	private List<String> items;
	
	public OrderDetails() {}
	
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
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" +orderId + ", orderPrice=" + orderPrice + ", items=" + items + "]";
	}
	
	
	

}
