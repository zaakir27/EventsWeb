/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.eventsweb.repository;
import com.zaakir.eventsweb.domain.events.BMW;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author zaakir
 */
@Repository
public interface BMWRepo extends JpaRepository<BMW, Long>{
    
}
