/**
 * 
 */
package com.flipkart.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.moviecatalogservice.models.CatalogItem;



/**
 * @author rag.patel
 *
 */
@RestController
@RequestMapping("/catalog")
public class CatalogResource {
	
	
	@RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		
		List<CatalogItem> catalogItems = new ArrayList<>();
		catalogItems.add(new CatalogItem("Movie Name", "Movie Description", 10));
		return catalogItems;
	}

}
