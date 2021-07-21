
package com.org.mavenir.toyInventoryservice.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.org.mavenir.toyInventoryservice.repository.ProductRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ProductTest {
	@MockBean
    private ProductRepository mockRepo;
	
	@Autowired
    private MockMvc mvc;
	
	@Before
	public void setUp() {
	    Product pdct = new Product(999, "Action Figures", "GUANGDONG QUNXING TOYS JOINT-STOCK");
	    List<Product> l1= new ArrayList<>();
	    l1.add(pdct);
	    when(mockRepo.findAll()).thenReturn(l1);
	    
	}
	

	@Test
	public void testwhenGetAllProductisCalled_thenResCountIsZero()	  throws Exception {
		List<Product> res = mockRepo.findAll();
		assertNotNull(res);
		assertEquals(0,res.size());
	}
	
	
	@Test
	public void testwhenGetAllProductisCalled_thenResCountIsOne()	  throws Exception {
		Product pdct = new Product(999, "Action Figures", "GUANGDONG QUNXING TOYS JOINT-STOCK");
	    List<Product> l1= new ArrayList<>();
	    l1.add(pdct);
		 when(mockRepo.findAll()).thenReturn(l1);
		List<Product> res = mockRepo.findAll();
		
		assertNotNull(res);			
        
		assertEquals(999,res.get(0).getId());
		assertEquals(1,res.size());
	}


}
