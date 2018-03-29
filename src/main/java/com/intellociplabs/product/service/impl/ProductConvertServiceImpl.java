package com.intellociplabs.product.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.intellociplabs.common.domain.Product;
import com.intellociplabs.common.vo.ProductVO;
import com.intellociplabs.product.service.ProductConvertService;

@Service
public class ProductConvertServiceImpl implements ProductConvertService{

	@Override
	public Product convertProductVOToDomain(ProductVO productVO) throws Exception {
		Product product = new Product();		
		product.setName(productVO.getName());
		product.setApiId(productVO.getApiId());
		product.setCasNo(productVO.getCasNo());
		product.setMolecularFormula(productVO.getMolecularFormula());
		product.setMolecularWeight(productVO.getMolecularWeight());
		product.setSzCatNo(productVO.getSzCatNo());
		product.setInvStatus(productVO.getInvStatus());
		product.setSynonyms(productVO.getSynonyms());
		product.setIsActive("1");
		return product;
	}

	@Override
	public ProductVO convertProductDomainToVO(Product product) throws Exception {
		ProductVO productVO = new ProductVO();
		productVO.setId(product.getId());
		productVO.setName(product.getName());
		productVO.setApiId(product.getApiId());
		productVO.setCasNo(product.getCasNo());
		productVO.setMolecularFormula(product.getMolecularFormula());
		productVO.setMolecularWeight(product.getMolecularWeight());
		productVO.setSzCatNo(product.getSzCatNo());
		productVO.setInvStatus(product.getInvStatus());
		productVO.setSynonyms(product.getSynonyms());
		productVO.setIsActive(product.getIsActive());
		return productVO;
	}
	
	@Override
	public ArrayList<ProductVO> convertProductDomainListToVOList(Iterable<Product> productList) throws Exception{		
		ArrayList<ProductVO> prosuctVOList = new ArrayList<ProductVO>();
		for (Product product : productList) {
			ProductVO productVO = new ProductVO();
			productVO.setId(product.getId());
			productVO.setName(product.getName());
			productVO.setApiId(product.getApiId());
			productVO.setCasNo(product.getCasNo());
			productVO.setMolecularFormula(product.getMolecularFormula());
			productVO.setMolecularWeight(product.getMolecularWeight());
			productVO.setSzCatNo(product.getSzCatNo());
			productVO.setInvStatus(product.getInvStatus());
			productVO.setSynonyms(product.getSynonyms());
			productVO.setIsActive(product.getIsActive());
			prosuctVOList.add(productVO);
        }
		return prosuctVOList;
	}
	
	@Override
	public Product convertProductForUpdate(Product existingObj, ProductVO incomingObj) throws Exception {			
		existingObj.setName(incomingObj.getName());
		existingObj.setApiId(incomingObj.getApiId());
		existingObj.setCasNo(incomingObj.getCasNo());
		existingObj.setMolecularFormula(incomingObj.getMolecularFormula());
		existingObj.setMolecularWeight(incomingObj.getMolecularWeight());
		existingObj.setSzCatNo(incomingObj.getSzCatNo());
		existingObj.setInvStatus(incomingObj.getInvStatus());
		existingObj.setSynonyms(incomingObj.getSynonyms());
		existingObj.setIsActive(incomingObj.getIsActive());		
		return existingObj;
	}
	
}
