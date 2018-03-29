package com.intellociplabs.product.service;

import java.util.ArrayList;
import java.util.List;

import com.intellociplabs.common.vo.ProductVO;
import com.intellociplabs.common.vo.ResponseVO;

public interface ProductService {

		ProductVO addProduct(ProductVO productVO) throws Exception;
		
		ArrayList<ProductVO> getAllProduct() throws Exception;
		
		ProductVO getProductById(String productId) throws Exception;
		
		ProductVO updateProduct(ProductVO productVO) throws Exception;		
		
		void removeProduct(String productId) throws Exception;
	
}
