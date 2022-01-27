/**
 * 
 */
package com.geomatys.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geomatys.model.Rectangle;

/**
 * @author macbookpro
 *
 */
@Repository
public interface RectangleRepository extends JpaRepository<Rectangle, Long> {

}
