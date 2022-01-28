/**
 * 
 */
package com.geomatys.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.geomatys.model.Rectangle;
import com.geomatys.repository.RectangleRepository;

/**
 * @author macbookpro
 *
 */
@Service
public class RectangleService {
	
	@Autowired
    private RectangleRepository rectangleRepository;
	
	
	public Rectangle storeRectangle(MultipartFile file) throws IOException {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Rectangle rectangle = new Rectangle(fileName, file.getContentType(), file.getBytes());
        return rectangleRepository.save(rectangle);
    }

    public Rectangle getRectangle(Long Id) {
        return rectangleRepository.findById(Id).orElseThrow();
    }
    
	public List<Rectangle> findAll() {
		return rectangleRepository.findAll();
	}
	
	public void deleteById(Long Id) {
		rectangleRepository.deleteById(Id);;
	}

}
