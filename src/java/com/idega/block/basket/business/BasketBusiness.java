package com.idega.block.basket.business;


import com.idega.block.basket.data.BasketItem;
import java.util.Map;
import java.util.List;
import com.idega.business.IBOSession;
import java.rmi.RemoteException;

public interface BasketBusiness extends IBOSession {

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#addItem
	 */
	public void addItem(BasketItem item) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#isBasketEmpty
	 */
	public boolean isBasketEmpty() throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#addItem
	 */
	public void addItem(BasketItem item, int quantity) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#removeItem
	 */
	public void removeItem(BasketItem item) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#changeQuantity
	 */
	public void changeQuantity(BasketItem item, int quantity) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#checkout
	 */
	public void checkout(BasketCheckoutBusiness checkoutBusiness) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#getBasket
	 */
	public Map getBasket() throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#checkForItemInBasket
	 */
	public boolean checkForItemInBasket(BasketItem item) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#emptyBasket
	 */
	public void emptyBasket() throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#getExtraInfo
	 */
	public List getExtraInfo() throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#emptyExtraInfo
	 */
	public void emptyExtraInfo() throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#addExtraInfo
	 */
	public void addExtraInfo(Object info) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#removeExtraInfo
	 */
	public void removeExtraInfo(Object info) throws RemoteException;

	/**
	 * @see com.idega.block.basket.business.BasketBusinessBean#getQuantity
	 */
	public int getQuantity() throws RemoteException;
}