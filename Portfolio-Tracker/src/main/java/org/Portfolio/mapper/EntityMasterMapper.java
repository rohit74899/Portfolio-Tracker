package org.Portfolio.mapper;
import java.util.*;

import org.Portfolio.dto.EntityMasterDTO;
import org.Portfolio.dto.PortfolioTxnDTO;
import org.Portfolio.entity.Entity_Master;
import org.Portfolio.entity.Portfolio_Txn;

public class EntityMasterMapper {
	public static EntityMasterDTO toDTO(Entity_Master user) {
		
		EntityMasterDTO dto=new EntityMasterDTO();
		dto.set_id(user.get_id());
		dto.set_username(user.get_username());
		dto.set_email(user.get_email());
		//dto.set_password(null);
		
		List<PortfolioTxnDTO> portfolio_Details=new ArrayList<>();
		for(Portfolio_Txn pt: user.getPortfolio()) {
			PortfolioTxnDTO dt=new PortfolioTxnDTO();
			
			dt.set_Txn_id(pt.get_Txn_id());
			dt.set_symbol(pt.get_symbol());
			dt.set_buyPrice(pt.get_buyPirce());
			dt.set_quantity(pt.get_quantity());
			
			portfolio_Details.add(dt);
		}
		dto.setPortfolio(portfolio_Details);
		
		return dto;
			
	}
	
	public static EntityMasterDTO toDTO_GetUser(Entity_Master user) {
		
		EntityMasterDTO dto=new EntityMasterDTO();
		dto.set_id(user.get_id());
		dto.set_username(user.get_username());
		dto.set_email(user.get_email());
		//dto.set_password(null);
		
		return dto;
			
	}
	
	public static EntityMasterDTO toDTO_GetPortfolio(Entity_Master user) {
		
		EntityMasterDTO dto=new EntityMasterDTO();
		
		List<PortfolioTxnDTO> portfolio_Details=new ArrayList<>();
		for(Portfolio_Txn pt: user.getPortfolio()) {
			PortfolioTxnDTO dt=new PortfolioTxnDTO();
			
			dt.set_Txn_id(pt.get_Txn_id());
			dt.set_symbol(pt.get_symbol());
			dt.set_buyPrice(pt.get_buyPirce());
			dt.set_quantity(pt.get_quantity());
			
			portfolio_Details.add(dt);
		}
		dto.setPortfolio(portfolio_Details);
		
		return dto;
			
	}
}
