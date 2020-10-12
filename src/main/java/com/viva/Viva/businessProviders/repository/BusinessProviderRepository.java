package com.viva.Viva.businessProviders.repository;


import com.viva.Viva.businessProviders.model.BusinessProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;

//JpaRepository
//PagingAndSortingRepository
public interface BusinessProviderRepository extends CrudRepository<BusinessProvider, Integer> {


    List<BusinessProvider> findAllByActiveIsFalse();

}
