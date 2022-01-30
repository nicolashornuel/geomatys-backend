/**
 * 
 */
package com.geomatys.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geomatys.model.Image;

/**
 * @author macbookpro
 *
 */
@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
