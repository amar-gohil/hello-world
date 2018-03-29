package com.intellociplabs.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellociplabs.common.domain.Product;
import com.intellociplabs.common.vo.ProductVO;
import com.intellociplabs.product.repository.ProductRepository;
import com.intellociplabs.product.service.ProductConvertService;
import com.intellociplabs.product.service.ProductService;
import com.intellociplabs.common.util.CommonUtil;
import com.intellociplabs.common.vo.ResponseVO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductConvertService productConvertService;

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public ProductVO addProduct(ProductVO productVO) throws Exception {
		Product product = productConvertService.convertProductVOToDomain(productVO);
		product.setId(CommonUtil.getUUID());		
		product = productRepository.save(product);
		return productConvertService.convertProductDomainToVO(product);		
	}


	@Override
	public ArrayList<ProductVO> getAllProduct() throws Exception {
		Iterable<Product> productList = productRepository.findAll();
		return productConvertService.convertProductDomainListToVOList(productList);
		
	}

	@Override
	public ProductVO getProductById(String productId) throws Exception {		
		return productConvertService.convertProductDomainToVO(
				productRepository.findById(productId));
	}

	@Override
	public ProductVO updateProduct(ProductVO productVO) throws Exception {
		Product existingObj = productRepository.findById(productVO.getId());
		if(existingObj != null) {					
			productVO = productConvertService.convertProductDomainToVO(productRepository.save(
					productConvertService.convertProductForUpdate(existingObj,productVO)));
		}
		return productVO;		
	}

	@Override
	public void removeProduct(String productId) throws Exception {
		productRepository.removeProduct(productId);
	}


}
