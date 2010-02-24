package com.idega.block.basket.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHome;
import java.rmi.RemoteException;

public interface BasketBusinessHome extends IBOHome {

	public BasketBusiness create() throws CreateException, RemoteException;
}