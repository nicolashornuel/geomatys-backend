/**
 * 
 */
package com.geomatys.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.geomatys.model.Image;
import com.geomatys.service.ImageService;

/**
 * @author macbookpro
 *
 */
@CrossOrigin
@RestController
public class ImageController {
	
    @Autowired
    private ImageService imageService;
    
    @GetMapping("/")
    String hello() {
      return "Hello world!";
    }
    
    @PostMapping("/uploadFile")
    public Image uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
    	return imageService.storeImage(file);
    }
	
	@GetMapping("/liste")
	public List<Image> findAll() {
		return imageService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		imageService.deleteById(id);
	}
	
	@PutMapping("{id}")
	public void update(@PathVariable(name = "id") Long id, @RequestParam("file") MultipartFile file) throws IOException {
		imageService.update(file, id);
	}

}


