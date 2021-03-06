package com.example.springbootbackend.dao

import com.example.springbootbackend.data.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.CrossOrigin

@RepositoryRestResource
@CrossOrigin("*")
interface ProductRepository : JpaRepository<Product?, Long?>{

}
