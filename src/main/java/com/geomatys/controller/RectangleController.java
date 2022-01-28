/**
 * 
 */
package com.geomatys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.geomatys.model.Rectangle;
import com.geomatys.service.RectangleService;

/**
 * @author macbookpro
 *
 */
@CrossOrigin
@RestController
public class RectangleController {
	
    @Autowired
    private RectangleService rectangleService;
    

    @GetMapping("/")
    String hello() {
      return "Hello world!";
    }
    
    @PostMapping("/uploadFile")
    public Rectangle uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

    	Rectangle rectangle = rectangleService.storeRectangle(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(rectangle.getId().toString())
                .toUriString();
        
        System.out.println(fileDownloadUri);

        return rectangle;
    }
    
	
	@GetMapping("/liste")
	public List<Rectangle> findAll() throws SerialException, SQLException {
		return rectangleService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		rectangleService.deleteById(id);
	}

}


