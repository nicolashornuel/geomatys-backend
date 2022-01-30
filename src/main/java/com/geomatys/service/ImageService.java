/**
 * 
 */
package com.geomatys.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.geomatys.model.Image;
import com.geomatys.repository.ImageRepository;

/**
 * @author macbookpro
 *
 */
@Service
public class ImageService {
	
	@Autowired
    private ImageRepository imageRepository;
	
	@Transactional
	public Image storeImage(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Image image = new Image(fileName, file.getContentType(), file.getBytes());
        return imageRepository.save(image);
    }
    
	public List<Image> findAll() {
		return imageRepository.findAll();
	}
	
	@Transactional
	public void deleteById(Long Id) {
		imageRepository.deleteById(Id);;
	}
	
	@Transactional
	public void update(MultipartFile file, Long id) throws IOException {
		Image image = imageRepository.findById(id).orElseThrow();
		image.setData(file.getBytes());
		imageRepository.save(image);
	}

}
