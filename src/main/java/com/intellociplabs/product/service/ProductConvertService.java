package com.intellociplabs.product.service;

import java.util.ArrayList;

import com.intellociplabs.common.domain.Product;
import com.intellociplabs.common.vo.ProductVO;

public interface ProductConvertService {

	
	Product convertProductVOToDomain(ProductVO productVO) throws Exception;
	ProductVO convertProductDomainToVO(Product product) throws Exception;
	ArrayList<ProductVO> convertProductDomainListToVOList(Iterable<Product> productList) throws Exception;
	Product convertProductForUpdate(Product existingObj, ProductVO incomingObj) throws Exception;
	
}
