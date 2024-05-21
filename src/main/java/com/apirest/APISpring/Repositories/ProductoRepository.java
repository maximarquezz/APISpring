package com.apirest.APISpring.Repositories;

import com.apirest.APISpring.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
