package com.example.springbootbackend.dao

import com.example.springbootbackend.data.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.CrossOrigin


@RepositoryRestResource
@CrossOrigin("*")
interface CategoryRepository : JpaRepository<Category?, Long?>
