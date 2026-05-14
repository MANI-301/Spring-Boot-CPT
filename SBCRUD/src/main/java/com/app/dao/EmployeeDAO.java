package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeDAO  extends JpaRepository<Employee,Integer>{

//	List<Employee> findByName(String name);

//	List<Employee> findByFirstName(String name);

	// JPQL
	@Query("select e from Employee e where e.firstName = :name")
	List<Employee> findByFirstName(@Param("name") String name);


//	List<Employee> findByFirstNameAndEmail(String name,String email);
//	//findByFirstNameIgnoreCase();
	 @Modifying
	 @Transactional
	  @Query("UPDATE Employee e SET e.firstName = :fname WHERE e.id = :id")
	    int updateFirstName(@Param("id") int id, @Param("fname") String fname);

}
