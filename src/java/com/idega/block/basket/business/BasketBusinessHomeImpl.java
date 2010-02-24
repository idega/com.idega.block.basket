package com.idega.block.basket.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHomeImpl;

public class BasketBusinessHomeImpl extends IBOHomeImpl implements BasketBusinessHome {

	public Class getBeanInterfaceClass() {
		return BasketBusiness.class;
	}

	public BasketBusiness create() throws CreateException {
		return (BasketBusiness) super.createIBO();
	}
}