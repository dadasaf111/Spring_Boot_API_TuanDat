package com.example.spring_boot_api_tuandat.repository;

import com.example.spring_boot_api_tuandat.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public List<Employee> findEmployeeByLastName(String lastName);

    //READ
    // JPQL
    @Query("select e from Employee e where e.lastName=?1")
    public List<Employee> findEmployeeByLastNameJPQL(String lastName);
    // Native
    @Query(value = "select * from tbl_employee e where last_name=?1",nativeQuery = true)
    public List<Employee> findEmployeeByLastNameNative(String lastName);

    //UPDATE
    // JPQL
    @Transactional
    @Modifying
    @Query("update Employee e set e.firstName=?2 where e.employeeID=?1")
    public void updateFirstNameByEmployeeIdJPQL(Long id, String firstName);
    //Native
    @Transactional
    @Modifying
    @Query(value = "update tbl_employee set last_Name=?2 where employeeid=?1",nativeQuery = true)
    public void updateLastFirstNameByIdNative(Long id, String lastName);

    //DELETE
    //REPO
    @Transactional
    @Modifying
    public void deleteByEmployeeID(Long id);
    //JPQL
    @Transactional
    @Modifying
    @Query("delete from Employee e where e.email=?1")
    public void deleteEmployeeByEmailJPQL(String email);
    //Native
    @Transactional
    @Modifying
    @Query(value = "delete from tbl_employee where email=?1",nativeQuery = true)
    public void deleteEmployeeByEmailNative(String email);
}
